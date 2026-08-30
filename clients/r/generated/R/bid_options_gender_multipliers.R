#' Create a new BidOptionsGenderMultipliers
#'
#' @description
#' This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
#'
#' @docType class
#' @title BidOptionsGenderMultipliers
#' @description BidOptionsGenderMultipliers Class
#' @format An \code{R6Class} generator object
#' @field female  numeric [optional]
#' @field male  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidOptionsGenderMultipliers <- R6::R6Class(
  "BidOptionsGenderMultipliers",
  public = list(
    `female` = NULL,
    `male` = NULL,

    #' @description
    #' Initialize a new BidOptionsGenderMultipliers class.
    #'
    #' @param female female
    #' @param male male
    #' @param ... Other optional arguments.
    initialize = function(`female` = NULL, `male` = NULL, ...) {
      if (!is.null(`female`)) {
        self$`female` <- `female`
      }
      if (!is.null(`male`)) {
        self$`male` <- `male`
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
    #' @return BidOptionsGenderMultipliers as a base R list.
    #' @examples
    #' # convert array of BidOptionsGenderMultipliers (x) to a data frame
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
    #' Convert BidOptionsGenderMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BidOptionsGenderMultipliersObject <- list()
      if (!is.null(self$`female`)) {
        BidOptionsGenderMultipliersObject[["female"]] <-
          self$`female`
      }
      if (!is.null(self$`male`)) {
        BidOptionsGenderMultipliersObject[["male"]] <-
          self$`male`
      }
      return(BidOptionsGenderMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsGenderMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsGenderMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`female`)) {
        self$`female` <- this_object$`female`
      }
      if (!is.null(this_object$`male`)) {
        self$`male` <- this_object$`male`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BidOptionsGenderMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsGenderMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsGenderMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`female` <- this_object$`female`
      self$`male` <- this_object$`male`
      self
    },

    #' @description
    #' Validate JSON input with respect to BidOptionsGenderMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidOptionsGenderMultipliers
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
# BidOptionsGenderMultipliers$unlock()
#
## Below is an example to define the print function
# BidOptionsGenderMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidOptionsGenderMultipliers$lock()

