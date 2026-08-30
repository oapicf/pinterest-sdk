package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PlacementType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@ApiModel(description="This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).")

public class PlacementMultipliers extends HashMap<String, Double> {
  
 /**
  * Placement type identifier.
  */
  @ApiModelProperty(value = "Placement type identifier.")
  @Valid
  private PlacementType PLACEMENT;
 /**
  * Placement type identifier.
  * @return PLACEMENT
  */
  @JsonProperty("PLACEMENT")
  public PlacementType getPLACEMENT() {
    return PLACEMENT;
  }

  /**
   * Sets the <code>PLACEMENT</code> property.
   */
 public void setPLACEMENT(PlacementType PLACEMENT) {
    this.PLACEMENT = PLACEMENT;
  }

  /**
   * Sets the <code>PLACEMENT</code> property.
   */
  public PlacementMultipliers PLACEMENT(PlacementType PLACEMENT) {
    this.PLACEMENT = PLACEMENT;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

