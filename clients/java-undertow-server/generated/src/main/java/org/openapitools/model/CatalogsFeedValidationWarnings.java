/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsFeedValidationWarnings   {
  
  private Integer AD_IMAGE_0_LINK_DUPLICATED;
  private Integer AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_0_LINK_REQUIRED;
  private Integer AD_IMAGE_0_LINK_WARNING;
  private Integer AD_IMAGE_0_TAG_DUPLICATED;
  private Integer AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_0_TAG_REQUIRED;
  private Integer AD_IMAGE_10_LINK_DUPLICATED;
  private Integer AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_10_LINK_REQUIRED;
  private Integer AD_IMAGE_10_LINK_WARNING;
  private Integer AD_IMAGE_10_TAG_DUPLICATED;
  private Integer AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_10_TAG_REQUIRED;
  private Integer AD_IMAGE_11_LINK_DUPLICATED;
  private Integer AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_11_LINK_REQUIRED;
  private Integer AD_IMAGE_11_LINK_WARNING;
  private Integer AD_IMAGE_11_TAG_DUPLICATED;
  private Integer AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_11_TAG_REQUIRED;
  private Integer AD_IMAGE_12_LINK_DUPLICATED;
  private Integer AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_12_LINK_REQUIRED;
  private Integer AD_IMAGE_12_LINK_WARNING;
  private Integer AD_IMAGE_12_TAG_DUPLICATED;
  private Integer AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_12_TAG_REQUIRED;
  private Integer AD_IMAGE_13_LINK_DUPLICATED;
  private Integer AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_13_LINK_REQUIRED;
  private Integer AD_IMAGE_13_LINK_WARNING;
  private Integer AD_IMAGE_13_TAG_DUPLICATED;
  private Integer AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_13_TAG_REQUIRED;
  private Integer AD_IMAGE_14_LINK_DUPLICATED;
  private Integer AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_14_LINK_REQUIRED;
  private Integer AD_IMAGE_14_LINK_WARNING;
  private Integer AD_IMAGE_14_TAG_DUPLICATED;
  private Integer AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_14_TAG_REQUIRED;
  private Integer AD_IMAGE_15_LINK_DUPLICATED;
  private Integer AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_15_LINK_REQUIRED;
  private Integer AD_IMAGE_15_LINK_WARNING;
  private Integer AD_IMAGE_15_TAG_DUPLICATED;
  private Integer AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_15_TAG_REQUIRED;
  private Integer AD_IMAGE_16_LINK_DUPLICATED;
  private Integer AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_16_LINK_REQUIRED;
  private Integer AD_IMAGE_16_LINK_WARNING;
  private Integer AD_IMAGE_16_TAG_DUPLICATED;
  private Integer AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_16_TAG_REQUIRED;
  private Integer AD_IMAGE_17_LINK_DUPLICATED;
  private Integer AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_17_LINK_REQUIRED;
  private Integer AD_IMAGE_17_LINK_WARNING;
  private Integer AD_IMAGE_17_TAG_DUPLICATED;
  private Integer AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_17_TAG_REQUIRED;
  private Integer AD_IMAGE_18_LINK_DUPLICATED;
  private Integer AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_18_LINK_REQUIRED;
  private Integer AD_IMAGE_18_LINK_WARNING;
  private Integer AD_IMAGE_18_TAG_DUPLICATED;
  private Integer AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_18_TAG_REQUIRED;
  private Integer AD_IMAGE_19_LINK_DUPLICATED;
  private Integer AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_19_LINK_REQUIRED;
  private Integer AD_IMAGE_19_LINK_WARNING;
  private Integer AD_IMAGE_19_TAG_DUPLICATED;
  private Integer AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_19_TAG_REQUIRED;
  private Integer AD_IMAGE_1_LINK_DUPLICATED;
  private Integer AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_1_LINK_REQUIRED;
  private Integer AD_IMAGE_1_LINK_WARNING;
  private Integer AD_IMAGE_1_TAG_DUPLICATED;
  private Integer AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_1_TAG_REQUIRED;
  private Integer AD_IMAGE_2_LINK_DUPLICATED;
  private Integer AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_2_LINK_REQUIRED;
  private Integer AD_IMAGE_2_LINK_WARNING;
  private Integer AD_IMAGE_2_TAG_DUPLICATED;
  private Integer AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_2_TAG_REQUIRED;
  private Integer AD_IMAGE_3_LINK_DUPLICATED;
  private Integer AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_3_LINK_REQUIRED;
  private Integer AD_IMAGE_3_LINK_WARNING;
  private Integer AD_IMAGE_3_TAG_DUPLICATED;
  private Integer AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_3_TAG_REQUIRED;
  private Integer AD_IMAGE_4_LINK_DUPLICATED;
  private Integer AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_4_LINK_REQUIRED;
  private Integer AD_IMAGE_4_LINK_WARNING;
  private Integer AD_IMAGE_4_TAG_DUPLICATED;
  private Integer AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_4_TAG_REQUIRED;
  private Integer AD_IMAGE_5_LINK_DUPLICATED;
  private Integer AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_5_LINK_REQUIRED;
  private Integer AD_IMAGE_5_LINK_WARNING;
  private Integer AD_IMAGE_5_TAG_DUPLICATED;
  private Integer AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_5_TAG_REQUIRED;
  private Integer AD_IMAGE_6_LINK_DUPLICATED;
  private Integer AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_6_LINK_REQUIRED;
  private Integer AD_IMAGE_6_LINK_WARNING;
  private Integer AD_IMAGE_6_TAG_DUPLICATED;
  private Integer AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_6_TAG_REQUIRED;
  private Integer AD_IMAGE_7_LINK_DUPLICATED;
  private Integer AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_7_LINK_REQUIRED;
  private Integer AD_IMAGE_7_LINK_WARNING;
  private Integer AD_IMAGE_7_TAG_DUPLICATED;
  private Integer AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_7_TAG_REQUIRED;
  private Integer AD_IMAGE_8_LINK_DUPLICATED;
  private Integer AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_8_LINK_REQUIRED;
  private Integer AD_IMAGE_8_LINK_WARNING;
  private Integer AD_IMAGE_8_TAG_DUPLICATED;
  private Integer AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_8_TAG_REQUIRED;
  private Integer AD_IMAGE_9_LINK_DUPLICATED;
  private Integer AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_9_LINK_REQUIRED;
  private Integer AD_IMAGE_9_LINK_WARNING;
  private Integer AD_IMAGE_9_TAG_DUPLICATED;
  private Integer AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
  private Integer AD_IMAGE_9_TAG_REQUIRED;
  private Integer AD_LINK_FORMAT_WARNING;
  private Integer AD_LINK_SAME_AS_LINK;
  private Integer AD_VIDEO_0_LINK_DUPLICATED;
  private Integer AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
  private Integer AD_VIDEO_0_LINK_REQUIRED;
  private Integer AD_VIDEO_0_LINK_WARNING;
  private Integer AD_VIDEO_0_TAG_DUPLICATED;
  private Integer AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
  private Integer AD_VIDEO_0_TAG_REQUIRED;
  private Integer AD_VIDEO_1_LINK_DUPLICATED;
  private Integer AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
  private Integer AD_VIDEO_1_LINK_REQUIRED;
  private Integer AD_VIDEO_1_LINK_WARNING;
  private Integer AD_VIDEO_1_TAG_DUPLICATED;
  private Integer AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
  private Integer AD_VIDEO_1_TAG_REQUIRED;
  private Integer AD_VIDEO_2_LINK_DUPLICATED;
  private Integer AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
  private Integer AD_VIDEO_2_LINK_REQUIRED;
  private Integer AD_VIDEO_2_LINK_WARNING;
  private Integer AD_VIDEO_2_TAG_DUPLICATED;
  private Integer AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
  private Integer AD_VIDEO_2_TAG_REQUIRED;
  private Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  private Integer ADDITIONAL_IMAGE_LINK_WARNING;
  private Integer ADWORDS_FORMAT_WARNING;
  private Integer ADWORDS_SAME_AS_LINK;
  private Integer AGE_GROUP_INVALID;
  private Integer ANDROID_DEEP_LINK_INVALID;
  private Integer AVAILABILITY_DATE_INVALID;
  private Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  private Integer CUSTOM_LABEL_LENGTH_TOO_LONG;
  private Integer DESCRIPTION_LENGTH_TOO_LONG;
  private Integer DUPLICATE_HEADERS;
  private Integer EXPIRATION_DATE_INVALID;


  public enum FETCHSAMESIGNATUREEnum {
    NUMBER_1(1);

    private String value;

    FETCHSAMESIGNATUREEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE;
  private Integer GENDER_INVALID;
  private Integer GTIN_INVALID;
  private Integer IMAGE_LINK_WARNING;
  private Integer INCONSISTENT_CURRENCY_VALUES;
  private Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  private Integer IOS_DEEP_LINK_INVALID;
  private Integer IS_BUNDLE_INVALID;
  private Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  private Integer LINK_FORMAT_WARNING;
  private Integer MIN_AD_PRICE_INVALID;
  private Integer MPN_INVALID;
  private Integer MULTIPACK_INVALID;
  private Integer OPTIONAL_CONDITION_INVALID;
  private Integer OPTIONAL_CONDITION_MISSING;
  private Integer OPTIONAL_PRODUCT_CATEGORY_INVALID;
  private Integer OPTIONAL_PRODUCT_CATEGORY_MISSING;
  private Integer PRODUCT_CATEGORY_DEPTH_WARNING;
  private Integer PRODUCT_TYPE_LENGTH_TOO_LONG;
  private Integer SALE_DATE_INVALID;
  private Integer SALES_PRICE_INVALID;
  private Integer SALES_PRICE_TOO_HIGH;
  private Integer SALES_PRICE_TOO_LOW;
  private Integer SHIPPING_HEIGHT_INVALID;
  private Integer SHIPPING_INVALID;
  private Integer SHIPPING_WEIGHT_INVALID;
  private Integer SHIPPING_WIDTH_INVALID;
  private Integer SIZE_SYSTEM_INVALID;
  private Integer SIZE_TYPE_INVALID;
  private Integer TAX_INVALID;
  private Integer TITLE_LENGTH_TOO_LONG;
  private Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  private Integer UPDATED_TIME_INVALID;
  private Integer UTM_SOURCE_AUTO_CORRECTED;
  private Integer VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
  private Integer WEIGHT_UNIT_INVALID;

  /**
   * ad_image_0_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_DUPLICATED(Integer AD_IMAGE_0_LINK_DUPLICATED) {
    this.AD_IMAGE_0_LINK_DUPLICATED = AD_IMAGE_0_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_0_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_0_LINK_DUPLICATED")
  public Integer getADIMAGE0LINKDUPLICATED() {
    return AD_IMAGE_0_LINK_DUPLICATED;
  }
  public void setADIMAGE0LINKDUPLICATED(Integer AD_IMAGE_0_LINK_DUPLICATED) {
    this.AD_IMAGE_0_LINK_DUPLICATED = AD_IMAGE_0_LINK_DUPLICATED;
  }

  /**
   * Ad image link 0 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_0_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG = AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 0 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_0_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE0LINKLENGTHTOOLONG() {
    return AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE0LINKLENGTHTOOLONG(Integer AD_IMAGE_0_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG = AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 0 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_REQUIRED(Integer AD_IMAGE_0_LINK_REQUIRED) {
    this.AD_IMAGE_0_LINK_REQUIRED = AD_IMAGE_0_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 0 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_0_LINK_REQUIRED")
  public Integer getADIMAGE0LINKREQUIRED() {
    return AD_IMAGE_0_LINK_REQUIRED;
  }
  public void setADIMAGE0LINKREQUIRED(Integer AD_IMAGE_0_LINK_REQUIRED) {
    this.AD_IMAGE_0_LINK_REQUIRED = AD_IMAGE_0_LINK_REQUIRED;
  }

  /**
   * Ad image link 0 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_WARNING(Integer AD_IMAGE_0_LINK_WARNING) {
    this.AD_IMAGE_0_LINK_WARNING = AD_IMAGE_0_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 0 format is unsupported.")
  @JsonProperty("AD_IMAGE_0_LINK_WARNING")
  public Integer getADIMAGE0LINKWARNING() {
    return AD_IMAGE_0_LINK_WARNING;
  }
  public void setADIMAGE0LINKWARNING(Integer AD_IMAGE_0_LINK_WARNING) {
    this.AD_IMAGE_0_LINK_WARNING = AD_IMAGE_0_LINK_WARNING;
  }

  /**
   * ad_image_0_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_0_TAG_DUPLICATED(Integer AD_IMAGE_0_TAG_DUPLICATED) {
    this.AD_IMAGE_0_TAG_DUPLICATED = AD_IMAGE_0_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_0_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_0_TAG_DUPLICATED")
  public Integer getADIMAGE0TAGDUPLICATED() {
    return AD_IMAGE_0_TAG_DUPLICATED;
  }
  public void setADIMAGE0TAGDUPLICATED(Integer AD_IMAGE_0_TAG_DUPLICATED) {
    this.AD_IMAGE_0_TAG_DUPLICATED = AD_IMAGE_0_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 0 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_0_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_0_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG = AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 0 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_0_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE0TAGLENGTHTOOLONG() {
    return AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE0TAGLENGTHTOOLONG(Integer AD_IMAGE_0_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG = AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 0 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_0_TAG_REQUIRED(Integer AD_IMAGE_0_TAG_REQUIRED) {
    this.AD_IMAGE_0_TAG_REQUIRED = AD_IMAGE_0_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 0 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_0_TAG_REQUIRED")
  public Integer getADIMAGE0TAGREQUIRED() {
    return AD_IMAGE_0_TAG_REQUIRED;
  }
  public void setADIMAGE0TAGREQUIRED(Integer AD_IMAGE_0_TAG_REQUIRED) {
    this.AD_IMAGE_0_TAG_REQUIRED = AD_IMAGE_0_TAG_REQUIRED;
  }

  /**
   * ad_image_10_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_DUPLICATED(Integer AD_IMAGE_10_LINK_DUPLICATED) {
    this.AD_IMAGE_10_LINK_DUPLICATED = AD_IMAGE_10_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_10_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_10_LINK_DUPLICATED")
  public Integer getADIMAGE10LINKDUPLICATED() {
    return AD_IMAGE_10_LINK_DUPLICATED;
  }
  public void setADIMAGE10LINKDUPLICATED(Integer AD_IMAGE_10_LINK_DUPLICATED) {
    this.AD_IMAGE_10_LINK_DUPLICATED = AD_IMAGE_10_LINK_DUPLICATED;
  }

  /**
   * Ad image link 10 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_10_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG = AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 10 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_10_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE10LINKLENGTHTOOLONG() {
    return AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE10LINKLENGTHTOOLONG(Integer AD_IMAGE_10_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG = AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 10 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_REQUIRED(Integer AD_IMAGE_10_LINK_REQUIRED) {
    this.AD_IMAGE_10_LINK_REQUIRED = AD_IMAGE_10_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 10 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_10_LINK_REQUIRED")
  public Integer getADIMAGE10LINKREQUIRED() {
    return AD_IMAGE_10_LINK_REQUIRED;
  }
  public void setADIMAGE10LINKREQUIRED(Integer AD_IMAGE_10_LINK_REQUIRED) {
    this.AD_IMAGE_10_LINK_REQUIRED = AD_IMAGE_10_LINK_REQUIRED;
  }

  /**
   * Ad image link 10 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_WARNING(Integer AD_IMAGE_10_LINK_WARNING) {
    this.AD_IMAGE_10_LINK_WARNING = AD_IMAGE_10_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 10 format is unsupported.")
  @JsonProperty("AD_IMAGE_10_LINK_WARNING")
  public Integer getADIMAGE10LINKWARNING() {
    return AD_IMAGE_10_LINK_WARNING;
  }
  public void setADIMAGE10LINKWARNING(Integer AD_IMAGE_10_LINK_WARNING) {
    this.AD_IMAGE_10_LINK_WARNING = AD_IMAGE_10_LINK_WARNING;
  }

  /**
   * ad_image_10_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_10_TAG_DUPLICATED(Integer AD_IMAGE_10_TAG_DUPLICATED) {
    this.AD_IMAGE_10_TAG_DUPLICATED = AD_IMAGE_10_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_10_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_10_TAG_DUPLICATED")
  public Integer getADIMAGE10TAGDUPLICATED() {
    return AD_IMAGE_10_TAG_DUPLICATED;
  }
  public void setADIMAGE10TAGDUPLICATED(Integer AD_IMAGE_10_TAG_DUPLICATED) {
    this.AD_IMAGE_10_TAG_DUPLICATED = AD_IMAGE_10_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 10 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_10_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_10_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG = AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 10 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_10_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE10TAGLENGTHTOOLONG() {
    return AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE10TAGLENGTHTOOLONG(Integer AD_IMAGE_10_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG = AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 10 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_10_TAG_REQUIRED(Integer AD_IMAGE_10_TAG_REQUIRED) {
    this.AD_IMAGE_10_TAG_REQUIRED = AD_IMAGE_10_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 10 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_10_TAG_REQUIRED")
  public Integer getADIMAGE10TAGREQUIRED() {
    return AD_IMAGE_10_TAG_REQUIRED;
  }
  public void setADIMAGE10TAGREQUIRED(Integer AD_IMAGE_10_TAG_REQUIRED) {
    this.AD_IMAGE_10_TAG_REQUIRED = AD_IMAGE_10_TAG_REQUIRED;
  }

  /**
   * ad_image_11_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_DUPLICATED(Integer AD_IMAGE_11_LINK_DUPLICATED) {
    this.AD_IMAGE_11_LINK_DUPLICATED = AD_IMAGE_11_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_11_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_11_LINK_DUPLICATED")
  public Integer getADIMAGE11LINKDUPLICATED() {
    return AD_IMAGE_11_LINK_DUPLICATED;
  }
  public void setADIMAGE11LINKDUPLICATED(Integer AD_IMAGE_11_LINK_DUPLICATED) {
    this.AD_IMAGE_11_LINK_DUPLICATED = AD_IMAGE_11_LINK_DUPLICATED;
  }

  /**
   * Ad image link 11 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_11_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG = AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 11 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_11_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE11LINKLENGTHTOOLONG() {
    return AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE11LINKLENGTHTOOLONG(Integer AD_IMAGE_11_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG = AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 11 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_REQUIRED(Integer AD_IMAGE_11_LINK_REQUIRED) {
    this.AD_IMAGE_11_LINK_REQUIRED = AD_IMAGE_11_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 11 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_11_LINK_REQUIRED")
  public Integer getADIMAGE11LINKREQUIRED() {
    return AD_IMAGE_11_LINK_REQUIRED;
  }
  public void setADIMAGE11LINKREQUIRED(Integer AD_IMAGE_11_LINK_REQUIRED) {
    this.AD_IMAGE_11_LINK_REQUIRED = AD_IMAGE_11_LINK_REQUIRED;
  }

  /**
   * Ad image link 11 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_WARNING(Integer AD_IMAGE_11_LINK_WARNING) {
    this.AD_IMAGE_11_LINK_WARNING = AD_IMAGE_11_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 11 format is unsupported.")
  @JsonProperty("AD_IMAGE_11_LINK_WARNING")
  public Integer getADIMAGE11LINKWARNING() {
    return AD_IMAGE_11_LINK_WARNING;
  }
  public void setADIMAGE11LINKWARNING(Integer AD_IMAGE_11_LINK_WARNING) {
    this.AD_IMAGE_11_LINK_WARNING = AD_IMAGE_11_LINK_WARNING;
  }

  /**
   * ad_image_11_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_11_TAG_DUPLICATED(Integer AD_IMAGE_11_TAG_DUPLICATED) {
    this.AD_IMAGE_11_TAG_DUPLICATED = AD_IMAGE_11_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_11_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_11_TAG_DUPLICATED")
  public Integer getADIMAGE11TAGDUPLICATED() {
    return AD_IMAGE_11_TAG_DUPLICATED;
  }
  public void setADIMAGE11TAGDUPLICATED(Integer AD_IMAGE_11_TAG_DUPLICATED) {
    this.AD_IMAGE_11_TAG_DUPLICATED = AD_IMAGE_11_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 11 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_11_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_11_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG = AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 11 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_11_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE11TAGLENGTHTOOLONG() {
    return AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE11TAGLENGTHTOOLONG(Integer AD_IMAGE_11_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG = AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 11 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_11_TAG_REQUIRED(Integer AD_IMAGE_11_TAG_REQUIRED) {
    this.AD_IMAGE_11_TAG_REQUIRED = AD_IMAGE_11_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 11 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_11_TAG_REQUIRED")
  public Integer getADIMAGE11TAGREQUIRED() {
    return AD_IMAGE_11_TAG_REQUIRED;
  }
  public void setADIMAGE11TAGREQUIRED(Integer AD_IMAGE_11_TAG_REQUIRED) {
    this.AD_IMAGE_11_TAG_REQUIRED = AD_IMAGE_11_TAG_REQUIRED;
  }

  /**
   * ad_image_12_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_DUPLICATED(Integer AD_IMAGE_12_LINK_DUPLICATED) {
    this.AD_IMAGE_12_LINK_DUPLICATED = AD_IMAGE_12_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_12_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_12_LINK_DUPLICATED")
  public Integer getADIMAGE12LINKDUPLICATED() {
    return AD_IMAGE_12_LINK_DUPLICATED;
  }
  public void setADIMAGE12LINKDUPLICATED(Integer AD_IMAGE_12_LINK_DUPLICATED) {
    this.AD_IMAGE_12_LINK_DUPLICATED = AD_IMAGE_12_LINK_DUPLICATED;
  }

  /**
   * Ad image link 12 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_12_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG = AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 12 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_12_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE12LINKLENGTHTOOLONG() {
    return AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE12LINKLENGTHTOOLONG(Integer AD_IMAGE_12_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG = AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 12 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_REQUIRED(Integer AD_IMAGE_12_LINK_REQUIRED) {
    this.AD_IMAGE_12_LINK_REQUIRED = AD_IMAGE_12_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 12 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_12_LINK_REQUIRED")
  public Integer getADIMAGE12LINKREQUIRED() {
    return AD_IMAGE_12_LINK_REQUIRED;
  }
  public void setADIMAGE12LINKREQUIRED(Integer AD_IMAGE_12_LINK_REQUIRED) {
    this.AD_IMAGE_12_LINK_REQUIRED = AD_IMAGE_12_LINK_REQUIRED;
  }

  /**
   * Ad image link 12 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_WARNING(Integer AD_IMAGE_12_LINK_WARNING) {
    this.AD_IMAGE_12_LINK_WARNING = AD_IMAGE_12_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 12 format is unsupported.")
  @JsonProperty("AD_IMAGE_12_LINK_WARNING")
  public Integer getADIMAGE12LINKWARNING() {
    return AD_IMAGE_12_LINK_WARNING;
  }
  public void setADIMAGE12LINKWARNING(Integer AD_IMAGE_12_LINK_WARNING) {
    this.AD_IMAGE_12_LINK_WARNING = AD_IMAGE_12_LINK_WARNING;
  }

  /**
   * ad_image_12_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_12_TAG_DUPLICATED(Integer AD_IMAGE_12_TAG_DUPLICATED) {
    this.AD_IMAGE_12_TAG_DUPLICATED = AD_IMAGE_12_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_12_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_12_TAG_DUPLICATED")
  public Integer getADIMAGE12TAGDUPLICATED() {
    return AD_IMAGE_12_TAG_DUPLICATED;
  }
  public void setADIMAGE12TAGDUPLICATED(Integer AD_IMAGE_12_TAG_DUPLICATED) {
    this.AD_IMAGE_12_TAG_DUPLICATED = AD_IMAGE_12_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 12 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_12_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_12_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG = AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 12 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_12_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE12TAGLENGTHTOOLONG() {
    return AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE12TAGLENGTHTOOLONG(Integer AD_IMAGE_12_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG = AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 12 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_12_TAG_REQUIRED(Integer AD_IMAGE_12_TAG_REQUIRED) {
    this.AD_IMAGE_12_TAG_REQUIRED = AD_IMAGE_12_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 12 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_12_TAG_REQUIRED")
  public Integer getADIMAGE12TAGREQUIRED() {
    return AD_IMAGE_12_TAG_REQUIRED;
  }
  public void setADIMAGE12TAGREQUIRED(Integer AD_IMAGE_12_TAG_REQUIRED) {
    this.AD_IMAGE_12_TAG_REQUIRED = AD_IMAGE_12_TAG_REQUIRED;
  }

  /**
   * ad_image_13_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_DUPLICATED(Integer AD_IMAGE_13_LINK_DUPLICATED) {
    this.AD_IMAGE_13_LINK_DUPLICATED = AD_IMAGE_13_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_13_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_13_LINK_DUPLICATED")
  public Integer getADIMAGE13LINKDUPLICATED() {
    return AD_IMAGE_13_LINK_DUPLICATED;
  }
  public void setADIMAGE13LINKDUPLICATED(Integer AD_IMAGE_13_LINK_DUPLICATED) {
    this.AD_IMAGE_13_LINK_DUPLICATED = AD_IMAGE_13_LINK_DUPLICATED;
  }

  /**
   * Ad image link 13 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_13_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG = AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 13 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_13_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE13LINKLENGTHTOOLONG() {
    return AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE13LINKLENGTHTOOLONG(Integer AD_IMAGE_13_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG = AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 13 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_REQUIRED(Integer AD_IMAGE_13_LINK_REQUIRED) {
    this.AD_IMAGE_13_LINK_REQUIRED = AD_IMAGE_13_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 13 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_13_LINK_REQUIRED")
  public Integer getADIMAGE13LINKREQUIRED() {
    return AD_IMAGE_13_LINK_REQUIRED;
  }
  public void setADIMAGE13LINKREQUIRED(Integer AD_IMAGE_13_LINK_REQUIRED) {
    this.AD_IMAGE_13_LINK_REQUIRED = AD_IMAGE_13_LINK_REQUIRED;
  }

  /**
   * Ad image link 13 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_WARNING(Integer AD_IMAGE_13_LINK_WARNING) {
    this.AD_IMAGE_13_LINK_WARNING = AD_IMAGE_13_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 13 format is unsupported.")
  @JsonProperty("AD_IMAGE_13_LINK_WARNING")
  public Integer getADIMAGE13LINKWARNING() {
    return AD_IMAGE_13_LINK_WARNING;
  }
  public void setADIMAGE13LINKWARNING(Integer AD_IMAGE_13_LINK_WARNING) {
    this.AD_IMAGE_13_LINK_WARNING = AD_IMAGE_13_LINK_WARNING;
  }

  /**
   * ad_image_13_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_13_TAG_DUPLICATED(Integer AD_IMAGE_13_TAG_DUPLICATED) {
    this.AD_IMAGE_13_TAG_DUPLICATED = AD_IMAGE_13_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_13_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_13_TAG_DUPLICATED")
  public Integer getADIMAGE13TAGDUPLICATED() {
    return AD_IMAGE_13_TAG_DUPLICATED;
  }
  public void setADIMAGE13TAGDUPLICATED(Integer AD_IMAGE_13_TAG_DUPLICATED) {
    this.AD_IMAGE_13_TAG_DUPLICATED = AD_IMAGE_13_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 13 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_13_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_13_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG = AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 13 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_13_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE13TAGLENGTHTOOLONG() {
    return AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE13TAGLENGTHTOOLONG(Integer AD_IMAGE_13_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG = AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 13 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_13_TAG_REQUIRED(Integer AD_IMAGE_13_TAG_REQUIRED) {
    this.AD_IMAGE_13_TAG_REQUIRED = AD_IMAGE_13_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 13 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_13_TAG_REQUIRED")
  public Integer getADIMAGE13TAGREQUIRED() {
    return AD_IMAGE_13_TAG_REQUIRED;
  }
  public void setADIMAGE13TAGREQUIRED(Integer AD_IMAGE_13_TAG_REQUIRED) {
    this.AD_IMAGE_13_TAG_REQUIRED = AD_IMAGE_13_TAG_REQUIRED;
  }

  /**
   * ad_image_14_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_DUPLICATED(Integer AD_IMAGE_14_LINK_DUPLICATED) {
    this.AD_IMAGE_14_LINK_DUPLICATED = AD_IMAGE_14_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_14_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_14_LINK_DUPLICATED")
  public Integer getADIMAGE14LINKDUPLICATED() {
    return AD_IMAGE_14_LINK_DUPLICATED;
  }
  public void setADIMAGE14LINKDUPLICATED(Integer AD_IMAGE_14_LINK_DUPLICATED) {
    this.AD_IMAGE_14_LINK_DUPLICATED = AD_IMAGE_14_LINK_DUPLICATED;
  }

  /**
   * Ad image link 14 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_14_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG = AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 14 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_14_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE14LINKLENGTHTOOLONG() {
    return AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE14LINKLENGTHTOOLONG(Integer AD_IMAGE_14_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG = AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 14 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_REQUIRED(Integer AD_IMAGE_14_LINK_REQUIRED) {
    this.AD_IMAGE_14_LINK_REQUIRED = AD_IMAGE_14_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 14 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_14_LINK_REQUIRED")
  public Integer getADIMAGE14LINKREQUIRED() {
    return AD_IMAGE_14_LINK_REQUIRED;
  }
  public void setADIMAGE14LINKREQUIRED(Integer AD_IMAGE_14_LINK_REQUIRED) {
    this.AD_IMAGE_14_LINK_REQUIRED = AD_IMAGE_14_LINK_REQUIRED;
  }

  /**
   * Ad image link 14 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_WARNING(Integer AD_IMAGE_14_LINK_WARNING) {
    this.AD_IMAGE_14_LINK_WARNING = AD_IMAGE_14_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 14 format is unsupported.")
  @JsonProperty("AD_IMAGE_14_LINK_WARNING")
  public Integer getADIMAGE14LINKWARNING() {
    return AD_IMAGE_14_LINK_WARNING;
  }
  public void setADIMAGE14LINKWARNING(Integer AD_IMAGE_14_LINK_WARNING) {
    this.AD_IMAGE_14_LINK_WARNING = AD_IMAGE_14_LINK_WARNING;
  }

  /**
   * ad_image_14_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_14_TAG_DUPLICATED(Integer AD_IMAGE_14_TAG_DUPLICATED) {
    this.AD_IMAGE_14_TAG_DUPLICATED = AD_IMAGE_14_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_14_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_14_TAG_DUPLICATED")
  public Integer getADIMAGE14TAGDUPLICATED() {
    return AD_IMAGE_14_TAG_DUPLICATED;
  }
  public void setADIMAGE14TAGDUPLICATED(Integer AD_IMAGE_14_TAG_DUPLICATED) {
    this.AD_IMAGE_14_TAG_DUPLICATED = AD_IMAGE_14_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 14 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_14_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_14_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG = AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 14 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_14_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE14TAGLENGTHTOOLONG() {
    return AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE14TAGLENGTHTOOLONG(Integer AD_IMAGE_14_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG = AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 14 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_14_TAG_REQUIRED(Integer AD_IMAGE_14_TAG_REQUIRED) {
    this.AD_IMAGE_14_TAG_REQUIRED = AD_IMAGE_14_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 14 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_14_TAG_REQUIRED")
  public Integer getADIMAGE14TAGREQUIRED() {
    return AD_IMAGE_14_TAG_REQUIRED;
  }
  public void setADIMAGE14TAGREQUIRED(Integer AD_IMAGE_14_TAG_REQUIRED) {
    this.AD_IMAGE_14_TAG_REQUIRED = AD_IMAGE_14_TAG_REQUIRED;
  }

  /**
   * ad_image_15_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_DUPLICATED(Integer AD_IMAGE_15_LINK_DUPLICATED) {
    this.AD_IMAGE_15_LINK_DUPLICATED = AD_IMAGE_15_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_15_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_15_LINK_DUPLICATED")
  public Integer getADIMAGE15LINKDUPLICATED() {
    return AD_IMAGE_15_LINK_DUPLICATED;
  }
  public void setADIMAGE15LINKDUPLICATED(Integer AD_IMAGE_15_LINK_DUPLICATED) {
    this.AD_IMAGE_15_LINK_DUPLICATED = AD_IMAGE_15_LINK_DUPLICATED;
  }

  /**
   * Ad image link 15 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_15_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG = AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 15 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_15_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE15LINKLENGTHTOOLONG() {
    return AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE15LINKLENGTHTOOLONG(Integer AD_IMAGE_15_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG = AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 15 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_REQUIRED(Integer AD_IMAGE_15_LINK_REQUIRED) {
    this.AD_IMAGE_15_LINK_REQUIRED = AD_IMAGE_15_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 15 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_15_LINK_REQUIRED")
  public Integer getADIMAGE15LINKREQUIRED() {
    return AD_IMAGE_15_LINK_REQUIRED;
  }
  public void setADIMAGE15LINKREQUIRED(Integer AD_IMAGE_15_LINK_REQUIRED) {
    this.AD_IMAGE_15_LINK_REQUIRED = AD_IMAGE_15_LINK_REQUIRED;
  }

  /**
   * Ad image link 15 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_WARNING(Integer AD_IMAGE_15_LINK_WARNING) {
    this.AD_IMAGE_15_LINK_WARNING = AD_IMAGE_15_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 15 format is unsupported.")
  @JsonProperty("AD_IMAGE_15_LINK_WARNING")
  public Integer getADIMAGE15LINKWARNING() {
    return AD_IMAGE_15_LINK_WARNING;
  }
  public void setADIMAGE15LINKWARNING(Integer AD_IMAGE_15_LINK_WARNING) {
    this.AD_IMAGE_15_LINK_WARNING = AD_IMAGE_15_LINK_WARNING;
  }

  /**
   * ad_image_15_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_15_TAG_DUPLICATED(Integer AD_IMAGE_15_TAG_DUPLICATED) {
    this.AD_IMAGE_15_TAG_DUPLICATED = AD_IMAGE_15_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_15_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_15_TAG_DUPLICATED")
  public Integer getADIMAGE15TAGDUPLICATED() {
    return AD_IMAGE_15_TAG_DUPLICATED;
  }
  public void setADIMAGE15TAGDUPLICATED(Integer AD_IMAGE_15_TAG_DUPLICATED) {
    this.AD_IMAGE_15_TAG_DUPLICATED = AD_IMAGE_15_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 15 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_15_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_15_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG = AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 15 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_15_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE15TAGLENGTHTOOLONG() {
    return AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE15TAGLENGTHTOOLONG(Integer AD_IMAGE_15_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG = AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 15 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_15_TAG_REQUIRED(Integer AD_IMAGE_15_TAG_REQUIRED) {
    this.AD_IMAGE_15_TAG_REQUIRED = AD_IMAGE_15_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 15 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_15_TAG_REQUIRED")
  public Integer getADIMAGE15TAGREQUIRED() {
    return AD_IMAGE_15_TAG_REQUIRED;
  }
  public void setADIMAGE15TAGREQUIRED(Integer AD_IMAGE_15_TAG_REQUIRED) {
    this.AD_IMAGE_15_TAG_REQUIRED = AD_IMAGE_15_TAG_REQUIRED;
  }

  /**
   * ad_image_16_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_DUPLICATED(Integer AD_IMAGE_16_LINK_DUPLICATED) {
    this.AD_IMAGE_16_LINK_DUPLICATED = AD_IMAGE_16_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_16_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_16_LINK_DUPLICATED")
  public Integer getADIMAGE16LINKDUPLICATED() {
    return AD_IMAGE_16_LINK_DUPLICATED;
  }
  public void setADIMAGE16LINKDUPLICATED(Integer AD_IMAGE_16_LINK_DUPLICATED) {
    this.AD_IMAGE_16_LINK_DUPLICATED = AD_IMAGE_16_LINK_DUPLICATED;
  }

  /**
   * Ad image link 16 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_16_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG = AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 16 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_16_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE16LINKLENGTHTOOLONG() {
    return AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE16LINKLENGTHTOOLONG(Integer AD_IMAGE_16_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG = AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 16 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_REQUIRED(Integer AD_IMAGE_16_LINK_REQUIRED) {
    this.AD_IMAGE_16_LINK_REQUIRED = AD_IMAGE_16_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 16 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_16_LINK_REQUIRED")
  public Integer getADIMAGE16LINKREQUIRED() {
    return AD_IMAGE_16_LINK_REQUIRED;
  }
  public void setADIMAGE16LINKREQUIRED(Integer AD_IMAGE_16_LINK_REQUIRED) {
    this.AD_IMAGE_16_LINK_REQUIRED = AD_IMAGE_16_LINK_REQUIRED;
  }

  /**
   * Ad image link 16 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_WARNING(Integer AD_IMAGE_16_LINK_WARNING) {
    this.AD_IMAGE_16_LINK_WARNING = AD_IMAGE_16_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 16 format is unsupported.")
  @JsonProperty("AD_IMAGE_16_LINK_WARNING")
  public Integer getADIMAGE16LINKWARNING() {
    return AD_IMAGE_16_LINK_WARNING;
  }
  public void setADIMAGE16LINKWARNING(Integer AD_IMAGE_16_LINK_WARNING) {
    this.AD_IMAGE_16_LINK_WARNING = AD_IMAGE_16_LINK_WARNING;
  }

  /**
   * ad_image_16_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_16_TAG_DUPLICATED(Integer AD_IMAGE_16_TAG_DUPLICATED) {
    this.AD_IMAGE_16_TAG_DUPLICATED = AD_IMAGE_16_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_16_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_16_TAG_DUPLICATED")
  public Integer getADIMAGE16TAGDUPLICATED() {
    return AD_IMAGE_16_TAG_DUPLICATED;
  }
  public void setADIMAGE16TAGDUPLICATED(Integer AD_IMAGE_16_TAG_DUPLICATED) {
    this.AD_IMAGE_16_TAG_DUPLICATED = AD_IMAGE_16_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 16 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_16_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_16_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG = AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 16 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_16_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE16TAGLENGTHTOOLONG() {
    return AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE16TAGLENGTHTOOLONG(Integer AD_IMAGE_16_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG = AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 16 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_16_TAG_REQUIRED(Integer AD_IMAGE_16_TAG_REQUIRED) {
    this.AD_IMAGE_16_TAG_REQUIRED = AD_IMAGE_16_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 16 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_16_TAG_REQUIRED")
  public Integer getADIMAGE16TAGREQUIRED() {
    return AD_IMAGE_16_TAG_REQUIRED;
  }
  public void setADIMAGE16TAGREQUIRED(Integer AD_IMAGE_16_TAG_REQUIRED) {
    this.AD_IMAGE_16_TAG_REQUIRED = AD_IMAGE_16_TAG_REQUIRED;
  }

  /**
   * ad_image_17_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_DUPLICATED(Integer AD_IMAGE_17_LINK_DUPLICATED) {
    this.AD_IMAGE_17_LINK_DUPLICATED = AD_IMAGE_17_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_17_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_17_LINK_DUPLICATED")
  public Integer getADIMAGE17LINKDUPLICATED() {
    return AD_IMAGE_17_LINK_DUPLICATED;
  }
  public void setADIMAGE17LINKDUPLICATED(Integer AD_IMAGE_17_LINK_DUPLICATED) {
    this.AD_IMAGE_17_LINK_DUPLICATED = AD_IMAGE_17_LINK_DUPLICATED;
  }

  /**
   * Ad image link 17 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_17_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG = AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 17 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_17_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE17LINKLENGTHTOOLONG() {
    return AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE17LINKLENGTHTOOLONG(Integer AD_IMAGE_17_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG = AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 17 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_REQUIRED(Integer AD_IMAGE_17_LINK_REQUIRED) {
    this.AD_IMAGE_17_LINK_REQUIRED = AD_IMAGE_17_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 17 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_17_LINK_REQUIRED")
  public Integer getADIMAGE17LINKREQUIRED() {
    return AD_IMAGE_17_LINK_REQUIRED;
  }
  public void setADIMAGE17LINKREQUIRED(Integer AD_IMAGE_17_LINK_REQUIRED) {
    this.AD_IMAGE_17_LINK_REQUIRED = AD_IMAGE_17_LINK_REQUIRED;
  }

  /**
   * Ad image link 17 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_WARNING(Integer AD_IMAGE_17_LINK_WARNING) {
    this.AD_IMAGE_17_LINK_WARNING = AD_IMAGE_17_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 17 format is unsupported.")
  @JsonProperty("AD_IMAGE_17_LINK_WARNING")
  public Integer getADIMAGE17LINKWARNING() {
    return AD_IMAGE_17_LINK_WARNING;
  }
  public void setADIMAGE17LINKWARNING(Integer AD_IMAGE_17_LINK_WARNING) {
    this.AD_IMAGE_17_LINK_WARNING = AD_IMAGE_17_LINK_WARNING;
  }

  /**
   * ad_image_17_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_17_TAG_DUPLICATED(Integer AD_IMAGE_17_TAG_DUPLICATED) {
    this.AD_IMAGE_17_TAG_DUPLICATED = AD_IMAGE_17_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_17_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_17_TAG_DUPLICATED")
  public Integer getADIMAGE17TAGDUPLICATED() {
    return AD_IMAGE_17_TAG_DUPLICATED;
  }
  public void setADIMAGE17TAGDUPLICATED(Integer AD_IMAGE_17_TAG_DUPLICATED) {
    this.AD_IMAGE_17_TAG_DUPLICATED = AD_IMAGE_17_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 17 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_17_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_17_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG = AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 17 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_17_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE17TAGLENGTHTOOLONG() {
    return AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE17TAGLENGTHTOOLONG(Integer AD_IMAGE_17_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG = AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 17 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_17_TAG_REQUIRED(Integer AD_IMAGE_17_TAG_REQUIRED) {
    this.AD_IMAGE_17_TAG_REQUIRED = AD_IMAGE_17_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 17 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_17_TAG_REQUIRED")
  public Integer getADIMAGE17TAGREQUIRED() {
    return AD_IMAGE_17_TAG_REQUIRED;
  }
  public void setADIMAGE17TAGREQUIRED(Integer AD_IMAGE_17_TAG_REQUIRED) {
    this.AD_IMAGE_17_TAG_REQUIRED = AD_IMAGE_17_TAG_REQUIRED;
  }

  /**
   * ad_image_18_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_DUPLICATED(Integer AD_IMAGE_18_LINK_DUPLICATED) {
    this.AD_IMAGE_18_LINK_DUPLICATED = AD_IMAGE_18_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_18_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_18_LINK_DUPLICATED")
  public Integer getADIMAGE18LINKDUPLICATED() {
    return AD_IMAGE_18_LINK_DUPLICATED;
  }
  public void setADIMAGE18LINKDUPLICATED(Integer AD_IMAGE_18_LINK_DUPLICATED) {
    this.AD_IMAGE_18_LINK_DUPLICATED = AD_IMAGE_18_LINK_DUPLICATED;
  }

  /**
   * Ad image link 18 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_18_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG = AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 18 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_18_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE18LINKLENGTHTOOLONG() {
    return AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE18LINKLENGTHTOOLONG(Integer AD_IMAGE_18_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG = AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 18 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_REQUIRED(Integer AD_IMAGE_18_LINK_REQUIRED) {
    this.AD_IMAGE_18_LINK_REQUIRED = AD_IMAGE_18_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 18 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_18_LINK_REQUIRED")
  public Integer getADIMAGE18LINKREQUIRED() {
    return AD_IMAGE_18_LINK_REQUIRED;
  }
  public void setADIMAGE18LINKREQUIRED(Integer AD_IMAGE_18_LINK_REQUIRED) {
    this.AD_IMAGE_18_LINK_REQUIRED = AD_IMAGE_18_LINK_REQUIRED;
  }

  /**
   * Ad image link 18 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_WARNING(Integer AD_IMAGE_18_LINK_WARNING) {
    this.AD_IMAGE_18_LINK_WARNING = AD_IMAGE_18_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 18 format is unsupported.")
  @JsonProperty("AD_IMAGE_18_LINK_WARNING")
  public Integer getADIMAGE18LINKWARNING() {
    return AD_IMAGE_18_LINK_WARNING;
  }
  public void setADIMAGE18LINKWARNING(Integer AD_IMAGE_18_LINK_WARNING) {
    this.AD_IMAGE_18_LINK_WARNING = AD_IMAGE_18_LINK_WARNING;
  }

  /**
   * ad_image_18_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_18_TAG_DUPLICATED(Integer AD_IMAGE_18_TAG_DUPLICATED) {
    this.AD_IMAGE_18_TAG_DUPLICATED = AD_IMAGE_18_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_18_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_18_TAG_DUPLICATED")
  public Integer getADIMAGE18TAGDUPLICATED() {
    return AD_IMAGE_18_TAG_DUPLICATED;
  }
  public void setADIMAGE18TAGDUPLICATED(Integer AD_IMAGE_18_TAG_DUPLICATED) {
    this.AD_IMAGE_18_TAG_DUPLICATED = AD_IMAGE_18_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 18 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_18_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_18_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG = AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 18 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_18_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE18TAGLENGTHTOOLONG() {
    return AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE18TAGLENGTHTOOLONG(Integer AD_IMAGE_18_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG = AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 18 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_18_TAG_REQUIRED(Integer AD_IMAGE_18_TAG_REQUIRED) {
    this.AD_IMAGE_18_TAG_REQUIRED = AD_IMAGE_18_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 18 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_18_TAG_REQUIRED")
  public Integer getADIMAGE18TAGREQUIRED() {
    return AD_IMAGE_18_TAG_REQUIRED;
  }
  public void setADIMAGE18TAGREQUIRED(Integer AD_IMAGE_18_TAG_REQUIRED) {
    this.AD_IMAGE_18_TAG_REQUIRED = AD_IMAGE_18_TAG_REQUIRED;
  }

  /**
   * ad_image_19_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_DUPLICATED(Integer AD_IMAGE_19_LINK_DUPLICATED) {
    this.AD_IMAGE_19_LINK_DUPLICATED = AD_IMAGE_19_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_19_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_19_LINK_DUPLICATED")
  public Integer getADIMAGE19LINKDUPLICATED() {
    return AD_IMAGE_19_LINK_DUPLICATED;
  }
  public void setADIMAGE19LINKDUPLICATED(Integer AD_IMAGE_19_LINK_DUPLICATED) {
    this.AD_IMAGE_19_LINK_DUPLICATED = AD_IMAGE_19_LINK_DUPLICATED;
  }

  /**
   * Ad image link 19 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_19_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG = AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 19 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_19_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE19LINKLENGTHTOOLONG() {
    return AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE19LINKLENGTHTOOLONG(Integer AD_IMAGE_19_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG = AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 19 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_REQUIRED(Integer AD_IMAGE_19_LINK_REQUIRED) {
    this.AD_IMAGE_19_LINK_REQUIRED = AD_IMAGE_19_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 19 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_19_LINK_REQUIRED")
  public Integer getADIMAGE19LINKREQUIRED() {
    return AD_IMAGE_19_LINK_REQUIRED;
  }
  public void setADIMAGE19LINKREQUIRED(Integer AD_IMAGE_19_LINK_REQUIRED) {
    this.AD_IMAGE_19_LINK_REQUIRED = AD_IMAGE_19_LINK_REQUIRED;
  }

  /**
   * Ad image link 19 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_WARNING(Integer AD_IMAGE_19_LINK_WARNING) {
    this.AD_IMAGE_19_LINK_WARNING = AD_IMAGE_19_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 19 format is unsupported.")
  @JsonProperty("AD_IMAGE_19_LINK_WARNING")
  public Integer getADIMAGE19LINKWARNING() {
    return AD_IMAGE_19_LINK_WARNING;
  }
  public void setADIMAGE19LINKWARNING(Integer AD_IMAGE_19_LINK_WARNING) {
    this.AD_IMAGE_19_LINK_WARNING = AD_IMAGE_19_LINK_WARNING;
  }

  /**
   * ad_image_19_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_19_TAG_DUPLICATED(Integer AD_IMAGE_19_TAG_DUPLICATED) {
    this.AD_IMAGE_19_TAG_DUPLICATED = AD_IMAGE_19_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_19_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_19_TAG_DUPLICATED")
  public Integer getADIMAGE19TAGDUPLICATED() {
    return AD_IMAGE_19_TAG_DUPLICATED;
  }
  public void setADIMAGE19TAGDUPLICATED(Integer AD_IMAGE_19_TAG_DUPLICATED) {
    this.AD_IMAGE_19_TAG_DUPLICATED = AD_IMAGE_19_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 19 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_19_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_19_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG = AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 19 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_19_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE19TAGLENGTHTOOLONG() {
    return AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE19TAGLENGTHTOOLONG(Integer AD_IMAGE_19_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG = AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 19 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_19_TAG_REQUIRED(Integer AD_IMAGE_19_TAG_REQUIRED) {
    this.AD_IMAGE_19_TAG_REQUIRED = AD_IMAGE_19_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 19 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_19_TAG_REQUIRED")
  public Integer getADIMAGE19TAGREQUIRED() {
    return AD_IMAGE_19_TAG_REQUIRED;
  }
  public void setADIMAGE19TAGREQUIRED(Integer AD_IMAGE_19_TAG_REQUIRED) {
    this.AD_IMAGE_19_TAG_REQUIRED = AD_IMAGE_19_TAG_REQUIRED;
  }

  /**
   * ad_image_1_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_DUPLICATED(Integer AD_IMAGE_1_LINK_DUPLICATED) {
    this.AD_IMAGE_1_LINK_DUPLICATED = AD_IMAGE_1_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_1_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_1_LINK_DUPLICATED")
  public Integer getADIMAGE1LINKDUPLICATED() {
    return AD_IMAGE_1_LINK_DUPLICATED;
  }
  public void setADIMAGE1LINKDUPLICATED(Integer AD_IMAGE_1_LINK_DUPLICATED) {
    this.AD_IMAGE_1_LINK_DUPLICATED = AD_IMAGE_1_LINK_DUPLICATED;
  }

  /**
   * Ad image link 1 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_1_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG = AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 1 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_1_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE1LINKLENGTHTOOLONG() {
    return AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE1LINKLENGTHTOOLONG(Integer AD_IMAGE_1_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG = AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 1 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_REQUIRED(Integer AD_IMAGE_1_LINK_REQUIRED) {
    this.AD_IMAGE_1_LINK_REQUIRED = AD_IMAGE_1_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 1 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_1_LINK_REQUIRED")
  public Integer getADIMAGE1LINKREQUIRED() {
    return AD_IMAGE_1_LINK_REQUIRED;
  }
  public void setADIMAGE1LINKREQUIRED(Integer AD_IMAGE_1_LINK_REQUIRED) {
    this.AD_IMAGE_1_LINK_REQUIRED = AD_IMAGE_1_LINK_REQUIRED;
  }

  /**
   * Ad image link 1 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_WARNING(Integer AD_IMAGE_1_LINK_WARNING) {
    this.AD_IMAGE_1_LINK_WARNING = AD_IMAGE_1_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 1 format is unsupported.")
  @JsonProperty("AD_IMAGE_1_LINK_WARNING")
  public Integer getADIMAGE1LINKWARNING() {
    return AD_IMAGE_1_LINK_WARNING;
  }
  public void setADIMAGE1LINKWARNING(Integer AD_IMAGE_1_LINK_WARNING) {
    this.AD_IMAGE_1_LINK_WARNING = AD_IMAGE_1_LINK_WARNING;
  }

  /**
   * ad_image_1_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_1_TAG_DUPLICATED(Integer AD_IMAGE_1_TAG_DUPLICATED) {
    this.AD_IMAGE_1_TAG_DUPLICATED = AD_IMAGE_1_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_1_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_1_TAG_DUPLICATED")
  public Integer getADIMAGE1TAGDUPLICATED() {
    return AD_IMAGE_1_TAG_DUPLICATED;
  }
  public void setADIMAGE1TAGDUPLICATED(Integer AD_IMAGE_1_TAG_DUPLICATED) {
    this.AD_IMAGE_1_TAG_DUPLICATED = AD_IMAGE_1_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 1 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_1_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_1_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG = AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 1 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_1_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE1TAGLENGTHTOOLONG() {
    return AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE1TAGLENGTHTOOLONG(Integer AD_IMAGE_1_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG = AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 1 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_1_TAG_REQUIRED(Integer AD_IMAGE_1_TAG_REQUIRED) {
    this.AD_IMAGE_1_TAG_REQUIRED = AD_IMAGE_1_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 1 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_1_TAG_REQUIRED")
  public Integer getADIMAGE1TAGREQUIRED() {
    return AD_IMAGE_1_TAG_REQUIRED;
  }
  public void setADIMAGE1TAGREQUIRED(Integer AD_IMAGE_1_TAG_REQUIRED) {
    this.AD_IMAGE_1_TAG_REQUIRED = AD_IMAGE_1_TAG_REQUIRED;
  }

  /**
   * ad_image_2_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_DUPLICATED(Integer AD_IMAGE_2_LINK_DUPLICATED) {
    this.AD_IMAGE_2_LINK_DUPLICATED = AD_IMAGE_2_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_2_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_2_LINK_DUPLICATED")
  public Integer getADIMAGE2LINKDUPLICATED() {
    return AD_IMAGE_2_LINK_DUPLICATED;
  }
  public void setADIMAGE2LINKDUPLICATED(Integer AD_IMAGE_2_LINK_DUPLICATED) {
    this.AD_IMAGE_2_LINK_DUPLICATED = AD_IMAGE_2_LINK_DUPLICATED;
  }

  /**
   * Ad image link 2 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_2_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG = AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 2 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_2_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE2LINKLENGTHTOOLONG() {
    return AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE2LINKLENGTHTOOLONG(Integer AD_IMAGE_2_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG = AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 2 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_REQUIRED(Integer AD_IMAGE_2_LINK_REQUIRED) {
    this.AD_IMAGE_2_LINK_REQUIRED = AD_IMAGE_2_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 2 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_2_LINK_REQUIRED")
  public Integer getADIMAGE2LINKREQUIRED() {
    return AD_IMAGE_2_LINK_REQUIRED;
  }
  public void setADIMAGE2LINKREQUIRED(Integer AD_IMAGE_2_LINK_REQUIRED) {
    this.AD_IMAGE_2_LINK_REQUIRED = AD_IMAGE_2_LINK_REQUIRED;
  }

  /**
   * Ad image link 2 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_WARNING(Integer AD_IMAGE_2_LINK_WARNING) {
    this.AD_IMAGE_2_LINK_WARNING = AD_IMAGE_2_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 2 format is unsupported.")
  @JsonProperty("AD_IMAGE_2_LINK_WARNING")
  public Integer getADIMAGE2LINKWARNING() {
    return AD_IMAGE_2_LINK_WARNING;
  }
  public void setADIMAGE2LINKWARNING(Integer AD_IMAGE_2_LINK_WARNING) {
    this.AD_IMAGE_2_LINK_WARNING = AD_IMAGE_2_LINK_WARNING;
  }

  /**
   * ad_image_2_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_2_TAG_DUPLICATED(Integer AD_IMAGE_2_TAG_DUPLICATED) {
    this.AD_IMAGE_2_TAG_DUPLICATED = AD_IMAGE_2_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_2_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_2_TAG_DUPLICATED")
  public Integer getADIMAGE2TAGDUPLICATED() {
    return AD_IMAGE_2_TAG_DUPLICATED;
  }
  public void setADIMAGE2TAGDUPLICATED(Integer AD_IMAGE_2_TAG_DUPLICATED) {
    this.AD_IMAGE_2_TAG_DUPLICATED = AD_IMAGE_2_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 2 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_2_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_2_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG = AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 2 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_2_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE2TAGLENGTHTOOLONG() {
    return AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE2TAGLENGTHTOOLONG(Integer AD_IMAGE_2_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG = AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 2 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_2_TAG_REQUIRED(Integer AD_IMAGE_2_TAG_REQUIRED) {
    this.AD_IMAGE_2_TAG_REQUIRED = AD_IMAGE_2_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 2 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_2_TAG_REQUIRED")
  public Integer getADIMAGE2TAGREQUIRED() {
    return AD_IMAGE_2_TAG_REQUIRED;
  }
  public void setADIMAGE2TAGREQUIRED(Integer AD_IMAGE_2_TAG_REQUIRED) {
    this.AD_IMAGE_2_TAG_REQUIRED = AD_IMAGE_2_TAG_REQUIRED;
  }

  /**
   * ad_image_3_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_DUPLICATED(Integer AD_IMAGE_3_LINK_DUPLICATED) {
    this.AD_IMAGE_3_LINK_DUPLICATED = AD_IMAGE_3_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_3_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_3_LINK_DUPLICATED")
  public Integer getADIMAGE3LINKDUPLICATED() {
    return AD_IMAGE_3_LINK_DUPLICATED;
  }
  public void setADIMAGE3LINKDUPLICATED(Integer AD_IMAGE_3_LINK_DUPLICATED) {
    this.AD_IMAGE_3_LINK_DUPLICATED = AD_IMAGE_3_LINK_DUPLICATED;
  }

  /**
   * Ad image link 3 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_3_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG = AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 3 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_3_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE3LINKLENGTHTOOLONG() {
    return AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE3LINKLENGTHTOOLONG(Integer AD_IMAGE_3_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG = AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 3 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_REQUIRED(Integer AD_IMAGE_3_LINK_REQUIRED) {
    this.AD_IMAGE_3_LINK_REQUIRED = AD_IMAGE_3_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 3 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_3_LINK_REQUIRED")
  public Integer getADIMAGE3LINKREQUIRED() {
    return AD_IMAGE_3_LINK_REQUIRED;
  }
  public void setADIMAGE3LINKREQUIRED(Integer AD_IMAGE_3_LINK_REQUIRED) {
    this.AD_IMAGE_3_LINK_REQUIRED = AD_IMAGE_3_LINK_REQUIRED;
  }

  /**
   * Ad image link 3 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_WARNING(Integer AD_IMAGE_3_LINK_WARNING) {
    this.AD_IMAGE_3_LINK_WARNING = AD_IMAGE_3_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 3 format is unsupported.")
  @JsonProperty("AD_IMAGE_3_LINK_WARNING")
  public Integer getADIMAGE3LINKWARNING() {
    return AD_IMAGE_3_LINK_WARNING;
  }
  public void setADIMAGE3LINKWARNING(Integer AD_IMAGE_3_LINK_WARNING) {
    this.AD_IMAGE_3_LINK_WARNING = AD_IMAGE_3_LINK_WARNING;
  }

  /**
   * ad_image_3_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_3_TAG_DUPLICATED(Integer AD_IMAGE_3_TAG_DUPLICATED) {
    this.AD_IMAGE_3_TAG_DUPLICATED = AD_IMAGE_3_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_3_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_3_TAG_DUPLICATED")
  public Integer getADIMAGE3TAGDUPLICATED() {
    return AD_IMAGE_3_TAG_DUPLICATED;
  }
  public void setADIMAGE3TAGDUPLICATED(Integer AD_IMAGE_3_TAG_DUPLICATED) {
    this.AD_IMAGE_3_TAG_DUPLICATED = AD_IMAGE_3_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 3 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_3_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_3_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG = AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 3 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_3_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE3TAGLENGTHTOOLONG() {
    return AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE3TAGLENGTHTOOLONG(Integer AD_IMAGE_3_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG = AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 3 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_3_TAG_REQUIRED(Integer AD_IMAGE_3_TAG_REQUIRED) {
    this.AD_IMAGE_3_TAG_REQUIRED = AD_IMAGE_3_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 3 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_3_TAG_REQUIRED")
  public Integer getADIMAGE3TAGREQUIRED() {
    return AD_IMAGE_3_TAG_REQUIRED;
  }
  public void setADIMAGE3TAGREQUIRED(Integer AD_IMAGE_3_TAG_REQUIRED) {
    this.AD_IMAGE_3_TAG_REQUIRED = AD_IMAGE_3_TAG_REQUIRED;
  }

  /**
   * ad_image_4_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_DUPLICATED(Integer AD_IMAGE_4_LINK_DUPLICATED) {
    this.AD_IMAGE_4_LINK_DUPLICATED = AD_IMAGE_4_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_4_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_4_LINK_DUPLICATED")
  public Integer getADIMAGE4LINKDUPLICATED() {
    return AD_IMAGE_4_LINK_DUPLICATED;
  }
  public void setADIMAGE4LINKDUPLICATED(Integer AD_IMAGE_4_LINK_DUPLICATED) {
    this.AD_IMAGE_4_LINK_DUPLICATED = AD_IMAGE_4_LINK_DUPLICATED;
  }

  /**
   * Ad image link 4 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_4_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG = AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 4 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_4_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE4LINKLENGTHTOOLONG() {
    return AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE4LINKLENGTHTOOLONG(Integer AD_IMAGE_4_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG = AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 4 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_REQUIRED(Integer AD_IMAGE_4_LINK_REQUIRED) {
    this.AD_IMAGE_4_LINK_REQUIRED = AD_IMAGE_4_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 4 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_4_LINK_REQUIRED")
  public Integer getADIMAGE4LINKREQUIRED() {
    return AD_IMAGE_4_LINK_REQUIRED;
  }
  public void setADIMAGE4LINKREQUIRED(Integer AD_IMAGE_4_LINK_REQUIRED) {
    this.AD_IMAGE_4_LINK_REQUIRED = AD_IMAGE_4_LINK_REQUIRED;
  }

  /**
   * Ad image link 4 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_WARNING(Integer AD_IMAGE_4_LINK_WARNING) {
    this.AD_IMAGE_4_LINK_WARNING = AD_IMAGE_4_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 4 format is unsupported.")
  @JsonProperty("AD_IMAGE_4_LINK_WARNING")
  public Integer getADIMAGE4LINKWARNING() {
    return AD_IMAGE_4_LINK_WARNING;
  }
  public void setADIMAGE4LINKWARNING(Integer AD_IMAGE_4_LINK_WARNING) {
    this.AD_IMAGE_4_LINK_WARNING = AD_IMAGE_4_LINK_WARNING;
  }

  /**
   * ad_image_4_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_4_TAG_DUPLICATED(Integer AD_IMAGE_4_TAG_DUPLICATED) {
    this.AD_IMAGE_4_TAG_DUPLICATED = AD_IMAGE_4_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_4_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_4_TAG_DUPLICATED")
  public Integer getADIMAGE4TAGDUPLICATED() {
    return AD_IMAGE_4_TAG_DUPLICATED;
  }
  public void setADIMAGE4TAGDUPLICATED(Integer AD_IMAGE_4_TAG_DUPLICATED) {
    this.AD_IMAGE_4_TAG_DUPLICATED = AD_IMAGE_4_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 4 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_4_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_4_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG = AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 4 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_4_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE4TAGLENGTHTOOLONG() {
    return AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE4TAGLENGTHTOOLONG(Integer AD_IMAGE_4_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG = AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 4 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_4_TAG_REQUIRED(Integer AD_IMAGE_4_TAG_REQUIRED) {
    this.AD_IMAGE_4_TAG_REQUIRED = AD_IMAGE_4_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 4 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_4_TAG_REQUIRED")
  public Integer getADIMAGE4TAGREQUIRED() {
    return AD_IMAGE_4_TAG_REQUIRED;
  }
  public void setADIMAGE4TAGREQUIRED(Integer AD_IMAGE_4_TAG_REQUIRED) {
    this.AD_IMAGE_4_TAG_REQUIRED = AD_IMAGE_4_TAG_REQUIRED;
  }

  /**
   * ad_image_5_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_DUPLICATED(Integer AD_IMAGE_5_LINK_DUPLICATED) {
    this.AD_IMAGE_5_LINK_DUPLICATED = AD_IMAGE_5_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_5_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_5_LINK_DUPLICATED")
  public Integer getADIMAGE5LINKDUPLICATED() {
    return AD_IMAGE_5_LINK_DUPLICATED;
  }
  public void setADIMAGE5LINKDUPLICATED(Integer AD_IMAGE_5_LINK_DUPLICATED) {
    this.AD_IMAGE_5_LINK_DUPLICATED = AD_IMAGE_5_LINK_DUPLICATED;
  }

  /**
   * Ad image link 5 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_5_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG = AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 5 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_5_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE5LINKLENGTHTOOLONG() {
    return AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE5LINKLENGTHTOOLONG(Integer AD_IMAGE_5_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG = AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 5 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_REQUIRED(Integer AD_IMAGE_5_LINK_REQUIRED) {
    this.AD_IMAGE_5_LINK_REQUIRED = AD_IMAGE_5_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 5 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_5_LINK_REQUIRED")
  public Integer getADIMAGE5LINKREQUIRED() {
    return AD_IMAGE_5_LINK_REQUIRED;
  }
  public void setADIMAGE5LINKREQUIRED(Integer AD_IMAGE_5_LINK_REQUIRED) {
    this.AD_IMAGE_5_LINK_REQUIRED = AD_IMAGE_5_LINK_REQUIRED;
  }

  /**
   * Ad image link 5 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_WARNING(Integer AD_IMAGE_5_LINK_WARNING) {
    this.AD_IMAGE_5_LINK_WARNING = AD_IMAGE_5_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 5 format is unsupported.")
  @JsonProperty("AD_IMAGE_5_LINK_WARNING")
  public Integer getADIMAGE5LINKWARNING() {
    return AD_IMAGE_5_LINK_WARNING;
  }
  public void setADIMAGE5LINKWARNING(Integer AD_IMAGE_5_LINK_WARNING) {
    this.AD_IMAGE_5_LINK_WARNING = AD_IMAGE_5_LINK_WARNING;
  }

  /**
   * ad_image_5_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_5_TAG_DUPLICATED(Integer AD_IMAGE_5_TAG_DUPLICATED) {
    this.AD_IMAGE_5_TAG_DUPLICATED = AD_IMAGE_5_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_5_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_5_TAG_DUPLICATED")
  public Integer getADIMAGE5TAGDUPLICATED() {
    return AD_IMAGE_5_TAG_DUPLICATED;
  }
  public void setADIMAGE5TAGDUPLICATED(Integer AD_IMAGE_5_TAG_DUPLICATED) {
    this.AD_IMAGE_5_TAG_DUPLICATED = AD_IMAGE_5_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 5 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_5_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_5_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG = AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 5 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_5_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE5TAGLENGTHTOOLONG() {
    return AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE5TAGLENGTHTOOLONG(Integer AD_IMAGE_5_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG = AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 5 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_5_TAG_REQUIRED(Integer AD_IMAGE_5_TAG_REQUIRED) {
    this.AD_IMAGE_5_TAG_REQUIRED = AD_IMAGE_5_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 5 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_5_TAG_REQUIRED")
  public Integer getADIMAGE5TAGREQUIRED() {
    return AD_IMAGE_5_TAG_REQUIRED;
  }
  public void setADIMAGE5TAGREQUIRED(Integer AD_IMAGE_5_TAG_REQUIRED) {
    this.AD_IMAGE_5_TAG_REQUIRED = AD_IMAGE_5_TAG_REQUIRED;
  }

  /**
   * ad_image_6_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_DUPLICATED(Integer AD_IMAGE_6_LINK_DUPLICATED) {
    this.AD_IMAGE_6_LINK_DUPLICATED = AD_IMAGE_6_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_6_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_6_LINK_DUPLICATED")
  public Integer getADIMAGE6LINKDUPLICATED() {
    return AD_IMAGE_6_LINK_DUPLICATED;
  }
  public void setADIMAGE6LINKDUPLICATED(Integer AD_IMAGE_6_LINK_DUPLICATED) {
    this.AD_IMAGE_6_LINK_DUPLICATED = AD_IMAGE_6_LINK_DUPLICATED;
  }

  /**
   * Ad image link 6 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_6_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG = AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 6 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_6_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE6LINKLENGTHTOOLONG() {
    return AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE6LINKLENGTHTOOLONG(Integer AD_IMAGE_6_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG = AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 6 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_REQUIRED(Integer AD_IMAGE_6_LINK_REQUIRED) {
    this.AD_IMAGE_6_LINK_REQUIRED = AD_IMAGE_6_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 6 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_6_LINK_REQUIRED")
  public Integer getADIMAGE6LINKREQUIRED() {
    return AD_IMAGE_6_LINK_REQUIRED;
  }
  public void setADIMAGE6LINKREQUIRED(Integer AD_IMAGE_6_LINK_REQUIRED) {
    this.AD_IMAGE_6_LINK_REQUIRED = AD_IMAGE_6_LINK_REQUIRED;
  }

  /**
   * Ad image link 6 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_WARNING(Integer AD_IMAGE_6_LINK_WARNING) {
    this.AD_IMAGE_6_LINK_WARNING = AD_IMAGE_6_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 6 format is unsupported.")
  @JsonProperty("AD_IMAGE_6_LINK_WARNING")
  public Integer getADIMAGE6LINKWARNING() {
    return AD_IMAGE_6_LINK_WARNING;
  }
  public void setADIMAGE6LINKWARNING(Integer AD_IMAGE_6_LINK_WARNING) {
    this.AD_IMAGE_6_LINK_WARNING = AD_IMAGE_6_LINK_WARNING;
  }

  /**
   * ad_image_6_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_6_TAG_DUPLICATED(Integer AD_IMAGE_6_TAG_DUPLICATED) {
    this.AD_IMAGE_6_TAG_DUPLICATED = AD_IMAGE_6_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_6_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_6_TAG_DUPLICATED")
  public Integer getADIMAGE6TAGDUPLICATED() {
    return AD_IMAGE_6_TAG_DUPLICATED;
  }
  public void setADIMAGE6TAGDUPLICATED(Integer AD_IMAGE_6_TAG_DUPLICATED) {
    this.AD_IMAGE_6_TAG_DUPLICATED = AD_IMAGE_6_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 6 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_6_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_6_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG = AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 6 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_6_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE6TAGLENGTHTOOLONG() {
    return AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE6TAGLENGTHTOOLONG(Integer AD_IMAGE_6_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG = AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 6 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_6_TAG_REQUIRED(Integer AD_IMAGE_6_TAG_REQUIRED) {
    this.AD_IMAGE_6_TAG_REQUIRED = AD_IMAGE_6_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 6 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_6_TAG_REQUIRED")
  public Integer getADIMAGE6TAGREQUIRED() {
    return AD_IMAGE_6_TAG_REQUIRED;
  }
  public void setADIMAGE6TAGREQUIRED(Integer AD_IMAGE_6_TAG_REQUIRED) {
    this.AD_IMAGE_6_TAG_REQUIRED = AD_IMAGE_6_TAG_REQUIRED;
  }

  /**
   * ad_image_7_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_DUPLICATED(Integer AD_IMAGE_7_LINK_DUPLICATED) {
    this.AD_IMAGE_7_LINK_DUPLICATED = AD_IMAGE_7_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_7_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_7_LINK_DUPLICATED")
  public Integer getADIMAGE7LINKDUPLICATED() {
    return AD_IMAGE_7_LINK_DUPLICATED;
  }
  public void setADIMAGE7LINKDUPLICATED(Integer AD_IMAGE_7_LINK_DUPLICATED) {
    this.AD_IMAGE_7_LINK_DUPLICATED = AD_IMAGE_7_LINK_DUPLICATED;
  }

  /**
   * Ad image link 7 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_7_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG = AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 7 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_7_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE7LINKLENGTHTOOLONG() {
    return AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE7LINKLENGTHTOOLONG(Integer AD_IMAGE_7_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG = AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 7 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_REQUIRED(Integer AD_IMAGE_7_LINK_REQUIRED) {
    this.AD_IMAGE_7_LINK_REQUIRED = AD_IMAGE_7_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 7 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_7_LINK_REQUIRED")
  public Integer getADIMAGE7LINKREQUIRED() {
    return AD_IMAGE_7_LINK_REQUIRED;
  }
  public void setADIMAGE7LINKREQUIRED(Integer AD_IMAGE_7_LINK_REQUIRED) {
    this.AD_IMAGE_7_LINK_REQUIRED = AD_IMAGE_7_LINK_REQUIRED;
  }

  /**
   * Ad image link 7 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_WARNING(Integer AD_IMAGE_7_LINK_WARNING) {
    this.AD_IMAGE_7_LINK_WARNING = AD_IMAGE_7_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 7 format is unsupported.")
  @JsonProperty("AD_IMAGE_7_LINK_WARNING")
  public Integer getADIMAGE7LINKWARNING() {
    return AD_IMAGE_7_LINK_WARNING;
  }
  public void setADIMAGE7LINKWARNING(Integer AD_IMAGE_7_LINK_WARNING) {
    this.AD_IMAGE_7_LINK_WARNING = AD_IMAGE_7_LINK_WARNING;
  }

  /**
   * ad_image_7_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_7_TAG_DUPLICATED(Integer AD_IMAGE_7_TAG_DUPLICATED) {
    this.AD_IMAGE_7_TAG_DUPLICATED = AD_IMAGE_7_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_7_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_7_TAG_DUPLICATED")
  public Integer getADIMAGE7TAGDUPLICATED() {
    return AD_IMAGE_7_TAG_DUPLICATED;
  }
  public void setADIMAGE7TAGDUPLICATED(Integer AD_IMAGE_7_TAG_DUPLICATED) {
    this.AD_IMAGE_7_TAG_DUPLICATED = AD_IMAGE_7_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 7 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_7_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_7_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG = AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 7 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_7_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE7TAGLENGTHTOOLONG() {
    return AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE7TAGLENGTHTOOLONG(Integer AD_IMAGE_7_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG = AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 7 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_7_TAG_REQUIRED(Integer AD_IMAGE_7_TAG_REQUIRED) {
    this.AD_IMAGE_7_TAG_REQUIRED = AD_IMAGE_7_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 7 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_7_TAG_REQUIRED")
  public Integer getADIMAGE7TAGREQUIRED() {
    return AD_IMAGE_7_TAG_REQUIRED;
  }
  public void setADIMAGE7TAGREQUIRED(Integer AD_IMAGE_7_TAG_REQUIRED) {
    this.AD_IMAGE_7_TAG_REQUIRED = AD_IMAGE_7_TAG_REQUIRED;
  }

  /**
   * ad_image_8_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_DUPLICATED(Integer AD_IMAGE_8_LINK_DUPLICATED) {
    this.AD_IMAGE_8_LINK_DUPLICATED = AD_IMAGE_8_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_8_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_8_LINK_DUPLICATED")
  public Integer getADIMAGE8LINKDUPLICATED() {
    return AD_IMAGE_8_LINK_DUPLICATED;
  }
  public void setADIMAGE8LINKDUPLICATED(Integer AD_IMAGE_8_LINK_DUPLICATED) {
    this.AD_IMAGE_8_LINK_DUPLICATED = AD_IMAGE_8_LINK_DUPLICATED;
  }

  /**
   * Ad image link 8 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_8_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG = AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 8 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_8_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE8LINKLENGTHTOOLONG() {
    return AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE8LINKLENGTHTOOLONG(Integer AD_IMAGE_8_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG = AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 8 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_REQUIRED(Integer AD_IMAGE_8_LINK_REQUIRED) {
    this.AD_IMAGE_8_LINK_REQUIRED = AD_IMAGE_8_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 8 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_8_LINK_REQUIRED")
  public Integer getADIMAGE8LINKREQUIRED() {
    return AD_IMAGE_8_LINK_REQUIRED;
  }
  public void setADIMAGE8LINKREQUIRED(Integer AD_IMAGE_8_LINK_REQUIRED) {
    this.AD_IMAGE_8_LINK_REQUIRED = AD_IMAGE_8_LINK_REQUIRED;
  }

  /**
   * Ad image link 8 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_WARNING(Integer AD_IMAGE_8_LINK_WARNING) {
    this.AD_IMAGE_8_LINK_WARNING = AD_IMAGE_8_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 8 format is unsupported.")
  @JsonProperty("AD_IMAGE_8_LINK_WARNING")
  public Integer getADIMAGE8LINKWARNING() {
    return AD_IMAGE_8_LINK_WARNING;
  }
  public void setADIMAGE8LINKWARNING(Integer AD_IMAGE_8_LINK_WARNING) {
    this.AD_IMAGE_8_LINK_WARNING = AD_IMAGE_8_LINK_WARNING;
  }

  /**
   * ad_image_8_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_8_TAG_DUPLICATED(Integer AD_IMAGE_8_TAG_DUPLICATED) {
    this.AD_IMAGE_8_TAG_DUPLICATED = AD_IMAGE_8_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_8_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_8_TAG_DUPLICATED")
  public Integer getADIMAGE8TAGDUPLICATED() {
    return AD_IMAGE_8_TAG_DUPLICATED;
  }
  public void setADIMAGE8TAGDUPLICATED(Integer AD_IMAGE_8_TAG_DUPLICATED) {
    this.AD_IMAGE_8_TAG_DUPLICATED = AD_IMAGE_8_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 8 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_8_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_8_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG = AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 8 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_8_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE8TAGLENGTHTOOLONG() {
    return AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE8TAGLENGTHTOOLONG(Integer AD_IMAGE_8_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG = AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 8 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_8_TAG_REQUIRED(Integer AD_IMAGE_8_TAG_REQUIRED) {
    this.AD_IMAGE_8_TAG_REQUIRED = AD_IMAGE_8_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 8 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_8_TAG_REQUIRED")
  public Integer getADIMAGE8TAGREQUIRED() {
    return AD_IMAGE_8_TAG_REQUIRED;
  }
  public void setADIMAGE8TAGREQUIRED(Integer AD_IMAGE_8_TAG_REQUIRED) {
    this.AD_IMAGE_8_TAG_REQUIRED = AD_IMAGE_8_TAG_REQUIRED;
  }

  /**
   * ad_image_9_link is duplicated with another ad image link.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_DUPLICATED(Integer AD_IMAGE_9_LINK_DUPLICATED) {
    this.AD_IMAGE_9_LINK_DUPLICATED = AD_IMAGE_9_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_9_link is duplicated with another ad image link.")
  @JsonProperty("AD_IMAGE_9_LINK_DUPLICATED")
  public Integer getADIMAGE9LINKDUPLICATED() {
    return AD_IMAGE_9_LINK_DUPLICATED;
  }
  public void setADIMAGE9LINKDUPLICATED(Integer AD_IMAGE_9_LINK_DUPLICATED) {
    this.AD_IMAGE_9_LINK_DUPLICATED = AD_IMAGE_9_LINK_DUPLICATED;
  }

  /**
   * Ad image link 9 length is too long. The maximum length is 2047 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_LENGTH_TOO_LONG(Integer AD_IMAGE_9_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG = AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 9 length is too long. The maximum length is 2047 characters.")
  @JsonProperty("AD_IMAGE_9_LINK_LENGTH_TOO_LONG")
  public Integer getADIMAGE9LINKLENGTHTOOLONG() {
    return AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
  }
  public void setADIMAGE9LINKLENGTHTOOLONG(Integer AD_IMAGE_9_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG = AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Ad image link 9 is required because an image tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_REQUIRED(Integer AD_IMAGE_9_LINK_REQUIRED) {
    this.AD_IMAGE_9_LINK_REQUIRED = AD_IMAGE_9_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 9 is required because an image tag was provided.")
  @JsonProperty("AD_IMAGE_9_LINK_REQUIRED")
  public Integer getADIMAGE9LINKREQUIRED() {
    return AD_IMAGE_9_LINK_REQUIRED;
  }
  public void setADIMAGE9LINKREQUIRED(Integer AD_IMAGE_9_LINK_REQUIRED) {
    this.AD_IMAGE_9_LINK_REQUIRED = AD_IMAGE_9_LINK_REQUIRED;
  }

  /**
   * Ad image link 9 format is unsupported.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_WARNING(Integer AD_IMAGE_9_LINK_WARNING) {
    this.AD_IMAGE_9_LINK_WARNING = AD_IMAGE_9_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image link 9 format is unsupported.")
  @JsonProperty("AD_IMAGE_9_LINK_WARNING")
  public Integer getADIMAGE9LINKWARNING() {
    return AD_IMAGE_9_LINK_WARNING;
  }
  public void setADIMAGE9LINKWARNING(Integer AD_IMAGE_9_LINK_WARNING) {
    this.AD_IMAGE_9_LINK_WARNING = AD_IMAGE_9_LINK_WARNING;
  }

  /**
   * ad_image_9_tag is duplicated with another ad image tag.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_9_TAG_DUPLICATED(Integer AD_IMAGE_9_TAG_DUPLICATED) {
    this.AD_IMAGE_9_TAG_DUPLICATED = AD_IMAGE_9_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_image_9_tag is duplicated with another ad image tag.")
  @JsonProperty("AD_IMAGE_9_TAG_DUPLICATED")
  public Integer getADIMAGE9TAGDUPLICATED() {
    return AD_IMAGE_9_TAG_DUPLICATED;
  }
  public void setADIMAGE9TAGDUPLICATED(Integer AD_IMAGE_9_TAG_DUPLICATED) {
    this.AD_IMAGE_9_TAG_DUPLICATED = AD_IMAGE_9_TAG_DUPLICATED;
  }

  /**
   * Ad image tag 9 length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_9_TAG_LENGTH_TOO_LONG(Integer AD_IMAGE_9_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG = AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 9 length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_IMAGE_9_TAG_LENGTH_TOO_LONG")
  public Integer getADIMAGE9TAGLENGTHTOOLONG() {
    return AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
  }
  public void setADIMAGE9TAGLENGTHTOOLONG(Integer AD_IMAGE_9_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG = AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
  }

  /**
   * Ad image tag 9 is required because an image link was provided.
   */
  public CatalogsFeedValidationWarnings AD_IMAGE_9_TAG_REQUIRED(Integer AD_IMAGE_9_TAG_REQUIRED) {
    this.AD_IMAGE_9_TAG_REQUIRED = AD_IMAGE_9_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "Ad image tag 9 is required because an image link was provided.")
  @JsonProperty("AD_IMAGE_9_TAG_REQUIRED")
  public Integer getADIMAGE9TAGREQUIRED() {
    return AD_IMAGE_9_TAG_REQUIRED;
  }
  public void setADIMAGE9TAGREQUIRED(Integer AD_IMAGE_9_TAG_REQUIRED) {
    this.AD_IMAGE_9_TAG_REQUIRED = AD_IMAGE_9_TAG_REQUIRED;
  }

  /**
   * Some items have ad links that are formatted incorrectly.
   */
  public CatalogsFeedValidationWarnings AD_LINK_FORMAT_WARNING(Integer AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have ad links that are formatted incorrectly.")
  @JsonProperty("AD_LINK_FORMAT_WARNING")
  public Integer getADLINKFORMATWARNING() {
    return AD_LINK_FORMAT_WARNING;
  }
  public void setADLINKFORMATWARNING(Integer AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
  }

  /**
   * Some items have ad link URLs that are duplicates of the link URLs for those items.
   */
  public CatalogsFeedValidationWarnings AD_LINK_SAME_AS_LINK(Integer AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have ad link URLs that are duplicates of the link URLs for those items.")
  @JsonProperty("AD_LINK_SAME_AS_LINK")
  public Integer getADLINKSAMEASLINK() {
    return AD_LINK_SAME_AS_LINK;
  }
  public void setADLINKSAMEASLINK(Integer AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
  }

  /**
   * ad_video_0_link is duplicated with another ad video link.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_DUPLICATED(Integer AD_VIDEO_0_LINK_DUPLICATED) {
    this.AD_VIDEO_0_LINK_DUPLICATED = AD_VIDEO_0_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_0_link is duplicated with another ad video link.")
  @JsonProperty("AD_VIDEO_0_LINK_DUPLICATED")
  public Integer getADVIDEO0LINKDUPLICATED() {
    return AD_VIDEO_0_LINK_DUPLICATED;
  }
  public void setADVIDEO0LINKDUPLICATED(Integer AD_VIDEO_0_LINK_DUPLICATED) {
    this.AD_VIDEO_0_LINK_DUPLICATED = AD_VIDEO_0_LINK_DUPLICATED;
  }

  /**
   * ad_video_0_link length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_LENGTH_TOO_LONG(Integer AD_VIDEO_0_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG = AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_0_link length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_VIDEO_0_LINK_LENGTH_TOO_LONG")
  public Integer getADVIDEO0LINKLENGTHTOOLONG() {
    return AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
  }
  public void setADVIDEO0LINKLENGTHTOOLONG(Integer AD_VIDEO_0_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG = AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
  }

  /**
   * ad_video_0_link is required for this item because ad_video_0_tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_REQUIRED(Integer AD_VIDEO_0_LINK_REQUIRED) {
    this.AD_VIDEO_0_LINK_REQUIRED = AD_VIDEO_0_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_0_link is required for this item because ad_video_0_tag was provided.")
  @JsonProperty("AD_VIDEO_0_LINK_REQUIRED")
  public Integer getADVIDEO0LINKREQUIRED() {
    return AD_VIDEO_0_LINK_REQUIRED;
  }
  public void setADVIDEO0LINKREQUIRED(Integer AD_VIDEO_0_LINK_REQUIRED) {
    this.AD_VIDEO_0_LINK_REQUIRED = AD_VIDEO_0_LINK_REQUIRED;
  }

  /**
   * ad_video_0_link is formatted incorrectly and will not be published with your items.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_WARNING(Integer AD_VIDEO_0_LINK_WARNING) {
    this.AD_VIDEO_0_LINK_WARNING = AD_VIDEO_0_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_0_link is formatted incorrectly and will not be published with your items.")
  @JsonProperty("AD_VIDEO_0_LINK_WARNING")
  public Integer getADVIDEO0LINKWARNING() {
    return AD_VIDEO_0_LINK_WARNING;
  }
  public void setADVIDEO0LINKWARNING(Integer AD_VIDEO_0_LINK_WARNING) {
    this.AD_VIDEO_0_LINK_WARNING = AD_VIDEO_0_LINK_WARNING;
  }

  /**
   * ad_video_0_tag is duplicated with another ad video tag.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_0_TAG_DUPLICATED(Integer AD_VIDEO_0_TAG_DUPLICATED) {
    this.AD_VIDEO_0_TAG_DUPLICATED = AD_VIDEO_0_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_0_tag is duplicated with another ad video tag.")
  @JsonProperty("AD_VIDEO_0_TAG_DUPLICATED")
  public Integer getADVIDEO0TAGDUPLICATED() {
    return AD_VIDEO_0_TAG_DUPLICATED;
  }
  public void setADVIDEO0TAGDUPLICATED(Integer AD_VIDEO_0_TAG_DUPLICATED) {
    this.AD_VIDEO_0_TAG_DUPLICATED = AD_VIDEO_0_TAG_DUPLICATED;
  }

  /**
   * ad_video_0_tag length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_0_TAG_LENGTH_TOO_LONG(Integer AD_VIDEO_0_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG = AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_0_tag length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_VIDEO_0_TAG_LENGTH_TOO_LONG")
  public Integer getADVIDEO0TAGLENGTHTOOLONG() {
    return AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
  }
  public void setADVIDEO0TAGLENGTHTOOLONG(Integer AD_VIDEO_0_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG = AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
  }

  /**
   * ad_video_0_tag is required because ad_video_0_link was provided.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_0_TAG_REQUIRED(Integer AD_VIDEO_0_TAG_REQUIRED) {
    this.AD_VIDEO_0_TAG_REQUIRED = AD_VIDEO_0_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_0_tag is required because ad_video_0_link was provided.")
  @JsonProperty("AD_VIDEO_0_TAG_REQUIRED")
  public Integer getADVIDEO0TAGREQUIRED() {
    return AD_VIDEO_0_TAG_REQUIRED;
  }
  public void setADVIDEO0TAGREQUIRED(Integer AD_VIDEO_0_TAG_REQUIRED) {
    this.AD_VIDEO_0_TAG_REQUIRED = AD_VIDEO_0_TAG_REQUIRED;
  }

  /**
   * ad_video_1_link is duplicated with another ad video link.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_DUPLICATED(Integer AD_VIDEO_1_LINK_DUPLICATED) {
    this.AD_VIDEO_1_LINK_DUPLICATED = AD_VIDEO_1_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_1_link is duplicated with another ad video link.")
  @JsonProperty("AD_VIDEO_1_LINK_DUPLICATED")
  public Integer getADVIDEO1LINKDUPLICATED() {
    return AD_VIDEO_1_LINK_DUPLICATED;
  }
  public void setADVIDEO1LINKDUPLICATED(Integer AD_VIDEO_1_LINK_DUPLICATED) {
    this.AD_VIDEO_1_LINK_DUPLICATED = AD_VIDEO_1_LINK_DUPLICATED;
  }

  /**
   * ad_video_1_link length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_LENGTH_TOO_LONG(Integer AD_VIDEO_1_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG = AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_1_link length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_VIDEO_1_LINK_LENGTH_TOO_LONG")
  public Integer getADVIDEO1LINKLENGTHTOOLONG() {
    return AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
  }
  public void setADVIDEO1LINKLENGTHTOOLONG(Integer AD_VIDEO_1_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG = AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
  }

  /**
   * ad_video_1_link is required for this item because ad_video_1_tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_REQUIRED(Integer AD_VIDEO_1_LINK_REQUIRED) {
    this.AD_VIDEO_1_LINK_REQUIRED = AD_VIDEO_1_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_1_link is required for this item because ad_video_1_tag was provided.")
  @JsonProperty("AD_VIDEO_1_LINK_REQUIRED")
  public Integer getADVIDEO1LINKREQUIRED() {
    return AD_VIDEO_1_LINK_REQUIRED;
  }
  public void setADVIDEO1LINKREQUIRED(Integer AD_VIDEO_1_LINK_REQUIRED) {
    this.AD_VIDEO_1_LINK_REQUIRED = AD_VIDEO_1_LINK_REQUIRED;
  }

  /**
   * ad_video_1_link is formatted incorrectly and will not be published with your items.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_WARNING(Integer AD_VIDEO_1_LINK_WARNING) {
    this.AD_VIDEO_1_LINK_WARNING = AD_VIDEO_1_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_1_link is formatted incorrectly and will not be published with your items.")
  @JsonProperty("AD_VIDEO_1_LINK_WARNING")
  public Integer getADVIDEO1LINKWARNING() {
    return AD_VIDEO_1_LINK_WARNING;
  }
  public void setADVIDEO1LINKWARNING(Integer AD_VIDEO_1_LINK_WARNING) {
    this.AD_VIDEO_1_LINK_WARNING = AD_VIDEO_1_LINK_WARNING;
  }

  /**
   * ad_video_1_tag is duplicated with another ad video tag.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_1_TAG_DUPLICATED(Integer AD_VIDEO_1_TAG_DUPLICATED) {
    this.AD_VIDEO_1_TAG_DUPLICATED = AD_VIDEO_1_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_1_tag is duplicated with another ad video tag.")
  @JsonProperty("AD_VIDEO_1_TAG_DUPLICATED")
  public Integer getADVIDEO1TAGDUPLICATED() {
    return AD_VIDEO_1_TAG_DUPLICATED;
  }
  public void setADVIDEO1TAGDUPLICATED(Integer AD_VIDEO_1_TAG_DUPLICATED) {
    this.AD_VIDEO_1_TAG_DUPLICATED = AD_VIDEO_1_TAG_DUPLICATED;
  }

  /**
   * ad_video_1_tag length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_1_TAG_LENGTH_TOO_LONG(Integer AD_VIDEO_1_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG = AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_1_tag length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_VIDEO_1_TAG_LENGTH_TOO_LONG")
  public Integer getADVIDEO1TAGLENGTHTOOLONG() {
    return AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
  }
  public void setADVIDEO1TAGLENGTHTOOLONG(Integer AD_VIDEO_1_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG = AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
  }

  /**
   * ad_video_1_tag is required because ad_video_1_link was provided.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_1_TAG_REQUIRED(Integer AD_VIDEO_1_TAG_REQUIRED) {
    this.AD_VIDEO_1_TAG_REQUIRED = AD_VIDEO_1_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_1_tag is required because ad_video_1_link was provided.")
  @JsonProperty("AD_VIDEO_1_TAG_REQUIRED")
  public Integer getADVIDEO1TAGREQUIRED() {
    return AD_VIDEO_1_TAG_REQUIRED;
  }
  public void setADVIDEO1TAGREQUIRED(Integer AD_VIDEO_1_TAG_REQUIRED) {
    this.AD_VIDEO_1_TAG_REQUIRED = AD_VIDEO_1_TAG_REQUIRED;
  }

  /**
   * ad_video_2_link is duplicated with another ad video link.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_DUPLICATED(Integer AD_VIDEO_2_LINK_DUPLICATED) {
    this.AD_VIDEO_2_LINK_DUPLICATED = AD_VIDEO_2_LINK_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_2_link is duplicated with another ad video link.")
  @JsonProperty("AD_VIDEO_2_LINK_DUPLICATED")
  public Integer getADVIDEO2LINKDUPLICATED() {
    return AD_VIDEO_2_LINK_DUPLICATED;
  }
  public void setADVIDEO2LINKDUPLICATED(Integer AD_VIDEO_2_LINK_DUPLICATED) {
    this.AD_VIDEO_2_LINK_DUPLICATED = AD_VIDEO_2_LINK_DUPLICATED;
  }

  /**
   * ad_video_2_link length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_LENGTH_TOO_LONG(Integer AD_VIDEO_2_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG = AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_2_link length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_VIDEO_2_LINK_LENGTH_TOO_LONG")
  public Integer getADVIDEO2LINKLENGTHTOOLONG() {
    return AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
  }
  public void setADVIDEO2LINKLENGTHTOOLONG(Integer AD_VIDEO_2_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG = AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
  }

  /**
   * ad_video_2_link is required for this item because ad_video_2_tag was provided.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_REQUIRED(Integer AD_VIDEO_2_LINK_REQUIRED) {
    this.AD_VIDEO_2_LINK_REQUIRED = AD_VIDEO_2_LINK_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_2_link is required for this item because ad_video_2_tag was provided.")
  @JsonProperty("AD_VIDEO_2_LINK_REQUIRED")
  public Integer getADVIDEO2LINKREQUIRED() {
    return AD_VIDEO_2_LINK_REQUIRED;
  }
  public void setADVIDEO2LINKREQUIRED(Integer AD_VIDEO_2_LINK_REQUIRED) {
    this.AD_VIDEO_2_LINK_REQUIRED = AD_VIDEO_2_LINK_REQUIRED;
  }

  /**
   * ad_video_2_link is formatted incorrectly and will not be published with your items.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_WARNING(Integer AD_VIDEO_2_LINK_WARNING) {
    this.AD_VIDEO_2_LINK_WARNING = AD_VIDEO_2_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_2_link is formatted incorrectly and will not be published with your items.")
  @JsonProperty("AD_VIDEO_2_LINK_WARNING")
  public Integer getADVIDEO2LINKWARNING() {
    return AD_VIDEO_2_LINK_WARNING;
  }
  public void setADVIDEO2LINKWARNING(Integer AD_VIDEO_2_LINK_WARNING) {
    this.AD_VIDEO_2_LINK_WARNING = AD_VIDEO_2_LINK_WARNING;
  }

  /**
   * ad_video_2_tag is duplicated with another ad video tag.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_2_TAG_DUPLICATED(Integer AD_VIDEO_2_TAG_DUPLICATED) {
    this.AD_VIDEO_2_TAG_DUPLICATED = AD_VIDEO_2_TAG_DUPLICATED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_2_tag is duplicated with another ad video tag.")
  @JsonProperty("AD_VIDEO_2_TAG_DUPLICATED")
  public Integer getADVIDEO2TAGDUPLICATED() {
    return AD_VIDEO_2_TAG_DUPLICATED;
  }
  public void setADVIDEO2TAGDUPLICATED(Integer AD_VIDEO_2_TAG_DUPLICATED) {
    this.AD_VIDEO_2_TAG_DUPLICATED = AD_VIDEO_2_TAG_DUPLICATED;
  }

  /**
   * ad_video_2_tag length is too long. The maximum length is 511 characters.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_2_TAG_LENGTH_TOO_LONG(Integer AD_VIDEO_2_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG = AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_2_tag length is too long. The maximum length is 511 characters.")
  @JsonProperty("AD_VIDEO_2_TAG_LENGTH_TOO_LONG")
  public Integer getADVIDEO2TAGLENGTHTOOLONG() {
    return AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
  }
  public void setADVIDEO2TAGLENGTHTOOLONG(Integer AD_VIDEO_2_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG = AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
  }

  /**
   * ad_video_2_tag is required because ad_video_2_link was provided.
   */
  public CatalogsFeedValidationWarnings AD_VIDEO_2_TAG_REQUIRED(Integer AD_VIDEO_2_TAG_REQUIRED) {
    this.AD_VIDEO_2_TAG_REQUIRED = AD_VIDEO_2_TAG_REQUIRED;
    return this;
  }

  
  @ApiModelProperty(value = "ad_video_2_tag is required because ad_video_2_link was provided.")
  @JsonProperty("AD_VIDEO_2_TAG_REQUIRED")
  public Integer getADVIDEO2TAGREQUIRED() {
    return AD_VIDEO_2_TAG_REQUIRED;
  }
  public void setADVIDEO2TAGREQUIRED(Integer AD_VIDEO_2_TAG_REQUIRED) {
    this.AD_VIDEO_2_TAG_REQUIRED = AD_VIDEO_2_TAG_REQUIRED;
  }

  /**
   * Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
   */
  public CatalogsFeedValidationWarnings ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG(Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have additional_image_link URLs that contain too many characters, so those items will not be published.")
  @JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
  public Integer getADDITIONALIMAGELINKLENGTHTOOLONG() {
    return ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }
  public void setADDITIONALIMAGELINKLENGTHTOOLONG(Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
   */
  public CatalogsFeedValidationWarnings ADDITIONAL_IMAGE_LINK_WARNING(Integer ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.")
  @JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING")
  public Integer getADDITIONALIMAGELINKWARNING() {
    return ADDITIONAL_IMAGE_LINK_WARNING;
  }
  public void setADDITIONALIMAGELINKWARNING(Integer ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
  }

  /**
   * Some items have adwords_redirect links that are formatted incorrectly.
   */
  public CatalogsFeedValidationWarnings ADWORDS_FORMAT_WARNING(Integer ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have adwords_redirect links that are formatted incorrectly.")
  @JsonProperty("ADWORDS_FORMAT_WARNING")
  public Integer getADWORDSFORMATWARNING() {
    return ADWORDS_FORMAT_WARNING;
  }
  public void setADWORDSFORMATWARNING(Integer ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
  }

  /**
   * Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
   */
  public CatalogsFeedValidationWarnings ADWORDS_SAME_AS_LINK(Integer ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.")
  @JsonProperty("ADWORDS_SAME_AS_LINK")
  public Integer getADWORDSSAMEASLINK() {
    return ADWORDS_SAME_AS_LINK;
  }
  public void setADWORDSSAMEASLINK(Integer ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
  }

  /**
   * Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   */
  public CatalogsFeedValidationWarnings AGE_GROUP_INVALID(Integer AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
  @JsonProperty("AGE_GROUP_INVALID")
  public Integer getAGEGROUPINVALID() {
    return AGE_GROUP_INVALID;
  }
  public void setAGEGROUPINVALID(Integer AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
  }

  /**
   * Some items include invalid android_deep_link.
   */
  public CatalogsFeedValidationWarnings ANDROID_DEEP_LINK_INVALID(Integer ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include invalid android_deep_link.")
  @JsonProperty("ANDROID_DEEP_LINK_INVALID")
  public Integer getANDROIDDEEPLINKINVALID() {
    return ANDROID_DEEP_LINK_INVALID;
  }
  public void setANDROIDDEEPLINKINVALID(Integer ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
  }

  /**
   * Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
   */
  public CatalogsFeedValidationWarnings AVAILABILITY_DATE_INVALID(Integer AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.")
  @JsonProperty("AVAILABILITY_DATE_INVALID")
  public Integer getAVAILABILITYDATEINVALID() {
    return AVAILABILITY_DATE_INVALID;
  }
  public void setAVAILABILITYDATEINVALID(Integer AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
  }

  /**
   * Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
   */
  public CatalogsFeedValidationWarnings COUNTRY_DOES_NOT_MAP_TO_CURRENCY(Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.")
  @JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
  public Integer getCOUNTRYDOESNOTMAPTOCURRENCY() {
    return COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }
  public void setCOUNTRYDOESNOTMAPTOCURRENCY(Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }

  /**
   * Some items have custom_label values that are too long, those items will be published without that custom label.
   */
  public CatalogsFeedValidationWarnings CUSTOM_LABEL_LENGTH_TOO_LONG(Integer CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have custom_label values that are too long, those items will be published without that custom label.")
  @JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG")
  public Integer getCUSTOMLABELLENGTHTOOLONG() {
    return CUSTOM_LABEL_LENGTH_TOO_LONG;
  }
  public void setCUSTOMLABELLENGTHTOOLONG(Integer CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
  }

  /**
   * The description for some items were truncated because they contain too many characters.
   */
  public CatalogsFeedValidationWarnings DESCRIPTION_LENGTH_TOO_LONG(Integer DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "The description for some items were truncated because they contain too many characters.")
  @JsonProperty("DESCRIPTION_LENGTH_TOO_LONG")
  public Integer getDESCRIPTIONLENGTHTOOLONG() {
    return DESCRIPTION_LENGTH_TOO_LONG;
  }
  public void setDESCRIPTIONLENGTHTOOLONG(Integer DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
  }

  /**
   * Your feed contains duplicate headers.
   */
  public CatalogsFeedValidationWarnings DUPLICATE_HEADERS(Integer DUPLICATE_HEADERS) {
    this.DUPLICATE_HEADERS = DUPLICATE_HEADERS;
    return this;
  }

  
  @ApiModelProperty(value = "Your feed contains duplicate headers.")
  @JsonProperty("DUPLICATE_HEADERS")
  public Integer getDUPLICATEHEADERS() {
    return DUPLICATE_HEADERS;
  }
  public void setDUPLICATEHEADERS(Integer DUPLICATE_HEADERS) {
    this.DUPLICATE_HEADERS = DUPLICATE_HEADERS;
  }

  /**
   * Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
   */
  public CatalogsFeedValidationWarnings EXPIRATION_DATE_INVALID(Integer EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.")
  @JsonProperty("EXPIRATION_DATE_INVALID")
  public Integer getEXPIRATIONDATEINVALID() {
    return EXPIRATION_DATE_INVALID;
  }
  public void setEXPIRATIONDATEINVALID(Integer EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
  }

  /**
   * Ingestion completed early because there are no changes to your feed since the last successful update.
   */
  public CatalogsFeedValidationWarnings FETCH_SAME_SIGNATURE(FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE) {
    this.FETCH_SAME_SIGNATURE = FETCH_SAME_SIGNATURE;
    return this;
  }

  
  @ApiModelProperty(value = "Ingestion completed early because there are no changes to your feed since the last successful update.")
  @JsonProperty("FETCH_SAME_SIGNATURE")
  public FETCHSAMESIGNATUREEnum getFETCHSAMESIGNATURE() {
    return FETCH_SAME_SIGNATURE;
  }
  public void setFETCHSAMESIGNATURE(FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE) {
    this.FETCH_SAME_SIGNATURE = FETCH_SAME_SIGNATURE;
  }

  /**
   * Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   */
  public CatalogsFeedValidationWarnings GENDER_INVALID(Integer GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
  @JsonProperty("GENDER_INVALID")
  public Integer getGENDERINVALID() {
    return GENDER_INVALID;
  }
  public void setGENDERINVALID(Integer GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
  }

  /**
   * Some items include incorrectly formatted GTINs.
   */
  public CatalogsFeedValidationWarnings GTIN_INVALID(Integer GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include incorrectly formatted GTINs.")
  @JsonProperty("GTIN_INVALID")
  public Integer getGTININVALID() {
    return GTIN_INVALID;
  }
  public void setGTININVALID(Integer GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
  }

  /**
   * Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
   */
  public CatalogsFeedValidationWarnings IMAGE_LINK_WARNING(Integer IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have image_link URLs that are formatted incorrectly and will not be published with those items.")
  @JsonProperty("IMAGE_LINK_WARNING")
  public Integer getIMAGELINKWARNING() {
    return IMAGE_LINK_WARNING;
  }
  public void setIMAGELINKWARNING(Integer IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
  }

  /**
   * Some items include inconsistent currencies in price fields.
   */
  public CatalogsFeedValidationWarnings INCONSISTENT_CURRENCY_VALUES(Integer INCONSISTENT_CURRENCY_VALUES) {
    this.INCONSISTENT_CURRENCY_VALUES = INCONSISTENT_CURRENCY_VALUES;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include inconsistent currencies in price fields.")
  @JsonProperty("INCONSISTENT_CURRENCY_VALUES")
  public Integer getINCONSISTENTCURRENCYVALUES() {
    return INCONSISTENT_CURRENCY_VALUES;
  }
  public void setINCONSISTENTCURRENCYVALUES(Integer INCONSISTENT_CURRENCY_VALUES) {
    this.INCONSISTENT_CURRENCY_VALUES = INCONSISTENT_CURRENCY_VALUES;
  }

  /**
   * The product count has increased or decreased significantly compared to the last successful ingestion.
   */
  public CatalogsFeedValidationWarnings INDEXED_PRODUCT_COUNT_LARGE_DELTA(Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA) {
    this.INDEXED_PRODUCT_COUNT_LARGE_DELTA = INDEXED_PRODUCT_COUNT_LARGE_DELTA;
    return this;
  }

  
  @ApiModelProperty(value = "The product count has increased or decreased significantly compared to the last successful ingestion.")
  @JsonProperty("INDEXED_PRODUCT_COUNT_LARGE_DELTA")
  public Integer getINDEXEDPRODUCTCOUNTLARGEDELTA() {
    return INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  }
  public void setINDEXEDPRODUCTCOUNTLARGEDELTA(Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA) {
    this.INDEXED_PRODUCT_COUNT_LARGE_DELTA = INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  }

  /**
   * Some items include invalid ios_deep_link values.
   */
  public CatalogsFeedValidationWarnings IOS_DEEP_LINK_INVALID(Integer IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include invalid ios_deep_link values.")
  @JsonProperty("IOS_DEEP_LINK_INVALID")
  public Integer getIOSDEEPLINKINVALID() {
    return IOS_DEEP_LINK_INVALID;
  }
  public void setIOSDEEPLINKINVALID(Integer IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
  }

  /**
   * Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
   */
  public CatalogsFeedValidationWarnings IS_BUNDLE_INVALID(Integer IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.")
  @JsonProperty("IS_BUNDLE_INVALID")
  public Integer getISBUNDLEINVALID() {
    return IS_BUNDLE_INVALID;
  }
  public void setISBUNDLEINVALID(Integer IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
  }

  /**
   * Some items include additional_image_links that can't be found.
   */
  public CatalogsFeedValidationWarnings ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE(Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include additional_image_links that can't be found.")
  @JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
  public Integer getITEMADDITIONALIMAGEDOWNLOADFAILURE() {
    return ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }
  public void setITEMADDITIONALIMAGEDOWNLOADFAILURE(Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }

  /**
   * Some items have an invalid product link which contains invalid UTM tracking paramaters.
   */
  public CatalogsFeedValidationWarnings LINK_FORMAT_WARNING(Integer LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have an invalid product link which contains invalid UTM tracking paramaters.")
  @JsonProperty("LINK_FORMAT_WARNING")
  public Integer getLINKFORMATWARNING() {
    return LINK_FORMAT_WARNING;
  }
  public void setLINKFORMATWARNING(Integer LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
  }

  /**
   * Some items include min_ad_price values that are formatted incorrectly.
   */
  public CatalogsFeedValidationWarnings MIN_AD_PRICE_INVALID(Integer MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include min_ad_price values that are formatted incorrectly.")
  @JsonProperty("MIN_AD_PRICE_INVALID")
  public Integer getMINADPRICEINVALID() {
    return MIN_AD_PRICE_INVALID;
  }
  public void setMINADPRICEINVALID(Integer MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
  }

  /**
   * Some items include incorrectly formatted MPNs.
   */
  public CatalogsFeedValidationWarnings MPN_INVALID(Integer MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include incorrectly formatted MPNs.")
  @JsonProperty("MPN_INVALID")
  public Integer getMPNINVALID() {
    return MPN_INVALID;
  }
  public void setMPNINVALID(Integer MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
  }

  /**
   * Some items have invalid multipack values.
   */
  public CatalogsFeedValidationWarnings MULTIPACK_INVALID(Integer MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have invalid multipack values.")
  @JsonProperty("MULTIPACK_INVALID")
  public Integer getMULTIPACKINVALID() {
    return MULTIPACK_INVALID;
  }
  public void setMULTIPACKINVALID(Integer MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
  }

  /**
   * Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   */
  public CatalogsFeedValidationWarnings OPTIONAL_CONDITION_INVALID(Integer OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
  @JsonProperty("OPTIONAL_CONDITION_INVALID")
  public Integer getOPTIONALCONDITIONINVALID() {
    return OPTIONAL_CONDITION_INVALID;
  }
  public void setOPTIONALCONDITIONINVALID(Integer OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
  }

  /**
   * Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
   */
  public CatalogsFeedValidationWarnings OPTIONAL_CONDITION_MISSING(Integer OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.")
  @JsonProperty("OPTIONAL_CONDITION_MISSING")
  public Integer getOPTIONALCONDITIONMISSING() {
    return OPTIONAL_CONDITION_MISSING;
  }
  public void setOPTIONALCONDITIONMISSING(Integer OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
  }

  /**
   * Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
   */
  public CatalogsFeedValidationWarnings OPTIONAL_PRODUCT_CATEGORY_INVALID(Integer OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.")
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID")
  public Integer getOPTIONALPRODUCTCATEGORYINVALID() {
    return OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }
  public void setOPTIONALPRODUCTCATEGORYINVALID(Integer OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }

  /**
   * Some items are missing a google_product_category.
   */
  public CatalogsFeedValidationWarnings OPTIONAL_PRODUCT_CATEGORY_MISSING(Integer OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items are missing a google_product_category.")
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING")
  public Integer getOPTIONALPRODUCTCATEGORYMISSING() {
    return OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }
  public void setOPTIONALPRODUCTCATEGORYMISSING(Integer OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }

  /**
   * Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
   */
  public CatalogsFeedValidationWarnings PRODUCT_CATEGORY_DEPTH_WARNING(Integer PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
    return this;
  }

  
  @ApiModelProperty(value = "Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.")
  @JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING")
  public Integer getPRODUCTCATEGORYDEPTHWARNING() {
    return PRODUCT_CATEGORY_DEPTH_WARNING;
  }
  public void setPRODUCTCATEGORYDEPTHWARNING(Integer PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
  }

  /**
   * Some items have product_type values that are too long, those items will be published without that product type.
   */
  public CatalogsFeedValidationWarnings PRODUCT_TYPE_LENGTH_TOO_LONG(Integer PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have product_type values that are too long, those items will be published without that product type.")
  @JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG")
  public Integer getPRODUCTTYPELENGTHTOOLONG() {
    return PRODUCT_TYPE_LENGTH_TOO_LONG;
  }
  public void setPRODUCTTYPELENGTHTOOLONG(Integer PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
  }

  /**
   * Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
   */
  public CatalogsFeedValidationWarnings SALE_DATE_INVALID(Integer SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.")
  @JsonProperty("SALE_DATE_INVALID")
  public Integer getSALEDATEINVALID() {
    return SALE_DATE_INVALID;
  }
  public void setSALEDATEINVALID(Integer SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
  }

  /**
   * Some items have sale price values that are higher than the original price of the item.
   */
  public CatalogsFeedValidationWarnings SALES_PRICE_INVALID(Integer SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have sale price values that are higher than the original price of the item.")
  @JsonProperty("SALES_PRICE_INVALID")
  public Integer getSALESPRICEINVALID() {
    return SALES_PRICE_INVALID;
  }
  public void setSALESPRICEINVALID(Integer SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
  }

  /**
   * Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
   */
  public CatalogsFeedValidationWarnings SALES_PRICE_TOO_HIGH(Integer SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.")
  @JsonProperty("SALES_PRICE_TOO_HIGH")
  public Integer getSALESPRICETOOHIGH() {
    return SALES_PRICE_TOO_HIGH;
  }
  public void setSALESPRICETOOHIGH(Integer SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
  }

  /**
   * Some items include sales price that is much lower than the list price.
   */
  public CatalogsFeedValidationWarnings SALES_PRICE_TOO_LOW(Integer SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include sales price that is much lower than the list price.")
  @JsonProperty("SALES_PRICE_TOO_LOW")
  public Integer getSALESPRICETOOLOW() {
    return SALES_PRICE_TOO_LOW;
  }
  public void setSALESPRICETOOLOW(Integer SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
  }

  /**
   * Some items include incorrectly formatted shipping_height.
   */
  public CatalogsFeedValidationWarnings SHIPPING_HEIGHT_INVALID(Integer SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include incorrectly formatted shipping_height.")
  @JsonProperty("SHIPPING_HEIGHT_INVALID")
  public Integer getSHIPPINGHEIGHTINVALID() {
    return SHIPPING_HEIGHT_INVALID;
  }
  public void setSHIPPINGHEIGHTINVALID(Integer SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
  }

  /**
   * Some items have shipping values that are formatted incorrectly.
   */
  public CatalogsFeedValidationWarnings SHIPPING_INVALID(Integer SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have shipping values that are formatted incorrectly.")
  @JsonProperty("SHIPPING_INVALID")
  public Integer getSHIPPINGINVALID() {
    return SHIPPING_INVALID;
  }
  public void setSHIPPINGINVALID(Integer SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
  }

  /**
   * Some items have invalid shipping_weight values.
   */
  public CatalogsFeedValidationWarnings SHIPPING_WEIGHT_INVALID(Integer SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have invalid shipping_weight values.")
  @JsonProperty("SHIPPING_WEIGHT_INVALID")
  public Integer getSHIPPINGWEIGHTINVALID() {
    return SHIPPING_WEIGHT_INVALID;
  }
  public void setSHIPPINGWEIGHTINVALID(Integer SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
  }

  /**
   * Some items include incorrectly formatted shipping_width.
   */
  public CatalogsFeedValidationWarnings SHIPPING_WIDTH_INVALID(Integer SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include incorrectly formatted shipping_width.")
  @JsonProperty("SHIPPING_WIDTH_INVALID")
  public Integer getSHIPPINGWIDTHINVALID() {
    return SHIPPING_WIDTH_INVALID;
  }
  public void setSHIPPINGWIDTHINVALID(Integer SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
  }

  /**
   * Some items have size system values which are not one of the supported size systems.
   */
  public CatalogsFeedValidationWarnings SIZE_SYSTEM_INVALID(Integer SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have size system values which are not one of the supported size systems.")
  @JsonProperty("SIZE_SYSTEM_INVALID")
  public Integer getSIZESYSTEMINVALID() {
    return SIZE_SYSTEM_INVALID;
  }
  public void setSIZESYSTEMINVALID(Integer SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
  }

  /**
   * Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   */
  public CatalogsFeedValidationWarnings SIZE_TYPE_INVALID(Integer SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
  @JsonProperty("SIZE_TYPE_INVALID")
  public Integer getSIZETYPEINVALID() {
    return SIZE_TYPE_INVALID;
  }
  public void setSIZETYPEINVALID(Integer SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
  }

  /**
   * Some items have tax values that are formatted incorrectly.
   */
  public CatalogsFeedValidationWarnings TAX_INVALID(Integer TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have tax values that are formatted incorrectly.")
  @JsonProperty("TAX_INVALID")
  public Integer getTAXINVALID() {
    return TAX_INVALID;
  }
  public void setTAXINVALID(Integer TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
  }

  /**
   * The title for some items were truncated because they contain too many characters.
   */
  public CatalogsFeedValidationWarnings TITLE_LENGTH_TOO_LONG(Integer TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "The title for some items were truncated because they contain too many characters.")
  @JsonProperty("TITLE_LENGTH_TOO_LONG")
  public Integer getTITLELENGTHTOOLONG() {
    return TITLE_LENGTH_TOO_LONG;
  }
  public void setTITLELENGTHTOOLONG(Integer TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
  }

  /**
   * Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
   */
  public CatalogsFeedValidationWarnings TOO_MANY_ADDITIONAL_IMAGE_LINKS(Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.")
  @JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS")
  public Integer getTOOMANYADDITIONALIMAGELINKS() {
    return TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }
  public void setTOOMANYADDITIONALIMAGELINKS(Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }

  /**
   * Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
   */
  public CatalogsFeedValidationWarnings UPDATED_TIME_INVALID(Integer UPDATED_TIME_INVALID) {
    this.UPDATED_TIME_INVALID = UPDATED_TIME_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.")
  @JsonProperty("UPDATED_TIME_INVALID")
  public Integer getUPDATEDTIMEINVALID() {
    return UPDATED_TIME_INVALID;
  }
  public void setUPDATEDTIMEINVALID(Integer UPDATED_TIME_INVALID) {
    this.UPDATED_TIME_INVALID = UPDATED_TIME_INVALID;
  }

  /**
   * Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
   */
  public CatalogsFeedValidationWarnings UTM_SOURCE_AUTO_CORRECTED(Integer UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
    return this;
  }

  
  @ApiModelProperty(value = "Some items include utm_source values that are formatted incorrectly and have been automatically corrected.")
  @JsonProperty("UTM_SOURCE_AUTO_CORRECTED")
  public Integer getUTMSOURCEAUTOCORRECTED() {
    return UTM_SOURCE_AUTO_CORRECTED;
  }
  public void setUTMSOURCEAUTOCORRECTED(Integer UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
  }

  /**
   * A video is required in the item when ad_video fields are provided.
   */
  public CatalogsFeedValidationWarnings VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED(Integer VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) {
    this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED = VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
    return this;
  }

  
  @ApiModelProperty(value = "A video is required in the item when ad_video fields are provided.")
  @JsonProperty("VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED")
  public Integer getVIDEOREQUIREDWHENADVIDEOPROVIDED() {
    return VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
  }
  public void setVIDEOREQUIREDWHENADVIDEOPROVIDED(Integer VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) {
    this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED = VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
  }

  /**
   * Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
   */
  public CatalogsFeedValidationWarnings WEIGHT_UNIT_INVALID(Integer WEIGHT_UNIT_INVALID) {
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.")
  @JsonProperty("WEIGHT_UNIT_INVALID")
  public Integer getWEIGHTUNITINVALID() {
    return WEIGHT_UNIT_INVALID;
  }
  public void setWEIGHTUNITINVALID(Integer WEIGHT_UNIT_INVALID) {
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationWarnings catalogsFeedValidationWarnings = (CatalogsFeedValidationWarnings) o;
    return Objects.equals(AD_IMAGE_0_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_0_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_0_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_0_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_0_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_0_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_0_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_0_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_0_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_0_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_10_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_10_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_10_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_10_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_10_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_10_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_10_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_10_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_10_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_10_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_11_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_11_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_11_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_11_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_11_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_11_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_11_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_11_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_11_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_11_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_12_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_12_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_12_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_12_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_12_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_12_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_12_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_12_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_12_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_12_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_13_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_13_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_13_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_13_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_13_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_13_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_13_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_13_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_13_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_13_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_14_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_14_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_14_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_14_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_14_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_14_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_14_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_14_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_14_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_14_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_15_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_15_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_15_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_15_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_15_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_15_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_15_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_15_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_15_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_15_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_16_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_16_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_16_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_16_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_16_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_16_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_16_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_16_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_16_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_16_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_17_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_17_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_17_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_17_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_17_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_17_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_17_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_17_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_17_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_17_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_18_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_18_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_18_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_18_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_18_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_18_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_18_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_18_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_18_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_18_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_19_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_19_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_19_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_19_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_19_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_19_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_19_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_19_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_19_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_19_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_1_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_1_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_1_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_1_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_1_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_1_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_1_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_1_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_1_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_1_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_2_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_2_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_2_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_2_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_2_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_2_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_2_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_2_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_2_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_2_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_3_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_3_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_3_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_3_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_3_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_3_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_3_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_3_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_3_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_3_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_4_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_4_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_4_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_4_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_4_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_4_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_4_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_4_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_4_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_4_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_5_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_5_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_5_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_5_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_5_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_5_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_5_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_5_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_5_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_5_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_6_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_6_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_6_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_6_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_6_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_6_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_6_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_6_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_6_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_6_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_7_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_7_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_7_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_7_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_7_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_7_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_7_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_7_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_7_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_7_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_8_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_8_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_8_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_8_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_8_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_8_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_8_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_8_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_8_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_8_TAG_REQUIRED) &&
        Objects.equals(AD_IMAGE_9_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_DUPLICATED) &&
        Objects.equals(AD_IMAGE_9_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_9_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_REQUIRED) &&
        Objects.equals(AD_IMAGE_9_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_WARNING) &&
        Objects.equals(AD_IMAGE_9_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_9_TAG_DUPLICATED) &&
        Objects.equals(AD_IMAGE_9_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_9_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_IMAGE_9_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_9_TAG_REQUIRED) &&
        Objects.equals(AD_LINK_FORMAT_WARNING, catalogsFeedValidationWarnings.AD_LINK_FORMAT_WARNING) &&
        Objects.equals(AD_LINK_SAME_AS_LINK, catalogsFeedValidationWarnings.AD_LINK_SAME_AS_LINK) &&
        Objects.equals(AD_VIDEO_0_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_DUPLICATED) &&
        Objects.equals(AD_VIDEO_0_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_VIDEO_0_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_REQUIRED) &&
        Objects.equals(AD_VIDEO_0_LINK_WARNING, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_WARNING) &&
        Objects.equals(AD_VIDEO_0_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_0_TAG_DUPLICATED) &&
        Objects.equals(AD_VIDEO_0_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_0_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_VIDEO_0_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_0_TAG_REQUIRED) &&
        Objects.equals(AD_VIDEO_1_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_DUPLICATED) &&
        Objects.equals(AD_VIDEO_1_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_VIDEO_1_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_REQUIRED) &&
        Objects.equals(AD_VIDEO_1_LINK_WARNING, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_WARNING) &&
        Objects.equals(AD_VIDEO_1_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_1_TAG_DUPLICATED) &&
        Objects.equals(AD_VIDEO_1_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_1_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_VIDEO_1_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_1_TAG_REQUIRED) &&
        Objects.equals(AD_VIDEO_2_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_DUPLICATED) &&
        Objects.equals(AD_VIDEO_2_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(AD_VIDEO_2_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_REQUIRED) &&
        Objects.equals(AD_VIDEO_2_LINK_WARNING, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_WARNING) &&
        Objects.equals(AD_VIDEO_2_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_2_TAG_DUPLICATED) &&
        Objects.equals(AD_VIDEO_2_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_2_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(AD_VIDEO_2_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_2_TAG_REQUIRED) &&
        Objects.equals(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(ADDITIONAL_IMAGE_LINK_WARNING, catalogsFeedValidationWarnings.ADDITIONAL_IMAGE_LINK_WARNING) &&
        Objects.equals(ADWORDS_FORMAT_WARNING, catalogsFeedValidationWarnings.ADWORDS_FORMAT_WARNING) &&
        Objects.equals(ADWORDS_SAME_AS_LINK, catalogsFeedValidationWarnings.ADWORDS_SAME_AS_LINK) &&
        Objects.equals(AGE_GROUP_INVALID, catalogsFeedValidationWarnings.AGE_GROUP_INVALID) &&
        Objects.equals(ANDROID_DEEP_LINK_INVALID, catalogsFeedValidationWarnings.ANDROID_DEEP_LINK_INVALID) &&
        Objects.equals(AVAILABILITY_DATE_INVALID, catalogsFeedValidationWarnings.AVAILABILITY_DATE_INVALID) &&
        Objects.equals(COUNTRY_DOES_NOT_MAP_TO_CURRENCY, catalogsFeedValidationWarnings.COUNTRY_DOES_NOT_MAP_TO_CURRENCY) &&
        Objects.equals(CUSTOM_LABEL_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.CUSTOM_LABEL_LENGTH_TOO_LONG) &&
        Objects.equals(DESCRIPTION_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.DESCRIPTION_LENGTH_TOO_LONG) &&
        Objects.equals(DUPLICATE_HEADERS, catalogsFeedValidationWarnings.DUPLICATE_HEADERS) &&
        Objects.equals(EXPIRATION_DATE_INVALID, catalogsFeedValidationWarnings.EXPIRATION_DATE_INVALID) &&
        Objects.equals(FETCH_SAME_SIGNATURE, catalogsFeedValidationWarnings.FETCH_SAME_SIGNATURE) &&
        Objects.equals(GENDER_INVALID, catalogsFeedValidationWarnings.GENDER_INVALID) &&
        Objects.equals(GTIN_INVALID, catalogsFeedValidationWarnings.GTIN_INVALID) &&
        Objects.equals(IMAGE_LINK_WARNING, catalogsFeedValidationWarnings.IMAGE_LINK_WARNING) &&
        Objects.equals(INCONSISTENT_CURRENCY_VALUES, catalogsFeedValidationWarnings.INCONSISTENT_CURRENCY_VALUES) &&
        Objects.equals(INDEXED_PRODUCT_COUNT_LARGE_DELTA, catalogsFeedValidationWarnings.INDEXED_PRODUCT_COUNT_LARGE_DELTA) &&
        Objects.equals(IOS_DEEP_LINK_INVALID, catalogsFeedValidationWarnings.IOS_DEEP_LINK_INVALID) &&
        Objects.equals(IS_BUNDLE_INVALID, catalogsFeedValidationWarnings.IS_BUNDLE_INVALID) &&
        Objects.equals(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, catalogsFeedValidationWarnings.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(LINK_FORMAT_WARNING, catalogsFeedValidationWarnings.LINK_FORMAT_WARNING) &&
        Objects.equals(MIN_AD_PRICE_INVALID, catalogsFeedValidationWarnings.MIN_AD_PRICE_INVALID) &&
        Objects.equals(MPN_INVALID, catalogsFeedValidationWarnings.MPN_INVALID) &&
        Objects.equals(MULTIPACK_INVALID, catalogsFeedValidationWarnings.MULTIPACK_INVALID) &&
        Objects.equals(OPTIONAL_CONDITION_INVALID, catalogsFeedValidationWarnings.OPTIONAL_CONDITION_INVALID) &&
        Objects.equals(OPTIONAL_CONDITION_MISSING, catalogsFeedValidationWarnings.OPTIONAL_CONDITION_MISSING) &&
        Objects.equals(OPTIONAL_PRODUCT_CATEGORY_INVALID, catalogsFeedValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_INVALID) &&
        Objects.equals(OPTIONAL_PRODUCT_CATEGORY_MISSING, catalogsFeedValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_MISSING) &&
        Objects.equals(PRODUCT_CATEGORY_DEPTH_WARNING, catalogsFeedValidationWarnings.PRODUCT_CATEGORY_DEPTH_WARNING) &&
        Objects.equals(PRODUCT_TYPE_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.PRODUCT_TYPE_LENGTH_TOO_LONG) &&
        Objects.equals(SALE_DATE_INVALID, catalogsFeedValidationWarnings.SALE_DATE_INVALID) &&
        Objects.equals(SALES_PRICE_INVALID, catalogsFeedValidationWarnings.SALES_PRICE_INVALID) &&
        Objects.equals(SALES_PRICE_TOO_HIGH, catalogsFeedValidationWarnings.SALES_PRICE_TOO_HIGH) &&
        Objects.equals(SALES_PRICE_TOO_LOW, catalogsFeedValidationWarnings.SALES_PRICE_TOO_LOW) &&
        Objects.equals(SHIPPING_HEIGHT_INVALID, catalogsFeedValidationWarnings.SHIPPING_HEIGHT_INVALID) &&
        Objects.equals(SHIPPING_INVALID, catalogsFeedValidationWarnings.SHIPPING_INVALID) &&
        Objects.equals(SHIPPING_WEIGHT_INVALID, catalogsFeedValidationWarnings.SHIPPING_WEIGHT_INVALID) &&
        Objects.equals(SHIPPING_WIDTH_INVALID, catalogsFeedValidationWarnings.SHIPPING_WIDTH_INVALID) &&
        Objects.equals(SIZE_SYSTEM_INVALID, catalogsFeedValidationWarnings.SIZE_SYSTEM_INVALID) &&
        Objects.equals(SIZE_TYPE_INVALID, catalogsFeedValidationWarnings.SIZE_TYPE_INVALID) &&
        Objects.equals(TAX_INVALID, catalogsFeedValidationWarnings.TAX_INVALID) &&
        Objects.equals(TITLE_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.TITLE_LENGTH_TOO_LONG) &&
        Objects.equals(TOO_MANY_ADDITIONAL_IMAGE_LINKS, catalogsFeedValidationWarnings.TOO_MANY_ADDITIONAL_IMAGE_LINKS) &&
        Objects.equals(UPDATED_TIME_INVALID, catalogsFeedValidationWarnings.UPDATED_TIME_INVALID) &&
        Objects.equals(UTM_SOURCE_AUTO_CORRECTED, catalogsFeedValidationWarnings.UTM_SOURCE_AUTO_CORRECTED) &&
        Objects.equals(VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, catalogsFeedValidationWarnings.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) &&
        Objects.equals(WEIGHT_UNIT_INVALID, catalogsFeedValidationWarnings.WEIGHT_UNIT_INVALID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_IMAGE_0_LINK_DUPLICATED, AD_IMAGE_0_LINK_LENGTH_TOO_LONG, AD_IMAGE_0_LINK_REQUIRED, AD_IMAGE_0_LINK_WARNING, AD_IMAGE_0_TAG_DUPLICATED, AD_IMAGE_0_TAG_LENGTH_TOO_LONG, AD_IMAGE_0_TAG_REQUIRED, AD_IMAGE_10_LINK_DUPLICATED, AD_IMAGE_10_LINK_LENGTH_TOO_LONG, AD_IMAGE_10_LINK_REQUIRED, AD_IMAGE_10_LINK_WARNING, AD_IMAGE_10_TAG_DUPLICATED, AD_IMAGE_10_TAG_LENGTH_TOO_LONG, AD_IMAGE_10_TAG_REQUIRED, AD_IMAGE_11_LINK_DUPLICATED, AD_IMAGE_11_LINK_LENGTH_TOO_LONG, AD_IMAGE_11_LINK_REQUIRED, AD_IMAGE_11_LINK_WARNING, AD_IMAGE_11_TAG_DUPLICATED, AD_IMAGE_11_TAG_LENGTH_TOO_LONG, AD_IMAGE_11_TAG_REQUIRED, AD_IMAGE_12_LINK_DUPLICATED, AD_IMAGE_12_LINK_LENGTH_TOO_LONG, AD_IMAGE_12_LINK_REQUIRED, AD_IMAGE_12_LINK_WARNING, AD_IMAGE_12_TAG_DUPLICATED, AD_IMAGE_12_TAG_LENGTH_TOO_LONG, AD_IMAGE_12_TAG_REQUIRED, AD_IMAGE_13_LINK_DUPLICATED, AD_IMAGE_13_LINK_LENGTH_TOO_LONG, AD_IMAGE_13_LINK_REQUIRED, AD_IMAGE_13_LINK_WARNING, AD_IMAGE_13_TAG_DUPLICATED, AD_IMAGE_13_TAG_LENGTH_TOO_LONG, AD_IMAGE_13_TAG_REQUIRED, AD_IMAGE_14_LINK_DUPLICATED, AD_IMAGE_14_LINK_LENGTH_TOO_LONG, AD_IMAGE_14_LINK_REQUIRED, AD_IMAGE_14_LINK_WARNING, AD_IMAGE_14_TAG_DUPLICATED, AD_IMAGE_14_TAG_LENGTH_TOO_LONG, AD_IMAGE_14_TAG_REQUIRED, AD_IMAGE_15_LINK_DUPLICATED, AD_IMAGE_15_LINK_LENGTH_TOO_LONG, AD_IMAGE_15_LINK_REQUIRED, AD_IMAGE_15_LINK_WARNING, AD_IMAGE_15_TAG_DUPLICATED, AD_IMAGE_15_TAG_LENGTH_TOO_LONG, AD_IMAGE_15_TAG_REQUIRED, AD_IMAGE_16_LINK_DUPLICATED, AD_IMAGE_16_LINK_LENGTH_TOO_LONG, AD_IMAGE_16_LINK_REQUIRED, AD_IMAGE_16_LINK_WARNING, AD_IMAGE_16_TAG_DUPLICATED, AD_IMAGE_16_TAG_LENGTH_TOO_LONG, AD_IMAGE_16_TAG_REQUIRED, AD_IMAGE_17_LINK_DUPLICATED, AD_IMAGE_17_LINK_LENGTH_TOO_LONG, AD_IMAGE_17_LINK_REQUIRED, AD_IMAGE_17_LINK_WARNING, AD_IMAGE_17_TAG_DUPLICATED, AD_IMAGE_17_TAG_LENGTH_TOO_LONG, AD_IMAGE_17_TAG_REQUIRED, AD_IMAGE_18_LINK_DUPLICATED, AD_IMAGE_18_LINK_LENGTH_TOO_LONG, AD_IMAGE_18_LINK_REQUIRED, AD_IMAGE_18_LINK_WARNING, AD_IMAGE_18_TAG_DUPLICATED, AD_IMAGE_18_TAG_LENGTH_TOO_LONG, AD_IMAGE_18_TAG_REQUIRED, AD_IMAGE_19_LINK_DUPLICATED, AD_IMAGE_19_LINK_LENGTH_TOO_LONG, AD_IMAGE_19_LINK_REQUIRED, AD_IMAGE_19_LINK_WARNING, AD_IMAGE_19_TAG_DUPLICATED, AD_IMAGE_19_TAG_LENGTH_TOO_LONG, AD_IMAGE_19_TAG_REQUIRED, AD_IMAGE_1_LINK_DUPLICATED, AD_IMAGE_1_LINK_LENGTH_TOO_LONG, AD_IMAGE_1_LINK_REQUIRED, AD_IMAGE_1_LINK_WARNING, AD_IMAGE_1_TAG_DUPLICATED, AD_IMAGE_1_TAG_LENGTH_TOO_LONG, AD_IMAGE_1_TAG_REQUIRED, AD_IMAGE_2_LINK_DUPLICATED, AD_IMAGE_2_LINK_LENGTH_TOO_LONG, AD_IMAGE_2_LINK_REQUIRED, AD_IMAGE_2_LINK_WARNING, AD_IMAGE_2_TAG_DUPLICATED, AD_IMAGE_2_TAG_LENGTH_TOO_LONG, AD_IMAGE_2_TAG_REQUIRED, AD_IMAGE_3_LINK_DUPLICATED, AD_IMAGE_3_LINK_LENGTH_TOO_LONG, AD_IMAGE_3_LINK_REQUIRED, AD_IMAGE_3_LINK_WARNING, AD_IMAGE_3_TAG_DUPLICATED, AD_IMAGE_3_TAG_LENGTH_TOO_LONG, AD_IMAGE_3_TAG_REQUIRED, AD_IMAGE_4_LINK_DUPLICATED, AD_IMAGE_4_LINK_LENGTH_TOO_LONG, AD_IMAGE_4_LINK_REQUIRED, AD_IMAGE_4_LINK_WARNING, AD_IMAGE_4_TAG_DUPLICATED, AD_IMAGE_4_TAG_LENGTH_TOO_LONG, AD_IMAGE_4_TAG_REQUIRED, AD_IMAGE_5_LINK_DUPLICATED, AD_IMAGE_5_LINK_LENGTH_TOO_LONG, AD_IMAGE_5_LINK_REQUIRED, AD_IMAGE_5_LINK_WARNING, AD_IMAGE_5_TAG_DUPLICATED, AD_IMAGE_5_TAG_LENGTH_TOO_LONG, AD_IMAGE_5_TAG_REQUIRED, AD_IMAGE_6_LINK_DUPLICATED, AD_IMAGE_6_LINK_LENGTH_TOO_LONG, AD_IMAGE_6_LINK_REQUIRED, AD_IMAGE_6_LINK_WARNING, AD_IMAGE_6_TAG_DUPLICATED, AD_IMAGE_6_TAG_LENGTH_TOO_LONG, AD_IMAGE_6_TAG_REQUIRED, AD_IMAGE_7_LINK_DUPLICATED, AD_IMAGE_7_LINK_LENGTH_TOO_LONG, AD_IMAGE_7_LINK_REQUIRED, AD_IMAGE_7_LINK_WARNING, AD_IMAGE_7_TAG_DUPLICATED, AD_IMAGE_7_TAG_LENGTH_TOO_LONG, AD_IMAGE_7_TAG_REQUIRED, AD_IMAGE_8_LINK_DUPLICATED, AD_IMAGE_8_LINK_LENGTH_TOO_LONG, AD_IMAGE_8_LINK_REQUIRED, AD_IMAGE_8_LINK_WARNING, AD_IMAGE_8_TAG_DUPLICATED, AD_IMAGE_8_TAG_LENGTH_TOO_LONG, AD_IMAGE_8_TAG_REQUIRED, AD_IMAGE_9_LINK_DUPLICATED, AD_IMAGE_9_LINK_LENGTH_TOO_LONG, AD_IMAGE_9_LINK_REQUIRED, AD_IMAGE_9_LINK_WARNING, AD_IMAGE_9_TAG_DUPLICATED, AD_IMAGE_9_TAG_LENGTH_TOO_LONG, AD_IMAGE_9_TAG_REQUIRED, AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, AD_VIDEO_0_LINK_DUPLICATED, AD_VIDEO_0_LINK_LENGTH_TOO_LONG, AD_VIDEO_0_LINK_REQUIRED, AD_VIDEO_0_LINK_WARNING, AD_VIDEO_0_TAG_DUPLICATED, AD_VIDEO_0_TAG_LENGTH_TOO_LONG, AD_VIDEO_0_TAG_REQUIRED, AD_VIDEO_1_LINK_DUPLICATED, AD_VIDEO_1_LINK_LENGTH_TOO_LONG, AD_VIDEO_1_LINK_REQUIRED, AD_VIDEO_1_LINK_WARNING, AD_VIDEO_1_TAG_DUPLICATED, AD_VIDEO_1_TAG_LENGTH_TOO_LONG, AD_VIDEO_1_TAG_REQUIRED, AD_VIDEO_2_LINK_DUPLICATED, AD_VIDEO_2_LINK_LENGTH_TOO_LONG, AD_VIDEO_2_LINK_REQUIRED, AD_VIDEO_2_LINK_WARNING, AD_VIDEO_2_TAG_DUPLICATED, AD_VIDEO_2_TAG_LENGTH_TOO_LONG, AD_VIDEO_2_TAG_REQUIRED, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DUPLICATE_HEADERS, EXPIRATION_DATE_INVALID, FETCH_SAME_SIGNATURE, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_WARNING, INCONSISTENT_CURRENCY_VALUES, INDEXED_PRODUCT_COUNT_LARGE_DELTA, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, LINK_FORMAT_WARNING, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_HEIGHT_INVALID, SHIPPING_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UPDATED_TIME_INVALID, UTM_SOURCE_AUTO_CORRECTED, VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, WEIGHT_UNIT_INVALID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationWarnings {\n");
    
    sb.append("    AD_IMAGE_0_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_0_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_0_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_0_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_0_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_0_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_0_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_0_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_0_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_0_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_0_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_0_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_0_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_0_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_10_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_10_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_10_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_10_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_10_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_10_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_10_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_10_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_10_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_10_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_11_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_11_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_11_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_11_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_11_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_11_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_11_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_11_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_11_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_11_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_12_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_12_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_12_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_12_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_12_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_12_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_12_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_12_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_12_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_12_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_13_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_13_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_13_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_13_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_13_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_13_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_13_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_13_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_13_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_13_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_14_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_14_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_14_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_14_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_14_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_14_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_14_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_14_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_14_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_14_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_15_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_15_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_15_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_15_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_15_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_15_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_15_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_15_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_15_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_15_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_16_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_16_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_16_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_16_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_16_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_16_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_16_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_16_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_16_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_16_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_17_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_17_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_17_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_17_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_17_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_17_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_17_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_17_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_17_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_17_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_18_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_18_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_18_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_18_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_18_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_18_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_18_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_18_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_18_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_18_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_19_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_19_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_19_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_19_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_19_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_19_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_19_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_19_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_19_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_19_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_1_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_1_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_1_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_1_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_1_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_1_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_1_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_1_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_1_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_1_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_2_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_2_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_2_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_2_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_2_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_2_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_2_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_2_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_2_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_2_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_3_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_3_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_3_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_3_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_3_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_3_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_3_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_3_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_3_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_3_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_4_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_4_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_4_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_4_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_4_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_4_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_4_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_4_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_4_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_4_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_5_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_5_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_5_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_5_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_5_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_5_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_5_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_5_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_5_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_5_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_6_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_6_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_6_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_6_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_6_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_6_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_6_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_6_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_6_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_6_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_7_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_7_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_7_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_7_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_7_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_7_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_7_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_7_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_7_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_7_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_8_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_8_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_8_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_8_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_8_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_8_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_8_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_8_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_8_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_8_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_9_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_9_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_9_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_9_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_9_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_9_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_9_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_9_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_9_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_9_TAG_REQUIRED)).append("\n");
    sb.append("    AD_LINK_FORMAT_WARNING: ").append(toIndentedString(AD_LINK_FORMAT_WARNING)).append("\n");
    sb.append("    AD_LINK_SAME_AS_LINK: ").append(toIndentedString(AD_LINK_SAME_AS_LINK)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_DUPLICATED: ").append(toIndentedString(AD_VIDEO_0_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_0_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_REQUIRED: ").append(toIndentedString(AD_VIDEO_0_LINK_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_WARNING: ").append(toIndentedString(AD_VIDEO_0_LINK_WARNING)).append("\n");
    sb.append("    AD_VIDEO_0_TAG_DUPLICATED: ").append(toIndentedString(AD_VIDEO_0_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_0_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_0_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_0_TAG_REQUIRED: ").append(toIndentedString(AD_VIDEO_0_TAG_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_DUPLICATED: ").append(toIndentedString(AD_VIDEO_1_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_1_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_REQUIRED: ").append(toIndentedString(AD_VIDEO_1_LINK_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_WARNING: ").append(toIndentedString(AD_VIDEO_1_LINK_WARNING)).append("\n");
    sb.append("    AD_VIDEO_1_TAG_DUPLICATED: ").append(toIndentedString(AD_VIDEO_1_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_1_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_1_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_1_TAG_REQUIRED: ").append(toIndentedString(AD_VIDEO_1_TAG_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_DUPLICATED: ").append(toIndentedString(AD_VIDEO_2_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_2_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_REQUIRED: ").append(toIndentedString(AD_VIDEO_2_LINK_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_WARNING: ").append(toIndentedString(AD_VIDEO_2_LINK_WARNING)).append("\n");
    sb.append("    AD_VIDEO_2_TAG_DUPLICATED: ").append(toIndentedString(AD_VIDEO_2_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_2_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_2_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_2_TAG_REQUIRED: ").append(toIndentedString(AD_VIDEO_2_TAG_REQUIRED)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_WARNING: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_WARNING)).append("\n");
    sb.append("    ADWORDS_FORMAT_WARNING: ").append(toIndentedString(ADWORDS_FORMAT_WARNING)).append("\n");
    sb.append("    ADWORDS_SAME_AS_LINK: ").append(toIndentedString(ADWORDS_SAME_AS_LINK)).append("\n");
    sb.append("    AGE_GROUP_INVALID: ").append(toIndentedString(AGE_GROUP_INVALID)).append("\n");
    sb.append("    ANDROID_DEEP_LINK_INVALID: ").append(toIndentedString(ANDROID_DEEP_LINK_INVALID)).append("\n");
    sb.append("    AVAILABILITY_DATE_INVALID: ").append(toIndentedString(AVAILABILITY_DATE_INVALID)).append("\n");
    sb.append("    COUNTRY_DOES_NOT_MAP_TO_CURRENCY: ").append(toIndentedString(COUNTRY_DOES_NOT_MAP_TO_CURRENCY)).append("\n");
    sb.append("    CUSTOM_LABEL_LENGTH_TOO_LONG: ").append(toIndentedString(CUSTOM_LABEL_LENGTH_TOO_LONG)).append("\n");
    sb.append("    DESCRIPTION_LENGTH_TOO_LONG: ").append(toIndentedString(DESCRIPTION_LENGTH_TOO_LONG)).append("\n");
    sb.append("    DUPLICATE_HEADERS: ").append(toIndentedString(DUPLICATE_HEADERS)).append("\n");
    sb.append("    EXPIRATION_DATE_INVALID: ").append(toIndentedString(EXPIRATION_DATE_INVALID)).append("\n");
    sb.append("    FETCH_SAME_SIGNATURE: ").append(toIndentedString(FETCH_SAME_SIGNATURE)).append("\n");
    sb.append("    GENDER_INVALID: ").append(toIndentedString(GENDER_INVALID)).append("\n");
    sb.append("    GTIN_INVALID: ").append(toIndentedString(GTIN_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_WARNING: ").append(toIndentedString(IMAGE_LINK_WARNING)).append("\n");
    sb.append("    INCONSISTENT_CURRENCY_VALUES: ").append(toIndentedString(INCONSISTENT_CURRENCY_VALUES)).append("\n");
    sb.append("    INDEXED_PRODUCT_COUNT_LARGE_DELTA: ").append(toIndentedString(INDEXED_PRODUCT_COUNT_LARGE_DELTA)).append("\n");
    sb.append("    IOS_DEEP_LINK_INVALID: ").append(toIndentedString(IOS_DEEP_LINK_INVALID)).append("\n");
    sb.append("    IS_BUNDLE_INVALID: ").append(toIndentedString(IS_BUNDLE_INVALID)).append("\n");
    sb.append("    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    LINK_FORMAT_WARNING: ").append(toIndentedString(LINK_FORMAT_WARNING)).append("\n");
    sb.append("    MIN_AD_PRICE_INVALID: ").append(toIndentedString(MIN_AD_PRICE_INVALID)).append("\n");
    sb.append("    MPN_INVALID: ").append(toIndentedString(MPN_INVALID)).append("\n");
    sb.append("    MULTIPACK_INVALID: ").append(toIndentedString(MULTIPACK_INVALID)).append("\n");
    sb.append("    OPTIONAL_CONDITION_INVALID: ").append(toIndentedString(OPTIONAL_CONDITION_INVALID)).append("\n");
    sb.append("    OPTIONAL_CONDITION_MISSING: ").append(toIndentedString(OPTIONAL_CONDITION_MISSING)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_INVALID: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_INVALID)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_MISSING: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_MISSING)).append("\n");
    sb.append("    PRODUCT_CATEGORY_DEPTH_WARNING: ").append(toIndentedString(PRODUCT_CATEGORY_DEPTH_WARNING)).append("\n");
    sb.append("    PRODUCT_TYPE_LENGTH_TOO_LONG: ").append(toIndentedString(PRODUCT_TYPE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    SALE_DATE_INVALID: ").append(toIndentedString(SALE_DATE_INVALID)).append("\n");
    sb.append("    SALES_PRICE_INVALID: ").append(toIndentedString(SALES_PRICE_INVALID)).append("\n");
    sb.append("    SALES_PRICE_TOO_HIGH: ").append(toIndentedString(SALES_PRICE_TOO_HIGH)).append("\n");
    sb.append("    SALES_PRICE_TOO_LOW: ").append(toIndentedString(SALES_PRICE_TOO_LOW)).append("\n");
    sb.append("    SHIPPING_HEIGHT_INVALID: ").append(toIndentedString(SHIPPING_HEIGHT_INVALID)).append("\n");
    sb.append("    SHIPPING_INVALID: ").append(toIndentedString(SHIPPING_INVALID)).append("\n");
    sb.append("    SHIPPING_WEIGHT_INVALID: ").append(toIndentedString(SHIPPING_WEIGHT_INVALID)).append("\n");
    sb.append("    SHIPPING_WIDTH_INVALID: ").append(toIndentedString(SHIPPING_WIDTH_INVALID)).append("\n");
    sb.append("    SIZE_SYSTEM_INVALID: ").append(toIndentedString(SIZE_SYSTEM_INVALID)).append("\n");
    sb.append("    SIZE_TYPE_INVALID: ").append(toIndentedString(SIZE_TYPE_INVALID)).append("\n");
    sb.append("    TAX_INVALID: ").append(toIndentedString(TAX_INVALID)).append("\n");
    sb.append("    TITLE_LENGTH_TOO_LONG: ").append(toIndentedString(TITLE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    TOO_MANY_ADDITIONAL_IMAGE_LINKS: ").append(toIndentedString(TOO_MANY_ADDITIONAL_IMAGE_LINKS)).append("\n");
    sb.append("    UPDATED_TIME_INVALID: ").append(toIndentedString(UPDATED_TIME_INVALID)).append("\n");
    sb.append("    UTM_SOURCE_AUTO_CORRECTED: ").append(toIndentedString(UTM_SOURCE_AUTO_CORRECTED)).append("\n");
    sb.append("    VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED: ").append(toIndentedString(VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED)).append("\n");
    sb.append("    WEIGHT_UNIT_INVALID: ").append(toIndentedString(WEIGHT_UNIT_INVALID)).append("\n");
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

