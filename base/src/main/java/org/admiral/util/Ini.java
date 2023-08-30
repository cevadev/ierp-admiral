package org.admiral.util;

import java.io.Serializable;
import java.util.Properties;

public class Ini implements Serializable {
    public static final String ADMIRAL_PROPERTY_FILE = "Admiral.properties";
    private volatile static Properties s_prop = new Properties();
}
