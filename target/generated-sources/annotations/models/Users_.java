package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Items;
import models.Role;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-10T19:42:05")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Role> role;
    public static volatile ListAttribute<Users, Items> itemsList;
    public static volatile SingularAttribute<Users, Boolean> active;
    public static volatile SingularAttribute<Users, String> userUUID;
    public static volatile SingularAttribute<Users, String> userSalt;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> username;

}