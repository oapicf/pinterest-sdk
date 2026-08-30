package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdvertiserDefinedEventMappingType;

/**
 * Advertiser defined event input for create/update operations
 */
@ApiModel(description = "Advertiser defined event input for create/update operations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEventInput   {
  @JsonProperty("mapped_conversion_type")
  private AdvertiserDefinedEventMappingType mappedConversionType;

  @JsonProperty("name")
  private String name;

  public AdvertiserDefinedEventInput mappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

   /**
   * Pinterest standard event type to map this custom event to for campaign optimization and reporting
   * @return mappedConversionType
  **/
  @ApiModelProperty(example = "SIGNUP", required = true, value = "Pinterest standard event type to map this custom event to for campaign optimization and reporting")
  public AdvertiserDefinedEventMappingType getMappedConversionType() {
    return mappedConversionType;
  }

  public void setMappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }

  public AdvertiserDefinedEventInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Raw string name of the event
   * @return name
  **/
  @ApiModelProperty(example = "newsletter_signup", required = true, value = "Raw string name of the event")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

