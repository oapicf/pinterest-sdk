package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NullableCatalogsItemFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsItemValidationDetails   {
  
  private NullableCatalogsItemFieldType attributeName;

  private String providedValue;

  /**
   **/
  public CatalogsItemValidationDetails attributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attribute_name")
  @NotNull
  public NullableCatalogsItemFieldType getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
  }


  /**
   * Provided value that caused the validation issue.
   **/
  public CatalogsItemValidationDetails providedValue(String providedValue) {
    this.providedValue = providedValue;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Provided value that caused the validation issue.")
  @JsonProperty("provided_value")
  @NotNull
  public String getProvidedValue() {
    return providedValue;
  }
  public void setProvidedValue(String providedValue) {
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

