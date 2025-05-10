#' Create a new IntegrationLogsInvalidLogResponse
#'
#' @description
#' Schema describing the response when a log has invalid fields.
#'
#' @docType class
#' @title IntegrationLogsInvalidLogResponse
#' @description IntegrationLogsInvalidLogResponse Class
#' @format An \code{R6Class} generator object
#' @field rejected_logs  list(\link{IntegrationLogsInvalidLogResponseRejectedLogsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLogsInvalidLogResponse <- R6::R6Class(
  "IntegrationLogsInvalidLogResponse",
  public = list(
    `rejected_logs` = NULL,

    #' @description
    #' Initialize a new IntegrationLogsInvalidLogResponse class.
    #'
    #' @param rejected_logs rejected_logs
    #' @param ... Other optional arguments.
    initialize = function(`rejected_logs` = NULL, ...) {
      if (!is.null(`rejected_logs`)) {
        stopifnot(is.vector(`rejected_logs`), length(`rejected_logs`) != 0)
        sapply(`rejected_logs`, function(x) stopifnot(R6::is.R6(x)))
        self$`rejected_logs` <- `rejected_logs`
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
    #' @return IntegrationLogsInvalidLogResponse as a base R list.
    #' @examples
    #' # convert array of IntegrationLogsInvalidLogResponse (x) to a data frame
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
    #' Convert IntegrationLogsInvalidLogResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      IntegrationLogsInvalidLogResponseObject <- list()
      if (!is.null(self$`rejected_logs`)) {
        IntegrationLogsInvalidLogResponseObject[["rejected_logs"]] <-
          lapply(self$`rejected_logs`, function(x) x$toSimpleType())
      }
      return(IntegrationLogsInvalidLogResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsInvalidLogResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rejected_logs`)) {
        self$`rejected_logs` <- ApiClient$new()$deserializeObj(this_object$`rejected_logs`, "array[IntegrationLogsInvalidLogResponseRejectedLogsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return IntegrationLogsInvalidLogResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsInvalidLogResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rejected_logs` <- ApiClient$new()$deserializeObj(this_object$`rejected_logs`, "array[IntegrationLogsInvalidLogResponseRejectedLogsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationLogsInvalidLogResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogsInvalidLogResponse
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
# IntegrationLogsInvalidLogResponse$unlock()
#
## Below is an example to define the print function
# IntegrationLogsInvalidLogResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogsInvalidLogResponse$lock()

