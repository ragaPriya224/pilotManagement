import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {
  public superHero = "spidy";
  mailId = "abc@xyz.com";
  constructor() { }

  ngOnInit(): void {
  }
  greetUser(){
    return "Hello I'm "+this.superHero;
  }
}
