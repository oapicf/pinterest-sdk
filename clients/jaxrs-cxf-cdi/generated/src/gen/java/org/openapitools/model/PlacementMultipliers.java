package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).")
public class PlacementMultipliers extends HashMap<String, Double>  {
  

public enum PLACEMENTEnum {

    @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("BROWSE") BROWSE(String.valueOf("BROWSE"));


    private String value;

    PLACEMENTEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PLACEMENTEnum fromValue(String value) {
        for (PLACEMENTEnum b : PLACEMENTEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private PLACEMENTEnum PLACEMENT;

  /**
   **/
  public PlacementMultipliers PLACEMENT(PLACEMENTEnum PLACEMENT) {
    this.PLACEMENT = PLACEMENT;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PLACEMENT")
  public PLACEMENTEnum getPLACEMENT() {
    return PLACEMENT;
  }
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
    return super.equals(o) && Objects.equals(this.PLACEMENT, placementMultipliers.PLACEMENT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), PLACEMENT);
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

