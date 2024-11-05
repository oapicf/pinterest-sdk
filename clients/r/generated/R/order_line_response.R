#' Create a new OrderLineResponse
#'
#' @description
#' OrderLineResponse Class
#'
#' @docType class
#' @title OrderLineResponse
#' @description OrderLineResponse Class
#' @format An \code{R6Class} generator object
#' @field errors Error list if update(s) fail. list(\link{OrderLineError}) [optional]
#' @field order_line Order Line object array. list(\link{OrderLine}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLineResponse <- R6::R6Class(
  "OrderLineResponse",
  public = list(
    `errors` = NULL,
    `order_line` = NULL,

    #' @description
    #' Initialize a new OrderLineResponse class.
    #'
    #' @param errors Error list if update(s) fail.
    #' @param order_line Order Line object array.
    #' @param ... Other optional arguments.
    initialize = function(`errors` = NULL, `order_line` = NULL, ...) {
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`order_line`)) {
        stopifnot(is.vector(`order_line`), length(`order_line`) != 0)
        sapply(`order_line`, function(x) stopifnot(R6::is.R6(x)))
        self$`order_line` <- `order_line`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return OrderLineResponse in JSON format
    toJSON = function() {
      OrderLineResponseObject <- list()
      if (!is.null(self$`errors`)) {
        OrderLineResponseObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      if (!is.null(self$`order_line`)) {
        OrderLineResponseObject[["order_line"]] <-
          lapply(self$`order_line`, function(x) x$toJSON())
      }
      OrderLineResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLineResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[OrderLineError]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`order_line`)) {
        self$`order_line` <- ApiClient$new()$deserializeObj(this_object$`order_line`, "array[OrderLine]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return OrderLineResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          [%s]
',
          paste(sapply(self$`errors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`order_line`)) {
          sprintf(
          '"order_line":
          [%s]
',
          paste(sapply(self$`order_line`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLineResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[OrderLineError]", loadNamespace("openapi"))
      self$`order_line` <- ApiClient$new()$deserializeObj(this_object$`order_line`, "array[OrderLine]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to OrderLineResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLineResponse
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
# OrderLineResponse$unlock()
#
## Below is an example to define the print function
# OrderLineResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLineResponse$lock()

