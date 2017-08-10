package demo;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by chenw13 on 08/08/2017.
 */
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Transaction implements Serializable {

    @Id
    private long id;

    private String user_id;

    private long val;

    public Transaction() {
    }

    public Transaction(long id, String user_id, long val) {
        this.id = id;
        this.user_id = user_id;
        this.val = val;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public long getVal() {
        return val;
    }

    public void setVal(long val) {
        this.val = val;
    }



    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", val=" + val +
                '}';
    }
}
