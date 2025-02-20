/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@Schema(name = "PlacementMultipliers", description = "This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).")
@JsonPropertyOrder({
  PlacementMultipliers.JSON_PROPERTY_P_L_A_C_E_M_E_N_T
})
@JsonTypeName("PlacementMultipliers")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class PlacementMultipliers extends HashMap<String, Double> {
    /**
     * Gets or Sets PLACEMENT
     */
    public enum PLACEMENTEnum {
        SEARCH("SEARCH"),
        BROWSE("BROWSE");

        private String value;

        PLACEMENTEnum(String value) {
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
        public static PLACEMENTEnum fromValue(String value) {
            for (PLACEMENTEnum b : PLACEMENTEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_P_L_A_C_E_M_E_N_T = "PLACEMENT";
    private PLACEMENTEnum PLACEMENT;

    public PlacementMultipliers() {
        super();
    }

    public PlacementMultipliers PLACEMENT(PLACEMENTEnum PLACEMENT) {
        this.PLACEMENT = PLACEMENT;
        return this;
    }

    /**
     * Get PLACEMENT
     * @return PLACEMENT
     */
    @Nullable
    @Schema(name = "PLACEMENT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_L_A_C_E_M_E_N_T)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PLACEMENTEnum getPLACEMENT() {
        return PLACEMENT;
    }

    @JsonProperty(JSON_PROPERTY_P_L_A_C_E_M_E_N_T)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPLACEMENT(PLACEMENTEnum PLACEMENT) {
        this.PLACEMENT = PLACEMENT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlacementMultipliers placementMultipliers = (PlacementMultipliers) o;
        return Objects.equals(this.PLACEMENT, placementMultipliers.PLACEMENT) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PLACEMENT, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlacementMultipliers {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    PLACEMENT: ").append(toIndentedString(PLACEMENT)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

