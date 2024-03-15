namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedValidationErrors =

  //#region CatalogsFeedValidationErrors

  [<CLIMutable>]
  type CatalogsFeedValidationErrors = {
    [<JsonProperty(PropertyName = "FETCH_ERROR")>]
    FETCH_ERROR : int;
    [<JsonProperty(PropertyName = "FETCH_INACTIVE_FEED_ERROR")>]
    FETCH_INACTIVE_FEED_ERROR : int;
    [<JsonProperty(PropertyName = "ENCODING_ERROR")>]
    ENCODING_ERROR : int;
    [<JsonProperty(PropertyName = "DELIMITER_ERROR")>]
    DELIMITER_ERROR : int;
    [<JsonProperty(PropertyName = "REQUIRED_COLUMNS_MISSING")>]
    REQUIRED_COLUMNS_MISSING : int;
    [<JsonProperty(PropertyName = "DUPLICATE_PRODUCTS")>]
    DUPLICATE_PRODUCTS : int;
    [<JsonProperty(PropertyName = "IMAGE_LINK_INVALID")>]
    IMAGE_LINK_INVALID : int;
    [<JsonProperty(PropertyName = "ITEMID_MISSING")>]
    ITEMID_MISSING : int;
    [<JsonProperty(PropertyName = "TITLE_MISSING")>]
    TITLE_MISSING : int;
    [<JsonProperty(PropertyName = "DESCRIPTION_MISSING")>]
    DESCRIPTION_MISSING : int;
    [<JsonProperty(PropertyName = "PRODUCT_LINK_MISSING")>]
    PRODUCT_LINK_MISSING : int;
    [<JsonProperty(PropertyName = "IMAGE_LINK_MISSING")>]
    IMAGE_LINK_MISSING : int;
    [<JsonProperty(PropertyName = "AVAILABILITY_INVALID")>]
    AVAILABILITY_INVALID : int;
    [<JsonProperty(PropertyName = "PRODUCT_PRICE_INVALID")>]
    PRODUCT_PRICE_INVALID : int;
    [<JsonProperty(PropertyName = "LINK_FORMAT_INVALID")>]
    LINK_FORMAT_INVALID : int;
    [<JsonProperty(PropertyName = "PARSE_LINE_ERROR")>]
    PARSE_LINE_ERROR : int;
    [<JsonProperty(PropertyName = "ADWORDS_FORMAT_INVALID")>]
    ADWORDS_FORMAT_INVALID : int;
    [<JsonProperty(PropertyName = "INTERNAL_SERVICE_ERROR")>]
    INTERNAL_SERVICE_ERROR : int;
    [<JsonProperty(PropertyName = "NO_VERIFIED_DOMAIN")>]
    NO_VERIFIED_DOMAIN : int;
    [<JsonProperty(PropertyName = "ADULT_INVALID")>]
    ADULT_INVALID : int;
    [<JsonProperty(PropertyName = "IMAGE_LINK_LENGTH_TOO_LONG")>]
    IMAGE_LINK_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "INVALID_DOMAIN")>]
    INVALID_DOMAIN : int;
    [<JsonProperty(PropertyName = "FEED_LENGTH_TOO_LONG")>]
    FEED_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "LINK_LENGTH_TOO_LONG")>]
    LINK_LENGTH_TOO_LONG : int;
    [<JsonProperty(PropertyName = "MALFORMED_XML")>]
    MALFORMED_XML : int;
    [<JsonProperty(PropertyName = "PRICE_MISSING")>]
    PRICE_MISSING : int;
    [<JsonProperty(PropertyName = "FEED_TOO_SMALL")>]
    FEED_TOO_SMALL : int;
    [<JsonProperty(PropertyName = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")>]
    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED : int;
    [<JsonProperty(PropertyName = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")>]
    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE : int;
    [<JsonProperty(PropertyName = "PINJOIN_CONTENT_UNSAFE")>]
    PINJOIN_CONTENT_UNSAFE : int;
    [<JsonProperty(PropertyName = "BLOCKLISTED_IMAGE_SIGNATURE")>]
    BLOCKLISTED_IMAGE_SIGNATURE : int;
    [<JsonProperty(PropertyName = "LIST_PRICE_INVALID")>]
    LIST_PRICE_INVALID : int;
    [<JsonProperty(PropertyName = "PRICE_CANNOT_BE_DETERMINED")>]
    PRICE_CANNOT_BE_DETERMINED : int;
  }

  //#endregion
