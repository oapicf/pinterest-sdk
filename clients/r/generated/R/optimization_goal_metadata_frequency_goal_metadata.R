#' Create a new OptimizationGoalMetadataFrequencyGoalMetadata
#'
#' @description
#' OptimizationGoalMetadataFrequencyGoalMetadata Class
#'
#' @docType class
#' @title OptimizationGoalMetadataFrequencyGoalMetadata
#' @description OptimizationGoalMetadataFrequencyGoalMetadata Class
#' @format An \code{R6Class} generator object
#' @field frequency  integer [optional]
#' @field timerange User entity counts time range character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OptimizationGoalMetadataFrequencyGoalMetadata <- R6::R6Class(
  "OptimizationGoalMetadataFrequencyGoalMetadata",
  public = list(
    `frequency` = NULL,
    `timerange` = NULL,

    #' @description
    #' Initialize a new OptimizationGoalMetadataFrequencyGoalMetadata class.
    #'
    #' @param frequency frequency
    #' @param timerange User entity counts time range
    #' @param ... Other optional arguments.
    initialize = function(`frequency` = NULL, `timerange` = NULL, ...) {
      if (!is.null(`frequency`)) {
        if (!(is.numeric(`frequency`) && length(`frequency`) == 1)) {
          stop(paste("Error! Invalid data for `frequency`. Must be an integer:", `frequency`))
        }
        self$`frequency` <- `frequency`
      }
      if (!is.null(`timerange`)) {
        if (!(`timerange` %in% c("THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR"))) {
          stop(paste("Error! \"", `timerange`, "\" cannot be assigned to `timerange`. Must be \"THIRTY_DAY\", \"DAY\", \"SEVEN_DAY\", \"TWENTY_MINUTE\", \"TEN_MINUTE\", \"TWENTY_FOUR_HOUR\".", sep = ""))
        }
        if (!(is.character(`timerange`) && length(`timerange`) == 1)) {
          stop(paste("Error! Invalid data for `timerange`. Must be a string:", `timerange`))
        }
        self$`timerange` <- `timerange`
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
    #' @return OptimizationGoalMetadataFrequencyGoalMetadata as a base R list.
    #' @examples
    #' # convert array of OptimizationGoalMetadataFrequencyGoalMetadata (x) to a data frame
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
    #' Convert OptimizationGoalMetadataFrequencyGoalMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OptimizationGoalMetadataFrequencyGoalMetadataObject <- list()
      if (!is.null(self$`frequency`)) {
        OptimizationGoalMetadataFrequencyGoalMetadataObject[["frequency"]] <-
          self$`frequency`
      }
      if (!is.null(self$`timerange`)) {
        OptimizationGoalMetadataFrequencyGoalMetadataObject[["timerange"]] <-
          self$`timerange`
      }
      return(OptimizationGoalMetadataFrequencyGoalMetadataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataFrequencyGoalMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`frequency`)) {
        self$`frequency` <- this_object$`frequency`
      }
      if (!is.null(this_object$`timerange`)) {
        if (!is.null(this_object$`timerange`) && !(this_object$`timerange` %in% c("THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR"))) {
          stop(paste("Error! \"", this_object$`timerange`, "\" cannot be assigned to `timerange`. Must be \"THIRTY_DAY\", \"DAY\", \"SEVEN_DAY\", \"TWENTY_MINUTE\", \"TEN_MINUTE\", \"TWENTY_FOUR_HOUR\".", sep = ""))
        }
        self$`timerange` <- this_object$`timerange`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return OptimizationGoalMetadataFrequencyGoalMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataFrequencyGoalMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`frequency` <- this_object$`frequency`
      if (!is.null(this_object$`timerange`) && !(this_object$`timerange` %in% c("THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR"))) {
        stop(paste("Error! \"", this_object$`timerange`, "\" cannot be assigned to `timerange`. Must be \"THIRTY_DAY\", \"DAY\", \"SEVEN_DAY\", \"TWENTY_MINUTE\", \"TEN_MINUTE\", \"TWENTY_FOUR_HOUR\".", sep = ""))
      }
      self$`timerange` <- this_object$`timerange`
      self
    },

    #' @description
    #' Validate JSON input with respect to OptimizationGoalMetadataFrequencyGoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OptimizationGoalMetadataFrequencyGoalMetadata
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
# OptimizationGoalMetadataFrequencyGoalMetadata$unlock()
#
## Below is an example to define the print function
# OptimizationGoalMetadataFrequencyGoalMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OptimizationGoalMetadataFrequencyGoalMetadata$lock()

