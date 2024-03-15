#' Create a new CatalogsItemValidationErrors
#'
#' @description
#' CatalogsItemValidationErrors Class
#'
#' @docType class
#' @title CatalogsItemValidationErrors
#' @description CatalogsItemValidationErrors Class
#' @format An \code{R6Class} generator object
#' @field ADULT_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field ADWORDS_FORMAT_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field AVAILABILITY_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field BLOCKLISTED_IMAGE_SIGNATURE  \link{CatalogsItemValidationDetails} [optional]
#' @field DESCRIPTION_MISSING  \link{CatalogsItemValidationDetails} [optional]
#' @field DUPLICATE_PRODUCTS  \link{CatalogsItemValidationDetails} [optional]
#' @field IMAGE_LINK_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field IMAGE_LINK_LENGTH_TOO_LONG  \link{CatalogsItemValidationDetails} [optional]
#' @field IMAGE_LINK_MISSING  \link{CatalogsItemValidationDetails} [optional]
#' @field INVALID_DOMAIN  \link{CatalogsItemValidationDetails} [optional]
#' @field ITEMID_MISSING  \link{CatalogsItemValidationDetails} [optional]
#' @field ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE  \link{CatalogsItemValidationDetails} [optional]
#' @field LINK_FORMAT_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field LINK_LENGTH_TOO_LONG  \link{CatalogsItemValidationDetails} [optional]
#' @field LIST_PRICE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED  \link{CatalogsItemValidationDetails} [optional]
#' @field PARSE_LINE_ERROR  \link{CatalogsItemValidationDetails} [optional]
#' @field PINJOIN_CONTENT_UNSAFE  \link{CatalogsItemValidationDetails} [optional]
#' @field PRICE_CANNOT_BE_DETERMINED  \link{CatalogsItemValidationDetails} [optional]
#' @field PRICE_MISSING  \link{CatalogsItemValidationDetails} [optional]
#' @field PRODUCT_LINK_MISSING  \link{CatalogsItemValidationDetails} [optional]
#' @field PRODUCT_PRICE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field TITLE_MISSING  \link{CatalogsItemValidationDetails} [optional]
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
    `ITEMID_MISSING` = NULL,
    `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` = NULL,
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
    #' Initialize a new CatalogsItemValidationErrors class.
    #'
    #' @description
    #' Initialize a new CatalogsItemValidationErrors class.
    #'
    #' @param ADULT_INVALID ADULT_INVALID
    #' @param ADWORDS_FORMAT_INVALID ADWORDS_FORMAT_INVALID
    #' @param AVAILABILITY_INVALID AVAILABILITY_INVALID
    #' @param BLOCKLISTED_IMAGE_SIGNATURE BLOCKLISTED_IMAGE_SIGNATURE
    #' @param DESCRIPTION_MISSING DESCRIPTION_MISSING
    #' @param DUPLICATE_PRODUCTS DUPLICATE_PRODUCTS
    #' @param IMAGE_LINK_INVALID IMAGE_LINK_INVALID
    #' @param IMAGE_LINK_LENGTH_TOO_LONG IMAGE_LINK_LENGTH_TOO_LONG
    #' @param IMAGE_LINK_MISSING IMAGE_LINK_MISSING
    #' @param INVALID_DOMAIN INVALID_DOMAIN
    #' @param ITEMID_MISSING ITEMID_MISSING
    #' @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
    #' @param LINK_FORMAT_INVALID LINK_FORMAT_INVALID
    #' @param LINK_LENGTH_TOO_LONG LINK_LENGTH_TOO_LONG
    #' @param LIST_PRICE_INVALID LIST_PRICE_INVALID
    #' @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
    #' @param PARSE_LINE_ERROR PARSE_LINE_ERROR
    #' @param PINJOIN_CONTENT_UNSAFE PINJOIN_CONTENT_UNSAFE
    #' @param PRICE_CANNOT_BE_DETERMINED PRICE_CANNOT_BE_DETERMINED
    #' @param PRICE_MISSING PRICE_MISSING
    #' @param PRODUCT_LINK_MISSING PRODUCT_LINK_MISSING
    #' @param PRODUCT_PRICE_INVALID PRODUCT_PRICE_INVALID
    #' @param TITLE_MISSING TITLE_MISSING
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ADULT_INVALID` = NULL, `ADWORDS_FORMAT_INVALID` = NULL, `AVAILABILITY_INVALID` = NULL, `BLOCKLISTED_IMAGE_SIGNATURE` = NULL, `DESCRIPTION_MISSING` = NULL, `DUPLICATE_PRODUCTS` = NULL, `IMAGE_LINK_INVALID` = NULL, `IMAGE_LINK_LENGTH_TOO_LONG` = NULL, `IMAGE_LINK_MISSING` = NULL, `INVALID_DOMAIN` = NULL, `ITEMID_MISSING` = NULL, `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` = NULL, `LINK_FORMAT_INVALID` = NULL, `LINK_LENGTH_TOO_LONG` = NULL, `LIST_PRICE_INVALID` = NULL, `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` = NULL, `PARSE_LINE_ERROR` = NULL, `PINJOIN_CONTENT_UNSAFE` = NULL, `PRICE_CANNOT_BE_DETERMINED` = NULL, `PRICE_MISSING` = NULL, `PRODUCT_LINK_MISSING` = NULL, `PRODUCT_PRICE_INVALID` = NULL, `TITLE_MISSING` = NULL, ...) {
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
      if (!is.null(`ITEMID_MISSING`)) {
        stopifnot(R6::is.R6(`ITEMID_MISSING`))
        self$`ITEMID_MISSING` <- `ITEMID_MISSING`
      }
      if (!is.null(`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        stopifnot(R6::is.R6(`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`))
        self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationErrors in JSON format
    #' @export
    toJSON = function() {
      CatalogsItemValidationErrorsObject <- list()
      if (!is.null(self$`ADULT_INVALID`)) {
        CatalogsItemValidationErrorsObject[["ADULT_INVALID"]] <-
          self$`ADULT_INVALID`$toJSON()
      }
      if (!is.null(self$`ADWORDS_FORMAT_INVALID`)) {
        CatalogsItemValidationErrorsObject[["ADWORDS_FORMAT_INVALID"]] <-
          self$`ADWORDS_FORMAT_INVALID`$toJSON()
      }
      if (!is.null(self$`AVAILABILITY_INVALID`)) {
        CatalogsItemValidationErrorsObject[["AVAILABILITY_INVALID"]] <-
          self$`AVAILABILITY_INVALID`$toJSON()
      }
      if (!is.null(self$`BLOCKLISTED_IMAGE_SIGNATURE`)) {
        CatalogsItemValidationErrorsObject[["BLOCKLISTED_IMAGE_SIGNATURE"]] <-
          self$`BLOCKLISTED_IMAGE_SIGNATURE`$toJSON()
      }
      if (!is.null(self$`DESCRIPTION_MISSING`)) {
        CatalogsItemValidationErrorsObject[["DESCRIPTION_MISSING"]] <-
          self$`DESCRIPTION_MISSING`$toJSON()
      }
      if (!is.null(self$`DUPLICATE_PRODUCTS`)) {
        CatalogsItemValidationErrorsObject[["DUPLICATE_PRODUCTS"]] <-
          self$`DUPLICATE_PRODUCTS`$toJSON()
      }
      if (!is.null(self$`IMAGE_LINK_INVALID`)) {
        CatalogsItemValidationErrorsObject[["IMAGE_LINK_INVALID"]] <-
          self$`IMAGE_LINK_INVALID`$toJSON()
      }
      if (!is.null(self$`IMAGE_LINK_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationErrorsObject[["IMAGE_LINK_LENGTH_TOO_LONG"]] <-
          self$`IMAGE_LINK_LENGTH_TOO_LONG`$toJSON()
      }
      if (!is.null(self$`IMAGE_LINK_MISSING`)) {
        CatalogsItemValidationErrorsObject[["IMAGE_LINK_MISSING"]] <-
          self$`IMAGE_LINK_MISSING`$toJSON()
      }
      if (!is.null(self$`INVALID_DOMAIN`)) {
        CatalogsItemValidationErrorsObject[["INVALID_DOMAIN"]] <-
          self$`INVALID_DOMAIN`$toJSON()
      }
      if (!is.null(self$`ITEMID_MISSING`)) {
        CatalogsItemValidationErrorsObject[["ITEMID_MISSING"]] <-
          self$`ITEMID_MISSING`$toJSON()
      }
      if (!is.null(self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        CatalogsItemValidationErrorsObject[["ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"]] <-
          self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`$toJSON()
      }
      if (!is.null(self$`LINK_FORMAT_INVALID`)) {
        CatalogsItemValidationErrorsObject[["LINK_FORMAT_INVALID"]] <-
          self$`LINK_FORMAT_INVALID`$toJSON()
      }
      if (!is.null(self$`LINK_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationErrorsObject[["LINK_LENGTH_TOO_LONG"]] <-
          self$`LINK_LENGTH_TOO_LONG`$toJSON()
      }
      if (!is.null(self$`LIST_PRICE_INVALID`)) {
        CatalogsItemValidationErrorsObject[["LIST_PRICE_INVALID"]] <-
          self$`LIST_PRICE_INVALID`$toJSON()
      }
      if (!is.null(self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
        CatalogsItemValidationErrorsObject[["MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"]] <-
          self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`$toJSON()
      }
      if (!is.null(self$`PARSE_LINE_ERROR`)) {
        CatalogsItemValidationErrorsObject[["PARSE_LINE_ERROR"]] <-
          self$`PARSE_LINE_ERROR`$toJSON()
      }
      if (!is.null(self$`PINJOIN_CONTENT_UNSAFE`)) {
        CatalogsItemValidationErrorsObject[["PINJOIN_CONTENT_UNSAFE"]] <-
          self$`PINJOIN_CONTENT_UNSAFE`$toJSON()
      }
      if (!is.null(self$`PRICE_CANNOT_BE_DETERMINED`)) {
        CatalogsItemValidationErrorsObject[["PRICE_CANNOT_BE_DETERMINED"]] <-
          self$`PRICE_CANNOT_BE_DETERMINED`$toJSON()
      }
      if (!is.null(self$`PRICE_MISSING`)) {
        CatalogsItemValidationErrorsObject[["PRICE_MISSING"]] <-
          self$`PRICE_MISSING`$toJSON()
      }
      if (!is.null(self$`PRODUCT_LINK_MISSING`)) {
        CatalogsItemValidationErrorsObject[["PRODUCT_LINK_MISSING"]] <-
          self$`PRODUCT_LINK_MISSING`$toJSON()
      }
      if (!is.null(self$`PRODUCT_PRICE_INVALID`)) {
        CatalogsItemValidationErrorsObject[["PRODUCT_PRICE_INVALID"]] <-
          self$`PRODUCT_PRICE_INVALID`$toJSON()
      }
      if (!is.null(self$`TITLE_MISSING`)) {
        CatalogsItemValidationErrorsObject[["TITLE_MISSING"]] <-
          self$`TITLE_MISSING`$toJSON()
      }
      CatalogsItemValidationErrorsObject
    },
    #' Deserialize JSON string into an instance of CatalogsItemValidationErrors
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationErrors
    #' @export
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
      if (!is.null(this_object$`ITEMID_MISSING`)) {
        `itemid_missing_object` <- CatalogsItemValidationDetails$new()
        `itemid_missing_object`$fromJSON(jsonlite::toJSON(this_object$`ITEMID_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`ITEMID_MISSING` <- `itemid_missing_object`
      }
      if (!is.null(this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
        `item_main_image_download_failure_object` <- CatalogsItemValidationDetails$new()
        `item_main_image_download_failure_object`$fromJSON(jsonlite::toJSON(this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`, auto_unbox = TRUE, digits = NA))
        self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- `item_main_image_download_failure_object`
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationErrors in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ADULT_INVALID`)) {
          sprintf(
          '"ADULT_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`ADULT_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ADWORDS_FORMAT_INVALID`)) {
          sprintf(
          '"ADWORDS_FORMAT_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`ADWORDS_FORMAT_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`AVAILABILITY_INVALID`)) {
          sprintf(
          '"AVAILABILITY_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`AVAILABILITY_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`BLOCKLISTED_IMAGE_SIGNATURE`)) {
          sprintf(
          '"BLOCKLISTED_IMAGE_SIGNATURE":
          %s
          ',
          jsonlite::toJSON(self$`BLOCKLISTED_IMAGE_SIGNATURE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`DESCRIPTION_MISSING`)) {
          sprintf(
          '"DESCRIPTION_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`DESCRIPTION_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`DUPLICATE_PRODUCTS`)) {
          sprintf(
          '"DUPLICATE_PRODUCTS":
          %s
          ',
          jsonlite::toJSON(self$`DUPLICATE_PRODUCTS`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`IMAGE_LINK_INVALID`)) {
          sprintf(
          '"IMAGE_LINK_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`IMAGE_LINK_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`IMAGE_LINK_LENGTH_TOO_LONG`)) {
          sprintf(
          '"IMAGE_LINK_LENGTH_TOO_LONG":
          %s
          ',
          jsonlite::toJSON(self$`IMAGE_LINK_LENGTH_TOO_LONG`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`IMAGE_LINK_MISSING`)) {
          sprintf(
          '"IMAGE_LINK_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`IMAGE_LINK_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`INVALID_DOMAIN`)) {
          sprintf(
          '"INVALID_DOMAIN":
          %s
          ',
          jsonlite::toJSON(self$`INVALID_DOMAIN`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ITEMID_MISSING`)) {
          sprintf(
          '"ITEMID_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`ITEMID_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)) {
          sprintf(
          '"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE":
          %s
          ',
          jsonlite::toJSON(self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`LINK_FORMAT_INVALID`)) {
          sprintf(
          '"LINK_FORMAT_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`LINK_FORMAT_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`LINK_LENGTH_TOO_LONG`)) {
          sprintf(
          '"LINK_LENGTH_TOO_LONG":
          %s
          ',
          jsonlite::toJSON(self$`LINK_LENGTH_TOO_LONG`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`LIST_PRICE_INVALID`)) {
          sprintf(
          '"LIST_PRICE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`LIST_PRICE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)) {
          sprintf(
          '"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED":
          %s
          ',
          jsonlite::toJSON(self$`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PARSE_LINE_ERROR`)) {
          sprintf(
          '"PARSE_LINE_ERROR":
          %s
          ',
          jsonlite::toJSON(self$`PARSE_LINE_ERROR`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PINJOIN_CONTENT_UNSAFE`)) {
          sprintf(
          '"PINJOIN_CONTENT_UNSAFE":
          %s
          ',
          jsonlite::toJSON(self$`PINJOIN_CONTENT_UNSAFE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PRICE_CANNOT_BE_DETERMINED`)) {
          sprintf(
          '"PRICE_CANNOT_BE_DETERMINED":
          %s
          ',
          jsonlite::toJSON(self$`PRICE_CANNOT_BE_DETERMINED`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PRICE_MISSING`)) {
          sprintf(
          '"PRICE_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`PRICE_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PRODUCT_LINK_MISSING`)) {
          sprintf(
          '"PRODUCT_LINK_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`PRODUCT_LINK_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PRODUCT_PRICE_INVALID`)) {
          sprintf(
          '"PRODUCT_PRICE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`PRODUCT_PRICE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`TITLE_MISSING`)) {
          sprintf(
          '"TITLE_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`TITLE_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsItemValidationErrors
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationErrors
    #' @export
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
      self$`ITEMID_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ITEMID_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`, auto_unbox = TRUE, digits = NA))
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
    #' Validate JSON input with respect to CatalogsItemValidationErrors
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsItemValidationErrors and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemValidationErrors
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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

