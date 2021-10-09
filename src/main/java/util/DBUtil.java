package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
     private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("com.mycompany_Inventory_war_1.0-SNAPSHOTPU");

    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}
