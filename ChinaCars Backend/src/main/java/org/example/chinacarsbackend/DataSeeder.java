package org.example.chinacarsbackend;

import org.example.chinacarsbackend.Car;
import org.example.chinacarsbackend.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final CarRepository carRepository;

    public DataSeeder(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) {
        if (carRepository.count() > 0) return;

        carRepository.save(new Car(
                "BYD Dolphin EV", "BYD", "427 km", "99 900 PLN",
                "assets/images/bydDol.jpg",
                "Kompaktowy samochód elektryczny z dynamicznym stylem i bogatym wyposażeniem.",
                "elektryczny", 2024, "Niebieski", 95
        ));
        carRepository.save(new Car(
                "MG4 Electric", "MG", "450 km", "109 900 PLN",
                "assets/images/mg4.jpg",
                "Sportowy hatchback elektryczny z dużym zasięgiem i nowoczesnym wnętrzem.",
                "elektryczny", 2024, "Biały", 150
        ));
        carRepository.save(new Car(
                "Hongqi HS7", "Hongqi", "2.0T / 231 KM", "179 900 PLN",
                "assets/images/hongqiHs7.jpg",
                "Luksusowy SUV premium z silnikiem benzynowym i ekskluzywnymi wykończeniami.",
                "benzynowy", 2024, "Czarny", 231
        ));
        carRepository.save(new Car(
                "BYD Seal", "BYD", "570 km", "149 900 PLN",
                "assets/images/BYD-Seal.jpg",
                "Sedan elektryczny klasy D z platformą e-Platform 3.0 i szybkim ładowaniem.",
                "elektryczny", 2024, "Srebrny", 313
        ));
        carRepository.save(new Car(
                "BYD Atto 3", "BYD", "420 km", "129 900 PLN",
                "assets/images/BYD-Atto-3-EVO.jpg",
                "Rodzinny SUV elektryczny z przestronnym wnętrzem i bogato wyposażoną kabinę.",
                "elektryczny", 2023, "Zielony", 150
        ));
        carRepository.save(new Car(
                "MG Marvel R", "MG", "402 km", "139 900 PLN",
                "assets/images/MG_MARVEL_R_02-1600x900.jpg",
                "Elektryczny SUV z napędem na cztery koła i systemem szybkiego ładowania DC.",
                "elektryczny", 2023, "Czerwony", 212
        ));
        carRepository.save(new Car(
                "Nio ET5", "Nio", "560 km", "219 900 PLN",
                "assets/images/NIO.jpg",
                "Elektryczny sedan klasy premium z innowacyjną technologią wymiany baterii.",
                "elektryczny", 2024, "Biały", 480
        ));
        carRepository.save(new Car(
                "Xpeng P7", "Xpeng", "480 km", "164 900 PLN",
                "assets/images/xpeng-p7-miit-2025-2.jpg",
                "Inteligentny sedan elektryczny z zaawansowanym systemem autonomicznej jazdy.",
                "elektryczny", 2024, "Szary", 316
        ));
        carRepository.save(new Car(
                "Li Auto L9", "Li Auto", "1315 km (EREV)", "259 900 PLN",
                "assets/images/Li.jpg",
                "Luksusowy SUV EREV (range extender) z ogromnym zasięgiem i 6 miejscami.",
                "hybrydowy", 2024, "Biały", 449
        ));
        carRepository.save(new Car(
                "Chery Tiggo 8 Pro", "Chery", "6-cyl. / 197 KM", "119 900 PLN",
                "assets/images/cherry.jpg",
                "Przestronny SUV 7-osobowy z panoramicznym dachem i systemu rozrywki QLINK.",
                "benzynowy", 2023, "Czarny", 197
        ));
        carRepository.save(new Car(
                "Geely Preface", "Geely", "1.5T / 190 KM", "89 900 PLN",
                "assets/images/geely.jpg",
                "Elegancki sedan klasy średniej z hybrydowym napędem i nowoczesnym designem.",
                "hybrydowy", 2023, "Niebieski", 190
        ));
        carRepository.save(new Car(
                "SAIC Maxus Mifa 9", "Maxus", "520 km", "239 900 PLN",
                "assets/images/SAIC.jpg",
                "Elektryczny minivan premium z kanapami VIP, sufitem panoramicznym i 800V.",
                "elektryczny", 2024, "Srebrny", 245
        ));
    }
}
