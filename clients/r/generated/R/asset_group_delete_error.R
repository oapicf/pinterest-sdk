#' Create a new AssetGroupDeleteError
#'
#' @description
#' AssetGroupDeleteError Class
#'
#' @docType class
#' @title AssetGroupDeleteError
#' @description AssetGroupDeleteError Class
#' @format An \code{R6Class} generator object
#' @field asset_group_id Asset group id of the exception. character [optional]
#' @field code Error code associated with the error deleting asset group. integer [optional]
#' @field message Error message associated with the error deleting asset group. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupDeleteError <- R6::R6Class(
  "AssetGroupDeleteError",
  public = list(
    `asset_group_id` = NULL,
    `code` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new AssetGroupDeleteError class.
    #'
    #' @param asset_group_id Asset group id of the exception.
    #' @param code Error code associated with the error deleting asset group.
    #' @param message Error message associated with the error deleting asset group.
    #' @param ... Other optional arguments.
    initialize = function(`asset_group_id` = NULL, `code` = NULL, `message` = NULL, ...) {
      if (!is.null(`asset_group_id`)) {
        if (!(is.character(`asset_group_id`) && length(`asset_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_group_id`. Must be a string:", `asset_group_id`))
        }
        self$`asset_group_id` <- `asset_group_id`
      }
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
    #' @return AssetGroupDeleteError as a base R list.
    #' @examples
    #' # convert array of AssetGroupDeleteError (x) to a data frame
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
    #' Convert AssetGroupDeleteError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetGroupDeleteErrorObject <- list()
      if (!is.null(self$`asset_group_id`)) {
        AssetGroupDeleteErrorObject[["asset_group_id"]] <-
          self$`asset_group_id`
      }
      if (!is.null(self$`code`)) {
        AssetGroupDeleteErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        AssetGroupDeleteErrorObject[["message"]] <-
          self$`message`
      }
      return(AssetGroupDeleteErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupDeleteError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupDeleteError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_group_id`)) {
        self$`asset_group_id` <- this_object$`asset_group_id`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssetGroupDeleteError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupDeleteError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupDeleteError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group_id` <- this_object$`asset_group_id`
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupDeleteError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetGroupDeleteError
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
# AssetGroupDeleteError$unlock()
#
## Below is an example to define the print function
# AssetGroupDeleteError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetGroupDeleteError$lock()

