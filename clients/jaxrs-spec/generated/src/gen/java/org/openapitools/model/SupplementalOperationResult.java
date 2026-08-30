package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.SupplementalItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 **/
@ApiModel(description = "Result of a supplemental item operation, discriminated by supplemental_type")
@JsonTypeName("SupplementalOperationResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalOperationResult   {
  private @Valid List<@Valid SupplementalItemValidationEvent> errors = new ArrayList<>();
  private String itemId;
  private SupplementalItemProcessingStatus status;
  private String storeCode;
  public enum SupplementalTypeEnum {

    LOCAL_INVENTORY(String.valueOf("LOCAL_INVENTORY"));


    private String value;

    SupplementalTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SupplementalTypeEnum fromString(String s) {
        for (SupplementalTypeEnum b : SupplementalTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private @Valid List<@Valid SupplementalItemValidationEvent> warnings = new ArrayList<>();

  public SupplementalOperationResult() {
  }

  @JsonCreator
  public SupplementalOperationResult(
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "status") SupplementalItemProcessingStatus status,
    @JsonProperty(required = true, value = "store_code") String storeCode,
    @JsonProperty(required = true, value = "supplemental_type") SupplementalTypeEnum supplementalType
  ) {
    this.itemId = itemId;
    this.status = status;
    this.storeCode = storeCode;
    this.supplementalType = supplementalType;
  }

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  public SupplementalOperationResult errors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  @Valid public List<@Valid SupplementalItemValidationEvent> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  public SupplementalOperationResult addErrorsItem(SupplementalItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public SupplementalOperationResult removeErrorsItem(SupplementalItemValidationEvent errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * Catalog item id in the merchant namespace
   **/
  public SupplementalOperationResult itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Status of the item processing record
   **/
  public SupplementalOperationResult status(SupplementalItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status of the item processing record")
  @JsonProperty(required = true, value = "status")
  @NotNull public SupplementalItemProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(SupplementalItemProcessingStatus status) {
    this.status = status;
  }

  /**
   * Store code for the local inventory item
   **/
  public SupplementalOperationResult storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
  @JsonProperty(required = true, value = "store_code")
  @NotNull public String getStoreCode() {
    return storeCode;
  }

  @JsonProperty(required = true, value = "store_code")
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   **/
  public SupplementalOperationResult supplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "supplemental_type")
  @NotNull public SupplementalTypeEnum getSupplementalType() {
    return supplementalType;
  }

  @JsonProperty(required = true, value = "supplemental_type")
  public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }

  /**
   * Array with the validation warnings for the item processing record
   **/
  public SupplementalOperationResult warnings(List<@Valid SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
  @Valid public List<@Valid SupplementalItemValidationEvent> getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
  public void setWarnings(List<@Valid SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public SupplementalOperationResult addWarningsItem(SupplementalItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }

    this.warnings.add(warningsItem);
    return this;
  }

  public SupplementalOperationResult removeWarningsItem(SupplementalItemValidationEvent warningsItem) {
    if (warningsItem != null && this.warnings != null) {
      this.warnings.remove(warningsItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
