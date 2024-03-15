package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionTagType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ConversionEventResponse   {
  
  private ConversionTagType conversionEvent;

  private String conversionTagId;

  private String adAccountId;

  private Integer createdTime;

  /**
   **/
  public ConversionEventResponse conversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_event")
  public ConversionTagType getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
  }


  /**
   * Id of the tag.
   **/
  public ConversionEventResponse conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

  
  @ApiModelProperty(example = "2614324385652", value = "Id of the tag.")
  @JsonProperty("conversion_tag_id")
 @Pattern(regexp="^\\d+$")  public String getConversionTagId() {
    return conversionTagId;
  }
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }


  /**
   * Id of the ad account.
   **/
  public ConversionEventResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549757463328", value = "Id of the ad account.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }


  /**
   * Creation date in epoch format.
   **/
  public ConversionEventResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "1564768710", value = "Creation date in epoch format.")
  @JsonProperty("created_time")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

