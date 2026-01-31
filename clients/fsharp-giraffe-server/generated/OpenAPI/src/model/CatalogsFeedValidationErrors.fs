namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedValidationErrors =

  //#region CatalogsFeedValidationErrors


  type CatalogsFeedValidationErrors = {
    ADULT_INVALID : int;
    ADWORDS_FORMAT_INVALID : int;
    AVAILABILITY_INVALID : int;
    BLOCKLISTED_IMAGE_SIGNATURE : int;
    DELIMITER_ERROR : int;
    DESCRIPTION_MISSING : int;
    DUPLICATE_PRODUCTS : int;
    ENCODING_ERROR : int;
    FEED_LENGTH_TOO_LONG : int;
    FEED_TOO_SMALL : int;
    FETCH_ERROR : int;
    FETCH_INACTIVE_FEED_ERROR : int;
    IMAGE_LINK_INVALID : int;
    IMAGE_LINK_LENGTH_TOO_LONG : int;
    IMAGE_LINK_MISSING : int;
    INTERNAL_SERVICE_ERROR : int;
    INVALID_DOMAIN : int;
    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE : int;
    ITEMID_MISSING : int;
    LINK_FORMAT_INVALID : int;
    LINK_LENGTH_TOO_LONG : int;
    LIST_PRICE_INVALID : int;
    MALFORMED_XML : int;
    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED : int;
    NO_VERIFIED_DOMAIN : int;
    PARSE_LINE_ERROR : int;
    PINJOIN_CONTENT_UNSAFE : int;
    PRICE_CANNOT_BE_DETERMINED : int;
    PRICE_MISSING : int;
    PRODUCT_LINK_MISSING : int;
    PRODUCT_PRICE_INVALID : int;
    REQUIRED_COLUMNS_MISSING : int;
    TITLE_MISSING : int;
  }
  //#endregion
