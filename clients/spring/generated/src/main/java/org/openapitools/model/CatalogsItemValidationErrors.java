package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsItemValidationDetails;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsItemValidationErrors
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsItemValidationErrors {

  private @Nullable CatalogsItemValidationDetails ADULT_INVALID;

  private @Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID;

  private @Nullable CatalogsItemValidationDetails AVAILABILITY_INVALID;

  private @Nullable CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE;

  private @Nullable CatalogsItemValidationDetails DESCRIPTION_MISSING;

  private @Nullable CatalogsItemValidationDetails DUPLICATE_PRODUCTS;

  private @Nullable CatalogsItemValidationDetails IMAGE_LINK_INVALID;

  private @Nullable CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails IMAGE_LINK_MISSING;

  private @Nullable CatalogsItemValidationDetails INVALID_DOMAIN;

  private @Nullable CatalogsItemValidationDetails ITEMID_MISSING;

  private @Nullable CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

  private @Nullable CatalogsItemValidationDetails LINK_FORMAT_INVALID;

  private @Nullable CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails LIST_PRICE_INVALID;

  private @Nullable CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

  private @Nullable CatalogsItemValidationDetails PARSE_LINE_ERROR;

  private @Nullable CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE;

  private @Nullable CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED;

  private @Nullable CatalogsItemValidationDetails PRICE_MISSING;

  private @Nullable CatalogsItemValidationDetails PRODUCT_LINK_MISSING;

  private @Nullable CatalogsItemValidationDetails PRODUCT_PRICE_INVALID;

  private @Nullable CatalogsItemValidationDetails TITLE_MISSING;

  public CatalogsItemValidationErrors ADULT_INVALID(@Nullable CatalogsItemValidationDetails ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
    return this;
  }

  /**
   * Get ADULT_INVALID
   * @return ADULT_INVALID
   */
  @Valid 
  @Schema(name = "ADULT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADULT_INVALID")
  public @Nullable CatalogsItemValidationDetails getADULTINVALID() {
    return ADULT_INVALID;
  }

  public void setADULTINVALID(@Nullable CatalogsItemValidationDetails ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
  }

  public CatalogsItemValidationErrors ADWORDS_FORMAT_INVALID(@Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
    return this;
  }

  /**
   * Get ADWORDS_FORMAT_INVALID
   * @return ADWORDS_FORMAT_INVALID
   */
  @Valid 
  @Schema(name = "ADWORDS_FORMAT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADWORDS_FORMAT_INVALID")
  public @Nullable CatalogsItemValidationDetails getADWORDSFORMATINVALID() {
    return ADWORDS_FORMAT_INVALID;
  }

  public void setADWORDSFORMATINVALID(@Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
  }

  public CatalogsItemValidationErrors AVAILABILITY_INVALID(@Nullable CatalogsItemValidationDetails AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
    return this;
  }

  /**
   * Get AVAILABILITY_INVALID
   * @return AVAILABILITY_INVALID
   */
  @Valid 
  @Schema(name = "AVAILABILITY_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AVAILABILITY_INVALID")
  public @Nullable CatalogsItemValidationDetails getAVAILABILITYINVALID() {
    return AVAILABILITY_INVALID;
  }

  public void setAVAILABILITYINVALID(@Nullable CatalogsItemValidationDetails AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
  }

  public CatalogsItemValidationErrors BLOCKLISTED_IMAGE_SIGNATURE(@Nullable CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
    return this;
  }

  /**
   * Get BLOCKLISTED_IMAGE_SIGNATURE
   * @return BLOCKLISTED_IMAGE_SIGNATURE
   */
  @Valid 
  @Schema(name = "BLOCKLISTED_IMAGE_SIGNATURE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
  public @Nullable CatalogsItemValidationDetails getBLOCKLISTEDIMAGESIGNATURE() {
    return BLOCKLISTED_IMAGE_SIGNATURE;
  }

  public void setBLOCKLISTEDIMAGESIGNATURE(@Nullable CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
  }

  public CatalogsItemValidationErrors DESCRIPTION_MISSING(@Nullable CatalogsItemValidationDetails DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
    return this;
  }

  /**
   * Get DESCRIPTION_MISSING
   * @return DESCRIPTION_MISSING
   */
  @Valid 
  @Schema(name = "DESCRIPTION_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DESCRIPTION_MISSING")
  public @Nullable CatalogsItemValidationDetails getDESCRIPTIONMISSING() {
    return DESCRIPTION_MISSING;
  }

  public void setDESCRIPTIONMISSING(@Nullable CatalogsItemValidationDetails DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
  }

  public CatalogsItemValidationErrors DUPLICATE_PRODUCTS(@Nullable CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
    return this;
  }

  /**
   * Get DUPLICATE_PRODUCTS
   * @return DUPLICATE_PRODUCTS
   */
  @Valid 
  @Schema(name = "DUPLICATE_PRODUCTS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DUPLICATE_PRODUCTS")
  public @Nullable CatalogsItemValidationDetails getDUPLICATEPRODUCTS() {
    return DUPLICATE_PRODUCTS;
  }

  public void setDUPLICATEPRODUCTS(@Nullable CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
  }

  public CatalogsItemValidationErrors IMAGE_LINK_INVALID(@Nullable CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
    return this;
  }

  /**
   * Get IMAGE_LINK_INVALID
   * @return IMAGE_LINK_INVALID
   */
  @Valid 
  @Schema(name = "IMAGE_LINK_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_INVALID")
  public @Nullable CatalogsItemValidationDetails getIMAGELINKINVALID() {
    return IMAGE_LINK_INVALID;
  }

  public void setIMAGELINKINVALID(@Nullable CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
  }

  public CatalogsItemValidationErrors IMAGE_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get IMAGE_LINK_LENGTH_TOO_LONG
   * @return IMAGE_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "IMAGE_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getIMAGELINKLENGTHTOOLONG() {
    return IMAGE_LINK_LENGTH_TOO_LONG;
  }

  public void setIMAGELINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationErrors IMAGE_LINK_MISSING(@Nullable CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
    return this;
  }

  /**
   * Get IMAGE_LINK_MISSING
   * @return IMAGE_LINK_MISSING
   */
  @Valid 
  @Schema(name = "IMAGE_LINK_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_MISSING")
  public @Nullable CatalogsItemValidationDetails getIMAGELINKMISSING() {
    return IMAGE_LINK_MISSING;
  }

  public void setIMAGELINKMISSING(@Nullable CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
  }

  public CatalogsItemValidationErrors INVALID_DOMAIN(@Nullable CatalogsItemValidationDetails INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
    return this;
  }

  /**
   * Get INVALID_DOMAIN
   * @return INVALID_DOMAIN
   */
  @Valid 
  @Schema(name = "INVALID_DOMAIN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("INVALID_DOMAIN")
  public @Nullable CatalogsItemValidationDetails getINVALIDDOMAIN() {
    return INVALID_DOMAIN;
  }

  public void setINVALIDDOMAIN(@Nullable CatalogsItemValidationDetails INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
  }

  public CatalogsItemValidationErrors ITEMID_MISSING(@Nullable CatalogsItemValidationDetails ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
    return this;
  }

  /**
   * Get ITEMID_MISSING
   * @return ITEMID_MISSING
   */
  @Valid 
  @Schema(name = "ITEMID_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ITEMID_MISSING")
  public @Nullable CatalogsItemValidationDetails getITEMIDMISSING() {
    return ITEMID_MISSING;
  }

  public void setITEMIDMISSING(@Nullable CatalogsItemValidationDetails ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
  }

  public CatalogsItemValidationErrors ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE(@Nullable CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    return this;
  }

  /**
   * Get ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
   * @return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
   */
  @Valid 
  @Schema(name = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
  public @Nullable CatalogsItemValidationDetails getITEMMAINIMAGEDOWNLOADFAILURE() {
    return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

  public void setITEMMAINIMAGEDOWNLOADFAILURE(@Nullable CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

  public CatalogsItemValidationErrors LINK_FORMAT_INVALID(@Nullable CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
    return this;
  }

  /**
   * Get LINK_FORMAT_INVALID
   * @return LINK_FORMAT_INVALID
   */
  @Valid 
  @Schema(name = "LINK_FORMAT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LINK_FORMAT_INVALID")
  public @Nullable CatalogsItemValidationDetails getLINKFORMATINVALID() {
    return LINK_FORMAT_INVALID;
  }

  public void setLINKFORMATINVALID(@Nullable CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
  }

  public CatalogsItemValidationErrors LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get LINK_LENGTH_TOO_LONG
   * @return LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getLINKLENGTHTOOLONG() {
    return LINK_LENGTH_TOO_LONG;
  }

  public void setLINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationErrors LIST_PRICE_INVALID(@Nullable CatalogsItemValidationDetails LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
    return this;
  }

  /**
   * Get LIST_PRICE_INVALID
   * @return LIST_PRICE_INVALID
   */
  @Valid 
  @Schema(name = "LIST_PRICE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LIST_PRICE_INVALID")
  public @Nullable CatalogsItemValidationDetails getLISTPRICEINVALID() {
    return LIST_PRICE_INVALID;
  }

  public void setLISTPRICEINVALID(@Nullable CatalogsItemValidationDetails LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
  }

  public CatalogsItemValidationErrors MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED(@Nullable CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    return this;
  }

  /**
   * Get MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
   * @return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
   */
  @Valid 
  @Schema(name = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
  public @Nullable CatalogsItemValidationDetails getMAXITEMSPERITEMGROUPEXCEEDED() {
    return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

  public void setMAXITEMSPERITEMGROUPEXCEEDED(@Nullable CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

  public CatalogsItemValidationErrors PARSE_LINE_ERROR(@Nullable CatalogsItemValidationDetails PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
    return this;
  }

  /**
   * Get PARSE_LINE_ERROR
   * @return PARSE_LINE_ERROR
   */
  @Valid 
  @Schema(name = "PARSE_LINE_ERROR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PARSE_LINE_ERROR")
  public @Nullable CatalogsItemValidationDetails getPARSELINEERROR() {
    return PARSE_LINE_ERROR;
  }

  public void setPARSELINEERROR(@Nullable CatalogsItemValidationDetails PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
  }

  public CatalogsItemValidationErrors PINJOIN_CONTENT_UNSAFE(@Nullable CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
    return this;
  }

  /**
   * Get PINJOIN_CONTENT_UNSAFE
   * @return PINJOIN_CONTENT_UNSAFE
   */
  @Valid 
  @Schema(name = "PINJOIN_CONTENT_UNSAFE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PINJOIN_CONTENT_UNSAFE")
  public @Nullable CatalogsItemValidationDetails getPINJOINCONTENTUNSAFE() {
    return PINJOIN_CONTENT_UNSAFE;
  }

  public void setPINJOINCONTENTUNSAFE(@Nullable CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
  }

  public CatalogsItemValidationErrors PRICE_CANNOT_BE_DETERMINED(@Nullable CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
    return this;
  }

  /**
   * Get PRICE_CANNOT_BE_DETERMINED
   * @return PRICE_CANNOT_BE_DETERMINED
   */
  @Valid 
  @Schema(name = "PRICE_CANNOT_BE_DETERMINED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRICE_CANNOT_BE_DETERMINED")
  public @Nullable CatalogsItemValidationDetails getPRICECANNOTBEDETERMINED() {
    return PRICE_CANNOT_BE_DETERMINED;
  }

  public void setPRICECANNOTBEDETERMINED(@Nullable CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
  }

  public CatalogsItemValidationErrors PRICE_MISSING(@Nullable CatalogsItemValidationDetails PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
    return this;
  }

  /**
   * Get PRICE_MISSING
   * @return PRICE_MISSING
   */
  @Valid 
  @Schema(name = "PRICE_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRICE_MISSING")
  public @Nullable CatalogsItemValidationDetails getPRICEMISSING() {
    return PRICE_MISSING;
  }

  public void setPRICEMISSING(@Nullable CatalogsItemValidationDetails PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
  }

  public CatalogsItemValidationErrors PRODUCT_LINK_MISSING(@Nullable CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
    return this;
  }

  /**
   * Get PRODUCT_LINK_MISSING
   * @return PRODUCT_LINK_MISSING
   */
  @Valid 
  @Schema(name = "PRODUCT_LINK_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_LINK_MISSING")
  public @Nullable CatalogsItemValidationDetails getPRODUCTLINKMISSING() {
    return PRODUCT_LINK_MISSING;
  }

  public void setPRODUCTLINKMISSING(@Nullable CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
  }

  public CatalogsItemValidationErrors PRODUCT_PRICE_INVALID(@Nullable CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
    return this;
  }

  /**
   * Get PRODUCT_PRICE_INVALID
   * @return PRODUCT_PRICE_INVALID
   */
  @Valid 
  @Schema(name = "PRODUCT_PRICE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_PRICE_INVALID")
  public @Nullable CatalogsItemValidationDetails getPRODUCTPRICEINVALID() {
    return PRODUCT_PRICE_INVALID;
  }

  public void setPRODUCTPRICEINVALID(@Nullable CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
  }

  public CatalogsItemValidationErrors TITLE_MISSING(@Nullable CatalogsItemValidationDetails TITLE_MISSING) {
    this.TITLE_MISSING = TITLE_MISSING;
    return this;
  }

  /**
   * Get TITLE_MISSING
   * @return TITLE_MISSING
   */
  @Valid 
  @Schema(name = "TITLE_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TITLE_MISSING")
  public @Nullable CatalogsItemValidationDetails getTITLEMISSING() {
    return TITLE_MISSING;
  }

  public void setTITLEMISSING(@Nullable CatalogsItemValidationDetails TITLE_MISSING) {
    this.TITLE_MISSING = TITLE_MISSING;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemValidationErrors catalogsItemValidationErrors = (CatalogsItemValidationErrors) o;
    return Objects.equals(this.ADULT_INVALID, catalogsItemValidationErrors.ADULT_INVALID) &&
        Objects.equals(this.ADWORDS_FORMAT_INVALID, catalogsItemValidationErrors.ADWORDS_FORMAT_INVALID) &&
        Objects.equals(this.AVAILABILITY_INVALID, catalogsItemValidationErrors.AVAILABILITY_INVALID) &&
        Objects.equals(this.BLOCKLISTED_IMAGE_SIGNATURE, catalogsItemValidationErrors.BLOCKLISTED_IMAGE_SIGNATURE) &&
        Objects.equals(this.DESCRIPTION_MISSING, catalogsItemValidationErrors.DESCRIPTION_MISSING) &&
        Objects.equals(this.DUPLICATE_PRODUCTS, catalogsItemValidationErrors.DUPLICATE_PRODUCTS) &&
        Objects.equals(this.IMAGE_LINK_INVALID, catalogsItemValidationErrors.IMAGE_LINK_INVALID) &&
        Objects.equals(this.IMAGE_LINK_LENGTH_TOO_LONG, catalogsItemValidationErrors.IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.IMAGE_LINK_MISSING, catalogsItemValidationErrors.IMAGE_LINK_MISSING) &&
        Objects.equals(this.INVALID_DOMAIN, catalogsItemValidationErrors.INVALID_DOMAIN) &&
        Objects.equals(this.ITEMID_MISSING, catalogsItemValidationErrors.ITEMID_MISSING) &&
        Objects.equals(this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, catalogsItemValidationErrors.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(this.LINK_FORMAT_INVALID, catalogsItemValidationErrors.LINK_FORMAT_INVALID) &&
        Objects.equals(this.LINK_LENGTH_TOO_LONG, catalogsItemValidationErrors.LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.LIST_PRICE_INVALID, catalogsItemValidationErrors.LIST_PRICE_INVALID) &&
        Objects.equals(this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, catalogsItemValidationErrors.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) &&
        Objects.equals(this.PARSE_LINE_ERROR, catalogsItemValidationErrors.PARSE_LINE_ERROR) &&
        Objects.equals(this.PINJOIN_CONTENT_UNSAFE, catalogsItemValidationErrors.PINJOIN_CONTENT_UNSAFE) &&
        Objects.equals(this.PRICE_CANNOT_BE_DETERMINED, catalogsItemValidationErrors.PRICE_CANNOT_BE_DETERMINED) &&
        Objects.equals(this.PRICE_MISSING, catalogsItemValidationErrors.PRICE_MISSING) &&
        Objects.equals(this.PRODUCT_LINK_MISSING, catalogsItemValidationErrors.PRODUCT_LINK_MISSING) &&
        Objects.equals(this.PRODUCT_PRICE_INVALID, catalogsItemValidationErrors.PRODUCT_PRICE_INVALID) &&
        Objects.equals(this.TITLE_MISSING, catalogsItemValidationErrors.TITLE_MISSING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADULT_INVALID, ADWORDS_FORMAT_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, INVALID_DOMAIN, ITEMID_MISSING, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, LINK_FORMAT_INVALID, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, TITLE_MISSING);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationErrors {\n");
    sb.append("    ADULT_INVALID: ").append(toIndentedString(ADULT_INVALID)).append("\n");
    sb.append("    ADWORDS_FORMAT_INVALID: ").append(toIndentedString(ADWORDS_FORMAT_INVALID)).append("\n");
    sb.append("    AVAILABILITY_INVALID: ").append(toIndentedString(AVAILABILITY_INVALID)).append("\n");
    sb.append("    BLOCKLISTED_IMAGE_SIGNATURE: ").append(toIndentedString(BLOCKLISTED_IMAGE_SIGNATURE)).append("\n");
    sb.append("    DESCRIPTION_MISSING: ").append(toIndentedString(DESCRIPTION_MISSING)).append("\n");
    sb.append("    DUPLICATE_PRODUCTS: ").append(toIndentedString(DUPLICATE_PRODUCTS)).append("\n");
    sb.append("    IMAGE_LINK_INVALID: ").append(toIndentedString(IMAGE_LINK_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    IMAGE_LINK_MISSING: ").append(toIndentedString(IMAGE_LINK_MISSING)).append("\n");
    sb.append("    INVALID_DOMAIN: ").append(toIndentedString(INVALID_DOMAIN)).append("\n");
    sb.append("    ITEMID_MISSING: ").append(toIndentedString(ITEMID_MISSING)).append("\n");
    sb.append("    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    LINK_FORMAT_INVALID: ").append(toIndentedString(LINK_FORMAT_INVALID)).append("\n");
    sb.append("    LINK_LENGTH_TOO_LONG: ").append(toIndentedString(LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    LIST_PRICE_INVALID: ").append(toIndentedString(LIST_PRICE_INVALID)).append("\n");
    sb.append("    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: ").append(toIndentedString(MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)).append("\n");
    sb.append("    PARSE_LINE_ERROR: ").append(toIndentedString(PARSE_LINE_ERROR)).append("\n");
    sb.append("    PINJOIN_CONTENT_UNSAFE: ").append(toIndentedString(PINJOIN_CONTENT_UNSAFE)).append("\n");
    sb.append("    PRICE_CANNOT_BE_DETERMINED: ").append(toIndentedString(PRICE_CANNOT_BE_DETERMINED)).append("\n");
    sb.append("    PRICE_MISSING: ").append(toIndentedString(PRICE_MISSING)).append("\n");
    sb.append("    PRODUCT_LINK_MISSING: ").append(toIndentedString(PRODUCT_LINK_MISSING)).append("\n");
    sb.append("    PRODUCT_PRICE_INVALID: ").append(toIndentedString(PRODUCT_PRICE_INVALID)).append("\n");
    sb.append("    TITLE_MISSING: ").append(toIndentedString(TITLE_MISSING)).append("\n");
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

