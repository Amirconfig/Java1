import javax.swing.text.AbstractDocument.LeafElement;

public class AddressBook {

    public static void main(String[] args) {
    
        Contact[] entry=new Contact[5];
    
        entry[0] = new Contact("Robert", "222-321-8371","aaa@gmail.com", 
                                    "2022-12-09","Hi!!!");
    
      
        entry[1] = new Contact("Bob","333-345-7648", "aba@gmail.com", 
                                    "2022-12-09", "Hi!!!");
    

        
        entry[2] = new Contact("Bruce", "222-321-8371", "caa@gmail.com",
                                    "2022-12-09", "Hi!!!");
    
        
        entry[3] = new Contact();
        entry[3].setName("Alex");
        entry[3].setEmail("XXX@gmail.com");
        entry[3].setMobilePhone("234-345-3344");
        entry[3].setDate("2022-12-09");
        entry[3].setComment("Hi");

    
        entry[4] = new Contact();
        entry[4].setName("Amir");
        entry[4].setEmail("Amir@gmail.com");
        entry[4].setMobilePhone("457-467-3854");
        entry[4].setDate("2022-12-09");
        entry[4].setComment("Hi");
        

        System.out.println("Name        Email        Phone           Date");
    
        for(int i=0; i<entry.length;i++){
            System.out.println(entry[i].toString());
        }

    
    }
}