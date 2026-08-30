package org.openapitools.model;

import org.openapitools.model.SSIOAccountAddress;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Salesforce account item with billing and terms information.
 */
public class SSIOAccountItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Address information that is associated with this account.
   */
  @JsonProperty("addresses")
  private List<SSIOAccountAddress> addresses = new ArrayList<>();

  /**
   * Salesforce id for billto_info
   */
  @JsonProperty("id")
  private String id;

  /**
   * Salesforce text for IO Terms and Conditions
   */
  @JsonProperty("io_terms")
  private String ioTerms;

  /**
   * Salesforce id for IO Terms and Conditions
   */
  @JsonProperty("io_terms_id")
  private String ioTermsId;

  /**
   * Insertion Order Type - Pinterest Paper or Agency Paper
   */
  @JsonProperty("io_type")
  private String ioType;

  /**
   * Salesforce text for Rest of the World Terms and Conditions
   */
  @JsonProperty("row_terms")
  private String rowTerms;

  /**
   * Salesforce id for Rest of the World Terms and Conditions
   */
  @JsonProperty("row_terms_id")
  private String rowTermsId;

  /**
   * Salesforce text for US Terms and Conditions
   */
  @JsonProperty("us_terms")
  private String usTerms;

  /**
   * Salesforce id for US Terms and Conditions
   */
  @JsonProperty("us_terms_id")
  private String usTermsId;

  /**
   * Address information that is associated with this account.
   * @return addresses
   */
  public List<SSIOAccountAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<SSIOAccountAddress> addresses) {
    this.addresses = addresses;
  }

  /**
   * Salesforce id for billto_info
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Salesforce text for IO Terms and Conditions
   * @return ioTerms
   */
  public String getIoTerms() {
    return ioTerms;
  }

  public void setIoTerms(String ioTerms) {
    this.ioTerms = ioTerms;
  }

  /**
   * Salesforce id for IO Terms and Conditions
   * @return ioTermsId
   */
  public String getIoTermsId() {
    return ioTermsId;
  }

  public void setIoTermsId(String ioTermsId) {
    this.ioTermsId = ioTermsId;
  }

  /**
   * Insertion Order Type - Pinterest Paper or Agency Paper
   * @return ioType
   */
  public String getIoType() {
    return ioType;
  }

  public void setIoType(String ioType) {
    this.ioType = ioType;
  }

  /**
   * Salesforce text for Rest of the World Terms and Conditions
   * @return rowTerms
   */
  public String getRowTerms() {
    return rowTerms;
  }

  public void setRowTerms(String rowTerms) {
    this.rowTerms = rowTerms;
  }

  /**
   * Salesforce id for Rest of the World Terms and Conditions
   * @return rowTermsId
   */
  public String getRowTermsId() {
    return rowTermsId;
  }

  public void setRowTermsId(String rowTermsId) {
    this.rowTermsId = rowTermsId;
  }

  /**
   * Salesforce text for US Terms and Conditions
   * @return usTerms
   */
  public String getUsTerms() {
    return usTerms;
  }

  public void setUsTerms(String usTerms) {
    this.usTerms = usTerms;
  }

  /**
   * Salesforce id for US Terms and Conditions
   * @return usTermsId
   */
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
    return Objects.equals(this.addresses, ssIOAccountItem.addresses) &&
        Objects.equals(this.id, ssIOAccountItem.id) &&
        Objects.equals(this.ioTerms, ssIOAccountItem.ioTerms) &&
        Objects.equals(this.ioTermsId, ssIOAccountItem.ioTermsId) &&
        Objects.equals(this.ioType, ssIOAccountItem.ioType) &&
        Objects.equals(this.rowTerms, ssIOAccountItem.rowTerms) &&
        Objects.equals(this.rowTermsId, ssIOAccountItem.rowTermsId) &&
        Objects.equals(this.usTerms, ssIOAccountItem.usTerms) &&
        Objects.equals(this.usTermsId, ssIOAccountItem.usTermsId);
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
