

public class Utils {


StringUtils stringUtils=new StringUtils();
    public boolean isAllPositive(String s1,String s2){

        if (stringUtils.isPositive(s1)&&stringUtils.isPositive(s2))
        {
            return true;
        }
        else
            return false;
    }

}

