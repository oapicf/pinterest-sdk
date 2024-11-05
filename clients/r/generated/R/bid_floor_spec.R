#' Create a new BidFloorSpec
#'
#' @description
#' BidFloorSpec Class
#'
#' @docType class
#' @title BidFloorSpec
#' @description BidFloorSpec Class
#' @format An \code{R6Class} generator object
#' @field countries  list(\link{Country}) [optional]
#' @field currency  \link{Currency}
#' @field objective_type  \link{ObjectiveType} [optional]
#' @field billable_event  \link{ActionType}
#' @field optimization_goal_metadata  \link{OptimizationGoalMetadata} [optional]
#' @field creative_type  \link{CreativeType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidFloorSpec <- R6::R6Class(
  "BidFloorSpec",
  public = list(
    `countries` = NULL,
    `currency` = NULL,
    `objective_type` = NULL,
    `billable_event` = NULL,
    `optimization_goal_metadata` = NULL,
    `creative_type` = NULL,

    #' @description
    #' Initialize a new BidFloorSpec class.
    #'
    #' @param currency currency
    #' @param billable_event billable_event
    #' @param countries countries
    #' @param objective_type objective_type
    #' @param optimization_goal_metadata optimization_goal_metadata
    #' @param creative_type creative_type
    #' @param ... Other optional arguments.
    initialize = function(`currency`, `billable_event`, `countries` = NULL, `objective_type` = NULL, `optimization_goal_metadata` = NULL, `creative_type` = NULL, ...) {
      if (!missing(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!missing(`billable_event`)) {
        if (!(`billable_event` %in% c())) {
          stop(paste("Error! \"", `billable_event`, "\" cannot be assigned to `billable_event`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`billable_event`))
        self$`billable_event` <- `billable_event`
      }
      if (!is.null(`countries`)) {
        stopifnot(is.vector(`countries`), length(`countries`) != 0)
        sapply(`countries`, function(x) stopifnot(R6::is.R6(x)))
        self$`countries` <- `countries`
      }
      if (!is.null(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
      }
      if (!is.null(`optimization_goal_metadata`)) {
        stopifnot(R6::is.R6(`optimization_goal_metadata`))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata`
      }
      if (!is.null(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BidFloorSpec in JSON format
    toJSON = function() {
      BidFloorSpecObject <- list()
      if (!is.null(self$`countries`)) {
        BidFloorSpecObject[["countries"]] <-
          lapply(self$`countries`, function(x) x$toJSON())
      }
      if (!is.null(self$`currency`)) {
        BidFloorSpecObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      if (!is.null(self$`objective_type`)) {
        BidFloorSpecObject[["objective_type"]] <-
          self$`objective_type`$toJSON()
      }
      if (!is.null(self$`billable_event`)) {
        BidFloorSpecObject[["billable_event"]] <-
          self$`billable_event`$toJSON()
      }
      if (!is.null(self$`optimization_goal_metadata`)) {
        BidFloorSpecObject[["optimization_goal_metadata"]] <-
          self$`optimization_goal_metadata`$toJSON()
      }
      if (!is.null(self$`creative_type`)) {
        BidFloorSpecObject[["creative_type"]] <-
          self$`creative_type`$toJSON()
      }
      BidFloorSpecObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BidFloorSpec
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloorSpec
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`countries`)) {
        self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[Country]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- Currency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- ObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
      }
      if (!is.null(this_object$`billable_event`)) {
        `billable_event_object` <- ActionType$new()
        `billable_event_object`$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
        self$`billable_event` <- `billable_event_object`
      }
      if (!is.null(this_object$`optimization_goal_metadata`)) {
        `optimization_goal_metadata_object` <- OptimizationGoalMetadata$new()
        `optimization_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata_object`
      }
      if (!is.null(this_object$`creative_type`)) {
        `creative_type_object` <- CreativeType$new()
        `creative_type_object`$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
        self$`creative_type` <- `creative_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BidFloorSpec in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`countries`)) {
          sprintf(
          '"countries":
          [%s]
',
          paste(sapply(self$`countries`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`objective_type`)) {
          sprintf(
          '"objective_type":
          %s
          ',
          jsonlite::toJSON(self$`objective_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`billable_event`)) {
          sprintf(
          '"billable_event":
          %s
          ',
          jsonlite::toJSON(self$`billable_event`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`optimization_goal_metadata`)) {
          sprintf(
          '"optimization_goal_metadata":
          %s
          ',
          jsonlite::toJSON(self$`optimization_goal_metadata`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`creative_type`)) {
          sprintf(
          '"creative_type":
          %s
          ',
          jsonlite::toJSON(self$`creative_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BidFloorSpec
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloorSpec
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[Country]", loadNamespace("openapi"))
      self$`currency` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`objective_type` <- ObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self$`billable_event` <- ActionType$new()$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
      self$`optimization_goal_metadata` <- OptimizationGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`creative_type` <- CreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BidFloorSpec and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `currency`
      if (!is.null(input_json$`currency`)) {
        stopifnot(R6::is.R6(input_json$`currency`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidFloorSpec: the required field `currency` is missing."))
      }
      # check the required field `billable_event`
      if (!is.null(input_json$`billable_event`)) {
        stopifnot(R6::is.R6(input_json$`billable_event`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidFloorSpec: the required field `billable_event` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidFloorSpec
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        return(FALSE)
      }

      # check if the required `billable_event` is null
      if (is.null(self$`billable_event`)) {
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
      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        invalid_fields["currency"] <- "Non-nullable required field `currency` cannot be null."
      }

      # check if the required `billable_event` is null
      if (is.null(self$`billable_event`)) {
        invalid_fields["billable_event"] <- "Non-nullable required field `billable_event` cannot be null."
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
# BidFloorSpec$unlock()
#
## Below is an example to define the print function
# BidFloorSpec$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidFloorSpec$lock()

