package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MatchTypeResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdGroupAudienceSizingRequestKeywordsInner
 */

@JsonTypeName("AdGroupAudienceSizingRequest_keywords_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupAudienceSizingRequestKeywordsInner {

  private JsonNullable<MatchTypeResponse> matchType = JsonNullable.<MatchTypeResponse>undefined();

  private String value;

  public AdGroupAudienceSizingRequestKeywordsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdGroupAudienceSizingRequestKeywordsInner(MatchTypeResponse matchType, String value) {
    this.matchType = JsonNullable.of(matchType);
    this.value = value;
  }

  public AdGroupAudienceSizingRequestKeywordsInner matchType(MatchTypeResponse matchType) {
    this.matchType = JsonNullable.of(matchType);
    return this;
  }

  /**
   * Get matchType
   * @return matchType
  */
  @NotNull @Valid 
  @Schema(name = "match_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("match_type")
  public JsonNullable<MatchTypeResponse> getMatchType() {
    return matchType;
  }

  public void setMatchType(JsonNullable<MatchTypeResponse> matchType) {
    this.matchType = matchType;
  }

  public AdGroupAudienceSizingRequestKeywordsInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Keyword value (120 chars max).
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "Keyword value (120 chars max).", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

