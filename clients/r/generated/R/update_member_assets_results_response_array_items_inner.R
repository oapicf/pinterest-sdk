#' Create a new UpdateMemberAssetsResultsResponseArrayItemsInner
#'
#' @description
#' UpdateMemberAssetsResultsResponseArrayItemsInner Class
#'
#' @docType class
#' @title UpdateMemberAssetsResultsResponseArrayItemsInner
#' @description UpdateMemberAssetsResultsResponseArrayItemsInner Class
#' @format An \code{R6Class} generator object
#' @field response  \link{UsersForIndividualAssetResponse} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateMemberAssetsResultsResponseArrayItemsInner <- R6::R6Class(
  "UpdateMemberAssetsResultsResponseArrayItemsInner",
  public = list(
    `response` = NULL,

    #' @description
    #' Initialize a new UpdateMemberAssetsResultsResponseArrayItemsInner class.
    #'
    #' @param response response
    #' @param ... Other optional arguments.
    initialize = function(`response` = NULL, ...) {
      if (!is.null(`response`)) {
        stopifnot(R6::is.R6(`response`))
        self$`response` <- `response`
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
    #' @return UpdateMemberAssetsResultsResponseArrayItemsInner as a base R list.
    #' @examples
    #' # convert array of UpdateMemberAssetsResultsResponseArrayItemsInner (x) to a data frame
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
    #' Convert UpdateMemberAssetsResultsResponseArrayItemsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UpdateMemberAssetsResultsResponseArrayItemsInnerObject <- list()
      if (!is.null(self$`response`)) {
        UpdateMemberAssetsResultsResponseArrayItemsInnerObject[["response"]] <-
          self$`response`$toSimpleType()
      }
      return(UpdateMemberAssetsResultsResponseArrayItemsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMemberAssetsResultsResponseArrayItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberAssetsResultsResponseArrayItemsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`response`)) {
        `response_object` <- UsersForIndividualAssetResponse$new()
        `response_object`$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
        self$`response` <- `response_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UpdateMemberAssetsResultsResponseArrayItemsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMemberAssetsResultsResponseArrayItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberAssetsResultsResponseArrayItemsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`response` <- UsersForIndividualAssetResponse$new()$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateMemberAssetsResultsResponseArrayItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateMemberAssetsResultsResponseArrayItemsInner
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
# UpdateMemberAssetsResultsResponseArrayItemsInner$unlock()
#
## Below is an example to define the print function
# UpdateMemberAssetsResultsResponseArrayItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateMemberAssetsResultsResponseArrayItemsInner$lock()

