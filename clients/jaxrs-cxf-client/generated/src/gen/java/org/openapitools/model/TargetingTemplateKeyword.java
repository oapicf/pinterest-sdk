package org.openapitools.model;

import org.openapitools.model.MatchType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateKeyword  {
  
  @ApiModelProperty(value = "")
  private MatchType matchType;

  @ApiModelProperty(example = "couples halloween costumes", value = "The keyword targeting (120 chars max).")
 /**
   * The keyword targeting (120 chars max).
  **/
  private String value;
 /**
   * Get matchType
   * @return matchType
  **/
  @JsonProperty("match_type")
  public MatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  public TargetingTemplateKeyword matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

 /**
   * The keyword targeting (120 chars max).
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TargetingTemplateKeyword value(String value) {
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
    TargetingTemplateKeyword targetingTemplateKeyword = (TargetingTemplateKeyword) o;
    return Objects.equals(this.matchType, targetingTemplateKeyword.matchType) &&
        Objects.equals(this.value, targetingTemplateKeyword.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateKeyword {\n");
    
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

