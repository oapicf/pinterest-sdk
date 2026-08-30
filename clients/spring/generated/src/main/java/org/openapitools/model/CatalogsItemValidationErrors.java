package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsItemValidationDetails;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsItemValidationErrors
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsItemValidationErrors {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails ADULT_INVALID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails AVAILABILITY_INVALID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails DESCRIPTION_MISSING;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails DUPLICATE_PRODUCTS;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails IMAGE_LINK_INVALID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails IMAGE_LINK_MISSING;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails INVALID_DOMAIN;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails ITEMID_MISSING;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails LINK_FORMAT_INVALID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails LIST_PRICE_INVALID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails PARSE_LINE_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails PRICE_MISSING;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails PRODUCT_LINK_MISSING;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails PRODUCT_PRICE_INVALID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsItemValidationDetails TITLE_MISSING;

  public CatalogsItemValidationErrors ADULT_INVALID(@Nullable CatalogsItemValidationDetails ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
    return this;
  }

  /**
   * Item has an invalid adult value.
   * @return ADULT_INVALID
   */
  @Valid 
  @Schema(name = "ADULT_INVALID", description = "Item has an invalid adult value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADULT_INVALID")
  public @Nullable CatalogsItemValidationDetails getADULTINVALID() {
    return ADULT_INVALID;
  }

  @JsonProperty("ADULT_INVALID")
  public void setADULTINVALID(@Nullable CatalogsItemValidationDetails ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
  }

  public CatalogsItemValidationErrors ADWORDS_FORMAT_INVALID(@Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
    return this;
  }

  /**
   * Adword link contains too many characters.
   * @return ADWORDS_FORMAT_INVALID
   */
  @Valid 
  @Schema(name = "ADWORDS_FORMAT_INVALID", description = "Adword link contains too many characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADWORDS_FORMAT_INVALID")
  public @Nullable CatalogsItemValidationDetails getADWORDSFORMATINVALID() {
    return ADWORDS_FORMAT_INVALID;
  }

  @JsonProperty("ADWORDS_FORMAT_INVALID")
  public void setADWORDSFORMATINVALID(@Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
  }

  public CatalogsItemValidationErrors AVAILABILITY_INVALID(@Nullable CatalogsItemValidationDetails AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
    return this;
  }

  /**
   * Item is missing availability value in its product metadata, this item will not be published.
   * @return AVAILABILITY_INVALID
   */
  @Valid 
  @Schema(name = "AVAILABILITY_INVALID", description = "Item is missing availability value in its product metadata, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AVAILABILITY_INVALID")
  public @Nullable CatalogsItemValidationDetails getAVAILABILITYINVALID() {
    return AVAILABILITY_INVALID;
  }

  @JsonProperty("AVAILABILITY_INVALID")
  public void setAVAILABILITYINVALID(@Nullable CatalogsItemValidationDetails AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
  }

  public CatalogsItemValidationErrors BLOCKLISTED_IMAGE_SIGNATURE(@Nullable CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
    return this;
  }

  /**
   * Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
   * @return BLOCKLISTED_IMAGE_SIGNATURE
   */
  @Valid 
  @Schema(name = "BLOCKLISTED_IMAGE_SIGNATURE", description = "Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
  public @Nullable CatalogsItemValidationDetails getBLOCKLISTEDIMAGESIGNATURE() {
    return BLOCKLISTED_IMAGE_SIGNATURE;
  }

  @JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
  public void setBLOCKLISTEDIMAGESIGNATURE(@Nullable CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
  }

  public CatalogsItemValidationErrors DESCRIPTION_MISSING(@Nullable CatalogsItemValidationDetails DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
    return this;
  }

  /**
   * Item is missing description in its product metadata, this item will not be published.
   * @return DESCRIPTION_MISSING
   */
  @Valid 
  @Schema(name = "DESCRIPTION_MISSING", description = "Item is missing description in its product metadata, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DESCRIPTION_MISSING")
  public @Nullable CatalogsItemValidationDetails getDESCRIPTIONMISSING() {
    return DESCRIPTION_MISSING;
  }

  @JsonProperty("DESCRIPTION_MISSING")
  public void setDESCRIPTIONMISSING(@Nullable CatalogsItemValidationDetails DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
  }

  public CatalogsItemValidationErrors DUPLICATE_PRODUCTS(@Nullable CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
    return this;
  }

  /**
   * This product is duplicated. The duplicate entry will not be published.
   * @return DUPLICATE_PRODUCTS
   */
  @Valid 
  @Schema(name = "DUPLICATE_PRODUCTS", description = "This product is duplicated. The duplicate entry will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DUPLICATE_PRODUCTS")
  public @Nullable CatalogsItemValidationDetails getDUPLICATEPRODUCTS() {
    return DUPLICATE_PRODUCTS;
  }

  @JsonProperty("DUPLICATE_PRODUCTS")
  public void setDUPLICATEPRODUCTS(@Nullable CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
  }

  public CatalogsItemValidationErrors IMAGE_LINK_INVALID(@Nullable CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
    return this;
  }

  /**
   * Image link is invalid.
   * @return IMAGE_LINK_INVALID
   */
  @Valid 
  @Schema(name = "IMAGE_LINK_INVALID", description = "Image link is invalid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_INVALID")
  public @Nullable CatalogsItemValidationDetails getIMAGELINKINVALID() {
    return IMAGE_LINK_INVALID;
  }

  @JsonProperty("IMAGE_LINK_INVALID")
  public void setIMAGELINKINVALID(@Nullable CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
  }

  public CatalogsItemValidationErrors IMAGE_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Item has image_link URL that contains too many characters, so the item will not be published.
   * @return IMAGE_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "IMAGE_LINK_LENGTH_TOO_LONG", description = "Item has image_link URL that contains too many characters, so the item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getIMAGELINKLENGTHTOOLONG() {
    return IMAGE_LINK_LENGTH_TOO_LONG;
  }

  @JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
  public void setIMAGELINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationErrors IMAGE_LINK_MISSING(@Nullable CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
    return this;
  }

  /**
   * Item is missing an image link URL in its product metadata, this item will not be published.
   * @return IMAGE_LINK_MISSING
   */
  @Valid 
  @Schema(name = "IMAGE_LINK_MISSING", description = "Item is missing an image link URL in its product metadata, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_MISSING")
  public @Nullable CatalogsItemValidationDetails getIMAGELINKMISSING() {
    return IMAGE_LINK_MISSING;
  }

  @JsonProperty("IMAGE_LINK_MISSING")
  public void setIMAGELINKMISSING(@Nullable CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
  }

  public CatalogsItemValidationErrors INVALID_DOMAIN(@Nullable CatalogsItemValidationDetails INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
    return this;
  }

  /**
   * Product link value doesn't match the verified domain associated with this account.
   * @return INVALID_DOMAIN
   */
  @Valid 
  @Schema(name = "INVALID_DOMAIN", description = "Product link value doesn't match the verified domain associated with this account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("INVALID_DOMAIN")
  public @Nullable CatalogsItemValidationDetails getINVALIDDOMAIN() {
    return INVALID_DOMAIN;
  }

  @JsonProperty("INVALID_DOMAIN")
  public void setINVALIDDOMAIN(@Nullable CatalogsItemValidationDetails INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
  }

  public CatalogsItemValidationErrors ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE(@Nullable CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    return this;
  }

  /**
   * Main image can't be found.
   * @return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
   */
  @Valid 
  @Schema(name = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", description = "Main image can't be found.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
  public @Nullable CatalogsItemValidationDetails getITEMMAINIMAGEDOWNLOADFAILURE() {
    return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

  @JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
  public void setITEMMAINIMAGEDOWNLOADFAILURE(@Nullable CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

  public CatalogsItemValidationErrors ITEMID_MISSING(@Nullable CatalogsItemValidationDetails ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
    return this;
  }

  /**
   * Item is missing item id in its product metadata, this item will not be published.
   * @return ITEMID_MISSING
   */
  @Valid 
  @Schema(name = "ITEMID_MISSING", description = "Item is missing item id in its product metadata, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ITEMID_MISSING")
  public @Nullable CatalogsItemValidationDetails getITEMIDMISSING() {
    return ITEMID_MISSING;
  }

  @JsonProperty("ITEMID_MISSING")
  public void setITEMIDMISSING(@Nullable CatalogsItemValidationDetails ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
  }

  public CatalogsItemValidationErrors LINK_FORMAT_INVALID(@Nullable CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
    return this;
  }

  /**
   * Link is invalid.
   * @return LINK_FORMAT_INVALID
   */
  @Valid 
  @Schema(name = "LINK_FORMAT_INVALID", description = "Link is invalid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LINK_FORMAT_INVALID")
  public @Nullable CatalogsItemValidationDetails getLINKFORMATINVALID() {
    return LINK_FORMAT_INVALID;
  }

  @JsonProperty("LINK_FORMAT_INVALID")
  public void setLINKFORMATINVALID(@Nullable CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
  }

  public CatalogsItemValidationErrors LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Product link contains too many characters, this item will not be published.
   * @return LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "LINK_LENGTH_TOO_LONG", description = "Product link contains too many characters, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getLINKLENGTHTOOLONG() {
    return LINK_LENGTH_TOO_LONG;
  }

  @JsonProperty("LINK_LENGTH_TOO_LONG")
  public void setLINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationErrors LIST_PRICE_INVALID(@Nullable CatalogsItemValidationDetails LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
    return this;
  }

  /**
   * Item has a list price formatting error, this item will not be published.
   * @return LIST_PRICE_INVALID
   */
  @Valid 
  @Schema(name = "LIST_PRICE_INVALID", description = "Item has a list price formatting error, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LIST_PRICE_INVALID")
  public @Nullable CatalogsItemValidationDetails getLISTPRICEINVALID() {
    return LIST_PRICE_INVALID;
  }

  @JsonProperty("LIST_PRICE_INVALID")
  public void setLISTPRICEINVALID(@Nullable CatalogsItemValidationDetails LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
  }

  public CatalogsItemValidationErrors MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED(@Nullable CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    return this;
  }

  /**
   * Item exceed the maximum number of items per item group, this item will not be published.
   * @return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
   */
  @Valid 
  @Schema(name = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", description = "Item exceed the maximum number of items per item group, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
  public @Nullable CatalogsItemValidationDetails getMAXITEMSPERITEMGROUPEXCEEDED() {
    return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

  @JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
  public void setMAXITEMSPERITEMGROUPEXCEEDED(@Nullable CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

  public CatalogsItemValidationErrors PARSE_LINE_ERROR(@Nullable CatalogsItemValidationDetails PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
    return this;
  }

  /**
   * Item contains formating errors.
   * @return PARSE_LINE_ERROR
   */
  @Valid 
  @Schema(name = "PARSE_LINE_ERROR", description = "Item contains formating errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PARSE_LINE_ERROR")
  public @Nullable CatalogsItemValidationDetails getPARSELINEERROR() {
    return PARSE_LINE_ERROR;
  }

  @JsonProperty("PARSE_LINE_ERROR")
  public void setPARSELINEERROR(@Nullable CatalogsItemValidationDetails PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
  }

  public CatalogsItemValidationErrors PINJOIN_CONTENT_UNSAFE(@Nullable CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
    return this;
  }

  /**
   * Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
   * @return PINJOIN_CONTENT_UNSAFE
   */
  @Valid 
  @Schema(name = "PINJOIN_CONTENT_UNSAFE", description = "Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PINJOIN_CONTENT_UNSAFE")
  public @Nullable CatalogsItemValidationDetails getPINJOINCONTENTUNSAFE() {
    return PINJOIN_CONTENT_UNSAFE;
  }

  @JsonProperty("PINJOIN_CONTENT_UNSAFE")
  public void setPINJOINCONTENTUNSAFE(@Nullable CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
  }

  public CatalogsItemValidationErrors PRICE_CANNOT_BE_DETERMINED(@Nullable CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
    return this;
  }

  /**
   * Item price cannot be determined because the price, list price, and sale price are all different.
   * @return PRICE_CANNOT_BE_DETERMINED
   */
  @Valid 
  @Schema(name = "PRICE_CANNOT_BE_DETERMINED", description = "Item price cannot be determined because the price, list price, and sale price are all different.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRICE_CANNOT_BE_DETERMINED")
  public @Nullable CatalogsItemValidationDetails getPRICECANNOTBEDETERMINED() {
    return PRICE_CANNOT_BE_DETERMINED;
  }

  @JsonProperty("PRICE_CANNOT_BE_DETERMINED")
  public void setPRICECANNOTBEDETERMINED(@Nullable CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
  }

  public CatalogsItemValidationErrors PRICE_MISSING(@Nullable CatalogsItemValidationDetails PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
    return this;
  }

  /**
   * Product is missing a price, this item will not be published.
   * @return PRICE_MISSING
   */
  @Valid 
  @Schema(name = "PRICE_MISSING", description = "Product is missing a price, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRICE_MISSING")
  public @Nullable CatalogsItemValidationDetails getPRICEMISSING() {
    return PRICE_MISSING;
  }

  @JsonProperty("PRICE_MISSING")
  public void setPRICEMISSING(@Nullable CatalogsItemValidationDetails PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
  }

  public CatalogsItemValidationErrors PRODUCT_LINK_MISSING(@Nullable CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
    return this;
  }

  /**
   * Item is missing a link URL in its product metadata, this item will not be published.
   * @return PRODUCT_LINK_MISSING
   */
  @Valid 
  @Schema(name = "PRODUCT_LINK_MISSING", description = "Item is missing a link URL in its product metadata, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_LINK_MISSING")
  public @Nullable CatalogsItemValidationDetails getPRODUCTLINKMISSING() {
    return PRODUCT_LINK_MISSING;
  }

  @JsonProperty("PRODUCT_LINK_MISSING")
  public void setPRODUCTLINKMISSING(@Nullable CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
  }

  public CatalogsItemValidationErrors PRODUCT_PRICE_INVALID(@Nullable CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
    return this;
  }

  /**
   * Item has a price formatting error in its product metadata, this item will not be published.
   * @return PRODUCT_PRICE_INVALID
   */
  @Valid 
  @Schema(name = "PRODUCT_PRICE_INVALID", description = "Item has a price formatting error in its product metadata, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_PRICE_INVALID")
  public @Nullable CatalogsItemValidationDetails getPRODUCTPRICEINVALID() {
    return PRODUCT_PRICE_INVALID;
  }

  @JsonProperty("PRODUCT_PRICE_INVALID")
  public void setPRODUCTPRICEINVALID(@Nullable CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
  }

  public CatalogsItemValidationErrors TITLE_MISSING(@Nullable CatalogsItemValidationDetails TITLE_MISSING) {
    this.TITLE_MISSING = TITLE_MISSING;
    return this;
  }

  /**
   * Item is missing title in its product metadata, this item will not be published.
   * @return TITLE_MISSING
   */
  @Valid 
  @Schema(name = "TITLE_MISSING", description = "Item is missing title in its product metadata, this item will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TITLE_MISSING")
  public @Nullable CatalogsItemValidationDetails getTITLEMISSING() {
    return TITLE_MISSING;
  }

  @JsonProperty("TITLE_MISSING")
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
        Objects.equals(this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, catalogsItemValidationErrors.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(this.ITEMID_MISSING, catalogsItemValidationErrors.ITEMID_MISSING) &&
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
    return Objects.hash(ADULT_INVALID, ADWORDS_FORMAT_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, INVALID_DOMAIN, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, TITLE_MISSING);
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
    sb.append("    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    ITEMID_MISSING: ").append(toIndentedString(ITEMID_MISSING)).append("\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

