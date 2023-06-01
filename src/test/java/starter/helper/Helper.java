package starter.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class Helper {

    public String randomCodeWithUuid(String code){
        UUID uuid = UUID.randomUUID();
        return code+"_"+uuid.toString();
    }
    public String dateServer(){
        return generateDate("yyyy-MM-dd/HH:mm:ss.SSS").replace("/","T");
    }

    public String dayListCode() {

        String code = "10151_"+generateDate("yyyyMMdd")+"_00001T";
        return code;
    }

    public String generateDate(String format){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(calendar.getTime());
    }
}
