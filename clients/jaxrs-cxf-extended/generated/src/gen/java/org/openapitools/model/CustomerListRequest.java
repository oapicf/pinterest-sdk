package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.UserListType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerListRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private UserListType listType = "EMAIL";

 /**
  * Customer list name.
  */
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", required = true, value = "Customer list name.")
  private String name;

 /**
  * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  */
  @ApiModelProperty(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", required = true, value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
  private String records;
 /**
  * Get listType
  * @return listType
  */
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }

  /**
   * Sets the <code>listType</code> property.
   */
 public void setListType(UserListType listType) {
    this.listType = listType;
  }

  /**
   * Sets the <code>listType</code> property.
   */
  public CustomerListRequest listType(UserListType listType) {
    this.listType = listType;
    return this;
  }

 /**
  * Customer list name.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CustomerListRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  * @return records
  */
  @JsonProperty("records")
  @NotNull
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
  public CustomerListRequest records(String records) {
    this.records = records;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

