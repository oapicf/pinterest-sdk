package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.SupplementalItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result model for local inventory operation
 */
@ApiModel(description="Result model for local inventory operation")

public class LocalInventoryOperationResult  {
  
 /**
  * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  */
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @Valid
  private List<@Valid SupplementalItemValidationEvent> errors = new ArrayList<>();

 /**
  * Catalog item id in the merchant namespace
  */
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  private String itemId;

 /**
  * Status of the item processing record
  */
  @ApiModelProperty(required = true, value = "Status of the item processing record")
  @Valid
  private SupplementalItemProcessingStatus status;

 /**
  * Store code for the local inventory item
  */
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
  private String storeCode;

public enum SupplementalTypeEnum {

    @JsonProperty("LOCAL_INVENTORY") LOCAL_INVENTORY(String.valueOf("LOCAL_INVENTORY"));

    private String value;

    SupplementalTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SupplementalTypeEnum fromValue(String value) {
        for (SupplementalTypeEnum b : SupplementalTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private SupplementalTypeEnum supplementalType;

 /**
  * Array with the validation warnings for the item processing record
  */
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @Valid
  private List<@Valid SupplementalItemValidationEvent> warnings = new ArrayList<>();
 /**
  * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid SupplementalItemValidationEvent> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public LocalInventoryOperationResult errors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public LocalInventoryOperationResult addErrorsItem(SupplementalItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Catalog item id in the merchant namespace
  * @return itemId
  */
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public LocalInventoryOperationResult itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
  * Status of the item processing record
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public SupplementalItemProcessingStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(SupplementalItemProcessingStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public LocalInventoryOperationResult status(SupplementalItemProcessingStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Store code for the local inventory item
  * @return storeCode
  */
  @JsonProperty("store_code")
  @NotNull
  public String getStoreCode() {
    return storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
 public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
  public LocalInventoryOperationResult storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

 /**
  * Get supplementalType
  * @return supplementalType
  */
  @JsonProperty("supplemental_type")
  @NotNull
  public String getSupplementalType() {
    return supplementalType == null ? null : supplementalType.value();
  }

  /**
   * Sets the <code>supplementalType</code> property.
   */
 public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }

  /**
   * Sets the <code>supplementalType</code> property.
   */
  public LocalInventoryOperationResult supplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
    return this;
  }

 /**
  * Array with the validation warnings for the item processing record
  * @return warnings
  */
  @JsonProperty("warnings")
  public List<@Valid SupplementalItemValidationEvent> getWarnings() {
    return warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
 public void setWarnings(List<@Valid SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
  public LocalInventoryOperationResult warnings(List<@Valid SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Adds a new item to the <code>warnings</code> list.
   */
  public LocalInventoryOperationResult addWarningsItem(SupplementalItemValidationEvent warningsItem) {
    this.warnings.add(warningsItem);
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
    LocalInventoryOperationResult localInventoryOperationResult = (LocalInventoryOperationResult) o;
    return Objects.equals(this.errors, localInventoryOperationResult.errors) &&
        Objects.equals(this.itemId, localInventoryOperationResult.itemId) &&
        Objects.equals(this.status, localInventoryOperationResult.status) &&
        Objects.equals(this.storeCode, localInventoryOperationResult.storeCode) &&
        Objects.equals(this.supplementalType, localInventoryOperationResult.supplementalType) &&
        Objects.equals(this.warnings, localInventoryOperationResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, itemId, status, storeCode, supplementalType, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryOperationResult {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
    sb.append("    supplementalType: ").append(toIndentedString(supplementalType)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

