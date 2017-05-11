import java.util.ArrayList;
import java.util.List;

/**
 * Created by diamo on 05.05.2017.
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}
