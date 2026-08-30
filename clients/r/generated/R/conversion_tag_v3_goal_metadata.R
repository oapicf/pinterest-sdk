#' Create a new ConversionTagV3GoalMetadata
#'
#' @description
#' ConversionTagV3GoalMetadata Class
#'
#' @docType class
#' @title ConversionTagV3GoalMetadata
#' @description ConversionTagV3GoalMetadata Class
#' @format An \code{R6Class} generator object
#' @field attribution_windows  \link{AttributionWindows} [optional]
#' @field conversion_event  \link{ConversionEvent} [optional]
#' @field conversion_tag_id  character [optional]
#' @field cpa_goal_value_in_micro_currency  character [optional]
#' @field is_roas_optimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). character [optional]
#' @field reporting_event Event name for custom or standard events mapped to an oCPM model character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionTagV3GoalMetadata <- R6::R6Class(
  "ConversionTagV3GoalMetadata",
  public = list(
    `attribution_windows` = NULL,
    `conversion_event` = NULL,
    `conversion_tag_id` = NULL,
    `cpa_goal_value_in_micro_currency` = NULL,
    `is_roas_optimized` = NULL,
    `reporting_event` = NULL,

    #' @description
    #' Initialize a new ConversionTagV3GoalMetadata class.
    #'
    #' @param attribution_windows attribution_windows
    #' @param conversion_event conversion_event
    #' @param conversion_tag_id conversion_tag_id
    #' @param cpa_goal_value_in_micro_currency cpa_goal_value_in_micro_currency
    #' @param is_roas_optimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
    #' @param reporting_event Event name for custom or standard events mapped to an oCPM model
    #' @param ... Other optional arguments.
    initialize = function(`attribution_windows` = NULL, `conversion_event` = NULL, `conversion_tag_id` = NULL, `cpa_goal_value_in_micro_currency` = NULL, `is_roas_optimized` = NULL, `reporting_event` = NULL, ...) {
      if (!is.null(`attribution_windows`)) {
        stopifnot(R6::is.R6(`attribution_windows`))
        self$`attribution_windows` <- `attribution_windows`
      }
      if (!is.null(`conversion_event`)) {
        if (!(`conversion_event` %in% c())) {
          stop(paste("Error! \"", `conversion_event`, "\" cannot be assigned to `conversion_event`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_event`))
        self$`conversion_event` <- `conversion_event`
      }
      if (!is.null(`conversion_tag_id`)) {
        if (!(is.character(`conversion_tag_id`) && length(`conversion_tag_id`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_tag_id`. Must be a string:", `conversion_tag_id`))
        }
        self$`conversion_tag_id` <- `conversion_tag_id`
      }
      if (!is.null(`cpa_goal_value_in_micro_currency`)) {
        if (!(is.character(`cpa_goal_value_in_micro_currency`) && length(`cpa_goal_value_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `cpa_goal_value_in_micro_currency`. Must be a string:", `cpa_goal_value_in_micro_currency`))
        }
        self$`cpa_goal_value_in_micro_currency` <- `cpa_goal_value_in_micro_currency`
      }
      if (!is.null(`is_roas_optimized`)) {
        if (!(is.logical(`is_roas_optimized`) && length(`is_roas_optimized`) == 1)) {
          stop(paste("Error! Invalid data for `is_roas_optimized`. Must be a boolean:", `is_roas_optimized`))
        }
        self$`is_roas_optimized` <- `is_roas_optimized`
      }
      if (!is.null(`reporting_event`)) {
        if (!(is.character(`reporting_event`) && length(`reporting_event`) == 1)) {
          stop(paste("Error! Invalid data for `reporting_event`. Must be a string:", `reporting_event`))
        }
        self$`reporting_event` <- `reporting_event`
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
    #' @return ConversionTagV3GoalMetadata as a base R list.
    #' @examples
    #' # convert array of ConversionTagV3GoalMetadata (x) to a data frame
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
    #' Convert ConversionTagV3GoalMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionTagV3GoalMetadataObject <- list()
      if (!is.null(self$`attribution_windows`)) {
        ConversionTagV3GoalMetadataObject[["attribution_windows"]] <-
          self$extractSimpleType(self$`attribution_windows`)
      }
      if (!is.null(self$`conversion_event`)) {
        ConversionTagV3GoalMetadataObject[["conversion_event"]] <-
          self$extractSimpleType(self$`conversion_event`)
      }
      if (!is.null(self$`conversion_tag_id`)) {
        ConversionTagV3GoalMetadataObject[["conversion_tag_id"]] <-
          self$`conversion_tag_id`
      }
      if (!is.null(self$`cpa_goal_value_in_micro_currency`)) {
        ConversionTagV3GoalMetadataObject[["cpa_goal_value_in_micro_currency"]] <-
          self$`cpa_goal_value_in_micro_currency`
      }
      if (!is.null(self$`is_roas_optimized`)) {
        ConversionTagV3GoalMetadataObject[["is_roas_optimized"]] <-
          self$`is_roas_optimized`
      }
      if (!is.null(self$`reporting_event`)) {
        ConversionTagV3GoalMetadataObject[["reporting_event"]] <-
          self$`reporting_event`
      }
      return(ConversionTagV3GoalMetadataObject)
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
    #' Deserialize JSON string into an instance of ConversionTagV3GoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagV3GoalMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attribution_windows`)) {
        `attribution_windows_object` <- AttributionWindows$new()
        `attribution_windows_object`$fromJSON(jsonlite::toJSON(this_object$`attribution_windows`, auto_unbox = TRUE, digits = NA))
        self$`attribution_windows` <- `attribution_windows_object`
      }
      if (!is.null(this_object$`conversion_event`)) {
        `conversion_event_object` <- ConversionEvent$new()
        `conversion_event_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_event`, auto_unbox = TRUE, digits = NA))
        self$`conversion_event` <- `conversion_event_object`
      }
      if (!is.null(this_object$`conversion_tag_id`)) {
        self$`conversion_tag_id` <- this_object$`conversion_tag_id`
      }
      if (!is.null(this_object$`cpa_goal_value_in_micro_currency`)) {
        self$`cpa_goal_value_in_micro_currency` <- this_object$`cpa_goal_value_in_micro_currency`
      }
      if (!is.null(this_object$`is_roas_optimized`)) {
        self$`is_roas_optimized` <- this_object$`is_roas_optimized`
      }
      if (!is.null(this_object$`reporting_event`)) {
        self$`reporting_event` <- this_object$`reporting_event`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionTagV3GoalMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionTagV3GoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagV3GoalMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attribution_windows` <- AttributionWindows$new()$fromJSON(jsonlite::toJSON(this_object$`attribution_windows`, auto_unbox = TRUE, digits = NA))
      self$`conversion_event` <- ConversionEvent$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_event`, auto_unbox = TRUE, digits = NA))
      self$`conversion_tag_id` <- this_object$`conversion_tag_id`
      self$`cpa_goal_value_in_micro_currency` <- this_object$`cpa_goal_value_in_micro_currency`
      self$`is_roas_optimized` <- this_object$`is_roas_optimized`
      self$`reporting_event` <- this_object$`reporting_event`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionTagV3GoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionTagV3GoalMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`conversion_tag_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`cpa_goal_value_in_micro_currency`, "^\\d+$")) {
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
      if (!str_detect(self$`conversion_tag_id`, "^\\d+$")) {
        invalid_fields["conversion_tag_id"] <- "Invalid value for `conversion_tag_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`cpa_goal_value_in_micro_currency`, "^\\d+$")) {
        invalid_fields["cpa_goal_value_in_micro_currency"] <- "Invalid value for `cpa_goal_value_in_micro_currency`, must conform to the pattern ^\\d+$."
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
# ConversionTagV3GoalMetadata$unlock()
#
## Below is an example to define the print function
# ConversionTagV3GoalMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionTagV3GoalMetadata$lock()

