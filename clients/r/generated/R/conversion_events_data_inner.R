#' Create a new ConversionEventsDataInner
#'
#' @description
#' ConversionEventsDataInner Class
#'
#' @docType class
#' @title ConversionEventsDataInner
#' @description ConversionEventsDataInner Class
#' @format An \code{R6Class} generator object
#' @field action_source <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline` character
#' @field app_id The app store app ID. character [optional]
#' @field app_info  \link{ConversionEventAppInfo} [optional]
#' @field app_name Name of the app. character [optional]
#' @field app_version Version of the app. character [optional]
#' @field custom_data  \link{ConversionEventsDataInnerCustomData} [optional]
#' @field device_brand Brand of the user device. character [optional]
#' @field device_carrier User device's mobile carrier. character [optional]
#' @field device_info  \link{ConversionEventDeviceInfo} [optional]
#' @field device_model Model of the user device. character [optional]
#' @field device_type Type of the user device. character [optional]
#' @field event_id A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. character
#' @field event_name <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video` character
#' @field event_source_url URL of the web conversion event. character [optional]
#' @field event_time The time when the event happened. Unix timestamp in seconds. integer
#' @field language Two-character ISO-639-1 language code indicating the user's language. character [optional]
#' @field opt_out When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. character [optional]
#' @field os_version Version of the device operating system. character [optional]
#' @field partner_name The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ character [optional]
#' @field user_data  \link{ConversionEventsUserData}
#' @field wifi Whether the event occurred when the user device was connected to wifi. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsDataInner <- R6::R6Class(
  "ConversionEventsDataInner",
  public = list(
    `action_source` = NULL,
    `app_id` = NULL,
    `app_info` = NULL,
    `app_name` = NULL,
    `app_version` = NULL,
    `custom_data` = NULL,
    `device_brand` = NULL,
    `device_carrier` = NULL,
    `device_info` = NULL,
    `device_model` = NULL,
    `device_type` = NULL,
    `event_id` = NULL,
    `event_name` = NULL,
    `event_source_url` = NULL,
    `event_time` = NULL,
    `language` = NULL,
    `opt_out` = NULL,
    `os_version` = NULL,
    `partner_name` = NULL,
    `user_data` = NULL,
    `wifi` = NULL,

    #' @description
    #' Initialize a new ConversionEventsDataInner class.
    #'
    #' @param action_source <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
    #' @param event_id A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
    #' @param event_name <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
    #' @param event_time The time when the event happened. Unix timestamp in seconds.
    #' @param user_data user_data
    #' @param app_id The app store app ID.
    #' @param app_info app_info
    #' @param app_name Name of the app.
    #' @param app_version Version of the app.
    #' @param custom_data custom_data
    #' @param device_brand Brand of the user device.
    #' @param device_carrier User device's mobile carrier.
    #' @param device_info device_info
    #' @param device_model Model of the user device.
    #' @param device_type Type of the user device.
    #' @param event_source_url URL of the web conversion event.
    #' @param language Two-character ISO-639-1 language code indicating the user's language.
    #' @param opt_out When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
    #' @param os_version Version of the device operating system.
    #' @param partner_name The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
    #' @param wifi Whether the event occurred when the user device was connected to wifi.
    #' @param ... Other optional arguments.
    initialize = function(`action_source`, `event_id`, `event_name`, `event_time`, `user_data`, `app_id` = NULL, `app_info` = NULL, `app_name` = NULL, `app_version` = NULL, `custom_data` = NULL, `device_brand` = NULL, `device_carrier` = NULL, `device_info` = NULL, `device_model` = NULL, `device_type` = NULL, `event_source_url` = NULL, `language` = NULL, `opt_out` = NULL, `os_version` = NULL, `partner_name` = NULL, `wifi` = NULL, ...) {
      if (!missing(`action_source`)) {
        if (!(is.character(`action_source`) && length(`action_source`) == 1)) {
          stop(paste("Error! Invalid data for `action_source`. Must be a string:", `action_source`))
        }
        self$`action_source` <- `action_source`
      }
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`event_name`)) {
        if (!(is.character(`event_name`) && length(`event_name`) == 1)) {
          stop(paste("Error! Invalid data for `event_name`. Must be a string:", `event_name`))
        }
        self$`event_name` <- `event_name`
      }
      if (!missing(`event_time`)) {
        if (!(is.numeric(`event_time`) && length(`event_time`) == 1)) {
          stop(paste("Error! Invalid data for `event_time`. Must be an integer:", `event_time`))
        }
        self$`event_time` <- `event_time`
      }
      if (!missing(`user_data`)) {
        stopifnot(R6::is.R6(`user_data`))
        self$`user_data` <- `user_data`
      }
      if (!is.null(`app_id`)) {
        if (!(is.character(`app_id`) && length(`app_id`) == 1)) {
          stop(paste("Error! Invalid data for `app_id`. Must be a string:", `app_id`))
        }
        self$`app_id` <- `app_id`
      }
      if (!is.null(`app_info`)) {
        stopifnot(R6::is.R6(`app_info`))
        self$`app_info` <- `app_info`
      }
      if (!is.null(`app_name`)) {
        if (!(is.character(`app_name`) && length(`app_name`) == 1)) {
          stop(paste("Error! Invalid data for `app_name`. Must be a string:", `app_name`))
        }
        self$`app_name` <- `app_name`
      }
      if (!is.null(`app_version`)) {
        if (!(is.character(`app_version`) && length(`app_version`) == 1)) {
          stop(paste("Error! Invalid data for `app_version`. Must be a string:", `app_version`))
        }
        self$`app_version` <- `app_version`
      }
      if (!is.null(`custom_data`)) {
        stopifnot(R6::is.R6(`custom_data`))
        self$`custom_data` <- `custom_data`
      }
      if (!is.null(`device_brand`)) {
        if (!(is.character(`device_brand`) && length(`device_brand`) == 1)) {
          stop(paste("Error! Invalid data for `device_brand`. Must be a string:", `device_brand`))
        }
        self$`device_brand` <- `device_brand`
      }
      if (!is.null(`device_carrier`)) {
        if (!(is.character(`device_carrier`) && length(`device_carrier`) == 1)) {
          stop(paste("Error! Invalid data for `device_carrier`. Must be a string:", `device_carrier`))
        }
        self$`device_carrier` <- `device_carrier`
      }
      if (!is.null(`device_info`)) {
        stopifnot(R6::is.R6(`device_info`))
        self$`device_info` <- `device_info`
      }
      if (!is.null(`device_model`)) {
        if (!(is.character(`device_model`) && length(`device_model`) == 1)) {
          stop(paste("Error! Invalid data for `device_model`. Must be a string:", `device_model`))
        }
        self$`device_model` <- `device_model`
      }
      if (!is.null(`device_type`)) {
        if (!(is.character(`device_type`) && length(`device_type`) == 1)) {
          stop(paste("Error! Invalid data for `device_type`. Must be a string:", `device_type`))
        }
        self$`device_type` <- `device_type`
      }
      if (!is.null(`event_source_url`)) {
        if (!(is.character(`event_source_url`) && length(`event_source_url`) == 1)) {
          stop(paste("Error! Invalid data for `event_source_url`. Must be a string:", `event_source_url`))
        }
        self$`event_source_url` <- `event_source_url`
      }
      if (!is.null(`language`)) {
        if (!(is.character(`language`) && length(`language`) == 1)) {
          stop(paste("Error! Invalid data for `language`. Must be a string:", `language`))
        }
        self$`language` <- `language`
      }
      if (!is.null(`opt_out`)) {
        if (!(is.logical(`opt_out`) && length(`opt_out`) == 1)) {
          stop(paste("Error! Invalid data for `opt_out`. Must be a boolean:", `opt_out`))
        }
        self$`opt_out` <- `opt_out`
      }
      if (!is.null(`os_version`)) {
        if (!(is.character(`os_version`) && length(`os_version`) == 1)) {
          stop(paste("Error! Invalid data for `os_version`. Must be a string:", `os_version`))
        }
        self$`os_version` <- `os_version`
      }
      if (!is.null(`partner_name`)) {
        if (!(is.character(`partner_name`) && length(`partner_name`) == 1)) {
          stop(paste("Error! Invalid data for `partner_name`. Must be a string:", `partner_name`))
        }
        self$`partner_name` <- `partner_name`
      }
      if (!is.null(`wifi`)) {
        if (!(is.logical(`wifi`) && length(`wifi`) == 1)) {
          stop(paste("Error! Invalid data for `wifi`. Must be a boolean:", `wifi`))
        }
        self$`wifi` <- `wifi`
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
    #' @return ConversionEventsDataInner as a base R list.
    #' @examples
    #' # convert array of ConversionEventsDataInner (x) to a data frame
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
    #' Convert ConversionEventsDataInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionEventsDataInnerObject <- list()
      if (!is.null(self$`action_source`)) {
        ConversionEventsDataInnerObject[["action_source"]] <-
          self$`action_source`
      }
      if (!is.null(self$`app_id`)) {
        ConversionEventsDataInnerObject[["app_id"]] <-
          self$`app_id`
      }
      if (!is.null(self$`app_info`)) {
        ConversionEventsDataInnerObject[["app_info"]] <-
          self$`app_info`$toSimpleType()
      }
      if (!is.null(self$`app_name`)) {
        ConversionEventsDataInnerObject[["app_name"]] <-
          self$`app_name`
      }
      if (!is.null(self$`app_version`)) {
        ConversionEventsDataInnerObject[["app_version"]] <-
          self$`app_version`
      }
      if (!is.null(self$`custom_data`)) {
        ConversionEventsDataInnerObject[["custom_data"]] <-
          self$`custom_data`$toSimpleType()
      }
      if (!is.null(self$`device_brand`)) {
        ConversionEventsDataInnerObject[["device_brand"]] <-
          self$`device_brand`
      }
      if (!is.null(self$`device_carrier`)) {
        ConversionEventsDataInnerObject[["device_carrier"]] <-
          self$`device_carrier`
      }
      if (!is.null(self$`device_info`)) {
        ConversionEventsDataInnerObject[["device_info"]] <-
          self$`device_info`$toSimpleType()
      }
      if (!is.null(self$`device_model`)) {
        ConversionEventsDataInnerObject[["device_model"]] <-
          self$`device_model`
      }
      if (!is.null(self$`device_type`)) {
        ConversionEventsDataInnerObject[["device_type"]] <-
          self$`device_type`
      }
      if (!is.null(self$`event_id`)) {
        ConversionEventsDataInnerObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`event_name`)) {
        ConversionEventsDataInnerObject[["event_name"]] <-
          self$`event_name`
      }
      if (!is.null(self$`event_source_url`)) {
        ConversionEventsDataInnerObject[["event_source_url"]] <-
          self$`event_source_url`
      }
      if (!is.null(self$`event_time`)) {
        ConversionEventsDataInnerObject[["event_time"]] <-
          self$`event_time`
      }
      if (!is.null(self$`language`)) {
        ConversionEventsDataInnerObject[["language"]] <-
          self$`language`
      }
      if (!is.null(self$`opt_out`)) {
        ConversionEventsDataInnerObject[["opt_out"]] <-
          self$`opt_out`
      }
      if (!is.null(self$`os_version`)) {
        ConversionEventsDataInnerObject[["os_version"]] <-
          self$`os_version`
      }
      if (!is.null(self$`partner_name`)) {
        ConversionEventsDataInnerObject[["partner_name"]] <-
          self$`partner_name`
      }
      if (!is.null(self$`user_data`)) {
        ConversionEventsDataInnerObject[["user_data"]] <-
          self$`user_data`$toSimpleType()
      }
      if (!is.null(self$`wifi`)) {
        ConversionEventsDataInnerObject[["wifi"]] <-
          self$`wifi`
      }
      return(ConversionEventsDataInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`action_source`)) {
        self$`action_source` <- this_object$`action_source`
      }
      if (!is.null(this_object$`app_id`)) {
        self$`app_id` <- this_object$`app_id`
      }
      if (!is.null(this_object$`app_info`)) {
        `app_info_object` <- ConversionEventAppInfo$new()
        `app_info_object`$fromJSON(jsonlite::toJSON(this_object$`app_info`, auto_unbox = TRUE, digits = NA))
        self$`app_info` <- `app_info_object`
      }
      if (!is.null(this_object$`app_name`)) {
        self$`app_name` <- this_object$`app_name`
      }
      if (!is.null(this_object$`app_version`)) {
        self$`app_version` <- this_object$`app_version`
      }
      if (!is.null(this_object$`custom_data`)) {
        `custom_data_object` <- ConversionEventsDataInnerCustomData$new()
        `custom_data_object`$fromJSON(jsonlite::toJSON(this_object$`custom_data`, auto_unbox = TRUE, digits = NA))
        self$`custom_data` <- `custom_data_object`
      }
      if (!is.null(this_object$`device_brand`)) {
        self$`device_brand` <- this_object$`device_brand`
      }
      if (!is.null(this_object$`device_carrier`)) {
        self$`device_carrier` <- this_object$`device_carrier`
      }
      if (!is.null(this_object$`device_info`)) {
        `device_info_object` <- ConversionEventDeviceInfo$new()
        `device_info_object`$fromJSON(jsonlite::toJSON(this_object$`device_info`, auto_unbox = TRUE, digits = NA))
        self$`device_info` <- `device_info_object`
      }
      if (!is.null(this_object$`device_model`)) {
        self$`device_model` <- this_object$`device_model`
      }
      if (!is.null(this_object$`device_type`)) {
        self$`device_type` <- this_object$`device_type`
      }
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`event_name`)) {
        self$`event_name` <- this_object$`event_name`
      }
      if (!is.null(this_object$`event_source_url`)) {
        self$`event_source_url` <- this_object$`event_source_url`
      }
      if (!is.null(this_object$`event_time`)) {
        self$`event_time` <- this_object$`event_time`
      }
      if (!is.null(this_object$`language`)) {
        self$`language` <- this_object$`language`
      }
      if (!is.null(this_object$`opt_out`)) {
        self$`opt_out` <- this_object$`opt_out`
      }
      if (!is.null(this_object$`os_version`)) {
        self$`os_version` <- this_object$`os_version`
      }
      if (!is.null(this_object$`partner_name`)) {
        self$`partner_name` <- this_object$`partner_name`
      }
      if (!is.null(this_object$`user_data`)) {
        `user_data_object` <- ConversionEventsUserData$new()
        `user_data_object`$fromJSON(jsonlite::toJSON(this_object$`user_data`, auto_unbox = TRUE, digits = NA))
        self$`user_data` <- `user_data_object`
      }
      if (!is.null(this_object$`wifi`)) {
        self$`wifi` <- this_object$`wifi`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionEventsDataInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`action_source` <- this_object$`action_source`
      self$`app_id` <- this_object$`app_id`
      self$`app_info` <- ConversionEventAppInfo$new()$fromJSON(jsonlite::toJSON(this_object$`app_info`, auto_unbox = TRUE, digits = NA))
      self$`app_name` <- this_object$`app_name`
      self$`app_version` <- this_object$`app_version`
      self$`custom_data` <- ConversionEventsDataInnerCustomData$new()$fromJSON(jsonlite::toJSON(this_object$`custom_data`, auto_unbox = TRUE, digits = NA))
      self$`device_brand` <- this_object$`device_brand`
      self$`device_carrier` <- this_object$`device_carrier`
      self$`device_info` <- ConversionEventDeviceInfo$new()$fromJSON(jsonlite::toJSON(this_object$`device_info`, auto_unbox = TRUE, digits = NA))
      self$`device_model` <- this_object$`device_model`
      self$`device_type` <- this_object$`device_type`
      self$`event_id` <- this_object$`event_id`
      self$`event_name` <- this_object$`event_name`
      self$`event_source_url` <- this_object$`event_source_url`
      self$`event_time` <- this_object$`event_time`
      self$`language` <- this_object$`language`
      self$`opt_out` <- this_object$`opt_out`
      self$`os_version` <- this_object$`os_version`
      self$`partner_name` <- this_object$`partner_name`
      self$`user_data` <- ConversionEventsUserData$new()$fromJSON(jsonlite::toJSON(this_object$`user_data`, auto_unbox = TRUE, digits = NA))
      self$`wifi` <- this_object$`wifi`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsDataInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `action_source`
      if (!is.null(input_json$`action_source`)) {
        if (!(is.character(input_json$`action_source`) && length(input_json$`action_source`) == 1)) {
          stop(paste("Error! Invalid data for `action_source`. Must be a string:", input_json$`action_source`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsDataInner: the required field `action_source` is missing."))
      }
      # check the required field `event_id`
      if (!is.null(input_json$`event_id`)) {
        if (!(is.character(input_json$`event_id`) && length(input_json$`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", input_json$`event_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsDataInner: the required field `event_id` is missing."))
      }
      # check the required field `event_name`
      if (!is.null(input_json$`event_name`)) {
        if (!(is.character(input_json$`event_name`) && length(input_json$`event_name`) == 1)) {
          stop(paste("Error! Invalid data for `event_name`. Must be a string:", input_json$`event_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsDataInner: the required field `event_name` is missing."))
      }
      # check the required field `event_time`
      if (!is.null(input_json$`event_time`)) {
        if (!(is.numeric(input_json$`event_time`) && length(input_json$`event_time`) == 1)) {
          stop(paste("Error! Invalid data for `event_time`. Must be an integer:", input_json$`event_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsDataInner: the required field `event_time` is missing."))
      }
      # check the required field `user_data`
      if (!is.null(input_json$`user_data`)) {
        stopifnot(R6::is.R6(input_json$`user_data`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEventsDataInner: the required field `user_data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsDataInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `action_source` is null
      if (is.null(self$`action_source`)) {
        return(FALSE)
      }

      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        return(FALSE)
      }

      # check if the required `event_name` is null
      if (is.null(self$`event_name`)) {
        return(FALSE)
      }

      # check if the required `event_time` is null
      if (is.null(self$`event_time`)) {
        return(FALSE)
      }

      # check if the required `user_data` is null
      if (is.null(self$`user_data`)) {
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
      # check if the required `action_source` is null
      if (is.null(self$`action_source`)) {
        invalid_fields["action_source"] <- "Non-nullable required field `action_source` cannot be null."
      }

      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        invalid_fields["event_id"] <- "Non-nullable required field `event_id` cannot be null."
      }

      # check if the required `event_name` is null
      if (is.null(self$`event_name`)) {
        invalid_fields["event_name"] <- "Non-nullable required field `event_name` cannot be null."
      }

      # check if the required `event_time` is null
      if (is.null(self$`event_time`)) {
        invalid_fields["event_time"] <- "Non-nullable required field `event_time` cannot be null."
      }

      # check if the required `user_data` is null
      if (is.null(self$`user_data`)) {
        invalid_fields["user_data"] <- "Non-nullable required field `user_data` cannot be null."
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
# ConversionEventsDataInner$unlock()
#
## Below is an example to define the print function
# ConversionEventsDataInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsDataInner$lock()

