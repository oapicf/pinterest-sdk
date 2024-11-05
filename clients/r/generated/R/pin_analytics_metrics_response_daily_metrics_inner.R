#' Create a new PinAnalyticsMetricsResponseDailyMetricsInner
#'
#' @description
#' PinAnalyticsMetricsResponseDailyMetricsInner Class
#'
#' @docType class
#' @title PinAnalyticsMetricsResponseDailyMetricsInner
#' @description PinAnalyticsMetricsResponseDailyMetricsInner Class
#' @format An \code{R6Class} generator object
#' @field data_status  \link{DataStatus} [optional]
#' @field date Metrics date (UTC): YYYY-MM-DD. character [optional]
#' @field metrics The metric name and daily value for each requested metric named list(numeric) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinAnalyticsMetricsResponseDailyMetricsInner <- R6::R6Class(
  "PinAnalyticsMetricsResponseDailyMetricsInner",
  public = list(
    `data_status` = NULL,
    `date` = NULL,
    `metrics` = NULL,

    #' @description
    #' Initialize a new PinAnalyticsMetricsResponseDailyMetricsInner class.
    #'
    #' @param data_status data_status
    #' @param date Metrics date (UTC): YYYY-MM-DD.
    #' @param metrics The metric name and daily value for each requested metric
    #' @param ... Other optional arguments.
    initialize = function(`data_status` = NULL, `date` = NULL, `metrics` = NULL, ...) {
      if (!is.null(`data_status`)) {
        if (!(`data_status` %in% c())) {
          stop(paste("Error! \"", `data_status`, "\" cannot be assigned to `data_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`data_status`))
        self$`data_status` <- `data_status`
      }
      if (!is.null(`date`)) {
        if (!(is.character(`date`) && length(`date`) == 1)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
      if (!is.null(`metrics`)) {
        stopifnot(is.vector(`metrics`), length(`metrics`) != 0)
        sapply(`metrics`, function(x) stopifnot(is.character(x)))
        self$`metrics` <- `metrics`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinAnalyticsMetricsResponseDailyMetricsInner in JSON format
    toJSON = function() {
      PinAnalyticsMetricsResponseDailyMetricsInnerObject <- list()
      if (!is.null(self$`data_status`)) {
        PinAnalyticsMetricsResponseDailyMetricsInnerObject[["data_status"]] <-
          self$`data_status`$toJSON()
      }
      if (!is.null(self$`date`)) {
        PinAnalyticsMetricsResponseDailyMetricsInnerObject[["date"]] <-
          self$`date`
      }
      if (!is.null(self$`metrics`)) {
        PinAnalyticsMetricsResponseDailyMetricsInnerObject[["metrics"]] <-
          self$`metrics`
      }
      PinAnalyticsMetricsResponseDailyMetricsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponseDailyMetricsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinAnalyticsMetricsResponseDailyMetricsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data_status`)) {
        `data_status_object` <- DataStatus$new()
        `data_status_object`$fromJSON(jsonlite::toJSON(this_object$`data_status`, auto_unbox = TRUE, digits = NA))
        self$`data_status` <- `data_status_object`
      }
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      if (!is.null(this_object$`metrics`)) {
        self$`metrics` <- ApiClient$new()$deserializeObj(this_object$`metrics`, "map(numeric)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinAnalyticsMetricsResponseDailyMetricsInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data_status`)) {
          sprintf(
          '"data_status":
          %s
          ',
          jsonlite::toJSON(self$`data_status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`date`)) {
          sprintf(
          '"date":
            "%s"
                    ',
          self$`date`
          )
        },
        if (!is.null(self$`metrics`)) {
          sprintf(
          '"metrics":
            %s
          ',
          jsonlite::toJSON(lapply(self$`metrics`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinAnalyticsMetricsResponseDailyMetricsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinAnalyticsMetricsResponseDailyMetricsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data_status` <- DataStatus$new()$fromJSON(jsonlite::toJSON(this_object$`data_status`, auto_unbox = TRUE, digits = NA))
      self$`date` <- this_object$`date`
      self$`metrics` <- ApiClient$new()$deserializeObj(this_object$`metrics`, "map(numeric)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PinAnalyticsMetricsResponseDailyMetricsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinAnalyticsMetricsResponseDailyMetricsInner
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
# PinAnalyticsMetricsResponseDailyMetricsInner$unlock()
#
## Below is an example to define the print function
# PinAnalyticsMetricsResponseDailyMetricsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinAnalyticsMetricsResponseDailyMetricsInner$lock()

