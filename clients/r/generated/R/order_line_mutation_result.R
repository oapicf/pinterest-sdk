#' Create a new OrderLineMutationResult
#'
#' @description
#' OrderLineMutationResult Class
#'
#' @docType class
#' @title OrderLineMutationResult
#' @description OrderLineMutationResult Class
#' @format An \code{R6Class} generator object
#' @field errors Error list if update(s) fail. list(\link{OrderLineMutationError}) [optional]
#' @field order_line Order Line object array. list(\link{OrderLine}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLineMutationResult <- R6::R6Class(
  "OrderLineMutationResult",
  public = list(
    `errors` = NULL,
    `order_line` = NULL,

    #' @description
    #' Initialize a new OrderLineMutationResult class.
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
    #' @return OrderLineMutationResult as a base R list.
    #' @examples
    #' # convert array of OrderLineMutationResult (x) to a data frame
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
    #' Convert OrderLineMutationResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OrderLineMutationResultObject <- list()
      if (!is.null(self$`errors`)) {
        OrderLineMutationResultObject[["errors"]] <-
          self$extractSimpleType(self$`errors`)
      }
      if (!is.null(self$`order_line`)) {
        OrderLineMutationResultObject[["order_line"]] <-
          self$extractSimpleType(self$`order_line`)
      }
      return(OrderLineMutationResultObject)
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
    #' Deserialize JSON string into an instance of OrderLineMutationResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineMutationResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[OrderLineMutationError]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`order_line`)) {
        self$`order_line` <- ApiClient$new()$deserializeObj(this_object$`order_line`, "array[OrderLine]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return OrderLineMutationResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLineMutationResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineMutationResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[OrderLineMutationError]", loadNamespace("openapi"))
      self$`order_line` <- ApiClient$new()$deserializeObj(this_object$`order_line`, "array[OrderLine]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to OrderLineMutationResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLineMutationResult
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
# OrderLineMutationResult$unlock()
#
## Below is an example to define the print function
# OrderLineMutationResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLineMutationResult$lock()

