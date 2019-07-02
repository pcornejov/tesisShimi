import { Injectable } from '@angular/core';
import { Config } from '../../shared/config/env.config';
import { rutYPerfil } from '../../classes/rutyperfil';
/**
* This class represents the service component.
*/
@Injectable()
export class ServicioRutService {
    private rutperfil: rutYPerfil;
    
    public seteaRutPerfil(ryp: rutYPerfil) {
        this.rutperfil = ryp;
    }

    public getRutPerfil() {
        return this.rutperfil;
    }
}
