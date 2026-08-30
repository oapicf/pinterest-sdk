#' Create a new BidOptionsAgeBucketMultipliers
#'
#' @description
#' This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
#'
#' @docType class
#' @title BidOptionsAgeBucketMultipliers
#' @description BidOptionsAgeBucketMultipliers Class
#' @format An \code{R6Class} generator object
#' @field 18-24  numeric [optional]
#' @field 25-34  numeric [optional]
#' @field 35-44  numeric [optional]
#' @field 45-49  numeric [optional]
#' @field 50-54  numeric [optional]
#' @field 55-64  numeric [optional]
#' @field 65+  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidOptionsAgeBucketMultipliers <- R6::R6Class(
  "BidOptionsAgeBucketMultipliers",
  public = list(
    `18-24` = NULL,
    `25-34` = NULL,
    `35-44` = NULL,
    `45-49` = NULL,
    `50-54` = NULL,
    `55-64` = NULL,
    `65+` = NULL,

    #' @description
    #' Initialize a new BidOptionsAgeBucketMultipliers class.
    #'
    #' @param 18-24 18-24
    #' @param 25-34 25-34
    #' @param 35-44 35-44
    #' @param 45-49 45-49
    #' @param 50-54 50-54
    #' @param 55-64 55-64
    #' @param 65+ 65+
    #' @param ... Other optional arguments.
    initialize = function(`18-24` = NULL, `25-34` = NULL, `35-44` = NULL, `45-49` = NULL, `50-54` = NULL, `55-64` = NULL, `65+` = NULL, ...) {
      if (!is.null(`18-24`)) {
        self$`18-24` <- `18-24`
      }
      if (!is.null(`25-34`)) {
        self$`25-34` <- `25-34`
      }
      if (!is.null(`35-44`)) {
        self$`35-44` <- `35-44`
      }
      if (!is.null(`45-49`)) {
        self$`45-49` <- `45-49`
      }
      if (!is.null(`50-54`)) {
        self$`50-54` <- `50-54`
      }
      if (!is.null(`55-64`)) {
        self$`55-64` <- `55-64`
      }
      if (!is.null(`65+`)) {
        self$`65+` <- `65+`
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
    #' @return BidOptionsAgeBucketMultipliers as a base R list.
    #' @examples
    #' # convert array of BidOptionsAgeBucketMultipliers (x) to a data frame
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
    #' Convert BidOptionsAgeBucketMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BidOptionsAgeBucketMultipliersObject <- list()
      if (!is.null(self$`18-24`)) {
        BidOptionsAgeBucketMultipliersObject[["18-24"]] <-
          self$`18-24`
      }
      if (!is.null(self$`25-34`)) {
        BidOptionsAgeBucketMultipliersObject[["25-34"]] <-
          self$`25-34`
      }
      if (!is.null(self$`35-44`)) {
        BidOptionsAgeBucketMultipliersObject[["35-44"]] <-
          self$`35-44`
      }
      if (!is.null(self$`45-49`)) {
        BidOptionsAgeBucketMultipliersObject[["45-49"]] <-
          self$`45-49`
      }
      if (!is.null(self$`50-54`)) {
        BidOptionsAgeBucketMultipliersObject[["50-54"]] <-
          self$`50-54`
      }
      if (!is.null(self$`55-64`)) {
        BidOptionsAgeBucketMultipliersObject[["55-64"]] <-
          self$`55-64`
      }
      if (!is.null(self$`65+`)) {
        BidOptionsAgeBucketMultipliersObject[["65+"]] <-
          self$`65+`
      }
      return(BidOptionsAgeBucketMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsAgeBucketMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsAgeBucketMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`18-24`)) {
        self$`18-24` <- this_object$`18-24`
      }
      if (!is.null(this_object$`25-34`)) {
        self$`25-34` <- this_object$`25-34`
      }
      if (!is.null(this_object$`35-44`)) {
        self$`35-44` <- this_object$`35-44`
      }
      if (!is.null(this_object$`45-49`)) {
        self$`45-49` <- this_object$`45-49`
      }
      if (!is.null(this_object$`50-54`)) {
        self$`50-54` <- this_object$`50-54`
      }
      if (!is.null(this_object$`55-64`)) {
        self$`55-64` <- this_object$`55-64`
      }
      if (!is.null(this_object$`65+`)) {
        self$`65+` <- this_object$`65+`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BidOptionsAgeBucketMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BidOptionsAgeBucketMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidOptionsAgeBucketMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`18-24` <- this_object$`18-24`
      self$`25-34` <- this_object$`25-34`
      self$`35-44` <- this_object$`35-44`
      self$`45-49` <- this_object$`45-49`
      self$`50-54` <- this_object$`50-54`
      self$`55-64` <- this_object$`55-64`
      self$`65+` <- this_object$`65+`
      self
    },

    #' @description
    #' Validate JSON input with respect to BidOptionsAgeBucketMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidOptionsAgeBucketMultipliers
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
# BidOptionsAgeBucketMultipliers$unlock()
#
## Below is an example to define the print function
# BidOptionsAgeBucketMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidOptionsAgeBucketMultipliers$lock()

