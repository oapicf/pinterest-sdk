package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NullalbleMatchType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdGroupDeliveryEstimatesKeywordsItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupDeliveryEstimatesKeywordsItems {

  private JsonNullable<NullalbleMatchType> matchType = JsonNullable.<NullalbleMatchType>undefined();

  private String value;

  public AdGroupDeliveryEstimatesKeywordsItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdGroupDeliveryEstimatesKeywordsItems(NullalbleMatchType matchType, String value) {
    this.matchType = JsonNullable.of(matchType);
    this.value = value;
  }

  public AdGroupDeliveryEstimatesKeywordsItems matchType(NullalbleMatchType matchType) {
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
  public JsonNullable<NullalbleMatchType> getMatchType() {
    return matchType;
  }

  @JsonProperty("match_type")
  public void setMatchType(JsonNullable<NullalbleMatchType> matchType) {
    this.matchType = matchType;
  }

  public AdGroupDeliveryEstimatesKeywordsItems value(String value) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

