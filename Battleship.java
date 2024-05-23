public class Battleship {
   public static char[][] board = new char[8][8];
   public static Runnable print = () -> {for(int i = -1, x, y; ++i < 64; x = i%8, y = i/8, System.out.print((i==0? "  0 1 2 3 4 5 6 7\n":"") + (x==0? y+" ":"") + (board[x][y]=='S'||board[x][y]==0? '~':board[x][y]) + (x==7? '\n':' '))) {}};
   public static void main(String[] args) {
      for (int i = 0, d = (int)(Math.random()*2), x = (int)(Math.random()*(d==0? 5:8)), y = (int)(Math.random()*(d==1? 5:8)); i++ < 4; board[x][y] += 83, x+=d==0? 1:0, y+=d==1? 1:0) {}
      for (int i = 0, x = 88, a = 2, hits = 0; i<15 && hits != 4; print.run(), x = i<15 && hits != 4? getInt("You have " + (15-i) + " shots left. Enter column and row as one number", a==1? "Out of bounds. ":a==0? "Already hit. ":"", ""):0, a=1)
         if (x/10<=7 && x%10<=7 && --a != 2 && board[x/10][x%10] != 'm' && board[x/10][x%10] != '!' && --a != 2 && (((i++==.5 || board[x/10][x%10] == 'S') && ++hits>=0 && (board[x/10][x%10]-=50)== '!')||(board[x/10][x%10]+=109)=='m'))
            Runtime.getRuntime().addShutdownHook((hits == 4)? new Thread(() -> {System.out.print("You won!");}):(i==15)? new Thread(() -> {System.out.print("You lost.");}):new Thread());
   }
   public static int getInt(String d, String e, String i) {
      System.out.print(i.equals("")? e + d + ": ":"");
      return i.length()==2&&java.util.regex.Pattern.matches("^\\d+$", i)? Integer.parseInt(i):getInt(d, "Invalid input. ", i.equals("")? new java.util.Scanner(System.in).nextLine():"");
   }
}