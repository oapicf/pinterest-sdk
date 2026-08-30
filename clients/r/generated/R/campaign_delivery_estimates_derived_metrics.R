#' Create a new CampaignDeliveryEstimatesDerivedMetrics
#'
#' @description
#' Derived metrics for an ad campaign.
#'
#' @docType class
#' @title CampaignDeliveryEstimatesDerivedMetrics
#' @description CampaignDeliveryEstimatesDerivedMetrics Class
#' @format An \code{R6Class} generator object
#' @field cpc Estimated cost per click. numeric [optional]
#' @field cpc_lower Lower estimate of the cost per click. numeric [optional]
#' @field cpc_upper Upper estimate of the cost per click. numeric [optional]
#' @field cpm Estimated cost per thousand impressions. numeric [optional]
#' @field cpm_lower Lower estimate of cost per thousand impressions. numeric [optional]
#' @field cpm_upper Upper estimate of cost per thousand impressions. numeric [optional]
#' @field lifetime_frequency Estimated lifetime frequency. numeric [optional]
#' @field lifetime_frequency_lower Lower estimate of lifetime frequency. numeric [optional]
#' @field lifetime_frequency_upper Upper estimate of lifetime frequency. numeric [optional]
#' @field lifetime_impression Estimated lifetime impressions. numeric [optional]
#' @field lifetime_impression_lower Lower estimate of lifetime impressions. numeric [optional]
#' @field lifetime_impression_upper Upper estimate of lifetime impressions. numeric [optional]
#' @field lifetime_reach Estimated lifetime reach. numeric [optional]
#' @field lifetime_reach_lower Lower estimate of lifetime reach. numeric [optional]
#' @field lifetime_reach_upper Upper estimate of lifetime reach. numeric [optional]
#' @field weekly_click Estimated weekly clicks. numeric [optional]
#' @field weekly_click_lower Lower estimate of weekly clicks. numeric [optional]
#' @field weekly_click_upper Upper estimate of weekly clicks. numeric [optional]
#' @field weekly_frequency Estimated weekly frequency. numeric [optional]
#' @field weekly_frequency_lower Lower estimate of weekly frequency. numeric [optional]
#' @field weekly_frequency_upper Upper estimate of weekly frequency. numeric [optional]
#' @field weekly_impression Estimated weekly impressions. numeric [optional]
#' @field weekly_impression_lower Lower estimate of weekly impressions. numeric [optional]
#' @field weekly_impression_upper Upper estimate of weekly impressions. numeric [optional]
#' @field weekly_reach Estimated weekly reach. numeric [optional]
#' @field weekly_reach_lower Lower estimate of weekly reach. numeric [optional]
#' @field weekly_reach_upper Upper estimate of weekly reach. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignDeliveryEstimatesDerivedMetrics <- R6::R6Class(
  "CampaignDeliveryEstimatesDerivedMetrics",
  public = list(
    `cpc` = NULL,
    `cpc_lower` = NULL,
    `cpc_upper` = NULL,
    `cpm` = NULL,
    `cpm_lower` = NULL,
    `cpm_upper` = NULL,
    `lifetime_frequency` = NULL,
    `lifetime_frequency_lower` = NULL,
    `lifetime_frequency_upper` = NULL,
    `lifetime_impression` = NULL,
    `lifetime_impression_lower` = NULL,
    `lifetime_impression_upper` = NULL,
    `lifetime_reach` = NULL,
    `lifetime_reach_lower` = NULL,
    `lifetime_reach_upper` = NULL,
    `weekly_click` = NULL,
    `weekly_click_lower` = NULL,
    `weekly_click_upper` = NULL,
    `weekly_frequency` = NULL,
    `weekly_frequency_lower` = NULL,
    `weekly_frequency_upper` = NULL,
    `weekly_impression` = NULL,
    `weekly_impression_lower` = NULL,
    `weekly_impression_upper` = NULL,
    `weekly_reach` = NULL,
    `weekly_reach_lower` = NULL,
    `weekly_reach_upper` = NULL,

    #' @description
    #' Initialize a new CampaignDeliveryEstimatesDerivedMetrics class.
    #'
    #' @param cpc Estimated cost per click.
    #' @param cpc_lower Lower estimate of the cost per click.
    #' @param cpc_upper Upper estimate of the cost per click.
    #' @param cpm Estimated cost per thousand impressions.
    #' @param cpm_lower Lower estimate of cost per thousand impressions.
    #' @param cpm_upper Upper estimate of cost per thousand impressions.
    #' @param lifetime_frequency Estimated lifetime frequency.
    #' @param lifetime_frequency_lower Lower estimate of lifetime frequency.
    #' @param lifetime_frequency_upper Upper estimate of lifetime frequency.
    #' @param lifetime_impression Estimated lifetime impressions.
    #' @param lifetime_impression_lower Lower estimate of lifetime impressions.
    #' @param lifetime_impression_upper Upper estimate of lifetime impressions.
    #' @param lifetime_reach Estimated lifetime reach.
    #' @param lifetime_reach_lower Lower estimate of lifetime reach.
    #' @param lifetime_reach_upper Upper estimate of lifetime reach.
    #' @param weekly_click Estimated weekly clicks.
    #' @param weekly_click_lower Lower estimate of weekly clicks.
    #' @param weekly_click_upper Upper estimate of weekly clicks.
    #' @param weekly_frequency Estimated weekly frequency.
    #' @param weekly_frequency_lower Lower estimate of weekly frequency.
    #' @param weekly_frequency_upper Upper estimate of weekly frequency.
    #' @param weekly_impression Estimated weekly impressions.
    #' @param weekly_impression_lower Lower estimate of weekly impressions.
    #' @param weekly_impression_upper Upper estimate of weekly impressions.
    #' @param weekly_reach Estimated weekly reach.
    #' @param weekly_reach_lower Lower estimate of weekly reach.
    #' @param weekly_reach_upper Upper estimate of weekly reach.
    #' @param ... Other optional arguments.
    initialize = function(`cpc` = NULL, `cpc_lower` = NULL, `cpc_upper` = NULL, `cpm` = NULL, `cpm_lower` = NULL, `cpm_upper` = NULL, `lifetime_frequency` = NULL, `lifetime_frequency_lower` = NULL, `lifetime_frequency_upper` = NULL, `lifetime_impression` = NULL, `lifetime_impression_lower` = NULL, `lifetime_impression_upper` = NULL, `lifetime_reach` = NULL, `lifetime_reach_lower` = NULL, `lifetime_reach_upper` = NULL, `weekly_click` = NULL, `weekly_click_lower` = NULL, `weekly_click_upper` = NULL, `weekly_frequency` = NULL, `weekly_frequency_lower` = NULL, `weekly_frequency_upper` = NULL, `weekly_impression` = NULL, `weekly_impression_lower` = NULL, `weekly_impression_upper` = NULL, `weekly_reach` = NULL, `weekly_reach_lower` = NULL, `weekly_reach_upper` = NULL, ...) {
      if (!is.null(`cpc`)) {
        if (!(is.numeric(`cpc`) && length(`cpc`) == 1)) {
          stop(paste("Error! Invalid data for `cpc`. Must be a number:", `cpc`))
        }
        self$`cpc` <- `cpc`
      }
      if (!is.null(`cpc_lower`)) {
        if (!(is.numeric(`cpc_lower`) && length(`cpc_lower`) == 1)) {
          stop(paste("Error! Invalid data for `cpc_lower`. Must be a number:", `cpc_lower`))
        }
        self$`cpc_lower` <- `cpc_lower`
      }
      if (!is.null(`cpc_upper`)) {
        if (!(is.numeric(`cpc_upper`) && length(`cpc_upper`) == 1)) {
          stop(paste("Error! Invalid data for `cpc_upper`. Must be a number:", `cpc_upper`))
        }
        self$`cpc_upper` <- `cpc_upper`
      }
      if (!is.null(`cpm`)) {
        if (!(is.numeric(`cpm`) && length(`cpm`) == 1)) {
          stop(paste("Error! Invalid data for `cpm`. Must be a number:", `cpm`))
        }
        self$`cpm` <- `cpm`
      }
      if (!is.null(`cpm_lower`)) {
        if (!(is.numeric(`cpm_lower`) && length(`cpm_lower`) == 1)) {
          stop(paste("Error! Invalid data for `cpm_lower`. Must be a number:", `cpm_lower`))
        }
        self$`cpm_lower` <- `cpm_lower`
      }
      if (!is.null(`cpm_upper`)) {
        if (!(is.numeric(`cpm_upper`) && length(`cpm_upper`) == 1)) {
          stop(paste("Error! Invalid data for `cpm_upper`. Must be a number:", `cpm_upper`))
        }
        self$`cpm_upper` <- `cpm_upper`
      }
      if (!is.null(`lifetime_frequency`)) {
        if (!(is.numeric(`lifetime_frequency`) && length(`lifetime_frequency`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_frequency`. Must be a number:", `lifetime_frequency`))
        }
        self$`lifetime_frequency` <- `lifetime_frequency`
      }
      if (!is.null(`lifetime_frequency_lower`)) {
        if (!(is.numeric(`lifetime_frequency_lower`) && length(`lifetime_frequency_lower`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_frequency_lower`. Must be a number:", `lifetime_frequency_lower`))
        }
        self$`lifetime_frequency_lower` <- `lifetime_frequency_lower`
      }
      if (!is.null(`lifetime_frequency_upper`)) {
        if (!(is.numeric(`lifetime_frequency_upper`) && length(`lifetime_frequency_upper`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_frequency_upper`. Must be a number:", `lifetime_frequency_upper`))
        }
        self$`lifetime_frequency_upper` <- `lifetime_frequency_upper`
      }
      if (!is.null(`lifetime_impression`)) {
        if (!(is.numeric(`lifetime_impression`) && length(`lifetime_impression`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_impression`. Must be a number:", `lifetime_impression`))
        }
        self$`lifetime_impression` <- `lifetime_impression`
      }
      if (!is.null(`lifetime_impression_lower`)) {
        if (!(is.numeric(`lifetime_impression_lower`) && length(`lifetime_impression_lower`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_impression_lower`. Must be a number:", `lifetime_impression_lower`))
        }
        self$`lifetime_impression_lower` <- `lifetime_impression_lower`
      }
      if (!is.null(`lifetime_impression_upper`)) {
        if (!(is.numeric(`lifetime_impression_upper`) && length(`lifetime_impression_upper`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_impression_upper`. Must be a number:", `lifetime_impression_upper`))
        }
        self$`lifetime_impression_upper` <- `lifetime_impression_upper`
      }
      if (!is.null(`lifetime_reach`)) {
        if (!(is.numeric(`lifetime_reach`) && length(`lifetime_reach`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_reach`. Must be a number:", `lifetime_reach`))
        }
        self$`lifetime_reach` <- `lifetime_reach`
      }
      if (!is.null(`lifetime_reach_lower`)) {
        if (!(is.numeric(`lifetime_reach_lower`) && length(`lifetime_reach_lower`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_reach_lower`. Must be a number:", `lifetime_reach_lower`))
        }
        self$`lifetime_reach_lower` <- `lifetime_reach_lower`
      }
      if (!is.null(`lifetime_reach_upper`)) {
        if (!(is.numeric(`lifetime_reach_upper`) && length(`lifetime_reach_upper`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_reach_upper`. Must be a number:", `lifetime_reach_upper`))
        }
        self$`lifetime_reach_upper` <- `lifetime_reach_upper`
      }
      if (!is.null(`weekly_click`)) {
        if (!(is.numeric(`weekly_click`) && length(`weekly_click`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_click`. Must be a number:", `weekly_click`))
        }
        self$`weekly_click` <- `weekly_click`
      }
      if (!is.null(`weekly_click_lower`)) {
        if (!(is.numeric(`weekly_click_lower`) && length(`weekly_click_lower`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_click_lower`. Must be a number:", `weekly_click_lower`))
        }
        self$`weekly_click_lower` <- `weekly_click_lower`
      }
      if (!is.null(`weekly_click_upper`)) {
        if (!(is.numeric(`weekly_click_upper`) && length(`weekly_click_upper`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_click_upper`. Must be a number:", `weekly_click_upper`))
        }
        self$`weekly_click_upper` <- `weekly_click_upper`
      }
      if (!is.null(`weekly_frequency`)) {
        if (!(is.numeric(`weekly_frequency`) && length(`weekly_frequency`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_frequency`. Must be a number:", `weekly_frequency`))
        }
        self$`weekly_frequency` <- `weekly_frequency`
      }
      if (!is.null(`weekly_frequency_lower`)) {
        if (!(is.numeric(`weekly_frequency_lower`) && length(`weekly_frequency_lower`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_frequency_lower`. Must be a number:", `weekly_frequency_lower`))
        }
        self$`weekly_frequency_lower` <- `weekly_frequency_lower`
      }
      if (!is.null(`weekly_frequency_upper`)) {
        if (!(is.numeric(`weekly_frequency_upper`) && length(`weekly_frequency_upper`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_frequency_upper`. Must be a number:", `weekly_frequency_upper`))
        }
        self$`weekly_frequency_upper` <- `weekly_frequency_upper`
      }
      if (!is.null(`weekly_impression`)) {
        if (!(is.numeric(`weekly_impression`) && length(`weekly_impression`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_impression`. Must be a number:", `weekly_impression`))
        }
        self$`weekly_impression` <- `weekly_impression`
      }
      if (!is.null(`weekly_impression_lower`)) {
        if (!(is.numeric(`weekly_impression_lower`) && length(`weekly_impression_lower`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_impression_lower`. Must be a number:", `weekly_impression_lower`))
        }
        self$`weekly_impression_lower` <- `weekly_impression_lower`
      }
      if (!is.null(`weekly_impression_upper`)) {
        if (!(is.numeric(`weekly_impression_upper`) && length(`weekly_impression_upper`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_impression_upper`. Must be a number:", `weekly_impression_upper`))
        }
        self$`weekly_impression_upper` <- `weekly_impression_upper`
      }
      if (!is.null(`weekly_reach`)) {
        if (!(is.numeric(`weekly_reach`) && length(`weekly_reach`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_reach`. Must be a number:", `weekly_reach`))
        }
        self$`weekly_reach` <- `weekly_reach`
      }
      if (!is.null(`weekly_reach_lower`)) {
        if (!(is.numeric(`weekly_reach_lower`) && length(`weekly_reach_lower`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_reach_lower`. Must be a number:", `weekly_reach_lower`))
        }
        self$`weekly_reach_lower` <- `weekly_reach_lower`
      }
      if (!is.null(`weekly_reach_upper`)) {
        if (!(is.numeric(`weekly_reach_upper`) && length(`weekly_reach_upper`) == 1)) {
          stop(paste("Error! Invalid data for `weekly_reach_upper`. Must be a number:", `weekly_reach_upper`))
        }
        self$`weekly_reach_upper` <- `weekly_reach_upper`
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
    #' @return CampaignDeliveryEstimatesDerivedMetrics as a base R list.
    #' @examples
    #' # convert array of CampaignDeliveryEstimatesDerivedMetrics (x) to a data frame
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
    #' Convert CampaignDeliveryEstimatesDerivedMetrics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignDeliveryEstimatesDerivedMetricsObject <- list()
      if (!is.null(self$`cpc`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["cpc"]] <-
          self$`cpc`
      }
      if (!is.null(self$`cpc_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["cpc_lower"]] <-
          self$`cpc_lower`
      }
      if (!is.null(self$`cpc_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["cpc_upper"]] <-
          self$`cpc_upper`
      }
      if (!is.null(self$`cpm`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["cpm"]] <-
          self$`cpm`
      }
      if (!is.null(self$`cpm_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["cpm_lower"]] <-
          self$`cpm_lower`
      }
      if (!is.null(self$`cpm_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["cpm_upper"]] <-
          self$`cpm_upper`
      }
      if (!is.null(self$`lifetime_frequency`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_frequency"]] <-
          self$`lifetime_frequency`
      }
      if (!is.null(self$`lifetime_frequency_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_frequency_lower"]] <-
          self$`lifetime_frequency_lower`
      }
      if (!is.null(self$`lifetime_frequency_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_frequency_upper"]] <-
          self$`lifetime_frequency_upper`
      }
      if (!is.null(self$`lifetime_impression`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_impression"]] <-
          self$`lifetime_impression`
      }
      if (!is.null(self$`lifetime_impression_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_impression_lower"]] <-
          self$`lifetime_impression_lower`
      }
      if (!is.null(self$`lifetime_impression_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_impression_upper"]] <-
          self$`lifetime_impression_upper`
      }
      if (!is.null(self$`lifetime_reach`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_reach"]] <-
          self$`lifetime_reach`
      }
      if (!is.null(self$`lifetime_reach_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_reach_lower"]] <-
          self$`lifetime_reach_lower`
      }
      if (!is.null(self$`lifetime_reach_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["lifetime_reach_upper"]] <-
          self$`lifetime_reach_upper`
      }
      if (!is.null(self$`weekly_click`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_click"]] <-
          self$`weekly_click`
      }
      if (!is.null(self$`weekly_click_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_click_lower"]] <-
          self$`weekly_click_lower`
      }
      if (!is.null(self$`weekly_click_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_click_upper"]] <-
          self$`weekly_click_upper`
      }
      if (!is.null(self$`weekly_frequency`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_frequency"]] <-
          self$`weekly_frequency`
      }
      if (!is.null(self$`weekly_frequency_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_frequency_lower"]] <-
          self$`weekly_frequency_lower`
      }
      if (!is.null(self$`weekly_frequency_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_frequency_upper"]] <-
          self$`weekly_frequency_upper`
      }
      if (!is.null(self$`weekly_impression`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_impression"]] <-
          self$`weekly_impression`
      }
      if (!is.null(self$`weekly_impression_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_impression_lower"]] <-
          self$`weekly_impression_lower`
      }
      if (!is.null(self$`weekly_impression_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_impression_upper"]] <-
          self$`weekly_impression_upper`
      }
      if (!is.null(self$`weekly_reach`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_reach"]] <-
          self$`weekly_reach`
      }
      if (!is.null(self$`weekly_reach_lower`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_reach_lower"]] <-
          self$`weekly_reach_lower`
      }
      if (!is.null(self$`weekly_reach_upper`)) {
        CampaignDeliveryEstimatesDerivedMetricsObject[["weekly_reach_upper"]] <-
          self$`weekly_reach_upper`
      }
      return(CampaignDeliveryEstimatesDerivedMetricsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignDeliveryEstimatesDerivedMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDeliveryEstimatesDerivedMetrics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cpc`)) {
        self$`cpc` <- this_object$`cpc`
      }
      if (!is.null(this_object$`cpc_lower`)) {
        self$`cpc_lower` <- this_object$`cpc_lower`
      }
      if (!is.null(this_object$`cpc_upper`)) {
        self$`cpc_upper` <- this_object$`cpc_upper`
      }
      if (!is.null(this_object$`cpm`)) {
        self$`cpm` <- this_object$`cpm`
      }
      if (!is.null(this_object$`cpm_lower`)) {
        self$`cpm_lower` <- this_object$`cpm_lower`
      }
      if (!is.null(this_object$`cpm_upper`)) {
        self$`cpm_upper` <- this_object$`cpm_upper`
      }
      if (!is.null(this_object$`lifetime_frequency`)) {
        self$`lifetime_frequency` <- this_object$`lifetime_frequency`
      }
      if (!is.null(this_object$`lifetime_frequency_lower`)) {
        self$`lifetime_frequency_lower` <- this_object$`lifetime_frequency_lower`
      }
      if (!is.null(this_object$`lifetime_frequency_upper`)) {
        self$`lifetime_frequency_upper` <- this_object$`lifetime_frequency_upper`
      }
      if (!is.null(this_object$`lifetime_impression`)) {
        self$`lifetime_impression` <- this_object$`lifetime_impression`
      }
      if (!is.null(this_object$`lifetime_impression_lower`)) {
        self$`lifetime_impression_lower` <- this_object$`lifetime_impression_lower`
      }
      if (!is.null(this_object$`lifetime_impression_upper`)) {
        self$`lifetime_impression_upper` <- this_object$`lifetime_impression_upper`
      }
      if (!is.null(this_object$`lifetime_reach`)) {
        self$`lifetime_reach` <- this_object$`lifetime_reach`
      }
      if (!is.null(this_object$`lifetime_reach_lower`)) {
        self$`lifetime_reach_lower` <- this_object$`lifetime_reach_lower`
      }
      if (!is.null(this_object$`lifetime_reach_upper`)) {
        self$`lifetime_reach_upper` <- this_object$`lifetime_reach_upper`
      }
      if (!is.null(this_object$`weekly_click`)) {
        self$`weekly_click` <- this_object$`weekly_click`
      }
      if (!is.null(this_object$`weekly_click_lower`)) {
        self$`weekly_click_lower` <- this_object$`weekly_click_lower`
      }
      if (!is.null(this_object$`weekly_click_upper`)) {
        self$`weekly_click_upper` <- this_object$`weekly_click_upper`
      }
      if (!is.null(this_object$`weekly_frequency`)) {
        self$`weekly_frequency` <- this_object$`weekly_frequency`
      }
      if (!is.null(this_object$`weekly_frequency_lower`)) {
        self$`weekly_frequency_lower` <- this_object$`weekly_frequency_lower`
      }
      if (!is.null(this_object$`weekly_frequency_upper`)) {
        self$`weekly_frequency_upper` <- this_object$`weekly_frequency_upper`
      }
      if (!is.null(this_object$`weekly_impression`)) {
        self$`weekly_impression` <- this_object$`weekly_impression`
      }
      if (!is.null(this_object$`weekly_impression_lower`)) {
        self$`weekly_impression_lower` <- this_object$`weekly_impression_lower`
      }
      if (!is.null(this_object$`weekly_impression_upper`)) {
        self$`weekly_impression_upper` <- this_object$`weekly_impression_upper`
      }
      if (!is.null(this_object$`weekly_reach`)) {
        self$`weekly_reach` <- this_object$`weekly_reach`
      }
      if (!is.null(this_object$`weekly_reach_lower`)) {
        self$`weekly_reach_lower` <- this_object$`weekly_reach_lower`
      }
      if (!is.null(this_object$`weekly_reach_upper`)) {
        self$`weekly_reach_upper` <- this_object$`weekly_reach_upper`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignDeliveryEstimatesDerivedMetrics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignDeliveryEstimatesDerivedMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDeliveryEstimatesDerivedMetrics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cpc` <- this_object$`cpc`
      self$`cpc_lower` <- this_object$`cpc_lower`
      self$`cpc_upper` <- this_object$`cpc_upper`
      self$`cpm` <- this_object$`cpm`
      self$`cpm_lower` <- this_object$`cpm_lower`
      self$`cpm_upper` <- this_object$`cpm_upper`
      self$`lifetime_frequency` <- this_object$`lifetime_frequency`
      self$`lifetime_frequency_lower` <- this_object$`lifetime_frequency_lower`
      self$`lifetime_frequency_upper` <- this_object$`lifetime_frequency_upper`
      self$`lifetime_impression` <- this_object$`lifetime_impression`
      self$`lifetime_impression_lower` <- this_object$`lifetime_impression_lower`
      self$`lifetime_impression_upper` <- this_object$`lifetime_impression_upper`
      self$`lifetime_reach` <- this_object$`lifetime_reach`
      self$`lifetime_reach_lower` <- this_object$`lifetime_reach_lower`
      self$`lifetime_reach_upper` <- this_object$`lifetime_reach_upper`
      self$`weekly_click` <- this_object$`weekly_click`
      self$`weekly_click_lower` <- this_object$`weekly_click_lower`
      self$`weekly_click_upper` <- this_object$`weekly_click_upper`
      self$`weekly_frequency` <- this_object$`weekly_frequency`
      self$`weekly_frequency_lower` <- this_object$`weekly_frequency_lower`
      self$`weekly_frequency_upper` <- this_object$`weekly_frequency_upper`
      self$`weekly_impression` <- this_object$`weekly_impression`
      self$`weekly_impression_lower` <- this_object$`weekly_impression_lower`
      self$`weekly_impression_upper` <- this_object$`weekly_impression_upper`
      self$`weekly_reach` <- this_object$`weekly_reach`
      self$`weekly_reach_lower` <- this_object$`weekly_reach_lower`
      self$`weekly_reach_upper` <- this_object$`weekly_reach_upper`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignDeliveryEstimatesDerivedMetrics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignDeliveryEstimatesDerivedMetrics
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
# CampaignDeliveryEstimatesDerivedMetrics$unlock()
#
## Below is an example to define the print function
# CampaignDeliveryEstimatesDerivedMetrics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignDeliveryEstimatesDerivedMetrics$lock()

