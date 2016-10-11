import ru.bstu.iitus.kb51.jac.Construction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;
import static ru.bstu.iitus.kb51.jac.Constans.COUNT_OF_CONSTRUCTION;
import static ru.bstu.iitus.kb51.jac.Reader.getInt;
import static ru.bstu.iitus.kb51.jac.TypeConstruction.getAllTypes;

public class Main {
    public static void main(String[] args) {
        int countConstruction = getInt(COUNT_OF_CONSTRUCTION);
        ArrayList<Construction> constructions = readConstructionInfo(countConstruction);
        System.out.println(Collections.min(constructions));
    }

    private static ArrayList<Construction> readConstructionInfo(int countConstruction) {
        Scanner scanner = new Scanner(in);
        String type = getAllTypes();
        ArrayList<Construction> constructions = new ArrayList<Construction>();
        for (int i = 0; i < countConstruction; ) {
            System.out.print(type);
            try {
                Construction construction = Construction.create(scanner.nextInt());
                construction.init();
                constructions.add(construction);
                i++;
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        return constructions;
    }

}

