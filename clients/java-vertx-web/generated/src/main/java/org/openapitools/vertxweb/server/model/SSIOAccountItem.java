package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SSIOAccountAddress;

/**
 * Salesforce account item with billing and terms information.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSIOAccountItem   {
  
  private List<SSIOAccountAddress> addresses = new ArrayList<>();
  private String id;
  private String ioTerms;
  private String ioTermsId;
  private String ioType;
  private String rowTerms;
  private String rowTermsId;
  private String usTerms;
  private String usTermsId;

  public SSIOAccountItem () {

  }

  public SSIOAccountItem (List<SSIOAccountAddress> addresses, String id, String ioTerms, String ioTermsId, String ioType, String rowTerms, String rowTermsId, String usTerms, String usTermsId) {
    this.addresses = addresses;
    this.id = id;
    this.ioTerms = ioTerms;
    this.ioTermsId = ioTermsId;
    this.ioType = ioType;
    this.rowTerms = rowTerms;
    this.rowTermsId = rowTermsId;
    this.usTerms = usTerms;
    this.usTermsId = usTermsId;
  }

    
  @JsonProperty("addresses")
  public List<SSIOAccountAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<SSIOAccountAddress> addresses) {
    this.addresses = addresses;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("io_terms")
  public String getIoTerms() {
    return ioTerms;
  }
  public void setIoTerms(String ioTerms) {
    this.ioTerms = ioTerms;
  }

    
  @JsonProperty("io_terms_id")
  public String getIoTermsId() {
    return ioTermsId;
  }
  public void setIoTermsId(String ioTermsId) {
    this.ioTermsId = ioTermsId;
  }

    
  @JsonProperty("io_type")
  public String getIoType() {
    return ioType;
  }
  public void setIoType(String ioType) {
    this.ioType = ioType;
  }

    
  @JsonProperty("row_terms")
  public String getRowTerms() {
    return rowTerms;
  }
  public void setRowTerms(String rowTerms) {
    this.rowTerms = rowTerms;
  }

    
  @JsonProperty("row_terms_id")
  public String getRowTermsId() {
    return rowTermsId;
  }
  public void setRowTermsId(String rowTermsId) {
    this.rowTermsId = rowTermsId;
  }

    
  @JsonProperty("us_terms")
  public String getUsTerms() {
    return usTerms;
  }
  public void setUsTerms(String usTerms) {
    this.usTerms = usTerms;
  }

    
  @JsonProperty("us_terms_id")
  public String getUsTermsId() {
    return usTermsId;
  }
  public void setUsTermsId(String usTermsId) {
    this.usTermsId = usTermsId;
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
    return Objects.equals(addresses, ssIOAccountItem.addresses) &&
        Objects.equals(id, ssIOAccountItem.id) &&
        Objects.equals(ioTerms, ssIOAccountItem.ioTerms) &&
        Objects.equals(ioTermsId, ssIOAccountItem.ioTermsId) &&
        Objects.equals(ioType, ssIOAccountItem.ioType) &&
        Objects.equals(rowTerms, ssIOAccountItem.rowTerms) &&
        Objects.equals(rowTermsId, ssIOAccountItem.rowTermsId) &&
        Objects.equals(usTerms, ssIOAccountItem.usTerms) &&
        Objects.equals(usTermsId, ssIOAccountItem.usTermsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, id, ioTerms, ioTermsId, ioType, rowTerms, rowTermsId, usTerms, usTermsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountItem {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ioTerms: ").append(toIndentedString(ioTerms)).append("\n");
    sb.append("    ioTermsId: ").append(toIndentedString(ioTermsId)).append("\n");
    sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
    sb.append("    rowTerms: ").append(toIndentedString(rowTerms)).append("\n");
    sb.append("    rowTermsId: ").append(toIndentedString(rowTermsId)).append("\n");
    sb.append("    usTerms: ").append(toIndentedString(usTerms)).append("\n");
    sb.append("    usTermsId: ").append(toIndentedString(usTermsId)).append("\n");
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
