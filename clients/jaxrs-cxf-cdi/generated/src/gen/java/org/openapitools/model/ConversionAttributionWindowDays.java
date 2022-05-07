package org.openapitools.model;

import javax.validation.constraints.*;


public enum ConversionAttributionWindowDays {

    NUMBER_1(Integer.valueOf(1)), NUMBER_7(Integer.valueOf(7)), NUMBER_30(Integer.valueOf(30)), NUMBER_60(Integer.valueOf(60));


    private Integer value;

    ConversionAttributionWindowDays(Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionAttributionWindowDays fromValue(Integer value) {
        for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



