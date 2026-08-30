/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
import org.openapitools.model.CustomerListRecordRow;
import org.openapitools.model.UserListType;



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListCreate   {
  
  private Boolean isNca;
  private UserListType listType;
  private String name;
  private String records;
  private List<CustomerListRecordRow> recordsV2 = new ArrayList<>();

  /**
   * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
   */
  public CustomerListCreate isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.")
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }
  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  /**
   * Type of customer list (e.g., EMAIL, IDFA, MAID).
   */
  public CustomerListCreate listType(UserListType listType) {
    this.listType = listType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of customer list (e.g., EMAIL, IDFA, MAID).")
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }
  public void setListType(UserListType listType) {
    this.listType = listType;
  }

  /**
   * Customer list name.
   */
  public CustomerListCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", required = true, value = "Customer list name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   */
  public CustomerListCreate records(String records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }
  public void setRecords(String records) {
    this.records = records;
  }

  /**
   * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
   */
  public CustomerListCreate recordsV2(List<CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
    return this;
  }

  
  @ApiModelProperty(value = "Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.")
  @JsonProperty("records_v2")
  public List<CustomerListRecordRow> getRecordsV2() {
    return recordsV2;
  }
  public void setRecordsV2(List<CustomerListRecordRow> recordsV2) {
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
    return Objects.equals(isNca, customerListCreate.isNca) &&
        Objects.equals(listType, customerListCreate.listType) &&
        Objects.equals(name, customerListCreate.name) &&
        Objects.equals(records, customerListCreate.records) &&
        Objects.equals(recordsV2, customerListCreate.recordsV2);
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

