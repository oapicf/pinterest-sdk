#' Create a new OptimizationGoalMetadataConversionTagV3GoalMetadata
#'
#' @description
#' OptimizationGoalMetadataConversionTagV3GoalMetadata Class
#'
#' @docType class
#' @title OptimizationGoalMetadataConversionTagV3GoalMetadata
#' @description OptimizationGoalMetadataConversionTagV3GoalMetadata Class
#' @format An \code{R6Class} generator object
#' @field attribution_windows  \link{OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows} [optional]
#' @field conversion_event  character [optional]
#' @field conversion_tag_id  character [optional]
#' @field cpa_goal_value_in_micro_currency  character [optional]
#' @field is_roas_optimized ROAS optimization is not supported character [optional]
#' @field learning_mode_type Conversion learning model type character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OptimizationGoalMetadataConversionTagV3GoalMetadata <- R6::R6Class(
  "OptimizationGoalMetadataConversionTagV3GoalMetadata",
  public = list(
    `attribution_windows` = NULL,
    `conversion_event` = NULL,
    `conversion_tag_id` = NULL,
    `cpa_goal_value_in_micro_currency` = NULL,
    `is_roas_optimized` = NULL,
    `learning_mode_type` = NULL,

    #' @description
    #' Initialize a new OptimizationGoalMetadataConversionTagV3GoalMetadata class.
    #'
    #' @param attribution_windows attribution_windows
    #' @param conversion_event conversion_event
    #' @param conversion_tag_id conversion_tag_id
    #' @param cpa_goal_value_in_micro_currency cpa_goal_value_in_micro_currency
    #' @param is_roas_optimized ROAS optimization is not supported
    #' @param learning_mode_type Conversion learning model type
    #' @param ... Other optional arguments.
    initialize = function(`attribution_windows` = NULL, `conversion_event` = NULL, `conversion_tag_id` = NULL, `cpa_goal_value_in_micro_currency` = NULL, `is_roas_optimized` = NULL, `learning_mode_type` = NULL, ...) {
      if (!is.null(`attribution_windows`)) {
        stopifnot(R6::is.R6(`attribution_windows`))
        self$`attribution_windows` <- `attribution_windows`
      }
      if (!is.null(`conversion_event`)) {
        if (!(`conversion_event` %in% c("PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL"))) {
          stop(paste("Error! \"", `conversion_event`, "\" cannot be assigned to `conversion_event`. Must be \"PAGE_VISIT\", \"SIGNUP\", \"CHECKOUT\", \"CUSTOM\", \"VIEW_CATEGORY\", \"SEARCH\", \"ADD_TO_CART\", \"WATCH_VIDEO\", \"LEAD\", \"APP_INSTALL\".", sep = ""))
        }
        if (!(is.character(`conversion_event`) && length(`conversion_event`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_event`. Must be a string:", `conversion_event`))
        }
        self$`conversion_event` <- `conversion_event`
      }
      if (!is.null(`conversion_tag_id`)) {
        if (!(is.character(`conversion_tag_id`) && length(`conversion_tag_id`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_tag_id`. Must be a string:", `conversion_tag_id`))
        }
        self$`conversion_tag_id` <- `conversion_tag_id`
      }
      if (!is.null(`cpa_goal_value_in_micro_currency`)) {
        if (!(is.character(`cpa_goal_value_in_micro_currency`) && length(`cpa_goal_value_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `cpa_goal_value_in_micro_currency`. Must be a string:", `cpa_goal_value_in_micro_currency`))
        }
        self$`cpa_goal_value_in_micro_currency` <- `cpa_goal_value_in_micro_currency`
      }
      if (!is.null(`is_roas_optimized`)) {
        if (!(is.logical(`is_roas_optimized`) && length(`is_roas_optimized`) == 1)) {
          stop(paste("Error! Invalid data for `is_roas_optimized`. Must be a boolean:", `is_roas_optimized`))
        }
        self$`is_roas_optimized` <- `is_roas_optimized`
      }
      if (!is.null(`learning_mode_type`)) {
        if (!(`learning_mode_type` %in% c("NOT_ACTIVE", "ACTIVE"))) {
          stop(paste("Error! \"", `learning_mode_type`, "\" cannot be assigned to `learning_mode_type`. Must be \"NOT_ACTIVE\", \"ACTIVE\".", sep = ""))
        }
        if (!(is.character(`learning_mode_type`) && length(`learning_mode_type`) == 1)) {
          stop(paste("Error! Invalid data for `learning_mode_type`. Must be a string:", `learning_mode_type`))
        }
        self$`learning_mode_type` <- `learning_mode_type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadataConversionTagV3GoalMetadata in JSON format
    toJSON = function() {
      OptimizationGoalMetadataConversionTagV3GoalMetadataObject <- list()
      if (!is.null(self$`attribution_windows`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataObject[["attribution_windows"]] <-
          self$`attribution_windows`$toJSON()
      }
      if (!is.null(self$`conversion_event`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataObject[["conversion_event"]] <-
          self$`conversion_event`
      }
      if (!is.null(self$`conversion_tag_id`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataObject[["conversion_tag_id"]] <-
          self$`conversion_tag_id`
      }
      if (!is.null(self$`cpa_goal_value_in_micro_currency`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataObject[["cpa_goal_value_in_micro_currency"]] <-
          self$`cpa_goal_value_in_micro_currency`
      }
      if (!is.null(self$`is_roas_optimized`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataObject[["is_roas_optimized"]] <-
          self$`is_roas_optimized`
      }
      if (!is.null(self$`learning_mode_type`)) {
        OptimizationGoalMetadataConversionTagV3GoalMetadataObject[["learning_mode_type"]] <-
          self$`learning_mode_type`
      }
      OptimizationGoalMetadataConversionTagV3GoalMetadataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataConversionTagV3GoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataConversionTagV3GoalMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attribution_windows`)) {
        `attribution_windows_object` <- OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows$new()
        `attribution_windows_object`$fromJSON(jsonlite::toJSON(this_object$`attribution_windows`, auto_unbox = TRUE, digits = NA))
        self$`attribution_windows` <- `attribution_windows_object`
      }
      if (!is.null(this_object$`conversion_event`)) {
        if (!is.null(this_object$`conversion_event`) && !(this_object$`conversion_event` %in% c("PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL"))) {
          stop(paste("Error! \"", this_object$`conversion_event`, "\" cannot be assigned to `conversion_event`. Must be \"PAGE_VISIT\", \"SIGNUP\", \"CHECKOUT\", \"CUSTOM\", \"VIEW_CATEGORY\", \"SEARCH\", \"ADD_TO_CART\", \"WATCH_VIDEO\", \"LEAD\", \"APP_INSTALL\".", sep = ""))
        }
        self$`conversion_event` <- this_object$`conversion_event`
      }
      if (!is.null(this_object$`conversion_tag_id`)) {
        self$`conversion_tag_id` <- this_object$`conversion_tag_id`
      }
      if (!is.null(this_object$`cpa_goal_value_in_micro_currency`)) {
        self$`cpa_goal_value_in_micro_currency` <- this_object$`cpa_goal_value_in_micro_currency`
      }
      if (!is.null(this_object$`is_roas_optimized`)) {
        self$`is_roas_optimized` <- this_object$`is_roas_optimized`
      }
      if (!is.null(this_object$`learning_mode_type`)) {
        if (!is.null(this_object$`learning_mode_type`) && !(this_object$`learning_mode_type` %in% c("NOT_ACTIVE", "ACTIVE"))) {
          stop(paste("Error! \"", this_object$`learning_mode_type`, "\" cannot be assigned to `learning_mode_type`. Must be \"NOT_ACTIVE\", \"ACTIVE\".", sep = ""))
        }
        self$`learning_mode_type` <- this_object$`learning_mode_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return OptimizationGoalMetadataConversionTagV3GoalMetadata in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`attribution_windows`)) {
          sprintf(
          '"attribution_windows":
          %s
          ',
          jsonlite::toJSON(self$`attribution_windows`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`conversion_event`)) {
          sprintf(
          '"conversion_event":
            "%s"
                    ',
          self$`conversion_event`
          )
        },
        if (!is.null(self$`conversion_tag_id`)) {
          sprintf(
          '"conversion_tag_id":
            "%s"
                    ',
          self$`conversion_tag_id`
          )
        },
        if (!is.null(self$`cpa_goal_value_in_micro_currency`)) {
          sprintf(
          '"cpa_goal_value_in_micro_currency":
            "%s"
                    ',
          self$`cpa_goal_value_in_micro_currency`
          )
        },
        if (!is.null(self$`is_roas_optimized`)) {
          sprintf(
          '"is_roas_optimized":
            %s
                    ',
          tolower(self$`is_roas_optimized`)
          )
        },
        if (!is.null(self$`learning_mode_type`)) {
          sprintf(
          '"learning_mode_type":
            "%s"
                    ',
          self$`learning_mode_type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of OptimizationGoalMetadataConversionTagV3GoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptimizationGoalMetadataConversionTagV3GoalMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attribution_windows` <- OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows$new()$fromJSON(jsonlite::toJSON(this_object$`attribution_windows`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`conversion_event`) && !(this_object$`conversion_event` %in% c("PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL"))) {
        stop(paste("Error! \"", this_object$`conversion_event`, "\" cannot be assigned to `conversion_event`. Must be \"PAGE_VISIT\", \"SIGNUP\", \"CHECKOUT\", \"CUSTOM\", \"VIEW_CATEGORY\", \"SEARCH\", \"ADD_TO_CART\", \"WATCH_VIDEO\", \"LEAD\", \"APP_INSTALL\".", sep = ""))
      }
      self$`conversion_event` <- this_object$`conversion_event`
      self$`conversion_tag_id` <- this_object$`conversion_tag_id`
      self$`cpa_goal_value_in_micro_currency` <- this_object$`cpa_goal_value_in_micro_currency`
      self$`is_roas_optimized` <- this_object$`is_roas_optimized`
      if (!is.null(this_object$`learning_mode_type`) && !(this_object$`learning_mode_type` %in% c("NOT_ACTIVE", "ACTIVE"))) {
        stop(paste("Error! \"", this_object$`learning_mode_type`, "\" cannot be assigned to `learning_mode_type`. Must be \"NOT_ACTIVE\", \"ACTIVE\".", sep = ""))
      }
      self$`learning_mode_type` <- this_object$`learning_mode_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to OptimizationGoalMetadataConversionTagV3GoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OptimizationGoalMetadataConversionTagV3GoalMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`conversion_tag_id`, "^[0-9]+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`cpa_goal_value_in_micro_currency`, "^[0-9]+$")) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`conversion_tag_id`, "^[0-9]+$")) {
        invalid_fields["conversion_tag_id"] <- "Invalid value for `conversion_tag_id`, must conform to the pattern ^[0-9]+$."
      }

      if (!str_detect(self$`cpa_goal_value_in_micro_currency`, "^[0-9]+$")) {
        invalid_fields["cpa_goal_value_in_micro_currency"] <- "Invalid value for `cpa_goal_value_in_micro_currency`, must conform to the pattern ^[0-9]+$."
      }

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
# OptimizationGoalMetadataConversionTagV3GoalMetadata$unlock()
#
## Below is an example to define the print function
# OptimizationGoalMetadataConversionTagV3GoalMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OptimizationGoalMetadataConversionTagV3GoalMetadata$lock()

