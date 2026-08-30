package apimodels;

import apimodels.CustomerListRecordRow;
import apimodels.UserListOperationType;
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
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerListUpdateWithRequiredBody   {
  @JsonProperty("operation_type")
  @NotNull
@Valid

  private UserListOperationType operationType;

  @JsonProperty("records")
  
  private String records;

  @JsonProperty("records_v2")
  @Valid

  private List<@Valid CustomerListRecordRow> recordsV2 = null;

  public CustomerListUpdateWithRequiredBody operationType(UserListOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Customer list update operation type (add or remove). Only valid in update request body.
   * @return operationType
  **/
  public UserListOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  public CustomerListUpdateWithRequiredBody records(String records) {
    this.records = records;
    return this;
  }

   /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
  **/
  public String getRecords() {
    return records;
  }

  public void setRecords(String records) {
    this.records = records;
  }

  public CustomerListUpdateWithRequiredBody recordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
    return this;
  }

  public CustomerListUpdateWithRequiredBody addRecordsV2Item(CustomerListRecordRow recordsV2Item) {
    if (this.recordsV2 == null) {
      this.recordsV2 = new ArrayList<>();
    }
    this.recordsV2.add(recordsV2Item);
    return this;
  }

   /**
   * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
   * @return recordsV2
  **/
  public List<@Valid CustomerListRecordRow> getRecordsV2() {
    return recordsV2;
  }

  public void setRecordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
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
    return Objects.equals(operationType, customerListUpdateWithRequiredBody.operationType) &&
        Objects.equals(records, customerListUpdateWithRequiredBody.records) &&
        Objects.equals(recordsV2, customerListUpdateWithRequiredBody.recordsV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, records, recordsV2);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

