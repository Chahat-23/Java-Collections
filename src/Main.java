import collections.CollectionsDemo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item: list) {
            System.out.println(item);
        }
//        var iterator = list.iterator();
//        while(iterator.hasNext()) {
//            var current = iterator.next();
//            System.out.println(current);
//        }

        //iterator iterats over a list or any object that is iterable

        CollectionsDemo.show();
    }
}