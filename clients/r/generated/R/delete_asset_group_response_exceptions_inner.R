#' Create a new DeleteAssetGroupResponseExceptionsInner
#'
#' @description
#' DeleteAssetGroupResponseExceptionsInner Class
#'
#' @docType class
#' @title DeleteAssetGroupResponseExceptionsInner
#' @description DeleteAssetGroupResponseExceptionsInner Class
#' @format An \code{R6Class} generator object
#' @field code Error code associated with the error deleting asset group. integer [optional]
#' @field message Error message associated with the error deleting asset group. character [optional]
#' @field asset_group_id Asset group id of the exception. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteAssetGroupResponseExceptionsInner <- R6::R6Class(
  "DeleteAssetGroupResponseExceptionsInner",
  public = list(
    `code` = NULL,
    `message` = NULL,
    `asset_group_id` = NULL,

    #' @description
    #' Initialize a new DeleteAssetGroupResponseExceptionsInner class.
    #'
    #' @param code Error code associated with the error deleting asset group.
    #' @param message Error message associated with the error deleting asset group.
    #' @param asset_group_id Asset group id of the exception.
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `message` = NULL, `asset_group_id` = NULL, ...) {
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
      if (!is.null(`asset_group_id`)) {
        if (!(is.character(`asset_group_id`) && length(`asset_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_id`. Must be a string:", `asset_group_id`))
        }
        self$`asset_group_id` <- `asset_group_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteAssetGroupResponseExceptionsInner in JSON format
    toJSON = function() {
      DeleteAssetGroupResponseExceptionsInnerObject <- list()
      if (!is.null(self$`code`)) {
        DeleteAssetGroupResponseExceptionsInnerObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        DeleteAssetGroupResponseExceptionsInnerObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`asset_group_id`)) {
        DeleteAssetGroupResponseExceptionsInnerObject[["asset_group_id"]] <-
          self$`asset_group_id`
      }
      DeleteAssetGroupResponseExceptionsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteAssetGroupResponseExceptionsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteAssetGroupResponseExceptionsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`asset_group_id`)) {
        self$`asset_group_id` <- this_object$`asset_group_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteAssetGroupResponseExceptionsInner in JSON format
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
        },
        if (!is.null(self$`asset_group_id`)) {
          sprintf(
          '"asset_group_id":
            "%s"
                    ',
          self$`asset_group_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteAssetGroupResponseExceptionsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteAssetGroupResponseExceptionsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self$`asset_group_id` <- this_object$`asset_group_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteAssetGroupResponseExceptionsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteAssetGroupResponseExceptionsInner
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
# DeleteAssetGroupResponseExceptionsInner$unlock()
#
## Below is an example to define the print function
# DeleteAssetGroupResponseExceptionsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteAssetGroupResponseExceptionsInner$lock()

