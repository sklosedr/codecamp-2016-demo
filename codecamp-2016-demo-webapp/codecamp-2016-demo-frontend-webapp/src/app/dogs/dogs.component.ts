import { Component, OnInit } from '@angular/core';
import { DogsService, Dog } from './dogs.service';

@Component({
  selector: 'app-dogs',
  templateUrl: './dogs.component.html',
  styleUrls: ['./dogs.component.css']
})
export class DogsComponent implements OnInit {
  errorMessage: string;
  dogs: Dog[];
  mode = 'Observable';
    
  constructor(private dogsService: DogsService) { }

  ngOnInit() {
      this.getDogs();
  }
    
  getDogs() {
    this.dogsService.getDogs()
                     .subscribe(
                       dogs => this.dogs = dogs,
                       error =>  this.errorMessage = <any>error);
  }

}
