package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserListType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CustomerListRequest   {
  
  private String name;
  private String records;
  private UserListType listType = "EMAIL";
  private Object exceptions;

  /**
   * Customer list name.
   **/
  
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", required = true, value = "Customer list name.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   **/
  
  @ApiModelProperty(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", required = true, value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
  @JsonProperty("records")
  @NotNull
  public String getRecords() {
    return records;
  }
  public void setRecords(String records) {
    this.records = records;
  }

  /**
   **/
  
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
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

