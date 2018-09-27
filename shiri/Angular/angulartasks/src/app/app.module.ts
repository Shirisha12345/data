import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { Task1Component } from './task1/task1.component';
import { Task2Component } from './task2/task2.component';
import { Task3Component } from './task3/task3.component';
import { ParentComponent } from './task3/parent/parent.component';
import { ChildComponent } from './task3/child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    Task1Component,
    Task2Component,
    Task3Component,
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
