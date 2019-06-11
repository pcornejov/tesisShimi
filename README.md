1. Crear repositorio para nuevo proyecto en el GIT, ejemplo nuevoProyecto.

2. Clonar repositorio de nuevoProyecto.

3. Clonar repositorio proyectoBase.
git clone git@git.contraloria.cl:teamlengthle4/proyectoBase.git

4. Del proyectoBase copiar carpetas frontend y backend y pegar en la raiz del nuevoProyecto

5. Desde el editor de preferencia, buscar en todo el nuevoProyecto (front y back) la palabra "proyectoBase" y reemplazarla por nuevoProyecto.

6. En el backend cambiar el nombre del package por el del proyecto.
Ejemplo: proyectobase.controller -> nuevoProyecto.controller

7. Desde /frontend en nuevoProyecto correr:
npm install

8. Importar backend al eclipse como existing maven projects, agregar al server y start.

9. Empaquetar y desplegar: (ubicados dentro de /backend)
mvn clean package -P production

10. Acceder a http://ip:port/nuevoProyecto

11. Probar APIs (GET, POST, PATCH y DELETE) de ejemplo desde Insomnia, SoapUI o el de preferencia:
http://ip:port/nuevoProyecto/api/sample

12. Puedes iniciar tu implementación.
# tesisShimi
