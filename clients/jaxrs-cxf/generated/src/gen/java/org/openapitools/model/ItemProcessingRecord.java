package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing an item processing record
 **/
@ApiModel(description="Object describing an item processing record")
public class ItemProcessingRecord  {
  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")
 /**
   * The catalog item id in the merchant namespace
  **/
  private String itemId;

  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @Valid
 /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  **/
  private List<ItemValidationEvent> errors = null;

  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @Valid
 /**
   * Array with the validation warnings for the item processing record
  **/
  private List<ItemValidationEvent> warnings = null;

  @ApiModelProperty(value = "")
  @Valid
  private ItemProcessingStatus status;
 /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemProcessingRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public ItemProcessingRecord errors(List<ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public ItemProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Array with the validation warnings for the item processing record
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<ItemValidationEvent> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public ItemProcessingRecord warnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ItemProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ItemProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(ItemProcessingStatus status) {
    this.status = status;
  }

  public ItemProcessingRecord status(ItemProcessingStatus status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

