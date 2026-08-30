#' Create a new RespondToInviteResultItem
#'
#' @description
#' RespondToInviteResultItem Class
#'
#' @docType class
#' @title RespondToInviteResultItem
#' @description RespondToInviteResultItem Class
#' @format An \code{R6Class} generator object
#' @field exception  \link{InviteExceptionResponse} [optional]
#' @field invite An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. \link{BaseInviteDataResponse} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RespondToInviteResultItem <- R6::R6Class(
  "RespondToInviteResultItem",
  public = list(
    `exception` = NULL,
    `invite` = NULL,

    #' @description
    #' Initialize a new RespondToInviteResultItem class.
    #'
    #' @param exception exception
    #' @param invite An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
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
    #' @return RespondToInviteResultItem as a base R list.
    #' @examples
    #' # convert array of RespondToInviteResultItem (x) to a data frame
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
    #' Convert RespondToInviteResultItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RespondToInviteResultItemObject <- list()
      if (!is.null(self$`exception`)) {
        RespondToInviteResultItemObject[["exception"]] <-
          self$extractSimpleType(self$`exception`)
      }
      if (!is.null(self$`invite`)) {
        RespondToInviteResultItemObject[["invite"]] <-
          self$extractSimpleType(self$`invite`)
      }
      return(RespondToInviteResultItemObject)
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
    #' Deserialize JSON string into an instance of RespondToInviteResultItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of RespondToInviteResultItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`exception`)) {
        `exception_object` <- InviteExceptionResponse$new()
        `exception_object`$fromJSON(jsonlite::toJSON(this_object$`exception`, auto_unbox = TRUE, digits = NA))
        self$`exception` <- `exception_object`
      }
      if (!is.null(this_object$`invite`)) {
        `invite_object` <- BaseInviteDataResponse$new()
        `invite_object`$fromJSON(jsonlite::toJSON(this_object$`invite`, auto_unbox = TRUE, digits = NA))
        self$`invite` <- `invite_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RespondToInviteResultItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RespondToInviteResultItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of RespondToInviteResultItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`exception` <- InviteExceptionResponse$new()$fromJSON(jsonlite::toJSON(this_object$`exception`, auto_unbox = TRUE, digits = NA))
      self$`invite` <- BaseInviteDataResponse$new()$fromJSON(jsonlite::toJSON(this_object$`invite`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RespondToInviteResultItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RespondToInviteResultItem
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
# RespondToInviteResultItem$unlock()
#
## Below is an example to define the print function
# RespondToInviteResultItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RespondToInviteResultItem$lock()

