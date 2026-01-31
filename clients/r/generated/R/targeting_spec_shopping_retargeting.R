#' Create a new TargetingSpecShoppingRetargeting
#'
#' @description
#' TargetingSpecShoppingRetargeting Class
#'
#' @docType class
#' @title TargetingSpecShoppingRetargeting
#' @description TargetingSpecShoppingRetargeting Class
#' @format An \code{R6Class} generator object
#' @field exclusion_window Number of days ago to stop lookback timeframe for dynamic retargeting integer [optional]
#' @field lookback_window Number of days ago to start lookback timeframe for dynamic retargeting integer [optional]
#' @field tag_types Event types to target for dynamic retargeting list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingSpecShoppingRetargeting <- R6::R6Class(
  "TargetingSpecShoppingRetargeting",
  public = list(
    `exclusion_window` = NULL,
    `lookback_window` = NULL,
    `tag_types` = NULL,

    #' @description
    #' Initialize a new TargetingSpecShoppingRetargeting class.
    #'
    #' @param exclusion_window Number of days ago to stop lookback timeframe for dynamic retargeting
    #' @param lookback_window Number of days ago to start lookback timeframe for dynamic retargeting
    #' @param tag_types Event types to target for dynamic retargeting
    #' @param ... Other optional arguments.
    initialize = function(`exclusion_window` = NULL, `lookback_window` = NULL, `tag_types` = NULL, ...) {
      if (!is.null(`exclusion_window`)) {
        if (!(is.numeric(`exclusion_window`) && length(`exclusion_window`) == 1)) {
          stop(paste("Error! Invalid data for `exclusion_window`. Must be an integer:", `exclusion_window`))
        }
        self$`exclusion_window` <- `exclusion_window`
      }
      if (!is.null(`lookback_window`)) {
        if (!(is.numeric(`lookback_window`) && length(`lookback_window`) == 1)) {
          stop(paste("Error! Invalid data for `lookback_window`. Must be an integer:", `lookback_window`))
        }
        self$`lookback_window` <- `lookback_window`
      }
      if (!is.null(`tag_types`)) {
        stopifnot(is.vector(`tag_types`), length(`tag_types`) != 0)
        sapply(`tag_types`, function(x) stopifnot(is.character(x)))
        self$`tag_types` <- `tag_types`
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
    #' @return TargetingSpecShoppingRetargeting as a base R list.
    #' @examples
    #' # convert array of TargetingSpecShoppingRetargeting (x) to a data frame
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
    #' Convert TargetingSpecShoppingRetargeting to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TargetingSpecShoppingRetargetingObject <- list()
      if (!is.null(self$`exclusion_window`)) {
        TargetingSpecShoppingRetargetingObject[["exclusion_window"]] <-
          self$`exclusion_window`
      }
      if (!is.null(self$`lookback_window`)) {
        TargetingSpecShoppingRetargetingObject[["lookback_window"]] <-
          self$`lookback_window`
      }
      if (!is.null(self$`tag_types`)) {
        TargetingSpecShoppingRetargetingObject[["tag_types"]] <-
          self$`tag_types`
      }
      return(TargetingSpecShoppingRetargetingObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecShoppingRetargeting
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecShoppingRetargeting
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`exclusion_window`)) {
        self$`exclusion_window` <- this_object$`exclusion_window`
      }
      if (!is.null(this_object$`lookback_window`)) {
        self$`lookback_window` <- this_object$`lookback_window`
      }
      if (!is.null(this_object$`tag_types`)) {
        self$`tag_types` <- ApiClient$new()$deserializeObj(this_object$`tag_types`, "array[integer]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingSpecShoppingRetargeting in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecShoppingRetargeting
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecShoppingRetargeting
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`exclusion_window` <- this_object$`exclusion_window`
      self$`lookback_window` <- this_object$`lookback_window`
      self$`tag_types` <- ApiClient$new()$deserializeObj(this_object$`tag_types`, "array[integer]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingSpecShoppingRetargeting and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingSpecShoppingRetargeting
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
# TargetingSpecShoppingRetargeting$unlock()
#
## Below is an example to define the print function
# TargetingSpecShoppingRetargeting$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingSpecShoppingRetargeting$lock()

