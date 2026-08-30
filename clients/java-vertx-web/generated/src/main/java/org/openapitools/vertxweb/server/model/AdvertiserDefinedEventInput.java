package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventMappingType;

/**
 * Advertiser defined event input for create/update operations
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertiserDefinedEventInput   {
  
  private AdvertiserDefinedEventMappingType mappedConversionType;
  private String name;

  public AdvertiserDefinedEventInput () {

  }

  public AdvertiserDefinedEventInput (AdvertiserDefinedEventMappingType mappedConversionType, String name) {
    this.mappedConversionType = mappedConversionType;
    this.name = name;
  }

    
  @JsonProperty("mapped_conversion_type")
  public AdvertiserDefinedEventMappingType getMappedConversionType() {
    return mappedConversionType;
  }
  public void setMappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }

    
  @JsonProperty("name")
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
    return Objects.equals(mappedConversionType, advertiserDefinedEventInput.mappedConversionType) &&
        Objects.equals(name, advertiserDefinedEventInput.name);
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
