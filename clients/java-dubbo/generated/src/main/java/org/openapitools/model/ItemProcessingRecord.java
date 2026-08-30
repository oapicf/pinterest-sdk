package org.openapitools.model;

import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing an item processing record
 */
public class ItemProcessingRecord implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   */
  @JsonProperty("errors")
  private List<ItemValidationEvent> errors = new ArrayList<>();

  /**
   * The catalog item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("status")
  private ItemProcessingStatus status;

  /**
   * Array with the validation warnings for the item processing record
   */
  @JsonProperty("warnings")
  private List<ItemValidationEvent> warnings = new ArrayList<>();

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
   */
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * 
   * @return status
   */
  public ItemProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(ItemProcessingStatus status) {
    this.status = status;
  }

  /**
   * Array with the validation warnings for the item processing record
   * @return warnings
   */
  public List<ItemValidationEvent> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ItemValidationEvent> warnings) {
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
    ItemProcessingRecord itemProcessingRecord = (ItemProcessingRecord) o;
    return Objects.equals(this.errors, itemProcessingRecord.errors) &&
        Objects.equals(this.itemId, itemProcessingRecord.itemId) &&
        Objects.equals(this.status, itemProcessingRecord.status) &&
        Objects.equals(this.warnings, itemProcessingRecord.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, itemId, status, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemProcessingRecord {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
