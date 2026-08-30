package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.NullalbleMatchType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupDeliveryEstimatesKeywordsItems   {
  
  private NullalbleMatchType matchType;
  private String value;

  public AdGroupDeliveryEstimatesKeywordsItems () {

  }

  public AdGroupDeliveryEstimatesKeywordsItems (NullalbleMatchType matchType, String value) {
    this.matchType = matchType;
    this.value = value;
  }

    
  @JsonProperty("match_type")
  public NullalbleMatchType getMatchType() {
    return matchType;
  }
  public void setMatchType(NullalbleMatchType matchType) {
    this.matchType = matchType;
  }

    
  @JsonProperty("value")
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
    return Objects.equals(matchType, adGroupDeliveryEstimatesKeywordsItems.matchType) &&
        Objects.equals(value, adGroupDeliveryEstimatesKeywordsItems.value);
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
