#' Create a new AnalyticsDailyMetrics
#'
#' @description
#' AnalyticsDailyMetrics Class
#'
#' @docType class
#' @title AnalyticsDailyMetrics
#' @description AnalyticsDailyMetrics Class
#' @format An \code{R6Class} generator object
#' @field data_status  \link{DataStatus} [optional]
#' @field date Metrics date (UTC): YYYY-MM-DD. character [optional]
#' @field metrics  named list(numeric) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AnalyticsDailyMetrics <- R6::R6Class(
  "AnalyticsDailyMetrics",
  public = list(
    `data_status` = NULL,
    `date` = NULL,
    `metrics` = NULL,

    #' @description
    #' Initialize a new AnalyticsDailyMetrics class.
    #'
    #' @param data_status data_status
    #' @param date Metrics date (UTC): YYYY-MM-DD.
    #' @param metrics metrics
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
    #' @return AnalyticsDailyMetrics as a base R list.
    #' @examples
    #' # convert array of AnalyticsDailyMetrics (x) to a data frame
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
    #' Convert AnalyticsDailyMetrics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AnalyticsDailyMetricsObject <- list()
      if (!is.null(self$`data_status`)) {
        AnalyticsDailyMetricsObject[["data_status"]] <-
          self$extractSimpleType(self$`data_status`)
      }
      if (!is.null(self$`date`)) {
        AnalyticsDailyMetricsObject[["date"]] <-
          self$`date`
      }
      if (!is.null(self$`metrics`)) {
        AnalyticsDailyMetricsObject[["metrics"]] <-
          self$`metrics`
      }
      return(AnalyticsDailyMetricsObject)
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
    #' Deserialize JSON string into an instance of AnalyticsDailyMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AnalyticsDailyMetrics
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
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AnalyticsDailyMetrics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AnalyticsDailyMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AnalyticsDailyMetrics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data_status` <- DataStatus$new()$fromJSON(jsonlite::toJSON(this_object$`data_status`, auto_unbox = TRUE, digits = NA))
      self$`date` <- this_object$`date`
      self$`metrics` <- ApiClient$new()$deserializeObj(this_object$`metrics`, "map(numeric)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AnalyticsDailyMetrics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AnalyticsDailyMetrics
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
# AnalyticsDailyMetrics$unlock()
#
## Below is an example to define the print function
# AnalyticsDailyMetrics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AnalyticsDailyMetrics$lock()

