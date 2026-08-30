package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdvertiserDefinedEventMappingType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Advertiser defined event input for create/update operations
 */

@Schema(name = "AdvertiserDefinedEventInput", description = "Advertiser defined event input for create/update operations")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEventInput {

  private AdvertiserDefinedEventMappingType mappedConversionType;

  private String name;

  public AdvertiserDefinedEventInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvertiserDefinedEventInput(AdvertiserDefinedEventMappingType mappedConversionType, String name) {
    this.mappedConversionType = mappedConversionType;
    this.name = name;
  }

  public AdvertiserDefinedEventInput mappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

  /**
   * Pinterest standard event type to map this custom event to for campaign optimization and reporting
   * @return mappedConversionType
   */
  @NotNull @Valid 
  @Schema(name = "mapped_conversion_type", example = "SIGNUP", description = "Pinterest standard event type to map this custom event to for campaign optimization and reporting", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mapped_conversion_type")
  public AdvertiserDefinedEventMappingType getMappedConversionType() {
    return mappedConversionType;
  }

  @JsonProperty("mapped_conversion_type")
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
   */
  @NotNull 
  @Schema(name = "name", example = "newsletter_signup", description = "Raw string name of the event", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

