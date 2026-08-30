#' Create a new CampaignPlanningCurveEstimate
#'
#' @description
#' CampaignPlanningCurveEstimate Class
#'
#' @docType class
#' @title CampaignPlanningCurveEstimate
#' @description CampaignPlanningCurveEstimate Class
#' @format An \code{R6Class} generator object
#' @field estimation_type Estimation type for campaign planning estimated curve \link{CampaignPlanningEstimationType} [optional]
#' @field points The estimation points that make up the estimated curve. list(\link{CampaignPlanningPointEstimate}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningCurveEstimate <- R6::R6Class(
  "CampaignPlanningCurveEstimate",
  public = list(
    `estimation_type` = NULL,
    `points` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningCurveEstimate class.
    #'
    #' @param estimation_type Estimation type for campaign planning estimated curve
    #' @param points The estimation points that make up the estimated curve.
    #' @param ... Other optional arguments.
    initialize = function(`estimation_type` = NULL, `points` = NULL, ...) {
      if (!is.null(`estimation_type`)) {
        if (!(`estimation_type` %in% c())) {
          stop(paste("Error! \"", `estimation_type`, "\" cannot be assigned to `estimation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`estimation_type`))
        self$`estimation_type` <- `estimation_type`
      }
      if (!is.null(`points`)) {
        stopifnot(is.vector(`points`), length(`points`) != 0)
        sapply(`points`, function(x) stopifnot(R6::is.R6(x)))
        self$`points` <- `points`
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
    #' @return CampaignPlanningCurveEstimate as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningCurveEstimate (x) to a data frame
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
    #' Convert CampaignPlanningCurveEstimate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningCurveEstimateObject <- list()
      if (!is.null(self$`estimation_type`)) {
        CampaignPlanningCurveEstimateObject[["estimation_type"]] <-
          self$extractSimpleType(self$`estimation_type`)
      }
      if (!is.null(self$`points`)) {
        CampaignPlanningCurveEstimateObject[["points"]] <-
          self$extractSimpleType(self$`points`)
      }
      return(CampaignPlanningCurveEstimateObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningCurveEstimate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningCurveEstimate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`estimation_type`)) {
        `estimation_type_object` <- CampaignPlanningEstimationType$new()
        `estimation_type_object`$fromJSON(jsonlite::toJSON(this_object$`estimation_type`, auto_unbox = TRUE, digits = NA))
        self$`estimation_type` <- `estimation_type_object`
      }
      if (!is.null(this_object$`points`)) {
        self$`points` <- ApiClient$new()$deserializeObj(this_object$`points`, "array[CampaignPlanningPointEstimate]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningCurveEstimate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningCurveEstimate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningCurveEstimate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`estimation_type` <- CampaignPlanningEstimationType$new()$fromJSON(jsonlite::toJSON(this_object$`estimation_type`, auto_unbox = TRUE, digits = NA))
      self$`points` <- ApiClient$new()$deserializeObj(this_object$`points`, "array[CampaignPlanningPointEstimate]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningCurveEstimate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningCurveEstimate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`points`) > 100) {
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
      if (length(self$`points`) > 100) {
        invalid_fields["points"] <- "Invalid length for `points`, number of items must be less than or equal to 100."
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
# CampaignPlanningCurveEstimate$unlock()
#
## Below is an example to define the print function
# CampaignPlanningCurveEstimate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningCurveEstimate$lock()

