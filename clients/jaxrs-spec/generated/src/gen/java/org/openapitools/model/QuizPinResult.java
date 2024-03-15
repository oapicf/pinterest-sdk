package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The result, and link out, based on the user’s choice.
 **/
@ApiModel(description = "The result, and link out, based on the user’s choice.")
@JsonTypeName("QuizPinResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizPinResult   {
  private @Valid String organicPinId;
  private @Valid String androidDeepLink;
  private @Valid String iosDeepLink;
  private @Valid String destinationUrl;
  private @Valid BigDecimal resultId;

  /**
   **/
  public QuizPinResult organicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organic_pin_id")
  public String getOrganicPinId() {
    return organicPinId;
  }

  @JsonProperty("organic_pin_id")
  public void setOrganicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
  }

  /**
   **/
  public QuizPinResult androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  @JsonProperty("android_deep_link")
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   **/
  public QuizPinResult iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  @JsonProperty("ios_deep_link")
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   **/
  public QuizPinResult destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  @JsonProperty("destination_url")
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   **/
  public QuizPinResult resultId(BigDecimal resultId) {
    this.resultId = resultId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result_id")
  public BigDecimal getResultId() {
    return resultId;
  }

  @JsonProperty("result_id")
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

