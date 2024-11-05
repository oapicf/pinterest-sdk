#' Create a new CatalogsFeedValidationWarnings
#'
#' @description
#' CatalogsFeedValidationWarnings Class
#'
#' @docType class
#' @title CatalogsFeedValidationWarnings
#' @description CatalogsFeedValidationWarnings Class
#' @format An \code{R6Class} generator object
#' @field AD_LINK_FORMAT_WARNING Some items have ad links that are formatted incorrectly. integer [optional]
#' @field AD_LINK_SAME_AS_LINK Some items have ad link URLs that are duplicates of the link URLs for those items. integer [optional]
#' @field TITLE_LENGTH_TOO_LONG The title for some items were truncated because they contain too many characters. integer [optional]
#' @field DESCRIPTION_LENGTH_TOO_LONG The description for some items were truncated because they contain too many characters. integer [optional]
#' @field GENDER_INVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. integer [optional]
#' @field AGE_GROUP_INVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. integer [optional]
#' @field SIZE_TYPE_INVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. integer [optional]
#' @field SIZE_SYSTEM_INVALID Some items have size system values which are not one of the supported size systems. integer [optional]
#' @field LINK_FORMAT_WARNING Some items have an invalid product link which contains invalid UTM tracking paramaters. integer [optional]
#' @field SALES_PRICE_INVALID Some items have sale price values that are higher than the original price of the item. integer [optional]
#' @field PRODUCT_CATEGORY_DEPTH_WARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. integer [optional]
#' @field ADWORDS_FORMAT_WARNING Some items have adwords_redirect links that are formatted incorrectly. integer [optional]
#' @field ADWORDS_SAME_AS_LINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. integer [optional]
#' @field DUPLICATE_HEADERS Your feed contains duplicate headers. integer [optional]
#' @field FETCH_SAME_SIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update. integer [optional]
#' @field ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published. integer [optional]
#' @field ADDITIONAL_IMAGE_LINK_WARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. integer [optional]
#' @field IMAGE_LINK_WARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items. integer [optional]
#' @field SHIPPING_INVALID Some items have shipping values that are formatted incorrectly. integer [optional]
#' @field TAX_INVALID Some items have tax values that are formatted incorrectly. integer [optional]
#' @field SHIPPING_WEIGHT_INVALID Some items have invalid shipping_weight values. integer [optional]
#' @field EXPIRATION_DATE_INVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. integer [optional]
#' @field AVAILABILITY_DATE_INVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. integer [optional]
#' @field SALE_DATE_INVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. integer [optional]
#' @field WEIGHT_UNIT_INVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. integer [optional]
#' @field IS_BUNDLE_INVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. integer [optional]
#' @field UPDATED_TIME_INVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. integer [optional]
#' @field CUSTOM_LABEL_LENGTH_TOO_LONG Some items have custom_label values that are too long, those items will be published without that custom label. integer [optional]
#' @field PRODUCT_TYPE_LENGTH_TOO_LONG Some items have product_type values that are too long, those items will be published without that product type. integer [optional]
#' @field TOO_MANY_ADDITIONAL_IMAGE_LINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. integer [optional]
#' @field MULTIPACK_INVALID Some items have invalid multipack values. integer [optional]
#' @field INDEXED_PRODUCT_COUNT_LARGE_DELTA The product count has increased or decreased significantly compared to the last successful ingestion. integer [optional]
#' @field ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE Some items include additional_image_links that can't be found. integer [optional]
#' @field OPTIONAL_PRODUCT_CATEGORY_MISSING Some items are missing a google_product_category. integer [optional]
#' @field OPTIONAL_PRODUCT_CATEGORY_INVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. integer [optional]
#' @field OPTIONAL_CONDITION_MISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. integer [optional]
#' @field OPTIONAL_CONDITION_INVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. integer [optional]
#' @field IOS_DEEP_LINK_INVALID Some items include invalid ios_deep_link values. integer [optional]
#' @field ANDROID_DEEP_LINK_INVALID Some items include invalid android_deep_link. integer [optional]
#' @field UTM_SOURCE_AUTO_CORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected. integer [optional]
#' @field COUNTRY_DOES_NOT_MAP_TO_CURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped. integer [optional]
#' @field MIN_AD_PRICE_INVALID Some items include min_ad_price values that are formatted incorrectly. integer [optional]
#' @field GTIN_INVALID Some items include incorrectly formatted GTINs. integer [optional]
#' @field INCONSISTENT_CURRENCY_VALUES Some items include inconsistent currencies in price fields. integer [optional]
#' @field SALES_PRICE_TOO_LOW Some items include sales price that is much lower than the list price. integer [optional]
#' @field SHIPPING_WIDTH_INVALID Some items include incorrectly formatted shipping_width. integer [optional]
#' @field SHIPPING_HEIGHT_INVALID Some items include incorrectly formatted shipping_height. integer [optional]
#' @field SALES_PRICE_TOO_HIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. integer [optional]
#' @field MPN_INVALID Some items include incorrectly formatted MPNs. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedValidationWarnings <- R6::R6Class(
  "CatalogsFeedValidationWarnings",
  public = list(
    `AD_LINK_FORMAT_WARNING` = NULL,
    `AD_LINK_SAME_AS_LINK` = NULL,
    `TITLE_LENGTH_TOO_LONG` = NULL,
    `DESCRIPTION_LENGTH_TOO_LONG` = NULL,
    `GENDER_INVALID` = NULL,
    `AGE_GROUP_INVALID` = NULL,
    `SIZE_TYPE_INVALID` = NULL,
    `SIZE_SYSTEM_INVALID` = NULL,
    `LINK_FORMAT_WARNING` = NULL,
    `SALES_PRICE_INVALID` = NULL,
    `PRODUCT_CATEGORY_DEPTH_WARNING` = NULL,
    `ADWORDS_FORMAT_WARNING` = NULL,
    `ADWORDS_SAME_AS_LINK` = NULL,
    `DUPLICATE_HEADERS` = NULL,
    `FETCH_SAME_SIGNATURE` = NULL,
    `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` = NULL,
    `ADDITIONAL_IMAGE_LINK_WARNING` = NULL,
    `IMAGE_LINK_WARNING` = NULL,
    `SHIPPING_INVALID` = NULL,
    `TAX_INVALID` = NULL,
    `SHIPPING_WEIGHT_INVALID` = NULL,
    `EXPIRATION_DATE_INVALID` = NULL,
    `AVAILABILITY_DATE_INVALID` = NULL,
    `SALE_DATE_INVALID` = NULL,
    `WEIGHT_UNIT_INVALID` = NULL,
    `IS_BUNDLE_INVALID` = NULL,
    `UPDATED_TIME_INVALID` = NULL,
    `CUSTOM_LABEL_LENGTH_TOO_LONG` = NULL,
    `PRODUCT_TYPE_LENGTH_TOO_LONG` = NULL,
    `TOO_MANY_ADDITIONAL_IMAGE_LINKS` = NULL,
    `MULTIPACK_INVALID` = NULL,
    `INDEXED_PRODUCT_COUNT_LARGE_DELTA` = NULL,
    `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` = NULL,
    `OPTIONAL_PRODUCT_CATEGORY_MISSING` = NULL,
    `OPTIONAL_PRODUCT_CATEGORY_INVALID` = NULL,
    `OPTIONAL_CONDITION_MISSING` = NULL,
    `OPTIONAL_CONDITION_INVALID` = NULL,
    `IOS_DEEP_LINK_INVALID` = NULL,
    `ANDROID_DEEP_LINK_INVALID` = NULL,
    `UTM_SOURCE_AUTO_CORRECTED` = NULL,
    `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` = NULL,
    `MIN_AD_PRICE_INVALID` = NULL,
    `GTIN_INVALID` = NULL,
    `INCONSISTENT_CURRENCY_VALUES` = NULL,
    `SALES_PRICE_TOO_LOW` = NULL,
    `SHIPPING_WIDTH_INVALID` = NULL,
    `SHIPPING_HEIGHT_INVALID` = NULL,
    `SALES_PRICE_TOO_HIGH` = NULL,
    `MPN_INVALID` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedValidationWarnings class.
    #'
    #' @param AD_LINK_FORMAT_WARNING Some items have ad links that are formatted incorrectly.
    #' @param AD_LINK_SAME_AS_LINK Some items have ad link URLs that are duplicates of the link URLs for those items.
    #' @param TITLE_LENGTH_TOO_LONG The title for some items were truncated because they contain too many characters.
    #' @param DESCRIPTION_LENGTH_TOO_LONG The description for some items were truncated because they contain too many characters.
    #' @param GENDER_INVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #' @param AGE_GROUP_INVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #' @param SIZE_TYPE_INVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #' @param SIZE_SYSTEM_INVALID Some items have size system values which are not one of the supported size systems.
    #' @param LINK_FORMAT_WARNING Some items have an invalid product link which contains invalid UTM tracking paramaters.
    #' @param SALES_PRICE_INVALID Some items have sale price values that are higher than the original price of the item.
    #' @param PRODUCT_CATEGORY_DEPTH_WARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
    #' @param ADWORDS_FORMAT_WARNING Some items have adwords_redirect links that are formatted incorrectly.
    #' @param ADWORDS_SAME_AS_LINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
    #' @param DUPLICATE_HEADERS Your feed contains duplicate headers.
    #' @param FETCH_SAME_SIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update.
    #' @param ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
    #' @param ADDITIONAL_IMAGE_LINK_WARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
    #' @param IMAGE_LINK_WARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
    #' @param SHIPPING_INVALID Some items have shipping values that are formatted incorrectly.
    #' @param TAX_INVALID Some items have tax values that are formatted incorrectly.
    #' @param SHIPPING_WEIGHT_INVALID Some items have invalid shipping_weight values.
    #' @param EXPIRATION_DATE_INVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
    #' @param AVAILABILITY_DATE_INVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
    #' @param SALE_DATE_INVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
    #' @param WEIGHT_UNIT_INVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
    #' @param IS_BUNDLE_INVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
    #' @param UPDATED_TIME_INVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
    #' @param CUSTOM_LABEL_LENGTH_TOO_LONG Some items have custom_label values that are too long, those items will be published without that custom label.
    #' @param PRODUCT_TYPE_LENGTH_TOO_LONG Some items have product_type values that are too long, those items will be published without that product type.
    #' @param TOO_MANY_ADDITIONAL_IMAGE_LINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
    #' @param MULTIPACK_INVALID Some items have invalid multipack values.
    #' @param INDEXED_PRODUCT_COUNT_LARGE_DELTA The product count has increased or decreased significantly compared to the last successful ingestion.
    #' @param ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE Some items include additional_image_links that can't be found.
    #' @param OPTIONAL_PRODUCT_CATEGORY_MISSING Some items are missing a google_product_category.
    #' @param OPTIONAL_PRODUCT_CATEGORY_INVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
    #' @param OPTIONAL_CONDITION_MISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
    #' @param OPTIONAL_CONDITION_INVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #' @param IOS_DEEP_LINK_INVALID Some items include invalid ios_deep_link values.
    #' @param ANDROID_DEEP_LINK_INVALID Some items include invalid android_deep_link.
    #' @param UTM_SOURCE_AUTO_CORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
    #' @param COUNTRY_DOES_NOT_MAP_TO_CURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
    #' @param MIN_AD_PRICE_INVALID Some items include min_ad_price values that are formatted incorrectly.
    #' @param GTIN_INVALID Some items include incorrectly formatted GTINs.
    #' @param INCONSISTENT_CURRENCY_VALUES Some items include inconsistent currencies in price fields.
    #' @param SALES_PRICE_TOO_LOW Some items include sales price that is much lower than the list price.
    #' @param SHIPPING_WIDTH_INVALID Some items include incorrectly formatted shipping_width.
    #' @param SHIPPING_HEIGHT_INVALID Some items include incorrectly formatted shipping_height.
    #' @param SALES_PRICE_TOO_HIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
    #' @param MPN_INVALID Some items include incorrectly formatted MPNs.
    #' @param ... Other optional arguments.
    initialize = function(`AD_LINK_FORMAT_WARNING` = NULL, `AD_LINK_SAME_AS_LINK` = NULL, `TITLE_LENGTH_TOO_LONG` = NULL, `DESCRIPTION_LENGTH_TOO_LONG` = NULL, `GENDER_INVALID` = NULL, `AGE_GROUP_INVALID` = NULL, `SIZE_TYPE_INVALID` = NULL, `SIZE_SYSTEM_INVALID` = NULL, `LINK_FORMAT_WARNING` = NULL, `SALES_PRICE_INVALID` = NULL, `PRODUCT_CATEGORY_DEPTH_WARNING` = NULL, `ADWORDS_FORMAT_WARNING` = NULL, `ADWORDS_SAME_AS_LINK` = NULL, `DUPLICATE_HEADERS` = NULL, `FETCH_SAME_SIGNATURE` = NULL, `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` = NULL, `ADDITIONAL_IMAGE_LINK_WARNING` = NULL, `IMAGE_LINK_WARNING` = NULL, `SHIPPING_INVALID` = NULL, `TAX_INVALID` = NULL, `SHIPPING_WEIGHT_INVALID` = NULL, `EXPIRATION_DATE_INVALID` = NULL, `AVAILABILITY_DATE_INVALID` = NULL, `SALE_DATE_INVALID` = NULL, `WEIGHT_UNIT_INVALID` = NULL, `IS_BUNDLE_INVALID` = NULL, `UPDATED_TIME_INVALID` = NULL, `CUSTOM_LABEL_LENGTH_TOO_LONG` = NULL, `PRODUCT_TYPE_LENGTH_TOO_LONG` = NULL, `TOO_MANY_ADDITIONAL_IMAGE_LINKS` = NULL, `MULTIPACK_INVALID` = NULL, `INDEXED_PRODUCT_COUNT_LARGE_DELTA` = NULL, `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` = NULL, `OPTIONAL_PRODUCT_CATEGORY_MISSING` = NULL, `OPTIONAL_PRODUCT_CATEGORY_INVALID` = NULL, `OPTIONAL_CONDITION_MISSING` = NULL, `OPTIONAL_CONDITION_INVALID` = NULL, `IOS_DEEP_LINK_INVALID` = NULL, `ANDROID_DEEP_LINK_INVALID` = NULL, `UTM_SOURCE_AUTO_CORRECTED` = NULL, `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` = NULL, `MIN_AD_PRICE_INVALID` = NULL, `GTIN_INVALID` = NULL, `INCONSISTENT_CURRENCY_VALUES` = NULL, `SALES_PRICE_TOO_LOW` = NULL, `SHIPPING_WIDTH_INVALID` = NULL, `SHIPPING_HEIGHT_INVALID` = NULL, `SALES_PRICE_TOO_HIGH` = NULL, `MPN_INVALID` = NULL, ...) {
      if (!is.null(`AD_LINK_FORMAT_WARNING`)) {
        if (!(is.numeric(`AD_LINK_FORMAT_WARNING`) && length(`AD_LINK_FORMAT_WARNING`) == 1)) {
          stop(paste("Error! Invalid data for `AD_LINK_FORMAT_WARNING`. Must be an integer:", `AD_LINK_FORMAT_WARNING`))
        }
        self$`AD_LINK_FORMAT_WARNING` <- `AD_LINK_FORMAT_WARNING`
      }
      if (!is.null(`AD_LINK_SAME_AS_LINK`)) {
        if (!(is.numeric(`AD_LINK_SAME_AS_LINK`) && length(`AD_LINK_SAME_AS_LINK`) == 1)) {
          stop(paste("Error! Invalid data for `AD_LINK_SAME_AS_LINK`. Must be an integer:", `AD_LINK_SAME_AS_LINK`))
        }
        self$`AD_LINK_SAME_AS_LINK` <- `AD_LINK_SAME_AS_LINK`
      }
      if (!is.null(`TITLE_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`TITLE_LENGTH_TOO_LONG`) && length(`TITLE_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `TITLE_LENGTH_TOO_LONG`. Must be an integer:", `TITLE_LENGTH_TOO_LONG`))
        }
        self$`TITLE_LENGTH_TOO_LONG` <- `TITLE_LENGTH_TOO_LONG`
      }
      if (!is.null(`DESCRIPTION_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`DESCRIPTION_LENGTH_TOO_LONG`) && length(`DESCRIPTION_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `DESCRIPTION_LENGTH_TOO_LONG`. Must be an integer:", `DESCRIPTION_LENGTH_TOO_LONG`))
        }
        self$`DESCRIPTION_LENGTH_TOO_LONG` <- `DESCRIPTION_LENGTH_TOO_LONG`
      }
      if (!is.null(`GENDER_INVALID`)) {
        if (!(is.numeric(`GENDER_INVALID`) && length(`GENDER_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `GENDER_INVALID`. Must be an integer:", `GENDER_INVALID`))
        }
        self$`GENDER_INVALID` <- `GENDER_INVALID`
      }
      if (!is.null(`AGE_GROUP_INVALID`)) {
        if (!(is.numeric(`AGE_GROUP_INVALID`) && length(`AGE_GROUP_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `AGE_GROUP_INVALID`. Must be an integer:", `AGE_GROUP_INVALID`))
        }
        self$`AGE_GROUP_INVALID` <- `AGE_GROUP_INVALID`
      }
      if (!is.null(`SIZE_TYPE_INVALID`)) {
        if (!(is.numeric(`SIZE_TYPE_INVALID`) && length(`SIZE_TYPE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SIZE_TYPE_INVALID`. Must be an integer:", `SIZE_TYPE_INVALID`))
        }
        self$`SIZE_TYPE_INVALID` <- `SIZE_TYPE_INVALID`
      }
      if (!is.null(`SIZE_SYSTEM_INVALID`)) {
        if (!(is.numeric(`SIZE_SYSTEM_INVALID`) && length(`SIZE_SYSTEM_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SIZE_SYSTEM_INVALID`. Must be an integer:", `SIZE_SYSTEM_INVALID`))
        }
        self$`SIZE_SYSTEM_INVALID` <- `SIZE_SYSTEM_INVALID`
      }
      if (!is.null(`LINK_FORMAT_WARNING`)) {
        if (!(is.numeric(`LINK_FORMAT_WARNING`) && length(`LINK_FORMAT_WARNING`) == 1)) {
          stop(paste("Error! Invalid data for `LINK_FORMAT_WARNING`. Must be an integer:", `LINK_FORMAT_WARNING`))
        }
        self$`LINK_FORMAT_WARNING` <- `LINK_FORMAT_WARNING`
      }
      if (!is.null(`SALES_PRICE_INVALID`)) {
        if (!(is.numeric(`SALES_PRICE_INVALID`) && length(`SALES_PRICE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SALES_PRICE_INVALID`. Must be an integer:", `SALES_PRICE_INVALID`))
        }
        self$`SALES_PRICE_INVALID` <- `SALES_PRICE_INVALID`
      }
      if (!is.null(`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
        if (!(is.numeric(`PRODUCT_CATEGORY_DEPTH_WARNING`) && length(`PRODUCT_CATEGORY_DEPTH_WARNING`) == 1)) {
          stop(paste("Error! Invalid data for `PRODUCT_CATEGORY_DEPTH_WARNING`. Must be an integer:", `PRODUCT_CATEGORY_DEPTH_WARNING`))
        }
        self$`PRODUCT_CATEGORY_DEPTH_WARNING` <- `PRODUCT_CATEGORY_DEPTH_WARNING`
      }
      if (!is.null(`ADWORDS_FORMAT_WARNING`)) {
        if (!(is.numeric(`ADWORDS_FORMAT_WARNING`) && length(`ADWORDS_FORMAT_WARNING`) == 1)) {
          stop(paste("Error! Invalid data for `ADWORDS_FORMAT_WARNING`. Must be an integer:", `ADWORDS_FORMAT_WARNING`))
        }
        self$`ADWORDS_FORMAT_WARNING` <- `ADWORDS_FORMAT_WARNING`
      }
      if (!is.null(`ADWORDS_SAME_AS_LINK`)) {
        if (!(is.numeric(`ADWORDS_SAME_AS_LINK`) && length(`ADWORDS_SAME_AS_LINK`) == 1)) {
          stop(paste("Error! Invalid data for `ADWORDS_SAME_AS_LINK`. Must be an integer:", `ADWORDS_SAME_AS_LINK`))
        }
        self$`ADWORDS_SAME_AS_LINK` <- `ADWORDS_SAME_AS_LINK`
      }
      if (!is.null(`DUPLICATE_HEADERS`)) {
        if (!(is.numeric(`DUPLICATE_HEADERS`) && length(`DUPLICATE_HEADERS`) == 1)) {
          stop(paste("Error! Invalid data for `DUPLICATE_HEADERS`. Must be an integer:", `DUPLICATE_HEADERS`))
        }
        self$`DUPLICATE_HEADERS` <- `DUPLICATE_HEADERS`
      }
      if (!is.null(`FETCH_SAME_SIGNATURE`)) {
        if (!(`FETCH_SAME_SIGNATURE` %in% c("1"))) {
          stop(paste("Error! \"", `FETCH_SAME_SIGNATURE`, "\" cannot be assigned to `FETCH_SAME_SIGNATURE`. Must be \"1\".", sep = ""))
        }
        if (!(is.numeric(`FETCH_SAME_SIGNATURE`) && length(`FETCH_SAME_SIGNATURE`) == 1)) {
          stop(paste("Error! Invalid data for `FETCH_SAME_SIGNATURE`. Must be an integer:", `FETCH_SAME_SIGNATURE`))
        }
        self$`FETCH_SAME_SIGNATURE` <- `FETCH_SAME_SIGNATURE`
      }
      if (!is.null(`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`) && length(`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`. Must be an integer:", `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`))
        }
        self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` <- `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(`ADDITIONAL_IMAGE_LINK_WARNING`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_LINK_WARNING`) && length(`ADDITIONAL_IMAGE_LINK_WARNING`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_LINK_WARNING`. Must be an integer:", `ADDITIONAL_IMAGE_LINK_WARNING`))
        }
        self$`ADDITIONAL_IMAGE_LINK_WARNING` <- `ADDITIONAL_IMAGE_LINK_WARNING`
      }
      if (!is.null(`IMAGE_LINK_WARNING`)) {
        if (!(is.numeric(`IMAGE_LINK_WARNING`) && length(`IMAGE_LINK_WARNING`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_LINK_WARNING`. Must be an integer:", `IMAGE_LINK_WARNING`))
        }
        self$`IMAGE_LINK_WARNING` <- `IMAGE_LINK_WARNING`
      }
      if (!is.null(`SHIPPING_INVALID`)) {
        if (!(is.numeric(`SHIPPING_INVALID`) && length(`SHIPPING_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SHIPPING_INVALID`. Must be an integer:", `SHIPPING_INVALID`))
        }
        self$`SHIPPING_INVALID` <- `SHIPPING_INVALID`
      }
      if (!is.null(`TAX_INVALID`)) {
        if (!(is.numeric(`TAX_INVALID`) && length(`TAX_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `TAX_INVALID`. Must be an integer:", `TAX_INVALID`))
        }
        self$`TAX_INVALID` <- `TAX_INVALID`
      }
      if (!is.null(`SHIPPING_WEIGHT_INVALID`)) {
        if (!(is.numeric(`SHIPPING_WEIGHT_INVALID`) && length(`SHIPPING_WEIGHT_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SHIPPING_WEIGHT_INVALID`. Must be an integer:", `SHIPPING_WEIGHT_INVALID`))
        }
        self$`SHIPPING_WEIGHT_INVALID` <- `SHIPPING_WEIGHT_INVALID`
      }
      if (!is.null(`EXPIRATION_DATE_INVALID`)) {
        if (!(is.numeric(`EXPIRATION_DATE_INVALID`) && length(`EXPIRATION_DATE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `EXPIRATION_DATE_INVALID`. Must be an integer:", `EXPIRATION_DATE_INVALID`))
        }
        self$`EXPIRATION_DATE_INVALID` <- `EXPIRATION_DATE_INVALID`
      }
      if (!is.null(`AVAILABILITY_DATE_INVALID`)) {
        if (!(is.numeric(`AVAILABILITY_DATE_INVALID`) && length(`AVAILABILITY_DATE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `AVAILABILITY_DATE_INVALID`. Must be an integer:", `AVAILABILITY_DATE_INVALID`))
        }
        self$`AVAILABILITY_DATE_INVALID` <- `AVAILABILITY_DATE_INVALID`
      }
      if (!is.null(`SALE_DATE_INVALID`)) {
        if (!(is.numeric(`SALE_DATE_INVALID`) && length(`SALE_DATE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SALE_DATE_INVALID`. Must be an integer:", `SALE_DATE_INVALID`))
        }
        self$`SALE_DATE_INVALID` <- `SALE_DATE_INVALID`
      }
      if (!is.null(`WEIGHT_UNIT_INVALID`)) {
        if (!(is.numeric(`WEIGHT_UNIT_INVALID`) && length(`WEIGHT_UNIT_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `WEIGHT_UNIT_INVALID`. Must be an integer:", `WEIGHT_UNIT_INVALID`))
        }
        self$`WEIGHT_UNIT_INVALID` <- `WEIGHT_UNIT_INVALID`
      }
      if (!is.null(`IS_BUNDLE_INVALID`)) {
        if (!(is.numeric(`IS_BUNDLE_INVALID`) && length(`IS_BUNDLE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `IS_BUNDLE_INVALID`. Must be an integer:", `IS_BUNDLE_INVALID`))
        }
        self$`IS_BUNDLE_INVALID` <- `IS_BUNDLE_INVALID`
      }
      if (!is.null(`UPDATED_TIME_INVALID`)) {
        if (!(is.numeric(`UPDATED_TIME_INVALID`) && length(`UPDATED_TIME_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `UPDATED_TIME_INVALID`. Must be an integer:", `UPDATED_TIME_INVALID`))
        }
        self$`UPDATED_TIME_INVALID` <- `UPDATED_TIME_INVALID`
      }
      if (!is.null(`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`CUSTOM_LABEL_LENGTH_TOO_LONG`) && length(`CUSTOM_LABEL_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `CUSTOM_LABEL_LENGTH_TOO_LONG`. Must be an integer:", `CUSTOM_LABEL_LENGTH_TOO_LONG`))
        }
        self$`CUSTOM_LABEL_LENGTH_TOO_LONG` <- `CUSTOM_LABEL_LENGTH_TOO_LONG`
      }
      if (!is.null(`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
        if (!(is.numeric(`PRODUCT_TYPE_LENGTH_TOO_LONG`) && length(`PRODUCT_TYPE_LENGTH_TOO_LONG`) == 1)) {
          stop(paste("Error! Invalid data for `PRODUCT_TYPE_LENGTH_TOO_LONG`. Must be an integer:", `PRODUCT_TYPE_LENGTH_TOO_LONG`))
        }
        self$`PRODUCT_TYPE_LENGTH_TOO_LONG` <- `PRODUCT_TYPE_LENGTH_TOO_LONG`
      }
      if (!is.null(`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
        if (!(is.numeric(`TOO_MANY_ADDITIONAL_IMAGE_LINKS`) && length(`TOO_MANY_ADDITIONAL_IMAGE_LINKS`) == 1)) {
          stop(paste("Error! Invalid data for `TOO_MANY_ADDITIONAL_IMAGE_LINKS`. Must be an integer:", `TOO_MANY_ADDITIONAL_IMAGE_LINKS`))
        }
        self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS` <- `TOO_MANY_ADDITIONAL_IMAGE_LINKS`
      }
      if (!is.null(`MULTIPACK_INVALID`)) {
        if (!(is.numeric(`MULTIPACK_INVALID`) && length(`MULTIPACK_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `MULTIPACK_INVALID`. Must be an integer:", `MULTIPACK_INVALID`))
        }
        self$`MULTIPACK_INVALID` <- `MULTIPACK_INVALID`
      }
      if (!is.null(`INDEXED_PRODUCT_COUNT_LARGE_DELTA`)) {
        if (!(is.numeric(`INDEXED_PRODUCT_COUNT_LARGE_DELTA`) && length(`INDEXED_PRODUCT_COUNT_LARGE_DELTA`) == 1)) {
          stop(paste("Error! Invalid data for `INDEXED_PRODUCT_COUNT_LARGE_DELTA`. Must be an integer:", `INDEXED_PRODUCT_COUNT_LARGE_DELTA`))
        }
        self$`INDEXED_PRODUCT_COUNT_LARGE_DELTA` <- `INDEXED_PRODUCT_COUNT_LARGE_DELTA`
      }
      if (!is.null(`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
        if (!(is.numeric(`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`) && length(`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`) == 1)) {
          stop(paste("Error! Invalid data for `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`. Must be an integer:", `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`))
        }
        self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` <- `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
        if (!(is.numeric(`OPTIONAL_PRODUCT_CATEGORY_MISSING`) && length(`OPTIONAL_PRODUCT_CATEGORY_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `OPTIONAL_PRODUCT_CATEGORY_MISSING`. Must be an integer:", `OPTIONAL_PRODUCT_CATEGORY_MISSING`))
        }
        self$`OPTIONAL_PRODUCT_CATEGORY_MISSING` <- `OPTIONAL_PRODUCT_CATEGORY_MISSING`
      }
      if (!is.null(`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
        if (!(is.numeric(`OPTIONAL_PRODUCT_CATEGORY_INVALID`) && length(`OPTIONAL_PRODUCT_CATEGORY_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `OPTIONAL_PRODUCT_CATEGORY_INVALID`. Must be an integer:", `OPTIONAL_PRODUCT_CATEGORY_INVALID`))
        }
        self$`OPTIONAL_PRODUCT_CATEGORY_INVALID` <- `OPTIONAL_PRODUCT_CATEGORY_INVALID`
      }
      if (!is.null(`OPTIONAL_CONDITION_MISSING`)) {
        if (!(is.numeric(`OPTIONAL_CONDITION_MISSING`) && length(`OPTIONAL_CONDITION_MISSING`) == 1)) {
          stop(paste("Error! Invalid data for `OPTIONAL_CONDITION_MISSING`. Must be an integer:", `OPTIONAL_CONDITION_MISSING`))
        }
        self$`OPTIONAL_CONDITION_MISSING` <- `OPTIONAL_CONDITION_MISSING`
      }
      if (!is.null(`OPTIONAL_CONDITION_INVALID`)) {
        if (!(is.numeric(`OPTIONAL_CONDITION_INVALID`) && length(`OPTIONAL_CONDITION_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `OPTIONAL_CONDITION_INVALID`. Must be an integer:", `OPTIONAL_CONDITION_INVALID`))
        }
        self$`OPTIONAL_CONDITION_INVALID` <- `OPTIONAL_CONDITION_INVALID`
      }
      if (!is.null(`IOS_DEEP_LINK_INVALID`)) {
        if (!(is.numeric(`IOS_DEEP_LINK_INVALID`) && length(`IOS_DEEP_LINK_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `IOS_DEEP_LINK_INVALID`. Must be an integer:", `IOS_DEEP_LINK_INVALID`))
        }
        self$`IOS_DEEP_LINK_INVALID` <- `IOS_DEEP_LINK_INVALID`
      }
      if (!is.null(`ANDROID_DEEP_LINK_INVALID`)) {
        if (!(is.numeric(`ANDROID_DEEP_LINK_INVALID`) && length(`ANDROID_DEEP_LINK_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `ANDROID_DEEP_LINK_INVALID`. Must be an integer:", `ANDROID_DEEP_LINK_INVALID`))
        }
        self$`ANDROID_DEEP_LINK_INVALID` <- `ANDROID_DEEP_LINK_INVALID`
      }
      if (!is.null(`UTM_SOURCE_AUTO_CORRECTED`)) {
        if (!(is.numeric(`UTM_SOURCE_AUTO_CORRECTED`) && length(`UTM_SOURCE_AUTO_CORRECTED`) == 1)) {
          stop(paste("Error! Invalid data for `UTM_SOURCE_AUTO_CORRECTED`. Must be an integer:", `UTM_SOURCE_AUTO_CORRECTED`))
        }
        self$`UTM_SOURCE_AUTO_CORRECTED` <- `UTM_SOURCE_AUTO_CORRECTED`
      }
      if (!is.null(`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
        if (!(is.numeric(`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`) && length(`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`) == 1)) {
          stop(paste("Error! Invalid data for `COUNTRY_DOES_NOT_MAP_TO_CURRENCY`. Must be an integer:", `COUNTRY_DOES_NOT_MAP_TO_CURRENCY`))
        }
        self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY` <- `COUNTRY_DOES_NOT_MAP_TO_CURRENCY`
      }
      if (!is.null(`MIN_AD_PRICE_INVALID`)) {
        if (!(is.numeric(`MIN_AD_PRICE_INVALID`) && length(`MIN_AD_PRICE_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `MIN_AD_PRICE_INVALID`. Must be an integer:", `MIN_AD_PRICE_INVALID`))
        }
        self$`MIN_AD_PRICE_INVALID` <- `MIN_AD_PRICE_INVALID`
      }
      if (!is.null(`GTIN_INVALID`)) {
        if (!(is.numeric(`GTIN_INVALID`) && length(`GTIN_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `GTIN_INVALID`. Must be an integer:", `GTIN_INVALID`))
        }
        self$`GTIN_INVALID` <- `GTIN_INVALID`
      }
      if (!is.null(`INCONSISTENT_CURRENCY_VALUES`)) {
        if (!(is.numeric(`INCONSISTENT_CURRENCY_VALUES`) && length(`INCONSISTENT_CURRENCY_VALUES`) == 1)) {
          stop(paste("Error! Invalid data for `INCONSISTENT_CURRENCY_VALUES`. Must be an integer:", `INCONSISTENT_CURRENCY_VALUES`))
        }
        self$`INCONSISTENT_CURRENCY_VALUES` <- `INCONSISTENT_CURRENCY_VALUES`
      }
      if (!is.null(`SALES_PRICE_TOO_LOW`)) {
        if (!(is.numeric(`SALES_PRICE_TOO_LOW`) && length(`SALES_PRICE_TOO_LOW`) == 1)) {
          stop(paste("Error! Invalid data for `SALES_PRICE_TOO_LOW`. Must be an integer:", `SALES_PRICE_TOO_LOW`))
        }
        self$`SALES_PRICE_TOO_LOW` <- `SALES_PRICE_TOO_LOW`
      }
      if (!is.null(`SHIPPING_WIDTH_INVALID`)) {
        if (!(is.numeric(`SHIPPING_WIDTH_INVALID`) && length(`SHIPPING_WIDTH_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SHIPPING_WIDTH_INVALID`. Must be an integer:", `SHIPPING_WIDTH_INVALID`))
        }
        self$`SHIPPING_WIDTH_INVALID` <- `SHIPPING_WIDTH_INVALID`
      }
      if (!is.null(`SHIPPING_HEIGHT_INVALID`)) {
        if (!(is.numeric(`SHIPPING_HEIGHT_INVALID`) && length(`SHIPPING_HEIGHT_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `SHIPPING_HEIGHT_INVALID`. Must be an integer:", `SHIPPING_HEIGHT_INVALID`))
        }
        self$`SHIPPING_HEIGHT_INVALID` <- `SHIPPING_HEIGHT_INVALID`
      }
      if (!is.null(`SALES_PRICE_TOO_HIGH`)) {
        if (!(is.numeric(`SALES_PRICE_TOO_HIGH`) && length(`SALES_PRICE_TOO_HIGH`) == 1)) {
          stop(paste("Error! Invalid data for `SALES_PRICE_TOO_HIGH`. Must be an integer:", `SALES_PRICE_TOO_HIGH`))
        }
        self$`SALES_PRICE_TOO_HIGH` <- `SALES_PRICE_TOO_HIGH`
      }
      if (!is.null(`MPN_INVALID`)) {
        if (!(is.numeric(`MPN_INVALID`) && length(`MPN_INVALID`) == 1)) {
          stop(paste("Error! Invalid data for `MPN_INVALID`. Must be an integer:", `MPN_INVALID`))
        }
        self$`MPN_INVALID` <- `MPN_INVALID`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedValidationWarnings in JSON format
    toJSON = function() {
      CatalogsFeedValidationWarningsObject <- list()
      if (!is.null(self$`AD_LINK_FORMAT_WARNING`)) {
        CatalogsFeedValidationWarningsObject[["AD_LINK_FORMAT_WARNING"]] <-
          self$`AD_LINK_FORMAT_WARNING`
      }
      if (!is.null(self$`AD_LINK_SAME_AS_LINK`)) {
        CatalogsFeedValidationWarningsObject[["AD_LINK_SAME_AS_LINK"]] <-
          self$`AD_LINK_SAME_AS_LINK`
      }
      if (!is.null(self$`TITLE_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationWarningsObject[["TITLE_LENGTH_TOO_LONG"]] <-
          self$`TITLE_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`DESCRIPTION_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationWarningsObject[["DESCRIPTION_LENGTH_TOO_LONG"]] <-
          self$`DESCRIPTION_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`GENDER_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["GENDER_INVALID"]] <-
          self$`GENDER_INVALID`
      }
      if (!is.null(self$`AGE_GROUP_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["AGE_GROUP_INVALID"]] <-
          self$`AGE_GROUP_INVALID`
      }
      if (!is.null(self$`SIZE_TYPE_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SIZE_TYPE_INVALID"]] <-
          self$`SIZE_TYPE_INVALID`
      }
      if (!is.null(self$`SIZE_SYSTEM_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SIZE_SYSTEM_INVALID"]] <-
          self$`SIZE_SYSTEM_INVALID`
      }
      if (!is.null(self$`LINK_FORMAT_WARNING`)) {
        CatalogsFeedValidationWarningsObject[["LINK_FORMAT_WARNING"]] <-
          self$`LINK_FORMAT_WARNING`
      }
      if (!is.null(self$`SALES_PRICE_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SALES_PRICE_INVALID"]] <-
          self$`SALES_PRICE_INVALID`
      }
      if (!is.null(self$`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
        CatalogsFeedValidationWarningsObject[["PRODUCT_CATEGORY_DEPTH_WARNING"]] <-
          self$`PRODUCT_CATEGORY_DEPTH_WARNING`
      }
      if (!is.null(self$`ADWORDS_FORMAT_WARNING`)) {
        CatalogsFeedValidationWarningsObject[["ADWORDS_FORMAT_WARNING"]] <-
          self$`ADWORDS_FORMAT_WARNING`
      }
      if (!is.null(self$`ADWORDS_SAME_AS_LINK`)) {
        CatalogsFeedValidationWarningsObject[["ADWORDS_SAME_AS_LINK"]] <-
          self$`ADWORDS_SAME_AS_LINK`
      }
      if (!is.null(self$`DUPLICATE_HEADERS`)) {
        CatalogsFeedValidationWarningsObject[["DUPLICATE_HEADERS"]] <-
          self$`DUPLICATE_HEADERS`
      }
      if (!is.null(self$`FETCH_SAME_SIGNATURE`)) {
        CatalogsFeedValidationWarningsObject[["FETCH_SAME_SIGNATURE"]] <-
          self$`FETCH_SAME_SIGNATURE`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationWarningsObject[["ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"]] <-
          self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_LINK_WARNING`)) {
        CatalogsFeedValidationWarningsObject[["ADDITIONAL_IMAGE_LINK_WARNING"]] <-
          self$`ADDITIONAL_IMAGE_LINK_WARNING`
      }
      if (!is.null(self$`IMAGE_LINK_WARNING`)) {
        CatalogsFeedValidationWarningsObject[["IMAGE_LINK_WARNING"]] <-
          self$`IMAGE_LINK_WARNING`
      }
      if (!is.null(self$`SHIPPING_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SHIPPING_INVALID"]] <-
          self$`SHIPPING_INVALID`
      }
      if (!is.null(self$`TAX_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["TAX_INVALID"]] <-
          self$`TAX_INVALID`
      }
      if (!is.null(self$`SHIPPING_WEIGHT_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SHIPPING_WEIGHT_INVALID"]] <-
          self$`SHIPPING_WEIGHT_INVALID`
      }
      if (!is.null(self$`EXPIRATION_DATE_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["EXPIRATION_DATE_INVALID"]] <-
          self$`EXPIRATION_DATE_INVALID`
      }
      if (!is.null(self$`AVAILABILITY_DATE_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["AVAILABILITY_DATE_INVALID"]] <-
          self$`AVAILABILITY_DATE_INVALID`
      }
      if (!is.null(self$`SALE_DATE_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SALE_DATE_INVALID"]] <-
          self$`SALE_DATE_INVALID`
      }
      if (!is.null(self$`WEIGHT_UNIT_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["WEIGHT_UNIT_INVALID"]] <-
          self$`WEIGHT_UNIT_INVALID`
      }
      if (!is.null(self$`IS_BUNDLE_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["IS_BUNDLE_INVALID"]] <-
          self$`IS_BUNDLE_INVALID`
      }
      if (!is.null(self$`UPDATED_TIME_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["UPDATED_TIME_INVALID"]] <-
          self$`UPDATED_TIME_INVALID`
      }
      if (!is.null(self$`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationWarningsObject[["CUSTOM_LABEL_LENGTH_TOO_LONG"]] <-
          self$`CUSTOM_LABEL_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
        CatalogsFeedValidationWarningsObject[["PRODUCT_TYPE_LENGTH_TOO_LONG"]] <-
          self$`PRODUCT_TYPE_LENGTH_TOO_LONG`
      }
      if (!is.null(self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
        CatalogsFeedValidationWarningsObject[["TOO_MANY_ADDITIONAL_IMAGE_LINKS"]] <-
          self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`
      }
      if (!is.null(self$`MULTIPACK_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["MULTIPACK_INVALID"]] <-
          self$`MULTIPACK_INVALID`
      }
      if (!is.null(self$`INDEXED_PRODUCT_COUNT_LARGE_DELTA`)) {
        CatalogsFeedValidationWarningsObject[["INDEXED_PRODUCT_COUNT_LARGE_DELTA"]] <-
          self$`INDEXED_PRODUCT_COUNT_LARGE_DELTA`
      }
      if (!is.null(self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
        CatalogsFeedValidationWarningsObject[["ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"]] <-
          self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
        CatalogsFeedValidationWarningsObject[["OPTIONAL_PRODUCT_CATEGORY_MISSING"]] <-
          self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`
      }
      if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["OPTIONAL_PRODUCT_CATEGORY_INVALID"]] <-
          self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`
      }
      if (!is.null(self$`OPTIONAL_CONDITION_MISSING`)) {
        CatalogsFeedValidationWarningsObject[["OPTIONAL_CONDITION_MISSING"]] <-
          self$`OPTIONAL_CONDITION_MISSING`
      }
      if (!is.null(self$`OPTIONAL_CONDITION_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["OPTIONAL_CONDITION_INVALID"]] <-
          self$`OPTIONAL_CONDITION_INVALID`
      }
      if (!is.null(self$`IOS_DEEP_LINK_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["IOS_DEEP_LINK_INVALID"]] <-
          self$`IOS_DEEP_LINK_INVALID`
      }
      if (!is.null(self$`ANDROID_DEEP_LINK_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["ANDROID_DEEP_LINK_INVALID"]] <-
          self$`ANDROID_DEEP_LINK_INVALID`
      }
      if (!is.null(self$`UTM_SOURCE_AUTO_CORRECTED`)) {
        CatalogsFeedValidationWarningsObject[["UTM_SOURCE_AUTO_CORRECTED"]] <-
          self$`UTM_SOURCE_AUTO_CORRECTED`
      }
      if (!is.null(self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
        CatalogsFeedValidationWarningsObject[["COUNTRY_DOES_NOT_MAP_TO_CURRENCY"]] <-
          self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`
      }
      if (!is.null(self$`MIN_AD_PRICE_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["MIN_AD_PRICE_INVALID"]] <-
          self$`MIN_AD_PRICE_INVALID`
      }
      if (!is.null(self$`GTIN_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["GTIN_INVALID"]] <-
          self$`GTIN_INVALID`
      }
      if (!is.null(self$`INCONSISTENT_CURRENCY_VALUES`)) {
        CatalogsFeedValidationWarningsObject[["INCONSISTENT_CURRENCY_VALUES"]] <-
          self$`INCONSISTENT_CURRENCY_VALUES`
      }
      if (!is.null(self$`SALES_PRICE_TOO_LOW`)) {
        CatalogsFeedValidationWarningsObject[["SALES_PRICE_TOO_LOW"]] <-
          self$`SALES_PRICE_TOO_LOW`
      }
      if (!is.null(self$`SHIPPING_WIDTH_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SHIPPING_WIDTH_INVALID"]] <-
          self$`SHIPPING_WIDTH_INVALID`
      }
      if (!is.null(self$`SHIPPING_HEIGHT_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["SHIPPING_HEIGHT_INVALID"]] <-
          self$`SHIPPING_HEIGHT_INVALID`
      }
      if (!is.null(self$`SALES_PRICE_TOO_HIGH`)) {
        CatalogsFeedValidationWarningsObject[["SALES_PRICE_TOO_HIGH"]] <-
          self$`SALES_PRICE_TOO_HIGH`
      }
      if (!is.null(self$`MPN_INVALID`)) {
        CatalogsFeedValidationWarningsObject[["MPN_INVALID"]] <-
          self$`MPN_INVALID`
      }
      CatalogsFeedValidationWarningsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedValidationWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedValidationWarnings
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AD_LINK_FORMAT_WARNING`)) {
        self$`AD_LINK_FORMAT_WARNING` <- this_object$`AD_LINK_FORMAT_WARNING`
      }
      if (!is.null(this_object$`AD_LINK_SAME_AS_LINK`)) {
        self$`AD_LINK_SAME_AS_LINK` <- this_object$`AD_LINK_SAME_AS_LINK`
      }
      if (!is.null(this_object$`TITLE_LENGTH_TOO_LONG`)) {
        self$`TITLE_LENGTH_TOO_LONG` <- this_object$`TITLE_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`DESCRIPTION_LENGTH_TOO_LONG`)) {
        self$`DESCRIPTION_LENGTH_TOO_LONG` <- this_object$`DESCRIPTION_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`GENDER_INVALID`)) {
        self$`GENDER_INVALID` <- this_object$`GENDER_INVALID`
      }
      if (!is.null(this_object$`AGE_GROUP_INVALID`)) {
        self$`AGE_GROUP_INVALID` <- this_object$`AGE_GROUP_INVALID`
      }
      if (!is.null(this_object$`SIZE_TYPE_INVALID`)) {
        self$`SIZE_TYPE_INVALID` <- this_object$`SIZE_TYPE_INVALID`
      }
      if (!is.null(this_object$`SIZE_SYSTEM_INVALID`)) {
        self$`SIZE_SYSTEM_INVALID` <- this_object$`SIZE_SYSTEM_INVALID`
      }
      if (!is.null(this_object$`LINK_FORMAT_WARNING`)) {
        self$`LINK_FORMAT_WARNING` <- this_object$`LINK_FORMAT_WARNING`
      }
      if (!is.null(this_object$`SALES_PRICE_INVALID`)) {
        self$`SALES_PRICE_INVALID` <- this_object$`SALES_PRICE_INVALID`
      }
      if (!is.null(this_object$`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
        self$`PRODUCT_CATEGORY_DEPTH_WARNING` <- this_object$`PRODUCT_CATEGORY_DEPTH_WARNING`
      }
      if (!is.null(this_object$`ADWORDS_FORMAT_WARNING`)) {
        self$`ADWORDS_FORMAT_WARNING` <- this_object$`ADWORDS_FORMAT_WARNING`
      }
      if (!is.null(this_object$`ADWORDS_SAME_AS_LINK`)) {
        self$`ADWORDS_SAME_AS_LINK` <- this_object$`ADWORDS_SAME_AS_LINK`
      }
      if (!is.null(this_object$`DUPLICATE_HEADERS`)) {
        self$`DUPLICATE_HEADERS` <- this_object$`DUPLICATE_HEADERS`
      }
      if (!is.null(this_object$`FETCH_SAME_SIGNATURE`)) {
        if (!is.null(this_object$`FETCH_SAME_SIGNATURE`) && !(this_object$`FETCH_SAME_SIGNATURE` %in% c("1"))) {
          stop(paste("Error! \"", this_object$`FETCH_SAME_SIGNATURE`, "\" cannot be assigned to `FETCH_SAME_SIGNATURE`. Must be \"1\".", sep = ""))
        }
        self$`FETCH_SAME_SIGNATURE` <- this_object$`FETCH_SAME_SIGNATURE`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
        self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` <- this_object$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_LINK_WARNING`)) {
        self$`ADDITIONAL_IMAGE_LINK_WARNING` <- this_object$`ADDITIONAL_IMAGE_LINK_WARNING`
      }
      if (!is.null(this_object$`IMAGE_LINK_WARNING`)) {
        self$`IMAGE_LINK_WARNING` <- this_object$`IMAGE_LINK_WARNING`
      }
      if (!is.null(this_object$`SHIPPING_INVALID`)) {
        self$`SHIPPING_INVALID` <- this_object$`SHIPPING_INVALID`
      }
      if (!is.null(this_object$`TAX_INVALID`)) {
        self$`TAX_INVALID` <- this_object$`TAX_INVALID`
      }
      if (!is.null(this_object$`SHIPPING_WEIGHT_INVALID`)) {
        self$`SHIPPING_WEIGHT_INVALID` <- this_object$`SHIPPING_WEIGHT_INVALID`
      }
      if (!is.null(this_object$`EXPIRATION_DATE_INVALID`)) {
        self$`EXPIRATION_DATE_INVALID` <- this_object$`EXPIRATION_DATE_INVALID`
      }
      if (!is.null(this_object$`AVAILABILITY_DATE_INVALID`)) {
        self$`AVAILABILITY_DATE_INVALID` <- this_object$`AVAILABILITY_DATE_INVALID`
      }
      if (!is.null(this_object$`SALE_DATE_INVALID`)) {
        self$`SALE_DATE_INVALID` <- this_object$`SALE_DATE_INVALID`
      }
      if (!is.null(this_object$`WEIGHT_UNIT_INVALID`)) {
        self$`WEIGHT_UNIT_INVALID` <- this_object$`WEIGHT_UNIT_INVALID`
      }
      if (!is.null(this_object$`IS_BUNDLE_INVALID`)) {
        self$`IS_BUNDLE_INVALID` <- this_object$`IS_BUNDLE_INVALID`
      }
      if (!is.null(this_object$`UPDATED_TIME_INVALID`)) {
        self$`UPDATED_TIME_INVALID` <- this_object$`UPDATED_TIME_INVALID`
      }
      if (!is.null(this_object$`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
        self$`CUSTOM_LABEL_LENGTH_TOO_LONG` <- this_object$`CUSTOM_LABEL_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
        self$`PRODUCT_TYPE_LENGTH_TOO_LONG` <- this_object$`PRODUCT_TYPE_LENGTH_TOO_LONG`
      }
      if (!is.null(this_object$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
        self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS` <- this_object$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`
      }
      if (!is.null(this_object$`MULTIPACK_INVALID`)) {
        self$`MULTIPACK_INVALID` <- this_object$`MULTIPACK_INVALID`
      }
      if (!is.null(this_object$`INDEXED_PRODUCT_COUNT_LARGE_DELTA`)) {
        self$`INDEXED_PRODUCT_COUNT_LARGE_DELTA` <- this_object$`INDEXED_PRODUCT_COUNT_LARGE_DELTA`
      }
      if (!is.null(this_object$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
        self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` <- this_object$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`
      }
      if (!is.null(this_object$`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
        self$`OPTIONAL_PRODUCT_CATEGORY_MISSING` <- this_object$`OPTIONAL_PRODUCT_CATEGORY_MISSING`
      }
      if (!is.null(this_object$`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
        self$`OPTIONAL_PRODUCT_CATEGORY_INVALID` <- this_object$`OPTIONAL_PRODUCT_CATEGORY_INVALID`
      }
      if (!is.null(this_object$`OPTIONAL_CONDITION_MISSING`)) {
        self$`OPTIONAL_CONDITION_MISSING` <- this_object$`OPTIONAL_CONDITION_MISSING`
      }
      if (!is.null(this_object$`OPTIONAL_CONDITION_INVALID`)) {
        self$`OPTIONAL_CONDITION_INVALID` <- this_object$`OPTIONAL_CONDITION_INVALID`
      }
      if (!is.null(this_object$`IOS_DEEP_LINK_INVALID`)) {
        self$`IOS_DEEP_LINK_INVALID` <- this_object$`IOS_DEEP_LINK_INVALID`
      }
      if (!is.null(this_object$`ANDROID_DEEP_LINK_INVALID`)) {
        self$`ANDROID_DEEP_LINK_INVALID` <- this_object$`ANDROID_DEEP_LINK_INVALID`
      }
      if (!is.null(this_object$`UTM_SOURCE_AUTO_CORRECTED`)) {
        self$`UTM_SOURCE_AUTO_CORRECTED` <- this_object$`UTM_SOURCE_AUTO_CORRECTED`
      }
      if (!is.null(this_object$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
        self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY` <- this_object$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`
      }
      if (!is.null(this_object$`MIN_AD_PRICE_INVALID`)) {
        self$`MIN_AD_PRICE_INVALID` <- this_object$`MIN_AD_PRICE_INVALID`
      }
      if (!is.null(this_object$`GTIN_INVALID`)) {
        self$`GTIN_INVALID` <- this_object$`GTIN_INVALID`
      }
      if (!is.null(this_object$`INCONSISTENT_CURRENCY_VALUES`)) {
        self$`INCONSISTENT_CURRENCY_VALUES` <- this_object$`INCONSISTENT_CURRENCY_VALUES`
      }
      if (!is.null(this_object$`SALES_PRICE_TOO_LOW`)) {
        self$`SALES_PRICE_TOO_LOW` <- this_object$`SALES_PRICE_TOO_LOW`
      }
      if (!is.null(this_object$`SHIPPING_WIDTH_INVALID`)) {
        self$`SHIPPING_WIDTH_INVALID` <- this_object$`SHIPPING_WIDTH_INVALID`
      }
      if (!is.null(this_object$`SHIPPING_HEIGHT_INVALID`)) {
        self$`SHIPPING_HEIGHT_INVALID` <- this_object$`SHIPPING_HEIGHT_INVALID`
      }
      if (!is.null(this_object$`SALES_PRICE_TOO_HIGH`)) {
        self$`SALES_PRICE_TOO_HIGH` <- this_object$`SALES_PRICE_TOO_HIGH`
      }
      if (!is.null(this_object$`MPN_INVALID`)) {
        self$`MPN_INVALID` <- this_object$`MPN_INVALID`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedValidationWarnings in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`AD_LINK_FORMAT_WARNING`)) {
          sprintf(
          '"AD_LINK_FORMAT_WARNING":
            %d
                    ',
          self$`AD_LINK_FORMAT_WARNING`
          )
        },
        if (!is.null(self$`AD_LINK_SAME_AS_LINK`)) {
          sprintf(
          '"AD_LINK_SAME_AS_LINK":
            %d
                    ',
          self$`AD_LINK_SAME_AS_LINK`
          )
        },
        if (!is.null(self$`TITLE_LENGTH_TOO_LONG`)) {
          sprintf(
          '"TITLE_LENGTH_TOO_LONG":
            %d
                    ',
          self$`TITLE_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`DESCRIPTION_LENGTH_TOO_LONG`)) {
          sprintf(
          '"DESCRIPTION_LENGTH_TOO_LONG":
            %d
                    ',
          self$`DESCRIPTION_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`GENDER_INVALID`)) {
          sprintf(
          '"GENDER_INVALID":
            %d
                    ',
          self$`GENDER_INVALID`
          )
        },
        if (!is.null(self$`AGE_GROUP_INVALID`)) {
          sprintf(
          '"AGE_GROUP_INVALID":
            %d
                    ',
          self$`AGE_GROUP_INVALID`
          )
        },
        if (!is.null(self$`SIZE_TYPE_INVALID`)) {
          sprintf(
          '"SIZE_TYPE_INVALID":
            %d
                    ',
          self$`SIZE_TYPE_INVALID`
          )
        },
        if (!is.null(self$`SIZE_SYSTEM_INVALID`)) {
          sprintf(
          '"SIZE_SYSTEM_INVALID":
            %d
                    ',
          self$`SIZE_SYSTEM_INVALID`
          )
        },
        if (!is.null(self$`LINK_FORMAT_WARNING`)) {
          sprintf(
          '"LINK_FORMAT_WARNING":
            %d
                    ',
          self$`LINK_FORMAT_WARNING`
          )
        },
        if (!is.null(self$`SALES_PRICE_INVALID`)) {
          sprintf(
          '"SALES_PRICE_INVALID":
            %d
                    ',
          self$`SALES_PRICE_INVALID`
          )
        },
        if (!is.null(self$`PRODUCT_CATEGORY_DEPTH_WARNING`)) {
          sprintf(
          '"PRODUCT_CATEGORY_DEPTH_WARNING":
            %d
                    ',
          self$`PRODUCT_CATEGORY_DEPTH_WARNING`
          )
        },
        if (!is.null(self$`ADWORDS_FORMAT_WARNING`)) {
          sprintf(
          '"ADWORDS_FORMAT_WARNING":
            %d
                    ',
          self$`ADWORDS_FORMAT_WARNING`
          )
        },
        if (!is.null(self$`ADWORDS_SAME_AS_LINK`)) {
          sprintf(
          '"ADWORDS_SAME_AS_LINK":
            %d
                    ',
          self$`ADWORDS_SAME_AS_LINK`
          )
        },
        if (!is.null(self$`DUPLICATE_HEADERS`)) {
          sprintf(
          '"DUPLICATE_HEADERS":
            %d
                    ',
          self$`DUPLICATE_HEADERS`
          )
        },
        if (!is.null(self$`FETCH_SAME_SIGNATURE`)) {
          sprintf(
          '"FETCH_SAME_SIGNATURE":
            %d
                    ',
          self$`FETCH_SAME_SIGNATURE`
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG":
            %d
                    ',
          self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_LINK_WARNING`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_LINK_WARNING":
            %d
                    ',
          self$`ADDITIONAL_IMAGE_LINK_WARNING`
          )
        },
        if (!is.null(self$`IMAGE_LINK_WARNING`)) {
          sprintf(
          '"IMAGE_LINK_WARNING":
            %d
                    ',
          self$`IMAGE_LINK_WARNING`
          )
        },
        if (!is.null(self$`SHIPPING_INVALID`)) {
          sprintf(
          '"SHIPPING_INVALID":
            %d
                    ',
          self$`SHIPPING_INVALID`
          )
        },
        if (!is.null(self$`TAX_INVALID`)) {
          sprintf(
          '"TAX_INVALID":
            %d
                    ',
          self$`TAX_INVALID`
          )
        },
        if (!is.null(self$`SHIPPING_WEIGHT_INVALID`)) {
          sprintf(
          '"SHIPPING_WEIGHT_INVALID":
            %d
                    ',
          self$`SHIPPING_WEIGHT_INVALID`
          )
        },
        if (!is.null(self$`EXPIRATION_DATE_INVALID`)) {
          sprintf(
          '"EXPIRATION_DATE_INVALID":
            %d
                    ',
          self$`EXPIRATION_DATE_INVALID`
          )
        },
        if (!is.null(self$`AVAILABILITY_DATE_INVALID`)) {
          sprintf(
          '"AVAILABILITY_DATE_INVALID":
            %d
                    ',
          self$`AVAILABILITY_DATE_INVALID`
          )
        },
        if (!is.null(self$`SALE_DATE_INVALID`)) {
          sprintf(
          '"SALE_DATE_INVALID":
            %d
                    ',
          self$`SALE_DATE_INVALID`
          )
        },
        if (!is.null(self$`WEIGHT_UNIT_INVALID`)) {
          sprintf(
          '"WEIGHT_UNIT_INVALID":
            %d
                    ',
          self$`WEIGHT_UNIT_INVALID`
          )
        },
        if (!is.null(self$`IS_BUNDLE_INVALID`)) {
          sprintf(
          '"IS_BUNDLE_INVALID":
            %d
                    ',
          self$`IS_BUNDLE_INVALID`
          )
        },
        if (!is.null(self$`UPDATED_TIME_INVALID`)) {
          sprintf(
          '"UPDATED_TIME_INVALID":
            %d
                    ',
          self$`UPDATED_TIME_INVALID`
          )
        },
        if (!is.null(self$`CUSTOM_LABEL_LENGTH_TOO_LONG`)) {
          sprintf(
          '"CUSTOM_LABEL_LENGTH_TOO_LONG":
            %d
                    ',
          self$`CUSTOM_LABEL_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`PRODUCT_TYPE_LENGTH_TOO_LONG`)) {
          sprintf(
          '"PRODUCT_TYPE_LENGTH_TOO_LONG":
            %d
                    ',
          self$`PRODUCT_TYPE_LENGTH_TOO_LONG`
          )
        },
        if (!is.null(self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`)) {
          sprintf(
          '"TOO_MANY_ADDITIONAL_IMAGE_LINKS":
            %d
                    ',
          self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`
          )
        },
        if (!is.null(self$`MULTIPACK_INVALID`)) {
          sprintf(
          '"MULTIPACK_INVALID":
            %d
                    ',
          self$`MULTIPACK_INVALID`
          )
        },
        if (!is.null(self$`INDEXED_PRODUCT_COUNT_LARGE_DELTA`)) {
          sprintf(
          '"INDEXED_PRODUCT_COUNT_LARGE_DELTA":
            %d
                    ',
          self$`INDEXED_PRODUCT_COUNT_LARGE_DELTA`
          )
        },
        if (!is.null(self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`)) {
          sprintf(
          '"ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE":
            %d
                    ',
          self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`
          )
        },
        if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`)) {
          sprintf(
          '"OPTIONAL_PRODUCT_CATEGORY_MISSING":
            %d
                    ',
          self$`OPTIONAL_PRODUCT_CATEGORY_MISSING`
          )
        },
        if (!is.null(self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`)) {
          sprintf(
          '"OPTIONAL_PRODUCT_CATEGORY_INVALID":
            %d
                    ',
          self$`OPTIONAL_PRODUCT_CATEGORY_INVALID`
          )
        },
        if (!is.null(self$`OPTIONAL_CONDITION_MISSING`)) {
          sprintf(
          '"OPTIONAL_CONDITION_MISSING":
            %d
                    ',
          self$`OPTIONAL_CONDITION_MISSING`
          )
        },
        if (!is.null(self$`OPTIONAL_CONDITION_INVALID`)) {
          sprintf(
          '"OPTIONAL_CONDITION_INVALID":
            %d
                    ',
          self$`OPTIONAL_CONDITION_INVALID`
          )
        },
        if (!is.null(self$`IOS_DEEP_LINK_INVALID`)) {
          sprintf(
          '"IOS_DEEP_LINK_INVALID":
            %d
                    ',
          self$`IOS_DEEP_LINK_INVALID`
          )
        },
        if (!is.null(self$`ANDROID_DEEP_LINK_INVALID`)) {
          sprintf(
          '"ANDROID_DEEP_LINK_INVALID":
            %d
                    ',
          self$`ANDROID_DEEP_LINK_INVALID`
          )
        },
        if (!is.null(self$`UTM_SOURCE_AUTO_CORRECTED`)) {
          sprintf(
          '"UTM_SOURCE_AUTO_CORRECTED":
            %d
                    ',
          self$`UTM_SOURCE_AUTO_CORRECTED`
          )
        },
        if (!is.null(self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`)) {
          sprintf(
          '"COUNTRY_DOES_NOT_MAP_TO_CURRENCY":
            %d
                    ',
          self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`
          )
        },
        if (!is.null(self$`MIN_AD_PRICE_INVALID`)) {
          sprintf(
          '"MIN_AD_PRICE_INVALID":
            %d
                    ',
          self$`MIN_AD_PRICE_INVALID`
          )
        },
        if (!is.null(self$`GTIN_INVALID`)) {
          sprintf(
          '"GTIN_INVALID":
            %d
                    ',
          self$`GTIN_INVALID`
          )
        },
        if (!is.null(self$`INCONSISTENT_CURRENCY_VALUES`)) {
          sprintf(
          '"INCONSISTENT_CURRENCY_VALUES":
            %d
                    ',
          self$`INCONSISTENT_CURRENCY_VALUES`
          )
        },
        if (!is.null(self$`SALES_PRICE_TOO_LOW`)) {
          sprintf(
          '"SALES_PRICE_TOO_LOW":
            %d
                    ',
          self$`SALES_PRICE_TOO_LOW`
          )
        },
        if (!is.null(self$`SHIPPING_WIDTH_INVALID`)) {
          sprintf(
          '"SHIPPING_WIDTH_INVALID":
            %d
                    ',
          self$`SHIPPING_WIDTH_INVALID`
          )
        },
        if (!is.null(self$`SHIPPING_HEIGHT_INVALID`)) {
          sprintf(
          '"SHIPPING_HEIGHT_INVALID":
            %d
                    ',
          self$`SHIPPING_HEIGHT_INVALID`
          )
        },
        if (!is.null(self$`SALES_PRICE_TOO_HIGH`)) {
          sprintf(
          '"SALES_PRICE_TOO_HIGH":
            %d
                    ',
          self$`SALES_PRICE_TOO_HIGH`
          )
        },
        if (!is.null(self$`MPN_INVALID`)) {
          sprintf(
          '"MPN_INVALID":
            %d
                    ',
          self$`MPN_INVALID`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedValidationWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedValidationWarnings
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AD_LINK_FORMAT_WARNING` <- this_object$`AD_LINK_FORMAT_WARNING`
      self$`AD_LINK_SAME_AS_LINK` <- this_object$`AD_LINK_SAME_AS_LINK`
      self$`TITLE_LENGTH_TOO_LONG` <- this_object$`TITLE_LENGTH_TOO_LONG`
      self$`DESCRIPTION_LENGTH_TOO_LONG` <- this_object$`DESCRIPTION_LENGTH_TOO_LONG`
      self$`GENDER_INVALID` <- this_object$`GENDER_INVALID`
      self$`AGE_GROUP_INVALID` <- this_object$`AGE_GROUP_INVALID`
      self$`SIZE_TYPE_INVALID` <- this_object$`SIZE_TYPE_INVALID`
      self$`SIZE_SYSTEM_INVALID` <- this_object$`SIZE_SYSTEM_INVALID`
      self$`LINK_FORMAT_WARNING` <- this_object$`LINK_FORMAT_WARNING`
      self$`SALES_PRICE_INVALID` <- this_object$`SALES_PRICE_INVALID`
      self$`PRODUCT_CATEGORY_DEPTH_WARNING` <- this_object$`PRODUCT_CATEGORY_DEPTH_WARNING`
      self$`ADWORDS_FORMAT_WARNING` <- this_object$`ADWORDS_FORMAT_WARNING`
      self$`ADWORDS_SAME_AS_LINK` <- this_object$`ADWORDS_SAME_AS_LINK`
      self$`DUPLICATE_HEADERS` <- this_object$`DUPLICATE_HEADERS`
      if (!is.null(this_object$`FETCH_SAME_SIGNATURE`) && !(this_object$`FETCH_SAME_SIGNATURE` %in% c("1"))) {
        stop(paste("Error! \"", this_object$`FETCH_SAME_SIGNATURE`, "\" cannot be assigned to `FETCH_SAME_SIGNATURE`. Must be \"1\".", sep = ""))
      }
      self$`FETCH_SAME_SIGNATURE` <- this_object$`FETCH_SAME_SIGNATURE`
      self$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` <- this_object$`ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`
      self$`ADDITIONAL_IMAGE_LINK_WARNING` <- this_object$`ADDITIONAL_IMAGE_LINK_WARNING`
      self$`IMAGE_LINK_WARNING` <- this_object$`IMAGE_LINK_WARNING`
      self$`SHIPPING_INVALID` <- this_object$`SHIPPING_INVALID`
      self$`TAX_INVALID` <- this_object$`TAX_INVALID`
      self$`SHIPPING_WEIGHT_INVALID` <- this_object$`SHIPPING_WEIGHT_INVALID`
      self$`EXPIRATION_DATE_INVALID` <- this_object$`EXPIRATION_DATE_INVALID`
      self$`AVAILABILITY_DATE_INVALID` <- this_object$`AVAILABILITY_DATE_INVALID`
      self$`SALE_DATE_INVALID` <- this_object$`SALE_DATE_INVALID`
      self$`WEIGHT_UNIT_INVALID` <- this_object$`WEIGHT_UNIT_INVALID`
      self$`IS_BUNDLE_INVALID` <- this_object$`IS_BUNDLE_INVALID`
      self$`UPDATED_TIME_INVALID` <- this_object$`UPDATED_TIME_INVALID`
      self$`CUSTOM_LABEL_LENGTH_TOO_LONG` <- this_object$`CUSTOM_LABEL_LENGTH_TOO_LONG`
      self$`PRODUCT_TYPE_LENGTH_TOO_LONG` <- this_object$`PRODUCT_TYPE_LENGTH_TOO_LONG`
      self$`TOO_MANY_ADDITIONAL_IMAGE_LINKS` <- this_object$`TOO_MANY_ADDITIONAL_IMAGE_LINKS`
      self$`MULTIPACK_INVALID` <- this_object$`MULTIPACK_INVALID`
      self$`INDEXED_PRODUCT_COUNT_LARGE_DELTA` <- this_object$`INDEXED_PRODUCT_COUNT_LARGE_DELTA`
      self$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` <- this_object$`ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`
      self$`OPTIONAL_PRODUCT_CATEGORY_MISSING` <- this_object$`OPTIONAL_PRODUCT_CATEGORY_MISSING`
      self$`OPTIONAL_PRODUCT_CATEGORY_INVALID` <- this_object$`OPTIONAL_PRODUCT_CATEGORY_INVALID`
      self$`OPTIONAL_CONDITION_MISSING` <- this_object$`OPTIONAL_CONDITION_MISSING`
      self$`OPTIONAL_CONDITION_INVALID` <- this_object$`OPTIONAL_CONDITION_INVALID`
      self$`IOS_DEEP_LINK_INVALID` <- this_object$`IOS_DEEP_LINK_INVALID`
      self$`ANDROID_DEEP_LINK_INVALID` <- this_object$`ANDROID_DEEP_LINK_INVALID`
      self$`UTM_SOURCE_AUTO_CORRECTED` <- this_object$`UTM_SOURCE_AUTO_CORRECTED`
      self$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY` <- this_object$`COUNTRY_DOES_NOT_MAP_TO_CURRENCY`
      self$`MIN_AD_PRICE_INVALID` <- this_object$`MIN_AD_PRICE_INVALID`
      self$`GTIN_INVALID` <- this_object$`GTIN_INVALID`
      self$`INCONSISTENT_CURRENCY_VALUES` <- this_object$`INCONSISTENT_CURRENCY_VALUES`
      self$`SALES_PRICE_TOO_LOW` <- this_object$`SALES_PRICE_TOO_LOW`
      self$`SHIPPING_WIDTH_INVALID` <- this_object$`SHIPPING_WIDTH_INVALID`
      self$`SHIPPING_HEIGHT_INVALID` <- this_object$`SHIPPING_HEIGHT_INVALID`
      self$`SALES_PRICE_TOO_HIGH` <- this_object$`SALES_PRICE_TOO_HIGH`
      self$`MPN_INVALID` <- this_object$`MPN_INVALID`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedValidationWarnings and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedValidationWarnings
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
# CatalogsFeedValidationWarnings$unlock()
#
## Below is an example to define the print function
# CatalogsFeedValidationWarnings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedValidationWarnings$lock()

