#' Create a new AssetGroupDeletion
#'
#' @description
#' AssetGroupDeletion Class
#'
#' @docType class
#' @title AssetGroupDeletion
#' @description AssetGroupDeletion Class
#' @format An \code{R6Class} generator object
#' @field deleted_asset_groups  list(character) [optional]
#' @field exceptions  list(\link{AssetGroupDeleteError}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetGroupDeletion <- R6::R6Class(
  "AssetGroupDeletion",
  public = list(
    `deleted_asset_groups` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new AssetGroupDeletion class.
    #'
    #' @param deleted_asset_groups deleted_asset_groups
    #' @param exceptions exceptions
    #' @param ... Other optional arguments.
    initialize = function(`deleted_asset_groups` = NULL, `exceptions` = NULL, ...) {
      if (!is.null(`deleted_asset_groups`)) {
        stopifnot(is.vector(`deleted_asset_groups`), length(`deleted_asset_groups`) != 0)
        sapply(`deleted_asset_groups`, function(x) stopifnot(is.character(x)))
        self$`deleted_asset_groups` <- `deleted_asset_groups`
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
    #' @return AssetGroupDeletion as a base R list.
    #' @examples
    #' # convert array of AssetGroupDeletion (x) to a data frame
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
    #' Convert AssetGroupDeletion to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssetGroupDeletionObject <- list()
      if (!is.null(self$`deleted_asset_groups`)) {
        AssetGroupDeletionObject[["deleted_asset_groups"]] <-
          self$`deleted_asset_groups`
      }
      if (!is.null(self$`exceptions`)) {
        AssetGroupDeletionObject[["exceptions"]] <-
          self$extractSimpleType(self$`exceptions`)
      }
      return(AssetGroupDeletionObject)
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
    #' Deserialize JSON string into an instance of AssetGroupDeletion
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupDeletion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deleted_asset_groups`)) {
        self$`deleted_asset_groups` <- ApiClient$new()$deserializeObj(this_object$`deleted_asset_groups`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[AssetGroupDeleteError]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssetGroupDeletion in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssetGroupDeletion
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssetGroupDeletion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deleted_asset_groups` <- ApiClient$new()$deserializeObj(this_object$`deleted_asset_groups`, "array[character]", loadNamespace("openapi"))
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[AssetGroupDeleteError]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssetGroupDeletion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssetGroupDeletion
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
# AssetGroupDeletion$unlock()
#
## Below is an example to define the print function
# AssetGroupDeletion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssetGroupDeletion$lock()

