#' Create a new OrderLineSingleResponse
#'
#' @description
#' OrderLineSingleResponse Class
#'
#' @docType class
#' @title OrderLineSingleResponse
#' @description OrderLineSingleResponse Class
#' @format An \code{R6Class} generator object
#' @field data  \link{OrderLineResponse} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLineSingleResponse <- R6::R6Class(
  "OrderLineSingleResponse",
  public = list(
    `data` = NULL,

    #' @description
    #' Initialize a new OrderLineSingleResponse class.
    #'
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`data` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return OrderLineSingleResponse in JSON format
    toJSON = function() {
      OrderLineSingleResponseObject <- list()
      if (!is.null(self$`data`)) {
        OrderLineSingleResponseObject[["data"]] <-
          self$`data`$toJSON()
      }
      OrderLineSingleResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLineSingleResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineSingleResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- OrderLineResponse$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return OrderLineSingleResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLineSingleResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineSingleResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- OrderLineResponse$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to OrderLineSingleResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLineSingleResponse
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
# OrderLineSingleResponse$unlock()
#
## Below is an example to define the print function
# OrderLineSingleResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLineSingleResponse$lock()

