public class Main {
    public static void main(String[] args) {
        double qoantyty = 10;
        double prise = 100;
        double discount = 0.75; // Это значит скидука в 25 процентов
        double cost;

        cost = qoantyty >=10 ? qoantyty * prise * discount : qoantyty * prise;
// ЕСЛИ: Купили 10 единиц товара и больше. ТО: предоставить скидку в 25%. ИНАЧЕ: Скидку не предоставлять.
        System.out.println("Общая стоимость товаров равна: " + cost + "  баксов!");
    }
}