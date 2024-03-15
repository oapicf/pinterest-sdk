package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdCommon_tracking_urls")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdCommonTrackingUrls   {
  private @Valid List<String> impression;
  private @Valid List<String> click;
  private @Valid List<String> engagement;
  private @Valid List<String> buyableButton;
  private @Valid List<String> audienceVerification;

  /**
   **/
  public AdCommonTrackingUrls impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("impression")
  public List<String> getImpression() {
    return impression;
  }

  @JsonProperty("impression")
  public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  public AdCommonTrackingUrls addImpressionItem(String impressionItem) {
    if (this.impression == null) {
      this.impression = new ArrayList<>();
    }

    this.impression.add(impressionItem);
    return this;
  }

  public AdCommonTrackingUrls removeImpressionItem(String impressionItem) {
    if (impressionItem != null && this.impression != null) {
      this.impression.remove(impressionItem);
    }

    return this;
  }
  /**
   **/
  public AdCommonTrackingUrls click(List<String> click) {
    this.click = click;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("click")
  public List<String> getClick() {
    return click;
  }

  @JsonProperty("click")
  public void setClick(List<String> click) {
    this.click = click;
  }

  public AdCommonTrackingUrls addClickItem(String clickItem) {
    if (this.click == null) {
      this.click = new ArrayList<>();
    }

    this.click.add(clickItem);
    return this;
  }

  public AdCommonTrackingUrls removeClickItem(String clickItem) {
    if (clickItem != null && this.click != null) {
      this.click.remove(clickItem);
    }

    return this;
  }
  /**
   **/
  public AdCommonTrackingUrls engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("engagement")
  public List<String> getEngagement() {
    return engagement;
  }

  @JsonProperty("engagement")
  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  public AdCommonTrackingUrls addEngagementItem(String engagementItem) {
    if (this.engagement == null) {
      this.engagement = new ArrayList<>();
    }

    this.engagement.add(engagementItem);
    return this;
  }

  public AdCommonTrackingUrls removeEngagementItem(String engagementItem) {
    if (engagementItem != null && this.engagement != null) {
      this.engagement.remove(engagementItem);
    }

    return this;
  }
  /**
   **/
  public AdCommonTrackingUrls buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buyable_button")
  public List<String> getBuyableButton() {
    return buyableButton;
  }

  @JsonProperty("buyable_button")
  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  public AdCommonTrackingUrls addBuyableButtonItem(String buyableButtonItem) {
    if (this.buyableButton == null) {
      this.buyableButton = new ArrayList<>();
    }

    this.buyableButton.add(buyableButtonItem);
    return this;
  }

  public AdCommonTrackingUrls removeBuyableButtonItem(String buyableButtonItem) {
    if (buyableButtonItem != null && this.buyableButton != null) {
      this.buyableButton.remove(buyableButtonItem);
    }

    return this;
  }
  /**
   **/
  public AdCommonTrackingUrls audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_verification")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }

  @JsonProperty("audience_verification")
  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }

  public AdCommonTrackingUrls addAudienceVerificationItem(String audienceVerificationItem) {
    if (this.audienceVerification == null) {
      this.audienceVerification = new ArrayList<>();
    }

    this.audienceVerification.add(audienceVerificationItem);
    return this;
  }

  public AdCommonTrackingUrls removeAudienceVerificationItem(String audienceVerificationItem) {
    if (audienceVerificationItem != null && this.audienceVerification != null) {
      this.audienceVerification.remove(audienceVerificationItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdCommonTrackingUrls adCommonTrackingUrls = (AdCommonTrackingUrls) o;
    return Objects.equals(this.impression, adCommonTrackingUrls.impression) &&
        Objects.equals(this.click, adCommonTrackingUrls.click) &&
        Objects.equals(this.engagement, adCommonTrackingUrls.engagement) &&
        Objects.equals(this.buyableButton, adCommonTrackingUrls.buyableButton) &&
        Objects.equals(this.audienceVerification, adCommonTrackingUrls.audienceVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impression, click, engagement, buyableButton, audienceVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdCommonTrackingUrls {\n");
    
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    engagement: ").append(toIndentedString(engagement)).append("\n");
    sb.append("    buyableButton: ").append(toIndentedString(buyableButton)).append("\n");
    sb.append("    audienceVerification: ").append(toIndentedString(audienceVerification)).append("\n");
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

