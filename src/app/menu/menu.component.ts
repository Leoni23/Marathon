import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  showSubMenu: { [key: string]: boolean } = {  // Especificamos el tipo para showSubMenu
    departamentos: false,
    empleados: false,
    empresa: false
  };

  constructor() {}

  ngOnInit(): void {}

  toggleSubMenu(menuItem: string): void {
    this.showSubMenu[menuItem] = !this.showSubMenu[menuItem];
  }
}
