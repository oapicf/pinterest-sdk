#' Create a new OptimizationGoalMetadata
#'
#' @description
#' OptimizationGoalMetadata Class
#'
#' @docType class
#' @title OptimizationGoalMetadata
#' @description OptimizationGoalMetadata Class
#' @format An \code{R6Class} generator object
#' @field conversion_tag_v3_goal_metadata  \link{OptimizationGoalMetadataConversionTagV3GoalMetadata} [optional]
#' @field frequency_goal_metadata  \link{OptimizationGoalMetadataFrequencyGoalMetadata} [optional]
#' @field scrollup_goal_metadata  \link{OptimizationGoalMetadataScrollupGoalMetadata} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OptimizationGoalMetadata <- R6::R6Class(
  "OptimizationGoalMetadata",
  public = list(
    `conversion_tag_v3_goal_metadata` = NULL,
    `frequency_goal_metadata` = NULL,
    `scrollup_goal_metadata` = NULL,

    #' @description
    #' Initialize a new OptimizationGoalMetadata class.
    #'
    #' @param conversion_tag_v3_goal_metadata conversion_tag_v3_goal_metadata
    #' @param frequency_goal_metadata frequency_goal_metadata
    #' @param scrollup_goal_metadata scrollup_goal_metadata
    #' @param ... Other optional arguments.
    initialize = function(`conversion_tag_v3_goal_metadata` = NULL, `frequency_goal_metadata` = NULL, `scrollup_goal_metadata` = NULL, ...) {
      if (!is.null(`conversion_tag_v3_goal_metadata`)) {
        stopifnot(R6::is.R6(`conversion_tag_v3_goal_metadata`))
        self$`conversion_tag_v3_goal_metadata` <- `conversion_tag_v3_goal_metadata`
      }
      if (!is.null(`frequency_goal_metadata`)) {
        stopifnot(R6::is.R6(`frequency_goal_metadata`))
        self$`frequency_goal_metadata` <- `frequency_goal_metadata`
      }
      if (!is.null(`scrollup_goal_metadata`)) {
        stopifnot(R6::is.R6(`scrollup_goal_metadata`))
        self$`scrollup_goal_metadata` <- `scrollup_goal_metadata`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadata in JSON format
    toJSON = function() {
      OptimizationGoalMetadataObject <- list()
      if (!is.null(self$`conversion_tag_v3_goal_metadata`)) {
        OptimizationGoalMetadataObject[["conversion_tag_v3_goal_metadata"]] <-
          self$`conversion_tag_v3_goal_metadata`$toJSON()
      }
      if (!is.null(self$`frequency_goal_metadata`)) {
        OptimizationGoalMetadataObject[["frequency_goal_metadata"]] <-
          self$`frequency_goal_metadata`$toJSON()
      }
      if (!is.null(self$`scrollup_goal_metadata`)) {
        OptimizationGoalMetadataObject[["scrollup_goal_metadata"]] <-
          self$`scrollup_goal_metadata`$toJSON()
      }
      OptimizationGoalMetadataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`conversion_tag_v3_goal_metadata`)) {
        `conversion_tag_v3_goal_metadata_object` <- OptimizationGoalMetadataConversionTagV3GoalMetadata$new()
        `conversion_tag_v3_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_tag_v3_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`conversion_tag_v3_goal_metadata` <- `conversion_tag_v3_goal_metadata_object`
      }
      if (!is.null(this_object$`frequency_goal_metadata`)) {
        `frequency_goal_metadata_object` <- OptimizationGoalMetadataFrequencyGoalMetadata$new()
        `frequency_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`frequency_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`frequency_goal_metadata` <- `frequency_goal_metadata_object`
      }
      if (!is.null(this_object$`scrollup_goal_metadata`)) {
        `scrollup_goal_metadata_object` <- OptimizationGoalMetadataScrollupGoalMetadata$new()
        `scrollup_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`scrollup_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`scrollup_goal_metadata` <- `scrollup_goal_metadata_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadata in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`conversion_tag_v3_goal_metadata`)) {
          sprintf(
          '"conversion_tag_v3_goal_metadata":
          %s
          ',
          jsonlite::toJSON(self$`conversion_tag_v3_goal_metadata`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`frequency_goal_metadata`)) {
          sprintf(
          '"frequency_goal_metadata":
          %s
          ',
          jsonlite::toJSON(self$`frequency_goal_metadata`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`scrollup_goal_metadata`)) {
          sprintf(
          '"scrollup_goal_metadata":
          %s
          ',
          jsonlite::toJSON(self$`scrollup_goal_metadata`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`conversion_tag_v3_goal_metadata` <- OptimizationGoalMetadataConversionTagV3GoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_tag_v3_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`frequency_goal_metadata` <- OptimizationGoalMetadataFrequencyGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`frequency_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`scrollup_goal_metadata` <- OptimizationGoalMetadataScrollupGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`scrollup_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to OptimizationGoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OptimizationGoalMetadata
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
# OptimizationGoalMetadata$unlock()
#
## Below is an example to define the print function
# OptimizationGoalMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OptimizationGoalMetadata$lock()

