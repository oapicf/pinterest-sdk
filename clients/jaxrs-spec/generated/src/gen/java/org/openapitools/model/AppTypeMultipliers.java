package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TargetingSpecAppType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 **/
@ApiModel(description = "This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).")
@JsonTypeName("AppTypeMultipliers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AppTypeMultipliers extends HashMap<String, Double>  {
  private TargetingSpecAppType APP_TYPE;

  /**
   **/
  public AppTypeMultipliers APP_TYPE(TargetingSpecAppType APP_TYPE) {
    this.APP_TYPE = APP_TYPE;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("APP_TYPE")
  public TargetingSpecAppType getAPPTYPE() {
    return APP_TYPE;
  }

  @JsonProperty("APP_TYPE")
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
    return Objects.equals(this.APP_TYPE, appTypeMultipliers.APP_TYPE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(APP_TYPE, super.hashCode());
  }

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

