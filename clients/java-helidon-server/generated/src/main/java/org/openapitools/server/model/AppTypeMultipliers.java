package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.TargetingSpecAppType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
public class AppTypeMultipliers extends HashMap<String, Double>  {

    private TargetingSpecAppType APP_TYPE;

    /**
     * Default constructor.
     */
    public AppTypeMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create AppTypeMultipliers.
     *
     * @param APP_TYPE App type identifier.
     */
    public AppTypeMultipliers(
        TargetingSpecAppType APP_TYPE
    ) {
        this.APP_TYPE = APP_TYPE;
    }



    /**
     * App type identifier.
     * @return APP_TYPE
     */
    public TargetingSpecAppType getAPPTYPE() {
        return APP_TYPE;
    }

    public void setAPPTYPE(TargetingSpecAppType APP_TYPE) {
        this.APP_TYPE = APP_TYPE;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppTypeMultipliers {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    APP_TYPE: ").append(toIndentedString(APP_TYPE)).append("\n");
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

