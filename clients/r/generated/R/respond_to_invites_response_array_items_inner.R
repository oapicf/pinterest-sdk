#' Create a new RespondToInvitesResponseArrayItemsInner
#'
#' @description
#' RespondToInvitesResponseArrayItemsInner Class
#'
#' @docType class
#' @title RespondToInvitesResponseArrayItemsInner
#' @description RespondToInvitesResponseArrayItemsInner Class
#' @format An \code{R6Class} generator object
#' @field exception  \link{InviteExceptionResponse} [optional]
#' @field invite  \link{BaseInviteDataResponse} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RespondToInvitesResponseArrayItemsInner <- R6::R6Class(
  "RespondToInvitesResponseArrayItemsInner",
  public = list(
    `exception` = NULL,
    `invite` = NULL,

    #' @description
    #' Initialize a new RespondToInvitesResponseArrayItemsInner class.
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
    #' @return RespondToInvitesResponseArrayItemsInner as a base R list.
    #' @examples
    #' # convert array of RespondToInvitesResponseArrayItemsInner (x) to a data frame
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
    #' Convert RespondToInvitesResponseArrayItemsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RespondToInvitesResponseArrayItemsInnerObject <- list()
      if (!is.null(self$`exception`)) {
        RespondToInvitesResponseArrayItemsInnerObject[["exception"]] <-
          self$`exception`$toSimpleType()
      }
      if (!is.null(self$`invite`)) {
        RespondToInvitesResponseArrayItemsInnerObject[["invite"]] <-
          self$`invite`$toSimpleType()
      }
      return(RespondToInvitesResponseArrayItemsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RespondToInvitesResponseArrayItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RespondToInvitesResponseArrayItemsInner
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
    #' @return RespondToInvitesResponseArrayItemsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RespondToInvitesResponseArrayItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RespondToInvitesResponseArrayItemsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`exception` <- InviteExceptionResponse$new()$fromJSON(jsonlite::toJSON(this_object$`exception`, auto_unbox = TRUE, digits = NA))
      self$`invite` <- BaseInviteDataResponse$new()$fromJSON(jsonlite::toJSON(this_object$`invite`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RespondToInvitesResponseArrayItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RespondToInvitesResponseArrayItemsInner
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
# RespondToInvitesResponseArrayItemsInner$unlock()
#
## Below is an example to define the print function
# RespondToInvitesResponseArrayItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RespondToInvitesResponseArrayItemsInner$lock()

