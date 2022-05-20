package app.Routes;

import lombok.Getter;

public class PATH {
    public static class Web
    {
        @Getter
        public static final String INDEX = "/index";
        @Getter
        public static final String DETAIL="/detail/:name";
    }
}
