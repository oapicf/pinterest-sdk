package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NullableCatalogsItemFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsItemValidationDetails  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private NullableCatalogsItemFieldType attributeName;

  @ApiModelProperty(required = true, value = "Provided value that caused the validation issue.")
 /**
   * Provided value that caused the validation issue.
  **/
  private String providedValue;
 /**
   * Get attributeName
   * @return attributeName
  **/
  @JsonProperty("attribute_name")
  @NotNull
  public NullableCatalogsItemFieldType getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
  }

  public CatalogsItemValidationDetails attributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
    return this;
  }

 /**
   * Provided value that caused the validation issue.
   * @return providedValue
  **/
  @JsonProperty("provided_value")
  @NotNull
  public String getProvidedValue() {
    return providedValue;
  }

  public void setProvidedValue(String providedValue) {
    this.providedValue = providedValue;
  }

  public CatalogsItemValidationDetails providedValue(String providedValue) {
    this.providedValue = providedValue;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

