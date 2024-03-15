package apimodels;

import apimodels.NullableCatalogsItemFieldType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsItemValidationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsItemValidationDetails   {
  @JsonProperty("attribute_name")
  @NotNull
@Valid

  private NullableCatalogsItemFieldType attributeName;

  @JsonProperty("provided_value")
  @NotNull

  private String providedValue;

  public CatalogsItemValidationDetails attributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Get attributeName
   * @return attributeName
  **/
  public NullableCatalogsItemFieldType getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(NullableCatalogsItemFieldType attributeName) {
    this.attributeName = attributeName;
  }

  public CatalogsItemValidationDetails providedValue(String providedValue) {
    this.providedValue = providedValue;
    return this;
  }

   /**
   * Provided value that caused the validation issue.
   * @return providedValue
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

