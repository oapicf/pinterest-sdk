package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Result of a supplemental item operation, discriminated by supplemental_type")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalOperationResult   {
  
  private List<@Valid SupplementalItemValidationEvent> errors = new ArrayList<>();
  private String itemId;
  private SupplementalItemProcessingStatus status;
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
  }

  private SupplementalTypeEnum supplementalType;
  private List<@Valid SupplementalItemValidationEvent> warnings = new ArrayList<>();

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  public List<@Valid SupplementalItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Catalog item id in the merchant namespace
   **/
  
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
  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
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

