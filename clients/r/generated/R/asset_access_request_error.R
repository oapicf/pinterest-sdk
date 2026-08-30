#' Create a new AssetAccessRequestError
#'
#' @description
#' AssetAccessRequestError Class
#'
#' @docType class
#' @title AssetAccessRequestError
#' @description AssetAccessRequestError Class
#' @format An \code{R6Class} generator object
#' @field code Error code associated with the error in requesting asset access. integer [optional]
#' @field messages  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetAccessRequestError <- R6::R6Class(
  "AssetAccessRequestError",
  public = list(
    `code` = NULL,
    `messages` = NULL,

    #' @description
    #' Initialize a new AssetAccessRequestError class.
    #'
    #' @param code Error code associated with the error in requesting asset access.
    #' @param messages messages
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `messages` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`messages`)) {
        stopifnot(is.vector(`messages`), length(`messages`) != 0)
        sapply(`messages`, function(x) stopifnot(is.character(x)))
        self$`messages` <- `messages`
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
    #' @return AssetAccessRequestError as a base R list.
    #' @examples
    #' # convert array of AssetAccessRequestError (x) to a data frame
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
    #' Convert AssetAccessRequestError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetAccessRequestErrorObject <- list()
      if (!is.null(self$`code`)) {
        AssetAccessRequestErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`messages`)) {
        AssetAccessRequestErrorObject[["messages"]] <-
          self$`messages`
      }
      return(AssetAccessRequestErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetAccessRequestError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetAccessRequestError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`messages`)) {
        self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssetAccessRequestError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetAccessRequestError
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetAccessRequestError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetAccessRequestError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetAccessRequestError
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
# AssetAccessRequestError$unlock()
#
## Below is an example to define the print function
# AssetAccessRequestError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetAccessRequestError$lock()

