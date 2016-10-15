import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';

import { Observable }     from 'rxjs/Observable';

export class Dog {
    constructor(public name: string, public favoriteToy: string, public description: string, public goodDog: boolean) {        
    }
}

@Injectable()
export class DogsService {
        
  private url = 'http://localhost:8080/dogs';

  constructor(private http: Http) { }
    
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
