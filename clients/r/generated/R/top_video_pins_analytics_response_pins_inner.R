#' Create a new TopVideoPinsAnalyticsResponsePinsInner
#'
#' @description
#' Array with metrics, status, and pin id for the requested metric
#'
#' @docType class
#' @title TopVideoPinsAnalyticsResponsePinsInner
#' @description TopVideoPinsAnalyticsResponsePinsInner Class
#' @format An \code{R6Class} generator object
#' @field metrics The metric name and daily value for each requested metric named list(numeric) [optional]
#' @field data_status  named list(\link{DataStatus}) [optional]
#' @field pin_id The pin id character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TopVideoPinsAnalyticsResponsePinsInner <- R6::R6Class(
  "TopVideoPinsAnalyticsResponsePinsInner",
  public = list(
    `metrics` = NULL,
    `data_status` = NULL,
    `pin_id` = NULL,

    #' @description
    #' Initialize a new TopVideoPinsAnalyticsResponsePinsInner class.
    #'
    #' @param metrics The metric name and daily value for each requested metric
    #' @param data_status data_status
    #' @param pin_id The pin id
    #' @param ... Other optional arguments.
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

    #' @description
    #' To JSON String
    #'
    #' @return TopVideoPinsAnalyticsResponsePinsInner in JSON format
    toJSON = function() {
      TopVideoPinsAnalyticsResponsePinsInnerObject <- list()
      if (!is.null(self$`metrics`)) {
        TopVideoPinsAnalyticsResponsePinsInnerObject[["metrics"]] <-
          self$`metrics`
      }
      if (!is.null(self$`data_status`)) {
        TopVideoPinsAnalyticsResponsePinsInnerObject[["data_status"]] <-
          lapply(self$`data_status`, function(x) x$toJSON())
      }
      if (!is.null(self$`pin_id`)) {
        TopVideoPinsAnalyticsResponsePinsInnerObject[["pin_id"]] <-
          self$`pin_id`
      }
      TopVideoPinsAnalyticsResponsePinsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TopVideoPinsAnalyticsResponsePinsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopVideoPinsAnalyticsResponsePinsInner
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

    #' @description
    #' To JSON String
    #'
    #' @return TopVideoPinsAnalyticsResponsePinsInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`metrics`)) {
          sprintf(
          '"metrics":
            %s
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

    #' @description
    #' Deserialize JSON string into an instance of TopVideoPinsAnalyticsResponsePinsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopVideoPinsAnalyticsResponsePinsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`metrics` <- ApiClient$new()$deserializeObj(this_object$`metrics`, "map(numeric)", loadNamespace("openapi"))
      self$`data_status` <- ApiClient$new()$deserializeObj(this_object$`data_status`, "map(DataStatus)", loadNamespace("openapi"))
      self$`pin_id` <- this_object$`pin_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to TopVideoPinsAnalyticsResponsePinsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TopVideoPinsAnalyticsResponsePinsInner
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
# TopVideoPinsAnalyticsResponsePinsInner$unlock()
#
## Below is an example to define the print function
# TopVideoPinsAnalyticsResponsePinsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TopVideoPinsAnalyticsResponsePinsInner$lock()

