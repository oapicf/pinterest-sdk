#' Create a new BoardOwner
#'
#' @description
#' BoardOwner Class
#'
#' @docType class
#' @title BoardOwner
#' @description BoardOwner Class
#' @format An \code{R6Class} generator object
#' @field username  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BoardOwner <- R6::R6Class(
  "BoardOwner",
  public = list(
    `username` = NULL,
    #' Initialize a new BoardOwner class.
    #'
    #' @description
    #' Initialize a new BoardOwner class.
    #'
    #' @param username username
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`username` = NULL, ...) {
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BoardOwner in JSON format
    #' @export
    toJSON = function() {
      BoardOwnerObject <- list()
      if (!is.null(self$`username`)) {
        BoardOwnerObject[["username"]] <-
          self$`username`
      }
      BoardOwnerObject
    },
    #' Deserialize JSON string into an instance of BoardOwner
    #'
    #' @description
    #' Deserialize JSON string into an instance of BoardOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardOwner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BoardOwner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`username`)) {
          sprintf(
          '"username":
            "%s"
                    ',
          self$`username`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BoardOwner
    #'
    #' @description
    #' Deserialize JSON string into an instance of BoardOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BoardOwner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`username` <- this_object$`username`
      self
    },
    #' Validate JSON input with respect to BoardOwner
    #'
    #' @description
    #' Validate JSON input with respect to BoardOwner and throw an exception if invalid
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
    #' @return String representation of BoardOwner
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
# BoardOwner$unlock()
#
## Below is an example to define the print function
# BoardOwner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BoardOwner$lock()

