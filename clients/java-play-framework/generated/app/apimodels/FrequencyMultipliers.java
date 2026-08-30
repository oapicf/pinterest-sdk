package apimodels;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FrequencyMultipliers extends HashMap<String, Double>  {
  @JsonProperty("IMPRESSION_COUNT")
  
  private String IMPRESSION_COUNT;

  public FrequencyMultipliers IMPRESSION_COUNT(String IMPRESSION_COUNT) {
    this.IMPRESSION_COUNT = IMPRESSION_COUNT;
    return this;
  }

   /**
   * Impression count identifier.
   * @return IMPRESSION_COUNT
  **/
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
    return Objects.equals(IMPRESSION_COUNT, frequencyMultipliers.IMPRESSION_COUNT) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IMPRESSION_COUNT, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

