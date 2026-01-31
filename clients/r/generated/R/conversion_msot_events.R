#' Create a new ConversionMSOTEvents
#'
#' @description
#' Object containing the MSOT conversion events.
#'
#' @docType class
#' @title ConversionMSOTEvents
#' @description ConversionMSOTEvents Class
#' @format An \code{R6Class} generator object
#' @field action_timestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. list(integer) [optional]
#' @field ad_group_id The ID of the ad group that was attributed to the conversion event. character
#' @field attribution_model The attribution model used to attribute the conversion event. character [optional]
#' @field attribution_scope Ad event type. character
#' @field attribution_score Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. numeric [optional]
#' @field campaign_id The ID of the campaign that was attributed to the conversion event. character [optional]
#' @field currency  \link{Currency} [optional]
#' @field event_id A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. character
#' @field event_name Type of user event. character
#' @field event_timestamp The time when the event occurred. Unix timestamp in seconds. integer
#' @field total_event_touchpoints Total number of ad events including other non-Pinterest ad platforms. integer [optional]
#' @field total_events Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p> integer [optional]
#' @field value Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionMSOTEvents <- R6::R6Class(
  "ConversionMSOTEvents",
  public = list(
    `action_timestamps` = NULL,
    `ad_group_id` = NULL,
    `attribution_model` = NULL,
    `attribution_scope` = NULL,
    `attribution_score` = NULL,
    `campaign_id` = NULL,
    `currency` = NULL,
    `event_id` = NULL,
    `event_name` = NULL,
    `event_timestamp` = NULL,
    `total_event_touchpoints` = NULL,
    `total_events` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new ConversionMSOTEvents class.
    #'
    #' @param ad_group_id The ID of the ad group that was attributed to the conversion event.
    #' @param attribution_scope Ad event type.
    #' @param event_id A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
    #' @param event_name Type of user event.
    #' @param event_timestamp The time when the event occurred. Unix timestamp in seconds.
    #' @param action_timestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
    #' @param attribution_model The attribution model used to attribute the conversion event.
    #' @param attribution_score Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
    #' @param campaign_id The ID of the campaign that was attributed to the conversion event.
    #' @param currency currency
    #' @param total_event_touchpoints Total number of ad events including other non-Pinterest ad platforms.
    #' @param total_events Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
    #' @param value Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
    #' @param ... Other optional arguments.
    initialize = function(`ad_group_id`, `attribution_scope`, `event_id`, `event_name`, `event_timestamp`, `action_timestamps` = NULL, `attribution_model` = NULL, `attribution_score` = NULL, `campaign_id` = NULL, `currency` = NULL, `total_event_touchpoints` = NULL, `total_events` = NULL, `value` = NULL, ...) {
      if (!missing(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
      }
      if (!missing(`attribution_scope`)) {
        if (!(`attribution_scope` %in% c("view", "engagement", "click"))) {
          stop(paste("Error! \"", `attribution_scope`, "\" cannot be assigned to `attribution_scope`. Must be \"view\", \"engagement\", \"click\".", sep = ""))
        }
        if (!(is.character(`attribution_scope`) && length(`attribution_scope`) == 1)) {
          stop(paste("Error! Invalid data for `attribution_scope`. Must be a string:", `attribution_scope`))
        }
        self$`attribution_scope` <- `attribution_scope`
      }
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`event_name`)) {
        if (!(`event_name` %in% c("add_to_cart", "checkout", "lead", "signup"))) {
          stop(paste("Error! \"", `event_name`, "\" cannot be assigned to `event_name`. Must be \"add_to_cart\", \"checkout\", \"lead\", \"signup\".", sep = ""))
        }
        if (!(is.character(`event_name`) && length(`event_name`) == 1)) {
          stop(paste("Error! Invalid data for `event_name`. Must be a string:", `event_name`))
        }
        self$`event_name` <- `event_name`
      }
      if (!missing(`event_timestamp`)) {
        if (!(is.numeric(`event_timestamp`) && length(`event_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `event_timestamp`. Must be an integer:", `event_timestamp`))
        }
        self$`event_timestamp` <- `event_timestamp`
      }
      if (!is.null(`action_timestamps`)) {
        stopifnot(is.vector(`action_timestamps`), length(`action_timestamps`) != 0)
        sapply(`action_timestamps`, function(x) stopifnot(is.character(x)))
        self$`action_timestamps` <- `action_timestamps`
      }
      if (!is.null(`attribution_model`)) {
        if (!(`attribution_model` %in% c("first_touch", "last_touch", "multi_touch"))) {
          stop(paste("Error! \"", `attribution_model`, "\" cannot be assigned to `attribution_model`. Must be \"first_touch\", \"last_touch\", \"multi_touch\".", sep = ""))
        }
        if (!(is.character(`attribution_model`) && length(`attribution_model`) == 1)) {
          stop(paste("Error! Invalid data for `attribution_model`. Must be a string:", `attribution_model`))
        }
        self$`attribution_model` <- `attribution_model`
      }
      if (!is.null(`attribution_score`)) {
        if (!(is.numeric(`attribution_score`) && length(`attribution_score`) == 1)) {
          stop(paste("Error! Invalid data for `attribution_score`. Must be a number:", `attribution_score`))
        }
        self$`attribution_score` <- `attribution_score`
      }
      if (!is.null(`campaign_id`)) {
        if (!(is.character(`campaign_id`) && length(`campaign_id`) == 1)) {
          stop(paste("Error! Invalid data for `campaign_id`. Must be a string:", `campaign_id`))
        }
        self$`campaign_id` <- `campaign_id`
      }
      if (!is.null(`currency`)) {
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`total_event_touchpoints`)) {
        if (!(is.numeric(`total_event_touchpoints`) && length(`total_event_touchpoints`) == 1)) {
          stop(paste("Error! Invalid data for `total_event_touchpoints`. Must be an integer:", `total_event_touchpoints`))
        }
        self$`total_event_touchpoints` <- `total_event_touchpoints`
      }
      if (!is.null(`total_events`)) {
        if (!(is.numeric(`total_events`) && length(`total_events`) == 1)) {
          stop(paste("Error! Invalid data for `total_events`. Must be an integer:", `total_events`))
        }
        self$`total_events` <- `total_events`
      }
      if (!is.null(`value`)) {
        if (!(is.numeric(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a number:", `value`))
        }
        self$`value` <- `value`
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
    #' @return ConversionMSOTEvents as a base R list.
    #' @examples
    #' # convert array of ConversionMSOTEvents (x) to a data frame
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
    #' Convert ConversionMSOTEvents to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionMSOTEventsObject <- list()
      if (!is.null(self$`action_timestamps`)) {
        ConversionMSOTEventsObject[["action_timestamps"]] <-
          self$`action_timestamps`
      }
      if (!is.null(self$`ad_group_id`)) {
        ConversionMSOTEventsObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      if (!is.null(self$`attribution_model`)) {
        ConversionMSOTEventsObject[["attribution_model"]] <-
          self$`attribution_model`
      }
      if (!is.null(self$`attribution_scope`)) {
        ConversionMSOTEventsObject[["attribution_scope"]] <-
          self$`attribution_scope`
      }
      if (!is.null(self$`attribution_score`)) {
        ConversionMSOTEventsObject[["attribution_score"]] <-
          self$`attribution_score`
      }
      if (!is.null(self$`campaign_id`)) {
        ConversionMSOTEventsObject[["campaign_id"]] <-
          self$`campaign_id`
      }
      if (!is.null(self$`currency`)) {
        ConversionMSOTEventsObject[["currency"]] <-
          self$`currency`$toSimpleType()
      }
      if (!is.null(self$`event_id`)) {
        ConversionMSOTEventsObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`event_name`)) {
        ConversionMSOTEventsObject[["event_name"]] <-
          self$`event_name`
      }
      if (!is.null(self$`event_timestamp`)) {
        ConversionMSOTEventsObject[["event_timestamp"]] <-
          self$`event_timestamp`
      }
      if (!is.null(self$`total_event_touchpoints`)) {
        ConversionMSOTEventsObject[["total_event_touchpoints"]] <-
          self$`total_event_touchpoints`
      }
      if (!is.null(self$`total_events`)) {
        ConversionMSOTEventsObject[["total_events"]] <-
          self$`total_events`
      }
      if (!is.null(self$`value`)) {
        ConversionMSOTEventsObject[["value"]] <-
          self$`value`
      }
      return(ConversionMSOTEventsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionMSOTEvents
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionMSOTEvents
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`action_timestamps`)) {
        self$`action_timestamps` <- ApiClient$new()$deserializeObj(this_object$`action_timestamps`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      if (!is.null(this_object$`attribution_model`)) {
        if (!is.null(this_object$`attribution_model`) && !(this_object$`attribution_model` %in% c("first_touch", "last_touch", "multi_touch"))) {
          stop(paste("Error! \"", this_object$`attribution_model`, "\" cannot be assigned to `attribution_model`. Must be \"first_touch\", \"last_touch\", \"multi_touch\".", sep = ""))
        }
        self$`attribution_model` <- this_object$`attribution_model`
      }
      if (!is.null(this_object$`attribution_scope`)) {
        if (!is.null(this_object$`attribution_scope`) && !(this_object$`attribution_scope` %in% c("view", "engagement", "click"))) {
          stop(paste("Error! \"", this_object$`attribution_scope`, "\" cannot be assigned to `attribution_scope`. Must be \"view\", \"engagement\", \"click\".", sep = ""))
        }
        self$`attribution_scope` <- this_object$`attribution_scope`
      }
      if (!is.null(this_object$`attribution_score`)) {
        self$`attribution_score` <- this_object$`attribution_score`
      }
      if (!is.null(this_object$`campaign_id`)) {
        self$`campaign_id` <- this_object$`campaign_id`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- Currency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`event_name`)) {
        if (!is.null(this_object$`event_name`) && !(this_object$`event_name` %in% c("add_to_cart", "checkout", "lead", "signup"))) {
          stop(paste("Error! \"", this_object$`event_name`, "\" cannot be assigned to `event_name`. Must be \"add_to_cart\", \"checkout\", \"lead\", \"signup\".", sep = ""))
        }
        self$`event_name` <- this_object$`event_name`
      }
      if (!is.null(this_object$`event_timestamp`)) {
        self$`event_timestamp` <- this_object$`event_timestamp`
      }
      if (!is.null(this_object$`total_event_touchpoints`)) {
        self$`total_event_touchpoints` <- this_object$`total_event_touchpoints`
      }
      if (!is.null(this_object$`total_events`)) {
        self$`total_events` <- this_object$`total_events`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionMSOTEvents in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionMSOTEvents
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionMSOTEvents
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`action_timestamps` <- ApiClient$new()$deserializeObj(this_object$`action_timestamps`, "array[integer]", loadNamespace("openapi"))
      self$`ad_group_id` <- this_object$`ad_group_id`
      if (!is.null(this_object$`attribution_model`) && !(this_object$`attribution_model` %in% c("first_touch", "last_touch", "multi_touch"))) {
        stop(paste("Error! \"", this_object$`attribution_model`, "\" cannot be assigned to `attribution_model`. Must be \"first_touch\", \"last_touch\", \"multi_touch\".", sep = ""))
      }
      self$`attribution_model` <- this_object$`attribution_model`
      if (!is.null(this_object$`attribution_scope`) && !(this_object$`attribution_scope` %in% c("view", "engagement", "click"))) {
        stop(paste("Error! \"", this_object$`attribution_scope`, "\" cannot be assigned to `attribution_scope`. Must be \"view\", \"engagement\", \"click\".", sep = ""))
      }
      self$`attribution_scope` <- this_object$`attribution_scope`
      self$`attribution_score` <- this_object$`attribution_score`
      self$`campaign_id` <- this_object$`campaign_id`
      self$`currency` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`event_name`) && !(this_object$`event_name` %in% c("add_to_cart", "checkout", "lead", "signup"))) {
        stop(paste("Error! \"", this_object$`event_name`, "\" cannot be assigned to `event_name`. Must be \"add_to_cart\", \"checkout\", \"lead\", \"signup\".", sep = ""))
      }
      self$`event_name` <- this_object$`event_name`
      self$`event_timestamp` <- this_object$`event_timestamp`
      self$`total_event_touchpoints` <- this_object$`total_event_touchpoints`
      self$`total_events` <- this_object$`total_events`
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionMSOTEvents and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ConversionMSOTEvents: the required field `ad_group_id` is missing."))
      }
      # check the required field `attribution_scope`
      if (!is.null(input_json$`attribution_scope`)) {
        if (!(is.character(input_json$`attribution_scope`) && length(input_json$`attribution_scope`) == 1)) {
          stop(paste("Error! Invalid data for `attribution_scope`. Must be a string:", input_json$`attribution_scope`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionMSOTEvents: the required field `attribution_scope` is missing."))
      }
      # check the required field `event_id`
      if (!is.null(input_json$`event_id`)) {
        if (!(is.character(input_json$`event_id`) && length(input_json$`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", input_json$`event_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionMSOTEvents: the required field `event_id` is missing."))
      }
      # check the required field `event_name`
      if (!is.null(input_json$`event_name`)) {
        if (!(is.character(input_json$`event_name`) && length(input_json$`event_name`) == 1)) {
          stop(paste("Error! Invalid data for `event_name`. Must be a string:", input_json$`event_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionMSOTEvents: the required field `event_name` is missing."))
      }
      # check the required field `event_timestamp`
      if (!is.null(input_json$`event_timestamp`)) {
        if (!(is.numeric(input_json$`event_timestamp`) && length(input_json$`event_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `event_timestamp`. Must be an integer:", input_json$`event_timestamp`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionMSOTEvents: the required field `event_timestamp` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionMSOTEvents
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

      if (!str_detect(self$`ad_group_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `attribution_scope` is null
      if (is.null(self$`attribution_scope`)) {
        return(FALSE)
      }

      if (self$`attribution_score` > 1) {
        return(FALSE)
      }
      if (self$`attribution_score` <= 0) {
        return(FALSE)
      }

      if (!str_detect(self$`campaign_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        return(FALSE)
      }

      if (nchar(self$`event_id`) > 256) {
        return(FALSE)
      }

      # check if the required `event_name` is null
      if (is.null(self$`event_name`)) {
        return(FALSE)
      }

      # check if the required `event_timestamp` is null
      if (is.null(self$`event_timestamp`)) {
        return(FALSE)
      }

      if (self$`total_event_touchpoints` < 1) {
        return(FALSE)
      }

      if (self$`total_events` < 1) {
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

      if (!str_detect(self$`ad_group_id`, "^\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `attribution_scope` is null
      if (is.null(self$`attribution_scope`)) {
        invalid_fields["attribution_scope"] <- "Non-nullable required field `attribution_scope` cannot be null."
      }

      if (self$`attribution_score` > 1) {
        invalid_fields["attribution_score"] <- "Invalid value for `attribution_score`, must be smaller than or equal to 1."
      }
      if (self$`attribution_score` <= 0) {
        invalid_fields["attribution_score"] <- "Invalid value for `attribution_score`, must be bigger than 0."
      }

      if (!str_detect(self$`campaign_id`, "^\\d+$")) {
        invalid_fields["campaign_id"] <- "Invalid value for `campaign_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        invalid_fields["event_id"] <- "Non-nullable required field `event_id` cannot be null."
      }

      if (nchar(self$`event_id`) > 256) {
        invalid_fields["event_id"] <- "Invalid length for `event_id`, must be smaller than or equal to 256."
      }

      # check if the required `event_name` is null
      if (is.null(self$`event_name`)) {
        invalid_fields["event_name"] <- "Non-nullable required field `event_name` cannot be null."
      }

      # check if the required `event_timestamp` is null
      if (is.null(self$`event_timestamp`)) {
        invalid_fields["event_timestamp"] <- "Non-nullable required field `event_timestamp` cannot be null."
      }

      if (self$`total_event_touchpoints` < 1) {
        invalid_fields["total_event_touchpoints"] <- "Invalid value for `total_event_touchpoints`, must be bigger than or equal to 1."
      }

      if (self$`total_events` < 1) {
        invalid_fields["total_events"] <- "Invalid value for `total_events`, must be bigger than or equal to 1."
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
# ConversionMSOTEvents$unlock()
#
## Below is an example to define the print function
# ConversionMSOTEvents$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionMSOTEvents$lock()

