package apimodels;

import apimodels.ConversionTagTypeOptimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Advertiser defined event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvertiserDefinedEvent   {
  @JsonProperty("mapped_conversion_type")
  @Valid

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
  **/
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
  **/
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
    return Objects.equals(mappedConversionType, advertiserDefinedEvent.mappedConversionType) &&
        Objects.equals(name, advertiserDefinedEvent.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappedConversionType, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

