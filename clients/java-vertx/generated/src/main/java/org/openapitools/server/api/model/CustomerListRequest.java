package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.UserListType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListRequest   {
  
  private String name;
  private String records;
  private UserListType listType = "EMAIL";
  private Object exceptions;

  public CustomerListRequest () {

  }

  public CustomerListRequest (String name, String records, UserListType listType, Object exceptions) {
    this.name = name;
    this.records = records;
    this.listType = listType;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }
  public void setRecords(String records) {
    this.records = records;
  }

    
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }
  public void setListType(UserListType listType) {
    this.listType = listType;
  }

    
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
