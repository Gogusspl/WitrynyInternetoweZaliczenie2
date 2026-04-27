import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Car } from '../../core/models/car.model';
import { CarService } from '../../core/models/car.service';

@Component({
  selector: 'app-cars',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './cars.component.html',
  styleUrl: './cars.component.css'
})
export class CarsComponent implements OnInit {
  cars: Car[] = [];
  loading = true;
  error = false;

  constructor(private carService: CarService) {}

  ngOnInit(): void {
    this.carService.getCars().subscribe({
      next: (data) => {
        this.cars = data;
        this.loading = false;
      },
      error: (err) => {
        console.error('Błąd pobierania aut:', err);
        this.error = true;
        this.loading = false;
      }
    });
  }
}
