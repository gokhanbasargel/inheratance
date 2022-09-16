public class Main {
    public static void main(String[] args) {
        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "12345";


        CorporateCustomer hepsiburada = new CorporateCustomer();
        hepsiburada.customerNumber = "122345";

        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber = "00000";

        //CustomerManager customerManager = new CustomerManager();
        //customerManager.add(hepsiburada);
        //customerManager.add(engin);
        //customerManager.add(abc);

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {engin,abc,hepsiburada};

        customerManager.addMultiple(customers);





    }

}