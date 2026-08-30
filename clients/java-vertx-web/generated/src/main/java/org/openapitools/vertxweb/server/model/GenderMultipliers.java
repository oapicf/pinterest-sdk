package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.vertxweb.server.model.TargetingSpecGender;

/**
 * This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenderMultipliers extends HashMap<String, Double>  {
  
  private TargetingSpecGender GENDER;

  public GenderMultipliers () {

  }

  public GenderMultipliers (TargetingSpecGender GENDER) {
    this.GENDER = GENDER;
  }

    
  @JsonProperty("GENDER")
  public TargetingSpecGender getGENDER() {
    return GENDER;
  }
  public void setGENDER(TargetingSpecGender GENDER) {
    this.GENDER = GENDER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderMultipliers genderMultipliers = (GenderMultipliers) o;
    return super.equals(o) && Objects.equals(GENDER, genderMultipliers.GENDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), GENDER);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
