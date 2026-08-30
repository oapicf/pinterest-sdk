package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.TargetingSpecGender;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
public class GenderMultipliers extends HashMap<String, Double>  {

    private TargetingSpecGender GENDER;

    /**
     * Default constructor.
     */
    public GenderMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create GenderMultipliers.
     *
     * @param GENDER Gender identifier.
     */
    public GenderMultipliers(
        TargetingSpecGender GENDER
    ) {
        this.GENDER = GENDER;
    }



    /**
     * Gender identifier.
     * @return GENDER
     */
    public TargetingSpecGender getGENDER() {
        return GENDER;
    }

    public void setGENDER(TargetingSpecGender GENDER) {
        this.GENDER = GENDER;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderMultipliers {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
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

