#' Create a new CampaignPlanningExperimentBudgetRecommendation
#'
#' @description
#' Experimental budget recommendation for a single experiment version.
#'
#' @docType class
#' @title CampaignPlanningExperimentBudgetRecommendation
#' @description CampaignPlanningExperimentBudgetRecommendation Class
#' @format An \code{R6Class} generator object
#' @field budget_recommendation Recommended budget for this experiment version. integer [optional]
#' @field lifetime_days_recommendation Recommended lifetime days for this experiment. integer [optional]
#' @field point_estimations Point estimations for this experiment version. list(\link{CampaignPlanningBudgetRecommendationPoint}) [optional]
#' @field version_id Version identifier for the experiment. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningExperimentBudgetRecommendation <- R6::R6Class(
  "CampaignPlanningExperimentBudgetRecommendation",
  public = list(
    `budget_recommendation` = NULL,
    `lifetime_days_recommendation` = NULL,
    `point_estimations` = NULL,
    `version_id` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningExperimentBudgetRecommendation class.
    #'
    #' @param budget_recommendation Recommended budget for this experiment version.
    #' @param lifetime_days_recommendation Recommended lifetime days for this experiment.
    #' @param point_estimations Point estimations for this experiment version.
    #' @param version_id Version identifier for the experiment.
    #' @param ... Other optional arguments.
    initialize = function(`budget_recommendation` = NULL, `lifetime_days_recommendation` = NULL, `point_estimations` = NULL, `version_id` = NULL, ...) {
      if (!is.null(`budget_recommendation`)) {
        if (!(is.numeric(`budget_recommendation`) && length(`budget_recommendation`) == 1)) {
          stop(paste("Error! Invalid data for `budget_recommendation`. Must be an integer:", `budget_recommendation`))
        }
        self$`budget_recommendation` <- `budget_recommendation`
      }
      if (!is.null(`lifetime_days_recommendation`)) {
        if (!(is.numeric(`lifetime_days_recommendation`) && length(`lifetime_days_recommendation`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_days_recommendation`. Must be an integer:", `lifetime_days_recommendation`))
        }
        self$`lifetime_days_recommendation` <- `lifetime_days_recommendation`
      }
      if (!is.null(`point_estimations`)) {
        stopifnot(is.vector(`point_estimations`), length(`point_estimations`) != 0)
        sapply(`point_estimations`, function(x) stopifnot(R6::is.R6(x)))
        self$`point_estimations` <- `point_estimations`
      }
      if (!is.null(`version_id`)) {
        if (!(is.character(`version_id`) && length(`version_id`) == 1)) {
          stop(paste("Error! Invalid data for `version_id`. Must be a string:", `version_id`))
        }
        self$`version_id` <- `version_id`
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
    #' @return CampaignPlanningExperimentBudgetRecommendation as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningExperimentBudgetRecommendation (x) to a data frame
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
    #' Convert CampaignPlanningExperimentBudgetRecommendation to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningExperimentBudgetRecommendationObject <- list()
      if (!is.null(self$`budget_recommendation`)) {
        CampaignPlanningExperimentBudgetRecommendationObject[["budget_recommendation"]] <-
          self$`budget_recommendation`
      }
      if (!is.null(self$`lifetime_days_recommendation`)) {
        CampaignPlanningExperimentBudgetRecommendationObject[["lifetime_days_recommendation"]] <-
          self$`lifetime_days_recommendation`
      }
      if (!is.null(self$`point_estimations`)) {
        CampaignPlanningExperimentBudgetRecommendationObject[["point_estimations"]] <-
          self$extractSimpleType(self$`point_estimations`)
      }
      if (!is.null(self$`version_id`)) {
        CampaignPlanningExperimentBudgetRecommendationObject[["version_id"]] <-
          self$`version_id`
      }
      return(CampaignPlanningExperimentBudgetRecommendationObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningExperimentBudgetRecommendation
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningExperimentBudgetRecommendation
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`budget_recommendation`)) {
        self$`budget_recommendation` <- this_object$`budget_recommendation`
      }
      if (!is.null(this_object$`lifetime_days_recommendation`)) {
        self$`lifetime_days_recommendation` <- this_object$`lifetime_days_recommendation`
      }
      if (!is.null(this_object$`point_estimations`)) {
        self$`point_estimations` <- ApiClient$new()$deserializeObj(this_object$`point_estimations`, "array[CampaignPlanningBudgetRecommendationPoint]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`version_id`)) {
        self$`version_id` <- this_object$`version_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningExperimentBudgetRecommendation in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningExperimentBudgetRecommendation
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningExperimentBudgetRecommendation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`budget_recommendation` <- this_object$`budget_recommendation`
      self$`lifetime_days_recommendation` <- this_object$`lifetime_days_recommendation`
      self$`point_estimations` <- ApiClient$new()$deserializeObj(this_object$`point_estimations`, "array[CampaignPlanningBudgetRecommendationPoint]", loadNamespace("openapi"))
      self$`version_id` <- this_object$`version_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningExperimentBudgetRecommendation and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningExperimentBudgetRecommendation
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
# CampaignPlanningExperimentBudgetRecommendation$unlock()
#
## Below is an example to define the print function
# CampaignPlanningExperimentBudgetRecommendation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningExperimentBudgetRecommendation$lock()

