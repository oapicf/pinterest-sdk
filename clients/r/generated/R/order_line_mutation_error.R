#' Create a new OrderLineMutationError
#'
#' @description
#' OrderLineMutationError Class
#'
#' @docType class
#' @title OrderLineMutationError
#' @description OrderLineMutationError Class
#' @format An \code{R6Class} generator object
#' @field data  \link{OrderLine} [optional]
#' @field error_messages Error messages. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLineMutationError <- R6::R6Class(
  "OrderLineMutationError",
  public = list(
    `data` = NULL,
    `error_messages` = NULL,

    #' @description
    #' Initialize a new OrderLineMutationError class.
    #'
    #' @param data data
    #' @param error_messages Error messages.
    #' @param ... Other optional arguments.
    initialize = function(`data` = NULL, `error_messages` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`error_messages`)) {
        stopifnot(is.vector(`error_messages`), length(`error_messages`) != 0)
        sapply(`error_messages`, function(x) stopifnot(is.character(x)))
        self$`error_messages` <- `error_messages`
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
    #' @return OrderLineMutationError as a base R list.
    #' @examples
    #' # convert array of OrderLineMutationError (x) to a data frame
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
    #' Convert OrderLineMutationError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OrderLineMutationErrorObject <- list()
      if (!is.null(self$`data`)) {
        OrderLineMutationErrorObject[["data"]] <-
          self$extractSimpleType(self$`data`)
      }
      if (!is.null(self$`error_messages`)) {
        OrderLineMutationErrorObject[["error_messages"]] <-
          self$`error_messages`
      }
      return(OrderLineMutationErrorObject)
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
    #' Deserialize JSON string into an instance of OrderLineMutationError
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineMutationError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- OrderLine$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`error_messages`)) {
        self$`error_messages` <- ApiClient$new()$deserializeObj(this_object$`error_messages`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return OrderLineMutationError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLineMutationError
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineMutationError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- OrderLine$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`error_messages` <- ApiClient$new()$deserializeObj(this_object$`error_messages`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to OrderLineMutationError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLineMutationError
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
# OrderLineMutationError$unlock()
#
## Below is an example to define the print function
# OrderLineMutationError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLineMutationError$lock()

