namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsItemValidationDetails

module CatalogsItemValidationWarnings =

  //#region CatalogsItemValidationWarnings

  [<CLIMutable>]
  type CatalogsItemValidationWarnings = {
    [<JsonProperty(PropertyName = "AD_LINK_FORMAT_WARNING")>]
    AD_LINK_FORMAT_WARNING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "AD_LINK_SAME_AS_LINK")>]
    AD_LINK_SAME_AS_LINK : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")>]
    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_LINK_WARNING")>]
    ADDITIONAL_IMAGE_LINK_WARNING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ADWORDS_FORMAT_WARNING")>]
    ADWORDS_FORMAT_WARNING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ADWORDS_SAME_AS_LINK")>]
    ADWORDS_SAME_AS_LINK : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "AGE_GROUP_INVALID")>]
    AGE_GROUP_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SIZE_SYSTEM_INVALID")>]
    SIZE_SYSTEM_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ANDROID_DEEP_LINK_INVALID")>]
    ANDROID_DEEP_LINK_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "AVAILABILITY_DATE_INVALID")>]
    AVAILABILITY_DATE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY")>]
    COUNTRY_DOES_NOT_MAP_TO_CURRENCY : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_LENGTH_TOO_LONG")>]
    CUSTOM_LABEL_LENGTH_TOO_LONG : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "DESCRIPTION_LENGTH_TOO_LONG")>]
    DESCRIPTION_LENGTH_TOO_LONG : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "EXPIRATION_DATE_INVALID")>]
    EXPIRATION_DATE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "GENDER_INVALID")>]
    GENDER_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "GTIN_INVALID")>]
    GTIN_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "IMAGE_LINK_WARNING")>]
    IMAGE_LINK_WARNING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "IOS_DEEP_LINK_INVALID")>]
    IOS_DEEP_LINK_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "IS_BUNDLE_INVALID")>]
    IS_BUNDLE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")>]
    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "LINK_FORMAT_WARNING")>]
    LINK_FORMAT_WARNING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "MIN_AD_PRICE_INVALID")>]
    MIN_AD_PRICE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "MPN_INVALID")>]
    MPN_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "MULTIPACK_INVALID")>]
    MULTIPACK_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "OPTIONAL_CONDITION_INVALID")>]
    OPTIONAL_CONDITION_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "OPTIONAL_CONDITION_MISSING")>]
    OPTIONAL_CONDITION_MISSING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "OPTIONAL_PRODUCT_CATEGORY_INVALID")>]
    OPTIONAL_PRODUCT_CATEGORY_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "OPTIONAL_PRODUCT_CATEGORY_MISSING")>]
    OPTIONAL_PRODUCT_CATEGORY_MISSING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PRODUCT_CATEGORY_DEPTH_WARNING")>]
    PRODUCT_CATEGORY_DEPTH_WARNING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_LENGTH_TOO_LONG")>]
    PRODUCT_TYPE_LENGTH_TOO_LONG : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SALES_PRICE_INVALID")>]
    SALES_PRICE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SALES_PRICE_TOO_LOW")>]
    SALES_PRICE_TOO_LOW : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SALES_PRICE_TOO_HIGH")>]
    SALES_PRICE_TOO_HIGH : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SALE_DATE_INVALID")>]
    SALE_DATE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SHIPPING_INVALID")>]
    SHIPPING_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SHIPPING_HEIGHT_INVALID")>]
    SHIPPING_HEIGHT_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SHIPPING_WEIGHT_INVALID")>]
    SHIPPING_WEIGHT_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SHIPPING_WIDTH_INVALID")>]
    SHIPPING_WIDTH_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "SIZE_TYPE_INVALID")>]
    SIZE_TYPE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "TAX_INVALID")>]
    TAX_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "TITLE_LENGTH_TOO_LONG")>]
    TITLE_LENGTH_TOO_LONG : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "TOO_MANY_ADDITIONAL_IMAGE_LINKS")>]
    TOO_MANY_ADDITIONAL_IMAGE_LINKS : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "UTM_SOURCE_AUTO_CORRECTED")>]
    UTM_SOURCE_AUTO_CORRECTED : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "WEIGHT_UNIT_INVALID")>]
    WEIGHT_UNIT_INVALID : CatalogsItemValidationDetails;
  }

  //#endregion
