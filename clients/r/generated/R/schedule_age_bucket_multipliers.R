#' Create a new ScheduleAgeBucketMultipliers
#'
#' @description
#' This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
#'
#' @docType class
#' @title ScheduleAgeBucketMultipliers
#' @description ScheduleAgeBucketMultipliers Class
#' @format An \code{R6Class} generator object
#' @field AGE_BUCKET  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ScheduleAgeBucketMultipliers <- R6::R6Class(
  "ScheduleAgeBucketMultipliers",
  inherit = numeric,
  public = list(
    `AGE_BUCKET` = NULL,
    `_field_list` = c("AGE_BUCKET"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new ScheduleAgeBucketMultipliers class.
    #'
    #' @param AGE_BUCKET AGE_BUCKET
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`AGE_BUCKET` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`AGE_BUCKET`)) {
        if (!(`AGE_BUCKET` %in% c("18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"))) {
          stop(paste("Error! \"", `AGE_BUCKET`, "\" cannot be assigned to `AGE_BUCKET`. Must be \"18-24\", \"25-34\", \"35-44\", \"45-49\", \"50-54\", \"55-64\", \"65+\".", sep = ""))
        }
        if (!(is.character(`AGE_BUCKET`) && length(`AGE_BUCKET`) == 1)) {
          stop(paste("Error! Invalid data for `AGE_BUCKET`. Must be a string:", `AGE_BUCKET`))
        }
        self$`AGE_BUCKET` <- `AGE_BUCKET`
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
    #' @return ScheduleAgeBucketMultipliers as a base R list.
    #' @examples
    #' # convert array of ScheduleAgeBucketMultipliers (x) to a data frame
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
    #' Convert ScheduleAgeBucketMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ScheduleAgeBucketMultipliersObject <- list()
      if (!is.null(self$`AGE_BUCKET`)) {
        ScheduleAgeBucketMultipliersObject[["AGE_BUCKET"]] <-
          self$`AGE_BUCKET`
      }
      for (key in names(self$additional_properties)) {
        ScheduleAgeBucketMultipliersObject[[key]] <- self$additional_properties[[key]]
      }

      return(ScheduleAgeBucketMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleAgeBucketMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleAgeBucketMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AGE_BUCKET`)) {
        if (!is.null(this_object$`AGE_BUCKET`) && !(this_object$`AGE_BUCKET` %in% c("18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"))) {
          stop(paste("Error! \"", this_object$`AGE_BUCKET`, "\" cannot be assigned to `AGE_BUCKET`. Must be \"18-24\", \"25-34\", \"35-44\", \"45-49\", \"50-54\", \"55-64\", \"65+\".", sep = ""))
        }
        self$`AGE_BUCKET` <- this_object$`AGE_BUCKET`
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
    #' @return ScheduleAgeBucketMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ScheduleAgeBucketMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScheduleAgeBucketMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AGE_BUCKET`) && !(this_object$`AGE_BUCKET` %in% c("18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"))) {
        stop(paste("Error! \"", this_object$`AGE_BUCKET`, "\" cannot be assigned to `AGE_BUCKET`. Must be \"18-24\", \"25-34\", \"35-44\", \"45-49\", \"50-54\", \"55-64\", \"65+\".", sep = ""))
      }
      self$`AGE_BUCKET` <- this_object$`AGE_BUCKET`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to ScheduleAgeBucketMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ScheduleAgeBucketMultipliers
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
# ScheduleAgeBucketMultipliers$unlock()
#
## Below is an example to define the print function
# ScheduleAgeBucketMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ScheduleAgeBucketMultipliers$lock()

