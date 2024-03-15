package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The result, and link out, based on the user’s choice.
 */

@Schema(name = "QuizPinResult", description = "The result, and link out, based on the user’s choice.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizPinResult {

  private String organicPinId;

  private String androidDeepLink;

  private String iosDeepLink;

  private String destinationUrl;

  private BigDecimal resultId;

  public QuizPinResult organicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
    return this;
  }

  /**
   * Get organicPinId
   * @return organicPinId
  */
  
  @Schema(name = "organic_pin_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organic_pin_id")
  public String getOrganicPinId() {
    return organicPinId;
  }

  public void setOrganicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
  }

  public QuizPinResult androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  /**
   * Get androidDeepLink
   * @return androidDeepLink
  */
  
  @Schema(name = "android_deep_link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public QuizPinResult iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  /**
   * Get iosDeepLink
   * @return iosDeepLink
  */
  
  @Schema(name = "ios_deep_link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public QuizPinResult destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  /**
   * Get destinationUrl
   * @return destinationUrl
  */
  
  @Schema(name = "destination_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public QuizPinResult resultId(BigDecimal resultId) {
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
  public BigDecimal getResultId() {
    return resultId;
  }

  public void setResultId(BigDecimal resultId) {
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
    return Objects.equals(this.organicPinId, quizPinResult.organicPinId) &&
        Objects.equals(this.androidDeepLink, quizPinResult.androidDeepLink) &&
        Objects.equals(this.iosDeepLink, quizPinResult.iosDeepLink) &&
        Objects.equals(this.destinationUrl, quizPinResult.destinationUrl) &&
        Objects.equals(this.resultId, quizPinResult.resultId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organicPinId, androidDeepLink, iosDeepLink, destinationUrl, resultId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinResult {\n");
    sb.append("    organicPinId: ").append(toIndentedString(organicPinId)).append("\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
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

