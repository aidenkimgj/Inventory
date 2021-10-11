package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-10T19:42:05")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile ListAttribute<Role, Users> usersList;
    public static volatile SingularAttribute<Role, Integer> roleid;
    public static volatile SingularAttribute<Role, String> rolename;

}