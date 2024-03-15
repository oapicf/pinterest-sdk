#' Create a new AnalyticsMetricsResponse
#'
#' @description
#' AnalyticsMetricsResponse Class
#'
#' @docType class
#' @title AnalyticsMetricsResponse
#' @description AnalyticsMetricsResponse Class
#' @format An \code{R6Class} generator object
#' @field summary_metrics The metric name and value over the requested period for each requested metric named list(numeric) [optional]
#' @field daily_metrics Array with the requested daily metric records list(\link{AnalyticsDailyMetrics}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AnalyticsMetricsResponse <- R6::R6Class(
  "AnalyticsMetricsResponse",
  public = list(
    `summary_metrics` = NULL,
    `daily_metrics` = NULL,
    #' Initialize a new AnalyticsMetricsResponse class.
    #'
    #' @description
    #' Initialize a new AnalyticsMetricsResponse class.
    #'
    #' @param summary_metrics The metric name and value over the requested period for each requested metric
    #' @param daily_metrics Array with the requested daily metric records
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`summary_metrics` = NULL, `daily_metrics` = NULL, ...) {
      if (!is.null(`summary_metrics`)) {
        stopifnot(is.vector(`summary_metrics`), length(`summary_metrics`) != 0)
        sapply(`summary_metrics`, function(x) stopifnot(is.character(x)))
        self$`summary_metrics` <- `summary_metrics`
      }
      if (!is.null(`daily_metrics`)) {
        stopifnot(is.vector(`daily_metrics`), length(`daily_metrics`) != 0)
        sapply(`daily_metrics`, function(x) stopifnot(R6::is.R6(x)))
        self$`daily_metrics` <- `daily_metrics`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AnalyticsMetricsResponse in JSON format
    #' @export
    toJSON = function() {
      AnalyticsMetricsResponseObject <- list()
      if (!is.null(self$`summary_metrics`)) {
        AnalyticsMetricsResponseObject[["summary_metrics"]] <-
          self$`summary_metrics`
      }
      if (!is.null(self$`daily_metrics`)) {
        AnalyticsMetricsResponseObject[["daily_metrics"]] <-
          lapply(self$`daily_metrics`, function(x) x$toJSON())
      }
      AnalyticsMetricsResponseObject
    },
    #' Deserialize JSON string into an instance of AnalyticsMetricsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AnalyticsMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AnalyticsMetricsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`summary_metrics`)) {
        self$`summary_metrics` <- ApiClient$new()$deserializeObj(this_object$`summary_metrics`, "map(numeric)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`daily_metrics`)) {
        self$`daily_metrics` <- ApiClient$new()$deserializeObj(this_object$`daily_metrics`, "array[AnalyticsDailyMetrics]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AnalyticsMetricsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`summary_metrics`)) {
          sprintf(
          '"summary_metrics":
            "%s"
          ',
          jsonlite::toJSON(lapply(self$`summary_metrics`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`daily_metrics`)) {
          sprintf(
          '"daily_metrics":
          [%s]
',
          paste(sapply(self$`daily_metrics`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AnalyticsMetricsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AnalyticsMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AnalyticsMetricsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`summary_metrics` <- ApiClient$new()$deserializeObj(this_object$`summary_metrics`, "map(numeric)", loadNamespace("openapi"))
      self$`daily_metrics` <- ApiClient$new()$deserializeObj(this_object$`daily_metrics`, "array[AnalyticsDailyMetrics]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to AnalyticsMetricsResponse
    #'
    #' @description
    #' Validate JSON input with respect to AnalyticsMetricsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AnalyticsMetricsResponse
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AnalyticsMetricsResponse$unlock()
#
## Below is an example to define the print function
# AnalyticsMetricsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AnalyticsMetricsResponse$lock()

