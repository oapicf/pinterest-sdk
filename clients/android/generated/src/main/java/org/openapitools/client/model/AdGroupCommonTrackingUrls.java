/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
 * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 **/
@ApiModel(description = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
public class AdGroupCommonTrackingUrls {
  
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
    AdGroupCommonTrackingUrls adGroupCommonTrackingUrls = (AdGroupCommonTrackingUrls) o;
    return (this.impression == null ? adGroupCommonTrackingUrls.impression == null : this.impression.equals(adGroupCommonTrackingUrls.impression)) &&
        (this.click == null ? adGroupCommonTrackingUrls.click == null : this.click.equals(adGroupCommonTrackingUrls.click)) &&
        (this.engagement == null ? adGroupCommonTrackingUrls.engagement == null : this.engagement.equals(adGroupCommonTrackingUrls.engagement)) &&
        (this.buyableButton == null ? adGroupCommonTrackingUrls.buyableButton == null : this.buyableButton.equals(adGroupCommonTrackingUrls.buyableButton)) &&
        (this.audienceVerification == null ? adGroupCommonTrackingUrls.audienceVerification == null : this.audienceVerification.equals(adGroupCommonTrackingUrls.audienceVerification));
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
    sb.append("class AdGroupCommonTrackingUrls {\n");
    
    sb.append("  impression: ").append(impression).append("\n");
    sb.append("  click: ").append(click).append("\n");
    sb.append("  engagement: ").append(engagement).append("\n");
    sb.append("  buyableButton: ").append(buyableButton).append("\n");
    sb.append("  audienceVerification: ").append(audienceVerification).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}