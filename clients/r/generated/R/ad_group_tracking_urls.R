#' Create a new AdGroupTrackingURLs
#'
#' @description
#'   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
#'
#' @docType class
#' @title AdGroupTrackingURLs
#' @description AdGroupTrackingURLs Class
#' @format An \code{R6Class} generator object
#' @field audience_verification  list(character) [optional]
#' @field buyable_button  list(character) [optional]
#' @field click  list(character) [optional]
#' @field engagement  list(character) [optional]
#' @field impression  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupTrackingURLs <- R6::R6Class(
  "AdGroupTrackingURLs",
  public = list(
    `audience_verification` = NULL,
    `buyable_button` = NULL,
    `click` = NULL,
    `engagement` = NULL,
    `impression` = NULL,

    #' @description
    #' Initialize a new AdGroupTrackingURLs class.
    #'
    #' @param audience_verification audience_verification
    #' @param buyable_button buyable_button
    #' @param click click
    #' @param engagement engagement
    #' @param impression impression
    #' @param ... Other optional arguments.
    initialize = function(`audience_verification` = NULL, `buyable_button` = NULL, `click` = NULL, `engagement` = NULL, `impression` = NULL, ...) {
      if (!is.null(`audience_verification`)) {
        stopifnot(is.vector(`audience_verification`), length(`audience_verification`) != 0)
        sapply(`audience_verification`, function(x) stopifnot(is.character(x)))
        self$`audience_verification` <- `audience_verification`
      }
      if (!is.null(`buyable_button`)) {
        stopifnot(is.vector(`buyable_button`), length(`buyable_button`) != 0)
        sapply(`buyable_button`, function(x) stopifnot(is.character(x)))
        self$`buyable_button` <- `buyable_button`
      }
      if (!is.null(`click`)) {
        stopifnot(is.vector(`click`), length(`click`) != 0)
        sapply(`click`, function(x) stopifnot(is.character(x)))
        self$`click` <- `click`
      }
      if (!is.null(`engagement`)) {
        stopifnot(is.vector(`engagement`), length(`engagement`) != 0)
        sapply(`engagement`, function(x) stopifnot(is.character(x)))
        self$`engagement` <- `engagement`
      }
      if (!is.null(`impression`)) {
        stopifnot(is.vector(`impression`), length(`impression`) != 0)
        sapply(`impression`, function(x) stopifnot(is.character(x)))
        self$`impression` <- `impression`
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
    #' @return AdGroupTrackingURLs as a base R list.
    #' @examples
    #' # convert array of AdGroupTrackingURLs (x) to a data frame
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
    #' Convert AdGroupTrackingURLs to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupTrackingURLsObject <- list()
      if (!is.null(self$`audience_verification`)) {
        AdGroupTrackingURLsObject[["audience_verification"]] <-
          self$`audience_verification`
      }
      if (!is.null(self$`buyable_button`)) {
        AdGroupTrackingURLsObject[["buyable_button"]] <-
          self$`buyable_button`
      }
      if (!is.null(self$`click`)) {
        AdGroupTrackingURLsObject[["click"]] <-
          self$`click`
      }
      if (!is.null(self$`engagement`)) {
        AdGroupTrackingURLsObject[["engagement"]] <-
          self$`engagement`
      }
      if (!is.null(self$`impression`)) {
        AdGroupTrackingURLsObject[["impression"]] <-
          self$`impression`
      }
      return(AdGroupTrackingURLsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupTrackingURLs
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupTrackingURLs
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_verification`)) {
        self$`audience_verification` <- ApiClient$new()$deserializeObj(this_object$`audience_verification`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`buyable_button`)) {
        self$`buyable_button` <- ApiClient$new()$deserializeObj(this_object$`buyable_button`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`click`)) {
        self$`click` <- ApiClient$new()$deserializeObj(this_object$`click`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`engagement`)) {
        self$`engagement` <- ApiClient$new()$deserializeObj(this_object$`engagement`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`impression`)) {
        self$`impression` <- ApiClient$new()$deserializeObj(this_object$`impression`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupTrackingURLs in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupTrackingURLs
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupTrackingURLs
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_verification` <- ApiClient$new()$deserializeObj(this_object$`audience_verification`, "array[character]", loadNamespace("openapi"))
      self$`buyable_button` <- ApiClient$new()$deserializeObj(this_object$`buyable_button`, "array[character]", loadNamespace("openapi"))
      self$`click` <- ApiClient$new()$deserializeObj(this_object$`click`, "array[character]", loadNamespace("openapi"))
      self$`engagement` <- ApiClient$new()$deserializeObj(this_object$`engagement`, "array[character]", loadNamespace("openapi"))
      self$`impression` <- ApiClient$new()$deserializeObj(this_object$`impression`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupTrackingURLs and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupTrackingURLs
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
# AdGroupTrackingURLs$unlock()
#
## Below is an example to define the print function
# AdGroupTrackingURLs$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupTrackingURLs$lock()

