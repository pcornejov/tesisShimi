import { EnvConfig } from './env-config.interface';

const DevConfig: EnvConfig = {
  ENV: 'DEV',
  API: 'http://localhost:8080/shimiApp/api',
  PATH: 'http://localhost:8080'
};

export = DevConfig;

