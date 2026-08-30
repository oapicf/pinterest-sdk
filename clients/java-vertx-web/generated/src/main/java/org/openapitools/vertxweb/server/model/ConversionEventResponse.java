package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ConversionTagType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventResponse   {
  
  private String adAccountId;
  private ConversionTagType conversionEvent;
  private String conversionTagId;
  private Integer createdTime;
  private String reportingConversionEvent;

  public ConversionEventResponse () {

  }

  public ConversionEventResponse (String adAccountId, ConversionTagType conversionEvent, String conversionTagId, Integer createdTime, String reportingConversionEvent) {
    this.adAccountId = adAccountId;
    this.conversionEvent = conversionEvent;
    this.conversionTagId = conversionTagId;
    this.createdTime = createdTime;
    this.reportingConversionEvent = reportingConversionEvent;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("conversion_event")
  public ConversionTagType getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

    
  @JsonProperty("conversion_tag_id")
  public String getConversionTagId() {
    return conversionTagId;
  }
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("reporting_conversion_event")
  public String getReportingConversionEvent() {
    return reportingConversionEvent;
  }
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
    return Objects.equals(adAccountId, conversionEventResponse.adAccountId) &&
        Objects.equals(conversionEvent, conversionEventResponse.conversionEvent) &&
        Objects.equals(conversionTagId, conversionEventResponse.conversionTagId) &&
        Objects.equals(createdTime, conversionEventResponse.createdTime) &&
        Objects.equals(reportingConversionEvent, conversionEventResponse.reportingConversionEvent);
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
