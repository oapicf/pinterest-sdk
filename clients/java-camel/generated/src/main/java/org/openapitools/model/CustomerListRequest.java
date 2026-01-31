package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.UserListType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomerListRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CustomerListRequest {

  private UserListType listType = "EMAIL";

  private String name;

  private String records;

  public CustomerListRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerListRequest(String name, String records) {
    this.name = name;
    this.records = records;
  }

  public CustomerListRequest listType(UserListType listType) {
    this.listType = listType;
    return this;
  }

  /**
   * Get listType
   * @return listType
   */
  @Valid 
  @Schema(name = "list_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }

  public void setListType(UserListType listType) {
    this.listType = listType;
  }

  public CustomerListRequest name(String name) {
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

  public CustomerListRequest records(String records) {
    this.records = records;
    return this;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
   */
  @NotNull 
  @Schema(name = "records", example = "email1@pinterest.com,email2@pinterest.com,..<more records>", description = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }

  public void setRecords(String records) {
    this.records = records;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListRequest customerListRequest = (CustomerListRequest) o;
    return Objects.equals(this.listType, customerListRequest.listType) &&
        Objects.equals(this.name, customerListRequest.name) &&
        Objects.equals(this.records, customerListRequest.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listType, name, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListRequest {\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

