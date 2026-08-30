#' Create a new FollowUserCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title FollowUserCreate
#' @description FollowUserCreate Class
#' @format An \code{R6Class} generator object
#' @field auto_follow Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FollowUserCreate <- R6::R6Class(
  "FollowUserCreate",
  public = list(
    `auto_follow` = NULL,

    #' @description
    #' Initialize a new FollowUserCreate class.
    #'
    #' @param auto_follow Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
    #' @param ... Other optional arguments.
    initialize = function(`auto_follow` = NULL, ...) {
      if (!is.null(`auto_follow`)) {
        if (!(is.logical(`auto_follow`) && length(`auto_follow`) == 1)) {
          stop(paste("Error! Invalid data for `auto_follow`. Must be a boolean:", `auto_follow`))
        }
        self$`auto_follow` <- `auto_follow`
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
    #' @return FollowUserCreate as a base R list.
    #' @examples
    #' # convert array of FollowUserCreate (x) to a data frame
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
    #' Convert FollowUserCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FollowUserCreateObject <- list()
      if (!is.null(self$`auto_follow`)) {
        FollowUserCreateObject[["auto_follow"]] <-
          self$`auto_follow`
      }
      return(FollowUserCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FollowUserCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of FollowUserCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`auto_follow`)) {
        self$`auto_follow` <- this_object$`auto_follow`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FollowUserCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FollowUserCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of FollowUserCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`auto_follow` <- this_object$`auto_follow`
      self
    },

    #' @description
    #' Validate JSON input with respect to FollowUserCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FollowUserCreate
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
# FollowUserCreate$unlock()
#
## Below is an example to define the print function
# FollowUserCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FollowUserCreate$lock()

