#' Create a new IntegrationLogsSuccessResponse
#'
#' @description
#' Response when logs are successfully processed.
#'
#' @docType class
#' @title IntegrationLogsSuccessResponse
#' @description IntegrationLogsSuccessResponse Class
#' @format An \code{R6Class} generator object
#' @field message  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLogsSuccessResponse <- R6::R6Class(
  "IntegrationLogsSuccessResponse",
  public = list(
    `message` = NULL,

    #' @description
    #' Initialize a new IntegrationLogsSuccessResponse class.
    #'
    #' @param message message
    #' @param ... Other optional arguments.
    initialize = function(`message` = NULL, ...) {
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsSuccessResponse in JSON format
    toJSON = function() {
      IntegrationLogsSuccessResponseObject <- list()
      if (!is.null(self$`message`)) {
        IntegrationLogsSuccessResponseObject[["message"]] <-
          self$`message`
      }
      IntegrationLogsSuccessResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsSuccessResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsSuccessResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsSuccessResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsSuccessResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsSuccessResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationLogsSuccessResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogsSuccessResponse
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
# IntegrationLogsSuccessResponse$unlock()
#
## Below is an example to define the print function
# IntegrationLogsSuccessResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogsSuccessResponse$lock()

