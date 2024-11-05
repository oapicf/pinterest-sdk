#' Create a new AdAccountOwner
#'
#' @description
#' AdAccountOwner Class
#'
#' @docType class
#' @title AdAccountOwner
#' @description AdAccountOwner Class
#' @format An \code{R6Class} generator object
#' @field username Public username for the user account character [optional]
#' @field id The owning account's user ID. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountOwner <- R6::R6Class(
  "AdAccountOwner",
  public = list(
    `username` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new AdAccountOwner class.
    #'
    #' @param username Public username for the user account
    #' @param id The owning account's user ID.
    #' @param ... Other optional arguments.
    initialize = function(`username` = NULL, `id` = NULL, ...) {
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdAccountOwner in JSON format
    toJSON = function() {
      AdAccountOwnerObject <- list()
      if (!is.null(self$`username`)) {
        AdAccountOwnerObject[["username"]] <-
          self$`username`
      }
      if (!is.null(self$`id`)) {
        AdAccountOwnerObject[["id"]] <-
          self$`id`
      }
      AdAccountOwnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountOwner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdAccountOwner in JSON format
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
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountOwner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`username` <- this_object$`username`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccountOwner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountOwner
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
# AdAccountOwner$unlock()
#
## Below is an example to define the print function
# AdAccountOwner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountOwner$lock()

