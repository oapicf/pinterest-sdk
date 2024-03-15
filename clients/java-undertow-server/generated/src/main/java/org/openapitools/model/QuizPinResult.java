/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * The result, and link out, based on the user’s choice.
 */

@ApiModel(description = "The result, and link out, based on the user’s choice.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizPinResult   {
  
  private String organicPinId;
  private String androidDeepLink;
  private String iosDeepLink;
  private String destinationUrl;
  private BigDecimal resultId;

  /**
   */
  public QuizPinResult organicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organic_pin_id")
  public String getOrganicPinId() {
    return organicPinId;
  }
  public void setOrganicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
  }

  /**
   */
  public QuizPinResult androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   */
  public QuizPinResult iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   */
  public QuizPinResult destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   */
  public QuizPinResult resultId(BigDecimal resultId) {
    this.resultId = resultId;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(organicPinId, quizPinResult.organicPinId) &&
        Objects.equals(androidDeepLink, quizPinResult.androidDeepLink) &&
        Objects.equals(iosDeepLink, quizPinResult.iosDeepLink) &&
        Objects.equals(destinationUrl, quizPinResult.destinationUrl) &&
        Objects.equals(resultId, quizPinResult.resultId);
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

