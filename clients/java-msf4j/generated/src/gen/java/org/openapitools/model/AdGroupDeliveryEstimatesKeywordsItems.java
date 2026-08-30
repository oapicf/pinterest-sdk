package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NullalbleMatchType;

/**
 * AdGroupDeliveryEstimatesKeywordsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupDeliveryEstimatesKeywordsItems   {
  @JsonProperty("match_type")
  private NullalbleMatchType matchType;

  @JsonProperty("value")
  private String value;

  public AdGroupDeliveryEstimatesKeywordsItems matchType(NullalbleMatchType matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @ApiModelProperty(required = true, value = "")
  public NullalbleMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(NullalbleMatchType matchType) {
    this.matchType = matchType;
  }

  public AdGroupDeliveryEstimatesKeywordsItems value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Keyword value (120 chars max).
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

