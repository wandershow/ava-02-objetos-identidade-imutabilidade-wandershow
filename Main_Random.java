class Main_Random{
  public static void main(String[] args) {

    // como o teste não é preciso, precisamos gerar 1 milhão de vezes
    // e checar se os números gerados estão no intervalo:
    System.out.println("Testando intervalo ...");
    Randomizer randomizer1 = new Randomizer();
    
    for (int i = 0; i < 1000000; i++) {
        double n = randomizer1.next();
        if (n < 0 || n >= 1.0) System.out.println("false: " + n);
    }
    System.out.println("Testando variação ...");
    Randomizer randomizer2 = new Randomizer();
    int[] variacao = new int[10];
    for (int i = 0; i < 1000000; i++) {
        variacao[((int) (randomizer2.next() * 10))]++;
    }
    // até aqui vale 0.1
    // deve ter +ou- 100000 em cada slot:
    System.out.println(java.util.Arrays.toString(variacao));
    System.out.println("Testando nextInt ...");
    Randomizer randomizer3 = new Randomizer();
    for (int i = 0; i < 1000000; i++) {
        int n = randomizer3.nextInt(17);
        if (n < 0 || n > 17) System.out.println("false: " + n);
    }
    for (int i = 0; i < 1000000; i++) {
        int n = randomizer3.nextInt(17, 51);
        if (n < 17 || n > 51) System.out.println("false: " + n);
    }

  }
}
