package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.SupplementalItemValidationEvent;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 */

@Schema(name = "SupplementalOperationResult", description = "Result of a supplemental item operation, discriminated by supplemental_type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalOperationResult {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid SupplementalItemValidationEvent> errors = new ArrayList<>();

  private String itemId;

  private SupplementalItemProcessingStatus status;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private SupplementalTypeEnum supplementalType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid SupplementalItemValidationEvent> warnings = new ArrayList<>();

  public SupplementalOperationResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SupplementalOperationResult(String itemId, SupplementalItemProcessingStatus status, String storeCode, SupplementalTypeEnum supplementalType) {
    this.itemId = itemId;
    this.status = status;
    this.storeCode = storeCode;
    this.supplementalType = supplementalType;
  }

  public SupplementalOperationResult errors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public SupplementalOperationResult addErrorsItem(SupplementalItemValidationEvent errorsItem) {
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
  public List<@Valid SupplementalItemValidationEvent> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  public SupplementalOperationResult itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Catalog item id in the merchant namespace
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", example = "item_id_1", description = "Catalog item id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  @JsonProperty("item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public SupplementalOperationResult status(SupplementalItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the item processing record
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", description = "Status of the item processing record", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public SupplementalItemProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(SupplementalItemProcessingStatus status) {
    this.status = status;
  }

  public SupplementalOperationResult storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Store code for the local inventory item
   * @return storeCode
   */
  @NotNull 
  @Schema(name = "store_code", example = "store_1", description = "Store code for the local inventory item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }

  @JsonProperty("store_code")
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public SupplementalOperationResult supplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
    return this;
  }

  /**
   * Get supplementalType
   * @return supplementalType
   */
  @NotNull 
  @Schema(name = "supplemental_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supplemental_type")
  public SupplementalTypeEnum getSupplementalType() {
    return supplementalType;
  }

  @JsonProperty("supplemental_type")
  public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }

  public SupplementalOperationResult warnings(List<@Valid SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SupplementalOperationResult addWarningsItem(SupplementalItemValidationEvent warningsItem) {
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
  public List<@Valid SupplementalItemValidationEvent> getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
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
    SupplementalOperationResult supplementalOperationResult = (SupplementalOperationResult) o;
    return Objects.equals(this.errors, supplementalOperationResult.errors) &&
        Objects.equals(this.itemId, supplementalOperationResult.itemId) &&
        Objects.equals(this.status, supplementalOperationResult.status) &&
        Objects.equals(this.storeCode, supplementalOperationResult.storeCode) &&
        Objects.equals(this.supplementalType, supplementalOperationResult.supplementalType) &&
        Objects.equals(this.warnings, supplementalOperationResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, itemId, status, storeCode, supplementalType, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalOperationResult {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

