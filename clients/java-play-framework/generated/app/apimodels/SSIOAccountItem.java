package apimodels;

import apimodels.SSIOAccountAddress;
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
 * SSIOAccountItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOAccountItem   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("io_terms_id")
  
  private String ioTermsId;

  @JsonProperty("io_terms")
  
  private String ioTerms;

  @JsonProperty("us_terms_id")
  
  private String usTermsId;

  @JsonProperty("us_terms")
  
  private String usTerms;

  @JsonProperty("row_terms_id")
  
  private String rowTermsId;

  @JsonProperty("row_terms")
  
  private String rowTerms;

  @JsonProperty("io_type")
  
  private String ioType;

  @JsonProperty("addresses")
  @Valid

  private List<@Valid SSIOAccountAddress> addresses = null;

  public SSIOAccountItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Salesforce id for billto_info
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SSIOAccountItem ioTermsId(String ioTermsId) {
    this.ioTermsId = ioTermsId;
    return this;
  }

   /**
   * Salesforce id for IO Terms and Conditions
   * @return ioTermsId
  **/
  public String getIoTermsId() {
    return ioTermsId;
  }

  public void setIoTermsId(String ioTermsId) {
    this.ioTermsId = ioTermsId;
  }

  public SSIOAccountItem ioTerms(String ioTerms) {
    this.ioTerms = ioTerms;
    return this;
  }

   /**
   * Salesforce text for IO Terms and Conditions
   * @return ioTerms
  **/
  public String getIoTerms() {
    return ioTerms;
  }

  public void setIoTerms(String ioTerms) {
    this.ioTerms = ioTerms;
  }

  public SSIOAccountItem usTermsId(String usTermsId) {
    this.usTermsId = usTermsId;
    return this;
  }

   /**
   * Salesforce id for US Terms and Conditions
   * @return usTermsId
  **/
  public String getUsTermsId() {
    return usTermsId;
  }

  public void setUsTermsId(String usTermsId) {
    this.usTermsId = usTermsId;
  }

  public SSIOAccountItem usTerms(String usTerms) {
    this.usTerms = usTerms;
    return this;
  }

   /**
   * Salesforce text for US Terms and Conditions
   * @return usTerms
  **/
  public String getUsTerms() {
    return usTerms;
  }

  public void setUsTerms(String usTerms) {
    this.usTerms = usTerms;
  }

  public SSIOAccountItem rowTermsId(String rowTermsId) {
    this.rowTermsId = rowTermsId;
    return this;
  }

   /**
   * Salesforce id for Rest of the World Terms and Conditions
   * @return rowTermsId
  **/
  public String getRowTermsId() {
    return rowTermsId;
  }

  public void setRowTermsId(String rowTermsId) {
    this.rowTermsId = rowTermsId;
  }

  public SSIOAccountItem rowTerms(String rowTerms) {
    this.rowTerms = rowTerms;
    return this;
  }

   /**
   * Salesforce text for Rest of the World Terms and Conditions
   * @return rowTerms
  **/
  public String getRowTerms() {
    return rowTerms;
  }

  public void setRowTerms(String rowTerms) {
    this.rowTerms = rowTerms;
  }

  public SSIOAccountItem ioType(String ioType) {
    this.ioType = ioType;
    return this;
  }

   /**
   * Insertion Order Type - Pinterest Paper or Agency Paper
   * @return ioType
  **/
  public String getIoType() {
    return ioType;
  }

  public void setIoType(String ioType) {
    this.ioType = ioType;
  }

  public SSIOAccountItem addresses(List<@Valid SSIOAccountAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public SSIOAccountItem addAddressesItem(SSIOAccountAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Address information that is associated with this account.
   * @return addresses
  **/
  public List<@Valid SSIOAccountAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<@Valid SSIOAccountAddress> addresses) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

