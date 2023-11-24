import math
class TrianguloEquilatero:
    def __init__(self, base):

        self.base = base
        self.altura = self.base/2
        self.altura = (self.base**2)-(self.altura**2)
        self.h = math.sqrt(self.altura)
        print(f"Creando un tríandulo equilatero de lado {self.base}")
    
    def getlado(self):
        return self.base
    
    def getaltura(self):
        return round(self.h,3)
    
    def setlado(self, value):
        self.base = value

    def area(self):
        return round(self.base*self.h/2, 3)
    
    def perimetro(self):
        return round(self.base*3, 3)
    
    
triangle1 = TrianguloEquilatero(6)
print(f"La altura del tríangulo es: {triangle1.getaltura()}")
print(f"Peímetro: {triangle1.perimetro()} ----- Área: {triangle1.area()}")