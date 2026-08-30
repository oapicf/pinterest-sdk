#' Create a new CampaignPlanningBudgetRecommendation
#'
#' @description
#' Budget recommendation response containing recommended budget, estimated days, and point estimations.
#'
#' @docType class
#' @title CampaignPlanningBudgetRecommendation
#' @description CampaignPlanningBudgetRecommendation Class
#' @format An \code{R6Class} generator object
#' @field budget_recommendation The recommended budget amount. integer [optional]
#' @field experiment_campaign_budget_recommendation List of experimental budget recommendations. list(\link{CampaignPlanningExperimentBudgetRecommendation}) [optional]
#' @field lifetime_days_recommendation Recommended number of days for the campaign lifetime. integer [optional]
#' @field point_estimations List of point estimations for different budget scenarios. list(\link{CampaignPlanningBudgetRecommendationPoint}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningBudgetRecommendation <- R6::R6Class(
  "CampaignPlanningBudgetRecommendation",
  public = list(
    `budget_recommendation` = NULL,
    `experiment_campaign_budget_recommendation` = NULL,
    `lifetime_days_recommendation` = NULL,
    `point_estimations` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningBudgetRecommendation class.
    #'
    #' @param budget_recommendation The recommended budget amount.
    #' @param experiment_campaign_budget_recommendation List of experimental budget recommendations.
    #' @param lifetime_days_recommendation Recommended number of days for the campaign lifetime.
    #' @param point_estimations List of point estimations for different budget scenarios.
    #' @param ... Other optional arguments.
    initialize = function(`budget_recommendation` = NULL, `experiment_campaign_budget_recommendation` = NULL, `lifetime_days_recommendation` = NULL, `point_estimations` = NULL, ...) {
      if (!is.null(`budget_recommendation`)) {
        if (!(is.numeric(`budget_recommendation`) && length(`budget_recommendation`) == 1)) {
          stop(paste("Error! Invalid data for `budget_recommendation`. Must be an integer:", `budget_recommendation`))
        }
        self$`budget_recommendation` <- `budget_recommendation`
      }
      if (!is.null(`experiment_campaign_budget_recommendation`)) {
        stopifnot(is.vector(`experiment_campaign_budget_recommendation`), length(`experiment_campaign_budget_recommendation`) != 0)
        sapply(`experiment_campaign_budget_recommendation`, function(x) stopifnot(R6::is.R6(x)))
        self$`experiment_campaign_budget_recommendation` <- `experiment_campaign_budget_recommendation`
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
    #' @return CampaignPlanningBudgetRecommendation as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningBudgetRecommendation (x) to a data frame
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
    #' Convert CampaignPlanningBudgetRecommendation to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningBudgetRecommendationObject <- list()
      if (!is.null(self$`budget_recommendation`)) {
        CampaignPlanningBudgetRecommendationObject[["budget_recommendation"]] <-
          self$`budget_recommendation`
      }
      if (!is.null(self$`experiment_campaign_budget_recommendation`)) {
        CampaignPlanningBudgetRecommendationObject[["experiment_campaign_budget_recommendation"]] <-
          self$extractSimpleType(self$`experiment_campaign_budget_recommendation`)
      }
      if (!is.null(self$`lifetime_days_recommendation`)) {
        CampaignPlanningBudgetRecommendationObject[["lifetime_days_recommendation"]] <-
          self$`lifetime_days_recommendation`
      }
      if (!is.null(self$`point_estimations`)) {
        CampaignPlanningBudgetRecommendationObject[["point_estimations"]] <-
          self$extractSimpleType(self$`point_estimations`)
      }
      return(CampaignPlanningBudgetRecommendationObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningBudgetRecommendation
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningBudgetRecommendation
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`budget_recommendation`)) {
        self$`budget_recommendation` <- this_object$`budget_recommendation`
      }
      if (!is.null(this_object$`experiment_campaign_budget_recommendation`)) {
        self$`experiment_campaign_budget_recommendation` <- ApiClient$new()$deserializeObj(this_object$`experiment_campaign_budget_recommendation`, "array[CampaignPlanningExperimentBudgetRecommendation]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`lifetime_days_recommendation`)) {
        self$`lifetime_days_recommendation` <- this_object$`lifetime_days_recommendation`
      }
      if (!is.null(this_object$`point_estimations`)) {
        self$`point_estimations` <- ApiClient$new()$deserializeObj(this_object$`point_estimations`, "array[CampaignPlanningBudgetRecommendationPoint]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningBudgetRecommendation in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningBudgetRecommendation
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningBudgetRecommendation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`budget_recommendation` <- this_object$`budget_recommendation`
      self$`experiment_campaign_budget_recommendation` <- ApiClient$new()$deserializeObj(this_object$`experiment_campaign_budget_recommendation`, "array[CampaignPlanningExperimentBudgetRecommendation]", loadNamespace("openapi"))
      self$`lifetime_days_recommendation` <- this_object$`lifetime_days_recommendation`
      self$`point_estimations` <- ApiClient$new()$deserializeObj(this_object$`point_estimations`, "array[CampaignPlanningBudgetRecommendationPoint]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningBudgetRecommendation and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningBudgetRecommendation
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
# CampaignPlanningBudgetRecommendation$unlock()
#
## Below is an example to define the print function
# CampaignPlanningBudgetRecommendation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningBudgetRecommendation$lock()

