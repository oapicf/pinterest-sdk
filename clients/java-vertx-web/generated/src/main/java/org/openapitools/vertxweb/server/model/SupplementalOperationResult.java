package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SupplementalItemProcessingStatus;
import org.openapitools.vertxweb.server.model.SupplementalItemValidationEvent;

/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplementalOperationResult   {
  
  private List<SupplementalItemValidationEvent> errors = new ArrayList<>();
  private String itemId;
  private SupplementalItemProcessingStatus status;
  private String storeCode;


  public enum SupplementalTypeEnum {
    LOCAL_INVENTORY("LOCAL_INVENTORY");

    private String value;

    SupplementalTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SupplementalTypeEnum supplementalType;
  private List<SupplementalItemValidationEvent> warnings = new ArrayList<>();

  public SupplementalOperationResult () {

  }

  public SupplementalOperationResult (List<SupplementalItemValidationEvent> errors, String itemId, SupplementalItemProcessingStatus status, String storeCode, SupplementalTypeEnum supplementalType, List<SupplementalItemValidationEvent> warnings) {
    this.errors = errors;
    this.itemId = itemId;
    this.status = status;
    this.storeCode = storeCode;
    this.supplementalType = supplementalType;
    this.warnings = warnings;
  }

    
  @JsonProperty("errors")
  public List<SupplementalItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<SupplementalItemValidationEvent> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("status")
  public SupplementalItemProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(SupplementalItemProcessingStatus status) {
    this.status = status;
  }

    
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

    
  @JsonProperty("supplemental_type")
  public SupplementalTypeEnum getSupplementalType() {
    return supplementalType;
  }
  public void setSupplementalType(SupplementalTypeEnum supplementalType) {
    this.supplementalType = supplementalType;
  }

    
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
