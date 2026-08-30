package apimodels;

import apimodels.AdvertiserDefinedEventMappingType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Advertiser defined event input for create/update operations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvertiserDefinedEventInput   {
  @JsonProperty("mapped_conversion_type")
  @NotNull
@Valid

  private AdvertiserDefinedEventMappingType mappedConversionType;

  @JsonProperty("name")
  @NotNull

  private String name;

  public AdvertiserDefinedEventInput mappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

   /**
   * Pinterest standard event type to map this custom event to for campaign optimization and reporting
   * @return mappedConversionType
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

