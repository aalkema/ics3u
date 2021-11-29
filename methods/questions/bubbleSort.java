class Main {
  public static void main(String[] args) {
    int[] ids = new int[10];

    for (int i = 0; i < ids.length; i++) {
      ids[i] = (int)(Math.random() * 100 + 1);
    }

    for (int i = 0; i < ids.length; i++) {
      System.out.println(ids[i]);
    }

    System.out.println();

    for (int i = ids.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (ids[j] > ids[j+1]) {
          int temp = ids[j];
          ids[j] = ids[j+1];
          ids[j+1] = temp;
        }
      }
    }

    for (int i = 0; i < ids.length; i++) {
      System.out.println(ids[i]);
    }
  }
}