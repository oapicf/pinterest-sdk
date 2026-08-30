package apimodels;

import apimodels.CustomerListRecordRow;
import apimodels.UserListType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerListCreate   {
  @JsonProperty("is_nca")
  
  private Boolean isNca;

  @JsonProperty("list_type")
  @Valid

  private UserListType listType;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("records")
  
  private String records;

  @JsonProperty("records_v2")
  @Valid

  private List<@Valid CustomerListRecordRow> recordsV2 = null;

  public CustomerListCreate isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

   /**
   * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
   * @return isNca
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

