#' Create a new DeletePartnerAssetAccessResultsResponseArray
#'
#' @description
#' DeletePartnerAssetAccessResultsResponseArray Class
#'
#' @docType class
#' @title DeletePartnerAssetAccessResultsResponseArray
#' @description DeletePartnerAssetAccessResultsResponseArray Class
#' @format An \code{R6Class} generator object
#' @field items List of terminated partner asset accesses. list(\link{DeletePartnerAssetAccessResult}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletePartnerAssetAccessResultsResponseArray <- R6::R6Class(
  "DeletePartnerAssetAccessResultsResponseArray",
  public = list(
    `items` = NULL,

    #' @description
    #' Initialize a new DeletePartnerAssetAccessResultsResponseArray class.
    #'
    #' @param items List of terminated partner asset accesses.
    #' @param ... Other optional arguments.
    initialize = function(`items` = NULL, ...) {
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
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
    #' @return DeletePartnerAssetAccessResultsResponseArray as a base R list.
    #' @examples
    #' # convert array of DeletePartnerAssetAccessResultsResponseArray (x) to a data frame
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
    #' Convert DeletePartnerAssetAccessResultsResponseArray to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DeletePartnerAssetAccessResultsResponseArrayObject <- list()
      if (!is.null(self$`items`)) {
        DeletePartnerAssetAccessResultsResponseArrayObject[["items"]] <-
          self$extractSimpleType(self$`items`)
      }
      return(DeletePartnerAssetAccessResultsResponseArrayObject)
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
    #' Deserialize JSON string into an instance of DeletePartnerAssetAccessResultsResponseArray
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnerAssetAccessResultsResponseArray
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[DeletePartnerAssetAccessResult]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DeletePartnerAssetAccessResultsResponseArray in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnerAssetAccessResultsResponseArray
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnerAssetAccessResultsResponseArray
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[DeletePartnerAssetAccessResult]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeletePartnerAssetAccessResultsResponseArray and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletePartnerAssetAccessResultsResponseArray
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
# DeletePartnerAssetAccessResultsResponseArray$unlock()
#
## Below is an example to define the print function
# DeletePartnerAssetAccessResultsResponseArray$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletePartnerAssetAccessResultsResponseArray$lock()

