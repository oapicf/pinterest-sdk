package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.NullableCatalogsItemFieldType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemValidationDetails   {
  
  private NullableCatalogsItemFieldType attributeName;
  private String providedValue;

  public CatalogsItemValidationDetails () {

  }

  public CatalogsItemValidationDetails (NullableCatalogsItemFieldType attributeName, String providedValue) {
    this.attributeName = attributeName;
    this.providedValue = providedValue;
  }

    
  @JsonProperty("attribute_name")
  public NullableCatalogsItemFieldType getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
  }

    
  @JsonProperty("provided_value")
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
    return Objects.equals(attributeName, catalogsItemValidationDetails.attributeName) &&
        Objects.equals(providedValue, catalogsItemValidationDetails.providedValue);
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
