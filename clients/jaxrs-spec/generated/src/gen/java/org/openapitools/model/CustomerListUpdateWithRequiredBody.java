package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomerListRecordRow;
import org.openapitools.model.UserListOperationType;
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
 * Resource create or update operation model with required body fields (no OptionalProperties).
 **/
@ApiModel(description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@JsonTypeName("CustomerListUpdateWithRequiredBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUpdateWithRequiredBody   {
  private UserListOperationType operationType;
  private String records;
  private @Valid List<@Valid CustomerListRecordRow> recordsV2 = new ArrayList<>();

  public CustomerListUpdateWithRequiredBody() {
  }

  @JsonCreator
  public CustomerListUpdateWithRequiredBody(
    @JsonProperty(required = true, value = "operation_type") UserListOperationType operationType
  ) {
    this.operationType = operationType;
  }

  /**
   * Customer list update operation type (add or remove). Only valid in update request body.
   **/
  public CustomerListUpdateWithRequiredBody operationType(UserListOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Customer list update operation type (add or remove). Only valid in update request body.")
  @JsonProperty(required = true, value = "operation_type")
  @NotNull public UserListOperationType getOperationType() {
    return operationType;
  }

  @JsonProperty(required = true, value = "operation_type")
  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   **/
  public CustomerListUpdateWithRequiredBody records(String records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }

  @JsonProperty("records")
  public void setRecords(String records) {
    this.records = records;
  }

  /**
   * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
   **/
  public CustomerListUpdateWithRequiredBody recordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
    return this;
  }

  
  @ApiModelProperty(value = "Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.")
  @JsonProperty("records_v2")
  @Valid public List<@Valid CustomerListRecordRow> getRecordsV2() {
    return recordsV2;
  }

  @JsonProperty("records_v2")
  public void setRecordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
  }

  public CustomerListUpdateWithRequiredBody addRecordsV2Item(CustomerListRecordRow recordsV2Item) {
    if (this.recordsV2 == null) {
      this.recordsV2 = new ArrayList<>();
    }

    this.recordsV2.add(recordsV2Item);
    return this;
  }

  public CustomerListUpdateWithRequiredBody removeRecordsV2Item(CustomerListRecordRow recordsV2Item) {
    if (recordsV2Item != null && this.recordsV2 != null) {
      this.recordsV2.remove(recordsV2Item);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
