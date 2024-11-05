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
    #' To JSON String
    #'
    #' @return IntegrationLogsInvalidLogResponse in JSON format
    toJSON = function() {
      IntegrationLogsInvalidLogResponseObject <- list()
      if (!is.null(self$`rejected_logs`)) {
        IntegrationLogsInvalidLogResponseObject[["rejected_logs"]] <-
          lapply(self$`rejected_logs`, function(x) x$toJSON())
      }
      IntegrationLogsInvalidLogResponseObject
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
    #' @return IntegrationLogsInvalidLogResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`rejected_logs`)) {
          sprintf(
          '"rejected_logs":
          [%s]
',
          paste(sapply(self$`rejected_logs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
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

