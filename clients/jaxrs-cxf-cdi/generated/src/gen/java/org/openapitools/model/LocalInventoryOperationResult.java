package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.SupplementalItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Result model for local inventory operation
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Result model for local inventory operation")
public class LocalInventoryOperationResult   {
  
  private List<@Valid SupplementalItemValidationEvent> errors = new ArrayList<>();

  private String itemId;

  private SupplementalItemProcessingStatus status;

  private String storeCode;


public enum SupplementalTypeEnum {

    @JsonProperty("LOCAL_INVENTORY") LOCAL_INVENTORY(String.valueOf("LOCAL_INVENTORY"));


    private String value;

    SupplementalTypeEnum(String v) {
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

  private SupplementalTypeEnum supplementalType;

  private List<@Valid SupplementalItemValidationEvent> warnings = new ArrayList<>();

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  public LocalInventoryOperationResult errors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  public List<@Valid SupplementalItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  public LocalInventoryOperationResult addErrorsItem(SupplementalItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * Catalog item id in the merchant namespace
   **/
  public LocalInventoryOperationResult itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  /**
   * Status of the item processing record
   **/
  public LocalInventoryOperationResult status(SupplementalItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status of the item processing record")
  @JsonProperty("status")
  @NotNull
  public SupplementalItemProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(SupplementalItemProcessingStatus status) {
    this.status = status;
  }


  /**
   * Store code for the local inventory item
   **/
  public LocalInventoryOperationResult storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
  @JsonProperty("store_code")
  @NotNull
  public String getStoreCode() {
    return storeCode;
  }
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }


  /**
   **/
  public LocalInventoryOperationResult supplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("supplemental_type")
  @NotNull
  public SupplementalTypeEnum getSupplementalType() {
    return supplementalType;
  }
  public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }


  /**
   * Array with the validation warnings for the item processing record
   **/
  public LocalInventoryOperationResult warnings(List<@Valid SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
  public List<@Valid SupplementalItemValidationEvent> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<@Valid SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public LocalInventoryOperationResult addWarningsItem(SupplementalItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

