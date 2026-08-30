#' Create a new CancelInviteResultItem
#'
#' @description
#' CancelInviteResultItem Class
#'
#' @docType class
#' @title CancelInviteResultItem
#' @description CancelInviteResultItem Class
#' @format An \code{R6Class} generator object
#' @field exception  \link{CancelInviteException} [optional]
#' @field invite  \link{CancelInviteResult} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CancelInviteResultItem <- R6::R6Class(
  "CancelInviteResultItem",
  public = list(
    `exception` = NULL,
    `invite` = NULL,

    #' @description
    #' Initialize a new CancelInviteResultItem class.
    #'
    #' @param exception exception
    #' @param invite invite
    #' @param ... Other optional arguments.
    initialize = function(`exception` = NULL, `invite` = NULL, ...) {
      if (!is.null(`exception`)) {
        stopifnot(R6::is.R6(`exception`))
        self$`exception` <- `exception`
      }
      if (!is.null(`invite`)) {
        stopifnot(R6::is.R6(`invite`))
        self$`invite` <- `invite`
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
    #' @return CancelInviteResultItem as a base R list.
    #' @examples
    #' # convert array of CancelInviteResultItem (x) to a data frame
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
    #' Convert CancelInviteResultItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CancelInviteResultItemObject <- list()
      if (!is.null(self$`exception`)) {
        CancelInviteResultItemObject[["exception"]] <-
          self$extractSimpleType(self$`exception`)
      }
      if (!is.null(self$`invite`)) {
        CancelInviteResultItemObject[["invite"]] <-
          self$extractSimpleType(self$`invite`)
      }
      return(CancelInviteResultItemObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInviteResultItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInviteResultItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`exception`)) {
        `exception_object` <- CancelInviteException$new()
        `exception_object`$fromJSON(jsonlite::toJSON(this_object$`exception`, auto_unbox = TRUE, digits = NA))
        self$`exception` <- `exception_object`
      }
      if (!is.null(this_object$`invite`)) {
        `invite_object` <- CancelInviteResult$new()
        `invite_object`$fromJSON(jsonlite::toJSON(this_object$`invite`, auto_unbox = TRUE, digits = NA))
        self$`invite` <- `invite_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CancelInviteResultItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInviteResultItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInviteResultItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`exception` <- CancelInviteException$new()$fromJSON(jsonlite::toJSON(this_object$`exception`, auto_unbox = TRUE, digits = NA))
      self$`invite` <- CancelInviteResult$new()$fromJSON(jsonlite::toJSON(this_object$`invite`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CancelInviteResultItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CancelInviteResultItem
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
# CancelInviteResultItem$unlock()
#
## Below is an example to define the print function
# CancelInviteResultItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CancelInviteResultItem$lock()

