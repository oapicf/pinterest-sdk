package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * AdCommonTrackingUrls
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdCommonTrackingUrls   {
  @JsonProperty("impression")
  private List<String> impression = null;

  @JsonProperty("click")
  private List<String> click = null;

  @JsonProperty("engagement")
  private List<String> engagement = null;

  @JsonProperty("buyable_button")
  private List<String> buyableButton = null;

  @JsonProperty("audience_verification")
  private List<String> audienceVerification = null;

  public AdCommonTrackingUrls impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  public AdCommonTrackingUrls addImpressionItem(String impressionItem) {
    if (this.impression == null) {
      this.impression = ;
    }
    this.impression.add(impressionItem);
    return this;
  }

   /**
   * Get impression
   * @return impression
  **/
  @ApiModelProperty(value = "")
  public List<String> getImpression() {
    return impression;
  }

  public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  public AdCommonTrackingUrls click(List<String> click) {
    this.click = click;
    return this;
  }

  public AdCommonTrackingUrls addClickItem(String clickItem) {
    if (this.click == null) {
      this.click = ;
    }
    this.click.add(clickItem);
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @ApiModelProperty(value = "")
  public List<String> getClick() {
    return click;
  }

  public void setClick(List<String> click) {
    this.click = click;
  }

  public AdCommonTrackingUrls engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  public AdCommonTrackingUrls addEngagementItem(String engagementItem) {
    if (this.engagement == null) {
      this.engagement = ;
    }
    this.engagement.add(engagementItem);
    return this;
  }

   /**
   * Get engagement
   * @return engagement
  **/
  @ApiModelProperty(value = "")
  public List<String> getEngagement() {
    return engagement;
  }

  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  public AdCommonTrackingUrls buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  public AdCommonTrackingUrls addBuyableButtonItem(String buyableButtonItem) {
    if (this.buyableButton == null) {
      this.buyableButton = ;
    }
    this.buyableButton.add(buyableButtonItem);
    return this;
  }

   /**
   * Get buyableButton
   * @return buyableButton
  **/
  @ApiModelProperty(value = "")
  public List<String> getBuyableButton() {
    return buyableButton;
  }

  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  public AdCommonTrackingUrls audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  public AdCommonTrackingUrls addAudienceVerificationItem(String audienceVerificationItem) {
    if (this.audienceVerification == null) {
      this.audienceVerification = ;
    }
    this.audienceVerification.add(audienceVerificationItem);
    return this;
  }

   /**
   * Get audienceVerification
   * @return audienceVerification
  **/
  @ApiModelProperty(value = "")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }

  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
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

