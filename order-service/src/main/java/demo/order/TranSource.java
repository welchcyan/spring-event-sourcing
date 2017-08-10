package demo.order;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by chenw13 on 08/08/2017.
 */

public interface TranSource {

    String BALANCE = "account_balance";

    @Output(BALANCE)
    MessageChannel tran1OutPut();

    @Output("tran2Output")
    MessageChannel tran2OutPut();
}
