#' Create a new OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
#'
#' @description
#' OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows Class
#'
#' @docType class
#' @title OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
#' @description OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows Class
#' @format An \code{R6Class} generator object
#' @field click_window_days  integer [optional]
#' @field engagement_window_days  integer [optional]
#' @field view_window_days  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows <- R6::R6Class(
  "OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows",
  public = list(
    `click_window_days` = NULL,
    `engagement_window_days` = NULL,
    `view_window_days` = NULL,

    #' @description
    #' Initialize a new OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows class.
    #'
    #' @param click_window_days click_window_days
    #' @param engagement_window_days engagement_window_days
    #' @param view_window_days view_window_days
    #' @param ... Other optional arguments.
    initialize = function(`click_window_days` = NULL, `engagement_window_days` = NULL, `view_window_days` = NULL, ...) {
      if (!is.null(`click_window_days`)) {
        if (!(is.numeric(`click_window_days`) && length(`click_window_days`) == 1)) {
          stop(paste("Error! Invalid data for `click_window_days`. Must be an integer:", `click_window_days`))
        }
        self$`click_window_days` <- `click_window_days`
      }
      if (!is.null(`engagement_window_days`)) {
        if (!(is.numeric(`engagement_window_days`) && length(`engagement_window_days`) == 1)) {
          stop(paste("Error! Invalid data for `engagement_window_days`. Must be an integer:", `engagement_window_days`))
        }
        self$`engagement_window_days` <- `engagement_window_days`
      }
      if (!is.null(`view_window_days`)) {
        if (!(is.numeric(`view_window_days`) && length(`view_window_days`) == 1)) {
          stop(paste("Error! Invalid data for `view_window_days`. Must be an integer:", `view_window_days`))
        }
        self$`view_window_days` <- `view_window_days`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows in JSON format
    toJSON = function() {
      OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsObject <- list()
      if (!is.null(self$`click_window_days`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsObject[["click_window_days"]] <-
          self$`click_window_days`
      }
      if (!is.null(self$`engagement_window_days`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsObject[["engagement_window_days"]] <-
          self$`engagement_window_days`
      }
      if (!is.null(self$`view_window_days`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsObject[["view_window_days"]] <-
          self$`view_window_days`
      }
      OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`click_window_days`)) {
        self$`click_window_days` <- this_object$`click_window_days`
      }
      if (!is.null(this_object$`engagement_window_days`)) {
        self$`engagement_window_days` <- this_object$`engagement_window_days`
      }
      if (!is.null(this_object$`view_window_days`)) {
        self$`view_window_days` <- this_object$`view_window_days`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`click_window_days`)) {
          sprintf(
          '"click_window_days":
            %d
                    ',
          self$`click_window_days`
          )
        },
        if (!is.null(self$`engagement_window_days`)) {
          sprintf(
          '"engagement_window_days":
            %d
                    ',
          self$`engagement_window_days`
          )
        },
        if (!is.null(self$`view_window_days`)) {
          sprintf(
          '"view_window_days":
            %d
                    ',
          self$`view_window_days`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`click_window_days` <- this_object$`click_window_days`
      self$`engagement_window_days` <- this_object$`engagement_window_days`
      self$`view_window_days` <- this_object$`view_window_days`
      self
    },

    #' @description
    #' Validate JSON input with respect to OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
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
# OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows$unlock()
#
## Below is an example to define the print function
# OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows$lock()

