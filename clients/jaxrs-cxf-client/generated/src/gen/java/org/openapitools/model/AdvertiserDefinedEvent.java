package org.openapitools.model;

import org.openapitools.model.ConversionTagTypeOptimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Advertiser defined event
 */
@ApiModel(description="Advertiser defined event")

public class AdvertiserDefinedEvent  {
  
 /**
  * Standard type mapped to ADE for optimization
  */
  @ApiModelProperty(example = "SIGNUP", value = "Standard type mapped to ADE for optimization")

  private ConversionTagTypeOptimal mappedConversionType;

 /**
  * Raw string name of the event, usually logged as raw_event_name in our dataset
  */
  @ApiModelProperty(example = "newsletter_signup", value = "Raw string name of the event, usually logged as raw_event_name in our dataset")

  private String name;
 /**
   * Standard type mapped to ADE for optimization
   * @return mappedConversionType
  **/
  @JsonProperty("mapped_conversion_type")
  public ConversionTagTypeOptimal getMappedConversionType() {
    return mappedConversionType;
  }

  public void setMappedConversionType(ConversionTagTypeOptimal mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }

  public AdvertiserDefinedEvent mappedConversionType(ConversionTagTypeOptimal mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

 /**
   * Raw string name of the event, usually logged as raw_event_name in our dataset
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdvertiserDefinedEvent name(String name) {
    this.name = name;
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
    AdvertiserDefinedEvent advertiserDefinedEvent = (AdvertiserDefinedEvent) o;
    return Objects.equals(this.mappedConversionType, advertiserDefinedEvent.mappedConversionType) &&
        Objects.equals(this.name, advertiserDefinedEvent.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappedConversionType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEvent {\n");
    
    sb.append("    mappedConversionType: ").append(toIndentedString(mappedConversionType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

