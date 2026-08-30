#' Create a new NotificationResponse
#'
#' @description
#' NotificationResponse Class
#'
#' @docType class
#' @title NotificationResponse
#' @description NotificationResponse Class
#' @format An \code{R6Class} generator object
#' @field error_msg error message when success is false character [optional]
#' @field received_at Received time. Unix timestamp in seconds. integer [optional]
#' @field success Returns true if the notification accepted. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NotificationResponse <- R6::R6Class(
  "NotificationResponse",
  public = list(
    `error_msg` = NULL,
    `received_at` = NULL,
    `success` = NULL,

    #' @description
    #' Initialize a new NotificationResponse class.
    #'
    #' @param error_msg error message when success is false
    #' @param received_at Received time. Unix timestamp in seconds.
    #' @param success Returns true if the notification accepted.
    #' @param ... Other optional arguments.
    initialize = function(`error_msg` = NULL, `received_at` = NULL, `success` = NULL, ...) {
      if (!is.null(`error_msg`)) {
        if (!(is.character(`error_msg`) && length(`error_msg`) == 1)) {
          stop(paste("Error! Invalid data for `error_msg`. Must be a string:", `error_msg`))
        }
        self$`error_msg` <- `error_msg`
      }
      if (!is.null(`received_at`)) {
        if (!(is.numeric(`received_at`) && length(`received_at`) == 1)) {
          stop(paste("Error! Invalid data for `received_at`. Must be an integer:", `received_at`))
        }
        self$`received_at` <- `received_at`
      }
      if (!is.null(`success`)) {
        if (!(is.logical(`success`) && length(`success`) == 1)) {
          stop(paste("Error! Invalid data for `success`. Must be a boolean:", `success`))
        }
        self$`success` <- `success`
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
    #' @return NotificationResponse as a base R list.
    #' @examples
    #' # convert array of NotificationResponse (x) to a data frame
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
    #' Convert NotificationResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      NotificationResponseObject <- list()
      if (!is.null(self$`error_msg`)) {
        NotificationResponseObject[["error_msg"]] <-
          self$`error_msg`
      }
      if (!is.null(self$`received_at`)) {
        NotificationResponseObject[["received_at"]] <-
          self$`received_at`
      }
      if (!is.null(self$`success`)) {
        NotificationResponseObject[["success"]] <-
          self$`success`
      }
      return(NotificationResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of NotificationResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of NotificationResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`error_msg`)) {
        self$`error_msg` <- this_object$`error_msg`
      }
      if (!is.null(this_object$`received_at`)) {
        self$`received_at` <- this_object$`received_at`
      }
      if (!is.null(this_object$`success`)) {
        self$`success` <- this_object$`success`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return NotificationResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of NotificationResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of NotificationResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`error_msg` <- this_object$`error_msg`
      self$`received_at` <- this_object$`received_at`
      self$`success` <- this_object$`success`
      self
    },

    #' @description
    #' Validate JSON input with respect to NotificationResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of NotificationResponse
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
# NotificationResponse$unlock()
#
## Below is an example to define the print function
# NotificationResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# NotificationResponse$lock()

