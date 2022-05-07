package apimodels;

import apimodels.ItemProcessingStatus;
import apimodels.ItemValidationEvent;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Object describing an item processing record
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid

  private ItemProcessingStatus status;

  public ItemProcessingRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
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
    if (errors == null) {
      errors = new ArrayList<>();
    }
    errors.add(errorsItem);
    return this;
  }

   /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
  **/
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
    if (warnings == null) {
      warnings = new ArrayList<>();
    }
    warnings.add(warningsItem);
    return this;
  }

   /**
   * Array with the validation warnings for the item processing record
   * @return warnings
  **/
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
  **/
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
    return Objects.equals(itemId, itemProcessingRecord.itemId) &&
        Objects.equals(errors, itemProcessingRecord.errors) &&
        Objects.equals(warnings, itemProcessingRecord.warnings) &&
        Objects.equals(status, itemProcessingRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, errors, warnings, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

