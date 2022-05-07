package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object describing an item processing record
 **/
@ApiModel(description = "Object describing an item processing record")
@JsonTypeName("ItemProcessingRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class ItemProcessingRecord   {
  
  private @Valid String itemId;
  private @Valid List<ItemValidationEvent> errors = new ArrayList<ItemValidationEvent>();
  private @Valid List<ItemValidationEvent> warnings = new ArrayList<ItemValidationEvent>();
  private @Valid ItemProcessingStatus status;

  /**
   * The catalog item id in the merchant namespace
   **/
  public ItemProcessingRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  @JsonProperty("item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

/**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  public ItemProcessingRecord errors(List<ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  

  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public ItemProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ItemValidationEvent>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public ItemProcessingRecord removeErrorsItem(ItemValidationEvent errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
/**
   * Array with the validation warnings for the item processing record
   **/
  public ItemProcessingRecord warnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  

  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
  public List<ItemValidationEvent> getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
  public void setWarnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public ItemProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<ItemValidationEvent>();
    }

    this.warnings.add(warningsItem);
    return this;
  }

  public ItemProcessingRecord removeWarningsItem(ItemValidationEvent warningsItem) {
    if (warningsItem != null && this.warnings != null) {
      this.warnings.remove(warningsItem);
    }

    return this;
  }
/**
   **/
  public ItemProcessingRecord status(ItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ItemProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
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

