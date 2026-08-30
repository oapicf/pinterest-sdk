package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The result, and link out, based on the user’s choice.
 */

@Schema(name = "QuizPinResult", description = "The result, and link out, based on the user’s choice.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QuizPinResult {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String androidDeepLink;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String destinationUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String iosDeepLink;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String organicPinId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal resultId;

  public QuizPinResult androidDeepLink(@Nullable String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  /**
   * Get androidDeepLink
   * @return androidDeepLink
   */
  
  @Schema(name = "android_deep_link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_deep_link")
  public @Nullable String getAndroidDeepLink() {
    return androidDeepLink;
  }

  @JsonProperty("android_deep_link")
  public void setAndroidDeepLink(@Nullable String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public QuizPinResult destinationUrl(@Nullable String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  /**
   * Get destinationUrl
   * @return destinationUrl
   */
  
  @Schema(name = "destination_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination_url")
  public @Nullable String getDestinationUrl() {
    return destinationUrl;
  }

  @JsonProperty("destination_url")
  public void setDestinationUrl(@Nullable String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public QuizPinResult iosDeepLink(@Nullable String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  /**
   * Get iosDeepLink
   * @return iosDeepLink
   */
  
  @Schema(name = "ios_deep_link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ios_deep_link")
  public @Nullable String getIosDeepLink() {
    return iosDeepLink;
  }

  @JsonProperty("ios_deep_link")
  public void setIosDeepLink(@Nullable String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public QuizPinResult organicPinId(@Nullable String organicPinId) {
    this.organicPinId = organicPinId;
    return this;
  }

  /**
   * Get organicPinId
   * @return organicPinId
   */
  
  @Schema(name = "organic_pin_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organic_pin_id")
  public @Nullable String getOrganicPinId() {
    return organicPinId;
  }

  @JsonProperty("organic_pin_id")
  public void setOrganicPinId(@Nullable String organicPinId) {
    this.organicPinId = organicPinId;
  }

  public QuizPinResult resultId(@Nullable BigDecimal resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * Get resultId
   * @return resultId
   */
  @Valid 
  @Schema(name = "result_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result_id")
  public @Nullable BigDecimal getResultId() {
    return resultId;
  }

  @JsonProperty("result_id")
  public void setResultId(@Nullable BigDecimal resultId) {
    this.resultId = resultId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizPinResult quizPinResult = (QuizPinResult) o;
    return Objects.equals(this.androidDeepLink, quizPinResult.androidDeepLink) &&
        Objects.equals(this.destinationUrl, quizPinResult.destinationUrl) &&
        Objects.equals(this.iosDeepLink, quizPinResult.iosDeepLink) &&
        Objects.equals(this.organicPinId, quizPinResult.organicPinId) &&
        Objects.equals(this.resultId, quizPinResult.resultId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidDeepLink, destinationUrl, iosDeepLink, organicPinId, resultId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinResult {\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    organicPinId: ").append(toIndentedString(organicPinId)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
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

