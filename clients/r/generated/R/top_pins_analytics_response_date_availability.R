#' Create a new TopPinsAnalyticsResponseDateAvailability
#'
#' @description
#' TopPinsAnalyticsResponseDateAvailability Class
#'
#' @docType class
#' @title TopPinsAnalyticsResponseDateAvailability
#' @description TopPinsAnalyticsResponseDateAvailability Class
#' @format An \code{R6Class} generator object
#' @field is_realtime  character [optional]
#' @field latest_available_timestamp  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TopPinsAnalyticsResponseDateAvailability <- R6::R6Class(
  "TopPinsAnalyticsResponseDateAvailability",
  public = list(
    `is_realtime` = NULL,
    `latest_available_timestamp` = NULL,

    #' @description
    #' Initialize a new TopPinsAnalyticsResponseDateAvailability class.
    #'
    #' @param is_realtime is_realtime
    #' @param latest_available_timestamp latest_available_timestamp
    #' @param ... Other optional arguments.
    initialize = function(`is_realtime` = NULL, `latest_available_timestamp` = NULL, ...) {
      if (!is.null(`is_realtime`)) {
        if (!(is.logical(`is_realtime`) && length(`is_realtime`) == 1)) {
          stop(paste("Error! Invalid data for `is_realtime`. Must be a boolean:", `is_realtime`))
        }
        self$`is_realtime` <- `is_realtime`
      }
      if (!is.null(`latest_available_timestamp`)) {
        self$`latest_available_timestamp` <- `latest_available_timestamp`
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
    #' @return TopPinsAnalyticsResponseDateAvailability as a base R list.
    #' @examples
    #' # convert array of TopPinsAnalyticsResponseDateAvailability (x) to a data frame
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
    #' Convert TopPinsAnalyticsResponseDateAvailability to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TopPinsAnalyticsResponseDateAvailabilityObject <- list()
      if (!is.null(self$`is_realtime`)) {
        TopPinsAnalyticsResponseDateAvailabilityObject[["is_realtime"]] <-
          self$`is_realtime`
      }
      if (!is.null(self$`latest_available_timestamp`)) {
        TopPinsAnalyticsResponseDateAvailabilityObject[["latest_available_timestamp"]] <-
          self$`latest_available_timestamp`
      }
      return(TopPinsAnalyticsResponseDateAvailabilityObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponseDateAvailability
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponseDateAvailability
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`is_realtime`)) {
        self$`is_realtime` <- this_object$`is_realtime`
      }
      if (!is.null(this_object$`latest_available_timestamp`)) {
        self$`latest_available_timestamp` <- this_object$`latest_available_timestamp`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TopPinsAnalyticsResponseDateAvailability in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponseDateAvailability
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponseDateAvailability
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`is_realtime` <- this_object$`is_realtime`
      self$`latest_available_timestamp` <- this_object$`latest_available_timestamp`
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

