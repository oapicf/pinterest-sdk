package org.openapitools.model;

import org.openapitools.model.ConversionTagType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ConversionEventResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Id of the ad account.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("conversion_event")
  private ConversionTagType conversionEvent;

  /**
   * Id of the tag.
   */
  @JsonProperty("conversion_tag_id")
  private String conversionTagId;

  /**
   * Creation date in epoch format.
   */
  @JsonProperty("created_time")
  private Integer createdTime;

  /**
   * For advertiser-defined events, the reporting event label shown in optimization UIs.
   */
  @JsonProperty("reporting_conversion_event")
  private String reportingConversionEvent;

  /**
   * Id of the ad account.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * 
   * @return conversionEvent
   */
  public ConversionTagType getConversionEvent() {
    return conversionEvent;
  }

  public void setConversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Id of the tag.
   * @return conversionTagId
   */
  public String getConversionTagId() {
    return conversionTagId;
  }

  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  /**
   * Creation date in epoch format.
   * @return createdTime
   */
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * For advertiser-defined events, the reporting event label shown in optimization UIs.
   * @return reportingConversionEvent
   */
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
