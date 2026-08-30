#' Create a new FrequencyMultipliers
#'
#' @description
#' This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
#'
#' @docType class
#' @title FrequencyMultipliers
#' @description FrequencyMultipliers Class
#' @format An \code{R6Class} generator object
#' @field IMPRESSION_COUNT Impression count identifier. character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FrequencyMultipliers <- R6::R6Class(
  "FrequencyMultipliers",
  inherit = numeric,
  public = list(
    `IMPRESSION_COUNT` = NULL,
    `_field_list` = c("IMPRESSION_COUNT"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new FrequencyMultipliers class.
    #'
    #' @param IMPRESSION_COUNT Impression count identifier.
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`IMPRESSION_COUNT` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`IMPRESSION_COUNT`)) {
        if (!(is.character(`IMPRESSION_COUNT`) && length(`IMPRESSION_COUNT`) == 1)) {
          stop(paste("Error! Invalid data for `IMPRESSION_COUNT`. Must be a string:", `IMPRESSION_COUNT`))
        }
        self$`IMPRESSION_COUNT` <- `IMPRESSION_COUNT`
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
    #' @return FrequencyMultipliers as a base R list.
    #' @examples
    #' # convert array of FrequencyMultipliers (x) to a data frame
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
    #' Convert FrequencyMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FrequencyMultipliersObject <- list()
      if (!is.null(self$`IMPRESSION_COUNT`)) {
        FrequencyMultipliersObject[["IMPRESSION_COUNT"]] <-
          self$`IMPRESSION_COUNT`
      }
      for (key in names(self$additional_properties)) {
        FrequencyMultipliersObject[[key]] <- self$additional_properties[[key]]
      }

      return(FrequencyMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FrequencyMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of FrequencyMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`IMPRESSION_COUNT`)) {
        self$`IMPRESSION_COUNT` <- this_object$`IMPRESSION_COUNT`
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
    #' @return FrequencyMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FrequencyMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of FrequencyMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`IMPRESSION_COUNT` <- this_object$`IMPRESSION_COUNT`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to FrequencyMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FrequencyMultipliers
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
# FrequencyMultipliers$unlock()
#
## Below is an example to define the print function
# FrequencyMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FrequencyMultipliers$lock()

