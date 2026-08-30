package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MatchType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TargetingTemplateKeyword
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplateKeyword {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable MatchType matchType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String value;

  public TargetingTemplateKeyword matchType(@Nullable MatchType matchType) {
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
  public @Nullable MatchType getMatchType() {
    return matchType;
  }

  @JsonProperty("match_type")
  public void setMatchType(@Nullable MatchType matchType) {
    this.matchType = matchType;
  }

  public TargetingTemplateKeyword value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * The keyword targeting (120 chars max).
   * @return value
   */
  
  @Schema(name = "value", example = "couples halloween costumes", description = "The keyword targeting (120 chars max).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(@Nullable String value) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

