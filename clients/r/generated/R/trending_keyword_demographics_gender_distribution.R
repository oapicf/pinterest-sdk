#' Create a new TrendingKeywordDemographicsGenderDistribution
#'
#' @description
#' This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
#'
#' @docType class
#' @title TrendingKeywordDemographicsGenderDistribution
#' @description TrendingKeywordDemographicsGenderDistribution Class
#' @format An \code{R6Class} generator object
#' @field gender_distribution  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeywordDemographicsGenderDistribution <- R6::R6Class(
  "TrendingKeywordDemographicsGenderDistribution",
  inherit = numeric,
  public = list(
    `gender_distribution` = NULL,
    `_field_list` = c("gender_distribution"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new TrendingKeywordDemographicsGenderDistribution class.
    #'
    #' @param gender_distribution gender_distribution
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`gender_distribution` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`gender_distribution`)) {
        if (!(`gender_distribution` %in% c("male", "female", "unspecified"))) {
          stop(paste("Error! \"", `gender_distribution`, "\" cannot be assigned to `gender_distribution`. Must be \"male\", \"female\", \"unspecified\".", sep = ""))
        }
        if (!(is.character(`gender_distribution`) && length(`gender_distribution`) == 1)) {
          stop(paste("Error! Invalid data for `gender_distribution`. Must be a string:", `gender_distribution`))
        }
        self$`gender_distribution` <- `gender_distribution`
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
    #' @return TrendingKeywordDemographicsGenderDistribution as a base R list.
    #' @examples
    #' # convert array of TrendingKeywordDemographicsGenderDistribution (x) to a data frame
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
    #' Convert TrendingKeywordDemographicsGenderDistribution to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingKeywordDemographicsGenderDistributionObject <- list()
      if (!is.null(self$`gender_distribution`)) {
        TrendingKeywordDemographicsGenderDistributionObject[["gender_distribution"]] <-
          self$`gender_distribution`
      }
      for (key in names(self$additional_properties)) {
        TrendingKeywordDemographicsGenderDistributionObject[[key]] <- self$additional_properties[[key]]
      }

      return(TrendingKeywordDemographicsGenderDistributionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordDemographicsGenderDistribution
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordDemographicsGenderDistribution
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`gender_distribution`)) {
        if (!is.null(this_object$`gender_distribution`) && !(this_object$`gender_distribution` %in% c("male", "female", "unspecified"))) {
          stop(paste("Error! \"", this_object$`gender_distribution`, "\" cannot be assigned to `gender_distribution`. Must be \"male\", \"female\", \"unspecified\".", sep = ""))
        }
        self$`gender_distribution` <- this_object$`gender_distribution`
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
    #' @return TrendingKeywordDemographicsGenderDistribution in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordDemographicsGenderDistribution
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordDemographicsGenderDistribution
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`gender_distribution`) && !(this_object$`gender_distribution` %in% c("male", "female", "unspecified"))) {
        stop(paste("Error! \"", this_object$`gender_distribution`, "\" cannot be assigned to `gender_distribution`. Must be \"male\", \"female\", \"unspecified\".", sep = ""))
      }
      self$`gender_distribution` <- this_object$`gender_distribution`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingKeywordDemographicsGenderDistribution and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingKeywordDemographicsGenderDistribution
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
# TrendingKeywordDemographicsGenderDistribution$unlock()
#
## Below is an example to define the print function
# TrendingKeywordDemographicsGenderDistribution$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeywordDemographicsGenderDistribution$lock()

