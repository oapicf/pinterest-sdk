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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdGroupAudienceSizingKeyword")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupAudienceSizingKeyword   {
  private MatchType matchType;
  private String value;

  public AdGroupAudienceSizingKeyword() {
  }

  @JsonCreator
  public AdGroupAudienceSizingKeyword(
    @JsonProperty(required = true, value = "match_type") MatchType matchType,
    @JsonProperty(required = true, value = "value") String value
  ) {
    this.matchType = matchType;
    this.value = value;
  }

  /**
   **/
  public AdGroupAudienceSizingKeyword matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "match_type")
  @NotNull public MatchType getMatchType() {
    return matchType;
  }

  @JsonProperty(required = true, value = "match_type")
  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * Keyword value (120 chars max).
   **/
  public AdGroupAudienceSizingKeyword value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  @JsonProperty(required = true, value = "value")
  @NotNull public String getValue() {
    return value;
  }

  @JsonProperty(required = true, value = "value")
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
    AdGroupAudienceSizingKeyword adGroupAudienceSizingKeyword = (AdGroupAudienceSizingKeyword) o;
    return Objects.equals(this.matchType, adGroupAudienceSizingKeyword.matchType) &&
        Objects.equals(this.value, adGroupAudienceSizingKeyword.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAudienceSizingKeyword {\n");
    
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
