#' Create a new DeliveryMetricsResponse
#'
#' @description
#' DeliveryMetricsResponse Class
#'
#' @docType class
#' @title DeliveryMetricsResponse
#' @description DeliveryMetricsResponse Class
#' @format An \code{R6Class} generator object
#' @field items  list(\link{DeliveryMetricsResponseItemsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeliveryMetricsResponse <- R6::R6Class(
  "DeliveryMetricsResponse",
  public = list(
    `items` = NULL,

    #' @description
    #' Initialize a new DeliveryMetricsResponse class.
    #'
    #' @param items items
    #' @param ... Other optional arguments.
    initialize = function(`items` = NULL, ...) {
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeliveryMetricsResponse in JSON format
    toJSON = function() {
      DeliveryMetricsResponseObject <- list()
      if (!is.null(self$`items`)) {
        DeliveryMetricsResponseObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      DeliveryMetricsResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeliveryMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeliveryMetricsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[DeliveryMetricsResponseItemsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeliveryMetricsResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeliveryMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeliveryMetricsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[DeliveryMetricsResponseItemsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeliveryMetricsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeliveryMetricsResponse
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
# DeliveryMetricsResponse$unlock()
#
## Below is an example to define the print function
# DeliveryMetricsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeliveryMetricsResponse$lock()

