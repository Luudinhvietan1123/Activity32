package Controller;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Processing_Data_From_DB {
    public Date Processing_Timestamp(String timestamp) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date time;
        return time = format1.parse(timestamp);
    }
}
