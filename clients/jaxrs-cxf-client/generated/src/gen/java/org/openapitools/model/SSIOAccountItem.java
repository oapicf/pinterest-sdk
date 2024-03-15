package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountAddress;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOAccountItem  {
  
  @ApiModelProperty(example = "0011N00001LW8kAQAT", value = "Salesforce id for billto_info")
 /**
   * Salesforce id for billto_info
  **/
  private String id;

  @ApiModelProperty(example = "a2S1N000000bKHgUAM", value = "Salesforce id for IO Terms and Conditions")
 /**
   * Salesforce id for IO Terms and Conditions
  **/
  private String ioTermsId;

  @ApiModelProperty(example = "The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", value = "Salesforce text for IO Terms and Conditions")
 /**
   * Salesforce text for IO Terms and Conditions
  **/
  private String ioTerms;

  @ApiModelProperty(example = "a2S1N000000bKIOUA2", value = "Salesforce id for US Terms and Conditions")
 /**
   * Salesforce id for US Terms and Conditions
  **/
  private String usTermsId;

  @ApiModelProperty(example = "This Insertion Order (\"IO\") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", value = "Salesforce text for US Terms and Conditions")
 /**
   * Salesforce text for US Terms and Conditions
  **/
  private String usTerms;

  @ApiModelProperty(example = "a2S1N000000bKHhUAM", value = "Salesforce id for Rest of the World Terms and Conditions")
 /**
   * Salesforce id for Rest of the World Terms and Conditions
  **/
  private String rowTermsId;

  @ApiModelProperty(example = "The IO is governed by the terms available at  https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement", value = "Salesforce text for Rest of the World Terms and Conditions")
 /**
   * Salesforce text for Rest of the World Terms and Conditions
  **/
  private String rowTerms;

  @ApiModelProperty(example = "Pinterest Paper", value = "Insertion Order Type - Pinterest Paper or Agency Paper")
 /**
   * Insertion Order Type - Pinterest Paper or Agency Paper
  **/
  private String ioType;

  @ApiModelProperty(value = "Address information that is associated with this account.")
 /**
   * Address information that is associated with this account.
  **/
  private List<SSIOAccountAddress> addresses;
 /**
   * Salesforce id for billto_info
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SSIOAccountItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Salesforce id for IO Terms and Conditions
   * @return ioTermsId
  **/
  @JsonProperty("io_terms_id")
  public String getIoTermsId() {
    return ioTermsId;
  }

  public void setIoTermsId(String ioTermsId) {
    this.ioTermsId = ioTermsId;
  }

  public SSIOAccountItem ioTermsId(String ioTermsId) {
    this.ioTermsId = ioTermsId;
    return this;
  }

 /**
   * Salesforce text for IO Terms and Conditions
   * @return ioTerms
  **/
  @JsonProperty("io_terms")
  public String getIoTerms() {
    return ioTerms;
  }

  public void setIoTerms(String ioTerms) {
    this.ioTerms = ioTerms;
  }

  public SSIOAccountItem ioTerms(String ioTerms) {
    this.ioTerms = ioTerms;
    return this;
  }

 /**
   * Salesforce id for US Terms and Conditions
   * @return usTermsId
  **/
  @JsonProperty("us_terms_id")
  public String getUsTermsId() {
    return usTermsId;
  }

  public void setUsTermsId(String usTermsId) {
    this.usTermsId = usTermsId;
  }

  public SSIOAccountItem usTermsId(String usTermsId) {
    this.usTermsId = usTermsId;
    return this;
  }

 /**
   * Salesforce text for US Terms and Conditions
   * @return usTerms
  **/
  @JsonProperty("us_terms")
  public String getUsTerms() {
    return usTerms;
  }

  public void setUsTerms(String usTerms) {
    this.usTerms = usTerms;
  }

  public SSIOAccountItem usTerms(String usTerms) {
    this.usTerms = usTerms;
    return this;
  }

 /**
   * Salesforce id for Rest of the World Terms and Conditions
   * @return rowTermsId
  **/
  @JsonProperty("row_terms_id")
  public String getRowTermsId() {
    return rowTermsId;
  }

  public void setRowTermsId(String rowTermsId) {
    this.rowTermsId = rowTermsId;
  }

  public SSIOAccountItem rowTermsId(String rowTermsId) {
    this.rowTermsId = rowTermsId;
    return this;
  }

 /**
   * Salesforce text for Rest of the World Terms and Conditions
   * @return rowTerms
  **/
  @JsonProperty("row_terms")
  public String getRowTerms() {
    return rowTerms;
  }

  public void setRowTerms(String rowTerms) {
    this.rowTerms = rowTerms;
  }

  public SSIOAccountItem rowTerms(String rowTerms) {
    this.rowTerms = rowTerms;
    return this;
  }

 /**
   * Insertion Order Type - Pinterest Paper or Agency Paper
   * @return ioType
  **/
  @JsonProperty("io_type")
  public String getIoType() {
    return ioType;
  }

  public void setIoType(String ioType) {
    this.ioType = ioType;
  }

  public SSIOAccountItem ioType(String ioType) {
    this.ioType = ioType;
    return this;
  }

 /**
   * Address information that is associated with this account.
   * @return addresses
  **/
  @JsonProperty("addresses")
  public List<SSIOAccountAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<SSIOAccountAddress> addresses) {
    this.addresses = addresses;
  }

  public SSIOAccountItem addresses(List<SSIOAccountAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public SSIOAccountItem addAddressesItem(SSIOAccountAddress addressesItem) {
    this.addresses.add(addressesItem);
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
    SSIOAccountItem ssIOAccountItem = (SSIOAccountItem) o;
    return Objects.equals(this.id, ssIOAccountItem.id) &&
        Objects.equals(this.ioTermsId, ssIOAccountItem.ioTermsId) &&
        Objects.equals(this.ioTerms, ssIOAccountItem.ioTerms) &&
        Objects.equals(this.usTermsId, ssIOAccountItem.usTermsId) &&
        Objects.equals(this.usTerms, ssIOAccountItem.usTerms) &&
        Objects.equals(this.rowTermsId, ssIOAccountItem.rowTermsId) &&
        Objects.equals(this.rowTerms, ssIOAccountItem.rowTerms) &&
        Objects.equals(this.ioType, ssIOAccountItem.ioType) &&
        Objects.equals(this.addresses, ssIOAccountItem.addresses);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

