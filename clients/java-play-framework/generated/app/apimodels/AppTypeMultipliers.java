package apimodels;

import apimodels.TargetingSpecAppType;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AppTypeMultipliers extends HashMap<String, Double>  {
  @JsonProperty("APP_TYPE")
  @Valid

  private TargetingSpecAppType APP_TYPE;

  public AppTypeMultipliers APP_TYPE(TargetingSpecAppType APP_TYPE) {
    this.APP_TYPE = APP_TYPE;
    return this;
  }

   /**
   * Get APP_TYPE
   * @return APP_TYPE
  **/
  public TargetingSpecAppType getAPPTYPE() {
    return APP_TYPE;
  }

  public void setAPPTYPE(TargetingSpecAppType APP_TYPE) {
    this.APP_TYPE = APP_TYPE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppTypeMultipliers appTypeMultipliers = (AppTypeMultipliers) o;
    return Objects.equals(APP_TYPE, appTypeMultipliers.APP_TYPE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(APP_TYPE, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

