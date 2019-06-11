#!/bin/bash

cd ../frontend/
printf "\nDo you wanna run npm install? [y/N]: "
read -t 10 install
install=`echo "$install" | awk '{print tolower($0)}'`

if [ "$install" == "y" ] || [ "$install" == "yes" ] ; then
    npm install
fi

npm run build.prod -- --scss
cp -fr dist/prod/* ../backend/WebContent/
cd ../backend/
sed -i -- 's/=\"\/css\//=\"css\//g' WebContent/index.html
sed -i -- 's/=\"\/js\//=\"js\//g' WebContent/index.html