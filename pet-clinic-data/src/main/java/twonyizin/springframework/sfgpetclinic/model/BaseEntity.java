package twonyizin.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import java.io.Serializable;


public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
