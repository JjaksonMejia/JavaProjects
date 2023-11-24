class Cuadrado:
    def __init__(self, lado) -> None:
        self.lado = lado
        print(f"Creando cuadrado de lado {self.lado}")
        return 
    
    def getlado(self):
        return self.lado
    def setlado(self, value):
        self.lado = value
    def perimetro(self):
        return self.lado*4
    def area(self):
        return self.lado**2

cuadrado1 = Cuadrado(9)
print(f"Perímetro: {cuadrado1.perimetro()} ------- Área: {cuadrado1.area()}")