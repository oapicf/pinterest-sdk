package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MatchType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TargetingTemplateKeyword
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateKeyword {

  private MatchType matchType;

  private String value;

  public TargetingTemplateKeyword matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   * @return matchType
   */
  @Valid 
  @Schema(name = "match_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("match_type")
  public MatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  public TargetingTemplateKeyword value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The keyword targeting (120 chars max).
   * @return value
   */
  
  @Schema(name = "value", example = "couples halloween costumes", description = "The keyword targeting (120 chars max).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

