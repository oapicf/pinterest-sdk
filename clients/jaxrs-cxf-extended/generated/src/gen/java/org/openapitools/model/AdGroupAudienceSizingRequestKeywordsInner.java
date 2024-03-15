package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MatchTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupAudienceSizingRequestKeywordsInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private MatchTypeResponse matchType;

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
  public MatchTypeResponse getMatchType() {
    return matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
 public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
  public AdGroupAudienceSizingRequestKeywordsInner matchType(MatchTypeResponse matchType) {
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

