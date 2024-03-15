#' Create a new TopPinsAnalyticsResponsePinsInner
#'
#' @description
#' Array with metrics, status, and pin id for the requested metric
#'
#' @docType class
#' @title TopPinsAnalyticsResponsePinsInner
#' @description TopPinsAnalyticsResponsePinsInner Class
#' @format An \code{R6Class} generator object
#' @field metrics The metric name and daily value for each requested metric named list(numeric) [optional]
#' @field data_status  named list(\link{DataStatus}) [optional]
#' @field pin_id The pin id character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TopPinsAnalyticsResponsePinsInner <- R6::R6Class(
  "TopPinsAnalyticsResponsePinsInner",
  public = list(
    `metrics` = NULL,
    `data_status` = NULL,
    `pin_id` = NULL,
    #' Initialize a new TopPinsAnalyticsResponsePinsInner class.
    #'
    #' @description
    #' Initialize a new TopPinsAnalyticsResponsePinsInner class.
    #'
    #' @param metrics The metric name and daily value for each requested metric
    #' @param data_status data_status
    #' @param pin_id The pin id
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`metrics` = NULL, `data_status` = NULL, `pin_id` = NULL, ...) {
      if (!is.null(`metrics`)) {
        stopifnot(is.vector(`metrics`), length(`metrics`) != 0)
        sapply(`metrics`, function(x) stopifnot(is.character(x)))
        self$`metrics` <- `metrics`
      }
      if (!is.null(`data_status`)) {
        stopifnot(is.vector(`data_status`), length(`data_status`) != 0)
        sapply(`data_status`, function(x) stopifnot(R6::is.R6(x)))
        self$`data_status` <- `data_status`
      }
      if (!is.null(`pin_id`)) {
        if (!(is.character(`pin_id`) && length(`pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_id`. Must be a string:", `pin_id`))
        }
        self$`pin_id` <- `pin_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TopPinsAnalyticsResponsePinsInner in JSON format
    #' @export
    toJSON = function() {
      TopPinsAnalyticsResponsePinsInnerObject <- list()
      if (!is.null(self$`metrics`)) {
        TopPinsAnalyticsResponsePinsInnerObject[["metrics"]] <-
          self$`metrics`
      }
      if (!is.null(self$`data_status`)) {
        TopPinsAnalyticsResponsePinsInnerObject[["data_status"]] <-
          lapply(self$`data_status`, function(x) x$toJSON())
      }
      if (!is.null(self$`pin_id`)) {
        TopPinsAnalyticsResponsePinsInnerObject[["pin_id"]] <-
          self$`pin_id`
      }
      TopPinsAnalyticsResponsePinsInnerObject
    },
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponsePinsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponsePinsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponsePinsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`metrics`)) {
        self$`metrics` <- ApiClient$new()$deserializeObj(this_object$`metrics`, "map(numeric)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`data_status`)) {
        self$`data_status` <- ApiClient$new()$deserializeObj(this_object$`data_status`, "map(DataStatus)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- this_object$`pin_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TopPinsAnalyticsResponsePinsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`metrics`)) {
          sprintf(
          '"metrics":
            "%s"
          ',
          jsonlite::toJSON(lapply(self$`metrics`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`data_status`)) {
          sprintf(
          '"data_status":
          %s
',
          jsonlite::toJSON(lapply(self$`data_status`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`pin_id`)) {
          sprintf(
          '"pin_id":
            "%s"
                    ',
          self$`pin_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponsePinsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponsePinsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponsePinsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`metrics` <- ApiClient$new()$deserializeObj(this_object$`metrics`, "map(numeric)", loadNamespace("openapi"))
      self$`data_status` <- ApiClient$new()$deserializeObj(this_object$`data_status`, "map(DataStatus)", loadNamespace("openapi"))
      self$`pin_id` <- this_object$`pin_id`
      self
    },
    #' Validate JSON input with respect to TopPinsAnalyticsResponsePinsInner
    #'
    #' @description
    #' Validate JSON input with respect to TopPinsAnalyticsResponsePinsInner and throw an exception if invalid
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
    #' @return String representation of TopPinsAnalyticsResponsePinsInner
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
# TopPinsAnalyticsResponsePinsInner$unlock()
#
## Below is an example to define the print function
# TopPinsAnalyticsResponsePinsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TopPinsAnalyticsResponsePinsInner$lock()

