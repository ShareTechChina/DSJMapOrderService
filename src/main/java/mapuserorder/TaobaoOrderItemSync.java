package mapuserorder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taobao_order_item_sync")
public class TaobaoOrderItemSync {
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
	@Column(name="sync_order_id")  
    private Long syncOrderId;
    
    @Column(name="sync_item_name")  
    private String syncItemName;
    
    @Column(name="sync_item_id")  
    private Long syncItemId;
    
    @Column(name="sync_store_name")  
    private String syncStoreName; 
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSyncOrderId() {
		return syncOrderId;
	}

	public void setSyncOrderId(Long syncOrderId) {
		this.syncOrderId = syncOrderId;
	}

	public String getSyncItemName() {
		return syncItemName;
	}

	public void setSyncItemName(String syncItemName) {
		this.syncItemName = syncItemName;
	}

	public Long getSyncItemId() {
		return syncItemId;
	}

	public void setSyncItemId(Long syncItemId) {
		this.syncItemId = syncItemId;
	}

	public String getSyncStoreName() {
		return syncStoreName;
	}

	public void setSyncStoreName(String syncStoreName) {
		this.syncStoreName = syncStoreName;
	}
    
}
