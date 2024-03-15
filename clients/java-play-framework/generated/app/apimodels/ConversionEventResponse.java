package apimodels;

import apimodels.ConversionTagType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionEventResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventResponse   {
  @JsonProperty("conversion_event")
  @Valid

  private ConversionTagType conversionEvent;

  @JsonProperty("conversion_tag_id")
  @Pattern(regexp="^\\d+$")

  private String conversionTagId;

  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("created_time")
  
  private Integer createdTime;

  public ConversionEventResponse conversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

   /**
   * Get conversionEvent
   * @return conversionEvent
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

