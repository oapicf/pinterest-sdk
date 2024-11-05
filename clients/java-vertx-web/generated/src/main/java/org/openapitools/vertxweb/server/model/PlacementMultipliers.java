package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

/**
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlacementMultipliers extends HashMap<String, Double>  {
  


  public enum PLACEMENTEnum {
    SEARCH("SEARCH"),
    BROWSE("BROWSE");

    private String value;

    PLACEMENTEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PLACEMENTEnum PLACEMENT;

  public PlacementMultipliers () {

  }

  public PlacementMultipliers (PLACEMENTEnum PLACEMENT) {
    this.PLACEMENT = PLACEMENT;
  }

    
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
    return super.equals(o) && Objects.equals(PLACEMENT, placementMultipliers.PLACEMENT);
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
