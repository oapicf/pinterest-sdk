#' Create a new PinAnalyticsMetricsResponse
#'
#' @description
#' PinAnalyticsMetricsResponse Class
#'
#' @docType class
#' @title PinAnalyticsMetricsResponse
#' @description PinAnalyticsMetricsResponse Class
#' @format An \code{R6Class} generator object
#' @field daily_metrics Array with the requested daily metric records list(\link{PinAnalyticsDailyMetrics}) [optional]
#' @field lifetime_metrics The lifetime metric name and value. named list(integer) [optional]
#' @field summary_metrics The metric name and value over the requested period for each requested metric named list(numeric) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinAnalyticsMetricsResponse <- R6::R6Class(
  "PinAnalyticsMetricsResponse",
  public = list(
    `daily_metrics` = NULL,
    `lifetime_metrics` = NULL,
    `summary_metrics` = NULL,

    #' @description
    #' Initialize a new PinAnalyticsMetricsResponse class.
    #'
    #' @param daily_metrics Array with the requested daily metric records
    #' @param lifetime_metrics The lifetime metric name and value.
    #' @param summary_metrics The metric name and value over the requested period for each requested metric
    #' @param ... Other optional arguments.
    initialize = function(`daily_metrics` = NULL, `lifetime_metrics` = NULL, `summary_metrics` = NULL, ...) {
      if (!is.null(`daily_metrics`)) {
        stopifnot(is.vector(`daily_metrics`), length(`daily_metrics`) != 0)
        sapply(`daily_metrics`, function(x) stopifnot(R6::is.R6(x)))
        self$`daily_metrics` <- `daily_metrics`
      }
      if (!is.null(`lifetime_metrics`)) {
        stopifnot(is.vector(`lifetime_metrics`), length(`lifetime_metrics`) != 0)
        sapply(`lifetime_metrics`, function(x) stopifnot(is.character(x)))
        self$`lifetime_metrics` <- `lifetime_metrics`
      }
      if (!is.null(`summary_metrics`)) {
        stopifnot(is.vector(`summary_metrics`), length(`summary_metrics`) != 0)
        sapply(`summary_metrics`, function(x) stopifnot(is.character(x)))
        self$`summary_metrics` <- `summary_metrics`
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
    #' @return PinAnalyticsMetricsResponse as a base R list.
    #' @examples
    #' # convert array of PinAnalyticsMetricsResponse (x) to a data frame
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
    #' Convert PinAnalyticsMetricsResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinAnalyticsMetricsResponseObject <- list()
      if (!is.null(self$`daily_metrics`)) {
        PinAnalyticsMetricsResponseObject[["daily_metrics"]] <-
          self$extractSimpleType(self$`daily_metrics`)
      }
      if (!is.null(self$`lifetime_metrics`)) {
        PinAnalyticsMetricsResponseObject[["lifetime_metrics"]] <-
          self$`lifetime_metrics`
      }
      if (!is.null(self$`summary_metrics`)) {
        PinAnalyticsMetricsResponseObject[["summary_metrics"]] <-
          self$`summary_metrics`
      }
      return(PinAnalyticsMetricsResponseObject)
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
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinAnalyticsMetricsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`daily_metrics`)) {
        self$`daily_metrics` <- ApiClient$new()$deserializeObj(this_object$`daily_metrics`, "array[PinAnalyticsDailyMetrics]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`lifetime_metrics`)) {
        self$`lifetime_metrics` <- ApiClient$new()$deserializeObj(this_object$`lifetime_metrics`, "map(integer)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`summary_metrics`)) {
        self$`summary_metrics` <- ApiClient$new()$deserializeObj(this_object$`summary_metrics`, "map(numeric)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinAnalyticsMetricsResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinAnalyticsMetricsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`daily_metrics` <- ApiClient$new()$deserializeObj(this_object$`daily_metrics`, "array[PinAnalyticsDailyMetrics]", loadNamespace("openapi"))
      self$`lifetime_metrics` <- ApiClient$new()$deserializeObj(this_object$`lifetime_metrics`, "map(integer)", loadNamespace("openapi"))
      self$`summary_metrics` <- ApiClient$new()$deserializeObj(this_object$`summary_metrics`, "map(numeric)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PinAnalyticsMetricsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinAnalyticsMetricsResponse
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
# PinAnalyticsMetricsResponse$unlock()
#
## Below is an example to define the print function
# PinAnalyticsMetricsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinAnalyticsMetricsResponse$lock()

