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
import org.openapitools.model.CustomerListRecordRow;
import org.openapitools.model.UserListOperationType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

@Schema(name = "CustomerListUpdateWithRequiredBody", description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUpdateWithRequiredBody {

  private UserListOperationType operationType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String records;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CustomerListRecordRow> recordsV2 = new ArrayList<>();

  public CustomerListUpdateWithRequiredBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerListUpdateWithRequiredBody(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  public CustomerListUpdateWithRequiredBody operationType(UserListOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Customer list update operation type (add or remove). Only valid in update request body.
   * @return operationType
   */
  @NotNull @Valid 
  @Schema(name = "operation_type", description = "Customer list update operation type (add or remove). Only valid in update request body.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation_type")
  public UserListOperationType getOperationType() {
    return operationType;
  }

  @JsonProperty("operation_type")
  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  public CustomerListUpdateWithRequiredBody records(@Nullable String records) {
    this.records = records;
    return this;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
   */
  
  @Schema(name = "records", example = "email1@pinterest.com,email2@pinterest.com,..<more records>", description = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("records")
  public @Nullable String getRecords() {
    return records;
  }

  @JsonProperty("records")
  public void setRecords(@Nullable String records) {
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
   */
  @Valid 
  @Schema(name = "records_v2", description = "Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("records_v2")
  public List<@Valid CustomerListRecordRow> getRecordsV2() {
    return recordsV2;
  }

  @JsonProperty("records_v2")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

