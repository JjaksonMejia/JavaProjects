class circle:
    pi = 3.14
    def __init__(self, diameter):
        print("Creating circle with diameter {d}" .format(d = diameter))
        self.radius = diameter/2
    def circumference(self):
        return 2*self.pi*self.radius
    def area(self):
        return self.pi*(self.radius**2)
    
medium__pizza = circle(12)
teaching_table = circle(36)
round_room = circle(11460)
print("\n")
print(f"Perímetro: {medium__pizza.circumference()} ------- Área: {medium__pizza.area()}")
print(f"Perímetro: {teaching_table.circumference()} ------- Área: {medium__pizza.area()}")
print(f"Perímetro: {round_room.circumference()} -------- Área: {medium__pizza.area()}")