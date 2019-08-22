

public class Bag {
    public static void main(String[] args) {
        Bag bag = new Bag(5,
                new Item("Book",1,6),
                new Item("Pencil",3,12),
                new Item("Pen",2,10),
                new Item("Phone",2,19),
                new Item("Notebook",4,25));
        System.out.println(bag.getBag() );


    }
     int m;
     Item[] items;


    public Bag(int m, Item ... items) {
        this.m = m;
        this.items = items;
    }

     int getBag(){
        return getBag(items.length - 1, m);
    }

     int getBag(int i, int m){
        if (i < 0) return 0;
        if (items[i].weight > m)
            return getBag(i-1, m);
        else {


            return Math.max(getBag(i - 1, m), getBag(i - 1, m - items[i].weight) + items[i].cost);

        }

    }

    public static class Item{
        String name;
        int weight;
         int cost;

        public Item(String name, int weight, int cost) {
            this.name = name;
            this.weight = weight;
            this.cost = cost;
        }

    }
}
