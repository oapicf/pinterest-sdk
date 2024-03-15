package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ConversionTagType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionEventResponse  {
  
  @ApiModelProperty(value = "")
  private ConversionTagType conversionEvent;

 /**
  * Id of the tag.
  */
  @ApiModelProperty(example = "2614324385652", value = "Id of the tag.")
  private String conversionTagId;

 /**
  * Id of the ad account.
  */
  @ApiModelProperty(example = "549757463328", value = "Id of the ad account.")
  private String adAccountId;

 /**
  * Creation date in epoch format.
  */
  @ApiModelProperty(example = "1564768710", value = "Creation date in epoch format.")
  private Integer createdTime;
 /**
  * Get conversionEvent
  * @return conversionEvent
  */
  @JsonProperty("conversion_event")
  public ConversionTagType getConversionEvent() {
    return conversionEvent;
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
 public void setConversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
  public ConversionEventResponse conversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

 /**
  * Id of the tag.
  * @return conversionTagId
  */
  @JsonProperty("conversion_tag_id")
 @Pattern(regexp="^\\d+$")  public String getConversionTagId() {
    return conversionTagId;
  }

  /**
   * Sets the <code>conversionTagId</code> property.
   */
 public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  /**
   * Sets the <code>conversionTagId</code> property.
   */
  public ConversionEventResponse conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

 /**
  * Id of the ad account.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public ConversionEventResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Creation date in epoch format.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public ConversionEventResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
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
    ConversionEventResponse conversionEventResponse = (ConversionEventResponse) o;
    return Objects.equals(this.conversionEvent, conversionEventResponse.conversionEvent) &&
        Objects.equals(this.conversionTagId, conversionEventResponse.conversionTagId) &&
        Objects.equals(this.adAccountId, conversionEventResponse.adAccountId) &&
        Objects.equals(this.createdTime, conversionEventResponse.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionEvent, conversionTagId, adAccountId, createdTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventResponse {\n");
    
    sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
    sb.append("    conversionTagId: ").append(toIndentedString(conversionTagId)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

