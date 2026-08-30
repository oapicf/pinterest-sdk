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

    #' @description
    #' Initialize a new NullableCatalogsItemFieldType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_NullableCatalogsItemFieldType()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
      }
      private$value <- val
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert NullableCatalogsItemFieldType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of NullableCatalogsItemFieldType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of NullableCatalogsItemFieldType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return NullableCatalogsItemFieldType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of NullableCatalogsItemFieldType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of NullableCatalogsItemFieldType
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
  res <- gsub("^\\[|\\]$", "", "[ITEM_ID, ITEM_GROUP_ID, TITLE, DESCRIPTION, ITEM_LINK, ORGANIC_LINK, IMAGE_LINK, ADWORDS_REDIRECT_LINK, AD_LINK, SIZE, GOOGLE_PRODUCT_CATEGORY, PRODUCT_CATEGORY, CONDITION, AVAILABILITY, GENDER, AGE_GROUP, SIZE_TYPE, SIZE_SYSTEM, ADULT, SHIPPING, SHIPPING_WEIGHT, TAX, MULTIPACK, ADDITIONAL_IMAGE_LINK, PRICE, SALE_PRICE, IS_BUNDLE, EXPIRATION_DATE, AVAILABILITY_DATE, WEIGHT_UNIT, PRODUCT_TYPE, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, MATERIAL, PATTERN, COLOR, BRAND, GTIN, MPN, IOS_DEEP_LINK, ANDROID_DEEP_LINK, FREE_SHIPPING_LABEL, FREE_SHIPPING_LIMIT, AVG_REVIEW_RATING, NUM_RATINGS, NUM_REVIEWS, ALT_TEXT, VARIANT_NAMES, VARIANT_VALUES, MIN_AD_PRICE, SHIPPING_WIDTH, SHIPPING_HEIGHT, AD_IMAGE_0_LINK, AD_IMAGE_1_LINK, AD_IMAGE_2_LINK, AD_IMAGE_3_LINK, AD_IMAGE_4_LINK, AD_IMAGE_5_LINK, AD_IMAGE_6_LINK, AD_IMAGE_7_LINK, AD_IMAGE_8_LINK, AD_IMAGE_9_LINK, AD_IMAGE_10_LINK, AD_IMAGE_11_LINK, AD_IMAGE_12_LINK, AD_IMAGE_13_LINK, AD_IMAGE_14_LINK, AD_IMAGE_15_LINK, AD_IMAGE_16_LINK, AD_IMAGE_17_LINK, AD_IMAGE_18_LINK, AD_IMAGE_19_LINK, AD_IMAGE_0_TAG, AD_IMAGE_1_TAG, AD_IMAGE_2_TAG, AD_IMAGE_3_TAG, AD_IMAGE_4_TAG, AD_IMAGE_5_TAG, AD_IMAGE_6_TAG, AD_IMAGE_7_TAG, AD_IMAGE_8_TAG, AD_IMAGE_9_TAG, AD_IMAGE_10_TAG, AD_IMAGE_11_TAG, AD_IMAGE_12_TAG, AD_IMAGE_13_TAG, AD_IMAGE_14_TAG, AD_IMAGE_15_TAG, AD_IMAGE_16_TAG, AD_IMAGE_17_TAG, AD_IMAGE_18_TAG, AD_IMAGE_19_TAG, AD_VIDEO_0_LINK, AD_VIDEO_1_LINK, AD_VIDEO_2_LINK, AD_VIDEO_0_TAG, AD_VIDEO_1_TAG, AD_VIDEO_2_TAG, INSTALLMENT_PRICE, UNIT_PRICE_TOTAL_MEASURE, UNIT_PRICE_BASE_MEASURE, SALE_PRICE_EFFECTIVE_DATE, null]")
  unlist(strsplit(res, ", "))
}

