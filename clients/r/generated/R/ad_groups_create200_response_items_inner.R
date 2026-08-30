#' Create a new AdGroupsCreate200ResponseItemsInner
#'
#' @description
#' AdGroupsCreate200ResponseItemsInner Class
#'
#' @docType class
#' @title AdGroupsCreate200ResponseItemsInner
#' @description AdGroupsCreate200ResponseItemsInner Class
#' @format An \code{R6Class} generator object
#' @field data  \link{AdGroup} [optional]
#' @field exceptions  list(\link{PinterestLibBatchItemException}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupsCreate200ResponseItemsInner <- R6::R6Class(
  "AdGroupsCreate200ResponseItemsInner",
  public = list(
    `data` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new AdGroupsCreate200ResponseItemsInner class.
    #'
    #' @param data data
    #' @param exceptions exceptions
    #' @param ... Other optional arguments.
    initialize = function(`data` = NULL, `exceptions` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`exceptions`)) {
        stopifnot(is.vector(`exceptions`), length(`exceptions`) != 0)
        sapply(`exceptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`exceptions` <- `exceptions`
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
    #' @return AdGroupsCreate200ResponseItemsInner as a base R list.
    #' @examples
    #' # convert array of AdGroupsCreate200ResponseItemsInner (x) to a data frame
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
    #' Convert AdGroupsCreate200ResponseItemsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupsCreate200ResponseItemsInnerObject <- list()
      if (!is.null(self$`data`)) {
        AdGroupsCreate200ResponseItemsInnerObject[["data"]] <-
          self$extractSimpleType(self$`data`)
      }
      if (!is.null(self$`exceptions`)) {
        AdGroupsCreate200ResponseItemsInnerObject[["exceptions"]] <-
          self$extractSimpleType(self$`exceptions`)
      }
      return(AdGroupsCreate200ResponseItemsInnerObject)
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
    #' Deserialize JSON string into an instance of AdGroupsCreate200ResponseItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupsCreate200ResponseItemsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- AdGroup$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[PinterestLibBatchItemException]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupsCreate200ResponseItemsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupsCreate200ResponseItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupsCreate200ResponseItemsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- AdGroup$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[PinterestLibBatchItemException]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupsCreate200ResponseItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupsCreate200ResponseItemsInner
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
# AdGroupsCreate200ResponseItemsInner$unlock()
#
## Below is an example to define the print function
# AdGroupsCreate200ResponseItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupsCreate200ResponseItemsInner$lock()

