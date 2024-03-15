namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedValidationWarnings =

  //#region CatalogsFeedValidationWarnings

  [<CLIMutable>]
  type CatalogsFeedValidationWarnings = {
    [<JsonProperty(PropertyName = "AD_LINK_FORMAT_WARNING")>]
    AD_LINK_FORMAT_WARNING : int;
    [<JsonProperty(PropertyName = "AD_LINK_SAME_AS_LINK")>]
    AD_LINK_SAME_AS_LINK : int;
    [<JsonProperty(PropertyName = "TITLE_LENGTH_TOO_LONG")>]
    TITLE_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "DESCRIPTION_LENGTH_TOO_LONG")>]
    DESCRIPTION_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "GENDER_INVALID")>]
    GENDER_INVALID : int;
    [<JsonProperty(PropertyName = "AGE_GROUP_INVALID")>]
    AGE_GROUP_INVALID : int;
    [<JsonProperty(PropertyName = "SIZE_TYPE_INVALID")>]
    SIZE_TYPE_INVALID : int;
    [<JsonProperty(PropertyName = "SIZE_SYSTEM_INVALID")>]
    SIZE_SYSTEM_INVALID : int;
    [<JsonProperty(PropertyName = "LINK_FORMAT_WARNING")>]
    LINK_FORMAT_WARNING : int;
    [<JsonProperty(PropertyName = "SALES_PRICE_INVALID")>]
    SALES_PRICE_INVALID : int;
    [<JsonProperty(PropertyName = "PRODUCT_CATEGORY_DEPTH_WARNING")>]
    PRODUCT_CATEGORY_DEPTH_WARNING : int;
    [<JsonProperty(PropertyName = "ADWORDS_FORMAT_WARNING")>]
    ADWORDS_FORMAT_WARNING : int;
    [<JsonProperty(PropertyName = "ADWORDS_SAME_AS_LINK")>]
    ADWORDS_SAME_AS_LINK : int;
    [<JsonProperty(PropertyName = "DUPLICATE_HEADERS")>]
    DUPLICATE_HEADERS : int;
    [<JsonProperty(PropertyName = "FETCH_SAME_SIGNATURE")>]
    FETCH_SAME_SIGNATURE : int;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")>]
    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_LINK_WARNING")>]
    ADDITIONAL_IMAGE_LINK_WARNING : int;
    [<JsonProperty(PropertyName = "IMAGE_LINK_WARNING")>]
    IMAGE_LINK_WARNING : int;
    [<JsonProperty(PropertyName = "SHIPPING_INVALID")>]
    SHIPPING_INVALID : int;
    [<JsonProperty(PropertyName = "TAX_INVALID")>]
    TAX_INVALID : int;
    [<JsonProperty(PropertyName = "SHIPPING_WEIGHT_INVALID")>]
    SHIPPING_WEIGHT_INVALID : int;
    [<JsonProperty(PropertyName = "EXPIRATION_DATE_INVALID")>]
    EXPIRATION_DATE_INVALID : int;
    [<JsonProperty(PropertyName = "AVAILABILITY_DATE_INVALID")>]
    AVAILABILITY_DATE_INVALID : int;
    [<JsonProperty(PropertyName = "SALE_DATE_INVALID")>]
    SALE_DATE_INVALID : int;
    [<JsonProperty(PropertyName = "WEIGHT_UNIT_INVALID")>]
    WEIGHT_UNIT_INVALID : int;
    [<JsonProperty(PropertyName = "IS_BUNDLE_INVALID")>]
    IS_BUNDLE_INVALID : int;
    [<JsonProperty(PropertyName = "UPDATED_TIME_INVALID")>]
    UPDATED_TIME_INVALID : int;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_LENGTH_TOO_LONG")>]
    CUSTOM_LABEL_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_LENGTH_TOO_LONG")>]
    PRODUCT_TYPE_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "TOO_MANY_ADDITIONAL_IMAGE_LINKS")>]
    TOO_MANY_ADDITIONAL_IMAGE_LINKS : int;
    [<JsonProperty(PropertyName = "MULTIPACK_INVALID")>]
    MULTIPACK_INVALID : int;
    [<JsonProperty(PropertyName = "INDEXED_PRODUCT_COUNT_LARGE_DELTA")>]
    INDEXED_PRODUCT_COUNT_LARGE_DELTA : int;
    [<JsonProperty(PropertyName = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")>]
    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE : int;
    [<JsonProperty(PropertyName = "OPTIONAL_PRODUCT_CATEGORY_MISSING")>]
    OPTIONAL_PRODUCT_CATEGORY_MISSING : int;
    [<JsonProperty(PropertyName = "OPTIONAL_PRODUCT_CATEGORY_INVALID")>]
    OPTIONAL_PRODUCT_CATEGORY_INVALID : int;
    [<JsonProperty(PropertyName = "OPTIONAL_CONDITION_MISSING")>]
    OPTIONAL_CONDITION_MISSING : int;
    [<JsonProperty(PropertyName = "OPTIONAL_CONDITION_INVALID")>]
    OPTIONAL_CONDITION_INVALID : int;
    [<JsonProperty(PropertyName = "IOS_DEEP_LINK_INVALID")>]
    IOS_DEEP_LINK_INVALID : int;
    [<JsonProperty(PropertyName = "ANDROID_DEEP_LINK_INVALID")>]
    ANDROID_DEEP_LINK_INVALID : int;
    [<JsonProperty(PropertyName = "UTM_SOURCE_AUTO_CORRECTED")>]
    UTM_SOURCE_AUTO_CORRECTED : int;
    [<JsonProperty(PropertyName = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY")>]
    COUNTRY_DOES_NOT_MAP_TO_CURRENCY : int;
    [<JsonProperty(PropertyName = "MIN_AD_PRICE_INVALID")>]
    MIN_AD_PRICE_INVALID : int;
    [<JsonProperty(PropertyName = "GTIN_INVALID")>]
    GTIN_INVALID : int;
    [<JsonProperty(PropertyName = "INCONSISTENT_CURRENCY_VALUES")>]
    INCONSISTENT_CURRENCY_VALUES : int;
    [<JsonProperty(PropertyName = "SALES_PRICE_TOO_LOW")>]
    SALES_PRICE_TOO_LOW : int;
    [<JsonProperty(PropertyName = "SHIPPING_WIDTH_INVALID")>]
    SHIPPING_WIDTH_INVALID : int;
    [<JsonProperty(PropertyName = "SHIPPING_HEIGHT_INVALID")>]
    SHIPPING_HEIGHT_INVALID : int;
    [<JsonProperty(PropertyName = "SALES_PRICE_TOO_HIGH")>]
    SALES_PRICE_TOO_HIGH : int;
    [<JsonProperty(PropertyName = "MPN_INVALID")>]
    MPN_INVALID : int;
  }

  //#endregion
