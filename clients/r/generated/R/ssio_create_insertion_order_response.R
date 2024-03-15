#' Create a new SSIOCreateInsertionOrderResponse
#'
#' @description
#' SSIOCreateInsertionOrderResponse Class
#'
#' @docType class
#' @title SSIOCreateInsertionOrderResponse
#' @description SSIOCreateInsertionOrderResponse Class
#' @format An \code{R6Class} generator object
#' @field pin_order_id Salesforce order id character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOCreateInsertionOrderResponse <- R6::R6Class(
  "SSIOCreateInsertionOrderResponse",
  public = list(
    `pin_order_id` = NULL,
    #' Initialize a new SSIOCreateInsertionOrderResponse class.
    #'
    #' @description
    #' Initialize a new SSIOCreateInsertionOrderResponse class.
    #'
    #' @param pin_order_id Salesforce order id
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`pin_order_id` = NULL, ...) {
      if (!is.null(`pin_order_id`)) {
        if (!(is.character(`pin_order_id`) && length(`pin_order_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_order_id`. Must be a string:", `pin_order_id`))
        }
        self$`pin_order_id` <- `pin_order_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOCreateInsertionOrderResponse in JSON format
    #' @export
    toJSON = function() {
      SSIOCreateInsertionOrderResponseObject <- list()
      if (!is.null(self$`pin_order_id`)) {
        SSIOCreateInsertionOrderResponseObject[["pin_order_id"]] <-
          self$`pin_order_id`
      }
      SSIOCreateInsertionOrderResponseObject
    },
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOCreateInsertionOrderResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pin_order_id`)) {
        self$`pin_order_id` <- this_object$`pin_order_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOCreateInsertionOrderResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`pin_order_id`)) {
          sprintf(
          '"pin_order_id":
            "%s"
                    ',
          self$`pin_order_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOCreateInsertionOrderResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pin_order_id` <- this_object$`pin_order_id`
      self
    },
    #' Validate JSON input with respect to SSIOCreateInsertionOrderResponse
    #'
    #' @description
    #' Validate JSON input with respect to SSIOCreateInsertionOrderResponse and throw an exception if invalid
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
    #' @return String representation of SSIOCreateInsertionOrderResponse
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
# SSIOCreateInsertionOrderResponse$unlock()
#
## Below is an example to define the print function
# SSIOCreateInsertionOrderResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOCreateInsertionOrderResponse$lock()

