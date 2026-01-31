#' Create a new AdCreateRequest
#'
#' @description
#' AdCreateRequest Class
#'
#' @docType class
#' @title AdCreateRequest
#' @description AdCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field ad_group_id ID of the ad group that contains the ad. character
#' @field android_deep_link Deep link URL for Android devices. character [optional]
#' @field carousel_android_deep_links Comma-separated deep links for the carousel pin on Android. list(character) [optional]
#' @field carousel_destination_urls Comma-separated destination URLs for the carousel pin to promote. list(character) [optional]
#' @field carousel_ios_deep_links Comma-separated deep links for the carousel pin on iOS. list(character) [optional]
#' @field click_tracking_url Tracking url for the ad clicks. character [optional]
#' @field creative_type  \link{CreativeType}
#' @field customizable_cta_type  \link{CustomizableCTAType} [optional]
#' @field destination_url Destination URL. character [optional]
#' @field disclosure_type  \link{DisclosureType} [optional]
#' @field disclosure_url URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. character [optional]
#' @field grid_click_type  \link{GridClickType} [optional]
#' @field ios_deep_link Deep link URL for iOS devices. character [optional]
#' @field is_pin_deleted Is original pin deleted? character [optional]
#' @field is_removable Is pin repinnable? character [optional]
#' @field lead_form_id Lead form ID for lead ad generation. character [optional]
#' @field name Name of the ad - 255 chars max. character [optional]
#' @field quiz_pin_data Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. \link{QuizPinData} [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @field view_tracking_url Tracking URL for ad impressions. character [optional]
#' @field pin_id Pin ID. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdCreateRequest <- R6::R6Class(
  "AdCreateRequest",
  public = list(
    `ad_group_id` = NULL,
    `android_deep_link` = NULL,
    `carousel_android_deep_links` = NULL,
    `carousel_destination_urls` = NULL,
    `carousel_ios_deep_links` = NULL,
    `click_tracking_url` = NULL,
    `creative_type` = NULL,
    `customizable_cta_type` = NULL,
    `destination_url` = NULL,
    `disclosure_type` = NULL,
    `disclosure_url` = NULL,
    `grid_click_type` = NULL,
    `ios_deep_link` = NULL,
    `is_pin_deleted` = NULL,
    `is_removable` = NULL,
    `lead_form_id` = NULL,
    `name` = NULL,
    `quiz_pin_data` = NULL,
    `status` = NULL,
    `tracking_urls` = NULL,
    `view_tracking_url` = NULL,
    `pin_id` = NULL,

    #' @description
    #' Initialize a new AdCreateRequest class.
    #'
    #' @param ad_group_id ID of the ad group that contains the ad.
    #' @param creative_type creative_type
    #' @param pin_id Pin ID.
    #' @param android_deep_link Deep link URL for Android devices.
    #' @param carousel_android_deep_links Comma-separated deep links for the carousel pin on Android.
    #' @param carousel_destination_urls Comma-separated destination URLs for the carousel pin to promote.
    #' @param carousel_ios_deep_links Comma-separated deep links for the carousel pin on iOS.
    #' @param click_tracking_url Tracking url for the ad clicks.
    #' @param customizable_cta_type customizable_cta_type
    #' @param destination_url Destination URL.
    #' @param disclosure_type disclosure_type
    #' @param disclosure_url URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
    #' @param grid_click_type grid_click_type
    #' @param ios_deep_link Deep link URL for iOS devices.
    #' @param is_pin_deleted Is original pin deleted?
    #' @param is_removable Is pin repinnable?
    #' @param lead_form_id Lead form ID for lead ad generation.
    #' @param name Name of the ad - 255 chars max.
    #' @param quiz_pin_data Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
    #' @param status status
    #' @param tracking_urls tracking_urls
    #' @param view_tracking_url Tracking URL for ad impressions.
    #' @param ... Other optional arguments.
    initialize = function(`ad_group_id`, `creative_type`, `pin_id`, `android_deep_link` = NULL, `carousel_android_deep_links` = NULL, `carousel_destination_urls` = NULL, `carousel_ios_deep_links` = NULL, `click_tracking_url` = NULL, `customizable_cta_type` = NULL, `destination_url` = NULL, `disclosure_type` = NULL, `disclosure_url` = NULL, `grid_click_type` = NULL, `ios_deep_link` = NULL, `is_pin_deleted` = NULL, `is_removable` = NULL, `lead_form_id` = NULL, `name` = NULL, `quiz_pin_data` = NULL, `status` = NULL, `tracking_urls` = NULL, `view_tracking_url` = NULL, ...) {
      if (!missing(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
      }
      if (!missing(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
      }
      if (!missing(`pin_id`)) {
        if (!(is.character(`pin_id`) && length(`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", `pin_id`))
        }
        self$`pin_id` <- `pin_id`
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
      if (!is.null(`click_tracking_url`)) {
        if (!(is.character(`click_tracking_url`) && length(`click_tracking_url`) == 1)) {
          stop(paste("Error! Invalid data for `click_tracking_url`. Must be a string:", `click_tracking_url`))
        }
        self$`click_tracking_url` <- `click_tracking_url`
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
    #' @return AdCreateRequest as a base R list.
    #' @examples
    #' # convert array of AdCreateRequest (x) to a data frame
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
    #' Convert AdCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdCreateRequestObject <- list()
      if (!is.null(self$`ad_group_id`)) {
        AdCreateRequestObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      if (!is.null(self$`android_deep_link`)) {
        AdCreateRequestObject[["android_deep_link"]] <-
          self$`android_deep_link`
      }
      if (!is.null(self$`carousel_android_deep_links`)) {
        AdCreateRequestObject[["carousel_android_deep_links"]] <-
          self$`carousel_android_deep_links`
      }
      if (!is.null(self$`carousel_destination_urls`)) {
        AdCreateRequestObject[["carousel_destination_urls"]] <-
          self$`carousel_destination_urls`
      }
      if (!is.null(self$`carousel_ios_deep_links`)) {
        AdCreateRequestObject[["carousel_ios_deep_links"]] <-
          self$`carousel_ios_deep_links`
      }
      if (!is.null(self$`click_tracking_url`)) {
        AdCreateRequestObject[["click_tracking_url"]] <-
          self$`click_tracking_url`
      }
      if (!is.null(self$`creative_type`)) {
        AdCreateRequestObject[["creative_type"]] <-
          self$`creative_type`$toSimpleType()
      }
      if (!is.null(self$`customizable_cta_type`)) {
        AdCreateRequestObject[["customizable_cta_type"]] <-
          self$`customizable_cta_type`$toSimpleType()
      }
      if (!is.null(self$`destination_url`)) {
        AdCreateRequestObject[["destination_url"]] <-
          self$`destination_url`
      }
      if (!is.null(self$`disclosure_type`)) {
        AdCreateRequestObject[["disclosure_type"]] <-
          self$`disclosure_type`$toSimpleType()
      }
      if (!is.null(self$`disclosure_url`)) {
        AdCreateRequestObject[["disclosure_url"]] <-
          self$`disclosure_url`
      }
      if (!is.null(self$`grid_click_type`)) {
        AdCreateRequestObject[["grid_click_type"]] <-
          self$`grid_click_type`$toSimpleType()
      }
      if (!is.null(self$`ios_deep_link`)) {
        AdCreateRequestObject[["ios_deep_link"]] <-
          self$`ios_deep_link`
      }
      if (!is.null(self$`is_pin_deleted`)) {
        AdCreateRequestObject[["is_pin_deleted"]] <-
          self$`is_pin_deleted`
      }
      if (!is.null(self$`is_removable`)) {
        AdCreateRequestObject[["is_removable"]] <-
          self$`is_removable`
      }
      if (!is.null(self$`lead_form_id`)) {
        AdCreateRequestObject[["lead_form_id"]] <-
          self$`lead_form_id`
      }
      if (!is.null(self$`name`)) {
        AdCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`quiz_pin_data`)) {
        AdCreateRequestObject[["quiz_pin_data"]] <-
          self$`quiz_pin_data`$toSimpleType()
      }
      if (!is.null(self$`status`)) {
        AdCreateRequestObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`tracking_urls`)) {
        AdCreateRequestObject[["tracking_urls"]] <-
          self$`tracking_urls`$toSimpleType()
      }
      if (!is.null(self$`view_tracking_url`)) {
        AdCreateRequestObject[["view_tracking_url"]] <-
          self$`view_tracking_url`
      }
      if (!is.null(self$`pin_id`)) {
        AdCreateRequestObject[["pin_id"]] <-
          self$`pin_id`
      }
      return(AdCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      if (!is.null(this_object$`android_deep_link`)) {
        self$`android_deep_link` <- this_object$`android_deep_link`
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
      if (!is.null(this_object$`click_tracking_url`)) {
        self$`click_tracking_url` <- this_object$`click_tracking_url`
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
      if (!is.null(this_object$`ios_deep_link`)) {
        self$`ios_deep_link` <- this_object$`ios_deep_link`
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
      if (!is.null(this_object$`quiz_pin_data`)) {
        `quiz_pin_data_object` <- QuizPinData$new()
        `quiz_pin_data_object`$fromJSON(jsonlite::toJSON(this_object$`quiz_pin_data`, auto_unbox = TRUE, digits = NA))
        self$`quiz_pin_data` <- `quiz_pin_data_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`view_tracking_url`)) {
        self$`view_tracking_url` <- this_object$`view_tracking_url`
      }
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- this_object$`pin_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_group_id` <- this_object$`ad_group_id`
      self$`android_deep_link` <- this_object$`android_deep_link`
      self$`carousel_android_deep_links` <- ApiClient$new()$deserializeObj(this_object$`carousel_android_deep_links`, "array[character]", loadNamespace("openapi"))
      self$`carousel_destination_urls` <- ApiClient$new()$deserializeObj(this_object$`carousel_destination_urls`, "array[character]", loadNamespace("openapi"))
      self$`carousel_ios_deep_links` <- ApiClient$new()$deserializeObj(this_object$`carousel_ios_deep_links`, "array[character]", loadNamespace("openapi"))
      self$`click_tracking_url` <- this_object$`click_tracking_url`
      self$`creative_type` <- CreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      self$`customizable_cta_type` <- CustomizableCTAType$new()$fromJSON(jsonlite::toJSON(this_object$`customizable_cta_type`, auto_unbox = TRUE, digits = NA))
      self$`destination_url` <- this_object$`destination_url`
      self$`disclosure_type` <- DisclosureType$new()$fromJSON(jsonlite::toJSON(this_object$`disclosure_type`, auto_unbox = TRUE, digits = NA))
      self$`disclosure_url` <- this_object$`disclosure_url`
      self$`grid_click_type` <- GridClickType$new()$fromJSON(jsonlite::toJSON(this_object$`grid_click_type`, auto_unbox = TRUE, digits = NA))
      self$`ios_deep_link` <- this_object$`ios_deep_link`
      self$`is_pin_deleted` <- this_object$`is_pin_deleted`
      self$`is_removable` <- this_object$`is_removable`
      self$`lead_form_id` <- this_object$`lead_form_id`
      self$`name` <- this_object$`name`
      self$`quiz_pin_data` <- QuizPinData$new()$fromJSON(jsonlite::toJSON(this_object$`quiz_pin_data`, auto_unbox = TRUE, digits = NA))
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`view_tracking_url` <- this_object$`view_tracking_url`
      self$`pin_id` <- this_object$`pin_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_group_id`
      if (!is.null(input_json$`ad_group_id`)) {
        if (!(is.character(input_json$`ad_group_id`) && length(input_json$`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", input_json$`ad_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdCreateRequest: the required field `ad_group_id` is missing."))
      }
      # check the required field `creative_type`
      if (!is.null(input_json$`creative_type`)) {
        stopifnot(R6::is.R6(input_json$`creative_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdCreateRequest: the required field `creative_type` is missing."))
      }
      # check the required field `pin_id`
      if (!is.null(input_json$`pin_id`)) {
        if (!(is.character(input_json$`pin_id`) && length(input_json$`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", input_json$`pin_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdCreateRequest: the required field `pin_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        return(FALSE)
      }

      # check if the required `creative_type` is null
      if (is.null(self$`creative_type`)) {
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

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        invalid_fields["ad_group_id"] <- "Non-nullable required field `ad_group_id` cannot be null."
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^(AG)?\\d+$."
      }

      # check if the required `creative_type` is null
      if (is.null(self$`creative_type`)) {
        invalid_fields["creative_type"] <- "Non-nullable required field `creative_type` cannot be null."
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
# AdCreateRequest$unlock()
#
## Below is an example to define the print function
# AdCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdCreateRequest$lock()

