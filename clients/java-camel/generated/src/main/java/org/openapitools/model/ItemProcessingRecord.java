package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ItemProcessingRecord {

  private String itemId;

  @Valid
  private List<@Valid ItemValidationEvent> errors;

  @Valid
  private List<@Valid ItemValidationEvent> warnings;

  private ItemProcessingStatus status;

  public ItemProcessingRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
  */
  
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog item id in the merchant namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemProcessingRecord errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public ItemProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", description = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public ItemProcessingRecord warnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ItemProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Array with the validation warnings for the item processing record
   * @return warnings
  */
  @Valid 
  @Schema(name = "warnings", description = "Array with the validation warnings for the item processing record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public List<@Valid ItemValidationEvent> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid ItemValidationEvent> warnings) {
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
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
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

