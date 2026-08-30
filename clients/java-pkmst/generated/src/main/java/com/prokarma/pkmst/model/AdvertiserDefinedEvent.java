package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ConversionTagTypeOptimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Advertiser defined event
 */
@ApiModel(description = "Advertiser defined event")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEvent   {
  @JsonProperty("mapped_conversion_type")
  private ConversionTagTypeOptimal mappedConversionType;

  @JsonProperty("name")
  private String name;

  public AdvertiserDefinedEvent mappedConversionType(ConversionTagTypeOptimal mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

  /**
   * Standard type mapped to ADE for optimization
   * @return mappedConversionType
   */
  @ApiModelProperty(example = "SIGNUP", value = "Standard type mapped to ADE for optimization")
  public ConversionTagTypeOptimal getMappedConversionType() {
    return mappedConversionType;
  }

  public void setMappedConversionType(ConversionTagTypeOptimal mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }

  public AdvertiserDefinedEvent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Raw string name of the event, usually logged as raw_event_name in our dataset
   * @return name
   */
  @ApiModelProperty(example = "newsletter_signup", value = "Raw string name of the event, usually logged as raw_event_name in our dataset")
  public String getName() {
    return name;
  }

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

