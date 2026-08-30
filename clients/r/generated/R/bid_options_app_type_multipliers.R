#' Create a new BidOptionsAppTypeMultipliers
#'
#' @description
#' This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
#'
#' @docType class
#' @title BidOptionsAppTypeMultipliers
#' @description BidOptionsAppTypeMultipliers Class
#' @format An \code{R6Class} generator object
#' @field android_mobile  numeric [optional]
#' @field android_tablet  numeric [optional]
#' @field ipad  numeric [optional]
#' @field iphone  numeric [optional]
#' @field web  numeric [optional]
#' @field web_mobile  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidOptionsAppTypeMultipliers <- R6::R6Class(
  "BidOptionsAppTypeMultipliers",
  public = list(
    `android_mobile` = NULL,
    `android_tablet` = NULL,
    `ipad` = NULL,
    `iphone` = NULL,
    `web` = NULL,
    `web_mobile` = NULL,

    #' @description
    #' Initialize a new BidOptionsAppTypeMultipliers class.
    #'
    #' @param android_mobile android_mobile
    #' @param android_tablet android_tablet
    #' @param ipad ipad
    #' @param iphone iphone
    #' @param web web
    #' @param web_mobile web_mobile
    #' @param ... Other optional arguments.
    initialize = function(`android_mobile` = NULL, `android_tablet` = NULL, `ipad` = NULL, `iphone` = NULL, `web` = NULL, `web_mobile` = NULL, ...) {
      if (!is.null(`android_mobile`)) {
        self$`android_mobile` <- `android_mobile`
      }
      if (!is.null(`android_tablet`)) {
        self$`android_tablet` <- `android_tablet`
      }
      if (!is.null(`ipad`)) {
        self$`ipad` <- `ipad`
      }
      if (!is.null(`iphone`)) {
        self$`iphone` <- `iphone`
      }
      if (!is.null(`web`)) {
        self$`web` <- `web`
      }
      if (!is.null(`web_mobile`)) {
        self$`web_mobile` <- `web_mobile`
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
    #' @return BidOptionsAppTypeMultipliers as a base R list.
    #' @examples
    #' # convert array of BidOptionsAppTypeMultipliers (x) to a data frame
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
    #' Convert BidOptionsAppTypeMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BidOptionsAppTypeMultipliersObject <- list()
      if (!is.null(self$`android_mobile`)) {
        BidOptionsAppTypeMultipliersObject[["android_mobile"]] <-
          self$`android_mobile`
      }
      if (!is.null(self$`android_tablet`)) {
        BidOptionsAppTypeMultipliersObject[["android_tablet"]] <-
          self$`android_tablet`
      }
      if (!is.null(self$`ipad`)) {
        BidOptionsAppTypeMultipliersObject[["ipad"]] <-
          self$`ipad`
      }
      if (!is.null(self$`iphone`)) {
        BidOptionsAppTypeMultipliersObject[["iphone"]] <-
          self$`iphone`
      }
      if (!is.null(self$`web`)) {
        BidOptionsAppTypeMultipliersObject[["web"]] <-
          self$`web`
      }
      if (!is.null(self$`web_mobile`)) {
        BidOptionsAppTypeMultipliersObject[["web_mobile"]] <-
          self$`web_mobile`
      }
      return(BidOptionsAppTypeMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsAppTypeMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsAppTypeMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`android_mobile`)) {
        self$`android_mobile` <- this_object$`android_mobile`
      }
      if (!is.null(this_object$`android_tablet`)) {
        self$`android_tablet` <- this_object$`android_tablet`
      }
      if (!is.null(this_object$`ipad`)) {
        self$`ipad` <- this_object$`ipad`
      }
      if (!is.null(this_object$`iphone`)) {
        self$`iphone` <- this_object$`iphone`
      }
      if (!is.null(this_object$`web`)) {
        self$`web` <- this_object$`web`
      }
      if (!is.null(this_object$`web_mobile`)) {
        self$`web_mobile` <- this_object$`web_mobile`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BidOptionsAppTypeMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsAppTypeMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsAppTypeMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`android_mobile` <- this_object$`android_mobile`
      self$`android_tablet` <- this_object$`android_tablet`
      self$`ipad` <- this_object$`ipad`
      self$`iphone` <- this_object$`iphone`
      self$`web` <- this_object$`web`
      self$`web_mobile` <- this_object$`web_mobile`
      self
    },

    #' @description
    #' Validate JSON input with respect to BidOptionsAppTypeMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidOptionsAppTypeMultipliers
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
# BidOptionsAppTypeMultipliers$unlock()
#
## Below is an example to define the print function
# BidOptionsAppTypeMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidOptionsAppTypeMultipliers$lock()

