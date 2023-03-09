package services;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsService {
    private final static String ACCOUNT_SID = "AC7ec6e57e3561d6db535f50c666399d54";
    private final static String AUTH_TOKEN = "b2fa9df2988896aee37510bc4f727dde";
    private final static String FROM_NUMBER = "+15673132382";

    static {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public static void sendSMS(String toNumber, String message) {
        Message.creator(
                new PhoneNumber(toNumber),
                new PhoneNumber(FROM_NUMBER),
                message
        ).create();
    }
}
