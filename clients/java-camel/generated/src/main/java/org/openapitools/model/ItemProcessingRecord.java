package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing an item processing record
 */

@Schema(name = "ItemProcessingRecord", description = "Object describing an item processing record")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-08T00:32:37.756477Z[Etc/UTC]")
public class ItemProcessingRecord   {

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("errors")
  @Valid
  private List<ItemValidationEvent> errors = null;

  @JsonProperty("warnings")
  @Valid
  private List<ItemValidationEvent> warnings = null;

  @JsonProperty("status")
  private ItemProcessingStatus status;

  public ItemProcessingRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
  */
  
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog item id in the merchant namespace", required = false)
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemProcessingRecord errors(List<ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public ItemProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ItemValidationEvent>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", description = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.", required = false)
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public ItemProcessingRecord warnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ItemProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<ItemValidationEvent>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Array with the validation warnings for the item processing record
   * @return warnings
  */
  @Valid 
  @Schema(name = "warnings", description = "Array with the validation warnings for the item processing record", required = false)
  public List<ItemValidationEvent> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public ItemProcessingRecord status(ItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public ItemProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(ItemProcessingStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemProcessingRecord itemProcessingRecord = (ItemProcessingRecord) o;
    return Objects.equals(this.itemId, itemProcessingRecord.itemId) &&
        Objects.equals(this.errors, itemProcessingRecord.errors) &&
        Objects.equals(this.warnings, itemProcessingRecord.warnings) &&
        Objects.equals(this.status, itemProcessingRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, errors, warnings, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemProcessingRecord {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

