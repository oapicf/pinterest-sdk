#' Create a new TrendingKeywordDemographicsAgeDistribution
#'
#' @description
#' This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
#'
#' @docType class
#' @title TrendingKeywordDemographicsAgeDistribution
#' @description TrendingKeywordDemographicsAgeDistribution Class
#' @format An \code{R6Class} generator object
#' @field age_distribution  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeywordDemographicsAgeDistribution <- R6::R6Class(
  "TrendingKeywordDemographicsAgeDistribution",
  inherit = numeric,
  public = list(
    `age_distribution` = NULL,
    `_field_list` = c("age_distribution"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new TrendingKeywordDemographicsAgeDistribution class.
    #'
    #' @param age_distribution age_distribution
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`age_distribution` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`age_distribution`)) {
        if (!(`age_distribution` %in% c("18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"))) {
          stop(paste("Error! \"", `age_distribution`, "\" cannot be assigned to `age_distribution`. Must be \"18-24\", \"25-34\", \"35-44\", \"45-49\", \"50-54\", \"55-64\", \"65+\".", sep = ""))
        }
        if (!(is.character(`age_distribution`) && length(`age_distribution`) == 1)) {
          stop(paste("Error! Invalid data for `age_distribution`. Must be a string:", `age_distribution`))
        }
        self$`age_distribution` <- `age_distribution`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
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
    #' @return TrendingKeywordDemographicsAgeDistribution as a base R list.
    #' @examples
    #' # convert array of TrendingKeywordDemographicsAgeDistribution (x) to a data frame
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
    #' Convert TrendingKeywordDemographicsAgeDistribution to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingKeywordDemographicsAgeDistributionObject <- list()
      if (!is.null(self$`age_distribution`)) {
        TrendingKeywordDemographicsAgeDistributionObject[["age_distribution"]] <-
          self$`age_distribution`
      }
      for (key in names(self$additional_properties)) {
        TrendingKeywordDemographicsAgeDistributionObject[[key]] <- self$additional_properties[[key]]
      }

      return(TrendingKeywordDemographicsAgeDistributionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordDemographicsAgeDistribution
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordDemographicsAgeDistribution
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`age_distribution`)) {
        if (!is.null(this_object$`age_distribution`) && !(this_object$`age_distribution` %in% c("18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"))) {
          stop(paste("Error! \"", this_object$`age_distribution`, "\" cannot be assigned to `age_distribution`. Must be \"18-24\", \"25-34\", \"35-44\", \"45-49\", \"50-54\", \"55-64\", \"65+\".", sep = ""))
        }
        self$`age_distribution` <- this_object$`age_distribution`
      }
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TrendingKeywordDemographicsAgeDistribution in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordDemographicsAgeDistribution
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordDemographicsAgeDistribution
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`age_distribution`) && !(this_object$`age_distribution` %in% c("18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"))) {
        stop(paste("Error! \"", this_object$`age_distribution`, "\" cannot be assigned to `age_distribution`. Must be \"18-24\", \"25-34\", \"35-44\", \"45-49\", \"50-54\", \"55-64\", \"65+\".", sep = ""))
      }
      self$`age_distribution` <- this_object$`age_distribution`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingKeywordDemographicsAgeDistribution and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingKeywordDemographicsAgeDistribution
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
# TrendingKeywordDemographicsAgeDistribution$unlock()
#
## Below is an example to define the print function
# TrendingKeywordDemographicsAgeDistribution$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeywordDemographicsAgeDistribution$lock()

