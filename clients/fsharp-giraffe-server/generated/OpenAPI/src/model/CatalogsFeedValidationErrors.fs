namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedValidationErrors =

  //#region CatalogsFeedValidationErrors


  type CatalogsFeedValidationErrors = {
    FETCH_ERROR : int;
    FETCH_INACTIVE_FEED_ERROR : int;
    ENCODING_ERROR : int;
    DELIMITER_ERROR : int;
    REQUIRED_COLUMNS_MISSING : int;
    DUPLICATE_PRODUCTS : int;
    IMAGE_LINK_INVALID : int;
    ITEMID_MISSING : int;
    TITLE_MISSING : int;
    DESCRIPTION_MISSING : int;
    PRODUCT_LINK_MISSING : int;
    IMAGE_LINK_MISSING : int;
    AVAILABILITY_INVALID : int;
    PRODUCT_PRICE_INVALID : int;
    LINK_FORMAT_INVALID : int;
    PARSE_LINE_ERROR : int;
    ADWORDS_FORMAT_INVALID : int;
    INTERNAL_SERVICE_ERROR : int;
    NO_VERIFIED_DOMAIN : int;
    ADULT_INVALID : int;
    IMAGE_LINK_LENGTH_TOO_LONG : int;
    INVALID_DOMAIN : int;
    FEED_LENGTH_TOO_LONG : int;
    LINK_LENGTH_TOO_LONG : int;
    MALFORMED_XML : int;
    PRICE_MISSING : int;
    FEED_TOO_SMALL : int;
    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED : int;
    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE : int;
    PINJOIN_CONTENT_UNSAFE : int;
    BLOCKLISTED_IMAGE_SIGNATURE : int;
    LIST_PRICE_INVALID : int;
    PRICE_CANNOT_BE_DETERMINED : int;
  }
  //#endregion
