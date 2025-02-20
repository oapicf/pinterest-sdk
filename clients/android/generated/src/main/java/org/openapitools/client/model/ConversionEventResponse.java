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

import org.openapitools.client.model.ConversionTagType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ConversionEventResponse {
  
  @SerializedName("conversion_event")
  private ConversionTagType conversionEvent = null;
  @SerializedName("conversion_tag_id")
  private String conversionTagId = null;
  @SerializedName("ad_account_id")
  private String adAccountId = null;
  @SerializedName("created_time")
  private Integer createdTime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConversionTagType getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Id of the tag.
   **/
  @ApiModelProperty(value = "Id of the tag.")
  public String getConversionTagId() {
    return conversionTagId;
  }
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  /**
   * Id of the ad account.
   **/
  @ApiModelProperty(value = "Id of the ad account.")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Creation date in epoch format.
   **/
  @ApiModelProperty(value = "Creation date in epoch format.")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventResponse conversionEventResponse = (ConversionEventResponse) o;
    return (this.conversionEvent == null ? conversionEventResponse.conversionEvent == null : this.conversionEvent.equals(conversionEventResponse.conversionEvent)) &&
        (this.conversionTagId == null ? conversionEventResponse.conversionTagId == null : this.conversionTagId.equals(conversionEventResponse.conversionTagId)) &&
        (this.adAccountId == null ? conversionEventResponse.adAccountId == null : this.adAccountId.equals(conversionEventResponse.adAccountId)) &&
        (this.createdTime == null ? conversionEventResponse.createdTime == null : this.createdTime.equals(conversionEventResponse.createdTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.conversionEvent == null ? 0: this.conversionEvent.hashCode());
    result = 31 * result + (this.conversionTagId == null ? 0: this.conversionTagId.hashCode());
    result = 31 * result + (this.adAccountId == null ? 0: this.adAccountId.hashCode());
    result = 31 * result + (this.createdTime == null ? 0: this.createdTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventResponse {\n");
    
    sb.append("  conversionEvent: ").append(conversionEvent).append("\n");
    sb.append("  conversionTagId: ").append(conversionTagId).append("\n");
    sb.append("  adAccountId: ").append(adAccountId).append("\n");
    sb.append("  createdTime: ").append(createdTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
