import { Component, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
constructor(private http: HttpClient){}

  title = 'Server Statistics';
  data : any;

  ngOnInit(){
      this.getServerData();  
  }

  getServerData() : void{
   this.http.get("http://localhost:8090/stats/").subscribe(data => this.data = data);
  }
}
