#' Create a new DeletedMembersResponse
#'
#' @description
#' An object with a list of members that were deleted.
#'
#' @docType class
#' @title DeletedMembersResponse
#' @description DeletedMembersResponse Class
#' @format An \code{R6Class} generator object
#' @field deleted_members List of members whose business membership have been terminated. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletedMembersResponse <- R6::R6Class(
  "DeletedMembersResponse",
  public = list(
    `deleted_members` = NULL,

    #' @description
    #' Initialize a new DeletedMembersResponse class.
    #'
    #' @param deleted_members List of members whose business membership have been terminated.
    #' @param ... Other optional arguments.
    initialize = function(`deleted_members` = NULL, ...) {
      if (!is.null(`deleted_members`)) {
        stopifnot(is.vector(`deleted_members`), length(`deleted_members`) != 0)
        sapply(`deleted_members`, function(x) stopifnot(is.character(x)))
        self$`deleted_members` <- `deleted_members`
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
    #' @return DeletedMembersResponse as a base R list.
    #' @examples
    #' # convert array of DeletedMembersResponse (x) to a data frame
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
    #' Convert DeletedMembersResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DeletedMembersResponseObject <- list()
      if (!is.null(self$`deleted_members`)) {
        DeletedMembersResponseObject[["deleted_members"]] <-
          self$`deleted_members`
      }
      return(DeletedMembersResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletedMembersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletedMembersResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deleted_members`)) {
        self$`deleted_members` <- ApiClient$new()$deserializeObj(this_object$`deleted_members`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DeletedMembersResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletedMembersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletedMembersResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deleted_members` <- ApiClient$new()$deserializeObj(this_object$`deleted_members`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeletedMembersResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletedMembersResponse
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
# DeletedMembersResponse$unlock()
#
## Below is an example to define the print function
# DeletedMembersResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletedMembersResponse$lock()

