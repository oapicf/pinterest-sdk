/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionTagType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ConversionEventResponse
 */
@JsonPropertyOrder({
  ConversionEventResponse.JSON_PROPERTY_CONVERSION_EVENT,
  ConversionEventResponse.JSON_PROPERTY_CONVERSION_TAG_ID,
  ConversionEventResponse.JSON_PROPERTY_AD_ACCOUNT_ID,
  ConversionEventResponse.JSON_PROPERTY_CREATED_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionEventResponse   {
  public static final String JSON_PROPERTY_CONVERSION_EVENT = "conversion_event";
  @JsonProperty(JSON_PROPERTY_CONVERSION_EVENT)
  private ConversionTagType conversionEvent;

  public static final String JSON_PROPERTY_CONVERSION_TAG_ID = "conversion_tag_id";
  @JsonProperty(JSON_PROPERTY_CONVERSION_TAG_ID)
  private String conversionTagId;

  public static final String JSON_PROPERTY_AD_ACCOUNT_ID = "ad_account_id";
  @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
  private String adAccountId;

  public static final String JSON_PROPERTY_CREATED_TIME = "created_time";
  @JsonProperty(JSON_PROPERTY_CREATED_TIME)
  private Integer createdTime;

  public ConversionEventResponse conversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  /**
   * Get conversionEvent
   * @return conversionEvent
   **/
  @JsonProperty(value = "conversion_event")
  @ApiModelProperty(value = "")
  
  public ConversionTagType getConversionEvent() {
    return conversionEvent;
  }

  public void setConversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  public ConversionEventResponse conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

  /**
   * Id of the tag.
   * @return conversionTagId
   **/
  @JsonProperty(value = "conversion_tag_id")
  @ApiModelProperty(example = "2614324385652", value = "Id of the tag.")
   @Pattern(regexp="^\\d+$")
  public String getConversionTagId() {
    return conversionTagId;
  }

  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  public ConversionEventResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Id of the ad account.
   * @return adAccountId
   **/
  @JsonProperty(value = "ad_account_id")
  @ApiModelProperty(example = "549757463328", value = "Id of the ad account.")
   @Pattern(regexp="^\\d+$")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public ConversionEventResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Creation date in epoch format.
   * @return createdTime
   **/
  @JsonProperty(value = "created_time")
  @ApiModelProperty(example = "1564768710", value = "Creation date in epoch format.")
  
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
