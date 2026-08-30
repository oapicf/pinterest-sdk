#' Create a new AssetGroupUpdateError
#'
#' @description
#' AssetGroupUpdateError Class
#'
#' @docType class
#' @title AssetGroupUpdateError
#' @description AssetGroupUpdateError Class
#' @format An \code{R6Class} generator object
#' @field asset_group_id  character [optional]
#' @field code  integer [optional]
#' @field message  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupUpdateError <- R6::R6Class(
  "AssetGroupUpdateError",
  public = list(
    `asset_group_id` = NULL,
    `code` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new AssetGroupUpdateError class.
    #'
    #' @param asset_group_id asset_group_id
    #' @param code code
    #' @param message message
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
    #' @return AssetGroupUpdateError as a base R list.
    #' @examples
    #' # convert array of AssetGroupUpdateError (x) to a data frame
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
    #' Convert AssetGroupUpdateError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetGroupUpdateErrorObject <- list()
      if (!is.null(self$`asset_group_id`)) {
        AssetGroupUpdateErrorObject[["asset_group_id"]] <-
          self$`asset_group_id`
      }
      if (!is.null(self$`code`)) {
        AssetGroupUpdateErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        AssetGroupUpdateErrorObject[["message"]] <-
          self$`message`
      }
      return(AssetGroupUpdateErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupUpdateError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupUpdateError
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
    #' @return AssetGroupUpdateError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupUpdateError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupUpdateError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group_id` <- this_object$`asset_group_id`
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupUpdateError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetGroupUpdateError
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
# AssetGroupUpdateError$unlock()
#
## Below is an example to define the print function
# AssetGroupUpdateError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetGroupUpdateError$lock()

