package stringsDemo;

public class stringsDemo {

	
    public static void main(String [] args) {

    String mesaj = "Bugün hava çok güzel.";
    System.out.println(mesaj);
    
    System.out.println("Eleman sayısı : " + mesaj.length ());
    System.out.println("5. eleman : " + mesaj.charAt(4));
    System.out.println(mesaj.concat("Yaşasın!"));
    System.out.println(mesaj.startsWith("B"));
    System.out.println(mesaj.endsWith("."));
    System.out.println(mesaj.indexOf("av"));
    System.out.println(mesaj.lastIndexOf("a"));

    
    System.out.println("----------------------------------");
    
    
    
    String yeniMesaj = mesaj.replace(' ', '-');
    System.out.println(yeniMesaj);
    System.out.println(mesaj.substring(2,5));
    
    for (String kelime : mesaj.split(" ") ) {
    	System.out.println(kelime);
    	
    }
    
    System.out.println(mesaj.toLowerCase());
    System.out.println(mesaj.toUpperCase());
    
    System.out.println(mesaj.trim());
    
    

    
    }

}