import java.util.ArrayList;
import java.util.List;
import com.animalSounds.src.Animal;
import com.animalSounds.src.Cat;
import com.animalSounds.src.Cow;
import com.animalSounds.src.Dog;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // Explicit generic type usage
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.displaySound();
        }
    }
}
