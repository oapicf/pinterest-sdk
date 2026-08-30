#' Create a new Ad
#'
#' @description
#' Ad Class
#'
#' @docType class
#' @title Ad
#' @description Ad Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id The ID of the advertiser that this ad belongs to. character
#' @field ad_group_id ID of the ad group that contains the ad. character
#' @field android_deep_link Deep link URL for Android devices. character [optional]
#' @field campaign_id ID of the ad campaign that contains this ad. character
#' @field carousel_android_deep_links Comma-separated deep links for the carousel pin on Android. list(character) [optional]
#' @field carousel_destination_urls Comma-separated destination URLs for the carousel pin to promote. list(character) [optional]
#' @field carousel_ios_deep_links Comma-separated deep links for the carousel pin on iOS. list(character) [optional]
#' @field carting_platform_type The vendor platform type of the carting/WTB ad. integer [optional]
#' @field carting_products Array of carting/WTB products for the ad. list(\link{CartingProduct}) [optional]
#' @field click_tracking_url Tracking url for the ad clicks. character [optional]
#' @field collection_items_destination_url_template Destination URL template for all items within a collections drawer. character [optional]
#' @field collections_header_type  \link{AdCollectionsHeaderType} [optional]
#' @field created_time Pin creation time. Unix timestamp in seconds. integer [optional]
#' @field creative_type  \link{CreativeType}
#' @field customizable_cta_type  \link{CustomizableCTAType} [optional]
#' @field destination_url Destination URL. character [optional]
#' @field disclosure_type  \link{DisclosureType} [optional]
#' @field disclosure_url URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. character [optional]
#' @field grid_click_type  \link{GridClickType} [optional]
#' @field id The ID of this ad. character
#' @field ios_deep_link Deep link URL for iOS devices. character [optional]
#' @field is_carting Is the ad a carting/WTB ad? character [optional]
#' @field is_collage_accepted_terms Whether the advertiser has accepted the terms and conditions for collage ad. character [optional]
#' @field is_collage_single_destination Whether the collage ad has a single destination url override. character [optional]
#' @field is_pin_deleted Is original pin deleted? character [optional]
#' @field is_removable Is pin repinnable? character [optional]
#' @field lead_form_id Lead form ID for lead ad generation. character [optional]
#' @field name Name of the ad - 255 chars max. character [optional]
#' @field pin_id Pin ID. This field may only be updated for draft ads. character
#' @field quiz_pin_data Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. \link{QuizPinData} [optional]
#' @field rejected_reasons Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". list(\link{AdDisapprovalReasons})
#' @field rejection_labels Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". list(character)
#' @field review_status Ad review status \link{AdReviewStatus}
#' @field status  \link{EntityStatus} [optional]
#' @field summary_status Ad summary status \link{PinPromotionSummaryStatus}
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @field type Always \"ad\". character
#' @field updated_time Last update time. Unix timestamp in seconds. integer [optional]
#' @field view_tracking_url Tracking URL for ad impressions. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Ad <- R6::R6Class(
  "Ad",
  public = list(
    `ad_account_id` = NULL,
    `ad_group_id` = NULL,
    `android_deep_link` = NULL,
    `campaign_id` = NULL,
    `carousel_android_deep_links` = NULL,
    `carousel_destination_urls` = NULL,
    `carousel_ios_deep_links` = NULL,
    `carting_platform_type` = NULL,
    `carting_products` = NULL,
    `click_tracking_url` = NULL,
    `collection_items_destination_url_template` = NULL,
    `collections_header_type` = NULL,
    `created_time` = NULL,
    `creative_type` = NULL,
    `customizable_cta_type` = NULL,
    `destination_url` = NULL,
    `disclosure_type` = NULL,
    `disclosure_url` = NULL,
    `grid_click_type` = NULL,
    `id` = NULL,
    `ios_deep_link` = NULL,
    `is_carting` = NULL,
    `is_collage_accepted_terms` = NULL,
    `is_collage_single_destination` = NULL,
    `is_pin_deleted` = NULL,
    `is_removable` = NULL,
    `lead_form_id` = NULL,
    `name` = NULL,
    `pin_id` = NULL,
    `quiz_pin_data` = NULL,
    `rejected_reasons` = NULL,
    `rejection_labels` = NULL,
    `review_status` = NULL,
    `status` = NULL,
    `summary_status` = NULL,
    `tracking_urls` = NULL,
    `type` = NULL,
    `updated_time` = NULL,
    `view_tracking_url` = NULL,

    #' @description
    #' Initialize a new Ad class.
    #'
    #' @param ad_account_id The ID of the advertiser that this ad belongs to.
    #' @param ad_group_id ID of the ad group that contains the ad.
    #' @param campaign_id ID of the ad campaign that contains this ad.
    #' @param creative_type creative_type
    #' @param id The ID of this ad.
    #' @param pin_id Pin ID. This field may only be updated for draft ads.
    #' @param rejected_reasons Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
    #' @param rejection_labels Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
    #' @param review_status Ad review status
    #' @param summary_status Ad summary status
    #' @param type Always \"ad\".
    #' @param android_deep_link Deep link URL for Android devices.
    #' @param carousel_android_deep_links Comma-separated deep links for the carousel pin on Android.
    #' @param carousel_destination_urls Comma-separated destination URLs for the carousel pin to promote.
    #' @param carousel_ios_deep_links Comma-separated deep links for the carousel pin on iOS.
    #' @param carting_platform_type The vendor platform type of the carting/WTB ad.
    #' @param carting_products Array of carting/WTB products for the ad.
    #' @param click_tracking_url Tracking url for the ad clicks.
    #' @param collection_items_destination_url_template Destination URL template for all items within a collections drawer.
    #' @param collections_header_type collections_header_type
    #' @param created_time Pin creation time. Unix timestamp in seconds.
    #' @param customizable_cta_type customizable_cta_type
    #' @param destination_url Destination URL.
    #' @param disclosure_type disclosure_type
    #' @param disclosure_url URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
    #' @param grid_click_type grid_click_type
    #' @param ios_deep_link Deep link URL for iOS devices.
    #' @param is_carting Is the ad a carting/WTB ad?
    #' @param is_collage_accepted_terms Whether the advertiser has accepted the terms and conditions for collage ad.
    #' @param is_collage_single_destination Whether the collage ad has a single destination url override.
    #' @param is_pin_deleted Is original pin deleted?
    #' @param is_removable Is pin repinnable?
    #' @param lead_form_id Lead form ID for lead ad generation.
    #' @param name Name of the ad - 255 chars max.
    #' @param quiz_pin_data Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
    #' @param status status
    #' @param tracking_urls tracking_urls
    #' @param updated_time Last update time. Unix timestamp in seconds.
    #' @param view_tracking_url Tracking URL for ad impressions.
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id`, `ad_group_id`, `campaign_id`, `creative_type`, `id`, `pin_id`, `rejected_reasons`, `rejection_labels`, `review_status`, `summary_status`, `type`, `android_deep_link` = NULL, `carousel_android_deep_links` = NULL, `carousel_destination_urls` = NULL, `carousel_ios_deep_links` = NULL, `carting_platform_type` = NULL, `carting_products` = NULL, `click_tracking_url` = NULL, `collection_items_destination_url_template` = NULL, `collections_header_type` = NULL, `created_time` = NULL, `customizable_cta_type` = NULL, `destination_url` = NULL, `disclosure_type` = NULL, `disclosure_url` = NULL, `grid_click_type` = NULL, `ios_deep_link` = NULL, `is_carting` = NULL, `is_collage_accepted_terms` = NULL, `is_collage_single_destination` = NULL, `is_pin_deleted` = NULL, `is_removable` = NULL, `lead_form_id` = NULL, `name` = NULL, `quiz_pin_data` = NULL, `status` = NULL, `tracking_urls` = NULL, `updated_time` = NULL, `view_tracking_url` = NULL, ...) {
      if (!missing(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!missing(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
      }
      if (!missing(`campaign_id`)) {
        if (!(is.character(`campaign_id`) && length(`campaign_id`) == 1)) {
          stop(paste("Error! Invalid data for `campaign_id`. Must be a string:", `campaign_id`))
        }
        self$`campaign_id` <- `campaign_id`
      }
      if (!missing(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`pin_id`)) {
        if (!(is.character(`pin_id`) && length(`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", `pin_id`))
        }
        self$`pin_id` <- `pin_id`
      }
      if (!missing(`rejected_reasons`)) {
        stopifnot(is.vector(`rejected_reasons`), length(`rejected_reasons`) != 0)
        sapply(`rejected_reasons`, function(x) stopifnot(R6::is.R6(x)))
        self$`rejected_reasons` <- `rejected_reasons`
      }
      if (!missing(`rejection_labels`)) {
        stopifnot(is.vector(`rejection_labels`), length(`rejection_labels`) != 0)
        sapply(`rejection_labels`, function(x) stopifnot(is.character(x)))
        self$`rejection_labels` <- `rejection_labels`
      }
      if (!missing(`review_status`)) {
        if (!(`review_status` %in% c())) {
          stop(paste("Error! \"", `review_status`, "\" cannot be assigned to `review_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`review_status`))
        self$`review_status` <- `review_status`
      }
      if (!missing(`summary_status`)) {
        if (!(`summary_status` %in% c())) {
          stop(paste("Error! \"", `summary_status`, "\" cannot be assigned to `summary_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`summary_status`))
        self$`summary_status` <- `summary_status`
      }
      if (!missing(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`android_deep_link`)) {
        if (!(is.character(`android_deep_link`) && length(`android_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `android_deep_link`. Must be a string:", `android_deep_link`))
        }
        self$`android_deep_link` <- `android_deep_link`
      }
      if (!is.null(`carousel_android_deep_links`)) {
        stopifnot(is.vector(`carousel_android_deep_links`), length(`carousel_android_deep_links`) != 0)
        sapply(`carousel_android_deep_links`, function(x) stopifnot(is.character(x)))
        self$`carousel_android_deep_links` <- `carousel_android_deep_links`
      }
      if (!is.null(`carousel_destination_urls`)) {
        stopifnot(is.vector(`carousel_destination_urls`), length(`carousel_destination_urls`) != 0)
        sapply(`carousel_destination_urls`, function(x) stopifnot(is.character(x)))
        self$`carousel_destination_urls` <- `carousel_destination_urls`
      }
      if (!is.null(`carousel_ios_deep_links`)) {
        stopifnot(is.vector(`carousel_ios_deep_links`), length(`carousel_ios_deep_links`) != 0)
        sapply(`carousel_ios_deep_links`, function(x) stopifnot(is.character(x)))
        self$`carousel_ios_deep_links` <- `carousel_ios_deep_links`
      }
      if (!is.null(`carting_platform_type`)) {
        if (!(is.numeric(`carting_platform_type`) && length(`carting_platform_type`) == 1)) {
          stop(paste("Error! Invalid data for `carting_platform_type`. Must be an integer:", `carting_platform_type`))
        }
        self$`carting_platform_type` <- `carting_platform_type`
      }
      if (!is.null(`carting_products`)) {
        stopifnot(is.vector(`carting_products`), length(`carting_products`) != 0)
        sapply(`carting_products`, function(x) stopifnot(R6::is.R6(x)))
        self$`carting_products` <- `carting_products`
      }
      if (!is.null(`click_tracking_url`)) {
        if (!(is.character(`click_tracking_url`) && length(`click_tracking_url`) == 1)) {
          stop(paste("Error! Invalid data for `click_tracking_url`. Must be a string:", `click_tracking_url`))
        }
        self$`click_tracking_url` <- `click_tracking_url`
      }
      if (!is.null(`collection_items_destination_url_template`)) {
        if (!(is.character(`collection_items_destination_url_template`) && length(`collection_items_destination_url_template`) == 1)) {
          stop(paste("Error! Invalid data for `collection_items_destination_url_template`. Must be a string:", `collection_items_destination_url_template`))
        }
        self$`collection_items_destination_url_template` <- `collection_items_destination_url_template`
      }
      if (!is.null(`collections_header_type`)) {
        if (!(`collections_header_type` %in% c())) {
          stop(paste("Error! \"", `collections_header_type`, "\" cannot be assigned to `collections_header_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`collections_header_type`))
        self$`collections_header_type` <- `collections_header_type`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`customizable_cta_type`)) {
        if (!(`customizable_cta_type` %in% c())) {
          stop(paste("Error! \"", `customizable_cta_type`, "\" cannot be assigned to `customizable_cta_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`customizable_cta_type`))
        self$`customizable_cta_type` <- `customizable_cta_type`
      }
      if (!is.null(`destination_url`)) {
        if (!(is.character(`destination_url`) && length(`destination_url`) == 1)) {
          stop(paste("Error! Invalid data for `destination_url`. Must be a string:", `destination_url`))
        }
        self$`destination_url` <- `destination_url`
      }
      if (!is.null(`disclosure_type`)) {
        if (!(`disclosure_type` %in% c())) {
          stop(paste("Error! \"", `disclosure_type`, "\" cannot be assigned to `disclosure_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`disclosure_type`))
        self$`disclosure_type` <- `disclosure_type`
      }
      if (!is.null(`disclosure_url`)) {
        if (!(is.character(`disclosure_url`) && length(`disclosure_url`) == 1)) {
          stop(paste("Error! Invalid data for `disclosure_url`. Must be a string:", `disclosure_url`))
        }
        self$`disclosure_url` <- `disclosure_url`
      }
      if (!is.null(`grid_click_type`)) {
        if (!(`grid_click_type` %in% c())) {
          stop(paste("Error! \"", `grid_click_type`, "\" cannot be assigned to `grid_click_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`grid_click_type`))
        self$`grid_click_type` <- `grid_click_type`
      }
      if (!is.null(`ios_deep_link`)) {
        if (!(is.character(`ios_deep_link`) && length(`ios_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `ios_deep_link`. Must be a string:", `ios_deep_link`))
        }
        self$`ios_deep_link` <- `ios_deep_link`
      }
      if (!is.null(`is_carting`)) {
        if (!(is.logical(`is_carting`) && length(`is_carting`) == 1)) {
          stop(paste("Error! Invalid data for `is_carting`. Must be a boolean:", `is_carting`))
        }
        self$`is_carting` <- `is_carting`
      }
      if (!is.null(`is_collage_accepted_terms`)) {
        if (!(is.logical(`is_collage_accepted_terms`) && length(`is_collage_accepted_terms`) == 1)) {
          stop(paste("Error! Invalid data for `is_collage_accepted_terms`. Must be a boolean:", `is_collage_accepted_terms`))
        }
        self$`is_collage_accepted_terms` <- `is_collage_accepted_terms`
      }
      if (!is.null(`is_collage_single_destination`)) {
        if (!(is.logical(`is_collage_single_destination`) && length(`is_collage_single_destination`) == 1)) {
          stop(paste("Error! Invalid data for `is_collage_single_destination`. Must be a boolean:", `is_collage_single_destination`))
        }
        self$`is_collage_single_destination` <- `is_collage_single_destination`
      }
      if (!is.null(`is_pin_deleted`)) {
        if (!(is.logical(`is_pin_deleted`) && length(`is_pin_deleted`) == 1)) {
          stop(paste("Error! Invalid data for `is_pin_deleted`. Must be a boolean:", `is_pin_deleted`))
        }
        self$`is_pin_deleted` <- `is_pin_deleted`
      }
      if (!is.null(`is_removable`)) {
        if (!(is.logical(`is_removable`) && length(`is_removable`) == 1)) {
          stop(paste("Error! Invalid data for `is_removable`. Must be a boolean:", `is_removable`))
        }
        self$`is_removable` <- `is_removable`
      }
      if (!is.null(`lead_form_id`)) {
        if (!(is.character(`lead_form_id`) && length(`lead_form_id`) == 1)) {
          stop(paste("Error! Invalid data for `lead_form_id`. Must be a string:", `lead_form_id`))
        }
        self$`lead_form_id` <- `lead_form_id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`quiz_pin_data`)) {
        stopifnot(R6::is.R6(`quiz_pin_data`))
        self$`quiz_pin_data` <- `quiz_pin_data`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`tracking_urls`)) {
        stopifnot(R6::is.R6(`tracking_urls`))
        self$`tracking_urls` <- `tracking_urls`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`view_tracking_url`)) {
        if (!(is.character(`view_tracking_url`) && length(`view_tracking_url`) == 1)) {
          stop(paste("Error! Invalid data for `view_tracking_url`. Must be a string:", `view_tracking_url`))
        }
        self$`view_tracking_url` <- `view_tracking_url`
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
    #' @return Ad as a base R list.
    #' @examples
    #' # convert array of Ad (x) to a data frame
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
    #' Convert Ad to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AdObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`ad_group_id`)) {
        AdObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      if (!is.null(self$`android_deep_link`)) {
        AdObject[["android_deep_link"]] <-
          self$`android_deep_link`
      }
      if (!is.null(self$`campaign_id`)) {
        AdObject[["campaign_id"]] <-
          self$`campaign_id`
      }
      if (!is.null(self$`carousel_android_deep_links`)) {
        AdObject[["carousel_android_deep_links"]] <-
          self$`carousel_android_deep_links`
      }
      if (!is.null(self$`carousel_destination_urls`)) {
        AdObject[["carousel_destination_urls"]] <-
          self$`carousel_destination_urls`
      }
      if (!is.null(self$`carousel_ios_deep_links`)) {
        AdObject[["carousel_ios_deep_links"]] <-
          self$`carousel_ios_deep_links`
      }
      if (!is.null(self$`carting_platform_type`)) {
        AdObject[["carting_platform_type"]] <-
          self$`carting_platform_type`
      }
      if (!is.null(self$`carting_products`)) {
        AdObject[["carting_products"]] <-
          self$extractSimpleType(self$`carting_products`)
      }
      if (!is.null(self$`click_tracking_url`)) {
        AdObject[["click_tracking_url"]] <-
          self$`click_tracking_url`
      }
      if (!is.null(self$`collection_items_destination_url_template`)) {
        AdObject[["collection_items_destination_url_template"]] <-
          self$`collection_items_destination_url_template`
      }
      if (!is.null(self$`collections_header_type`)) {
        AdObject[["collections_header_type"]] <-
          self$extractSimpleType(self$`collections_header_type`)
      }
      if (!is.null(self$`created_time`)) {
        AdObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`creative_type`)) {
        AdObject[["creative_type"]] <-
          self$extractSimpleType(self$`creative_type`)
      }
      if (!is.null(self$`customizable_cta_type`)) {
        AdObject[["customizable_cta_type"]] <-
          self$extractSimpleType(self$`customizable_cta_type`)
      }
      if (!is.null(self$`destination_url`)) {
        AdObject[["destination_url"]] <-
          self$`destination_url`
      }
      if (!is.null(self$`disclosure_type`)) {
        AdObject[["disclosure_type"]] <-
          self$extractSimpleType(self$`disclosure_type`)
      }
      if (!is.null(self$`disclosure_url`)) {
        AdObject[["disclosure_url"]] <-
          self$`disclosure_url`
      }
      if (!is.null(self$`grid_click_type`)) {
        AdObject[["grid_click_type"]] <-
          self$extractSimpleType(self$`grid_click_type`)
      }
      if (!is.null(self$`id`)) {
        AdObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ios_deep_link`)) {
        AdObject[["ios_deep_link"]] <-
          self$`ios_deep_link`
      }
      if (!is.null(self$`is_carting`)) {
        AdObject[["is_carting"]] <-
          self$`is_carting`
      }
      if (!is.null(self$`is_collage_accepted_terms`)) {
        AdObject[["is_collage_accepted_terms"]] <-
          self$`is_collage_accepted_terms`
      }
      if (!is.null(self$`is_collage_single_destination`)) {
        AdObject[["is_collage_single_destination"]] <-
          self$`is_collage_single_destination`
      }
      if (!is.null(self$`is_pin_deleted`)) {
        AdObject[["is_pin_deleted"]] <-
          self$`is_pin_deleted`
      }
      if (!is.null(self$`is_removable`)) {
        AdObject[["is_removable"]] <-
          self$`is_removable`
      }
      if (!is.null(self$`lead_form_id`)) {
        AdObject[["lead_form_id"]] <-
          self$`lead_form_id`
      }
      if (!is.null(self$`name`)) {
        AdObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`pin_id`)) {
        AdObject[["pin_id"]] <-
          self$`pin_id`
      }
      if (!is.null(self$`quiz_pin_data`)) {
        AdObject[["quiz_pin_data"]] <-
          self$extractSimpleType(self$`quiz_pin_data`)
      }
      if (!is.null(self$`rejected_reasons`)) {
        AdObject[["rejected_reasons"]] <-
          self$extractSimpleType(self$`rejected_reasons`)
      }
      if (!is.null(self$`rejection_labels`)) {
        AdObject[["rejection_labels"]] <-
          self$`rejection_labels`
      }
      if (!is.null(self$`review_status`)) {
        AdObject[["review_status"]] <-
          self$extractSimpleType(self$`review_status`)
      }
      if (!is.null(self$`status`)) {
        AdObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`summary_status`)) {
        AdObject[["summary_status"]] <-
          self$extractSimpleType(self$`summary_status`)
      }
      if (!is.null(self$`tracking_urls`)) {
        AdObject[["tracking_urls"]] <-
          self$extractSimpleType(self$`tracking_urls`)
      }
      if (!is.null(self$`type`)) {
        AdObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`updated_time`)) {
        AdObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`view_tracking_url`)) {
        AdObject[["view_tracking_url"]] <-
          self$`view_tracking_url`
      }
      return(AdObject)
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
    #' Deserialize JSON string into an instance of Ad
    #'
    #' @param input_json the JSON input
    #' @return the instance of Ad
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      if (!is.null(this_object$`android_deep_link`)) {
        self$`android_deep_link` <- this_object$`android_deep_link`
      }
      if (!is.null(this_object$`campaign_id`)) {
        self$`campaign_id` <- this_object$`campaign_id`
      }
      if (!is.null(this_object$`carousel_android_deep_links`)) {
        self$`carousel_android_deep_links` <- ApiClient$new()$deserializeObj(this_object$`carousel_android_deep_links`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`carousel_destination_urls`)) {
        self$`carousel_destination_urls` <- ApiClient$new()$deserializeObj(this_object$`carousel_destination_urls`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`carousel_ios_deep_links`)) {
        self$`carousel_ios_deep_links` <- ApiClient$new()$deserializeObj(this_object$`carousel_ios_deep_links`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`carting_platform_type`)) {
        self$`carting_platform_type` <- this_object$`carting_platform_type`
      }
      if (!is.null(this_object$`carting_products`)) {
        self$`carting_products` <- ApiClient$new()$deserializeObj(this_object$`carting_products`, "array[CartingProduct]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`click_tracking_url`)) {
        self$`click_tracking_url` <- this_object$`click_tracking_url`
      }
      if (!is.null(this_object$`collection_items_destination_url_template`)) {
        self$`collection_items_destination_url_template` <- this_object$`collection_items_destination_url_template`
      }
      if (!is.null(this_object$`collections_header_type`)) {
        `collections_header_type_object` <- AdCollectionsHeaderType$new()
        `collections_header_type_object`$fromJSON(jsonlite::toJSON(this_object$`collections_header_type`, auto_unbox = TRUE, digits = NA))
        self$`collections_header_type` <- `collections_header_type_object`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`creative_type`)) {
        `creative_type_object` <- CreativeType$new()
        `creative_type_object`$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
        self$`creative_type` <- `creative_type_object`
      }
      if (!is.null(this_object$`customizable_cta_type`)) {
        `customizable_cta_type_object` <- CustomizableCTAType$new()
        `customizable_cta_type_object`$fromJSON(jsonlite::toJSON(this_object$`customizable_cta_type`, auto_unbox = TRUE, digits = NA))
        self$`customizable_cta_type` <- `customizable_cta_type_object`
      }
      if (!is.null(this_object$`destination_url`)) {
        self$`destination_url` <- this_object$`destination_url`
      }
      if (!is.null(this_object$`disclosure_type`)) {
        `disclosure_type_object` <- DisclosureType$new()
        `disclosure_type_object`$fromJSON(jsonlite::toJSON(this_object$`disclosure_type`, auto_unbox = TRUE, digits = NA))
        self$`disclosure_type` <- `disclosure_type_object`
      }
      if (!is.null(this_object$`disclosure_url`)) {
        self$`disclosure_url` <- this_object$`disclosure_url`
      }
      if (!is.null(this_object$`grid_click_type`)) {
        `grid_click_type_object` <- GridClickType$new()
        `grid_click_type_object`$fromJSON(jsonlite::toJSON(this_object$`grid_click_type`, auto_unbox = TRUE, digits = NA))
        self$`grid_click_type` <- `grid_click_type_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ios_deep_link`)) {
        self$`ios_deep_link` <- this_object$`ios_deep_link`
      }
      if (!is.null(this_object$`is_carting`)) {
        self$`is_carting` <- this_object$`is_carting`
      }
      if (!is.null(this_object$`is_collage_accepted_terms`)) {
        self$`is_collage_accepted_terms` <- this_object$`is_collage_accepted_terms`
      }
      if (!is.null(this_object$`is_collage_single_destination`)) {
        self$`is_collage_single_destination` <- this_object$`is_collage_single_destination`
      }
      if (!is.null(this_object$`is_pin_deleted`)) {
        self$`is_pin_deleted` <- this_object$`is_pin_deleted`
      }
      if (!is.null(this_object$`is_removable`)) {
        self$`is_removable` <- this_object$`is_removable`
      }
      if (!is.null(this_object$`lead_form_id`)) {
        self$`lead_form_id` <- this_object$`lead_form_id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- this_object$`pin_id`
      }
      if (!is.null(this_object$`quiz_pin_data`)) {
        `quiz_pin_data_object` <- QuizPinData$new()
        `quiz_pin_data_object`$fromJSON(jsonlite::toJSON(this_object$`quiz_pin_data`, auto_unbox = TRUE, digits = NA))
        self$`quiz_pin_data` <- `quiz_pin_data_object`
      }
      if (!is.null(this_object$`rejected_reasons`)) {
        self$`rejected_reasons` <- ApiClient$new()$deserializeObj(this_object$`rejected_reasons`, "array[AdDisapprovalReasons]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`rejection_labels`)) {
        self$`rejection_labels` <- ApiClient$new()$deserializeObj(this_object$`rejection_labels`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`review_status`)) {
        `review_status_object` <- AdReviewStatus$new()
        `review_status_object`$fromJSON(jsonlite::toJSON(this_object$`review_status`, auto_unbox = TRUE, digits = NA))
        self$`review_status` <- `review_status_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`summary_status`)) {
        `summary_status_object` <- PinPromotionSummaryStatus$new()
        `summary_status_object`$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
        self$`summary_status` <- `summary_status_object`
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`view_tracking_url`)) {
        self$`view_tracking_url` <- this_object$`view_tracking_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Ad in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Ad
    #'
    #' @param input_json the JSON input
    #' @return the instance of Ad
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`ad_group_id` <- this_object$`ad_group_id`
      self$`android_deep_link` <- this_object$`android_deep_link`
      self$`campaign_id` <- this_object$`campaign_id`
      self$`carousel_android_deep_links` <- ApiClient$new()$deserializeObj(this_object$`carousel_android_deep_links`, "array[character]", loadNamespace("openapi"))
      self$`carousel_destination_urls` <- ApiClient$new()$deserializeObj(this_object$`carousel_destination_urls`, "array[character]", loadNamespace("openapi"))
      self$`carousel_ios_deep_links` <- ApiClient$new()$deserializeObj(this_object$`carousel_ios_deep_links`, "array[character]", loadNamespace("openapi"))
      self$`carting_platform_type` <- this_object$`carting_platform_type`
      self$`carting_products` <- ApiClient$new()$deserializeObj(this_object$`carting_products`, "array[CartingProduct]", loadNamespace("openapi"))
      self$`click_tracking_url` <- this_object$`click_tracking_url`
      self$`collection_items_destination_url_template` <- this_object$`collection_items_destination_url_template`
      self$`collections_header_type` <- AdCollectionsHeaderType$new()$fromJSON(jsonlite::toJSON(this_object$`collections_header_type`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`creative_type` <- CreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      self$`customizable_cta_type` <- CustomizableCTAType$new()$fromJSON(jsonlite::toJSON(this_object$`customizable_cta_type`, auto_unbox = TRUE, digits = NA))
      self$`destination_url` <- this_object$`destination_url`
      self$`disclosure_type` <- DisclosureType$new()$fromJSON(jsonlite::toJSON(this_object$`disclosure_type`, auto_unbox = TRUE, digits = NA))
      self$`disclosure_url` <- this_object$`disclosure_url`
      self$`grid_click_type` <- GridClickType$new()$fromJSON(jsonlite::toJSON(this_object$`grid_click_type`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`ios_deep_link` <- this_object$`ios_deep_link`
      self$`is_carting` <- this_object$`is_carting`
      self$`is_collage_accepted_terms` <- this_object$`is_collage_accepted_terms`
      self$`is_collage_single_destination` <- this_object$`is_collage_single_destination`
      self$`is_pin_deleted` <- this_object$`is_pin_deleted`
      self$`is_removable` <- this_object$`is_removable`
      self$`lead_form_id` <- this_object$`lead_form_id`
      self$`name` <- this_object$`name`
      self$`pin_id` <- this_object$`pin_id`
      self$`quiz_pin_data` <- QuizPinData$new()$fromJSON(jsonlite::toJSON(this_object$`quiz_pin_data`, auto_unbox = TRUE, digits = NA))
      self$`rejected_reasons` <- ApiClient$new()$deserializeObj(this_object$`rejected_reasons`, "array[AdDisapprovalReasons]", loadNamespace("openapi"))
      self$`rejection_labels` <- ApiClient$new()$deserializeObj(this_object$`rejection_labels`, "array[character]", loadNamespace("openapi"))
      self$`review_status` <- AdReviewStatus$new()$fromJSON(jsonlite::toJSON(this_object$`review_status`, auto_unbox = TRUE, digits = NA))
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`summary_status` <- PinPromotionSummaryStatus$new()$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self$`updated_time` <- this_object$`updated_time`
      self$`view_tracking_url` <- this_object$`view_tracking_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to Ad and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_account_id`
      if (!is.null(input_json$`ad_account_id`)) {
        if (!(is.character(input_json$`ad_account_id`) && length(input_json$`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", input_json$`ad_account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `ad_account_id` is missing."))
      }
      # check the required field `ad_group_id`
      if (!is.null(input_json$`ad_group_id`)) {
        if (!(is.character(input_json$`ad_group_id`) && length(input_json$`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", input_json$`ad_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `ad_group_id` is missing."))
      }
      # check the required field `campaign_id`
      if (!is.null(input_json$`campaign_id`)) {
        if (!(is.character(input_json$`campaign_id`) && length(input_json$`campaign_id`) == 1)) {
          stop(paste("Error! Invalid data for `campaign_id`. Must be a string:", input_json$`campaign_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `campaign_id` is missing."))
      }
      # check the required field `creative_type`
      if (!is.null(input_json$`creative_type`)) {
        stopifnot(R6::is.R6(input_json$`creative_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `creative_type` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `id` is missing."))
      }
      # check the required field `pin_id`
      if (!is.null(input_json$`pin_id`)) {
        if (!(is.character(input_json$`pin_id`) && length(input_json$`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", input_json$`pin_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `pin_id` is missing."))
      }
      # check the required field `rejected_reasons`
      if (!is.null(input_json$`rejected_reasons`)) {
        stopifnot(is.vector(input_json$`rejected_reasons`), length(input_json$`rejected_reasons`) != 0)
        tmp <- sapply(input_json$`rejected_reasons`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `rejected_reasons` is missing."))
      }
      # check the required field `rejection_labels`
      if (!is.null(input_json$`rejection_labels`)) {
        stopifnot(is.vector(input_json$`rejection_labels`), length(input_json$`rejection_labels`) != 0)
        tmp <- sapply(input_json$`rejection_labels`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `rejection_labels` is missing."))
      }
      # check the required field `review_status`
      if (!is.null(input_json$`review_status`)) {
        stopifnot(R6::is.R6(input_json$`review_status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `review_status` is missing."))
      }
      # check the required field `summary_status`
      if (!is.null(input_json$`summary_status`)) {
        stopifnot(R6::is.R6(input_json$`summary_status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `summary_status` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ad: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Ad
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        return(FALSE)
      }

      # check if the required `campaign_id` is null
      if (is.null(self$`campaign_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`campaign_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (self$`carting_platform_type` > 2) {
        return(FALSE)
      }
      if (self$`carting_platform_type` < 1) {
        return(FALSE)
      }

      # check if the required `creative_type` is null
      if (is.null(self$`creative_type`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`lead_form_id`, "^(AG)?\\d+$")) {
        return(FALSE)
      }

      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`pin_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `rejected_reasons` is null
      if (is.null(self$`rejected_reasons`)) {
        return(FALSE)
      }

      # check if the required `rejection_labels` is null
      if (is.null(self$`rejection_labels`)) {
        return(FALSE)
      }

      # check if the required `review_status` is null
      if (is.null(self$`review_status`)) {
        return(FALSE)
      }

      # check if the required `summary_status` is null
      if (is.null(self$`summary_status`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        invalid_fields["ad_account_id"] <- "Non-nullable required field `ad_account_id` cannot be null."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        invalid_fields["ad_group_id"] <- "Non-nullable required field `ad_group_id` cannot be null."
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^(AG)?\\d+$."
      }

      # check if the required `campaign_id` is null
      if (is.null(self$`campaign_id`)) {
        invalid_fields["campaign_id"] <- "Non-nullable required field `campaign_id` cannot be null."
      }

      if (!str_detect(self$`campaign_id`, "^\\d+$")) {
        invalid_fields["campaign_id"] <- "Invalid value for `campaign_id`, must conform to the pattern ^\\d+$."
      }

      if (self$`carting_platform_type` > 2) {
        invalid_fields["carting_platform_type"] <- "Invalid value for `carting_platform_type`, must be smaller than or equal to 2."
      }
      if (self$`carting_platform_type` < 1) {
        invalid_fields["carting_platform_type"] <- "Invalid value for `carting_platform_type`, must be bigger than or equal to 1."
      }

      # check if the required `creative_type` is null
      if (is.null(self$`creative_type`)) {
        invalid_fields["creative_type"] <- "Non-nullable required field `creative_type` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) > 18) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`lead_form_id`, "^(AG)?\\d+$")) {
        invalid_fields["lead_form_id"] <- "Invalid value for `lead_form_id`, must conform to the pattern ^(AG)?\\d+$."
      }

      # check if the required `pin_id` is null
      if (is.null(self$`pin_id`)) {
        invalid_fields["pin_id"] <- "Non-nullable required field `pin_id` cannot be null."
      }

      if (!str_detect(self$`pin_id`, "^\\d+$")) {
        invalid_fields["pin_id"] <- "Invalid value for `pin_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `rejected_reasons` is null
      if (is.null(self$`rejected_reasons`)) {
        invalid_fields["rejected_reasons"] <- "Non-nullable required field `rejected_reasons` cannot be null."
      }

      # check if the required `rejection_labels` is null
      if (is.null(self$`rejection_labels`)) {
        invalid_fields["rejection_labels"] <- "Non-nullable required field `rejection_labels` cannot be null."
      }

      # check if the required `review_status` is null
      if (is.null(self$`review_status`)) {
        invalid_fields["review_status"] <- "Non-nullable required field `review_status` cannot be null."
      }

      # check if the required `summary_status` is null
      if (is.null(self$`summary_status`)) {
        invalid_fields["summary_status"] <- "Non-nullable required field `summary_status` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

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
# Ad$unlock()
#
## Below is an example to define the print function
# Ad$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Ad$lock()

