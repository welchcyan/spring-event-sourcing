package demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenw13 on 08/08/2017.
 */
public interface TranRepository extends JpaRepository<Transaction, String> {

}
