import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    FuctionalSum sum=(a,b)->a+b;
String s="ASDFSDAFADascd";
List<String> strings=List.of("ASDFSDAFADascd","ASDAFADascd");
    List<Integer> numbers=List.of(1,2,3,4,4,5,4,6,7);
    Integer sumEven=numbers.stream().filter(a->a%2!=0).reduce(0,(a,b)->a+b).intValue();
    List<Integer> evenNUmbers=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
    List<Integer> duplicate=numbers.stream().distinct().collect(Collectors.toList());
    Integer min=numbers.stream().min((a,b)->a-b).orElse(null);
    Integer max=numbers.stream().max(Integer::compareTo).orElse(0);
 List<String> convert=strings.stream().map(str->str.toLowerCase(Locale.ROOT)).collect(Collectors.toList());
 String words="Salam menim adim nihaddir";
String[] word=words.split(" ");

    public static void main(String[] args) {

Main main=new Main();
  }
}