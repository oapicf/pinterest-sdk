#' Create a new IntegrationLogsRequest
#'
#' @description
#' Batch of logs sent from an integration application.
#'
#' @docType class
#' @title IntegrationLogsRequest
#' @description IntegrationLogsRequest Class
#' @format An \code{R6Class} generator object
#' @field logs  list(\link{IntegrationLog})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLogsRequest <- R6::R6Class(
  "IntegrationLogsRequest",
  public = list(
    `logs` = NULL,
    #' Initialize a new IntegrationLogsRequest class.
    #'
    #' @description
    #' Initialize a new IntegrationLogsRequest class.
    #'
    #' @param logs logs
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`logs`, ...) {
      if (!missing(`logs`)) {
        stopifnot(is.vector(`logs`), length(`logs`) != 0)
        sapply(`logs`, function(x) stopifnot(R6::is.R6(x)))
        self$`logs` <- `logs`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsRequest in JSON format
    #' @export
    toJSON = function() {
      IntegrationLogsRequestObject <- list()
      if (!is.null(self$`logs`)) {
        IntegrationLogsRequestObject[["logs"]] <-
          lapply(self$`logs`, function(x) x$toJSON())
      }
      IntegrationLogsRequestObject
    },
    #' Deserialize JSON string into an instance of IntegrationLogsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`logs`)) {
        self$`logs` <- ApiClient$new()$deserializeObj(this_object$`logs`, "array[IntegrationLog]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`logs`)) {
          sprintf(
          '"logs":
          [%s]
',
          paste(sapply(self$`logs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of IntegrationLogsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`logs` <- ApiClient$new()$deserializeObj(this_object$`logs`, "array[IntegrationLog]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to IntegrationLogsRequest
    #'
    #' @description
    #' Validate JSON input with respect to IntegrationLogsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `logs`
      if (!is.null(input_json$`logs`)) {
        stopifnot(is.vector(input_json$`logs`), length(input_json$`logs`) != 0)
        tmp <- sapply(input_json$`logs`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogsRequest: the required field `logs` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogsRequest
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
      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        return(FALSE)
      }

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
      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        invalid_fields["logs"] <- "Non-nullable required field `logs` cannot be null."
      }

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
# IntegrationLogsRequest$unlock()
#
## Below is an example to define the print function
# IntegrationLogsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogsRequest$lock()

