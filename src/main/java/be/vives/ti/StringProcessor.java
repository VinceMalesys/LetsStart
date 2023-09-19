package be.vives.ti;

public class StringProcessor {
    public String appendIfMissing(String str, String suffix){
        if(str.endsWith(suffix) ){
            return str;
        }
        else {
        return str + suffix;
    }
}

}
