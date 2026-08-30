package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomerListRecordRow;
import org.openapitools.model.UserListOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@ApiModel(description="Resource create or update operation model with required body fields (no OptionalProperties).")

public class CustomerListUpdateWithRequiredBody  {
  
 /**
  * Customer list update operation type (add or remove). Only valid in update request body.
  */
  @ApiModelProperty(required = true, value = "Customer list update operation type (add or remove). Only valid in update request body.")
  @Valid
  private UserListOperationType operationType;

 /**
  * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  */
  @ApiModelProperty(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
  private String records;

 /**
  * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
  */
  @ApiModelProperty(value = "Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.")
  @Valid
  private List<@Valid CustomerListRecordRow> recordsV2 = new ArrayList<>();
 /**
  * Customer list update operation type (add or remove). Only valid in update request body.
  * @return operationType
  */
  @JsonProperty("operation_type")
  @NotNull
  public UserListOperationType getOperationType() {
    return operationType;
  }

  /**
   * Sets the <code>operationType</code> property.
   */
 public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * Sets the <code>operationType</code> property.
   */
  public CustomerListUpdateWithRequiredBody operationType(UserListOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

 /**
  * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  * @return records
  */
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }

  /**
   * Sets the <code>records</code> property.
   */
 public void setRecords(String records) {
    this.records = records;
  }

  /**
   * Sets the <code>records</code> property.
   */
  public CustomerListUpdateWithRequiredBody records(String records) {
    this.records = records;
    return this;
  }

 /**
  * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
  * @return recordsV2
  */
  @JsonProperty("records_v2")
  public List<@Valid CustomerListRecordRow> getRecordsV2() {
    return recordsV2;
  }

  /**
   * Sets the <code>recordsV2</code> property.
   */
 public void setRecordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
  }

  /**
   * Sets the <code>recordsV2</code> property.
   */
  public CustomerListUpdateWithRequiredBody recordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
    return this;
  }

  /**
   * Adds a new item to the <code>recordsV2</code> list.
   */
  public CustomerListUpdateWithRequiredBody addRecordsV2Item(CustomerListRecordRow recordsV2Item) {
    this.recordsV2.add(recordsV2Item);
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
    CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody = (CustomerListUpdateWithRequiredBody) o;
    return Objects.equals(this.operationType, customerListUpdateWithRequiredBody.operationType) &&
        Objects.equals(this.records, customerListUpdateWithRequiredBody.records) &&
        Objects.equals(this.recordsV2, customerListUpdateWithRequiredBody.recordsV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, records, recordsV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListUpdateWithRequiredBody {\n");
    
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    recordsV2: ").append(toIndentedString(recordsV2)).append("\n");
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

