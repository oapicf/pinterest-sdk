package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ConversionTagType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionEventResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionEventResponse {

  private ConversionTagType conversionEvent;

  private String conversionTagId;

  private String adAccountId;

  private Integer createdTime;

  public ConversionEventResponse conversionEvent(ConversionTagType conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  /**
   * Get conversionEvent
   * @return conversionEvent
  */
  @Valid 
  @Schema(name = "conversion_event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_event")
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
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "conversion_tag_id", example = "2614324385652", description = "Id of the tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_tag_id")
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
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549757463328", description = "Id of the ad account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
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
  */
  
  @Schema(name = "created_time", example = "1564768710", description = "Creation date in epoch format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

