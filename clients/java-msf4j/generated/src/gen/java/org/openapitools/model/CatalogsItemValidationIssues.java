package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsItemValidationErrors;
import org.openapitools.model.CatalogsItemValidationWarnings;

/**
 * CatalogsItemValidationIssues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsItemValidationIssues   {
  @JsonProperty("item_number")
  private Integer itemNumber;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("errors")
  private CatalogsItemValidationErrors errors;

  @JsonProperty("warnings")
  private CatalogsItemValidationWarnings warnings;

  public CatalogsItemValidationIssues itemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
   * @return itemNumber
  **/
  @ApiModelProperty(example = "0", required = true, value = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.")
  public Integer getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }

  public CatalogsItemValidationIssues itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The merchant-created unique ID that represents the product.
   * @return itemId
  **/
  @ApiModelProperty(example = "DS0294-L", required = true, value = "The merchant-created unique ID that represents the product.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsItemValidationIssues errors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsItemValidationErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
  }

  public CatalogsItemValidationIssues warnings(CatalogsItemValidationWarnings warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

