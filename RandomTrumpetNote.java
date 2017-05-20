import java.util.concurrent.ThreadLocalRandom;

public class RandomTrumpetNote
{
  public static void main(String[] args)
  {
    int note = ThreadLocalRandom.current().nextInt(0, 31);
    String noteName = "";
    switch(note%12)
    {
      case 0: noteName = "F#";
        break;
      case 1: noteName = "G";
        break;
      case 2: noteName = "Ab";
        break;
      case 3: noteName = "A";
        break;
      case 4: noteName = "Bb";
        break;
      case 5: noteName = "B";
        break;
      case 6: noteName = "C";
        break;
      case 7: noteName = "C#";
        break;
      case 8: noteName = "D";
        break;
      case 9: noteName = "Eb";
        break;
      case 10: noteName = "E";
        break;
      case 11: noteName = "F";
        break;
    }
    switch((note + 6) / 12)
    {
      case 0: noteName += "3";
        break;
      case 1: noteName += "4";
        break;
      case 2: noteName += "5";
        break;
      case 3: noteName += "6";
        break;
    }
    System.out.println(noteName);
  }
}
