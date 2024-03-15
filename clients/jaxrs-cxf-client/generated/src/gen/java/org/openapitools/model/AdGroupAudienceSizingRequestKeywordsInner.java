package org.openapitools.model;

import org.openapitools.model.MatchTypeResponse;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupAudienceSizingRequestKeywordsInner  {
  
  @ApiModelProperty(required = true, value = "")
  private MatchTypeResponse matchType;

  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
 /**
   * Keyword value (120 chars max).
  **/
  private String value;
 /**
   * Get matchType
   * @return matchType
  **/
  @JsonProperty("match_type")
  public MatchTypeResponse getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  public AdGroupAudienceSizingRequestKeywordsInner matchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
    return this;
  }

 /**
   * Keyword value (120 chars max).
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AdGroupAudienceSizingRequestKeywordsInner value(String value) {
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
    AdGroupAudienceSizingRequestKeywordsInner adGroupAudienceSizingRequestKeywordsInner = (AdGroupAudienceSizingRequestKeywordsInner) o;
    return Objects.equals(this.matchType, adGroupAudienceSizingRequestKeywordsInner.matchType) &&
        Objects.equals(this.value, adGroupAudienceSizingRequestKeywordsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAudienceSizingRequestKeywordsInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

