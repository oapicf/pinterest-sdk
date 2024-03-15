#' @docType class
#' @title NullableCatalogsItemFieldType
#' @description NullableCatalogsItemFieldType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NullableCatalogsItemFieldType <- R6::R6Class(
  "NullableCatalogsItemFieldType",
  public = list(
    #' Initialize a new NullableCatalogsItemFieldType class.
    #'
    #' @description
    #' Initialize a new NullableCatalogsItemFieldType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_NullableCatalogsItemFieldType()

      stopifnot(length(val) == 1L)

      if (!val %in% enumvec)
          stop("Use one of the valid values: ",
              paste0(enumvec, collapse = ", "))
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return NullableCatalogsItemFieldType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of NullableCatalogsItemFieldType
    #'
    #' @description
    #' Deserialize JSON string into an instance of NullableCatalogsItemFieldType
    #'
    #' @param input_json the JSON input
    #' @return the instance of NullableCatalogsItemFieldType
    #' @export
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return NullableCatalogsItemFieldType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of NullableCatalogsItemFieldType
    #'
    #' @description
    #' Deserialize JSON string into an instance of NullableCatalogsItemFieldType
    #'
    #' @param input_json the JSON input
    #' @return the instance of NullableCatalogsItemFieldType
    #' @export
    fromJSONString = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    }
  ),
  private = list(
    value = NULL
  )
)

# add to utils.R
.parse_NullableCatalogsItemFieldType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ITEM_ID, ITEM_GROUP_ID, TITLE, DESCRIPTION, ITEM_LINK, ORGANIC_LINK, IMAGE_LINK, ADWORDS_REDIRECT_LINK, AD_LINK, SIZE, GOOGLE_PRODUCT_CATEGORY, PRODUCT_CATEGORY, CONDITION, AVAILABILITY, GENDER, AGE_GROUP, SIZE_TYPE, SIZE_SYSTEM, ADULT, SHIPPING, SHIPPING_WEIGHT, TAX, MULTIPACK, ADDITIONAL_IMAGE_LINK, PRICE, SALE_PRICE, IS_BUNDLE, EXPIRATION_DATE, SALE_PRICE_EFFECTIVE_DATE, AVAILABILITY_DATE, WEIGHT_UNIT, PRODUCT_TYPE, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, MATERIAL, PATTERN, COLOR, BRAND, GTIN, MPN, IOS_DEEP_LINK, ANDROID_DEEP_LINK, FREE_SHIPPING_LABEL, FREE_SHIPPING_LIMIT, AVG_REVIEW_RATING, NUM_RATINGS, NUM_REVIEWS, ALT_TEXT, VARIANT_NAMES, VARIANT_VALUES, MIN_AD_PRICE, SHIPPING_WIDTH, SHIPPING_HEIGHT, null]")
  unlist(strsplit(res, ", "))
}

