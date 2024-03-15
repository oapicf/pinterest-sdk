package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * The result, and link out, based on the user’s choice.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizPinResult   {
  
  private String organicPinId;
  private String androidDeepLink;
  private String iosDeepLink;
  private String destinationUrl;
  private BigDecimal resultId;

  public QuizPinResult () {

  }

  public QuizPinResult (String organicPinId, String androidDeepLink, String iosDeepLink, String destinationUrl, BigDecimal resultId) {
    this.organicPinId = organicPinId;
    this.androidDeepLink = androidDeepLink;
    this.iosDeepLink = iosDeepLink;
    this.destinationUrl = destinationUrl;
    this.resultId = resultId;
  }

    
  @JsonProperty("organic_pin_id")
  public String getOrganicPinId() {
    return organicPinId;
  }
  public void setOrganicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
  }

    
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

    
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

    
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

    
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
