import ru.bstu.iitus.kb51.jac.Construction;

import java.util.Scanner;

public class Main {

    private static final String TYPE_CONSTRUCT = "1 - Супермаркет\n" +
            "2 - Частный дом\n" +
            "3 - Многоквартирный дом\n" +
            "4 - Мост\n" +
            "5 - Тоннель\n" +
            "Выбор: ";

    public static void main(String[] args) {//todo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество конструкций: ");
        int countConstruction = scanner.nextInt();

        Construction constructions[] = readConstructionInfo(scanner, countConstruction);
        System.out.println(findMin(constructions).toString());
    }

    private static Construction[] readConstructionInfo(Scanner scanner, int countConstruction) {
        Construction constructions[] = new Construction[countConstruction];
        for (int i = 0; i < countConstruction; ) {
            System.out.print(TYPE_CONSTRUCT);
            int type = scanner.nextInt();
            Construction construction = Construction.create(type);
            if (construction != null) {
                constructions[i] = construction;
                i++;
            }
        }
        return constructions;
    }

    private static Construction findMin(Construction constructions[]) {
        Construction min = constructions[0];
        for (Construction construction : constructions) {
            if (construction.getExploitationPeriod() < min.getExploitationPeriod()) {//
                min = construction;
            }
        }
        return min;
    }
}

