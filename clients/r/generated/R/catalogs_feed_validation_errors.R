#' Create a new CatalogsFeedValidationErrors
#'
#' @description
#' CatalogsFeedValidationErrors Class
#'
#' @docType class
#' @title CatalogsFeedValidationErrors
#' @description CatalogsFeedValidationErrors Class
#' @format An \code{R6Class} generator object
#' @field FETCH_ERROR Pinterest couldn't download your feed. integer [optional]
#' @field FETCH_INACTIVE_FEED_ERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days. integer [optional]
#' @field ENCODING_ERROR Your feed includes data with an unsupported encoding format. integer [optional]
#' @field DELIMITER_ERROR Your feed includes data with formatting errors. integer [optional]
#' @field REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers. integer [optional]
#' @field DUPLICATE_PRODUCTS Some products are duplicated. integer [optional]
#' @field IMAGE_LINK_INVALID Some image links are formatted incorrectly. integer [optional]
#' @field ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published. integer [optional]
#' @field TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published. integer [optional]
#' @field DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published. integer [optional]
#' @field PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published. integer [optional]
#' @field IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published. integer [optional]
#' @field AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published. integer [optional]
#' @field PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published. integer [optional]
#' @field LINK_FORMAT_INVALID Some link values are formatted incorrectly. integer [optional]
#' @field PARSE_LINE_ERROR Your feed contains formatting errors for some items. integer [optional]
#' @field ADWORDS_FORMAT_INVALID Some adwords links contain too many characters. integer [optional]
#' @field INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. integer [optional]
#' @field NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed. integer [optional]
#' @field ADULT_INVALID Some items have invalid adult values. integer [optional]
#' @field IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published. integer [optional]
#' @field INVALID_DOMAIN Some of your product link values don't match the verified domain associated with this account. integer [optional]
#' @field FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published. integer [optional]
#' @field LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published. integer [optional]
#' @field MALFORMED_XML Your feed couldn't be validated because the xml file is formatted incorrectly. integer [optional]
#' @field PRICE_MISSING Some products are missing a price, those items will not be published. integer [optional]
#' @field FEED_TOO_SMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. integer [optional]
#' @field MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published. integer [optional]
#' @field ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items' main images can't be found. integer [optional]
#' @field PINJOIN_CONTENT_UNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines. integer [optional]
#' @field BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines. integer [optional]
#' @field LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published. integer [optional]
#' @field PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedValidationErrors <- R6::R6Class(
  "CatalogsFeedValidationErrors",
  public = list(
    `FETCH_ERROR` = NULL,
    `FETCH_INACTIVE_FEED_ERROR` = NULL,
    `ENCODING_ERROR` = NULL,
    `DELIMITER_ERROR` = NULL,
    `REQUIRED_COLUMNS_MISSING` = NULL,
    `DUPLICATE_PRODUCTS` = NULL,
    `IMAGE_LINK_INVALID` = NULL,
    `ITEMID_MISSING` = NULL,
    `TITLE_MISSING` = NULL,
    `DESCRIPTION_MISSING` = NULL,
    `PRODUCT_LINK_MISSING` = NULL,
    `IMAGE_LINK_MISSING` = NULL,
    `AVAILABILITY_INVALID` = NULL,
    `PRODUCT_PRICE_INVALID` = NULL,
    `LINK_FORMAT_INVALID` = NULL,
    `PARSE_LINE_ERROR` = NULL,
    `ADWORDS_FORMAT_INVALID` = NULL,
    `INTERNAL_SERVICE_ERROR` = NULL,
    `NO_VERIFIED_DOMAIN` = NULL,
    `ADULT_INVALID` = NULL,
    `IMAGE_LINK_LENGTH_TOO_LONG` = NULL,
    `INVALID_DOMAIN` = NULL,
    `FEED_LENGTH_TOO_LONG` = NULL,
    `LINK_LENGTH_TOO_LONG` = NULL,
    `MALFORMED_XML` = NULL,
    `PRICE_MISSING` = NULL,
    `FEED_TOO_SMALL` = NULL,
    `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` = NULL,
    `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` = NULL,
    `PINJOIN_CONTENT_UNSAFE` = NULL,
    `BLOCKLISTED_IMAGE_SIGNATURE` = NULL,
    `LIST_PRICE_INVALID` = NULL,
    `PRICE_CANNOT_BE_DETERMINED` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedValidationErrors class.
    #'
    #' @param FETCH_ERROR Pinterest couldn't download your feed.
    #' @param FETCH_INACTIVE_FEED_ERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
    #' @param ENCODING_ERROR Your feed includes data with an unsupported encoding format.
    #' @param DELIMITER_ERROR Your feed includes data with formatting errors.
    #' @param REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers.
    #' @param DUPLICATE_PRODUCTS Some products are duplicated.
    #' @param IMAGE_LINK_INVALID Some image links are formatted incorrectly.
    #' @param ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published.
    #' @param TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published.
    #' @param DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published.
    #' @param PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published.
    #' @param IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published.
    #' @param AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published.
    #' @param PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published.
    #' @param LINK_FORMAT_INVALID Some link values are formatted incorrectly.
    #' @param PARSE_LINE_ERROR Your feed contains formatting errors for some items.
    #' @param ADWORDS_FORMAT_INVALID Some adwords links contain too many characters.
    #' @param INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
    #' @param NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed.
    #' @param ADULT_INVALID Some items have invalid adult values.
    #' @param IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published.
    #' @param INVALID_DOMAIN Some of your product link values don't match the verified domain associated with this account.
    #' @param FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published.
    #' @param LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published.
    #' @param MALFORMED_XML Your feed couldn't be validated because the xml file is formatted incorrectly.
    #' @param PRICE_MISSING Some products are missing a price, those items will not be published.
    #' @param FEED_TOO_SMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
    #' @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
    #' @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items' main images can't be found.
    #' @param PINJOIN_CONTENT_UNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
    #' @param BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
    #' @param LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published.
    #' @param PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
    #' @param ... Other optional arguments.
    initialize = function(`FETCH_ERROR` = NULL, `FETCH_INACTIVE_FEED_ERROR` = NULL, `ENCODING_ERROR` = NULL, `DELIMITER_ERROR` = NULL, `REQUIRED_COLUMNS_MISSING` = NULL, `DUPLICATE_PRODUCTS` = NULL, `IMAGE_LINK_INVALID` = NULL, `ITEMID_MISSING` = NULL, `TITLE_MISSING` = NULL, `DESCRIPTION_MISSING` = NULL, `PRODUCT_LINK_MISSING` = NULL, `IMAGE_LINK_MISSING` = NULL, `AVAILABILITY_INVALID` = NULL, `PRODUCT_PRICE_INVALID` = NULL, `LINK_FORMAT_INVALID` = NULL, `PARSE_LINE_ERROR` = NULL, `ADWORDS_FORMAT_INVALID` = NULL, `INTERNAL_SERVICE_ERROR` = NULL, `NO_VERIFIED_DOMAIN` = NULL, `ADULT_INVALID` = NULL, `IMAGE_LINK_LENGTH_TOO_LONG` = NULL, `INVALID_DOMAIN` = NULL, `FEED_LENGTH_TOO_LONG` = NULL, `LINK_LENGTH_TOO_LONG` = NULL, `MALFORMED_XML` = NULL, `PRICE_MISSING` = NULL, `FEED_TOO_SMALL` = NULL, `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` = NULL, `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` = NULL, `PINJOIN_CONTENT_UNSAFE` = NULL, `BLOCKLISTED_IMAGE_SIGNATURE` = NULL, `LIST_PRICE_INVALID` = NULL, `PRICE_CANNOT_BE_DETERMINED` = NULL, ...) {
      if (!is.null(`FETCH_ERROR`)) {
        if (!(is.numeric(`FETCH_ERROR`) && length(`FETCH_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `FETCH_ERROR`. Must be an integer:", `FETCH_ERROR`))
        }
        self$`FETCH_ERROR` <- `FETCH_ERROR`
      }
      if (!is.null(`FETCH_INACTIVE_FEED_ERROR`)) {
        if (!(is.numeric(`FETCH_INACTIVE_FEED_ERROR`) && length(`FETCH_INACTIVE_FEED_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `FETCH_INACTIVE_FEED_ERROR`. Must be an integer:", `FETCH_INACTIVE_FEED_ERROR`))
        }
        self$`FETCH_INACTIVE_FEED_ERROR` <- `FETCH_INACTIVE_FEED_ERROR`
      }
      if (!is.null(`ENCODING_ERROR`)) {
        if (!(is.numeric(`ENCODING_ERROR`) && length(`ENCODING_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `ENCODING_ERROR`. Must be an integer:", `ENCODING_ERROR`))
        }
        self$`ENCODING_ERROR` <- `ENCODING_ERROR`
      }
      if (!is.null(`DELIMITER_ERROR`)) {
        if (!(is.numeric(`DELIMITER_ERROR`) && length(`DELIMITER_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `DELIMITER_ERROR`. Must be an integer:", `DELIMITER_ERROR`))
        }
        self$`DELIMITER_ERROR` <- `DELIMITER_ERROR`
      }
      if (!is.null(`REQUIRED_COLUMNS_MISSING`)) {
        if (!(is.numeric(`REQUIRED_COLUMNS_MISSING`) && length(`REQUIRED_COLUMNS_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `REQUIRED_COLUMNS_MISSING`. Must be an integer:", `REQUIRED_COLUMNS_MISSING`))
        }
        self$`REQUIRED_COLUMNS_MISSING` <- `REQUIRED_COLUMNS_MISSING`
      }
      if (!is.null(`DUPLICATE_PRODUCTS`)) {
        if (!(is.numeric(`DUPLICATE_PRODUCTS`) && length(`DUPLICATE_PRODUCTS`) == 1)) {
          stop(paste("Error! Invalid data for `DUPLICATE_PRODUCTS`. Must be an integer:", `DUPLICATE_PRODUCTS`))
        }
        self$`DUPLICATE_PRODUCTS` <- `DUPLICATE_PRODUCTS`
      }
      if (!is.null(`IMAGE_LINK_INVALID`)) {
        if (!(is.numeric(`IMAGE_LINK_INVALID`) && length(`IMAGE_LINK_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_LINK_INVALID`. Must be an integer:", `IMAGE_LINK_INVALID`))
        }
        self$`IMAGE_LINK_INVALID` <- `IMAGE_LINK_INVALID`
      }
      if (!is.null(`ITEMID_MISSING`)) {
        if (!(is.numeric(`ITEMID_MISSING`) && length(`ITEMID_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `ITEMID_MISSING`. Must be an integer:", `ITEMID_MISSING`))
        }
        self$`ITEMID_MISSING` <- `ITEMID_MISSING`
      }
      if (!is.null(`TITLE_MISSING`)) {
        if (!(is.numeric(`TITLE_MISSING`) && length(`TITLE_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `TITLE_MISSING`. Must be an integer:", `TITLE_MISSING`))
        }
        self$`TITLE_MISSING` <- `TITLE_MISSING`
      }
      if (!is.null(`DESCRIPTION_MISSING`)) {
        if (!(is.numeric(`DESCRIPTION_MISSING`) && length(`DESCRIPTION_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `DESCRIPTION_MISSING`. Must be an integer:", `DESCRIPTION_MISSING`))
        }
        self$`DESCRIPTION_MISSING` <- `DESCRIPTION_MISSING`
      }
      if (!is.null(`PRODUCT_LINK_MISSING`)) {
        if (!(is.numeric(`PRODUCT_LINK_MISSING`) && length(`PRODUCT_LINK_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `PRODUCT_LINK_MISSING`. Must be an integer:", `PRODUCT_LINK_MISSING`))
        }
        self$`PRODUCT_LINK_MISSING` <- `PRODUCT_LINK_MISSING`
      }
      if (!is.null(`IMAGE_LINK_MISSING`)) {
        if (!(is.numeric(`IMAGE_LINK_MISSING`) && length(`IMAGE_LINK_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_LINK_MISSING`. Must be an integer:", `IMAGE_LINK_MISSING`))
        }
        self$`IMAGE_LINK_MISSING` <- `IMAGE_LINK_MISSING`
      }
      if (!is.null(`AVAILABILITY_INVALID`)) {
        if (!(is.numeric(`AVAILABILITY_INVALID`) && length(`AVAILABILITY_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `AVAILABILITY_INVALID`. Must be an integer:", `AVAILABILITY_INVALID`))
        }
        self$`AVAILABILITY_INVALID` <- `AVAILABILITY_INVALID`
      }
      if (!is.null(`PRODUCT_PRICE_INVALID`)) {
        if (!(is.numeric(`PRODUCT_PRICE_INVALID`) && length(`PRODUCT_PRICE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `PRODUCT_PRICE_INVALID`. Must be an integer:", `PRODUCT_PRICE_INVALID`))
        }
        self$`PRODUCT_PRICE_INVALID` <- `PRODUCT_PRICE_INVALID`
      }
      if (!is.null(`LINK_FORMAT_INVALID`)) {
        if (!(is.numeric(`LINK_FORMAT_INVALID`) && length(`LINK_FORMAT_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `LINK_FORMAT_INVALID`. Must be an integer:", `LINK_FORMAT_INVALID`))
        }
        self$`LINK_FORMAT_INVALID` <- `LINK_FORMAT_INVALID`
      }
      if (!is.null(`PARSE_LINE_ERROR`)) {
        if (!(is.numeric(`PARSE_LINE_ERROR`) && length(`PARSE_LINE_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `PARSE_LINE_ERROR`. Must be an integer:", `PARSE_LINE_ERROR`))
        }
        self$`PARSE_LINE_ERROR` <- `PARSE_LINE_ERROR`
      }
      if (!is.null(`ADWORDS_FORMAT_INVALID`)) {
        if (!(is.numeric(`ADWORDS_FORMAT_INVALID`) && length(`ADWORDS_FORMAT_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `ADWORDS_FORMAT_INVALID`. Must be an integer:", `ADWORDS_FORMAT_INVALID`))
        }
        self$`ADWORDS_FORMAT_INVALID` <- `ADWORDS_FORMAT_INVALID`
      }
      if (!is.null(`INTERNAL_SERVICE_ERROR`)) {
        if (!(is.numeric(`INTERNAL_SERVICE_ERROR`) && length(`INTERNAL_SERVICE_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `INTERNAL_SERVICE_ERROR`. Must be an integer:", `INTERNAL_SERVICE_ERROR`))
        }
        self$`INTERNAL_SERVICE_ERROR` <- `INTERNAL_SERVICE_ERROR`
      }
      if (!is.null(`NO_VERIFIED_DOMAIN`)) {
        if (!(is.numeric(`NO_VERIFIED_DOMAIN`) && length(`NO_VERIFIED_DOMAIN`) == 1)) {
          stop(paste("Error! Invalid data for `NO_VERIFIED_DOMAIN`. Must be an integer:", `NO_VERIFIED_DOMAIN`))
        }
        self$`NO_VERIFIED_DOMAIN` <- `NO_VERIFIED_DOMAIN`
      }
      if (!is.null(`ADULT_INVALID`)) {
        if (!(is.numeric(`ADULT_INVALID`) && length(`ADULT_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `ADULT_INVALID`. Must be an integer:", `ADULT_INVALID`))
        }
        self$`ADULT_INVALID` <- `ADULT_INVALID`
      }
      if (!is.null(`IMAGE_LINK_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`IMAGE_LINK_LENGTH_TOO_LONG`) && length(`IMAGE_LINK_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_LINK_LENGTH_TOO_LONG`. Must be an integer:", `IMAGE_LINK_LENGTH_TOO_LONG`))
        }
        self$`IMAGE_LINK_LENGTH_TOO_LONG` <- `IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(`INVALID_DOMAIN`)) {
        if (!(is.numeric(`INVALID_DOMAIN`) && length(`INVALID_DOMAIN`) == 1)) {
          stop(paste("Error! Invalid data for `INVALID_DOMAIN`. Must be an integer:", `INVALID_DOMAIN`))
        }
        self$`INVALID_DOMAIN` <- `INVALID_DOMAIN`
      }
      if (!is.null(`FEED_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`FEED_LENGTH_TOO_LONG`) && length(`FEED_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `FEED_LENGTH_TOO_LONG`. Must be an integer:", `FEED_LENGTH_TOO_LONG`))
        }
        self$`FEED_LENGTH_TOO_LONG` <- `FEED_LENGTH_TOO_LONG`
      }
      if (!is.null(`LINK_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`LINK_LENGTH_TOO_LONG`) && length(`LINK_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `LINK_LENGTH_TOO_LONG`. Must be an integer:", `LINK_LENGTH_TOO_LONG`))
        }
        self$`LINK_LENGTH_TOO_LONG` <- `LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(`MALFORMED_XML`)) {
        if (!(is.numeric(`MALFORMED_XML`) && length(`MALFORMED_XML`) == 1)) {
          stop(paste("Error! Invalid data for `MALFORMED_XML`. Must be an integer:", `MALFORMED_XML`))
        }
        self$`MALFORMED_XML` <- `MALFORMED_XML`
      }
      if (!is.null(`PRICE_MISSING`)) {
        if (!(is.numeric(`PRICE_MISSING`) && length(`PRICE_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `PRICE_MISSING`. Must be an integer:", `PRICE_MISSING`))
        }
        self$`PRICE_MISSING` <- `PRICE_MISSING`
      }
      if (!is.null(`FEED_TOO_SMALL`)) {
        if (!(is.numeric(`FEED_TOO_SMALL`) && length(`FEED_TOO_SMALL`) == 1)) {
          stop(paste("Error! Invalid data for `FEED_TOO_SMALL`. Must be an integer:", `FEED_TOO_SMALL`))
        }
        self$`FEED_TOO_SMALL` <- `FEED_TOO_SMALL`
      }
      if (!is.null(`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
        if (!(is.numeric(`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`) && length(`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`) == 1)) {
          stop(paste("Error! Invalid data for `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`. Must be an integer:", `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`))
        }
        self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` <- `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`
      }
      if (!is.null(`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        if (!(is.numeric(`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`) && length(`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`) == 1)) {
          stop(paste("Error! Invalid data for `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`. Must be an integer:", `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`))
        }
        self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(`PINJOIN_CONTENT_UNSAFE`)) {
        if (!(is.numeric(`PINJOIN_CONTENT_UNSAFE`) && length(`PINJOIN_CONTENT_UNSAFE`) == 1)) {
          stop(paste("Error! Invalid data for `PINJOIN_CONTENT_UNSAFE`. Must be an integer:", `PINJOIN_CONTENT_UNSAFE`))
        }
        self$`PINJOIN_CONTENT_UNSAFE` <- `PINJOIN_CONTENT_UNSAFE`
      }
      if (!is.null(`BLOCKLISTED_IMAGE_SIGNATURE`)) {
        if (!(is.numeric(`BLOCKLISTED_IMAGE_SIGNATURE`) && length(`BLOCKLISTED_IMAGE_SIGNATURE`) == 1)) {
          stop(paste("Error! Invalid data for `BLOCKLISTED_IMAGE_SIGNATURE`. Must be an integer:", `BLOCKLISTED_IMAGE_SIGNATURE`))
        }
        self$`BLOCKLISTED_IMAGE_SIGNATURE` <- `BLOCKLISTED_IMAGE_SIGNATURE`
      }
      if (!is.null(`LIST_PRICE_INVALID`)) {
        if (!(is.numeric(`LIST_PRICE_INVALID`) && length(`LIST_PRICE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `LIST_PRICE_INVALID`. Must be an integer:", `LIST_PRICE_INVALID`))
        }
        self$`LIST_PRICE_INVALID` <- `LIST_PRICE_INVALID`
      }
      if (!is.null(`PRICE_CANNOT_BE_DETERMINED`)) {
        if (!(is.numeric(`PRICE_CANNOT_BE_DETERMINED`) && length(`PRICE_CANNOT_BE_DETERMINED`) == 1)) {
          stop(paste("Error! Invalid data for `PRICE_CANNOT_BE_DETERMINED`. Must be an integer:", `PRICE_CANNOT_BE_DETERMINED`))
        }
        self$`PRICE_CANNOT_BE_DETERMINED` <- `PRICE_CANNOT_BE_DETERMINED`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedValidationErrors in JSON format
    toJSON = function() {
      CatalogsFeedValidationErrorsObject <- list()
      if (!is.null(self$`FETCH_ERROR`)) {
        CatalogsFeedValidationErrorsObject[["FETCH_ERROR"]] <-
          self$`FETCH_ERROR`
      }
      if (!is.null(self$`FETCH_INACTIVE_FEED_ERROR`)) {
        CatalogsFeedValidationErrorsObject[["FETCH_INACTIVE_FEED_ERROR"]] <-
          self$`FETCH_INACTIVE_FEED_ERROR`
      }
      if (!is.null(self$`ENCODING_ERROR`)) {
        CatalogsFeedValidationErrorsObject[["ENCODING_ERROR"]] <-
          self$`ENCODING_ERROR`
      }
      if (!is.null(self$`DELIMITER_ERROR`)) {
        CatalogsFeedValidationErrorsObject[["DELIMITER_ERROR"]] <-
          self$`DELIMITER_ERROR`
      }
      if (!is.null(self$`REQUIRED_COLUMNS_MISSING`)) {
        CatalogsFeedValidationErrorsObject[["REQUIRED_COLUMNS_MISSING"]] <-
          self$`REQUIRED_COLUMNS_MISSING`
      }
      if (!is.null(self$`DUPLICATE_PRODUCTS`)) {
        CatalogsFeedValidationErrorsObject[["DUPLICATE_PRODUCTS"]] <-
          self$`DUPLICATE_PRODUCTS`
      }
      if (!is.null(self$`IMAGE_LINK_INVALID`)) {
        CatalogsFeedValidationErrorsObject[["IMAGE_LINK_INVALID"]] <-
          self$`IMAGE_LINK_INVALID`
      }
      if (!is.null(self$`ITEMID_MISSING`)) {
        CatalogsFeedValidationErrorsObject[["ITEMID_MISSING"]] <-
          self$`ITEMID_MISSING`
      }
      if (!is.null(self$`TITLE_MISSING`)) {
        CatalogsFeedValidationErrorsObject[["TITLE_MISSING"]] <-
          self$`TITLE_MISSING`
      }
      if (!is.null(self$`DESCRIPTION_MISSING`)) {
        CatalogsFeedValidationErrorsObject[["DESCRIPTION_MISSING"]] <-
          self$`DESCRIPTION_MISSING`
      }
      if (!is.null(self$`PRODUCT_LINK_MISSING`)) {
        CatalogsFeedValidationErrorsObject[["PRODUCT_LINK_MISSING"]] <-
          self$`PRODUCT_LINK_MISSING`
      }
      if (!is.null(self$`IMAGE_LINK_MISSING`)) {
        CatalogsFeedValidationErrorsObject[["IMAGE_LINK_MISSING"]] <-
          self$`IMAGE_LINK_MISSING`
      }
      if (!is.null(self$`AVAILABILITY_INVALID`)) {
        CatalogsFeedValidationErrorsObject[["AVAILABILITY_INVALID"]] <-
          self$`AVAILABILITY_INVALID`
      }
      if (!is.null(self$`PRODUCT_PRICE_INVALID`)) {
        CatalogsFeedValidationErrorsObject[["PRODUCT_PRICE_INVALID"]] <-
          self$`PRODUCT_PRICE_INVALID`
      }
      if (!is.null(self$`LINK_FORMAT_INVALID`)) {
        CatalogsFeedValidationErrorsObject[["LINK_FORMAT_INVALID"]] <-
          self$`LINK_FORMAT_INVALID`
      }
      if (!is.null(self$`PARSE_LINE_ERROR`)) {
        CatalogsFeedValidationErrorsObject[["PARSE_LINE_ERROR"]] <-
          self$`PARSE_LINE_ERROR`
      }
      if (!is.null(self$`ADWORDS_FORMAT_INVALID`)) {
        CatalogsFeedValidationErrorsObject[["ADWORDS_FORMAT_INVALID"]] <-
          self$`ADWORDS_FORMAT_INVALID`
      }
      if (!is.null(self$`INTERNAL_SERVICE_ERROR`)) {
        CatalogsFeedValidationErrorsObject[["INTERNAL_SERVICE_ERROR"]] <-
          self$`INTERNAL_SERVICE_ERROR`
      }
      if (!is.null(self$`NO_VERIFIED_DOMAIN`)) {
        CatalogsFeedValidationErrorsObject[["NO_VERIFIED_DOMAIN"]] <-
          self$`NO_VERIFIED_DOMAIN`
      }
      if (!is.null(self$`ADULT_INVALID`)) {
        CatalogsFeedValidationErrorsObject[["ADULT_INVALID"]] <-
          self$`ADULT_INVALID`
      }
      if (!is.null(self$`IMAGE_LINK_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationErrorsObject[["IMAGE_LINK_LENGTH_TOO_LONG"]] <-
          self$`IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`INVALID_DOMAIN`)) {
        CatalogsFeedValidationErrorsObject[["INVALID_DOMAIN"]] <-
          self$`INVALID_DOMAIN`
      }
      if (!is.null(self$`FEED_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationErrorsObject[["FEED_LENGTH_TOO_LONG"]] <-
          self$`FEED_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`LINK_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationErrorsObject[["LINK_LENGTH_TOO_LONG"]] <-
          self$`LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`MALFORMED_XML`)) {
        CatalogsFeedValidationErrorsObject[["MALFORMED_XML"]] <-
          self$`MALFORMED_XML`
      }
      if (!is.null(self$`PRICE_MISSING`)) {
        CatalogsFeedValidationErrorsObject[["PRICE_MISSING"]] <-
          self$`PRICE_MISSING`
      }
      if (!is.null(self$`FEED_TOO_SMALL`)) {
        CatalogsFeedValidationErrorsObject[["FEED_TOO_SMALL"]] <-
          self$`FEED_TOO_SMALL`
      }
      if (!is.null(self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
        CatalogsFeedValidationErrorsObject[["MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"]] <-
          self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`
      }
      if (!is.null(self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        CatalogsFeedValidationErrorsObject[["ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"]] <-
          self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(self$`PINJOIN_CONTENT_UNSAFE`)) {
        CatalogsFeedValidationErrorsObject[["PINJOIN_CONTENT_UNSAFE"]] <-
          self$`PINJOIN_CONTENT_UNSAFE`
      }
      if (!is.null(self$`BLOCKLISTED_IMAGE_SIGNATURE`)) {
        CatalogsFeedValidationErrorsObject[["BLOCKLISTED_IMAGE_SIGNATURE"]] <-
          self$`BLOCKLISTED_IMAGE_SIGNATURE`
      }
      if (!is.null(self$`LIST_PRICE_INVALID`)) {
        CatalogsFeedValidationErrorsObject[["LIST_PRICE_INVALID"]] <-
          self$`LIST_PRICE_INVALID`
      }
      if (!is.null(self$`PRICE_CANNOT_BE_DETERMINED`)) {
        CatalogsFeedValidationErrorsObject[["PRICE_CANNOT_BE_DETERMINED"]] <-
          self$`PRICE_CANNOT_BE_DETERMINED`
      }
      CatalogsFeedValidationErrorsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedValidationErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedValidationErrors
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`FETCH_ERROR`)) {
        self$`FETCH_ERROR` <- this_object$`FETCH_ERROR`
      }
      if (!is.null(this_object$`FETCH_INACTIVE_FEED_ERROR`)) {
        self$`FETCH_INACTIVE_FEED_ERROR` <- this_object$`FETCH_INACTIVE_FEED_ERROR`
      }
      if (!is.null(this_object$`ENCODING_ERROR`)) {
        self$`ENCODING_ERROR` <- this_object$`ENCODING_ERROR`
      }
      if (!is.null(this_object$`DELIMITER_ERROR`)) {
        self$`DELIMITER_ERROR` <- this_object$`DELIMITER_ERROR`
      }
      if (!is.null(this_object$`REQUIRED_COLUMNS_MISSING`)) {
        self$`REQUIRED_COLUMNS_MISSING` <- this_object$`REQUIRED_COLUMNS_MISSING`
      }
      if (!is.null(this_object$`DUPLICATE_PRODUCTS`)) {
        self$`DUPLICATE_PRODUCTS` <- this_object$`DUPLICATE_PRODUCTS`
      }
      if (!is.null(this_object$`IMAGE_LINK_INVALID`)) {
        self$`IMAGE_LINK_INVALID` <- this_object$`IMAGE_LINK_INVALID`
      }
      if (!is.null(this_object$`ITEMID_MISSING`)) {
        self$`ITEMID_MISSING` <- this_object$`ITEMID_MISSING`
      }
      if (!is.null(this_object$`TITLE_MISSING`)) {
        self$`TITLE_MISSING` <- this_object$`TITLE_MISSING`
      }
      if (!is.null(this_object$`DESCRIPTION_MISSING`)) {
        self$`DESCRIPTION_MISSING` <- this_object$`DESCRIPTION_MISSING`
      }
      if (!is.null(this_object$`PRODUCT_LINK_MISSING`)) {
        self$`PRODUCT_LINK_MISSING` <- this_object$`PRODUCT_LINK_MISSING`
      }
      if (!is.null(this_object$`IMAGE_LINK_MISSING`)) {
        self$`IMAGE_LINK_MISSING` <- this_object$`IMAGE_LINK_MISSING`
      }
      if (!is.null(this_object$`AVAILABILITY_INVALID`)) {
        self$`AVAILABILITY_INVALID` <- this_object$`AVAILABILITY_INVALID`
      }
      if (!is.null(this_object$`PRODUCT_PRICE_INVALID`)) {
        self$`PRODUCT_PRICE_INVALID` <- this_object$`PRODUCT_PRICE_INVALID`
      }
      if (!is.null(this_object$`LINK_FORMAT_INVALID`)) {
        self$`LINK_FORMAT_INVALID` <- this_object$`LINK_FORMAT_INVALID`
      }
      if (!is.null(this_object$`PARSE_LINE_ERROR`)) {
        self$`PARSE_LINE_ERROR` <- this_object$`PARSE_LINE_ERROR`
      }
      if (!is.null(this_object$`ADWORDS_FORMAT_INVALID`)) {
        self$`ADWORDS_FORMAT_INVALID` <- this_object$`ADWORDS_FORMAT_INVALID`
      }
      if (!is.null(this_object$`INTERNAL_SERVICE_ERROR`)) {
        self$`INTERNAL_SERVICE_ERROR` <- this_object$`INTERNAL_SERVICE_ERROR`
      }
      if (!is.null(this_object$`NO_VERIFIED_DOMAIN`)) {
        self$`NO_VERIFIED_DOMAIN` <- this_object$`NO_VERIFIED_DOMAIN`
      }
      if (!is.null(this_object$`ADULT_INVALID`)) {
        self$`ADULT_INVALID` <- this_object$`ADULT_INVALID`
      }
      if (!is.null(this_object$`IMAGE_LINK_LENGTH_TOO_LONG`)) {
        self$`IMAGE_LINK_LENGTH_TOO_LONG` <- this_object$`IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`INVALID_DOMAIN`)) {
        self$`INVALID_DOMAIN` <- this_object$`INVALID_DOMAIN`
      }
      if (!is.null(this_object$`FEED_LENGTH_TOO_LONG`)) {
        self$`FEED_LENGTH_TOO_LONG` <- this_object$`FEED_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`LINK_LENGTH_TOO_LONG`)) {
        self$`LINK_LENGTH_TOO_LONG` <- this_object$`LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`MALFORMED_XML`)) {
        self$`MALFORMED_XML` <- this_object$`MALFORMED_XML`
      }
      if (!is.null(this_object$`PRICE_MISSING`)) {
        self$`PRICE_MISSING` <- this_object$`PRICE_MISSING`
      }
      if (!is.null(this_object$`FEED_TOO_SMALL`)) {
        self$`FEED_TOO_SMALL` <- this_object$`FEED_TOO_SMALL`
      }
      if (!is.null(this_object$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
        self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` <- this_object$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`
      }
      if (!is.null(this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(this_object$`PINJOIN_CONTENT_UNSAFE`)) {
        self$`PINJOIN_CONTENT_UNSAFE` <- this_object$`PINJOIN_CONTENT_UNSAFE`
      }
      if (!is.null(this_object$`BLOCKLISTED_IMAGE_SIGNATURE`)) {
        self$`BLOCKLISTED_IMAGE_SIGNATURE` <- this_object$`BLOCKLISTED_IMAGE_SIGNATURE`
      }
      if (!is.null(this_object$`LIST_PRICE_INVALID`)) {
        self$`LIST_PRICE_INVALID` <- this_object$`LIST_PRICE_INVALID`
      }
      if (!is.null(this_object$`PRICE_CANNOT_BE_DETERMINED`)) {
        self$`PRICE_CANNOT_BE_DETERMINED` <- this_object$`PRICE_CANNOT_BE_DETERMINED`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedValidationErrors in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`FETCH_ERROR`)) {
          sprintf(
          '"FETCH_ERROR":
            %d
                    ',
          self$`FETCH_ERROR`
          )
        },
        if (!is.null(self$`FETCH_INACTIVE_FEED_ERROR`)) {
          sprintf(
          '"FETCH_INACTIVE_FEED_ERROR":
            %d
                    ',
          self$`FETCH_INACTIVE_FEED_ERROR`
          )
        },
        if (!is.null(self$`ENCODING_ERROR`)) {
          sprintf(
          '"ENCODING_ERROR":
            %d
                    ',
          self$`ENCODING_ERROR`
          )
        },
        if (!is.null(self$`DELIMITER_ERROR`)) {
          sprintf(
          '"DELIMITER_ERROR":
            %d
                    ',
          self$`DELIMITER_ERROR`
          )
        },
        if (!is.null(self$`REQUIRED_COLUMNS_MISSING`)) {
          sprintf(
          '"REQUIRED_COLUMNS_MISSING":
            %d
                    ',
          self$`REQUIRED_COLUMNS_MISSING`
          )
        },
        if (!is.null(self$`DUPLICATE_PRODUCTS`)) {
          sprintf(
          '"DUPLICATE_PRODUCTS":
            %d
                    ',
          self$`DUPLICATE_PRODUCTS`
          )
        },
        if (!is.null(self$`IMAGE_LINK_INVALID`)) {
          sprintf(
          '"IMAGE_LINK_INVALID":
            %d
                    ',
          self$`IMAGE_LINK_INVALID`
          )
        },
        if (!is.null(self$`ITEMID_MISSING`)) {
          sprintf(
          '"ITEMID_MISSING":
            %d
                    ',
          self$`ITEMID_MISSING`
          )
        },
        if (!is.null(self$`TITLE_MISSING`)) {
          sprintf(
          '"TITLE_MISSING":
            %d
                    ',
          self$`TITLE_MISSING`
          )
        },
        if (!is.null(self$`DESCRIPTION_MISSING`)) {
          sprintf(
          '"DESCRIPTION_MISSING":
            %d
                    ',
          self$`DESCRIPTION_MISSING`
          )
        },
        if (!is.null(self$`PRODUCT_LINK_MISSING`)) {
          sprintf(
          '"PRODUCT_LINK_MISSING":
            %d
                    ',
          self$`PRODUCT_LINK_MISSING`
          )
        },
        if (!is.null(self$`IMAGE_LINK_MISSING`)) {
          sprintf(
          '"IMAGE_LINK_MISSING":
            %d
                    ',
          self$`IMAGE_LINK_MISSING`
          )
        },
        if (!is.null(self$`AVAILABILITY_INVALID`)) {
          sprintf(
          '"AVAILABILITY_INVALID":
            %d
                    ',
          self$`AVAILABILITY_INVALID`
          )
        },
        if (!is.null(self$`PRODUCT_PRICE_INVALID`)) {
          sprintf(
          '"PRODUCT_PRICE_INVALID":
            %d
                    ',
          self$`PRODUCT_PRICE_INVALID`
          )
        },
        if (!is.null(self$`LINK_FORMAT_INVALID`)) {
          sprintf(
          '"LINK_FORMAT_INVALID":
            %d
                    ',
          self$`LINK_FORMAT_INVALID`
          )
        },
        if (!is.null(self$`PARSE_LINE_ERROR`)) {
          sprintf(
          '"PARSE_LINE_ERROR":
            %d
                    ',
          self$`PARSE_LINE_ERROR`
          )
        },
        if (!is.null(self$`ADWORDS_FORMAT_INVALID`)) {
          sprintf(
          '"ADWORDS_FORMAT_INVALID":
            %d
                    ',
          self$`ADWORDS_FORMAT_INVALID`
          )
        },
        if (!is.null(self$`INTERNAL_SERVICE_ERROR`)) {
          sprintf(
          '"INTERNAL_SERVICE_ERROR":
            %d
                    ',
          self$`INTERNAL_SERVICE_ERROR`
          )
        },
        if (!is.null(self$`NO_VERIFIED_DOMAIN`)) {
          sprintf(
          '"NO_VERIFIED_DOMAIN":
            %d
                    ',
          self$`NO_VERIFIED_DOMAIN`
          )
        },
        if (!is.null(self$`ADULT_INVALID`)) {
          sprintf(
          '"ADULT_INVALID":
            %d
                    ',
          self$`ADULT_INVALID`
          )
        },
        if (!is.null(self$`IMAGE_LINK_LENGTH_TOO_LONG`)) {
          sprintf(
          '"IMAGE_LINK_LENGTH_TOO_LONG":
            %d
                    ',
          self$`IMAGE_LINK_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`INVALID_DOMAIN`)) {
          sprintf(
          '"INVALID_DOMAIN":
            %d
                    ',
          self$`INVALID_DOMAIN`
          )
        },
        if (!is.null(self$`FEED_LENGTH_TOO_LONG`)) {
          sprintf(
          '"FEED_LENGTH_TOO_LONG":
            %d
                    ',
          self$`FEED_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`LINK_LENGTH_TOO_LONG`)) {
          sprintf(
          '"LINK_LENGTH_TOO_LONG":
            %d
                    ',
          self$`LINK_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`MALFORMED_XML`)) {
          sprintf(
          '"MALFORMED_XML":
            %d
                    ',
          self$`MALFORMED_XML`
          )
        },
        if (!is.null(self$`PRICE_MISSING`)) {
          sprintf(
          '"PRICE_MISSING":
            %d
                    ',
          self$`PRICE_MISSING`
          )
        },
        if (!is.null(self$`FEED_TOO_SMALL`)) {
          sprintf(
          '"FEED_TOO_SMALL":
            %d
                    ',
          self$`FEED_TOO_SMALL`
          )
        },
        if (!is.null(self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
          sprintf(
          '"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED":
            %d
                    ',
          self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`
          )
        },
        if (!is.null(self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
          sprintf(
          '"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE":
            %d
                    ',
          self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`
          )
        },
        if (!is.null(self$`PINJOIN_CONTENT_UNSAFE`)) {
          sprintf(
          '"PINJOIN_CONTENT_UNSAFE":
            %d
                    ',
          self$`PINJOIN_CONTENT_UNSAFE`
          )
        },
        if (!is.null(self$`BLOCKLISTED_IMAGE_SIGNATURE`)) {
          sprintf(
          '"BLOCKLISTED_IMAGE_SIGNATURE":
            %d
                    ',
          self$`BLOCKLISTED_IMAGE_SIGNATURE`
          )
        },
        if (!is.null(self$`LIST_PRICE_INVALID`)) {
          sprintf(
          '"LIST_PRICE_INVALID":
            %d
                    ',
          self$`LIST_PRICE_INVALID`
          )
        },
        if (!is.null(self$`PRICE_CANNOT_BE_DETERMINED`)) {
          sprintf(
          '"PRICE_CANNOT_BE_DETERMINED":
            %d
                    ',
          self$`PRICE_CANNOT_BE_DETERMINED`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedValidationErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedValidationErrors
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`FETCH_ERROR` <- this_object$`FETCH_ERROR`
      self$`FETCH_INACTIVE_FEED_ERROR` <- this_object$`FETCH_INACTIVE_FEED_ERROR`
      self$`ENCODING_ERROR` <- this_object$`ENCODING_ERROR`
      self$`DELIMITER_ERROR` <- this_object$`DELIMITER_ERROR`
      self$`REQUIRED_COLUMNS_MISSING` <- this_object$`REQUIRED_COLUMNS_MISSING`
      self$`DUPLICATE_PRODUCTS` <- this_object$`DUPLICATE_PRODUCTS`
      self$`IMAGE_LINK_INVALID` <- this_object$`IMAGE_LINK_INVALID`
      self$`ITEMID_MISSING` <- this_object$`ITEMID_MISSING`
      self$`TITLE_MISSING` <- this_object$`TITLE_MISSING`
      self$`DESCRIPTION_MISSING` <- this_object$`DESCRIPTION_MISSING`
      self$`PRODUCT_LINK_MISSING` <- this_object$`PRODUCT_LINK_MISSING`
      self$`IMAGE_LINK_MISSING` <- this_object$`IMAGE_LINK_MISSING`
      self$`AVAILABILITY_INVALID` <- this_object$`AVAILABILITY_INVALID`
      self$`PRODUCT_PRICE_INVALID` <- this_object$`PRODUCT_PRICE_INVALID`
      self$`LINK_FORMAT_INVALID` <- this_object$`LINK_FORMAT_INVALID`
      self$`PARSE_LINE_ERROR` <- this_object$`PARSE_LINE_ERROR`
      self$`ADWORDS_FORMAT_INVALID` <- this_object$`ADWORDS_FORMAT_INVALID`
      self$`INTERNAL_SERVICE_ERROR` <- this_object$`INTERNAL_SERVICE_ERROR`
      self$`NO_VERIFIED_DOMAIN` <- this_object$`NO_VERIFIED_DOMAIN`
      self$`ADULT_INVALID` <- this_object$`ADULT_INVALID`
      self$`IMAGE_LINK_LENGTH_TOO_LONG` <- this_object$`IMAGE_LINK_LENGTH_TOO_LONG`
      self$`INVALID_DOMAIN` <- this_object$`INVALID_DOMAIN`
      self$`FEED_LENGTH_TOO_LONG` <- this_object$`FEED_LENGTH_TOO_LONG`
      self$`LINK_LENGTH_TOO_LONG` <- this_object$`LINK_LENGTH_TOO_LONG`
      self$`MALFORMED_XML` <- this_object$`MALFORMED_XML`
      self$`PRICE_MISSING` <- this_object$`PRICE_MISSING`
      self$`FEED_TOO_SMALL` <- this_object$`FEED_TOO_SMALL`
      self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` <- this_object$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`
      self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`
      self$`PINJOIN_CONTENT_UNSAFE` <- this_object$`PINJOIN_CONTENT_UNSAFE`
      self$`BLOCKLISTED_IMAGE_SIGNATURE` <- this_object$`BLOCKLISTED_IMAGE_SIGNATURE`
      self$`LIST_PRICE_INVALID` <- this_object$`LIST_PRICE_INVALID`
      self$`PRICE_CANNOT_BE_DETERMINED` <- this_object$`PRICE_CANNOT_BE_DETERMINED`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedValidationErrors and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedValidationErrors
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsFeedValidationErrors$unlock()
#
## Below is an example to define the print function
# CatalogsFeedValidationErrors$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedValidationErrors$lock()

