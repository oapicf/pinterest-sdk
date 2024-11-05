#' Create a new UserSummary
#'
#' @description
#' UserSummary Class
#'
#' @docType class
#' @title UserSummary
#' @description UserSummary Class
#' @format An \code{R6Class} generator object
#' @field username Username character [optional]
#' @field type Always \"user\" character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserSummary <- R6::R6Class(
  "UserSummary",
  public = list(
    `username` = NULL,
    `type` = NULL,

    #' @description
    #' Initialize a new UserSummary class.
    #'
    #' @param username Username
    #' @param type Always \"user\"
    #' @param ... Other optional arguments.
    initialize = function(`username` = NULL, `type` = NULL, ...) {
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserSummary in JSON format
    toJSON = function() {
      UserSummaryObject <- list()
      if (!is.null(self$`username`)) {
        UserSummaryObject[["username"]] <-
          self$`username`
      }
      if (!is.null(self$`type`)) {
        UserSummaryObject[["type"]] <-
          self$`type`
      }
      UserSummaryObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UserSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserSummary
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserSummary in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`username`)) {
          sprintf(
          '"username":
            "%s"
                    ',
          self$`username`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UserSummary
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserSummary
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`username` <- this_object$`username`
      self$`type` <- this_object$`type`
      self
    },

    #' @description
    #' Validate JSON input with respect to UserSummary and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UserSummary
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
# UserSummary$unlock()
#
## Below is an example to define the print function
# UserSummary$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserSummary$lock()

