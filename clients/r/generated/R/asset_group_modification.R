#' Create a new AssetGroupModification
#'
#' @description
#' AssetGroupModification Class
#'
#' @docType class
#' @title AssetGroupModification
#' @description AssetGroupModification Class
#' @format An \code{R6Class} generator object
#' @field exceptions A list of errors associated with the asset groups. Will be returned if there is an error. list(\link{AssetGroupUpdateError}) [optional]
#' @field updated_asset_groups A list of successfully edited asset groups. list(\link{AssetGroupBinding}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupModification <- R6::R6Class(
  "AssetGroupModification",
  public = list(
    `exceptions` = NULL,
    `updated_asset_groups` = NULL,

    #' @description
    #' Initialize a new AssetGroupModification class.
    #'
    #' @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
    #' @param updated_asset_groups A list of successfully edited asset groups.
    #' @param ... Other optional arguments.
    initialize = function(`exceptions` = NULL, `updated_asset_groups` = NULL, ...) {
      if (!is.null(`exceptions`)) {
        stopifnot(is.vector(`exceptions`), length(`exceptions`) != 0)
        sapply(`exceptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`exceptions` <- `exceptions`
      }
      if (!is.null(`updated_asset_groups`)) {
        stopifnot(is.vector(`updated_asset_groups`), length(`updated_asset_groups`) != 0)
        sapply(`updated_asset_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`updated_asset_groups` <- `updated_asset_groups`
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
    #' @return AssetGroupModification as a base R list.
    #' @examples
    #' # convert array of AssetGroupModification (x) to a data frame
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
    #' Convert AssetGroupModification to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetGroupModificationObject <- list()
      if (!is.null(self$`exceptions`)) {
        AssetGroupModificationObject[["exceptions"]] <-
          self$extractSimpleType(self$`exceptions`)
      }
      if (!is.null(self$`updated_asset_groups`)) {
        AssetGroupModificationObject[["updated_asset_groups"]] <-
          self$extractSimpleType(self$`updated_asset_groups`)
      }
      return(AssetGroupModificationObject)
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
    #' Deserialize JSON string into an instance of AssetGroupModification
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupModification
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[AssetGroupUpdateError]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`updated_asset_groups`)) {
        self$`updated_asset_groups` <- ApiClient$new()$deserializeObj(this_object$`updated_asset_groups`, "array[AssetGroupBinding]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssetGroupModification in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupModification
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupModification
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[AssetGroupUpdateError]", loadNamespace("openapi"))
      self$`updated_asset_groups` <- ApiClient$new()$deserializeObj(this_object$`updated_asset_groups`, "array[AssetGroupBinding]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupModification and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetGroupModification
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
# AssetGroupModification$unlock()
#
## Below is an example to define the print function
# AssetGroupModification$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetGroupModification$lock()

