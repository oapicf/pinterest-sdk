package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="The result, and link out, based on the user’s choice.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizPinResult   {
  
  private String organicPinId;
  private String androidDeepLink;
  private String iosDeepLink;
  private String destinationUrl;
  private BigDecimal resultId;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("organic_pin_id")
  public String getOrganicPinId() {
    return organicPinId;
  }
  public void setOrganicPinId(String organicPinId) {
    this.organicPinId = organicPinId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("result_id")
  @Valid
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

