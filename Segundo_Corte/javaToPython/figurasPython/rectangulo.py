class Rectangle:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
        print(f"Creando un cuadrado de bas {self.base} y altura {self.altura}")

    def getbase(self):
        return self.base
    
    def getaltura(self):
        return self.altura
    
    def setbase(self, value):
        self.base = value

    def setaltura(self, value):
        self.altura = value

    def perimetro(self):
        return (self.base *2) + (self.altura*2) 
    
    def area(self):
        return self.base*self.altura
    
rectangulo1 = Rectangle(7,8)
print(f"Perímetro: {rectangulo1.perimetro()} ------- Área: {rectangulo1.area()}")
