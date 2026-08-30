package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.SupplementalItemValidationEvent;



/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 **/

@ApiModel(description = "Result of a supplemental item operation, discriminated by supplemental_type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalOperationResult   {
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

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  public SupplementalOperationResult errors(List<SupplementalItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  public List<SupplementalItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Catalog item id in the merchant namespace
   **/
  public SupplementalOperationResult itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
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
  @JsonProperty("status")
  public SupplementalItemProcessingStatus getStatus() {
    return status;
  }
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
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }
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
  @JsonProperty("supplemental_type")
  public SupplementalTypeEnum getSupplementalType() {
    return supplementalType;
  }
  public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }

  /**
   * Array with the validation warnings for the item processing record
   **/
  public SupplementalOperationResult warnings(List<SupplementalItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
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
    SupplementalOperationResult supplementalOperationResult = (SupplementalOperationResult) o;
    return Objects.equals(errors, supplementalOperationResult.errors) &&
        Objects.equals(itemId, supplementalOperationResult.itemId) &&
        Objects.equals(status, supplementalOperationResult.status) &&
        Objects.equals(storeCode, supplementalOperationResult.storeCode) &&
        Objects.equals(supplementalType, supplementalOperationResult.supplementalType) &&
        Objects.equals(warnings, supplementalOperationResult.warnings);
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

