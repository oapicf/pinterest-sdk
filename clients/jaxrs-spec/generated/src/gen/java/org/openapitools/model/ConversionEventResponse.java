package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionTagType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ConversionEventResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventResponse   {
  private String adAccountId;
  private ConversionTagType conversionEvent;
  private String conversionTagId;
  private Integer createdTime;
  private String reportingConversionEvent;

  public ConversionEventResponse() {
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
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

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

  @JsonProperty("conversion_event")
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
   @Pattern(regexp="^\\d+$")public String getConversionTagId() {
    return conversionTagId;
  }

  @JsonProperty("conversion_tag_id")
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
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

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * For advertiser-defined events, the reporting event label shown in optimization UIs.
   **/
  public ConversionEventResponse reportingConversionEvent(String reportingConversionEvent) {
    this.reportingConversionEvent = reportingConversionEvent;
    return this;
  }

  
  @ApiModelProperty(example = "GET_QUOTE", value = "For advertiser-defined events, the reporting event label shown in optimization UIs.")
  @JsonProperty("reporting_conversion_event")
  public String getReportingConversionEvent() {
    return reportingConversionEvent;
  }

  @JsonProperty("reporting_conversion_event")
  public void setReportingConversionEvent(String reportingConversionEvent) {
    this.reportingConversionEvent = reportingConversionEvent;
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
    return Objects.equals(this.adAccountId, conversionEventResponse.adAccountId) &&
        Objects.equals(this.conversionEvent, conversionEventResponse.conversionEvent) &&
        Objects.equals(this.conversionTagId, conversionEventResponse.conversionTagId) &&
        Objects.equals(this.createdTime, conversionEventResponse.createdTime) &&
        Objects.equals(this.reportingConversionEvent, conversionEventResponse.reportingConversionEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, conversionEvent, conversionTagId, createdTime, reportingConversionEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventResponse {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
    sb.append("    conversionTagId: ").append(toIndentedString(conversionTagId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    reportingConversionEvent: ").append(toIndentedString(reportingConversionEvent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
