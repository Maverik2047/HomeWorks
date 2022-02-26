package HW5;

import java.util.Objects;

public class iPhone {
    String model;
    double weight;
    int simQuantity;
    int width;
    int height;
    String material;

    @Override
    public String toString() {
        return "iPhone{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", simQuantity=" + simQuantity +
                ", width=" + width +
                ", height=" + height +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        iPhone iPhone = (iPhone) o;
        return weight == iPhone.weight && simQuantity == iPhone.simQuantity && width == iPhone.width && height == iPhone.height && Objects.equals(model, iPhone.model) && Objects.equals(material, iPhone.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, weight, simQuantity, width, height, material);
    }
}
