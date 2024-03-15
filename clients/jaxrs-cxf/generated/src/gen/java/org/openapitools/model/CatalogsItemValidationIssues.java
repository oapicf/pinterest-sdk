package org.openapitools.model;

import org.openapitools.model.CatalogsItemValidationErrors;
import org.openapitools.model.CatalogsItemValidationWarnings;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsItemValidationIssues  {
  
  @ApiModelProperty(example = "0", required = true, value = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.")
 /**
   * Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  **/
  private Integer itemNumber;

  @ApiModelProperty(example = "DS0294-L", required = true, value = "The merchant-created unique ID that represents the product.")
 /**
   * The merchant-created unique ID that represents the product.
  **/
  private String itemId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsItemValidationErrors errors;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsItemValidationWarnings warnings;
 /**
   * Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.
   * @return itemNumber
  **/
  @JsonProperty("item_number")
  @NotNull
  public Integer getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }

  public CatalogsItemValidationIssues itemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

 /**
   * The merchant-created unique ID that represents the product.
   * @return itemId
  **/
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsItemValidationIssues itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get errors
   * @return errors
  **/
  @JsonProperty("errors")
  @NotNull
  public CatalogsItemValidationErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
  }

  public CatalogsItemValidationIssues errors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
    return this;
  }

 /**
   * Get warnings
   * @return warnings
  **/
  @JsonProperty("warnings")
  @NotNull
  public CatalogsItemValidationWarnings getWarnings() {
    return warnings;
  }

  public void setWarnings(CatalogsItemValidationWarnings warnings) {
    this.warnings = warnings;
  }

  public CatalogsItemValidationIssues warnings(CatalogsItemValidationWarnings warnings) {
    this.warnings = warnings;
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
    CatalogsItemValidationIssues catalogsItemValidationIssues = (CatalogsItemValidationIssues) o;
    return Objects.equals(this.itemNumber, catalogsItemValidationIssues.itemNumber) &&
        Objects.equals(this.itemId, catalogsItemValidationIssues.itemId) &&
        Objects.equals(this.errors, catalogsItemValidationIssues.errors) &&
        Objects.equals(this.warnings, catalogsItemValidationIssues.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemNumber, itemId, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationIssues {\n");
    
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

