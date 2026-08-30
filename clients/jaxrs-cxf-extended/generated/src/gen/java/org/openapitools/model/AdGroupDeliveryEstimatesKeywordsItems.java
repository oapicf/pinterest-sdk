package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NullalbleMatchType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupDeliveryEstimatesKeywordsItems  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private NullalbleMatchType matchType;

 /**
  * Keyword value (120 chars max).
  */
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  private String value;
 /**
  * Get matchType
  * @return matchType
  */
  @JsonProperty("match_type")
  @NotNull
  public NullalbleMatchType getMatchType() {
    return matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
 public void setMatchType(NullalbleMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
  public AdGroupDeliveryEstimatesKeywordsItems matchType(NullalbleMatchType matchType) {
    this.matchType = matchType;
    return this;
  }

 /**
  * Keyword value (120 chars max).
  * @return value
  */
  @JsonProperty("value")
  @NotNull
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public AdGroupDeliveryEstimatesKeywordsItems value(String value) {
    this.value = value;
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
    AdGroupDeliveryEstimatesKeywordsItems adGroupDeliveryEstimatesKeywordsItems = (AdGroupDeliveryEstimatesKeywordsItems) o;
    return Objects.equals(this.matchType, adGroupDeliveryEstimatesKeywordsItems.matchType) &&
        Objects.equals(this.value, adGroupDeliveryEstimatesKeywordsItems.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupDeliveryEstimatesKeywordsItems {\n");
    
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

