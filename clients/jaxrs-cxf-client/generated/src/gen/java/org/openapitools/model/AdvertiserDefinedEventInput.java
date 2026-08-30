package org.openapitools.model;

import org.openapitools.model.AdvertiserDefinedEventMappingType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Advertiser defined event input for create/update operations
 */
@ApiModel(description="Advertiser defined event input for create/update operations")

public class AdvertiserDefinedEventInput  {
  
 /**
  * Pinterest standard event type to map this custom event to for campaign optimization and reporting
  */
  @ApiModelProperty(example = "SIGNUP", required = true, value = "Pinterest standard event type to map this custom event to for campaign optimization and reporting")

  private AdvertiserDefinedEventMappingType mappedConversionType;

 /**
  * Raw string name of the event
  */
  @ApiModelProperty(example = "newsletter_signup", required = true, value = "Raw string name of the event")

  private String name;
 /**
   * Pinterest standard event type to map this custom event to for campaign optimization and reporting
   * @return mappedConversionType
  **/
  @JsonProperty("mapped_conversion_type")
  public AdvertiserDefinedEventMappingType getMappedConversionType() {
    return mappedConversionType;
  }

  public void setMappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }

  public AdvertiserDefinedEventInput mappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

 /**
   * Raw string name of the event
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdvertiserDefinedEventInput name(String name) {
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
    AdvertiserDefinedEventInput advertiserDefinedEventInput = (AdvertiserDefinedEventInput) o;
    return Objects.equals(this.mappedConversionType, advertiserDefinedEventInput.mappedConversionType) &&
        Objects.equals(this.name, advertiserDefinedEventInput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappedConversionType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEventInput {\n");
    
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

