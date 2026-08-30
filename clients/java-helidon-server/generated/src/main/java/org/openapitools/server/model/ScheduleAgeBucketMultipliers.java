package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class ScheduleAgeBucketMultipliers extends HashMap<String, Double>  {


    /**
    * Gets or Sets AGE_BUCKET
    */
    public enum AGEBUCKETEnum {
        _18_24("18-24"),
        _25_34("25-34"),
        _35_44("35-44"),
        _45_49("45-49"),
        _50_54("50-54"),
        _55_64("55-64"),
        _65_("65+");

        private String value;

        AGEBUCKETEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static AGEBUCKETEnum fromValue(String text) {
            for (AGEBUCKETEnum b : AGEBUCKETEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private AGEBUCKETEnum AGE_BUCKET;

    /**
     * Default constructor.
     */
    public ScheduleAgeBucketMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleAgeBucketMultipliers.
     *
     * @param AGE_BUCKET AGE_BUCKET
     */
    public ScheduleAgeBucketMultipliers(
        AGEBUCKETEnum AGE_BUCKET
    ) {
        this.AGE_BUCKET = AGE_BUCKET;
    }



    /**
     * Get AGE_BUCKET
     * @return AGE_BUCKET
     */
    public AGEBUCKETEnum getAGEBUCKET() {
        return AGE_BUCKET;
    }

    public void setAGEBUCKET(AGEBUCKETEnum AGE_BUCKET) {
        this.AGE_BUCKET = AGE_BUCKET;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleAgeBucketMultipliers {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    AGE_BUCKET: ").append(toIndentedString(AGE_BUCKET)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

