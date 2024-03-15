#' Create a new Exception
#'
#' @description
#' Exception Class
#'
#' @docType class
#' @title Exception
#' @description Exception Class
#' @format An \code{R6Class} generator object
#' @field code Exception error code. integer [optional]
#' @field message Exception message. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Exception <- R6::R6Class(
  "Exception",
  public = list(
    `code` = NULL,
    `message` = NULL,
    #' Initialize a new Exception class.
    #'
    #' @description
    #' Initialize a new Exception class.
    #'
    #' @param code Exception error code.
    #' @param message Exception message.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`code` = NULL, `message` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Exception in JSON format
    #' @export
    toJSON = function() {
      ExceptionObject <- list()
      if (!is.null(self$`code`)) {
        ExceptionObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        ExceptionObject[["message"]] <-
          self$`message`
      }
      ExceptionObject
    },
    #' Deserialize JSON string into an instance of Exception
    #'
    #' @description
    #' Deserialize JSON string into an instance of Exception
    #'
    #' @param input_json the JSON input
    #' @return the instance of Exception
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Exception in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            %d
                    ',
          self$`code`
          )
        },
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
    #' Deserialize JSON string into an instance of Exception
    #'
    #' @description
    #' Deserialize JSON string into an instance of Exception
    #'
    #' @param input_json the JSON input
    #' @return the instance of Exception
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },
    #' Validate JSON input with respect to Exception
    #'
    #' @description
    #' Validate JSON input with respect to Exception and throw an exception if invalid
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
    #' @return String representation of Exception
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
# Exception$unlock()
#
## Below is an example to define the print function
# Exception$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Exception$lock()

