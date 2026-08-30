package apimodels;

import apimodels.SupplementalItemProcessingStatus;
import apimodels.SupplementalItemValidationEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Result model for local inventory operation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocalInventoryOperationResult   {
  @JsonProperty("errors")
  @Valid

  private List<@Valid SupplementalItemValidationEvent> errors = null;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("status")
  @NotNull
@Valid

  private SupplementalItemProcessingStatus status;

  @JsonProperty("store_code")
  @NotNull

  private String storeCode;

  /**
   * Gets or Sets supplementalType
   */
  public enum SupplementalTypeEnum {
    LOCAL_INVENTORY("LOCAL_INVENTORY");

    private final String value;

    SupplementalTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SupplementalTypeEnum fromValue(String value) {
      for (SupplementalTypeEnum b : SupplementalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("supplemental_type")
  @NotNull

  private SupplementalTypeEnum supplementalType;

  @JsonProperty("warnings")
  @Valid

  private List<@Valid SupplementalItemValidationEvent> warnings = null;

  public LocalInventoryOperationResult errors(List<@Valid SupplementalItemValidationEvent> errors) {
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
  **/
  public List<@Valid SupplementalItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  public LocalInventoryOperationResult itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Catalog item id in the merchant namespace
   * @return itemId
  **/
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
  **/
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
  **/
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
  **/
  public SupplementalTypeEnum getSupplementalType() {
    return supplementalType;
  }

  public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }

  public LocalInventoryOperationResult warnings(List<@Valid SupplementalItemValidationEvent> warnings) {
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
  **/
  public List<@Valid SupplementalItemValidationEvent> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid SupplementalItemValidationEvent> warnings) {
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
    return Objects.equals(errors, localInventoryOperationResult.errors) &&
        Objects.equals(itemId, localInventoryOperationResult.itemId) &&
        Objects.equals(status, localInventoryOperationResult.status) &&
        Objects.equals(storeCode, localInventoryOperationResult.storeCode) &&
        Objects.equals(supplementalType, localInventoryOperationResult.supplementalType) &&
        Objects.equals(warnings, localInventoryOperationResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, itemId, status, storeCode, supplementalType, warnings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

