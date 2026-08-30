package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CustomerListRecordRow;
import org.openapitools.vertxweb.server.model.UserListType;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListCreate   {
  
  private Boolean isNca;
  private UserListType listType;
  private String name;
  private String records;
  private List<CustomerListRecordRow> recordsV2 = new ArrayList<>();

  public CustomerListCreate () {

  }

  public CustomerListCreate (Boolean isNca, UserListType listType, String name, String records, List<CustomerListRecordRow> recordsV2) {
    this.isNca = isNca;
    this.listType = listType;
    this.name = name;
    this.records = records;
    this.recordsV2 = recordsV2;
  }

    
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }
  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

    
  @JsonProperty("list_type")
  public UserListType getListType() {
    return listType;
  }
  public void setListType(UserListType listType) {
    this.listType = listType;
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
