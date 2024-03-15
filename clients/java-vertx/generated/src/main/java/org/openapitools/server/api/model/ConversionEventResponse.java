package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.ConversionTagType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventResponse   {
  
  private ConversionTagType conversionEvent;
  private String conversionTagId;
  private String adAccountId;
  private Integer createdTime;

  public ConversionEventResponse () {

  }

  public ConversionEventResponse (ConversionTagType conversionEvent, String conversionTagId, String adAccountId, Integer createdTime) {
    this.conversionEvent = conversionEvent;
    this.conversionTagId = conversionTagId;
    this.adAccountId = adAccountId;
    this.createdTime = createdTime;
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

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
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
    return Objects.equals(conversionEvent, conversionEventResponse.conversionEvent) &&
        Objects.equals(conversionTagId, conversionEventResponse.conversionTagId) &&
        Objects.equals(adAccountId, conversionEventResponse.adAccountId) &&
        Objects.equals(createdTime, conversionEventResponse.createdTime);
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
