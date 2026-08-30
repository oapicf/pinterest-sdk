#' Create a new CampaignDeliveryEstimatesResponse
#'
#' @description
#' Delivery estimates response for a campaign.
#'
#' @docType class
#' @title CampaignDeliveryEstimatesResponse
#' @description CampaignDeliveryEstimatesResponse Class
#' @format An \code{R6Class} generator object
#' @field curves Estimated curves. Each curve will pertain to a single estimation type. list(\link{CampaignPlanningCurveEstimate}) [optional]
#' @field derived_metrics  \link{CampaignDeliveryEstimatesDerivedMetrics} [optional]
#' @field max_potential_spend Maximum potential spend estimate. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignDeliveryEstimatesResponse <- R6::R6Class(
  "CampaignDeliveryEstimatesResponse",
  public = list(
    `curves` = NULL,
    `derived_metrics` = NULL,
    `max_potential_spend` = NULL,

    #' @description
    #' Initialize a new CampaignDeliveryEstimatesResponse class.
    #'
    #' @param curves Estimated curves. Each curve will pertain to a single estimation type.
    #' @param derived_metrics derived_metrics
    #' @param max_potential_spend Maximum potential spend estimate.
    #' @param ... Other optional arguments.
    initialize = function(`curves` = NULL, `derived_metrics` = NULL, `max_potential_spend` = NULL, ...) {
      if (!is.null(`curves`)) {
        stopifnot(is.vector(`curves`), length(`curves`) != 0)
        sapply(`curves`, function(x) stopifnot(R6::is.R6(x)))
        self$`curves` <- `curves`
      }
      if (!is.null(`derived_metrics`)) {
        stopifnot(R6::is.R6(`derived_metrics`))
        self$`derived_metrics` <- `derived_metrics`
      }
      if (!is.null(`max_potential_spend`)) {
        if (!(is.numeric(`max_potential_spend`) && length(`max_potential_spend`) == 1)) {
          stop(paste("Error! Invalid data for `max_potential_spend`. Must be an integer:", `max_potential_spend`))
        }
        self$`max_potential_spend` <- `max_potential_spend`
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
    #' @return CampaignDeliveryEstimatesResponse as a base R list.
    #' @examples
    #' # convert array of CampaignDeliveryEstimatesResponse (x) to a data frame
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
    #' Convert CampaignDeliveryEstimatesResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignDeliveryEstimatesResponseObject <- list()
      if (!is.null(self$`curves`)) {
        CampaignDeliveryEstimatesResponseObject[["curves"]] <-
          self$extractSimpleType(self$`curves`)
      }
      if (!is.null(self$`derived_metrics`)) {
        CampaignDeliveryEstimatesResponseObject[["derived_metrics"]] <-
          self$extractSimpleType(self$`derived_metrics`)
      }
      if (!is.null(self$`max_potential_spend`)) {
        CampaignDeliveryEstimatesResponseObject[["max_potential_spend"]] <-
          self$`max_potential_spend`
      }
      return(CampaignDeliveryEstimatesResponseObject)
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
    #' Deserialize JSON string into an instance of CampaignDeliveryEstimatesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDeliveryEstimatesResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`curves`)) {
        self$`curves` <- ApiClient$new()$deserializeObj(this_object$`curves`, "array[CampaignPlanningCurveEstimate]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`derived_metrics`)) {
        `derived_metrics_object` <- CampaignDeliveryEstimatesDerivedMetrics$new()
        `derived_metrics_object`$fromJSON(jsonlite::toJSON(this_object$`derived_metrics`, auto_unbox = TRUE, digits = NA))
        self$`derived_metrics` <- `derived_metrics_object`
      }
      if (!is.null(this_object$`max_potential_spend`)) {
        self$`max_potential_spend` <- this_object$`max_potential_spend`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignDeliveryEstimatesResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignDeliveryEstimatesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDeliveryEstimatesResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`curves` <- ApiClient$new()$deserializeObj(this_object$`curves`, "array[CampaignPlanningCurveEstimate]", loadNamespace("openapi"))
      self$`derived_metrics` <- CampaignDeliveryEstimatesDerivedMetrics$new()$fromJSON(jsonlite::toJSON(this_object$`derived_metrics`, auto_unbox = TRUE, digits = NA))
      self$`max_potential_spend` <- this_object$`max_potential_spend`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignDeliveryEstimatesResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignDeliveryEstimatesResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`curves`) > 20) {
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
      if (length(self$`curves`) > 20) {
        invalid_fields["curves"] <- "Invalid length for `curves`, number of items must be less than or equal to 20."
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
# CampaignDeliveryEstimatesResponse$unlock()
#
## Below is an example to define the print function
# CampaignDeliveryEstimatesResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignDeliveryEstimatesResponse$lock()

