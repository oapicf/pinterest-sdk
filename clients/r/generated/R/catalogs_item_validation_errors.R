#' Create a new CatalogsItemValidationErrors
#'
#' @description
#' CatalogsItemValidationErrors Class
#'
#' @docType class
#' @title CatalogsItemValidationErrors
#' @description CatalogsItemValidationErrors Class
#' @format An \code{R6Class} generator object
#' @field ADULT_INVALID Item has an invalid adult value. \link{CatalogsItemValidationDetails} [optional]
#' @field ADWORDS_FORMAT_INVALID Adword link contains too many characters. \link{CatalogsItemValidationDetails} [optional]
#' @field AVAILABILITY_INVALID Item is missing availability value in its product metadata, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field BLOCKLISTED_IMAGE_SIGNATURE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. \link{CatalogsItemValidationDetails} [optional]
#' @field DESCRIPTION_MISSING Item is missing description in its product metadata, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field DUPLICATE_PRODUCTS This product is duplicated. The duplicate entry will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field IMAGE_LINK_INVALID Image link is invalid. \link{CatalogsItemValidationDetails} [optional]
#' @field IMAGE_LINK_LENGTH_TOO_LONG Item has image_link URL that contains too many characters, so the item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field IMAGE_LINK_MISSING Item is missing an image link URL in its product metadata, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field INVALID_DOMAIN Product link value doesn't match the verified domain associated with this account. \link{CatalogsItemValidationDetails} [optional]
#' @field ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Main image can't be found. \link{CatalogsItemValidationDetails} [optional]
#' @field ITEMID_MISSING Item is missing item id in its product metadata, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field LINK_FORMAT_INVALID Link is invalid. \link{CatalogsItemValidationDetails} [optional]
#' @field LINK_LENGTH_TOO_LONG Product link contains too many characters, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field LIST_PRICE_INVALID Item has a list price formatting error, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Item exceed the maximum number of items per item group, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field PARSE_LINE_ERROR Item contains formating errors. \link{CatalogsItemValidationDetails} [optional]
#' @field PINJOIN_CONTENT_UNSAFE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. \link{CatalogsItemValidationDetails} [optional]
#' @field PRICE_CANNOT_BE_DETERMINED Item price cannot be determined because the price, list price, and sale price are all different. \link{CatalogsItemValidationDetails} [optional]
#' @field PRICE_MISSING Product is missing a price, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field PRODUCT_LINK_MISSING Item is missing a link URL in its product metadata, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field PRODUCT_PRICE_INVALID Item has a price formatting error in its product metadata, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @field TITLE_MISSING Item is missing title in its product metadata, this item will not be published. \link{CatalogsItemValidationDetails} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemValidationErrors <- R6::R6Class(
  "CatalogsItemValidationErrors",
  public = list(
    `ADULT_INVALID` = NULL,
    `ADWORDS_FORMAT_INVALID` = NULL,
    `AVAILABILITY_INVALID` = NULL,
    `BLOCKLISTED_IMAGE_SIGNATURE` = NULL,
    `DESCRIPTION_MISSING` = NULL,
    `DUPLICATE_PRODUCTS` = NULL,
    `IMAGE_LINK_INVALID` = NULL,
    `IMAGE_LINK_LENGTH_TOO_LONG` = NULL,
    `IMAGE_LINK_MISSING` = NULL,
    `INVALID_DOMAIN` = NULL,
    `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` = NULL,
    `ITEMID_MISSING` = NULL,
    `LINK_FORMAT_INVALID` = NULL,
    `LINK_LENGTH_TOO_LONG` = NULL,
    `LIST_PRICE_INVALID` = NULL,
    `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` = NULL,
    `PARSE_LINE_ERROR` = NULL,
    `PINJOIN_CONTENT_UNSAFE` = NULL,
    `PRICE_CANNOT_BE_DETERMINED` = NULL,
    `PRICE_MISSING` = NULL,
    `PRODUCT_LINK_MISSING` = NULL,
    `PRODUCT_PRICE_INVALID` = NULL,
    `TITLE_MISSING` = NULL,

    #' @description
    #' Initialize a new CatalogsItemValidationErrors class.
    #'
    #' @param ADULT_INVALID Item has an invalid adult value.
    #' @param ADWORDS_FORMAT_INVALID Adword link contains too many characters.
    #' @param AVAILABILITY_INVALID Item is missing availability value in its product metadata, this item will not be published.
    #' @param BLOCKLISTED_IMAGE_SIGNATURE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
    #' @param DESCRIPTION_MISSING Item is missing description in its product metadata, this item will not be published.
    #' @param DUPLICATE_PRODUCTS This product is duplicated. The duplicate entry will not be published.
    #' @param IMAGE_LINK_INVALID Image link is invalid.
    #' @param IMAGE_LINK_LENGTH_TOO_LONG Item has image_link URL that contains too many characters, so the item will not be published.
    #' @param IMAGE_LINK_MISSING Item is missing an image link URL in its product metadata, this item will not be published.
    #' @param INVALID_DOMAIN Product link value doesn't match the verified domain associated with this account.
    #' @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Main image can't be found.
    #' @param ITEMID_MISSING Item is missing item id in its product metadata, this item will not be published.
    #' @param LINK_FORMAT_INVALID Link is invalid.
    #' @param LINK_LENGTH_TOO_LONG Product link contains too many characters, this item will not be published.
    #' @param LIST_PRICE_INVALID Item has a list price formatting error, this item will not be published.
    #' @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Item exceed the maximum number of items per item group, this item will not be published.
    #' @param PARSE_LINE_ERROR Item contains formating errors.
    #' @param PINJOIN_CONTENT_UNSAFE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
    #' @param PRICE_CANNOT_BE_DETERMINED Item price cannot be determined because the price, list price, and sale price are all different.
    #' @param PRICE_MISSING Product is missing a price, this item will not be published.
    #' @param PRODUCT_LINK_MISSING Item is missing a link URL in its product metadata, this item will not be published.
    #' @param PRODUCT_PRICE_INVALID Item has a price formatting error in its product metadata, this item will not be published.
    #' @param TITLE_MISSING Item is missing title in its product metadata, this item will not be published.
    #' @param ... Other optional arguments.
    initialize = function(`ADULT_INVALID` = NULL, `ADWORDS_FORMAT_INVALID` = NULL, `AVAILABILITY_INVALID` = NULL, `BLOCKLISTED_IMAGE_SIGNATURE` = NULL, `DESCRIPTION_MISSING` = NULL, `DUPLICATE_PRODUCTS` = NULL, `IMAGE_LINK_INVALID` = NULL, `IMAGE_LINK_LENGTH_TOO_LONG` = NULL, `IMAGE_LINK_MISSING` = NULL, `INVALID_DOMAIN` = NULL, `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` = NULL, `ITEMID_MISSING` = NULL, `LINK_FORMAT_INVALID` = NULL, `LINK_LENGTH_TOO_LONG` = NULL, `LIST_PRICE_INVALID` = NULL, `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` = NULL, `PARSE_LINE_ERROR` = NULL, `PINJOIN_CONTENT_UNSAFE` = NULL, `PRICE_CANNOT_BE_DETERMINED` = NULL, `PRICE_MISSING` = NULL, `PRODUCT_LINK_MISSING` = NULL, `PRODUCT_PRICE_INVALID` = NULL, `TITLE_MISSING` = NULL, ...) {
      if (!is.null(`ADULT_INVALID`)) {
        stopifnot(R6::is.R6(`ADULT_INVALID`))
        self$`ADULT_INVALID` <- `ADULT_INVALID`
      }
      if (!is.null(`ADWORDS_FORMAT_INVALID`)) {
        stopifnot(R6::is.R6(`ADWORDS_FORMAT_INVALID`))
        self$`ADWORDS_FORMAT_INVALID` <- `ADWORDS_FORMAT_INVALID`
      }
      if (!is.null(`AVAILABILITY_INVALID`)) {
        stopifnot(R6::is.R6(`AVAILABILITY_INVALID`))
        self$`AVAILABILITY_INVALID` <- `AVAILABILITY_INVALID`
      }
      if (!is.null(`BLOCKLISTED_IMAGE_SIGNATURE`)) {
        stopifnot(R6::is.R6(`BLOCKLISTED_IMAGE_SIGNATURE`))
        self$`BLOCKLISTED_IMAGE_SIGNATURE` <- `BLOCKLISTED_IMAGE_SIGNATURE`
      }
      if (!is.null(`DESCRIPTION_MISSING`)) {
        stopifnot(R6::is.R6(`DESCRIPTION_MISSING`))
        self$`DESCRIPTION_MISSING` <- `DESCRIPTION_MISSING`
      }
      if (!is.null(`DUPLICATE_PRODUCTS`)) {
        stopifnot(R6::is.R6(`DUPLICATE_PRODUCTS`))
        self$`DUPLICATE_PRODUCTS` <- `DUPLICATE_PRODUCTS`
      }
      if (!is.null(`IMAGE_LINK_INVALID`)) {
        stopifnot(R6::is.R6(`IMAGE_LINK_INVALID`))
        self$`IMAGE_LINK_INVALID` <- `IMAGE_LINK_INVALID`
      }
      if (!is.null(`IMAGE_LINK_LENGTH_TOO_LONG`)) {
        stopifnot(R6::is.R6(`IMAGE_LINK_LENGTH_TOO_LONG`))
        self$`IMAGE_LINK_LENGTH_TOO_LONG` <- `IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(`IMAGE_LINK_MISSING`)) {
        stopifnot(R6::is.R6(`IMAGE_LINK_MISSING`))
        self$`IMAGE_LINK_MISSING` <- `IMAGE_LINK_MISSING`
      }
      if (!is.null(`INVALID_DOMAIN`)) {
        stopifnot(R6::is.R6(`INVALID_DOMAIN`))
        self$`INVALID_DOMAIN` <- `INVALID_DOMAIN`
      }
      if (!is.null(`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        stopifnot(R6::is.R6(`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`))
        self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(`ITEMID_MISSING`)) {
        stopifnot(R6::is.R6(`ITEMID_MISSING`))
        self$`ITEMID_MISSING` <- `ITEMID_MISSING`
      }
      if (!is.null(`LINK_FORMAT_INVALID`)) {
        stopifnot(R6::is.R6(`LINK_FORMAT_INVALID`))
        self$`LINK_FORMAT_INVALID` <- `LINK_FORMAT_INVALID`
      }
      if (!is.null(`LINK_LENGTH_TOO_LONG`)) {
        stopifnot(R6::is.R6(`LINK_LENGTH_TOO_LONG`))
        self$`LINK_LENGTH_TOO_LONG` <- `LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(`LIST_PRICE_INVALID`)) {
        stopifnot(R6::is.R6(`LIST_PRICE_INVALID`))
        self$`LIST_PRICE_INVALID` <- `LIST_PRICE_INVALID`
      }
      if (!is.null(`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
        stopifnot(R6::is.R6(`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`))
        self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` <- `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`
      }
      if (!is.null(`PARSE_LINE_ERROR`)) {
        stopifnot(R6::is.R6(`PARSE_LINE_ERROR`))
        self$`PARSE_LINE_ERROR` <- `PARSE_LINE_ERROR`
      }
      if (!is.null(`PINJOIN_CONTENT_UNSAFE`)) {
        stopifnot(R6::is.R6(`PINJOIN_CONTENT_UNSAFE`))
        self$`PINJOIN_CONTENT_UNSAFE` <- `PINJOIN_CONTENT_UNSAFE`
      }
      if (!is.null(`PRICE_CANNOT_BE_DETERMINED`)) {
        stopifnot(R6::is.R6(`PRICE_CANNOT_BE_DETERMINED`))
        self$`PRICE_CANNOT_BE_DETERMINED` <- `PRICE_CANNOT_BE_DETERMINED`
      }
      if (!is.null(`PRICE_MISSING`)) {
        stopifnot(R6::is.R6(`PRICE_MISSING`))
        self$`PRICE_MISSING` <- `PRICE_MISSING`
      }
      if (!is.null(`PRODUCT_LINK_MISSING`)) {
        stopifnot(R6::is.R6(`PRODUCT_LINK_MISSING`))
        self$`PRODUCT_LINK_MISSING` <- `PRODUCT_LINK_MISSING`
      }
      if (!is.null(`PRODUCT_PRICE_INVALID`)) {
        stopifnot(R6::is.R6(`PRODUCT_PRICE_INVALID`))
        self$`PRODUCT_PRICE_INVALID` <- `PRODUCT_PRICE_INVALID`
      }
      if (!is.null(`TITLE_MISSING`)) {
        stopifnot(R6::is.R6(`TITLE_MISSING`))
        self$`TITLE_MISSING` <- `TITLE_MISSING`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CatalogsItemValidationErrors as a base R list.
    #' @examples
    #' # convert array of CatalogsItemValidationErrors (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsItemValidationErrors to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsItemValidationErrorsObject <- list()
      if (!is.null(self$`ADULT_INVALID`)) {
        CatalogsItemValidationErrorsObject[["ADULT_INVALID"]] <-
          self$extractSimpleType(self$`ADULT_INVALID`)
      }
      if (!is.null(self$`ADWORDS_FORMAT_INVALID`)) {
        CatalogsItemValidationErrorsObject[["ADWORDS_FORMAT_INVALID"]] <-
          self$extractSimpleType(self$`ADWORDS_FORMAT_INVALID`)
      }
      if (!is.null(self$`AVAILABILITY_INVALID`)) {
        CatalogsItemValidationErrorsObject[["AVAILABILITY_INVALID"]] <-
          self$extractSimpleType(self$`AVAILABILITY_INVALID`)
      }
      if (!is.null(self$`BLOCKLISTED_IMAGE_SIGNATURE`)) {
        CatalogsItemValidationErrorsObject[["BLOCKLISTED_IMAGE_SIGNATURE"]] <-
          self$extractSimpleType(self$`BLOCKLISTED_IMAGE_SIGNATURE`)
      }
      if (!is.null(self$`DESCRIPTION_MISSING`)) {
        CatalogsItemValidationErrorsObject[["DESCRIPTION_MISSING"]] <-
          self$extractSimpleType(self$`DESCRIPTION_MISSING`)
      }
      if (!is.null(self$`DUPLICATE_PRODUCTS`)) {
        CatalogsItemValidationErrorsObject[["DUPLICATE_PRODUCTS"]] <-
          self$extractSimpleType(self$`DUPLICATE_PRODUCTS`)
      }
      if (!is.null(self$`IMAGE_LINK_INVALID`)) {
        CatalogsItemValidationErrorsObject[["IMAGE_LINK_INVALID"]] <-
          self$extractSimpleType(self$`IMAGE_LINK_INVALID`)
      }
      if (!is.null(self$`IMAGE_LINK_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationErrorsObject[["IMAGE_LINK_LENGTH_TOO_LONG"]] <-
          self$extractSimpleType(self$`IMAGE_LINK_LENGTH_TOO_LONG`)
      }
      if (!is.null(self$`IMAGE_LINK_MISSING`)) {
        CatalogsItemValidationErrorsObject[["IMAGE_LINK_MISSING"]] <-
          self$extractSimpleType(self$`IMAGE_LINK_MISSING`)
      }
      if (!is.null(self$`INVALID_DOMAIN`)) {
        CatalogsItemValidationErrorsObject[["INVALID_DOMAIN"]] <-
          self$extractSimpleType(self$`INVALID_DOMAIN`)
      }
      if (!is.null(self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        CatalogsItemValidationErrorsObject[["ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"]] <-
          self$extractSimpleType(self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)
      }
      if (!is.null(self$`ITEMID_MISSING`)) {
        CatalogsItemValidationErrorsObject[["ITEMID_MISSING"]] <-
          self$extractSimpleType(self$`ITEMID_MISSING`)
      }
      if (!is.null(self$`LINK_FORMAT_INVALID`)) {
        CatalogsItemValidationErrorsObject[["LINK_FORMAT_INVALID"]] <-
          self$extractSimpleType(self$`LINK_FORMAT_INVALID`)
      }
      if (!is.null(self$`LINK_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationErrorsObject[["LINK_LENGTH_TOO_LONG"]] <-
          self$extractSimpleType(self$`LINK_LENGTH_TOO_LONG`)
      }
      if (!is.null(self$`LIST_PRICE_INVALID`)) {
        CatalogsItemValidationErrorsObject[["LIST_PRICE_INVALID"]] <-
          self$extractSimpleType(self$`LIST_PRICE_INVALID`)
      }
      if (!is.null(self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
        CatalogsItemValidationErrorsObject[["MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"]] <-
          self$extractSimpleType(self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)
      }
      if (!is.null(self$`PARSE_LINE_ERROR`)) {
        CatalogsItemValidationErrorsObject[["PARSE_LINE_ERROR"]] <-
          self$extractSimpleType(self$`PARSE_LINE_ERROR`)
      }
      if (!is.null(self$`PINJOIN_CONTENT_UNSAFE`)) {
        CatalogsItemValidationErrorsObject[["PINJOIN_CONTENT_UNSAFE"]] <-
          self$extractSimpleType(self$`PINJOIN_CONTENT_UNSAFE`)
      }
      if (!is.null(self$`PRICE_CANNOT_BE_DETERMINED`)) {
        CatalogsItemValidationErrorsObject[["PRICE_CANNOT_BE_DETERMINED"]] <-
          self$extractSimpleType(self$`PRICE_CANNOT_BE_DETERMINED`)
      }
      if (!is.null(self$`PRICE_MISSING`)) {
        CatalogsItemValidationErrorsObject[["PRICE_MISSING"]] <-
          self$extractSimpleType(self$`PRICE_MISSING`)
      }
      if (!is.null(self$`PRODUCT_LINK_MISSING`)) {
        CatalogsItemValidationErrorsObject[["PRODUCT_LINK_MISSING"]] <-
          self$extractSimpleType(self$`PRODUCT_LINK_MISSING`)
      }
      if (!is.null(self$`PRODUCT_PRICE_INVALID`)) {
        CatalogsItemValidationErrorsObject[["PRODUCT_PRICE_INVALID"]] <-
          self$extractSimpleType(self$`PRODUCT_PRICE_INVALID`)
      }
      if (!is.null(self$`TITLE_MISSING`)) {
        CatalogsItemValidationErrorsObject[["TITLE_MISSING"]] <-
          self$extractSimpleType(self$`TITLE_MISSING`)
      }
      return(CatalogsItemValidationErrorsObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationErrors
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ADULT_INVALID`)) {
        `adult_invalid_object` <- CatalogsItemValidationDetails$new()
        `adult_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`ADULT_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`ADULT_INVALID` <- `adult_invalid_object`
      }
      if (!is.null(this_object$`ADWORDS_FORMAT_INVALID`)) {
        `adwords_format_invalid_object` <- CatalogsItemValidationDetails$new()
        `adwords_format_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`ADWORDS_FORMAT_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`ADWORDS_FORMAT_INVALID` <- `adwords_format_invalid_object`
      }
      if (!is.null(this_object$`AVAILABILITY_INVALID`)) {
        `availability_invalid_object` <- CatalogsItemValidationDetails$new()
        `availability_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`AVAILABILITY_INVALID` <- `availability_invalid_object`
      }
      if (!is.null(this_object$`BLOCKLISTED_IMAGE_SIGNATURE`)) {
        `blocklisted_image_signature_object` <- CatalogsItemValidationDetails$new()
        `blocklisted_image_signature_object`$fromJSON(jsonlite::toJSON(this_object$`BLOCKLISTED_IMAGE_SIGNATURE`, auto_unbox = TRUE, digits = NA))
        self$`BLOCKLISTED_IMAGE_SIGNATURE` <- `blocklisted_image_signature_object`
      }
      if (!is.null(this_object$`DESCRIPTION_MISSING`)) {
        `description_missing_object` <- CatalogsItemValidationDetails$new()
        `description_missing_object`$fromJSON(jsonlite::toJSON(this_object$`DESCRIPTION_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`DESCRIPTION_MISSING` <- `description_missing_object`
      }
      if (!is.null(this_object$`DUPLICATE_PRODUCTS`)) {
        `duplicate_products_object` <- CatalogsItemValidationDetails$new()
        `duplicate_products_object`$fromJSON(jsonlite::toJSON(this_object$`DUPLICATE_PRODUCTS`, auto_unbox = TRUE, digits = NA))
        self$`DUPLICATE_PRODUCTS` <- `duplicate_products_object`
      }
      if (!is.null(this_object$`IMAGE_LINK_INVALID`)) {
        `image_link_invalid_object` <- CatalogsItemValidationDetails$new()
        `image_link_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`IMAGE_LINK_INVALID` <- `image_link_invalid_object`
      }
      if (!is.null(this_object$`IMAGE_LINK_LENGTH_TOO_LONG`)) {
        `image_link_length_too_long_object` <- CatalogsItemValidationDetails$new()
        `image_link_length_too_long_object`$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
        self$`IMAGE_LINK_LENGTH_TOO_LONG` <- `image_link_length_too_long_object`
      }
      if (!is.null(this_object$`IMAGE_LINK_MISSING`)) {
        `image_link_missing_object` <- CatalogsItemValidationDetails$new()
        `image_link_missing_object`$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`IMAGE_LINK_MISSING` <- `image_link_missing_object`
      }
      if (!is.null(this_object$`INVALID_DOMAIN`)) {
        `invalid_domain_object` <- CatalogsItemValidationDetails$new()
        `invalid_domain_object`$fromJSON(jsonlite::toJSON(this_object$`INVALID_DOMAIN`, auto_unbox = TRUE, digits = NA))
        self$`INVALID_DOMAIN` <- `invalid_domain_object`
      }
      if (!is.null(this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        `item_main_image_download_failure_object` <- CatalogsItemValidationDetails$new()
        `item_main_image_download_failure_object`$fromJSON(jsonlite::toJSON(this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`, auto_unbox = TRUE, digits = NA))
        self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- `item_main_image_download_failure_object`
      }
      if (!is.null(this_object$`ITEMID_MISSING`)) {
        `itemid_missing_object` <- CatalogsItemValidationDetails$new()
        `itemid_missing_object`$fromJSON(jsonlite::toJSON(this_object$`ITEMID_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`ITEMID_MISSING` <- `itemid_missing_object`
      }
      if (!is.null(this_object$`LINK_FORMAT_INVALID`)) {
        `link_format_invalid_object` <- CatalogsItemValidationDetails$new()
        `link_format_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`LINK_FORMAT_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`LINK_FORMAT_INVALID` <- `link_format_invalid_object`
      }
      if (!is.null(this_object$`LINK_LENGTH_TOO_LONG`)) {
        `link_length_too_long_object` <- CatalogsItemValidationDetails$new()
        `link_length_too_long_object`$fromJSON(jsonlite::toJSON(this_object$`LINK_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
        self$`LINK_LENGTH_TOO_LONG` <- `link_length_too_long_object`
      }
      if (!is.null(this_object$`LIST_PRICE_INVALID`)) {
        `list_price_invalid_object` <- CatalogsItemValidationDetails$new()
        `list_price_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`LIST_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`LIST_PRICE_INVALID` <- `list_price_invalid_object`
      }
      if (!is.null(this_object$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
        `max_items_per_item_group_exceeded_object` <- CatalogsItemValidationDetails$new()
        `max_items_per_item_group_exceeded_object`$fromJSON(jsonlite::toJSON(this_object$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`, auto_unbox = TRUE, digits = NA))
        self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` <- `max_items_per_item_group_exceeded_object`
      }
      if (!is.null(this_object$`PARSE_LINE_ERROR`)) {
        `parse_line_error_object` <- CatalogsItemValidationDetails$new()
        `parse_line_error_object`$fromJSON(jsonlite::toJSON(this_object$`PARSE_LINE_ERROR`, auto_unbox = TRUE, digits = NA))
        self$`PARSE_LINE_ERROR` <- `parse_line_error_object`
      }
      if (!is.null(this_object$`PINJOIN_CONTENT_UNSAFE`)) {
        `pinjoin_content_unsafe_object` <- CatalogsItemValidationDetails$new()
        `pinjoin_content_unsafe_object`$fromJSON(jsonlite::toJSON(this_object$`PINJOIN_CONTENT_UNSAFE`, auto_unbox = TRUE, digits = NA))
        self$`PINJOIN_CONTENT_UNSAFE` <- `pinjoin_content_unsafe_object`
      }
      if (!is.null(this_object$`PRICE_CANNOT_BE_DETERMINED`)) {
        `price_cannot_be_determined_object` <- CatalogsItemValidationDetails$new()
        `price_cannot_be_determined_object`$fromJSON(jsonlite::toJSON(this_object$`PRICE_CANNOT_BE_DETERMINED`, auto_unbox = TRUE, digits = NA))
        self$`PRICE_CANNOT_BE_DETERMINED` <- `price_cannot_be_determined_object`
      }
      if (!is.null(this_object$`PRICE_MISSING`)) {
        `price_missing_object` <- CatalogsItemValidationDetails$new()
        `price_missing_object`$fromJSON(jsonlite::toJSON(this_object$`PRICE_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`PRICE_MISSING` <- `price_missing_object`
      }
      if (!is.null(this_object$`PRODUCT_LINK_MISSING`)) {
        `product_link_missing_object` <- CatalogsItemValidationDetails$new()
        `product_link_missing_object`$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_LINK_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_LINK_MISSING` <- `product_link_missing_object`
      }
      if (!is.null(this_object$`PRODUCT_PRICE_INVALID`)) {
        `product_price_invalid_object` <- CatalogsItemValidationDetails$new()
        `product_price_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_PRICE_INVALID` <- `product_price_invalid_object`
      }
      if (!is.null(this_object$`TITLE_MISSING`)) {
        `title_missing_object` <- CatalogsItemValidationDetails$new()
        `title_missing_object`$fromJSON(jsonlite::toJSON(this_object$`TITLE_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`TITLE_MISSING` <- `title_missing_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsItemValidationErrors in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationErrors
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ADULT_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ADULT_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`ADWORDS_FORMAT_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ADWORDS_FORMAT_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`AVAILABILITY_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`BLOCKLISTED_IMAGE_SIGNATURE` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`BLOCKLISTED_IMAGE_SIGNATURE`, auto_unbox = TRUE, digits = NA))
      self$`DESCRIPTION_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`DESCRIPTION_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`DUPLICATE_PRODUCTS` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`DUPLICATE_PRODUCTS`, auto_unbox = TRUE, digits = NA))
      self$`IMAGE_LINK_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`IMAGE_LINK_LENGTH_TOO_LONG` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
      self$`IMAGE_LINK_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`INVALID_DOMAIN` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`INVALID_DOMAIN`, auto_unbox = TRUE, digits = NA))
      self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`, auto_unbox = TRUE, digits = NA))
      self$`ITEMID_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ITEMID_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`LINK_FORMAT_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`LINK_FORMAT_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`LINK_LENGTH_TOO_LONG` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`LINK_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
      self$`LIST_PRICE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`LIST_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`, auto_unbox = TRUE, digits = NA))
      self$`PARSE_LINE_ERROR` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PARSE_LINE_ERROR`, auto_unbox = TRUE, digits = NA))
      self$`PINJOIN_CONTENT_UNSAFE` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PINJOIN_CONTENT_UNSAFE`, auto_unbox = TRUE, digits = NA))
      self$`PRICE_CANNOT_BE_DETERMINED` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PRICE_CANNOT_BE_DETERMINED`, auto_unbox = TRUE, digits = NA))
      self$`PRICE_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PRICE_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`PRODUCT_LINK_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_LINK_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`PRODUCT_PRICE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`TITLE_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`TITLE_MISSING`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsItemValidationErrors and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemValidationErrors
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
# CatalogsItemValidationErrors$unlock()
#
## Below is an example to define the print function
# CatalogsItemValidationErrors$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemValidationErrors$lock()

