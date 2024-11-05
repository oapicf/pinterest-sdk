package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.SSIOAccountAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SSIOAccountItem
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
  
  private List<SSIOAccountAddress> addresses = null;

  public SSIOAccountItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Salesforce id for billto_info
   * @return id
   */
  @ApiModelProperty(example = "0011N00001LW8kAQAT", value = "Salesforce id for billto_info")
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
   */
  @ApiModelProperty(example = "a2S1N000000bKHgUAM", value = "Salesforce id for IO Terms and Conditions")
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
   */
  @ApiModelProperty(example = "The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", value = "Salesforce text for IO Terms and Conditions")
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
   */
  @ApiModelProperty(example = "a2S1N000000bKIOUA2", value = "Salesforce id for US Terms and Conditions")
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
   */
  @ApiModelProperty(example = "This Insertion Order (\"IO\") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", value = "Salesforce text for US Terms and Conditions")
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
   */
  @ApiModelProperty(example = "a2S1N000000bKHhUAM", value = "Salesforce id for Rest of the World Terms and Conditions")
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
   */
  @ApiModelProperty(example = "The IO is governed by the terms available at  https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement", value = "Salesforce text for Rest of the World Terms and Conditions")
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
   */
  @ApiModelProperty(example = "Pinterest Paper", value = "Insertion Order Type - Pinterest Paper or Agency Paper")
  public String getIoType() {
    return ioType;
  }

  public void setIoType(String ioType) {
    this.ioType = ioType;
  }

  public SSIOAccountItem addresses(List<SSIOAccountAddress> addresses) {
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
   */
  @ApiModelProperty(value = "Address information that is associated with this account.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

