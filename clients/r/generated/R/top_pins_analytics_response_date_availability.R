#' Create a new TopPinsAnalyticsResponseDateAvailability
#'
#' @description
#' TopPinsAnalyticsResponseDateAvailability Class
#'
#' @docType class
#' @title TopPinsAnalyticsResponseDateAvailability
#' @description TopPinsAnalyticsResponseDateAvailability Class
#' @format An \code{R6Class} generator object
#' @field latest_available_timestamp  numeric [optional]
#' @field is_realtime  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TopPinsAnalyticsResponseDateAvailability <- R6::R6Class(
  "TopPinsAnalyticsResponseDateAvailability",
  public = list(
    `latest_available_timestamp` = NULL,
    `is_realtime` = NULL,

    #' @description
    #' Initialize a new TopPinsAnalyticsResponseDateAvailability class.
    #'
    #' @param latest_available_timestamp latest_available_timestamp
    #' @param is_realtime is_realtime
    #' @param ... Other optional arguments.
    initialize = function(`latest_available_timestamp` = NULL, `is_realtime` = NULL, ...) {
      if (!is.null(`latest_available_timestamp`)) {
        self$`latest_available_timestamp` <- `latest_available_timestamp`
      }
      if (!is.null(`is_realtime`)) {
        if (!(is.logical(`is_realtime`) && length(`is_realtime`) == 1)) {
          stop(paste("Error! Invalid data for `is_realtime`. Must be a boolean:", `is_realtime`))
        }
        self$`is_realtime` <- `is_realtime`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TopPinsAnalyticsResponseDateAvailability in JSON format
    toJSON = function() {
      TopPinsAnalyticsResponseDateAvailabilityObject <- list()
      if (!is.null(self$`latest_available_timestamp`)) {
        TopPinsAnalyticsResponseDateAvailabilityObject[["latest_available_timestamp"]] <-
          self$`latest_available_timestamp`
      }
      if (!is.null(self$`is_realtime`)) {
        TopPinsAnalyticsResponseDateAvailabilityObject[["is_realtime"]] <-
          self$`is_realtime`
      }
      TopPinsAnalyticsResponseDateAvailabilityObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponseDateAvailability
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponseDateAvailability
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`latest_available_timestamp`)) {
        self$`latest_available_timestamp` <- this_object$`latest_available_timestamp`
      }
      if (!is.null(this_object$`is_realtime`)) {
        self$`is_realtime` <- this_object$`is_realtime`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TopPinsAnalyticsResponseDateAvailability in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`latest_available_timestamp`)) {
          sprintf(
          '"latest_available_timestamp":
            %d
                    ',
          self$`latest_available_timestamp`
          )
        },
        if (!is.null(self$`is_realtime`)) {
          sprintf(
          '"is_realtime":
            %s
                    ',
          tolower(self$`is_realtime`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponseDateAvailability
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponseDateAvailability
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`latest_available_timestamp` <- this_object$`latest_available_timestamp`
      self$`is_realtime` <- this_object$`is_realtime`
      self
    },

    #' @description
    #' Validate JSON input with respect to TopPinsAnalyticsResponseDateAvailability and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TopPinsAnalyticsResponseDateAvailability
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
# TopPinsAnalyticsResponseDateAvailability$unlock()
#
## Below is an example to define the print function
# TopPinsAnalyticsResponseDateAvailability$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TopPinsAnalyticsResponseDateAvailability$lock()

