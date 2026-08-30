#' Create a new CampaignPlanningBudgetRecommendationPoint
#'
#' @description
#' A point estimation containing the estimate data and estimation type for a budget recommendation.
#'
#' @docType class
#' @title CampaignPlanningBudgetRecommendationPoint
#' @description CampaignPlanningBudgetRecommendationPoint Class
#' @format An \code{R6Class} generator object
#' @field estimation_type Estimation type for this point. \link{CampaignPlanningEstimationType} [optional]
#' @field point_estimate Point estimate data. \link{CampaignPlanningPointEstimate} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningBudgetRecommendationPoint <- R6::R6Class(
  "CampaignPlanningBudgetRecommendationPoint",
  public = list(
    `estimation_type` = NULL,
    `point_estimate` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningBudgetRecommendationPoint class.
    #'
    #' @param estimation_type Estimation type for this point.
    #' @param point_estimate Point estimate data.
    #' @param ... Other optional arguments.
    initialize = function(`estimation_type` = NULL, `point_estimate` = NULL, ...) {
      if (!is.null(`estimation_type`)) {
        if (!(`estimation_type` %in% c())) {
          stop(paste("Error! \"", `estimation_type`, "\" cannot be assigned to `estimation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`estimation_type`))
        self$`estimation_type` <- `estimation_type`
      }
      if (!is.null(`point_estimate`)) {
        stopifnot(R6::is.R6(`point_estimate`))
        self$`point_estimate` <- `point_estimate`
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
    #' @return CampaignPlanningBudgetRecommendationPoint as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningBudgetRecommendationPoint (x) to a data frame
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
    #' Convert CampaignPlanningBudgetRecommendationPoint to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningBudgetRecommendationPointObject <- list()
      if (!is.null(self$`estimation_type`)) {
        CampaignPlanningBudgetRecommendationPointObject[["estimation_type"]] <-
          self$extractSimpleType(self$`estimation_type`)
      }
      if (!is.null(self$`point_estimate`)) {
        CampaignPlanningBudgetRecommendationPointObject[["point_estimate"]] <-
          self$extractSimpleType(self$`point_estimate`)
      }
      return(CampaignPlanningBudgetRecommendationPointObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningBudgetRecommendationPoint
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningBudgetRecommendationPoint
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`estimation_type`)) {
        `estimation_type_object` <- CampaignPlanningEstimationType$new()
        `estimation_type_object`$fromJSON(jsonlite::toJSON(this_object$`estimation_type`, auto_unbox = TRUE, digits = NA))
        self$`estimation_type` <- `estimation_type_object`
      }
      if (!is.null(this_object$`point_estimate`)) {
        `point_estimate_object` <- CampaignPlanningPointEstimate$new()
        `point_estimate_object`$fromJSON(jsonlite::toJSON(this_object$`point_estimate`, auto_unbox = TRUE, digits = NA))
        self$`point_estimate` <- `point_estimate_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningBudgetRecommendationPoint in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningBudgetRecommendationPoint
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningBudgetRecommendationPoint
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`estimation_type` <- CampaignPlanningEstimationType$new()$fromJSON(jsonlite::toJSON(this_object$`estimation_type`, auto_unbox = TRUE, digits = NA))
      self$`point_estimate` <- CampaignPlanningPointEstimate$new()$fromJSON(jsonlite::toJSON(this_object$`point_estimate`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningBudgetRecommendationPoint and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningBudgetRecommendationPoint
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
# CampaignPlanningBudgetRecommendationPoint$unlock()
#
## Below is an example to define the print function
# CampaignPlanningBudgetRecommendationPoint$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningBudgetRecommendationPoint$lock()

