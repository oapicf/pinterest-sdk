#' Create a new AdgroupTrackingFeatures
#'
#' @description
#' AdgroupTrackingFeatures Class
#'
#' @docType class
#' @title AdgroupTrackingFeatures
#' @description AdgroupTrackingFeatures Class
#' @format An \code{R6Class} generator object
#' @field enabled Tracking features. To clear this field, set to null. list(\link{AdgroupTrackingFeatureType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdgroupTrackingFeatures <- R6::R6Class(
  "AdgroupTrackingFeatures",
  public = list(
    `enabled` = NULL,

    #' @description
    #' Initialize a new AdgroupTrackingFeatures class.
    #'
    #' @param enabled Tracking features. To clear this field, set to null.
    #' @param ... Other optional arguments.
    initialize = function(`enabled` = NULL, ...) {
      if (!is.null(`enabled`)) {
        stopifnot(is.vector(`enabled`), length(`enabled`) != 0)
        sapply(`enabled`, function(x) stopifnot(R6::is.R6(x)))
        self$`enabled` <- `enabled`
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
    #' @return AdgroupTrackingFeatures as a base R list.
    #' @examples
    #' # convert array of AdgroupTrackingFeatures (x) to a data frame
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
    #' Convert AdgroupTrackingFeatures to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdgroupTrackingFeaturesObject <- list()
      if (!is.null(self$`enabled`)) {
        AdgroupTrackingFeaturesObject[["enabled"]] <-
          self$extractSimpleType(self$`enabled`)
      }
      return(AdgroupTrackingFeaturesObject)
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
    #' Deserialize JSON string into an instance of AdgroupTrackingFeatures
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdgroupTrackingFeatures
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`enabled`)) {
        self$`enabled` <- ApiClient$new()$deserializeObj(this_object$`enabled`, "array[AdgroupTrackingFeatureType]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdgroupTrackingFeatures in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdgroupTrackingFeatures
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdgroupTrackingFeatures
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`enabled` <- ApiClient$new()$deserializeObj(this_object$`enabled`, "array[AdgroupTrackingFeatureType]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdgroupTrackingFeatures and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdgroupTrackingFeatures
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
# AdgroupTrackingFeatures$unlock()
#
## Below is an example to define the print function
# AdgroupTrackingFeatures$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdgroupTrackingFeatures$lock()

