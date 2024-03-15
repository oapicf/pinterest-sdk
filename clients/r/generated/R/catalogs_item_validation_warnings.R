#' Create a new CatalogsItemValidationWarnings
#'
#' @description
#' CatalogsItemValidationWarnings Class
#'
#' @docType class
#' @title CatalogsItemValidationWarnings
#' @description CatalogsItemValidationWarnings Class
#' @format An \code{R6Class} generator object
#' @field AD_LINK_FORMAT_WARNING  \link{CatalogsItemValidationDetails} [optional]
#' @field AD_LINK_SAME_AS_LINK  \link{CatalogsItemValidationDetails} [optional]
#' @field ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG  \link{CatalogsItemValidationDetails} [optional]
#' @field ADDITIONAL_IMAGE_LINK_WARNING  \link{CatalogsItemValidationDetails} [optional]
#' @field ADWORDS_FORMAT_WARNING  \link{CatalogsItemValidationDetails} [optional]
#' @field ADWORDS_SAME_AS_LINK  \link{CatalogsItemValidationDetails} [optional]
#' @field AGE_GROUP_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field SIZE_SYSTEM_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field ANDROID_DEEP_LINK_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field AVAILABILITY_DATE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field COUNTRY_DOES_NOT_MAP_TO_CURRENCY  \link{CatalogsItemValidationDetails} [optional]
#' @field CUSTOM_LABEL_LENGTH_TOO_LONG  \link{CatalogsItemValidationDetails} [optional]
#' @field DESCRIPTION_LENGTH_TOO_LONG  \link{CatalogsItemValidationDetails} [optional]
#' @field EXPIRATION_DATE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field GENDER_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field GTIN_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field IMAGE_LINK_WARNING  \link{CatalogsItemValidationDetails} [optional]
#' @field IOS_DEEP_LINK_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field IS_BUNDLE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE  \link{CatalogsItemValidationDetails} [optional]
#' @field LINK_FORMAT_WARNING  \link{CatalogsItemValidationDetails} [optional]
#' @field MIN_AD_PRICE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field MPN_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field MULTIPACK_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field OPTIONAL_CONDITION_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field OPTIONAL_CONDITION_MISSING  \link{CatalogsItemValidationDetails} [optional]
#' @field OPTIONAL_PRODUCT_CATEGORY_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field OPTIONAL_PRODUCT_CATEGORY_MISSING  \link{CatalogsItemValidationDetails} [optional]
#' @field PRODUCT_CATEGORY_DEPTH_WARNING  \link{CatalogsItemValidationDetails} [optional]
#' @field PRODUCT_TYPE_LENGTH_TOO_LONG  \link{CatalogsItemValidationDetails} [optional]
#' @field SALES_PRICE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field SALES_PRICE_TOO_LOW  \link{CatalogsItemValidationDetails} [optional]
#' @field SALES_PRICE_TOO_HIGH  \link{CatalogsItemValidationDetails} [optional]
#' @field SALE_DATE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field SHIPPING_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field SHIPPING_HEIGHT_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field SHIPPING_WEIGHT_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field SHIPPING_WIDTH_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field SIZE_TYPE_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field TAX_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @field TITLE_LENGTH_TOO_LONG  \link{CatalogsItemValidationDetails} [optional]
#' @field TOO_MANY_ADDITIONAL_IMAGE_LINKS  \link{CatalogsItemValidationDetails} [optional]
#' @field UTM_SOURCE_AUTO_CORRECTED  \link{CatalogsItemValidationDetails} [optional]
#' @field WEIGHT_UNIT_INVALID  \link{CatalogsItemValidationDetails} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemValidationWarnings <- R6::R6Class(
  "CatalogsItemValidationWarnings",
  public = list(
    `AD_LINK_FORMAT_WARNING` = NULL,
    `AD_LINK_SAME_AS_LINK` = NULL,
    `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` = NULL,
    `ADDITIONAL_IMAGE_LINK_WARNING` = NULL,
    `ADWORDS_FORMAT_WARNING` = NULL,
    `ADWORDS_SAME_AS_LINK` = NULL,
    `AGE_GROUP_INVALID` = NULL,
    `SIZE_SYSTEM_INVALID` = NULL,
    `ANDROID_DEEP_LINK_INVALID` = NULL,
    `AVAILABILITY_DATE_INVALID` = NULL,
    `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` = NULL,
    `CUSTOM_LABEL_LENGTH_TOO_LONG` = NULL,
    `DESCRIPTION_LENGTH_TOO_LONG` = NULL,
    `EXPIRATION_DATE_INVALID` = NULL,
    `GENDER_INVALID` = NULL,
    `GTIN_INVALID` = NULL,
    `IMAGE_LINK_WARNING` = NULL,
    `IOS_DEEP_LINK_INVALID` = NULL,
    `IS_BUNDLE_INVALID` = NULL,
    `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` = NULL,
    `LINK_FORMAT_WARNING` = NULL,
    `MIN_AD_PRICE_INVALID` = NULL,
    `MPN_INVALID` = NULL,
    `MULTIPACK_INVALID` = NULL,
    `OPTIONAL_CONDITION_INVALID` = NULL,
    `OPTIONAL_CONDITION_MISSING` = NULL,
    `OPTIONAL_PRODUCT_CATEGORY_INVALID` = NULL,
    `OPTIONAL_PRODUCT_CATEGORY_MISSING` = NULL,
    `PRODUCT_CATEGORY_DEPTH_WARNING` = NULL,
    `PRODUCT_TYPE_LENGTH_TOO_LONG` = NULL,
    `SALES_PRICE_INVALID` = NULL,
    `SALES_PRICE_TOO_LOW` = NULL,
    `SALES_PRICE_TOO_HIGH` = NULL,
    `SALE_DATE_INVALID` = NULL,
    `SHIPPING_INVALID` = NULL,
    `SHIPPING_HEIGHT_INVALID` = NULL,
    `SHIPPING_WEIGHT_INVALID` = NULL,
    `SHIPPING_WIDTH_INVALID` = NULL,
    `SIZE_TYPE_INVALID` = NULL,
    `TAX_INVALID` = NULL,
    `TITLE_LENGTH_TOO_LONG` = NULL,
    `TOO_MANY_ADDITIONAL_IMAGE_LINKS` = NULL,
    `UTM_SOURCE_AUTO_CORRECTED` = NULL,
    `WEIGHT_UNIT_INVALID` = NULL,
    #' Initialize a new CatalogsItemValidationWarnings class.
    #'
    #' @description
    #' Initialize a new CatalogsItemValidationWarnings class.
    #'
    #' @param AD_LINK_FORMAT_WARNING AD_LINK_FORMAT_WARNING
    #' @param AD_LINK_SAME_AS_LINK AD_LINK_SAME_AS_LINK
    #' @param ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
    #' @param ADDITIONAL_IMAGE_LINK_WARNING ADDITIONAL_IMAGE_LINK_WARNING
    #' @param ADWORDS_FORMAT_WARNING ADWORDS_FORMAT_WARNING
    #' @param ADWORDS_SAME_AS_LINK ADWORDS_SAME_AS_LINK
    #' @param AGE_GROUP_INVALID AGE_GROUP_INVALID
    #' @param SIZE_SYSTEM_INVALID SIZE_SYSTEM_INVALID
    #' @param ANDROID_DEEP_LINK_INVALID ANDROID_DEEP_LINK_INVALID
    #' @param AVAILABILITY_DATE_INVALID AVAILABILITY_DATE_INVALID
    #' @param COUNTRY_DOES_NOT_MAP_TO_CURRENCY COUNTRY_DOES_NOT_MAP_TO_CURRENCY
    #' @param CUSTOM_LABEL_LENGTH_TOO_LONG CUSTOM_LABEL_LENGTH_TOO_LONG
    #' @param DESCRIPTION_LENGTH_TOO_LONG DESCRIPTION_LENGTH_TOO_LONG
    #' @param EXPIRATION_DATE_INVALID EXPIRATION_DATE_INVALID
    #' @param GENDER_INVALID GENDER_INVALID
    #' @param GTIN_INVALID GTIN_INVALID
    #' @param IMAGE_LINK_WARNING IMAGE_LINK_WARNING
    #' @param IOS_DEEP_LINK_INVALID IOS_DEEP_LINK_INVALID
    #' @param IS_BUNDLE_INVALID IS_BUNDLE_INVALID
    #' @param ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
    #' @param LINK_FORMAT_WARNING LINK_FORMAT_WARNING
    #' @param MIN_AD_PRICE_INVALID MIN_AD_PRICE_INVALID
    #' @param MPN_INVALID MPN_INVALID
    #' @param MULTIPACK_INVALID MULTIPACK_INVALID
    #' @param OPTIONAL_CONDITION_INVALID OPTIONAL_CONDITION_INVALID
    #' @param OPTIONAL_CONDITION_MISSING OPTIONAL_CONDITION_MISSING
    #' @param OPTIONAL_PRODUCT_CATEGORY_INVALID OPTIONAL_PRODUCT_CATEGORY_INVALID
    #' @param OPTIONAL_PRODUCT_CATEGORY_MISSING OPTIONAL_PRODUCT_CATEGORY_MISSING
    #' @param PRODUCT_CATEGORY_DEPTH_WARNING PRODUCT_CATEGORY_DEPTH_WARNING
    #' @param PRODUCT_TYPE_LENGTH_TOO_LONG PRODUCT_TYPE_LENGTH_TOO_LONG
    #' @param SALES_PRICE_INVALID SALES_PRICE_INVALID
    #' @param SALES_PRICE_TOO_LOW SALES_PRICE_TOO_LOW
    #' @param SALES_PRICE_TOO_HIGH SALES_PRICE_TOO_HIGH
    #' @param SALE_DATE_INVALID SALE_DATE_INVALID
    #' @param SHIPPING_INVALID SHIPPING_INVALID
    #' @param SHIPPING_HEIGHT_INVALID SHIPPING_HEIGHT_INVALID
    #' @param SHIPPING_WEIGHT_INVALID SHIPPING_WEIGHT_INVALID
    #' @param SHIPPING_WIDTH_INVALID SHIPPING_WIDTH_INVALID
    #' @param SIZE_TYPE_INVALID SIZE_TYPE_INVALID
    #' @param TAX_INVALID TAX_INVALID
    #' @param TITLE_LENGTH_TOO_LONG TITLE_LENGTH_TOO_LONG
    #' @param TOO_MANY_ADDITIONAL_IMAGE_LINKS TOO_MANY_ADDITIONAL_IMAGE_LINKS
    #' @param UTM_SOURCE_AUTO_CORRECTED UTM_SOURCE_AUTO_CORRECTED
    #' @param WEIGHT_UNIT_INVALID WEIGHT_UNIT_INVALID
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`AD_LINK_FORMAT_WARNING` = NULL, `AD_LINK_SAME_AS_LINK` = NULL, `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` = NULL, `ADDITIONAL_IMAGE_LINK_WARNING` = NULL, `ADWORDS_FORMAT_WARNING` = NULL, `ADWORDS_SAME_AS_LINK` = NULL, `AGE_GROUP_INVALID` = NULL, `SIZE_SYSTEM_INVALID` = NULL, `ANDROID_DEEP_LINK_INVALID` = NULL, `AVAILABILITY_DATE_INVALID` = NULL, `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` = NULL, `CUSTOM_LABEL_LENGTH_TOO_LONG` = NULL, `DESCRIPTION_LENGTH_TOO_LONG` = NULL, `EXPIRATION_DATE_INVALID` = NULL, `GENDER_INVALID` = NULL, `GTIN_INVALID` = NULL, `IMAGE_LINK_WARNING` = NULL, `IOS_DEEP_LINK_INVALID` = NULL, `IS_BUNDLE_INVALID` = NULL, `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` = NULL, `LINK_FORMAT_WARNING` = NULL, `MIN_AD_PRICE_INVALID` = NULL, `MPN_INVALID` = NULL, `MULTIPACK_INVALID` = NULL, `OPTIONAL_CONDITION_INVALID` = NULL, `OPTIONAL_CONDITION_MISSING` = NULL, `OPTIONAL_PRODUCT_CATEGORY_INVALID` = NULL, `OPTIONAL_PRODUCT_CATEGORY_MISSING` = NULL, `PRODUCT_CATEGORY_DEPTH_WARNING` = NULL, `PRODUCT_TYPE_LENGTH_TOO_LONG` = NULL, `SALES_PRICE_INVALID` = NULL, `SALES_PRICE_TOO_LOW` = NULL, `SALES_PRICE_TOO_HIGH` = NULL, `SALE_DATE_INVALID` = NULL, `SHIPPING_INVALID` = NULL, `SHIPPING_HEIGHT_INVALID` = NULL, `SHIPPING_WEIGHT_INVALID` = NULL, `SHIPPING_WIDTH_INVALID` = NULL, `SIZE_TYPE_INVALID` = NULL, `TAX_INVALID` = NULL, `TITLE_LENGTH_TOO_LONG` = NULL, `TOO_MANY_ADDITIONAL_IMAGE_LINKS` = NULL, `UTM_SOURCE_AUTO_CORRECTED` = NULL, `WEIGHT_UNIT_INVALID` = NULL, ...) {
      if (!is.null(`AD_LINK_FORMAT_WARNING`)) {
        stopifnot(R6::is.R6(`AD_LINK_FORMAT_WARNING`))
        self$`AD_LINK_FORMAT_WARNING` <- `AD_LINK_FORMAT_WARNING`
      }
      if (!is.null(`AD_LINK_SAME_AS_LINK`)) {
        stopifnot(R6::is.R6(`AD_LINK_SAME_AS_LINK`))
        self$`AD_LINK_SAME_AS_LINK` <- `AD_LINK_SAME_AS_LINK`
      }
      if (!is.null(`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
        stopifnot(R6::is.R6(`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`))
        self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` <- `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(`ADDITIONAL_IMAGE_LINK_WARNING`)) {
        stopifnot(R6::is.R6(`ADDITIONAL_IMAGE_LINK_WARNING`))
        self$`ADDITIONAL_IMAGE_LINK_WARNING` <- `ADDITIONAL_IMAGE_LINK_WARNING`
      }
      if (!is.null(`ADWORDS_FORMAT_WARNING`)) {
        stopifnot(R6::is.R6(`ADWORDS_FORMAT_WARNING`))
        self$`ADWORDS_FORMAT_WARNING` <- `ADWORDS_FORMAT_WARNING`
      }
      if (!is.null(`ADWORDS_SAME_AS_LINK`)) {
        stopifnot(R6::is.R6(`ADWORDS_SAME_AS_LINK`))
        self$`ADWORDS_SAME_AS_LINK` <- `ADWORDS_SAME_AS_LINK`
      }
      if (!is.null(`AGE_GROUP_INVALID`)) {
        stopifnot(R6::is.R6(`AGE_GROUP_INVALID`))
        self$`AGE_GROUP_INVALID` <- `AGE_GROUP_INVALID`
      }
      if (!is.null(`SIZE_SYSTEM_INVALID`)) {
        stopifnot(R6::is.R6(`SIZE_SYSTEM_INVALID`))
        self$`SIZE_SYSTEM_INVALID` <- `SIZE_SYSTEM_INVALID`
      }
      if (!is.null(`ANDROID_DEEP_LINK_INVALID`)) {
        stopifnot(R6::is.R6(`ANDROID_DEEP_LINK_INVALID`))
        self$`ANDROID_DEEP_LINK_INVALID` <- `ANDROID_DEEP_LINK_INVALID`
      }
      if (!is.null(`AVAILABILITY_DATE_INVALID`)) {
        stopifnot(R6::is.R6(`AVAILABILITY_DATE_INVALID`))
        self$`AVAILABILITY_DATE_INVALID` <- `AVAILABILITY_DATE_INVALID`
      }
      if (!is.null(`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
        stopifnot(R6::is.R6(`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`))
        self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY` <- `COUNTRY_DOES_NOT_MAP_TO_CURRENCY`
      }
      if (!is.null(`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_LENGTH_TOO_LONG`))
        self$`CUSTOM_LABEL_LENGTH_TOO_LONG` <- `CUSTOM_LABEL_LENGTH_TOO_LONG`
      }
      if (!is.null(`DESCRIPTION_LENGTH_TOO_LONG`)) {
        stopifnot(R6::is.R6(`DESCRIPTION_LENGTH_TOO_LONG`))
        self$`DESCRIPTION_LENGTH_TOO_LONG` <- `DESCRIPTION_LENGTH_TOO_LONG`
      }
      if (!is.null(`EXPIRATION_DATE_INVALID`)) {
        stopifnot(R6::is.R6(`EXPIRATION_DATE_INVALID`))
        self$`EXPIRATION_DATE_INVALID` <- `EXPIRATION_DATE_INVALID`
      }
      if (!is.null(`GENDER_INVALID`)) {
        stopifnot(R6::is.R6(`GENDER_INVALID`))
        self$`GENDER_INVALID` <- `GENDER_INVALID`
      }
      if (!is.null(`GTIN_INVALID`)) {
        stopifnot(R6::is.R6(`GTIN_INVALID`))
        self$`GTIN_INVALID` <- `GTIN_INVALID`
      }
      if (!is.null(`IMAGE_LINK_WARNING`)) {
        stopifnot(R6::is.R6(`IMAGE_LINK_WARNING`))
        self$`IMAGE_LINK_WARNING` <- `IMAGE_LINK_WARNING`
      }
      if (!is.null(`IOS_DEEP_LINK_INVALID`)) {
        stopifnot(R6::is.R6(`IOS_DEEP_LINK_INVALID`))
        self$`IOS_DEEP_LINK_INVALID` <- `IOS_DEEP_LINK_INVALID`
      }
      if (!is.null(`IS_BUNDLE_INVALID`)) {
        stopifnot(R6::is.R6(`IS_BUNDLE_INVALID`))
        self$`IS_BUNDLE_INVALID` <- `IS_BUNDLE_INVALID`
      }
      if (!is.null(`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
        stopifnot(R6::is.R6(`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`))
        self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` <- `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(`LINK_FORMAT_WARNING`)) {
        stopifnot(R6::is.R6(`LINK_FORMAT_WARNING`))
        self$`LINK_FORMAT_WARNING` <- `LINK_FORMAT_WARNING`
      }
      if (!is.null(`MIN_AD_PRICE_INVALID`)) {
        stopifnot(R6::is.R6(`MIN_AD_PRICE_INVALID`))
        self$`MIN_AD_PRICE_INVALID` <- `MIN_AD_PRICE_INVALID`
      }
      if (!is.null(`MPN_INVALID`)) {
        stopifnot(R6::is.R6(`MPN_INVALID`))
        self$`MPN_INVALID` <- `MPN_INVALID`
      }
      if (!is.null(`MULTIPACK_INVALID`)) {
        stopifnot(R6::is.R6(`MULTIPACK_INVALID`))
        self$`MULTIPACK_INVALID` <- `MULTIPACK_INVALID`
      }
      if (!is.null(`OPTIONAL_CONDITION_INVALID`)) {
        stopifnot(R6::is.R6(`OPTIONAL_CONDITION_INVALID`))
        self$`OPTIONAL_CONDITION_INVALID` <- `OPTIONAL_CONDITION_INVALID`
      }
      if (!is.null(`OPTIONAL_CONDITION_MISSING`)) {
        stopifnot(R6::is.R6(`OPTIONAL_CONDITION_MISSING`))
        self$`OPTIONAL_CONDITION_MISSING` <- `OPTIONAL_CONDITION_MISSING`
      }
      if (!is.null(`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
        stopifnot(R6::is.R6(`OPTIONAL_PRODUCT_CATEGORY_INVALID`))
        self$`OPTIONAL_PRODUCT_CATEGORY_INVALID` <- `OPTIONAL_PRODUCT_CATEGORY_INVALID`
      }
      if (!is.null(`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
        stopifnot(R6::is.R6(`OPTIONAL_PRODUCT_CATEGORY_MISSING`))
        self$`OPTIONAL_PRODUCT_CATEGORY_MISSING` <- `OPTIONAL_PRODUCT_CATEGORY_MISSING`
      }
      if (!is.null(`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
        stopifnot(R6::is.R6(`PRODUCT_CATEGORY_DEPTH_WARNING`))
        self$`PRODUCT_CATEGORY_DEPTH_WARNING` <- `PRODUCT_CATEGORY_DEPTH_WARNING`
      }
      if (!is.null(`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
        stopifnot(R6::is.R6(`PRODUCT_TYPE_LENGTH_TOO_LONG`))
        self$`PRODUCT_TYPE_LENGTH_TOO_LONG` <- `PRODUCT_TYPE_LENGTH_TOO_LONG`
      }
      if (!is.null(`SALES_PRICE_INVALID`)) {
        stopifnot(R6::is.R6(`SALES_PRICE_INVALID`))
        self$`SALES_PRICE_INVALID` <- `SALES_PRICE_INVALID`
      }
      if (!is.null(`SALES_PRICE_TOO_LOW`)) {
        stopifnot(R6::is.R6(`SALES_PRICE_TOO_LOW`))
        self$`SALES_PRICE_TOO_LOW` <- `SALES_PRICE_TOO_LOW`
      }
      if (!is.null(`SALES_PRICE_TOO_HIGH`)) {
        stopifnot(R6::is.R6(`SALES_PRICE_TOO_HIGH`))
        self$`SALES_PRICE_TOO_HIGH` <- `SALES_PRICE_TOO_HIGH`
      }
      if (!is.null(`SALE_DATE_INVALID`)) {
        stopifnot(R6::is.R6(`SALE_DATE_INVALID`))
        self$`SALE_DATE_INVALID` <- `SALE_DATE_INVALID`
      }
      if (!is.null(`SHIPPING_INVALID`)) {
        stopifnot(R6::is.R6(`SHIPPING_INVALID`))
        self$`SHIPPING_INVALID` <- `SHIPPING_INVALID`
      }
      if (!is.null(`SHIPPING_HEIGHT_INVALID`)) {
        stopifnot(R6::is.R6(`SHIPPING_HEIGHT_INVALID`))
        self$`SHIPPING_HEIGHT_INVALID` <- `SHIPPING_HEIGHT_INVALID`
      }
      if (!is.null(`SHIPPING_WEIGHT_INVALID`)) {
        stopifnot(R6::is.R6(`SHIPPING_WEIGHT_INVALID`))
        self$`SHIPPING_WEIGHT_INVALID` <- `SHIPPING_WEIGHT_INVALID`
      }
      if (!is.null(`SHIPPING_WIDTH_INVALID`)) {
        stopifnot(R6::is.R6(`SHIPPING_WIDTH_INVALID`))
        self$`SHIPPING_WIDTH_INVALID` <- `SHIPPING_WIDTH_INVALID`
      }
      if (!is.null(`SIZE_TYPE_INVALID`)) {
        stopifnot(R6::is.R6(`SIZE_TYPE_INVALID`))
        self$`SIZE_TYPE_INVALID` <- `SIZE_TYPE_INVALID`
      }
      if (!is.null(`TAX_INVALID`)) {
        stopifnot(R6::is.R6(`TAX_INVALID`))
        self$`TAX_INVALID` <- `TAX_INVALID`
      }
      if (!is.null(`TITLE_LENGTH_TOO_LONG`)) {
        stopifnot(R6::is.R6(`TITLE_LENGTH_TOO_LONG`))
        self$`TITLE_LENGTH_TOO_LONG` <- `TITLE_LENGTH_TOO_LONG`
      }
      if (!is.null(`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
        stopifnot(R6::is.R6(`TOO_MANY_ADDITIONAL_IMAGE_LINKS`))
        self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS` <- `TOO_MANY_ADDITIONAL_IMAGE_LINKS`
      }
      if (!is.null(`UTM_SOURCE_AUTO_CORRECTED`)) {
        stopifnot(R6::is.R6(`UTM_SOURCE_AUTO_CORRECTED`))
        self$`UTM_SOURCE_AUTO_CORRECTED` <- `UTM_SOURCE_AUTO_CORRECTED`
      }
      if (!is.null(`WEIGHT_UNIT_INVALID`)) {
        stopifnot(R6::is.R6(`WEIGHT_UNIT_INVALID`))
        self$`WEIGHT_UNIT_INVALID` <- `WEIGHT_UNIT_INVALID`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationWarnings in JSON format
    #' @export
    toJSON = function() {
      CatalogsItemValidationWarningsObject <- list()
      if (!is.null(self$`AD_LINK_FORMAT_WARNING`)) {
        CatalogsItemValidationWarningsObject[["AD_LINK_FORMAT_WARNING"]] <-
          self$`AD_LINK_FORMAT_WARNING`$toJSON()
      }
      if (!is.null(self$`AD_LINK_SAME_AS_LINK`)) {
        CatalogsItemValidationWarningsObject[["AD_LINK_SAME_AS_LINK"]] <-
          self$`AD_LINK_SAME_AS_LINK`$toJSON()
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationWarningsObject[["ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"]] <-
          self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`$toJSON()
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_LINK_WARNING`)) {
        CatalogsItemValidationWarningsObject[["ADDITIONAL_IMAGE_LINK_WARNING"]] <-
          self$`ADDITIONAL_IMAGE_LINK_WARNING`$toJSON()
      }
      if (!is.null(self$`ADWORDS_FORMAT_WARNING`)) {
        CatalogsItemValidationWarningsObject[["ADWORDS_FORMAT_WARNING"]] <-
          self$`ADWORDS_FORMAT_WARNING`$toJSON()
      }
      if (!is.null(self$`ADWORDS_SAME_AS_LINK`)) {
        CatalogsItemValidationWarningsObject[["ADWORDS_SAME_AS_LINK"]] <-
          self$`ADWORDS_SAME_AS_LINK`$toJSON()
      }
      if (!is.null(self$`AGE_GROUP_INVALID`)) {
        CatalogsItemValidationWarningsObject[["AGE_GROUP_INVALID"]] <-
          self$`AGE_GROUP_INVALID`$toJSON()
      }
      if (!is.null(self$`SIZE_SYSTEM_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SIZE_SYSTEM_INVALID"]] <-
          self$`SIZE_SYSTEM_INVALID`$toJSON()
      }
      if (!is.null(self$`ANDROID_DEEP_LINK_INVALID`)) {
        CatalogsItemValidationWarningsObject[["ANDROID_DEEP_LINK_INVALID"]] <-
          self$`ANDROID_DEEP_LINK_INVALID`$toJSON()
      }
      if (!is.null(self$`AVAILABILITY_DATE_INVALID`)) {
        CatalogsItemValidationWarningsObject[["AVAILABILITY_DATE_INVALID"]] <-
          self$`AVAILABILITY_DATE_INVALID`$toJSON()
      }
      if (!is.null(self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
        CatalogsItemValidationWarningsObject[["COUNTRY_DOES_NOT_MAP_TO_CURRENCY"]] <-
          self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`$toJSON()
      }
      if (!is.null(self$`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationWarningsObject[["CUSTOM_LABEL_LENGTH_TOO_LONG"]] <-
          self$`CUSTOM_LABEL_LENGTH_TOO_LONG`$toJSON()
      }
      if (!is.null(self$`DESCRIPTION_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationWarningsObject[["DESCRIPTION_LENGTH_TOO_LONG"]] <-
          self$`DESCRIPTION_LENGTH_TOO_LONG`$toJSON()
      }
      if (!is.null(self$`EXPIRATION_DATE_INVALID`)) {
        CatalogsItemValidationWarningsObject[["EXPIRATION_DATE_INVALID"]] <-
          self$`EXPIRATION_DATE_INVALID`$toJSON()
      }
      if (!is.null(self$`GENDER_INVALID`)) {
        CatalogsItemValidationWarningsObject[["GENDER_INVALID"]] <-
          self$`GENDER_INVALID`$toJSON()
      }
      if (!is.null(self$`GTIN_INVALID`)) {
        CatalogsItemValidationWarningsObject[["GTIN_INVALID"]] <-
          self$`GTIN_INVALID`$toJSON()
      }
      if (!is.null(self$`IMAGE_LINK_WARNING`)) {
        CatalogsItemValidationWarningsObject[["IMAGE_LINK_WARNING"]] <-
          self$`IMAGE_LINK_WARNING`$toJSON()
      }
      if (!is.null(self$`IOS_DEEP_LINK_INVALID`)) {
        CatalogsItemValidationWarningsObject[["IOS_DEEP_LINK_INVALID"]] <-
          self$`IOS_DEEP_LINK_INVALID`$toJSON()
      }
      if (!is.null(self$`IS_BUNDLE_INVALID`)) {
        CatalogsItemValidationWarningsObject[["IS_BUNDLE_INVALID"]] <-
          self$`IS_BUNDLE_INVALID`$toJSON()
      }
      if (!is.null(self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
        CatalogsItemValidationWarningsObject[["ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"]] <-
          self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`$toJSON()
      }
      if (!is.null(self$`LINK_FORMAT_WARNING`)) {
        CatalogsItemValidationWarningsObject[["LINK_FORMAT_WARNING"]] <-
          self$`LINK_FORMAT_WARNING`$toJSON()
      }
      if (!is.null(self$`MIN_AD_PRICE_INVALID`)) {
        CatalogsItemValidationWarningsObject[["MIN_AD_PRICE_INVALID"]] <-
          self$`MIN_AD_PRICE_INVALID`$toJSON()
      }
      if (!is.null(self$`MPN_INVALID`)) {
        CatalogsItemValidationWarningsObject[["MPN_INVALID"]] <-
          self$`MPN_INVALID`$toJSON()
      }
      if (!is.null(self$`MULTIPACK_INVALID`)) {
        CatalogsItemValidationWarningsObject[["MULTIPACK_INVALID"]] <-
          self$`MULTIPACK_INVALID`$toJSON()
      }
      if (!is.null(self$`OPTIONAL_CONDITION_INVALID`)) {
        CatalogsItemValidationWarningsObject[["OPTIONAL_CONDITION_INVALID"]] <-
          self$`OPTIONAL_CONDITION_INVALID`$toJSON()
      }
      if (!is.null(self$`OPTIONAL_CONDITION_MISSING`)) {
        CatalogsItemValidationWarningsObject[["OPTIONAL_CONDITION_MISSING"]] <-
          self$`OPTIONAL_CONDITION_MISSING`$toJSON()
      }
      if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
        CatalogsItemValidationWarningsObject[["OPTIONAL_PRODUCT_CATEGORY_INVALID"]] <-
          self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`$toJSON()
      }
      if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
        CatalogsItemValidationWarningsObject[["OPTIONAL_PRODUCT_CATEGORY_MISSING"]] <-
          self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`$toJSON()
      }
      if (!is.null(self$`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
        CatalogsItemValidationWarningsObject[["PRODUCT_CATEGORY_DEPTH_WARNING"]] <-
          self$`PRODUCT_CATEGORY_DEPTH_WARNING`$toJSON()
      }
      if (!is.null(self$`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationWarningsObject[["PRODUCT_TYPE_LENGTH_TOO_LONG"]] <-
          self$`PRODUCT_TYPE_LENGTH_TOO_LONG`$toJSON()
      }
      if (!is.null(self$`SALES_PRICE_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SALES_PRICE_INVALID"]] <-
          self$`SALES_PRICE_INVALID`$toJSON()
      }
      if (!is.null(self$`SALES_PRICE_TOO_LOW`)) {
        CatalogsItemValidationWarningsObject[["SALES_PRICE_TOO_LOW"]] <-
          self$`SALES_PRICE_TOO_LOW`$toJSON()
      }
      if (!is.null(self$`SALES_PRICE_TOO_HIGH`)) {
        CatalogsItemValidationWarningsObject[["SALES_PRICE_TOO_HIGH"]] <-
          self$`SALES_PRICE_TOO_HIGH`$toJSON()
      }
      if (!is.null(self$`SALE_DATE_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SALE_DATE_INVALID"]] <-
          self$`SALE_DATE_INVALID`$toJSON()
      }
      if (!is.null(self$`SHIPPING_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SHIPPING_INVALID"]] <-
          self$`SHIPPING_INVALID`$toJSON()
      }
      if (!is.null(self$`SHIPPING_HEIGHT_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SHIPPING_HEIGHT_INVALID"]] <-
          self$`SHIPPING_HEIGHT_INVALID`$toJSON()
      }
      if (!is.null(self$`SHIPPING_WEIGHT_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SHIPPING_WEIGHT_INVALID"]] <-
          self$`SHIPPING_WEIGHT_INVALID`$toJSON()
      }
      if (!is.null(self$`SHIPPING_WIDTH_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SHIPPING_WIDTH_INVALID"]] <-
          self$`SHIPPING_WIDTH_INVALID`$toJSON()
      }
      if (!is.null(self$`SIZE_TYPE_INVALID`)) {
        CatalogsItemValidationWarningsObject[["SIZE_TYPE_INVALID"]] <-
          self$`SIZE_TYPE_INVALID`$toJSON()
      }
      if (!is.null(self$`TAX_INVALID`)) {
        CatalogsItemValidationWarningsObject[["TAX_INVALID"]] <-
          self$`TAX_INVALID`$toJSON()
      }
      if (!is.null(self$`TITLE_LENGTH_TOO_LONG`)) {
        CatalogsItemValidationWarningsObject[["TITLE_LENGTH_TOO_LONG"]] <-
          self$`TITLE_LENGTH_TOO_LONG`$toJSON()
      }
      if (!is.null(self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
        CatalogsItemValidationWarningsObject[["TOO_MANY_ADDITIONAL_IMAGE_LINKS"]] <-
          self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`$toJSON()
      }
      if (!is.null(self$`UTM_SOURCE_AUTO_CORRECTED`)) {
        CatalogsItemValidationWarningsObject[["UTM_SOURCE_AUTO_CORRECTED"]] <-
          self$`UTM_SOURCE_AUTO_CORRECTED`$toJSON()
      }
      if (!is.null(self$`WEIGHT_UNIT_INVALID`)) {
        CatalogsItemValidationWarningsObject[["WEIGHT_UNIT_INVALID"]] <-
          self$`WEIGHT_UNIT_INVALID`$toJSON()
      }
      CatalogsItemValidationWarningsObject
    },
    #' Deserialize JSON string into an instance of CatalogsItemValidationWarnings
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationWarnings
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AD_LINK_FORMAT_WARNING`)) {
        `ad_link_format_warning_object` <- CatalogsItemValidationDetails$new()
        `ad_link_format_warning_object`$fromJSON(jsonlite::toJSON(this_object$`AD_LINK_FORMAT_WARNING`, auto_unbox = TRUE, digits = NA))
        self$`AD_LINK_FORMAT_WARNING` <- `ad_link_format_warning_object`
      }
      if (!is.null(this_object$`AD_LINK_SAME_AS_LINK`)) {
        `ad_link_same_as_link_object` <- CatalogsItemValidationDetails$new()
        `ad_link_same_as_link_object`$fromJSON(jsonlite::toJSON(this_object$`AD_LINK_SAME_AS_LINK`, auto_unbox = TRUE, digits = NA))
        self$`AD_LINK_SAME_AS_LINK` <- `ad_link_same_as_link_object`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
        `additional_image_link_length_too_long_object` <- CatalogsItemValidationDetails$new()
        `additional_image_link_length_too_long_object`$fromJSON(jsonlite::toJSON(this_object$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
        self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` <- `additional_image_link_length_too_long_object`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_LINK_WARNING`)) {
        `additional_image_link_warning_object` <- CatalogsItemValidationDetails$new()
        `additional_image_link_warning_object`$fromJSON(jsonlite::toJSON(this_object$`ADDITIONAL_IMAGE_LINK_WARNING`, auto_unbox = TRUE, digits = NA))
        self$`ADDITIONAL_IMAGE_LINK_WARNING` <- `additional_image_link_warning_object`
      }
      if (!is.null(this_object$`ADWORDS_FORMAT_WARNING`)) {
        `adwords_format_warning_object` <- CatalogsItemValidationDetails$new()
        `adwords_format_warning_object`$fromJSON(jsonlite::toJSON(this_object$`ADWORDS_FORMAT_WARNING`, auto_unbox = TRUE, digits = NA))
        self$`ADWORDS_FORMAT_WARNING` <- `adwords_format_warning_object`
      }
      if (!is.null(this_object$`ADWORDS_SAME_AS_LINK`)) {
        `adwords_same_as_link_object` <- CatalogsItemValidationDetails$new()
        `adwords_same_as_link_object`$fromJSON(jsonlite::toJSON(this_object$`ADWORDS_SAME_AS_LINK`, auto_unbox = TRUE, digits = NA))
        self$`ADWORDS_SAME_AS_LINK` <- `adwords_same_as_link_object`
      }
      if (!is.null(this_object$`AGE_GROUP_INVALID`)) {
        `age_group_invalid_object` <- CatalogsItemValidationDetails$new()
        `age_group_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`AGE_GROUP_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`AGE_GROUP_INVALID` <- `age_group_invalid_object`
      }
      if (!is.null(this_object$`SIZE_SYSTEM_INVALID`)) {
        `size_system_invalid_object` <- CatalogsItemValidationDetails$new()
        `size_system_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SIZE_SYSTEM_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SIZE_SYSTEM_INVALID` <- `size_system_invalid_object`
      }
      if (!is.null(this_object$`ANDROID_DEEP_LINK_INVALID`)) {
        `android_deep_link_invalid_object` <- CatalogsItemValidationDetails$new()
        `android_deep_link_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`ANDROID_DEEP_LINK_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`ANDROID_DEEP_LINK_INVALID` <- `android_deep_link_invalid_object`
      }
      if (!is.null(this_object$`AVAILABILITY_DATE_INVALID`)) {
        `availability_date_invalid_object` <- CatalogsItemValidationDetails$new()
        `availability_date_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY_DATE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`AVAILABILITY_DATE_INVALID` <- `availability_date_invalid_object`
      }
      if (!is.null(this_object$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
        `country_does_not_map_to_currency_object` <- CatalogsItemValidationDetails$new()
        `country_does_not_map_to_currency_object`$fromJSON(jsonlite::toJSON(this_object$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`, auto_unbox = TRUE, digits = NA))
        self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY` <- `country_does_not_map_to_currency_object`
      }
      if (!is.null(this_object$`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
        `custom_label_length_too_long_object` <- CatalogsItemValidationDetails$new()
        `custom_label_length_too_long_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_LENGTH_TOO_LONG` <- `custom_label_length_too_long_object`
      }
      if (!is.null(this_object$`DESCRIPTION_LENGTH_TOO_LONG`)) {
        `description_length_too_long_object` <- CatalogsItemValidationDetails$new()
        `description_length_too_long_object`$fromJSON(jsonlite::toJSON(this_object$`DESCRIPTION_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
        self$`DESCRIPTION_LENGTH_TOO_LONG` <- `description_length_too_long_object`
      }
      if (!is.null(this_object$`EXPIRATION_DATE_INVALID`)) {
        `expiration_date_invalid_object` <- CatalogsItemValidationDetails$new()
        `expiration_date_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`EXPIRATION_DATE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`EXPIRATION_DATE_INVALID` <- `expiration_date_invalid_object`
      }
      if (!is.null(this_object$`GENDER_INVALID`)) {
        `gender_invalid_object` <- CatalogsItemValidationDetails$new()
        `gender_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`GENDER_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`GENDER_INVALID` <- `gender_invalid_object`
      }
      if (!is.null(this_object$`GTIN_INVALID`)) {
        `gtin_invalid_object` <- CatalogsItemValidationDetails$new()
        `gtin_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`GTIN_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`GTIN_INVALID` <- `gtin_invalid_object`
      }
      if (!is.null(this_object$`IMAGE_LINK_WARNING`)) {
        `image_link_warning_object` <- CatalogsItemValidationDetails$new()
        `image_link_warning_object`$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_WARNING`, auto_unbox = TRUE, digits = NA))
        self$`IMAGE_LINK_WARNING` <- `image_link_warning_object`
      }
      if (!is.null(this_object$`IOS_DEEP_LINK_INVALID`)) {
        `ios_deep_link_invalid_object` <- CatalogsItemValidationDetails$new()
        `ios_deep_link_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`IOS_DEEP_LINK_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`IOS_DEEP_LINK_INVALID` <- `ios_deep_link_invalid_object`
      }
      if (!is.null(this_object$`IS_BUNDLE_INVALID`)) {
        `is_bundle_invalid_object` <- CatalogsItemValidationDetails$new()
        `is_bundle_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`IS_BUNDLE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`IS_BUNDLE_INVALID` <- `is_bundle_invalid_object`
      }
      if (!is.null(this_object$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
        `item_additional_image_download_failure_object` <- CatalogsItemValidationDetails$new()
        `item_additional_image_download_failure_object`$fromJSON(jsonlite::toJSON(this_object$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`, auto_unbox = TRUE, digits = NA))
        self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` <- `item_additional_image_download_failure_object`
      }
      if (!is.null(this_object$`LINK_FORMAT_WARNING`)) {
        `link_format_warning_object` <- CatalogsItemValidationDetails$new()
        `link_format_warning_object`$fromJSON(jsonlite::toJSON(this_object$`LINK_FORMAT_WARNING`, auto_unbox = TRUE, digits = NA))
        self$`LINK_FORMAT_WARNING` <- `link_format_warning_object`
      }
      if (!is.null(this_object$`MIN_AD_PRICE_INVALID`)) {
        `min_ad_price_invalid_object` <- CatalogsItemValidationDetails$new()
        `min_ad_price_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`MIN_AD_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`MIN_AD_PRICE_INVALID` <- `min_ad_price_invalid_object`
      }
      if (!is.null(this_object$`MPN_INVALID`)) {
        `mpn_invalid_object` <- CatalogsItemValidationDetails$new()
        `mpn_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`MPN_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`MPN_INVALID` <- `mpn_invalid_object`
      }
      if (!is.null(this_object$`MULTIPACK_INVALID`)) {
        `multipack_invalid_object` <- CatalogsItemValidationDetails$new()
        `multipack_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`MULTIPACK_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`MULTIPACK_INVALID` <- `multipack_invalid_object`
      }
      if (!is.null(this_object$`OPTIONAL_CONDITION_INVALID`)) {
        `optional_condition_invalid_object` <- CatalogsItemValidationDetails$new()
        `optional_condition_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_CONDITION_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`OPTIONAL_CONDITION_INVALID` <- `optional_condition_invalid_object`
      }
      if (!is.null(this_object$`OPTIONAL_CONDITION_MISSING`)) {
        `optional_condition_missing_object` <- CatalogsItemValidationDetails$new()
        `optional_condition_missing_object`$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_CONDITION_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`OPTIONAL_CONDITION_MISSING` <- `optional_condition_missing_object`
      }
      if (!is.null(this_object$`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
        `optional_product_category_invalid_object` <- CatalogsItemValidationDetails$new()
        `optional_product_category_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_PRODUCT_CATEGORY_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`OPTIONAL_PRODUCT_CATEGORY_INVALID` <- `optional_product_category_invalid_object`
      }
      if (!is.null(this_object$`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
        `optional_product_category_missing_object` <- CatalogsItemValidationDetails$new()
        `optional_product_category_missing_object`$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_PRODUCT_CATEGORY_MISSING`, auto_unbox = TRUE, digits = NA))
        self$`OPTIONAL_PRODUCT_CATEGORY_MISSING` <- `optional_product_category_missing_object`
      }
      if (!is.null(this_object$`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
        `product_category_depth_warning_object` <- CatalogsItemValidationDetails$new()
        `product_category_depth_warning_object`$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_CATEGORY_DEPTH_WARNING`, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_CATEGORY_DEPTH_WARNING` <- `product_category_depth_warning_object`
      }
      if (!is.null(this_object$`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
        `product_type_length_too_long_object` <- CatalogsItemValidationDetails$new()
        `product_type_length_too_long_object`$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_TYPE_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_TYPE_LENGTH_TOO_LONG` <- `product_type_length_too_long_object`
      }
      if (!is.null(this_object$`SALES_PRICE_INVALID`)) {
        `sales_price_invalid_object` <- CatalogsItemValidationDetails$new()
        `sales_price_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SALES_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SALES_PRICE_INVALID` <- `sales_price_invalid_object`
      }
      if (!is.null(this_object$`SALES_PRICE_TOO_LOW`)) {
        `sales_price_too_low_object` <- CatalogsItemValidationDetails$new()
        `sales_price_too_low_object`$fromJSON(jsonlite::toJSON(this_object$`SALES_PRICE_TOO_LOW`, auto_unbox = TRUE, digits = NA))
        self$`SALES_PRICE_TOO_LOW` <- `sales_price_too_low_object`
      }
      if (!is.null(this_object$`SALES_PRICE_TOO_HIGH`)) {
        `sales_price_too_high_object` <- CatalogsItemValidationDetails$new()
        `sales_price_too_high_object`$fromJSON(jsonlite::toJSON(this_object$`SALES_PRICE_TOO_HIGH`, auto_unbox = TRUE, digits = NA))
        self$`SALES_PRICE_TOO_HIGH` <- `sales_price_too_high_object`
      }
      if (!is.null(this_object$`SALE_DATE_INVALID`)) {
        `sale_date_invalid_object` <- CatalogsItemValidationDetails$new()
        `sale_date_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SALE_DATE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SALE_DATE_INVALID` <- `sale_date_invalid_object`
      }
      if (!is.null(this_object$`SHIPPING_INVALID`)) {
        `shipping_invalid_object` <- CatalogsItemValidationDetails$new()
        `shipping_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SHIPPING_INVALID` <- `shipping_invalid_object`
      }
      if (!is.null(this_object$`SHIPPING_HEIGHT_INVALID`)) {
        `shipping_height_invalid_object` <- CatalogsItemValidationDetails$new()
        `shipping_height_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_HEIGHT_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SHIPPING_HEIGHT_INVALID` <- `shipping_height_invalid_object`
      }
      if (!is.null(this_object$`SHIPPING_WEIGHT_INVALID`)) {
        `shipping_weight_invalid_object` <- CatalogsItemValidationDetails$new()
        `shipping_weight_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_WEIGHT_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SHIPPING_WEIGHT_INVALID` <- `shipping_weight_invalid_object`
      }
      if (!is.null(this_object$`SHIPPING_WIDTH_INVALID`)) {
        `shipping_width_invalid_object` <- CatalogsItemValidationDetails$new()
        `shipping_width_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_WIDTH_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SHIPPING_WIDTH_INVALID` <- `shipping_width_invalid_object`
      }
      if (!is.null(this_object$`SIZE_TYPE_INVALID`)) {
        `size_type_invalid_object` <- CatalogsItemValidationDetails$new()
        `size_type_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`SIZE_TYPE_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`SIZE_TYPE_INVALID` <- `size_type_invalid_object`
      }
      if (!is.null(this_object$`TAX_INVALID`)) {
        `tax_invalid_object` <- CatalogsItemValidationDetails$new()
        `tax_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`TAX_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`TAX_INVALID` <- `tax_invalid_object`
      }
      if (!is.null(this_object$`TITLE_LENGTH_TOO_LONG`)) {
        `title_length_too_long_object` <- CatalogsItemValidationDetails$new()
        `title_length_too_long_object`$fromJSON(jsonlite::toJSON(this_object$`TITLE_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
        self$`TITLE_LENGTH_TOO_LONG` <- `title_length_too_long_object`
      }
      if (!is.null(this_object$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
        `too_many_additional_image_links_object` <- CatalogsItemValidationDetails$new()
        `too_many_additional_image_links_object`$fromJSON(jsonlite::toJSON(this_object$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`, auto_unbox = TRUE, digits = NA))
        self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS` <- `too_many_additional_image_links_object`
      }
      if (!is.null(this_object$`UTM_SOURCE_AUTO_CORRECTED`)) {
        `utm_source_auto_corrected_object` <- CatalogsItemValidationDetails$new()
        `utm_source_auto_corrected_object`$fromJSON(jsonlite::toJSON(this_object$`UTM_SOURCE_AUTO_CORRECTED`, auto_unbox = TRUE, digits = NA))
        self$`UTM_SOURCE_AUTO_CORRECTED` <- `utm_source_auto_corrected_object`
      }
      if (!is.null(this_object$`WEIGHT_UNIT_INVALID`)) {
        `weight_unit_invalid_object` <- CatalogsItemValidationDetails$new()
        `weight_unit_invalid_object`$fromJSON(jsonlite::toJSON(this_object$`WEIGHT_UNIT_INVALID`, auto_unbox = TRUE, digits = NA))
        self$`WEIGHT_UNIT_INVALID` <- `weight_unit_invalid_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationWarnings in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`AD_LINK_FORMAT_WARNING`)) {
          sprintf(
          '"AD_LINK_FORMAT_WARNING":
          %s
          ',
          jsonlite::toJSON(self$`AD_LINK_FORMAT_WARNING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`AD_LINK_SAME_AS_LINK`)) {
          sprintf(
          '"AD_LINK_SAME_AS_LINK":
          %s
          ',
          jsonlite::toJSON(self$`AD_LINK_SAME_AS_LINK`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG":
          %s
          ',
          jsonlite::toJSON(self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_LINK_WARNING`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_LINK_WARNING":
          %s
          ',
          jsonlite::toJSON(self$`ADDITIONAL_IMAGE_LINK_WARNING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ADWORDS_FORMAT_WARNING`)) {
          sprintf(
          '"ADWORDS_FORMAT_WARNING":
          %s
          ',
          jsonlite::toJSON(self$`ADWORDS_FORMAT_WARNING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ADWORDS_SAME_AS_LINK`)) {
          sprintf(
          '"ADWORDS_SAME_AS_LINK":
          %s
          ',
          jsonlite::toJSON(self$`ADWORDS_SAME_AS_LINK`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`AGE_GROUP_INVALID`)) {
          sprintf(
          '"AGE_GROUP_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`AGE_GROUP_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SIZE_SYSTEM_INVALID`)) {
          sprintf(
          '"SIZE_SYSTEM_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SIZE_SYSTEM_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ANDROID_DEEP_LINK_INVALID`)) {
          sprintf(
          '"ANDROID_DEEP_LINK_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`ANDROID_DEEP_LINK_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`AVAILABILITY_DATE_INVALID`)) {
          sprintf(
          '"AVAILABILITY_DATE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`AVAILABILITY_DATE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
          sprintf(
          '"COUNTRY_DOES_NOT_MAP_TO_CURRENCY":
          %s
          ',
          jsonlite::toJSON(self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
          sprintf(
          '"CUSTOM_LABEL_LENGTH_TOO_LONG":
          %s
          ',
          jsonlite::toJSON(self$`CUSTOM_LABEL_LENGTH_TOO_LONG`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`DESCRIPTION_LENGTH_TOO_LONG`)) {
          sprintf(
          '"DESCRIPTION_LENGTH_TOO_LONG":
          %s
          ',
          jsonlite::toJSON(self$`DESCRIPTION_LENGTH_TOO_LONG`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`EXPIRATION_DATE_INVALID`)) {
          sprintf(
          '"EXPIRATION_DATE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`EXPIRATION_DATE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`GENDER_INVALID`)) {
          sprintf(
          '"GENDER_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`GENDER_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`GTIN_INVALID`)) {
          sprintf(
          '"GTIN_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`GTIN_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`IMAGE_LINK_WARNING`)) {
          sprintf(
          '"IMAGE_LINK_WARNING":
          %s
          ',
          jsonlite::toJSON(self$`IMAGE_LINK_WARNING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`IOS_DEEP_LINK_INVALID`)) {
          sprintf(
          '"IOS_DEEP_LINK_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`IOS_DEEP_LINK_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`IS_BUNDLE_INVALID`)) {
          sprintf(
          '"IS_BUNDLE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`IS_BUNDLE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
          sprintf(
          '"ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE":
          %s
          ',
          jsonlite::toJSON(self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`LINK_FORMAT_WARNING`)) {
          sprintf(
          '"LINK_FORMAT_WARNING":
          %s
          ',
          jsonlite::toJSON(self$`LINK_FORMAT_WARNING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`MIN_AD_PRICE_INVALID`)) {
          sprintf(
          '"MIN_AD_PRICE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`MIN_AD_PRICE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`MPN_INVALID`)) {
          sprintf(
          '"MPN_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`MPN_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`MULTIPACK_INVALID`)) {
          sprintf(
          '"MULTIPACK_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`MULTIPACK_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`OPTIONAL_CONDITION_INVALID`)) {
          sprintf(
          '"OPTIONAL_CONDITION_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`OPTIONAL_CONDITION_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`OPTIONAL_CONDITION_MISSING`)) {
          sprintf(
          '"OPTIONAL_CONDITION_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`OPTIONAL_CONDITION_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
          sprintf(
          '"OPTIONAL_PRODUCT_CATEGORY_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
          sprintf(
          '"OPTIONAL_PRODUCT_CATEGORY_MISSING":
          %s
          ',
          jsonlite::toJSON(self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
          sprintf(
          '"PRODUCT_CATEGORY_DEPTH_WARNING":
          %s
          ',
          jsonlite::toJSON(self$`PRODUCT_CATEGORY_DEPTH_WARNING`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
          sprintf(
          '"PRODUCT_TYPE_LENGTH_TOO_LONG":
          %s
          ',
          jsonlite::toJSON(self$`PRODUCT_TYPE_LENGTH_TOO_LONG`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SALES_PRICE_INVALID`)) {
          sprintf(
          '"SALES_PRICE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SALES_PRICE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SALES_PRICE_TOO_LOW`)) {
          sprintf(
          '"SALES_PRICE_TOO_LOW":
          %s
          ',
          jsonlite::toJSON(self$`SALES_PRICE_TOO_LOW`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SALES_PRICE_TOO_HIGH`)) {
          sprintf(
          '"SALES_PRICE_TOO_HIGH":
          %s
          ',
          jsonlite::toJSON(self$`SALES_PRICE_TOO_HIGH`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SALE_DATE_INVALID`)) {
          sprintf(
          '"SALE_DATE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SALE_DATE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SHIPPING_INVALID`)) {
          sprintf(
          '"SHIPPING_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SHIPPING_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SHIPPING_HEIGHT_INVALID`)) {
          sprintf(
          '"SHIPPING_HEIGHT_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SHIPPING_HEIGHT_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SHIPPING_WEIGHT_INVALID`)) {
          sprintf(
          '"SHIPPING_WEIGHT_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SHIPPING_WEIGHT_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SHIPPING_WIDTH_INVALID`)) {
          sprintf(
          '"SHIPPING_WIDTH_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SHIPPING_WIDTH_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`SIZE_TYPE_INVALID`)) {
          sprintf(
          '"SIZE_TYPE_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`SIZE_TYPE_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`TAX_INVALID`)) {
          sprintf(
          '"TAX_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`TAX_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`TITLE_LENGTH_TOO_LONG`)) {
          sprintf(
          '"TITLE_LENGTH_TOO_LONG":
          %s
          ',
          jsonlite::toJSON(self$`TITLE_LENGTH_TOO_LONG`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
          sprintf(
          '"TOO_MANY_ADDITIONAL_IMAGE_LINKS":
          %s
          ',
          jsonlite::toJSON(self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`UTM_SOURCE_AUTO_CORRECTED`)) {
          sprintf(
          '"UTM_SOURCE_AUTO_CORRECTED":
          %s
          ',
          jsonlite::toJSON(self$`UTM_SOURCE_AUTO_CORRECTED`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`WEIGHT_UNIT_INVALID`)) {
          sprintf(
          '"WEIGHT_UNIT_INVALID":
          %s
          ',
          jsonlite::toJSON(self$`WEIGHT_UNIT_INVALID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsItemValidationWarnings
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationWarnings
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AD_LINK_FORMAT_WARNING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`AD_LINK_FORMAT_WARNING`, auto_unbox = TRUE, digits = NA))
      self$`AD_LINK_SAME_AS_LINK` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`AD_LINK_SAME_AS_LINK`, auto_unbox = TRUE, digits = NA))
      self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
      self$`ADDITIONAL_IMAGE_LINK_WARNING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ADDITIONAL_IMAGE_LINK_WARNING`, auto_unbox = TRUE, digits = NA))
      self$`ADWORDS_FORMAT_WARNING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ADWORDS_FORMAT_WARNING`, auto_unbox = TRUE, digits = NA))
      self$`ADWORDS_SAME_AS_LINK` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ADWORDS_SAME_AS_LINK`, auto_unbox = TRUE, digits = NA))
      self$`AGE_GROUP_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`AGE_GROUP_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`SIZE_SYSTEM_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SIZE_SYSTEM_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`ANDROID_DEEP_LINK_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ANDROID_DEEP_LINK_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`AVAILABILITY_DATE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`AVAILABILITY_DATE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`, auto_unbox = TRUE, digits = NA))
      self$`CUSTOM_LABEL_LENGTH_TOO_LONG` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
      self$`DESCRIPTION_LENGTH_TOO_LONG` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`DESCRIPTION_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
      self$`EXPIRATION_DATE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`EXPIRATION_DATE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`GENDER_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`GENDER_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`GTIN_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`GTIN_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`IMAGE_LINK_WARNING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`IMAGE_LINK_WARNING`, auto_unbox = TRUE, digits = NA))
      self$`IOS_DEEP_LINK_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`IOS_DEEP_LINK_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`IS_BUNDLE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`IS_BUNDLE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`, auto_unbox = TRUE, digits = NA))
      self$`LINK_FORMAT_WARNING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`LINK_FORMAT_WARNING`, auto_unbox = TRUE, digits = NA))
      self$`MIN_AD_PRICE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`MIN_AD_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`MPN_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`MPN_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`MULTIPACK_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`MULTIPACK_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`OPTIONAL_CONDITION_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_CONDITION_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`OPTIONAL_CONDITION_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_CONDITION_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`OPTIONAL_PRODUCT_CATEGORY_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_PRODUCT_CATEGORY_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`OPTIONAL_PRODUCT_CATEGORY_MISSING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`OPTIONAL_PRODUCT_CATEGORY_MISSING`, auto_unbox = TRUE, digits = NA))
      self$`PRODUCT_CATEGORY_DEPTH_WARNING` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_CATEGORY_DEPTH_WARNING`, auto_unbox = TRUE, digits = NA))
      self$`PRODUCT_TYPE_LENGTH_TOO_LONG` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_TYPE_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
      self$`SALES_PRICE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SALES_PRICE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`SALES_PRICE_TOO_LOW` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SALES_PRICE_TOO_LOW`, auto_unbox = TRUE, digits = NA))
      self$`SALES_PRICE_TOO_HIGH` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SALES_PRICE_TOO_HIGH`, auto_unbox = TRUE, digits = NA))
      self$`SALE_DATE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SALE_DATE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`SHIPPING_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`SHIPPING_HEIGHT_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_HEIGHT_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`SHIPPING_WEIGHT_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_WEIGHT_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`SHIPPING_WIDTH_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SHIPPING_WIDTH_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`SIZE_TYPE_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`SIZE_TYPE_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`TAX_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`TAX_INVALID`, auto_unbox = TRUE, digits = NA))
      self$`TITLE_LENGTH_TOO_LONG` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`TITLE_LENGTH_TOO_LONG`, auto_unbox = TRUE, digits = NA))
      self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`, auto_unbox = TRUE, digits = NA))
      self$`UTM_SOURCE_AUTO_CORRECTED` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`UTM_SOURCE_AUTO_CORRECTED`, auto_unbox = TRUE, digits = NA))
      self$`WEIGHT_UNIT_INVALID` <- CatalogsItemValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`WEIGHT_UNIT_INVALID`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsItemValidationWarnings
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsItemValidationWarnings and throw an exception if invalid
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
    #' @return String representation of CatalogsItemValidationWarnings
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
# CatalogsItemValidationWarnings$unlock()
#
## Below is an example to define the print function
# CatalogsItemValidationWarnings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemValidationWarnings$lock()

