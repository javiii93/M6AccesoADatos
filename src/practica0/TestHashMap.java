package practica0;
import java.util.*;
public class TestHashMap {
public static void main(String[] args) {
int cod_banco;
Map  <Integer,String>bancos = new HashMap<Integer,String> ();
bancos.put(1827,"BBVA");
bancos.put(1049,"Santander");
bancos.put(2038,"Bankia");
bancos.put(2100,"La Caixa");
bancos.put(5003, "ING Direct");
bancos.put(4587, "Caja Rural");
Iterator it = bancos.keySet().iterator();
while(it.hasNext()) {
cod_banco =  (int) it.next();
System.out.println(cod_banco + ": " + bancos.get(cod_banco));
 
}
Iterator it2 = bancos.keySet().iterator();
while(it2.hasNext()) {
	bancos.remove(it2.next());
}
 
}
}
