package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.SupplementalItemProcessingStatus;
import com.prokarma.pkmst.model.SupplementalItemValidationEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Result model for local inventory operation
 */
@ApiModel(description = "Result model for local inventory operation")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryOperationResult   {
  @JsonProperty("errors")
  
  private List<SupplementalItemValidationEvent> errors = null;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("status")
  private SupplementalItemProcessingStatus status;

  @JsonProperty("store_code")
  private String storeCode;

  /**
   * Gets or Sets supplementalType
   */
  public enum SupplementalTypeEnum {
    LOCAL_INVENTORY("LOCAL_INVENTORY");

    private String value;

    SupplementalTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SupplementalTypeEnum fromValue(String text) {
      for (SupplementalTypeEnum b : SupplementalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("supplemental_type")
  private SupplementalTypeEnum supplementalType;

  @JsonProperty("warnings")
  
  private List<SupplementalItemValidationEvent> warnings = null;

  public LocalInventoryOperationResult errors(List<SupplementalItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public LocalInventoryOperationResult addErrorsItem(SupplementalItemValidationEvent errorsItem) {
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
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  public List<SupplementalItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  public LocalInventoryOperationResult itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Catalog item id in the merchant namespace
   * @return itemId
   */
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public LocalInventoryOperationResult status(SupplementalItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the item processing record
   * @return status
   */
  @ApiModelProperty(required = true, value = "Status of the item processing record")
  public SupplementalItemProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(SupplementalItemProcessingStatus status) {
    this.status = status;
  }

  public LocalInventoryOperationResult storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Store code for the local inventory item
   * @return storeCode
   */
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public LocalInventoryOperationResult supplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
    return this;
  }

  /**
   * Get supplementalType
   * @return supplementalType
   */
  @ApiModelProperty(required = true, value = "")
  public SupplementalTypeEnum getSupplementalType() {
    return supplementalType;
  }

  public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }

  public LocalInventoryOperationResult warnings(List<SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  public LocalInventoryOperationResult addWarningsItem(SupplementalItemValidationEvent warningsItem) {
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
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  public List<SupplementalItemValidationEvent> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<SupplementalItemValidationEvent> warnings) {
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

