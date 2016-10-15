import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';

import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { DogsComponent } from './dogs/dogs.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    DogsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    MaterialModule.forRoot(),
    RouterModule.forRoot([
        { path: 'register', component: RegisterComponent },
        { path: 'dogs', component: DogsComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
