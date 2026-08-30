#' Create a new AssetGroupInput
#'
#' @description
#' AssetGroupInput Class
#'
#' @docType class
#' @title AssetGroupInput
#' @description AssetGroupInput Class
#' @format An \code{R6Class} generator object
#' @field asset_group  \link{AssetGroupBinding} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupInput <- R6::R6Class(
  "AssetGroupInput",
  public = list(
    `asset_group` = NULL,

    #' @description
    #' Initialize a new AssetGroupInput class.
    #'
    #' @param asset_group asset_group
    #' @param ... Other optional arguments.
    initialize = function(`asset_group` = NULL, ...) {
      if (!is.null(`asset_group`)) {
        stopifnot(R6::is.R6(`asset_group`))
        self$`asset_group` <- `asset_group`
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
    #' @return AssetGroupInput as a base R list.
    #' @examples
    #' # convert array of AssetGroupInput (x) to a data frame
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
    #' Convert AssetGroupInput to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetGroupInputObject <- list()
      if (!is.null(self$`asset_group`)) {
        AssetGroupInputObject[["asset_group"]] <-
          self$extractSimpleType(self$`asset_group`)
      }
      return(AssetGroupInputObject)
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
    #' Deserialize JSON string into an instance of AssetGroupInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupInput
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_group`)) {
        `asset_group_object` <- AssetGroupBinding$new()
        `asset_group_object`$fromJSON(jsonlite::toJSON(this_object$`asset_group`, auto_unbox = TRUE, digits = NA))
        self$`asset_group` <- `asset_group_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssetGroupInput in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupInput
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group` <- AssetGroupBinding$new()$fromJSON(jsonlite::toJSON(this_object$`asset_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupInput and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetGroupInput
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
# AssetGroupInput$unlock()
#
## Below is an example to define the print function
# AssetGroupInput$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetGroupInput$lock()

