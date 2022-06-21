import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  template: '<div> Inline is working !! </div>',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
