package mapuserorder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="duoshouji_user")
public class User {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Id
    private Long id;
}
