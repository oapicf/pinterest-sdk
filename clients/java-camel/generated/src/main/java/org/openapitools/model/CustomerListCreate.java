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
import org.openapitools.model.UserListType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "CustomerListCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListCreate {

  private Boolean isNca;

  private UserListType listType;

  private String name;

  private String records;

  @Valid
  private List<@Valid CustomerListRecordRow> recordsV2 = new ArrayList<>();

  public CustomerListCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerListCreate(String name) {
    this.name = name;
  }

  public CustomerListCreate isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

  /**
   * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
   * @return isNca
   */
  
  @Schema(name = "is_nca", description = "Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }

  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  public CustomerListCreate listType(UserListType listType) {
    this.listType = listType;
    return this;
  }

  /**
   * Type of customer list (e.g., EMAIL, IDFA, MAID).
   * @return listType
   */
  @Valid 
  @Schema(name = "list_type", description = "Type of customer list (e.g., EMAIL, IDFA, MAID).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }

  public void setListType(UserListType listType) {
    this.listType = listType;
  }

  public CustomerListCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer list name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "The Glengarry Glen Ross leads", description = "Customer list name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerListCreate records(String records) {
    this.records = records;
    return this;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
   */
  
  @Schema(name = "records", example = "email1@pinterest.com,email2@pinterest.com,..<more records>", description = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }

  public void setRecords(String records) {
    this.records = records;
  }

  public CustomerListCreate recordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
    return this;
  }

  public CustomerListCreate addRecordsV2Item(CustomerListRecordRow recordsV2Item) {
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
    CustomerListCreate customerListCreate = (CustomerListCreate) o;
    return Objects.equals(this.isNca, customerListCreate.isNca) &&
        Objects.equals(this.listType, customerListCreate.listType) &&
        Objects.equals(this.name, customerListCreate.name) &&
        Objects.equals(this.records, customerListCreate.records) &&
        Objects.equals(this.recordsV2, customerListCreate.recordsV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isNca, listType, name, records, recordsV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListCreate {\n");
    sb.append("    isNca: ").append(toIndentedString(isNca)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

