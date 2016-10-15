import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';

import { Observable }     from 'rxjs/Observable';

import { Dog } from './dogs';

@Injectable()
export class DogsService {
        
  private url = 'http://localhost:8080/dogs';
    
  private headers = new Headers({'Content-Type': 'application/json'});

  constructor(private http: Http) { }
    
  createDog(dog: Dog) {
    this.http
        .post(this.url, JSON.stringify(dog), {headers: this.headers})
        .toPromise()
        .then(() => dog)
        .catch(this.handleError);
  }
    
  getDogs(): Observable<Dog[]> {
      return this.http.get(this.url)
        .map(this.extractData)
        .catch(this.handleError);
  }
    
  private extractData(res: Response) {
    let body = res.json();
    return body || { };
  }
    
  private handleError (error: any) {
    // In a real world app, we might use a remote logging infrastructure
    // We'd also dig deeper into the error to get a better message
    let errMsg = (error.message) ? error.message :
      error.status ? `${error.status} - ${error.statusText}` : 'Server error';
    console.error(errMsg); // log to console instead
    return Observable.throw(errMsg);
  }

}
