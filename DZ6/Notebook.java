import java.util.Objects;

public class Notebook {
    Brand brand;
    Color color;
    double price;

    public Notebook(Brand brand, Color color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук " + brand + " " + color + " по цене " + price + " рублей";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.brand,this.color);
    }

    @Override
    public boolean equals(Object obj) {
        Notebook i = (Notebook) obj;
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.brand.equals(i.brand) && this.color.equals(i.color);
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}