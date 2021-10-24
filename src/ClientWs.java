import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService stubWs = new BanqueWS().getBanqueServicePort();
    System.out.println(stubWs.conversionEuroToDH(800));
        Compte cp =stubWs.getCompte(2l);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> cptes  = stubWs.listComptes();
        cptes.forEach(c->{
            System.out.println("--------------------------------");

            System.out.println(c.getCode());
            System.out.println(c.getSolde());
        });
    }
}
