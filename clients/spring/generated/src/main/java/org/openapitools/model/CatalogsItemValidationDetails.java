package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NullableCatalogsItemFieldType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsItemValidationDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsItemValidationDetails {

  private JsonNullable<NullableCatalogsItemFieldType> attributeName = JsonNullable.<NullableCatalogsItemFieldType>undefined();

  private JsonNullable<String> providedValue = JsonNullable.<String>undefined();

  public CatalogsItemValidationDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsItemValidationDetails(NullableCatalogsItemFieldType attributeName, String providedValue) {
    this.attributeName = JsonNullable.of(attributeName);
    this.providedValue = JsonNullable.of(providedValue);
  }

  public CatalogsItemValidationDetails attributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = JsonNullable.of(attributeName);
    return this;
  }

  /**
   * Get attributeName
   * @return attributeName
   */
  @NotNull @Valid 
  @Schema(name = "attribute_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute_name")
  public JsonNullable<NullableCatalogsItemFieldType> getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(JsonNullable<NullableCatalogsItemFieldType> attributeName) {
    this.attributeName = attributeName;
  }

  public CatalogsItemValidationDetails providedValue(String providedValue) {
    this.providedValue = JsonNullable.of(providedValue);
    return this;
  }

  /**
   * Provided value that caused the validation issue.
   * @return providedValue
   */
  @NotNull 
  @Schema(name = "provided_value", description = "Provided value that caused the validation issue.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("provided_value")
  public JsonNullable<String> getProvidedValue() {
    return providedValue;
  }

  public void setProvidedValue(JsonNullable<String> providedValue) {
    this.providedValue = providedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemValidationDetails catalogsItemValidationDetails = (CatalogsItemValidationDetails) o;
    return Objects.equals(this.attributeName, catalogsItemValidationDetails.attributeName) &&
        Objects.equals(this.providedValue, catalogsItemValidationDetails.providedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, providedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationDetails {\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    providedValue: ").append(toIndentedString(providedValue)).append("\n");
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

