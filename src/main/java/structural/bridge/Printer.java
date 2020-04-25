package structural.bridge;

import java.util.List;

public abstract class Printer {
    private Formatter formatter;

    String print(Formatter formatter){
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected String getHeader();

    abstract protected List<Detail> getDetails();

}
