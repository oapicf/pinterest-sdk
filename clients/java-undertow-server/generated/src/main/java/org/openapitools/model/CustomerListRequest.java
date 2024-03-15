/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
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
import org.openapitools.model.UserListType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CustomerListRequest   {
  
  private String name;
  private String records;
  private UserListType listType = "EMAIL";
  private Object exceptions;

  /**
   * Customer list name.
   */
  public CustomerListRequest name(String name) {
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
  public CustomerListRequest records(String records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", required = true, value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }
  public void setRecords(String records) {
    this.records = records;
  }

  /**
   */
  public CustomerListRequest listType(UserListType listType) {
    this.listType = listType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }
  public void setListType(UserListType listType) {
    this.listType = listType;
  }

  /**
   * Customer list errors.
   */
  public CustomerListRequest exceptions(Object exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "Customer list errors.")
  @JsonProperty("exceptions")
  public Object getExceptions() {
    return exceptions;
  }
  public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
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
    return Objects.equals(name, customerListRequest.name) &&
        Objects.equals(records, customerListRequest.records) &&
        Objects.equals(listType, customerListRequest.listType) &&
        Objects.equals(exceptions, customerListRequest.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, records, listType, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

