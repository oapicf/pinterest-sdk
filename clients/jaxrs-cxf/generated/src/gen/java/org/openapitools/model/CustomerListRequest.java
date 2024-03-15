package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.UserListType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerListRequest  {
  
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", required = true, value = "Customer list name.")
 /**
   * Customer list name.
  **/
  private String name;

  @ApiModelProperty(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", required = true, value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
 /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  **/
  private String records;

  @ApiModelProperty(value = "")
  @Valid
  private UserListType listType = "EMAIL";

  @ApiModelProperty(value = "Customer list errors.")
 /**
   * Customer list errors.
  **/
  private Object exceptions;
 /**
   * Customer list name.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerListRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
  **/
  @JsonProperty("records")
  @NotNull
  public String getRecords() {
    return records;
  }

  public void setRecords(String records) {
    this.records = records;
  }

  public CustomerListRequest records(String records) {
    this.records = records;
    return this;
  }

 /**
   * Get listType
   * @return listType
  **/
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }

  public void setListType(UserListType listType) {
    this.listType = listType;
  }

  public CustomerListRequest listType(UserListType listType) {
    this.listType = listType;
    return this;
  }

 /**
   * Customer list errors.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public Object getExceptions() {
    return exceptions;
  }

  public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
  }

  public CustomerListRequest exceptions(Object exceptions) {
    this.exceptions = exceptions;
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
    CustomerListRequest customerListRequest = (CustomerListRequest) o;
    return Objects.equals(this.name, customerListRequest.name) &&
        Objects.equals(this.records, customerListRequest.records) &&
        Objects.equals(this.listType, customerListRequest.listType) &&
        Objects.equals(this.exceptions, customerListRequest.exceptions);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

