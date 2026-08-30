#' Create a new BidFloorSpec
#'
#' @description
#' Bid floor specification for a given campaign configuration.
#'
#' @docType class
#' @title BidFloorSpec
#' @description BidFloorSpec Class
#' @format An \code{R6Class} generator object
#' @field billable_event Ad group billable event type. \link{ActionType}
#' @field countries List of ISO 3166-1 alpha-2 country codes. list(\link{Country}) [optional]
#' @field creative_type Creative type for the bid floor request. \link{CreativeType} [optional]
#' @field currency Currency for the bid floor value. \link{Currency}
#' @field objective_type Campaign objective type. \link{BidFloorObjectiveType} [optional]
#' @field optimization_goal_metadata Optimization goal metadata. \link{OptimizationGoalMetadata} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidFloorSpec <- R6::R6Class(
  "BidFloorSpec",
  public = list(
    `billable_event` = NULL,
    `countries` = NULL,
    `creative_type` = NULL,
    `currency` = NULL,
    `objective_type` = NULL,
    `optimization_goal_metadata` = NULL,

    #' @description
    #' Initialize a new BidFloorSpec class.
    #'
    #' @param billable_event Ad group billable event type.
    #' @param currency Currency for the bid floor value.
    #' @param countries List of ISO 3166-1 alpha-2 country codes.
    #' @param creative_type Creative type for the bid floor request.
    #' @param objective_type Campaign objective type.
    #' @param optimization_goal_metadata Optimization goal metadata.
    #' @param ... Other optional arguments.
    initialize = function(`billable_event`, `currency`, `countries` = NULL, `creative_type` = NULL, `objective_type` = NULL, `optimization_goal_metadata` = NULL, ...) {
      if (!missing(`billable_event`)) {
        if (!(`billable_event` %in% c())) {
          stop(paste("Error! \"", `billable_event`, "\" cannot be assigned to `billable_event`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`billable_event`))
        self$`billable_event` <- `billable_event`
      }
      if (!missing(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`countries`)) {
        stopifnot(is.vector(`countries`), length(`countries`) != 0)
        sapply(`countries`, function(x) stopifnot(R6::is.R6(x)))
        self$`countries` <- `countries`
      }
      if (!is.null(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
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
    #' @return BidFloorSpec as a base R list.
    #' @examples
    #' # convert array of BidFloorSpec (x) to a data frame
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
    #' Convert BidFloorSpec to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BidFloorSpecObject <- list()
      if (!is.null(self$`billable_event`)) {
        BidFloorSpecObject[["billable_event"]] <-
          self$extractSimpleType(self$`billable_event`)
      }
      if (!is.null(self$`countries`)) {
        BidFloorSpecObject[["countries"]] <-
          self$extractSimpleType(self$`countries`)
      }
      if (!is.null(self$`creative_type`)) {
        BidFloorSpecObject[["creative_type"]] <-
          self$extractSimpleType(self$`creative_type`)
      }
      if (!is.null(self$`currency`)) {
        BidFloorSpecObject[["currency"]] <-
          self$extractSimpleType(self$`currency`)
      }
      if (!is.null(self$`objective_type`)) {
        BidFloorSpecObject[["objective_type"]] <-
          self$extractSimpleType(self$`objective_type`)
      }
      if (!is.null(self$`optimization_goal_metadata`)) {
        BidFloorSpecObject[["optimization_goal_metadata"]] <-
          self$extractSimpleType(self$`optimization_goal_metadata`)
      }
      return(BidFloorSpecObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of BidFloorSpec
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloorSpec
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`billable_event`)) {
        `billable_event_object` <- ActionType$new()
        `billable_event_object`$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
        self$`billable_event` <- `billable_event_object`
      }
      if (!is.null(this_object$`countries`)) {
        self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[Country]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`creative_type`)) {
        `creative_type_object` <- CreativeType$new()
        `creative_type_object`$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
        self$`creative_type` <- `creative_type_object`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- Currency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- BidFloorObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
      }
      if (!is.null(this_object$`optimization_goal_metadata`)) {
        `optimization_goal_metadata_object` <- OptimizationGoalMetadata$new()
        `optimization_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BidFloorSpec in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BidFloorSpec
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloorSpec
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`billable_event` <- ActionType$new()$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
      self$`countries` <- ApiClient$new()$deserializeObj(this_object$`countries`, "array[Country]", loadNamespace("openapi"))
      self$`creative_type` <- CreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      self$`currency` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`objective_type` <- BidFloorObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self$`optimization_goal_metadata` <- OptimizationGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BidFloorSpec and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `billable_event`
      if (!is.null(input_json$`billable_event`)) {
        stopifnot(R6::is.R6(input_json$`billable_event`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidFloorSpec: the required field `billable_event` is missing."))
      }
      # check the required field `currency`
      if (!is.null(input_json$`currency`)) {
        stopifnot(R6::is.R6(input_json$`currency`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidFloorSpec: the required field `currency` is missing."))
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
      # check if the required `billable_event` is null
      if (is.null(self$`billable_event`)) {
        return(FALSE)
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
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
      # check if the required `billable_event` is null
      if (is.null(self$`billable_event`)) {
        invalid_fields["billable_event"] <- "Non-nullable required field `billable_event` cannot be null."
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        invalid_fields["currency"] <- "Non-nullable required field `currency` cannot be null."
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

