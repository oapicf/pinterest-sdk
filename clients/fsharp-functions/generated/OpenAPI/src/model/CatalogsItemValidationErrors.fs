namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsItemValidationDetails

module CatalogsItemValidationErrors =

  //#region CatalogsItemValidationErrors

  [<CLIMutable>]
  type CatalogsItemValidationErrors = {
    [<JsonProperty(PropertyName = "ADULT_INVALID")>]
    ADULT_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ADWORDS_FORMAT_INVALID")>]
    ADWORDS_FORMAT_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "AVAILABILITY_INVALID")>]
    AVAILABILITY_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "BLOCKLISTED_IMAGE_SIGNATURE")>]
    BLOCKLISTED_IMAGE_SIGNATURE : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "DESCRIPTION_MISSING")>]
    DESCRIPTION_MISSING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "DUPLICATE_PRODUCTS")>]
    DUPLICATE_PRODUCTS : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "IMAGE_LINK_INVALID")>]
    IMAGE_LINK_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "IMAGE_LINK_LENGTH_TOO_LONG")>]
    IMAGE_LINK_LENGTH_TOO_LONG : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "IMAGE_LINK_MISSING")>]
    IMAGE_LINK_MISSING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "INVALID_DOMAIN")>]
    INVALID_DOMAIN : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ITEMID_MISSING")>]
    ITEMID_MISSING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")>]
    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "LINK_FORMAT_INVALID")>]
    LINK_FORMAT_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "LINK_LENGTH_TOO_LONG")>]
    LINK_LENGTH_TOO_LONG : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "LIST_PRICE_INVALID")>]
    LIST_PRICE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")>]
    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PARSE_LINE_ERROR")>]
    PARSE_LINE_ERROR : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PINJOIN_CONTENT_UNSAFE")>]
    PINJOIN_CONTENT_UNSAFE : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PRICE_CANNOT_BE_DETERMINED")>]
    PRICE_CANNOT_BE_DETERMINED : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PRICE_MISSING")>]
    PRICE_MISSING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PRODUCT_LINK_MISSING")>]
    PRODUCT_LINK_MISSING : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "PRODUCT_PRICE_INVALID")>]
    PRODUCT_PRICE_INVALID : CatalogsItemValidationDetails;
    [<JsonProperty(PropertyName = "TITLE_MISSING")>]
    TITLE_MISSING : CatalogsItemValidationDetails;
  }

  //#endregion
