package mapuserorder;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TaobaoOrderItemRepository extends CrudRepository<TaobaoOrderItem, Long> {
	
	List<TaobaoOrderItem> findByOrderId(Long OrderId);

}
