package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NullableCatalogsItemFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsItemValidationDetails   {
  
  private NullableCatalogsItemFieldType attributeName;
  private String providedValue;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attribute_name")
  @NotNull
  @Valid
  public NullableCatalogsItemFieldType getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
  }

  /**
   * Provided value that caused the validation issue.
   **/
  
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

