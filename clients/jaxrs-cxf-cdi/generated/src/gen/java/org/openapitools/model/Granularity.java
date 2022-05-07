package org.openapitools.model;

import javax.validation.constraints.*;


public enum Granularity {

    TOTAL(String.valueOf("TOTAL")), DAY(String.valueOf("DAY")), HOUR(String.valueOf("HOUR")), WEEK(String.valueOf("WEEK")), MONTH(String.valueOf("MONTH"));


    private String value;

    Granularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Granularity fromValue(String value) {
        for (Granularity b : Granularity.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



