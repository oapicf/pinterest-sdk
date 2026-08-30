#' Create a new LabeledEntities
#'
#' @description
#' LabeledEntities Class
#'
#' @docType class
#' @title LabeledEntities
#' @description LabeledEntities Class
#' @format An \code{R6Class} generator object
#' @field entities_labels  list(\link{EntityLabel}) [optional]
#' @field errors Labels that were not successfully applied. list(\link{EntityLabelError}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabeledEntities <- R6::R6Class(
  "LabeledEntities",
  public = list(
    `entities_labels` = NULL,
    `errors` = NULL,

    #' @description
    #' Initialize a new LabeledEntities class.
    #'
    #' @param entities_labels entities_labels
    #' @param errors Labels that were not successfully applied.
    #' @param ... Other optional arguments.
    initialize = function(`entities_labels` = NULL, `errors` = NULL, ...) {
      if (!is.null(`entities_labels`)) {
        stopifnot(is.vector(`entities_labels`), length(`entities_labels`) != 0)
        sapply(`entities_labels`, function(x) stopifnot(R6::is.R6(x)))
        self$`entities_labels` <- `entities_labels`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
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
    #' @return LabeledEntities as a base R list.
    #' @examples
    #' # convert array of LabeledEntities (x) to a data frame
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
    #' Convert LabeledEntities to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabeledEntitiesObject <- list()
      if (!is.null(self$`entities_labels`)) {
        LabeledEntitiesObject[["entities_labels"]] <-
          self$extractSimpleType(self$`entities_labels`)
      }
      if (!is.null(self$`errors`)) {
        LabeledEntitiesObject[["errors"]] <-
          self$extractSimpleType(self$`errors`)
      }
      return(LabeledEntitiesObject)
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
    #' Deserialize JSON string into an instance of LabeledEntities
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabeledEntities
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entities_labels`)) {
        self$`entities_labels` <- ApiClient$new()$deserializeObj(this_object$`entities_labels`, "array[EntityLabel]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[EntityLabelError]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LabeledEntities in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabeledEntities
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabeledEntities
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entities_labels` <- ApiClient$new()$deserializeObj(this_object$`entities_labels`, "array[EntityLabel]", loadNamespace("openapi"))
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[EntityLabelError]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LabeledEntities and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabeledEntities
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
# LabeledEntities$unlock()
#
## Below is an example to define the print function
# LabeledEntities$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabeledEntities$lock()

