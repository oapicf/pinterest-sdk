package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;



/**
 * This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 **/

@ApiModel(description = "This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FrequencyMultipliers extends HashMap<String, Double>  {
  @JsonProperty("IMPRESSION_COUNT")
  private String IMPRESSION_COUNT;

  /**
   * Impression count identifier.
   **/
  public FrequencyMultipliers IMPRESSION_COUNT(String IMPRESSION_COUNT) {
    this.IMPRESSION_COUNT = IMPRESSION_COUNT;
    return this;
  }

  
  @ApiModelProperty(value = "Impression count identifier.")
  @JsonProperty("IMPRESSION_COUNT")
  public String getIMPRESSIONCOUNT() {
    return IMPRESSION_COUNT;
  }
  public void setIMPRESSIONCOUNT(String IMPRESSION_COUNT) {
    this.IMPRESSION_COUNT = IMPRESSION_COUNT;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequencyMultipliers frequencyMultipliers = (FrequencyMultipliers) o;
    return super.equals(o) && Objects.equals(IMPRESSION_COUNT, frequencyMultipliers.IMPRESSION_COUNT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), IMPRESSION_COUNT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    IMPRESSION_COUNT: ").append(toIndentedString(IMPRESSION_COUNT)).append("\n");
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

