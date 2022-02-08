class Car:
    'This class represents a car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("BMW", "BMWX6", "2020", "Manual", "Red")
car2 = Car("Audi", "A7", "2021", "Automatic", "Ash")
car3 = Car("Suzuki", "Swift", "2022", "Manual", "Blue")

car2.accelerate()
car1.stop()