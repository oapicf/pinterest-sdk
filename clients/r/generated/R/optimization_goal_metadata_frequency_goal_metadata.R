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
    #' Initialize a new OptimizationGoalMetadataFrequencyGoalMetadata class.
    #'
    #' @description
    #' Initialize a new OptimizationGoalMetadataFrequencyGoalMetadata class.
    #'
    #' @param frequency frequency
    #' @param timerange User entity counts time range
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadataFrequencyGoalMetadata in JSON format
    #' @export
    toJSON = function() {
      OptimizationGoalMetadataFrequencyGoalMetadataObject <- list()
      if (!is.null(self$`frequency`)) {
        OptimizationGoalMetadataFrequencyGoalMetadataObject[["frequency"]] <-
          self$`frequency`
      }
      if (!is.null(self$`timerange`)) {
        OptimizationGoalMetadataFrequencyGoalMetadataObject[["timerange"]] <-
          self$`timerange`
      }
      OptimizationGoalMetadataFrequencyGoalMetadataObject
    },
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadataFrequencyGoalMetadata in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`frequency`)) {
          sprintf(
          '"frequency":
            %d
                    ',
          self$`frequency`
          )
        },
        if (!is.null(self$`timerange`)) {
          sprintf(
          '"timerange":
            "%s"
                    ',
          self$`timerange`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataFrequencyGoalMetadata
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`frequency` <- this_object$`frequency`
      if (!is.null(this_object$`timerange`) && !(this_object$`timerange` %in% c("THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR"))) {
        stop(paste("Error! \"", this_object$`timerange`, "\" cannot be assigned to `timerange`. Must be \"THIRTY_DAY\", \"DAY\", \"SEVEN_DAY\", \"TWENTY_MINUTE\", \"TEN_MINUTE\", \"TWENTY_FOUR_HOUR\".", sep = ""))
      }
      self$`timerange` <- this_object$`timerange`
      self
    },
    #' Validate JSON input with respect to OptimizationGoalMetadataFrequencyGoalMetadata
    #'
    #' @description
    #' Validate JSON input with respect to OptimizationGoalMetadataFrequencyGoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OptimizationGoalMetadataFrequencyGoalMetadata
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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

