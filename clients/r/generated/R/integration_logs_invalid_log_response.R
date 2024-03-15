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
    #' Initialize a new IntegrationLogsInvalidLogResponse class.
    #'
    #' @description
    #' Initialize a new IntegrationLogsInvalidLogResponse class.
    #'
    #' @param rejected_logs rejected_logs
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`rejected_logs` = NULL, ...) {
      if (!is.null(`rejected_logs`)) {
        stopifnot(is.vector(`rejected_logs`), length(`rejected_logs`) != 0)
        sapply(`rejected_logs`, function(x) stopifnot(R6::is.R6(x)))
        self$`rejected_logs` <- `rejected_logs`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsInvalidLogResponse in JSON format
    #' @export
    toJSON = function() {
      IntegrationLogsInvalidLogResponseObject <- list()
      if (!is.null(self$`rejected_logs`)) {
        IntegrationLogsInvalidLogResponseObject[["rejected_logs"]] <-
          lapply(self$`rejected_logs`, function(x) x$toJSON())
      }
      IntegrationLogsInvalidLogResponseObject
    },
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsInvalidLogResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rejected_logs`)) {
        self$`rejected_logs` <- ApiClient$new()$deserializeObj(this_object$`rejected_logs`, "array[IntegrationLogsInvalidLogResponseRejectedLogsInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsInvalidLogResponse in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsInvalidLogResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rejected_logs` <- ApiClient$new()$deserializeObj(this_object$`rejected_logs`, "array[IntegrationLogsInvalidLogResponseRejectedLogsInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to IntegrationLogsInvalidLogResponse
    #'
    #' @description
    #' Validate JSON input with respect to IntegrationLogsInvalidLogResponse and throw an exception if invalid
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
    #' @return String representation of IntegrationLogsInvalidLogResponse
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
# IntegrationLogsInvalidLogResponse$unlock()
#
## Below is an example to define the print function
# IntegrationLogsInvalidLogResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogsInvalidLogResponse$lock()

