#' Create a new BulkCampaignDeliveryEstimatesItem
#'
#' @description
#' Delivery estimate result for a single campaign within a bulk request.
#'
#' @docType class
#' @title BulkCampaignDeliveryEstimatesItem
#' @description BulkCampaignDeliveryEstimatesItem Class
#' @format An \code{R6Class} generator object
#' @field adgroup_audience_sizes Range audience sizes for each ad group, in the same order as the ad groups in the request. list(\link{CampaignPlanningAdGroupAudienceSize}) [optional]
#' @field conversion_rate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. numeric [optional]
#' @field conversion_rates Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. list(\link{CampaignPlanningConversionRate}) [optional]
#' @field curves Estimated curves. Each curve will pertain to a single estimation type. list(\link{CampaignPlanningCurveEstimate}) [optional]
#' @field derived_metrics  \link{CampaignDeliveryEstimatesDerivedMetrics} [optional]
#' @field errors Errors encountered during estimation for this campaign. list(\link{CampaignPlanningResponseError}) [optional]
#' @field estimate_id UUID used to track delivery estimates when they are generated as part of a saved campaign. character [optional]
#' @field max_potential_spend Maximum potential spend estimate. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkCampaignDeliveryEstimatesItem <- R6::R6Class(
  "BulkCampaignDeliveryEstimatesItem",
  public = list(
    `adgroup_audience_sizes` = NULL,
    `conversion_rate` = NULL,
    `conversion_rates` = NULL,
    `curves` = NULL,
    `derived_metrics` = NULL,
    `errors` = NULL,
    `estimate_id` = NULL,
    `max_potential_spend` = NULL,

    #' @description
    #' Initialize a new BulkCampaignDeliveryEstimatesItem class.
    #'
    #' @param adgroup_audience_sizes Range audience sizes for each ad group, in the same order as the ad groups in the request.
    #' @param conversion_rate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
    #' @param conversion_rates Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
    #' @param curves Estimated curves. Each curve will pertain to a single estimation type.
    #' @param derived_metrics derived_metrics
    #' @param errors Errors encountered during estimation for this campaign.
    #' @param estimate_id UUID used to track delivery estimates when they are generated as part of a saved campaign.
    #' @param max_potential_spend Maximum potential spend estimate.
    #' @param ... Other optional arguments.
    initialize = function(`adgroup_audience_sizes` = NULL, `conversion_rate` = NULL, `conversion_rates` = NULL, `curves` = NULL, `derived_metrics` = NULL, `errors` = NULL, `estimate_id` = NULL, `max_potential_spend` = NULL, ...) {
      if (!is.null(`adgroup_audience_sizes`)) {
        stopifnot(is.vector(`adgroup_audience_sizes`), length(`adgroup_audience_sizes`) != 0)
        sapply(`adgroup_audience_sizes`, function(x) stopifnot(R6::is.R6(x)))
        self$`adgroup_audience_sizes` <- `adgroup_audience_sizes`
      }
      if (!is.null(`conversion_rate`)) {
        if (!(is.numeric(`conversion_rate`) && length(`conversion_rate`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_rate`. Must be a number:", `conversion_rate`))
        }
        self$`conversion_rate` <- `conversion_rate`
      }
      if (!is.null(`conversion_rates`)) {
        stopifnot(is.vector(`conversion_rates`), length(`conversion_rates`) != 0)
        sapply(`conversion_rates`, function(x) stopifnot(R6::is.R6(x)))
        self$`conversion_rates` <- `conversion_rates`
      }
      if (!is.null(`curves`)) {
        stopifnot(is.vector(`curves`), length(`curves`) != 0)
        sapply(`curves`, function(x) stopifnot(R6::is.R6(x)))
        self$`curves` <- `curves`
      }
      if (!is.null(`derived_metrics`)) {
        stopifnot(R6::is.R6(`derived_metrics`))
        self$`derived_metrics` <- `derived_metrics`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`estimate_id`)) {
        if (!(is.character(`estimate_id`) && length(`estimate_id`) == 1)) {
          stop(paste("Error! Invalid data for `estimate_id`. Must be a string:", `estimate_id`))
        }
        self$`estimate_id` <- `estimate_id`
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
    #' @return BulkCampaignDeliveryEstimatesItem as a base R list.
    #' @examples
    #' # convert array of BulkCampaignDeliveryEstimatesItem (x) to a data frame
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
    #' Convert BulkCampaignDeliveryEstimatesItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkCampaignDeliveryEstimatesItemObject <- list()
      if (!is.null(self$`adgroup_audience_sizes`)) {
        BulkCampaignDeliveryEstimatesItemObject[["adgroup_audience_sizes"]] <-
          self$extractSimpleType(self$`adgroup_audience_sizes`)
      }
      if (!is.null(self$`conversion_rate`)) {
        BulkCampaignDeliveryEstimatesItemObject[["conversion_rate"]] <-
          self$`conversion_rate`
      }
      if (!is.null(self$`conversion_rates`)) {
        BulkCampaignDeliveryEstimatesItemObject[["conversion_rates"]] <-
          self$extractSimpleType(self$`conversion_rates`)
      }
      if (!is.null(self$`curves`)) {
        BulkCampaignDeliveryEstimatesItemObject[["curves"]] <-
          self$extractSimpleType(self$`curves`)
      }
      if (!is.null(self$`derived_metrics`)) {
        BulkCampaignDeliveryEstimatesItemObject[["derived_metrics"]] <-
          self$extractSimpleType(self$`derived_metrics`)
      }
      if (!is.null(self$`errors`)) {
        BulkCampaignDeliveryEstimatesItemObject[["errors"]] <-
          self$extractSimpleType(self$`errors`)
      }
      if (!is.null(self$`estimate_id`)) {
        BulkCampaignDeliveryEstimatesItemObject[["estimate_id"]] <-
          self$`estimate_id`
      }
      if (!is.null(self$`max_potential_spend`)) {
        BulkCampaignDeliveryEstimatesItemObject[["max_potential_spend"]] <-
          self$`max_potential_spend`
      }
      return(BulkCampaignDeliveryEstimatesItemObject)
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
    #' Deserialize JSON string into an instance of BulkCampaignDeliveryEstimatesItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkCampaignDeliveryEstimatesItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`adgroup_audience_sizes`)) {
        self$`adgroup_audience_sizes` <- ApiClient$new()$deserializeObj(this_object$`adgroup_audience_sizes`, "array[CampaignPlanningAdGroupAudienceSize]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`conversion_rate`)) {
        self$`conversion_rate` <- this_object$`conversion_rate`
      }
      if (!is.null(this_object$`conversion_rates`)) {
        self$`conversion_rates` <- ApiClient$new()$deserializeObj(this_object$`conversion_rates`, "array[CampaignPlanningConversionRate]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`curves`)) {
        self$`curves` <- ApiClient$new()$deserializeObj(this_object$`curves`, "array[CampaignPlanningCurveEstimate]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`derived_metrics`)) {
        `derived_metrics_object` <- CampaignDeliveryEstimatesDerivedMetrics$new()
        `derived_metrics_object`$fromJSON(jsonlite::toJSON(this_object$`derived_metrics`, auto_unbox = TRUE, digits = NA))
        self$`derived_metrics` <- `derived_metrics_object`
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[CampaignPlanningResponseError]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`estimate_id`)) {
        self$`estimate_id` <- this_object$`estimate_id`
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
    #' @return BulkCampaignDeliveryEstimatesItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkCampaignDeliveryEstimatesItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkCampaignDeliveryEstimatesItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`adgroup_audience_sizes` <- ApiClient$new()$deserializeObj(this_object$`adgroup_audience_sizes`, "array[CampaignPlanningAdGroupAudienceSize]", loadNamespace("openapi"))
      self$`conversion_rate` <- this_object$`conversion_rate`
      self$`conversion_rates` <- ApiClient$new()$deserializeObj(this_object$`conversion_rates`, "array[CampaignPlanningConversionRate]", loadNamespace("openapi"))
      self$`curves` <- ApiClient$new()$deserializeObj(this_object$`curves`, "array[CampaignPlanningCurveEstimate]", loadNamespace("openapi"))
      self$`derived_metrics` <- CampaignDeliveryEstimatesDerivedMetrics$new()$fromJSON(jsonlite::toJSON(this_object$`derived_metrics`, auto_unbox = TRUE, digits = NA))
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[CampaignPlanningResponseError]", loadNamespace("openapi"))
      self$`estimate_id` <- this_object$`estimate_id`
      self$`max_potential_spend` <- this_object$`max_potential_spend`
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkCampaignDeliveryEstimatesItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkCampaignDeliveryEstimatesItem
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
# BulkCampaignDeliveryEstimatesItem$unlock()
#
## Below is an example to define the print function
# BulkCampaignDeliveryEstimatesItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkCampaignDeliveryEstimatesItem$lock()

