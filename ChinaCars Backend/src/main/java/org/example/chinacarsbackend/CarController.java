package org.example.chinacarsbackend;

import org.example.chinacarsbackend.Car;
import org.example.chinacarsbackend.CarService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        return carService.getCarById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car updated) {
        return carService.getCarById(id).map(car -> {
            car.setName(updated.getName());
            car.setBrand(updated.getBrand());
            car.setRange(updated.getRange());
            car.setPrice(updated.getPrice());
            car.setImage(updated.getImage());
            car.setDescription(updated.getDescription());
            car.setType(updated.getType());
            car.setYear(updated.getYear());
            car.setColor(updated.getColor());
            car.setHorsepower(updated.getHorsepower());
            return ResponseEntity.ok(carService.saveCar(car));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        return carService.getCarById(id).map(car -> {
            carService.deleteCar(id);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
