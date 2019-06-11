import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Config } from '../../shared/config/env.config';
/**
* This class represents the service component.
*/
@Injectable()
export class RestService {

    private URL = Config.API;
    private headers = new HttpHeaders({ 'Content-Type': 'application/json; charset=UTF-8' });

    public constructor(private http: HttpClient) {
        this.URL = window.location.pathname;
        this.URL = this.URL.substring(0, this.URL.indexOf(Config.WEB));
        this.URL = (Config.ENV === 'DEV') ? Config.PATH + '/' + Config.WEB + 'api' :
        window.location.protocol + '//' + window.location.host + this.URL + Config.WEB + 'api';
    }

    public get(service: string): Observable<any> {
        console.log(this.URL);
        return this.http.get<HttpResponse<any>>(this.URL + service, { observe: 'response' });
    }

    public post(service: string, request?: any): Observable<any> {
        const fullUrl = this.URL + service;

        return this.http.post<HttpResponse<any>>(fullUrl, request, {
            headers: this.headers,
            withCredentials: false,
            observe: 'response'
        });
    }

    public patch(service: string, request?: any): Observable<any> {
        const fullUrl = this.URL + service;

        return this.http.patch<HttpResponse<any>>(fullUrl, request, {
            headers: this.headers,
            withCredentials: false,
            observe: 'response'
        });
    }

    public delete(service: string): Observable<any> {
        return this.http.delete<HttpResponse<any>>(this.URL + service, {
            headers: this.headers,
            withCredentials: false,
            observe: 'response'
        });
    }
}