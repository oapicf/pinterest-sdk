#' Create a new PinAnalyticsMetricsResponse
#'
#' @description
#' PinAnalyticsMetricsResponse Class
#'
#' @docType class
#' @title PinAnalyticsMetricsResponse
#' @description PinAnalyticsMetricsResponse Class
#' @format An \code{R6Class} generator object
#' @field lifetime_metrics The lifetime metric name and value. named list(integer) [optional]
#' @field daily_metrics Array with the requested daily metric records list(\link{PinAnalyticsMetricsResponseDailyMetricsInner}) [optional]
#' @field summary_metrics The metric name and value over the requested period for each requested metric named list(numeric) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinAnalyticsMetricsResponse <- R6::R6Class(
  "PinAnalyticsMetricsResponse",
  public = list(
    `lifetime_metrics` = NULL,
    `daily_metrics` = NULL,
    `summary_metrics` = NULL,
    #' Initialize a new PinAnalyticsMetricsResponse class.
    #'
    #' @description
    #' Initialize a new PinAnalyticsMetricsResponse class.
    #'
    #' @param lifetime_metrics The lifetime metric name and value.
    #' @param daily_metrics Array with the requested daily metric records
    #' @param summary_metrics The metric name and value over the requested period for each requested metric
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`lifetime_metrics` = NULL, `daily_metrics` = NULL, `summary_metrics` = NULL, ...) {
      if (!is.null(`lifetime_metrics`)) {
        stopifnot(is.vector(`lifetime_metrics`), length(`lifetime_metrics`) != 0)
        sapply(`lifetime_metrics`, function(x) stopifnot(is.character(x)))
        self$`lifetime_metrics` <- `lifetime_metrics`
      }
      if (!is.null(`daily_metrics`)) {
        stopifnot(is.vector(`daily_metrics`), length(`daily_metrics`) != 0)
        sapply(`daily_metrics`, function(x) stopifnot(R6::is.R6(x)))
        self$`daily_metrics` <- `daily_metrics`
      }
      if (!is.null(`summary_metrics`)) {
        stopifnot(is.vector(`summary_metrics`), length(`summary_metrics`) != 0)
        sapply(`summary_metrics`, function(x) stopifnot(is.character(x)))
        self$`summary_metrics` <- `summary_metrics`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinAnalyticsMetricsResponse in JSON format
    #' @export
    toJSON = function() {
      PinAnalyticsMetricsResponseObject <- list()
      if (!is.null(self$`lifetime_metrics`)) {
        PinAnalyticsMetricsResponseObject[["lifetime_metrics"]] <-
          self$`lifetime_metrics`
      }
      if (!is.null(self$`daily_metrics`)) {
        PinAnalyticsMetricsResponseObject[["daily_metrics"]] <-
          lapply(self$`daily_metrics`, function(x) x$toJSON())
      }
      if (!is.null(self$`summary_metrics`)) {
        PinAnalyticsMetricsResponseObject[["summary_metrics"]] <-
          self$`summary_metrics`
      }
      PinAnalyticsMetricsResponseObject
    },
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinAnalyticsMetricsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`lifetime_metrics`)) {
        self$`lifetime_metrics` <- ApiClient$new()$deserializeObj(this_object$`lifetime_metrics`, "map(integer)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`daily_metrics`)) {
        self$`daily_metrics` <- ApiClient$new()$deserializeObj(this_object$`daily_metrics`, "array[PinAnalyticsMetricsResponseDailyMetricsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`summary_metrics`)) {
        self$`summary_metrics` <- ApiClient$new()$deserializeObj(this_object$`summary_metrics`, "map(numeric)", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinAnalyticsMetricsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`lifetime_metrics`)) {
          sprintf(
          '"lifetime_metrics":
            "%s"
          ',
          jsonlite::toJSON(lapply(self$`lifetime_metrics`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`daily_metrics`)) {
          sprintf(
          '"daily_metrics":
          [%s]
',
          paste(sapply(self$`daily_metrics`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`summary_metrics`)) {
          sprintf(
          '"summary_metrics":
            "%s"
          ',
          jsonlite::toJSON(lapply(self$`summary_metrics`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinAnalyticsMetricsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`lifetime_metrics` <- ApiClient$new()$deserializeObj(this_object$`lifetime_metrics`, "map(integer)", loadNamespace("openapi"))
      self$`daily_metrics` <- ApiClient$new()$deserializeObj(this_object$`daily_metrics`, "array[PinAnalyticsMetricsResponseDailyMetricsInner]", loadNamespace("openapi"))
      self$`summary_metrics` <- ApiClient$new()$deserializeObj(this_object$`summary_metrics`, "map(numeric)", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to PinAnalyticsMetricsResponse
    #'
    #' @description
    #' Validate JSON input with respect to PinAnalyticsMetricsResponse and throw an exception if invalid
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
    #' @return String representation of PinAnalyticsMetricsResponse
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
# PinAnalyticsMetricsResponse$unlock()
#
## Below is an example to define the print function
# PinAnalyticsMetricsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinAnalyticsMetricsResponse$lock()

