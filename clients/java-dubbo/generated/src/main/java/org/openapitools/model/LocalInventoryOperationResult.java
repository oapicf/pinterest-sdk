package org.openapitools.model;

import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.SupplementalItemValidationEvent;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Result model for local inventory operation
 */
public class LocalInventoryOperationResult implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   */
  @JsonProperty("errors")
  private List<SupplementalItemValidationEvent> errors = new ArrayList<>();

  /**
   * Catalog item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * Status of the item processing record
   */
  @JsonProperty("status")
  private SupplementalItemProcessingStatus status;

  /**
   * Store code for the local inventory item
   */
  @JsonProperty("store_code")
  private String storeCode;

  @JsonProperty("supplemental_type")
  private String supplementalType;

  /**
   * Array with the validation warnings for the item processing record
   */
  @JsonProperty("warnings")
  private List<SupplementalItemValidationEvent> warnings = new ArrayList<>();

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
   */
  public List<SupplementalItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Catalog item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Status of the item processing record
   * @return status
   */
  public SupplementalItemProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(SupplementalItemProcessingStatus status) {
    this.status = status;
  }

  /**
   * Store code for the local inventory item
   * @return storeCode
   */
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   * 
   * @return supplementalType
   */
  public String getSupplementalType() {
    return supplementalType;
  }

  public void setSupplementalType(String supplementalType) {
    this.supplementalType = supplementalType;
  }

  /**
   * Array with the validation warnings for the item processing record
   * @return warnings
   */
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
