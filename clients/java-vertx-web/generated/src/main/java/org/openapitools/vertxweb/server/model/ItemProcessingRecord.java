package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ItemProcessingStatus;
import org.openapitools.vertxweb.server.model.ItemValidationEvent;

/**
 * Object describing an item processing record
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemProcessingRecord   {
  
  private List<ItemValidationEvent> errors = new ArrayList<>();
  private String itemId;
  private ItemProcessingStatus status;
  private List<ItemValidationEvent> warnings = new ArrayList<>();

  public ItemProcessingRecord () {

  }

  public ItemProcessingRecord (List<ItemValidationEvent> errors, String itemId, ItemProcessingStatus status, List<ItemValidationEvent> warnings) {
    this.errors = errors;
    this.itemId = itemId;
    this.status = status;
    this.warnings = warnings;
  }

    
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("status")
  public ItemProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(ItemProcessingStatus status) {
    this.status = status;
  }

    
  @JsonProperty("warnings")
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
    return Objects.equals(errors, itemProcessingRecord.errors) &&
        Objects.equals(itemId, itemProcessingRecord.itemId) &&
        Objects.equals(status, itemProcessingRecord.status) &&
        Objects.equals(warnings, itemProcessingRecord.warnings);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
