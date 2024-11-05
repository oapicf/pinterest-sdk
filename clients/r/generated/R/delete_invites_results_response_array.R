#' Create a new DeleteInvitesResultsResponseArray
#'
#' @description
#' Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
#'
#' @docType class
#' @title DeleteInvitesResultsResponseArray
#' @description DeleteInvitesResultsResponseArray Class
#' @format An \code{R6Class} generator object
#' @field items List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. list(\link{DeleteInvitesResultsResponseArrayItemsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteInvitesResultsResponseArray <- R6::R6Class(
  "DeleteInvitesResultsResponseArray",
  public = list(
    `items` = NULL,

    #' @description
    #' Initialize a new DeleteInvitesResultsResponseArray class.
    #'
    #' @param items List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
    #' @param ... Other optional arguments.
    initialize = function(`items` = NULL, ...) {
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteInvitesResultsResponseArray in JSON format
    toJSON = function() {
      DeleteInvitesResultsResponseArrayObject <- list()
      if (!is.null(self$`items`)) {
        DeleteInvitesResultsResponseArrayObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      DeleteInvitesResultsResponseArrayObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteInvitesResultsResponseArray
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteInvitesResultsResponseArray
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[DeleteInvitesResultsResponseArrayItemsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteInvitesResultsResponseArray in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteInvitesResultsResponseArray
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteInvitesResultsResponseArray
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[DeleteInvitesResultsResponseArrayItemsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteInvitesResultsResponseArray and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteInvitesResultsResponseArray
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
# DeleteInvitesResultsResponseArray$unlock()
#
## Below is an example to define the print function
# DeleteInvitesResultsResponseArray$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteInvitesResultsResponseArray$lock()

