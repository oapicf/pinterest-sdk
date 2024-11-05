package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.SSIOAccountAddress;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSIOAccountItem   {
  
  private String id;
  private String ioTermsId;
  private String ioTerms;
  private String usTermsId;
  private String usTerms;
  private String rowTermsId;
  private String rowTerms;
  private String ioType;
  private List<SSIOAccountAddress> addresses = new ArrayList<>();

  public SSIOAccountItem () {

  }

  public SSIOAccountItem (String id, String ioTermsId, String ioTerms, String usTermsId, String usTerms, String rowTermsId, String rowTerms, String ioType, List<SSIOAccountAddress> addresses) {
    this.id = id;
    this.ioTermsId = ioTermsId;
    this.ioTerms = ioTerms;
    this.usTermsId = usTermsId;
    this.usTerms = usTerms;
    this.rowTermsId = rowTermsId;
    this.rowTerms = rowTerms;
    this.ioType = ioType;
    this.addresses = addresses;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("io_terms_id")
  public String getIoTermsId() {
    return ioTermsId;
  }
  public void setIoTermsId(String ioTermsId) {
    this.ioTermsId = ioTermsId;
  }

    
  @JsonProperty("io_terms")
  public String getIoTerms() {
    return ioTerms;
  }
  public void setIoTerms(String ioTerms) {
    this.ioTerms = ioTerms;
  }

    
  @JsonProperty("us_terms_id")
  public String getUsTermsId() {
    return usTermsId;
  }
  public void setUsTermsId(String usTermsId) {
    this.usTermsId = usTermsId;
  }

    
  @JsonProperty("us_terms")
  public String getUsTerms() {
    return usTerms;
  }
  public void setUsTerms(String usTerms) {
    this.usTerms = usTerms;
  }

    
  @JsonProperty("row_terms_id")
  public String getRowTermsId() {
    return rowTermsId;
  }
  public void setRowTermsId(String rowTermsId) {
    this.rowTermsId = rowTermsId;
  }

    
  @JsonProperty("row_terms")
  public String getRowTerms() {
    return rowTerms;
  }
  public void setRowTerms(String rowTerms) {
    this.rowTerms = rowTerms;
  }

    
  @JsonProperty("io_type")
  public String getIoType() {
    return ioType;
  }
  public void setIoType(String ioType) {
    this.ioType = ioType;
  }

    
  @JsonProperty("addresses")
  public List<SSIOAccountAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<SSIOAccountAddress> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOAccountItem ssIOAccountItem = (SSIOAccountItem) o;
    return Objects.equals(id, ssIOAccountItem.id) &&
        Objects.equals(ioTermsId, ssIOAccountItem.ioTermsId) &&
        Objects.equals(ioTerms, ssIOAccountItem.ioTerms) &&
        Objects.equals(usTermsId, ssIOAccountItem.usTermsId) &&
        Objects.equals(usTerms, ssIOAccountItem.usTerms) &&
        Objects.equals(rowTermsId, ssIOAccountItem.rowTermsId) &&
        Objects.equals(rowTerms, ssIOAccountItem.rowTerms) &&
        Objects.equals(ioType, ssIOAccountItem.ioType) &&
        Objects.equals(addresses, ssIOAccountItem.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ioTermsId, ioTerms, usTermsId, usTerms, rowTermsId, rowTerms, ioType, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ioTermsId: ").append(toIndentedString(ioTermsId)).append("\n");
    sb.append("    ioTerms: ").append(toIndentedString(ioTerms)).append("\n");
    sb.append("    usTermsId: ").append(toIndentedString(usTermsId)).append("\n");
    sb.append("    usTerms: ").append(toIndentedString(usTerms)).append("\n");
    sb.append("    rowTermsId: ").append(toIndentedString(rowTermsId)).append("\n");
    sb.append("    rowTerms: ").append(toIndentedString(rowTerms)).append("\n");
    sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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
