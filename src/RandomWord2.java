public class RandomWord2 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 3) {
            double random = Math.random();
            double randomBig = random * 33 + 1072;
            int randomBigFloor = (int) Math.floor(randomBig);
            char letter = (char) randomBigFloor;
            System.out.print(letter);

            char o1 = 'а';
            char o2 = 'я';
            char o3 = 'о';
            char o4 = 'е';
            char o5 = 'ю';
            char o6 = 'у';
            char o7 = 'э';
            char o8 = 'ё';
            char o9 = 'и';
            char o10 = 'й';
            double randomO = Math.random();
            double randomBigO = randomO * 8 + 1;
            int randomBigFloorO = (int) Math.floor(randomBigO);

            if (randomBigFloorO == 1) System.out.print(o1);
            if (randomBigFloorO == 2) System.out.print(o2);
            if (randomBigFloorO == 3) System.out.print(o3);
            if (randomBigFloorO == 4) System.out.print(o4);
            if (randomBigFloorO == 5) System.out.print(o5);
            if (randomBigFloorO == 6) System.out.print(o6);
            if (randomBigFloorO == 7) System.out.print(o7);
            if (randomBigFloorO == 8) System.out.print(o8);
            if (randomBigFloorO == 9) System.out.print(o9);
            if (randomBigFloorO == 10) System.out.print(o10);
            x++; 
        }

    }
}
