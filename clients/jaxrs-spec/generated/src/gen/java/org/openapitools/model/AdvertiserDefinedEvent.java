package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionTagTypeOptimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Advertiser defined event
 **/
@ApiModel(description = "Advertiser defined event")
@JsonTypeName("AdvertiserDefinedEvent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEvent   {
  private ConversionTagTypeOptimal mappedConversionType;
  private String name;

  public AdvertiserDefinedEvent() {
  }

  /**
   * Standard type mapped to ADE for optimization
   **/
  public AdvertiserDefinedEvent mappedConversionType(ConversionTagTypeOptimal mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

  
  @ApiModelProperty(example = "SIGNUP", value = "Standard type mapped to ADE for optimization")
  @JsonProperty("mapped_conversion_type")
  public ConversionTagTypeOptimal getMappedConversionType() {
    return mappedConversionType;
  }

  @JsonProperty("mapped_conversion_type")
  public void setMappedConversionType(ConversionTagTypeOptimal mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }

  /**
   * Raw string name of the event, usually logged as raw_event_name in our dataset
   **/
  public AdvertiserDefinedEvent name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "newsletter_signup", value = "Raw string name of the event, usually logged as raw_event_name in our dataset")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
