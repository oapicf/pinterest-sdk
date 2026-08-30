package apimodels;

import apimodels.CatalogsItemValidationErrors;
import apimodels.CatalogsItemValidationWarnings;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsItemValidationIssues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsItemValidationIssues   {
  @JsonProperty("errors")
  @NotNull
@Valid

  private CatalogsItemValidationErrors errors;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("item_number")
  @NotNull

  private Integer itemNumber;

  @JsonProperty("warnings")
  @NotNull
@Valid

  private CatalogsItemValidationWarnings warnings;

  public CatalogsItemValidationIssues errors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  public CatalogsItemValidationErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
  }

  public CatalogsItemValidationIssues itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The merchant-created unique ID that represents the product.
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsItemValidationIssues itemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
   * @return itemNumber
  **/
  public Integer getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }

  public CatalogsItemValidationIssues warnings(CatalogsItemValidationWarnings warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  public CatalogsItemValidationWarnings getWarnings() {
    return warnings;
  }

  public void setWarnings(CatalogsItemValidationWarnings warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemValidationIssues catalogsItemValidationIssues = (CatalogsItemValidationIssues) o;
    return Objects.equals(errors, catalogsItemValidationIssues.errors) &&
        Objects.equals(itemId, catalogsItemValidationIssues.itemId) &&
        Objects.equals(itemNumber, catalogsItemValidationIssues.itemNumber) &&
        Objects.equals(warnings, catalogsItemValidationIssues.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, itemId, itemNumber, warnings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationIssues {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

