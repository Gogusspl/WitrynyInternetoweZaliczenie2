import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-contact',
  standalone: true,
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css',
  imports: [FormsModule]
})
export class ContactComponent {
  onSubmit() {
    console.log('Formularz wysłany');
  }
}
