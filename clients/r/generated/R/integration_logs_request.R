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

    #' @description
    #' Initialize a new IntegrationLogsRequest class.
    #'
    #' @param logs logs
    #' @param ... Other optional arguments.
    initialize = function(`logs`, ...) {
      if (!missing(`logs`)) {
        stopifnot(is.vector(`logs`), length(`logs`) != 0)
        sapply(`logs`, function(x) stopifnot(R6::is.R6(x)))
        self$`logs` <- `logs`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsRequest in JSON format
    toJSON = function() {
      IntegrationLogsRequestObject <- list()
      if (!is.null(self$`logs`)) {
        IntegrationLogsRequestObject[["logs"]] <-
          lapply(self$`logs`, function(x) x$toJSON())
      }
      IntegrationLogsRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`logs`)) {
        self$`logs` <- ApiClient$new()$deserializeObj(this_object$`logs`, "array[IntegrationLog]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsRequest in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`logs` <- ApiClient$new()$deserializeObj(this_object$`logs`, "array[IntegrationLog]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationLogsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
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

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogsRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        return(FALSE)
      }

      if (length(self$`logs`) > 250) {
        return(FALSE)
      }
      if (length(self$`logs`) < 1) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        invalid_fields["logs"] <- "Non-nullable required field `logs` cannot be null."
      }

      if (length(self$`logs`) > 250) {
        invalid_fields["logs"] <- "Invalid length for `logs`, number of items must be less than or equal to 250."
      }
      if (length(self$`logs`) < 1) {
        invalid_fields["logs"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

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
# IntegrationLogsRequest$unlock()
#
## Below is an example to define the print function
# IntegrationLogsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogsRequest$lock()

