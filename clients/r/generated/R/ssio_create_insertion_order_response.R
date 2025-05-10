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

    #' @description
    #' Initialize a new SSIOCreateInsertionOrderResponse class.
    #'
    #' @param pin_order_id Salesforce order id
    #' @param ... Other optional arguments.
    initialize = function(`pin_order_id` = NULL, ...) {
      if (!is.null(`pin_order_id`)) {
        if (!(is.character(`pin_order_id`) && length(`pin_order_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_order_id`. Must be a string:", `pin_order_id`))
        }
        self$`pin_order_id` <- `pin_order_id`
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
    #' @return SSIOCreateInsertionOrderResponse as a base R list.
    #' @examples
    #' # convert array of SSIOCreateInsertionOrderResponse (x) to a data frame
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
    #' Convert SSIOCreateInsertionOrderResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SSIOCreateInsertionOrderResponseObject <- list()
      if (!is.null(self$`pin_order_id`)) {
        SSIOCreateInsertionOrderResponseObject[["pin_order_id"]] <-
          self$`pin_order_id`
      }
      return(SSIOCreateInsertionOrderResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOCreateInsertionOrderResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pin_order_id`)) {
        self$`pin_order_id` <- this_object$`pin_order_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SSIOCreateInsertionOrderResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOCreateInsertionOrderResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pin_order_id` <- this_object$`pin_order_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOCreateInsertionOrderResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOCreateInsertionOrderResponse
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
# SSIOCreateInsertionOrderResponse$unlock()
#
## Below is an example to define the print function
# SSIOCreateInsertionOrderResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOCreateInsertionOrderResponse$lock()

