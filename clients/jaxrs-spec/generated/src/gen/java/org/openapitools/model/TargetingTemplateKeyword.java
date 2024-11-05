package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MatchType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TargetingTemplateKeyword")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateKeyword   {
  private MatchType matchType;
  private String value;

  /**
   **/
  public TargetingTemplateKeyword matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("match_type")
  public MatchType getMatchType() {
    return matchType;
  }

  @JsonProperty("match_type")
  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The keyword targeting (120 chars max).
   **/
  public TargetingTemplateKeyword value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "couples halloween costumes", value = "The keyword targeting (120 chars max).")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @JsonProperty("value")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

