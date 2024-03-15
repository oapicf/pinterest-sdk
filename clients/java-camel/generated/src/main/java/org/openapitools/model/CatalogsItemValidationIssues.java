package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsItemValidationErrors;
import org.openapitools.model.CatalogsItemValidationWarnings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsItemValidationIssues
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsItemValidationIssues {

  private Integer itemNumber;

  private JsonNullable<String> itemId = JsonNullable.<String>undefined();

  private CatalogsItemValidationErrors errors;

  private CatalogsItemValidationWarnings warnings;

  public CatalogsItemValidationIssues() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsItemValidationIssues(Integer itemNumber, String itemId, CatalogsItemValidationErrors errors, CatalogsItemValidationWarnings warnings) {
    this.itemNumber = itemNumber;
    this.itemId = JsonNullable.of(itemId);
    this.errors = errors;
    this.warnings = warnings;
  }

  public CatalogsItemValidationIssues itemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

  /**
   * Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
   * @return itemNumber
  */
  @NotNull 
  @Schema(name = "item_number", example = "0", description = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_number")
  public Integer getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }

  public CatalogsItemValidationIssues itemId(String itemId) {
    this.itemId = JsonNullable.of(itemId);
    return this;
  }

  /**
   * The merchant-created unique ID that represents the product.
   * @return itemId
  */
  @NotNull 
  @Schema(name = "item_id", example = "DS0294-L", description = "The merchant-created unique ID that represents the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public JsonNullable<String> getItemId() {
    return itemId;
  }

  public void setItemId(JsonNullable<String> itemId) {
    this.itemId = itemId;
  }

  public CatalogsItemValidationIssues errors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
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
  */
  @NotNull @Valid 
  @Schema(name = "warnings", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warnings")
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

