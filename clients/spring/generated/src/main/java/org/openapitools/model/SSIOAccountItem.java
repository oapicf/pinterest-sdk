package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountAddress;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SSIOAccountItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SSIOAccountItem {

  @Valid
  private List<@Valid SSIOAccountAddress> addresses = new ArrayList<>();

  private @Nullable String id;

  private @Nullable String ioTerms;

  private @Nullable String ioTermsId;

  private @Nullable String ioType;

  private @Nullable String rowTerms;

  private @Nullable String rowTermsId;

  private @Nullable String usTerms;

  private @Nullable String usTermsId;

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
   */
  @Valid 
  @Schema(name = "addresses", description = "Address information that is associated with this account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses")
  public List<@Valid SSIOAccountAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<@Valid SSIOAccountAddress> addresses) {
    this.addresses = addresses;
  }

  public SSIOAccountItem id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Salesforce id for billto_info
   * @return id
   */
  
  @Schema(name = "id", example = "0011N00001LW8kAQAT", description = "Salesforce id for billto_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public SSIOAccountItem ioTerms(@Nullable String ioTerms) {
    this.ioTerms = ioTerms;
    return this;
  }

  /**
   * Salesforce text for IO Terms and Conditions
   * @return ioTerms
   */
  
  @Schema(name = "io_terms", example = "The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", description = "Salesforce text for IO Terms and Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("io_terms")
  public @Nullable String getIoTerms() {
    return ioTerms;
  }

  public void setIoTerms(@Nullable String ioTerms) {
    this.ioTerms = ioTerms;
  }

  public SSIOAccountItem ioTermsId(@Nullable String ioTermsId) {
    this.ioTermsId = ioTermsId;
    return this;
  }

  /**
   * Salesforce id for IO Terms and Conditions
   * @return ioTermsId
   */
  
  @Schema(name = "io_terms_id", example = "a2S1N000000bKHgUAM", description = "Salesforce id for IO Terms and Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("io_terms_id")
  public @Nullable String getIoTermsId() {
    return ioTermsId;
  }

  public void setIoTermsId(@Nullable String ioTermsId) {
    this.ioTermsId = ioTermsId;
  }

  public SSIOAccountItem ioType(@Nullable String ioType) {
    this.ioType = ioType;
    return this;
  }

  /**
   * Insertion Order Type - Pinterest Paper or Agency Paper
   * @return ioType
   */
  
  @Schema(name = "io_type", example = "Pinterest Paper", description = "Insertion Order Type - Pinterest Paper or Agency Paper", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("io_type")
  public @Nullable String getIoType() {
    return ioType;
  }

  public void setIoType(@Nullable String ioType) {
    this.ioType = ioType;
  }

  public SSIOAccountItem rowTerms(@Nullable String rowTerms) {
    this.rowTerms = rowTerms;
    return this;
  }

  /**
   * Salesforce text for Rest of the World Terms and Conditions
   * @return rowTerms
   */
  
  @Schema(name = "row_terms", example = "The IO is governed by the terms available at  https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement", description = "Salesforce text for Rest of the World Terms and Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("row_terms")
  public @Nullable String getRowTerms() {
    return rowTerms;
  }

  public void setRowTerms(@Nullable String rowTerms) {
    this.rowTerms = rowTerms;
  }

  public SSIOAccountItem rowTermsId(@Nullable String rowTermsId) {
    this.rowTermsId = rowTermsId;
    return this;
  }

  /**
   * Salesforce id for Rest of the World Terms and Conditions
   * @return rowTermsId
   */
  
  @Schema(name = "row_terms_id", example = "a2S1N000000bKHhUAM", description = "Salesforce id for Rest of the World Terms and Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("row_terms_id")
  public @Nullable String getRowTermsId() {
    return rowTermsId;
  }

  public void setRowTermsId(@Nullable String rowTermsId) {
    this.rowTermsId = rowTermsId;
  }

  public SSIOAccountItem usTerms(@Nullable String usTerms) {
    this.usTerms = usTerms;
    return this;
  }

  /**
   * Salesforce text for US Terms and Conditions
   * @return usTerms
   */
  
  @Schema(name = "us_terms", example = "This Insertion Order (\"IO\") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", description = "Salesforce text for US Terms and Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("us_terms")
  public @Nullable String getUsTerms() {
    return usTerms;
  }

  public void setUsTerms(@Nullable String usTerms) {
    this.usTerms = usTerms;
  }

  public SSIOAccountItem usTermsId(@Nullable String usTermsId) {
    this.usTermsId = usTermsId;
    return this;
  }

  /**
   * Salesforce id for US Terms and Conditions
   * @return usTermsId
   */
  
  @Schema(name = "us_terms_id", example = "a2S1N000000bKIOUA2", description = "Salesforce id for US Terms and Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("us_terms_id")
  public @Nullable String getUsTermsId() {
    return usTermsId;
  }

  public void setUsTermsId(@Nullable String usTermsId) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

