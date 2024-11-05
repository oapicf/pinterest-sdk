#' Create a new TrendingKeywordsResponseTrendsInnerTimeSeries
#'
#' @description
#' A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
#'
#' @docType class
#' @title TrendingKeywordsResponseTrendsInnerTimeSeries
#' @description TrendingKeywordsResponseTrendsInnerTimeSeries Class
#' @format An \code{R6Class} generator object
#' @field date  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeywordsResponseTrendsInnerTimeSeries <- R6::R6Class(
  "TrendingKeywordsResponseTrendsInnerTimeSeries",
  inherit = integer,
  public = list(
    `date` = NULL,
    `_field_list` = c("date"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new TrendingKeywordsResponseTrendsInnerTimeSeries class.
    #'
    #' @param date date
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`date` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`date`)) {
        if (!is.character(`date`)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TrendingKeywordsResponseTrendsInnerTimeSeries in JSON format
    toJSON = function() {
      TrendingKeywordsResponseTrendsInnerTimeSeriesObject <- list()
      if (!is.null(self$`date`)) {
        TrendingKeywordsResponseTrendsInnerTimeSeriesObject[["date"]] <-
          self$`date`
      }
      for (key in names(self$additional_properties)) {
        TrendingKeywordsResponseTrendsInnerTimeSeriesObject[[key]] <- self$additional_properties[[key]]
      }

      TrendingKeywordsResponseTrendsInnerTimeSeriesObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponseTrendsInnerTimeSeries
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponseTrendsInnerTimeSeries
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TrendingKeywordsResponseTrendsInnerTimeSeries in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`date`)) {
          sprintf(
          '"date":
            "%s"
                    ',
          self$`date`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
      json_obj <- jsonlite::fromJSON(json_string)
      for (key in names(self$additional_properties)) {
        json_obj[[key]] <- self$additional_properties[[key]]
      }
      json_string <- as.character(jsonlite::minify(jsonlite::toJSON(json_obj, auto_unbox = TRUE, digits = NA)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponseTrendsInnerTimeSeries
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponseTrendsInnerTimeSeries
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`date` <- this_object$`date`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingKeywordsResponseTrendsInnerTimeSeries and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingKeywordsResponseTrendsInnerTimeSeries
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
# TrendingKeywordsResponseTrendsInnerTimeSeries$unlock()
#
## Below is an example to define the print function
# TrendingKeywordsResponseTrendsInnerTimeSeries$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeywordsResponseTrendsInnerTimeSeries$lock()

