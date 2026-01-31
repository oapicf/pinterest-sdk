#' Create a new AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
#'
#' @description
#' AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics Class
#'
#' @docType class
#' @title AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
#' @description AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics Class
#' @format An \code{R6Class} generator object
#' @field custom_event_metrics_type Metrics for custom defined conversion event. character
#' @field custom_event_name Name of the advertiser-defined custom conversion event character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics <- R6::R6Class(
  "AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics",
  public = list(
    `custom_event_metrics_type` = NULL,
    `custom_event_name` = NULL,

    #' @description
    #' Initialize a new AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics class.
    #'
    #' @param custom_event_metrics_type Metrics for custom defined conversion event.
    #' @param custom_event_name Name of the advertiser-defined custom conversion event
    #' @param ... Other optional arguments.
    initialize = function(`custom_event_metrics_type`, `custom_event_name`, ...) {
      if (!missing(`custom_event_metrics_type`)) {
        if (!(`custom_event_metrics_type` %in% c("ADE_COST_PER_ACTION", "ADE_ROAS", "ADE_TOTAL_CONVERSIONS", "ADE_TOTAL_VALUE_IN_MICRO_DOLLAR", "ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CLICK", "ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_VIEW", "ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_RATE", "ADE_WEB_COST_PER_ACTION", "ADE_WEB_ROAS", "ADE_TOTAL_WEB_CONVERSIONS", "ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_CLICK", "ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_VIEW", "ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_INAPP_COST_PER_ACTION", "ADE_INAPP_ROAS", "ADE_TOTAL_INAPP_CONVERSIONS", "ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_CLICK", "ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_VIEW", "ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_OFFLINE_COST_PER_ACTION", "ADE_OFFLINE_ROAS", "ADE_TOTAL_OFFLINE_CONVERSIONS", "ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_CLICK", "ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_VIEW", "ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"))) {
          stop(paste("Error! \"", `custom_event_metrics_type`, "\" cannot be assigned to `custom_event_metrics_type`. Must be \"ADE_COST_PER_ACTION\", \"ADE_ROAS\", \"ADE_TOTAL_CONVERSIONS\", \"ADE_TOTAL_VALUE_IN_MICRO_DOLLAR\", \"ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CLICK\", \"ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_VIEW\", \"ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CONVERSION_RATE\", \"ADE_WEB_COST_PER_ACTION\", \"ADE_WEB_ROAS\", \"ADE_TOTAL_WEB_CONVERSIONS\", \"ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_WEB_CLICK\", \"ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_WEB_VIEW\", \"ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_INAPP_COST_PER_ACTION\", \"ADE_INAPP_ROAS\", \"ADE_TOTAL_INAPP_CONVERSIONS\", \"ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_INAPP_CLICK\", \"ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_INAPP_VIEW\", \"ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_OFFLINE_COST_PER_ACTION\", \"ADE_OFFLINE_ROAS\", \"ADE_TOTAL_OFFLINE_CONVERSIONS\", \"ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_OFFLINE_CLICK\", \"ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_OFFLINE_VIEW\", \"ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\".", sep = ""))
        }
        if (!(is.character(`custom_event_metrics_type`) && length(`custom_event_metrics_type`) == 1)) {
          stop(paste("Error! Invalid data for `custom_event_metrics_type`. Must be a string:", `custom_event_metrics_type`))
        }
        self$`custom_event_metrics_type` <- `custom_event_metrics_type`
      }
      if (!missing(`custom_event_name`)) {
        if (!(is.character(`custom_event_name`) && length(`custom_event_name`) == 1)) {
          stop(paste("Error! Invalid data for `custom_event_name`. Must be a string:", `custom_event_name`))
        }
        self$`custom_event_name` <- `custom_event_name`
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
    #' @return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics as a base R list.
    #' @examples
    #' # convert array of AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics (x) to a data frame
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
    #' Convert AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsObject <- list()
      if (!is.null(self$`custom_event_metrics_type`)) {
        AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsObject[["custom_event_metrics_type"]] <-
          self$`custom_event_metrics_type`
      }
      if (!is.null(self$`custom_event_name`)) {
        AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsObject[["custom_event_name"]] <-
          self$`custom_event_name`
      }
      return(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`custom_event_metrics_type`)) {
        if (!is.null(this_object$`custom_event_metrics_type`) && !(this_object$`custom_event_metrics_type` %in% c("ADE_COST_PER_ACTION", "ADE_ROAS", "ADE_TOTAL_CONVERSIONS", "ADE_TOTAL_VALUE_IN_MICRO_DOLLAR", "ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CLICK", "ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_VIEW", "ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_RATE", "ADE_WEB_COST_PER_ACTION", "ADE_WEB_ROAS", "ADE_TOTAL_WEB_CONVERSIONS", "ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_CLICK", "ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_VIEW", "ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_INAPP_COST_PER_ACTION", "ADE_INAPP_ROAS", "ADE_TOTAL_INAPP_CONVERSIONS", "ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_CLICK", "ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_VIEW", "ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_OFFLINE_COST_PER_ACTION", "ADE_OFFLINE_ROAS", "ADE_TOTAL_OFFLINE_CONVERSIONS", "ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_CLICK", "ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_VIEW", "ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"))) {
          stop(paste("Error! \"", this_object$`custom_event_metrics_type`, "\" cannot be assigned to `custom_event_metrics_type`. Must be \"ADE_COST_PER_ACTION\", \"ADE_ROAS\", \"ADE_TOTAL_CONVERSIONS\", \"ADE_TOTAL_VALUE_IN_MICRO_DOLLAR\", \"ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CLICK\", \"ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_VIEW\", \"ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CONVERSION_RATE\", \"ADE_WEB_COST_PER_ACTION\", \"ADE_WEB_ROAS\", \"ADE_TOTAL_WEB_CONVERSIONS\", \"ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_WEB_CLICK\", \"ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_WEB_VIEW\", \"ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_INAPP_COST_PER_ACTION\", \"ADE_INAPP_ROAS\", \"ADE_TOTAL_INAPP_CONVERSIONS\", \"ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_INAPP_CLICK\", \"ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_INAPP_VIEW\", \"ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_OFFLINE_COST_PER_ACTION\", \"ADE_OFFLINE_ROAS\", \"ADE_TOTAL_OFFLINE_CONVERSIONS\", \"ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_OFFLINE_CLICK\", \"ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_OFFLINE_VIEW\", \"ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\".", sep = ""))
        }
        self$`custom_event_metrics_type` <- this_object$`custom_event_metrics_type`
      }
      if (!is.null(this_object$`custom_event_name`)) {
        self$`custom_event_name` <- this_object$`custom_event_name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`custom_event_metrics_type`) && !(this_object$`custom_event_metrics_type` %in% c("ADE_COST_PER_ACTION", "ADE_ROAS", "ADE_TOTAL_CONVERSIONS", "ADE_TOTAL_VALUE_IN_MICRO_DOLLAR", "ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CLICK", "ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_VIEW", "ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_RATE", "ADE_WEB_COST_PER_ACTION", "ADE_WEB_ROAS", "ADE_TOTAL_WEB_CONVERSIONS", "ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_CLICK", "ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_VIEW", "ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_INAPP_COST_PER_ACTION", "ADE_INAPP_ROAS", "ADE_TOTAL_INAPP_CONVERSIONS", "ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_CLICK", "ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_VIEW", "ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_OFFLINE_COST_PER_ACTION", "ADE_OFFLINE_ROAS", "ADE_TOTAL_OFFLINE_CONVERSIONS", "ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_CLICK", "ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_VIEW", "ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"))) {
        stop(paste("Error! \"", this_object$`custom_event_metrics_type`, "\" cannot be assigned to `custom_event_metrics_type`. Must be \"ADE_COST_PER_ACTION\", \"ADE_ROAS\", \"ADE_TOTAL_CONVERSIONS\", \"ADE_TOTAL_VALUE_IN_MICRO_DOLLAR\", \"ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CLICK\", \"ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_VIEW\", \"ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CONVERSION_RATE\", \"ADE_WEB_COST_PER_ACTION\", \"ADE_WEB_ROAS\", \"ADE_TOTAL_WEB_CONVERSIONS\", \"ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_WEB_CLICK\", \"ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_WEB_VIEW\", \"ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_INAPP_COST_PER_ACTION\", \"ADE_INAPP_ROAS\", \"ADE_TOTAL_INAPP_CONVERSIONS\", \"ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_INAPP_CLICK\", \"ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_INAPP_VIEW\", \"ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_OFFLINE_COST_PER_ACTION\", \"ADE_OFFLINE_ROAS\", \"ADE_TOTAL_OFFLINE_CONVERSIONS\", \"ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_OFFLINE_CLICK\", \"ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_OFFLINE_VIEW\", \"ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR\", \"ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD\", \"ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD\".", sep = ""))
      }
      self$`custom_event_metrics_type` <- this_object$`custom_event_metrics_type`
      self$`custom_event_name` <- this_object$`custom_event_name`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `custom_event_metrics_type`
      if (!is.null(input_json$`custom_event_metrics_type`)) {
        if (!(is.character(input_json$`custom_event_metrics_type`) && length(input_json$`custom_event_metrics_type`) == 1)) {
          stop(paste("Error! Invalid data for `custom_event_metrics_type`. Must be a string:", input_json$`custom_event_metrics_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics: the required field `custom_event_metrics_type` is missing."))
      }
      # check the required field `custom_event_name`
      if (!is.null(input_json$`custom_event_name`)) {
        if (!(is.character(input_json$`custom_event_name`) && length(input_json$`custom_event_name`) == 1)) {
          stop(paste("Error! Invalid data for `custom_event_name`. Must be a string:", input_json$`custom_event_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics: the required field `custom_event_name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `custom_event_metrics_type` is null
      if (is.null(self$`custom_event_metrics_type`)) {
        return(FALSE)
      }

      # check if the required `custom_event_name` is null
      if (is.null(self$`custom_event_name`)) {
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
      # check if the required `custom_event_metrics_type` is null
      if (is.null(self$`custom_event_metrics_type`)) {
        invalid_fields["custom_event_metrics_type"] <- "Non-nullable required field `custom_event_metrics_type` cannot be null."
      }

      # check if the required `custom_event_name` is null
      if (is.null(self$`custom_event_name`)) {
        invalid_fields["custom_event_name"] <- "Non-nullable required field `custom_event_name` cannot be null."
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
# AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics$unlock()
#
## Below is an example to define the print function
# AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics$lock()

