/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 **/
@ApiModel(description = "Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
public class TrackingUrls {
  
  @SerializedName("impression")
  private List<String> impression = null;
  @SerializedName("click")
  private List<String> click = null;
  @SerializedName("engagement")
  private List<String> engagement = null;
  @SerializedName("buyable_button")
  private List<String> buyableButton = null;
  @SerializedName("audience_verification")
  private List<String> audienceVerification = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getImpression() {
    return impression;
  }
  public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getClick() {
    return click;
  }
  public void setClick(List<String> click) {
    this.click = click;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getEngagement() {
    return engagement;
  }
  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getBuyableButton() {
    return buyableButton;
  }
  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  /**
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
    TrackingUrls trackingUrls = (TrackingUrls) o;
    return (this.impression == null ? trackingUrls.impression == null : this.impression.equals(trackingUrls.impression)) &&
        (this.click == null ? trackingUrls.click == null : this.click.equals(trackingUrls.click)) &&
        (this.engagement == null ? trackingUrls.engagement == null : this.engagement.equals(trackingUrls.engagement)) &&
        (this.buyableButton == null ? trackingUrls.buyableButton == null : this.buyableButton.equals(trackingUrls.buyableButton)) &&
        (this.audienceVerification == null ? trackingUrls.audienceVerification == null : this.audienceVerification.equals(trackingUrls.audienceVerification));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.impression == null ? 0: this.impression.hashCode());
    result = 31 * result + (this.click == null ? 0: this.click.hashCode());
    result = 31 * result + (this.engagement == null ? 0: this.engagement.hashCode());
    result = 31 * result + (this.buyableButton == null ? 0: this.buyableButton.hashCode());
    result = 31 * result + (this.audienceVerification == null ? 0: this.audienceVerification.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingUrls {\n");
    
    sb.append("  impression: ").append(impression).append("\n");
    sb.append("  click: ").append(click).append("\n");
    sb.append("  engagement: ").append(engagement).append("\n");
    sb.append("  buyableButton: ").append(buyableButton).append("\n");
    sb.append("  audienceVerification: ").append(audienceVerification).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
