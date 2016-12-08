/**
 * Created by Pierre on 08/12/2016.
 */
public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch(this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default:       return "unspecified";
        }
    }

}
