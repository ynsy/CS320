package models;

import play.db.ebean.Model;
import javax.persistence.*;

/**
 * Created by bahadirkirdan on 12/12/14.
 */
public class Department extends Model {

    @Id
    public String id;

    public String name;

}
