#' Create a new TrendingKeywordDemographics
#'
#' @description
#' A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
#'
#' @docType class
#' @title TrendingKeywordDemographics
#' @description TrendingKeywordDemographics Class
#' @format An \code{R6Class} generator object
#' @field age_distribution  \link{TrendsAgeDistribution} [optional]
#' @field gender_distribution  \link{TrendsGenderDistribution} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeywordDemographics <- R6::R6Class(
  "TrendingKeywordDemographics",
  public = list(
    `age_distribution` = NULL,
    `gender_distribution` = NULL,

    #' @description
    #' Initialize a new TrendingKeywordDemographics class.
    #'
    #' @param age_distribution age_distribution
    #' @param gender_distribution gender_distribution
    #' @param ... Other optional arguments.
    initialize = function(`age_distribution` = NULL, `gender_distribution` = NULL, ...) {
      if (!is.null(`age_distribution`)) {
        stopifnot(R6::is.R6(`age_distribution`))
        self$`age_distribution` <- `age_distribution`
      }
      if (!is.null(`gender_distribution`)) {
        stopifnot(R6::is.R6(`gender_distribution`))
        self$`gender_distribution` <- `gender_distribution`
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
    #' @return TrendingKeywordDemographics as a base R list.
    #' @examples
    #' # convert array of TrendingKeywordDemographics (x) to a data frame
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
    #' Convert TrendingKeywordDemographics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingKeywordDemographicsObject <- list()
      if (!is.null(self$`age_distribution`)) {
        TrendingKeywordDemographicsObject[["age_distribution"]] <-
          self$extractSimpleType(self$`age_distribution`)
      }
      if (!is.null(self$`gender_distribution`)) {
        TrendingKeywordDemographicsObject[["gender_distribution"]] <-
          self$extractSimpleType(self$`gender_distribution`)
      }
      return(TrendingKeywordDemographicsObject)
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
    #' Deserialize JSON string into an instance of TrendingKeywordDemographics
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordDemographics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`age_distribution`)) {
        `age_distribution_object` <- TrendsAgeDistribution$new()
        `age_distribution_object`$fromJSON(jsonlite::toJSON(this_object$`age_distribution`, auto_unbox = TRUE, digits = NA))
        self$`age_distribution` <- `age_distribution_object`
      }
      if (!is.null(this_object$`gender_distribution`)) {
        `gender_distribution_object` <- TrendsGenderDistribution$new()
        `gender_distribution_object`$fromJSON(jsonlite::toJSON(this_object$`gender_distribution`, auto_unbox = TRUE, digits = NA))
        self$`gender_distribution` <- `gender_distribution_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TrendingKeywordDemographics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordDemographics
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordDemographics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`age_distribution` <- TrendsAgeDistribution$new()$fromJSON(jsonlite::toJSON(this_object$`age_distribution`, auto_unbox = TRUE, digits = NA))
      self$`gender_distribution` <- TrendsGenderDistribution$new()$fromJSON(jsonlite::toJSON(this_object$`gender_distribution`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingKeywordDemographics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingKeywordDemographics
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
# TrendingKeywordDemographics$unlock()
#
## Below is an example to define the print function
# TrendingKeywordDemographics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeywordDemographics$lock()

