#' Create a new CampaignResponse
#'
#' @description
#' CampaignResponse Class
#'
#' @docType class
#' @title CampaignResponse
#' @description CampaignResponse Class
#' @format An \code{R6Class} generator object
#' @field id Campaign ID. character [optional]
#' @field ad_account_id Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. character [optional]
#' @field daily_spend_cap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. integer [optional]
#' @field end_time Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. integer [optional]
#' @field is_automated_campaign Specifies whether the campaign was created in the automated campaign flow character [optional]
#' @field is_flexible_daily_budgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". character [optional]
#' @field lifetime_spend_cap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. integer [optional]
#' @field name Campaign name. character [optional]
#' @field order_line_id Order line ID that appears on the invoice. character [optional]
#' @field start_time Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. integer [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @field bid_options  \link{CampaignBidOptions} [optional]
#' @field created_time Campaign creation time. Unix timestamp in seconds. integer [optional]
#' @field is_campaign_budget_optimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. character [optional]
#' @field is_performance_plus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. character [optional]
#' @field objective_type  \link{ObjectiveType} [optional]
#' @field summary_status  \link{CampaignSummaryStatus} [optional]
#' @field type Always \"campaign\". character [optional]
#' @field updated_time UTC timestamp. Last update time. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignResponse <- R6::R6Class(
  "CampaignResponse",
  public = list(
    `id` = NULL,
    `ad_account_id` = NULL,
    `daily_spend_cap` = NULL,
    `end_time` = NULL,
    `is_automated_campaign` = NULL,
    `is_flexible_daily_budgets` = NULL,
    `lifetime_spend_cap` = NULL,
    `name` = NULL,
    `order_line_id` = NULL,
    `start_time` = NULL,
    `status` = NULL,
    `tracking_urls` = NULL,
    `bid_options` = NULL,
    `created_time` = NULL,
    `is_campaign_budget_optimization` = NULL,
    `is_performance_plus` = NULL,
    `objective_type` = NULL,
    `summary_status` = NULL,
    `type` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new CampaignResponse class.
    #'
    #' @param id Campaign ID.
    #' @param ad_account_id Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
    #' @param daily_spend_cap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
    #' @param end_time Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
    #' @param is_automated_campaign Specifies whether the campaign was created in the automated campaign flow
    #' @param is_flexible_daily_budgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
    #' @param lifetime_spend_cap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
    #' @param name Campaign name.
    #' @param order_line_id Order line ID that appears on the invoice.
    #' @param start_time Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
    #' @param status status
    #' @param tracking_urls tracking_urls
    #' @param bid_options bid_options
    #' @param created_time Campaign creation time. Unix timestamp in seconds.
    #' @param is_campaign_budget_optimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
    #' @param is_performance_plus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
    #' @param objective_type objective_type
    #' @param summary_status summary_status
    #' @param type Always \"campaign\".
    #' @param updated_time UTC timestamp. Last update time.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `ad_account_id` = NULL, `daily_spend_cap` = NULL, `end_time` = NULL, `is_automated_campaign` = NULL, `is_flexible_daily_budgets` = NULL, `lifetime_spend_cap` = NULL, `name` = NULL, `order_line_id` = NULL, `start_time` = NULL, `status` = NULL, `tracking_urls` = NULL, `bid_options` = NULL, `created_time` = NULL, `is_campaign_budget_optimization` = NULL, `is_performance_plus` = NULL, `objective_type` = NULL, `summary_status` = NULL, `type` = NULL, `updated_time` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`daily_spend_cap`)) {
        if (!(is.numeric(`daily_spend_cap`) && length(`daily_spend_cap`) == 1)) {
          stop(paste("Error! Invalid data for `daily_spend_cap`. Must be an integer:", `daily_spend_cap`))
        }
        self$`daily_spend_cap` <- `daily_spend_cap`
      }
      if (!is.null(`end_time`)) {
        if (!(is.numeric(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!is.null(`is_automated_campaign`)) {
        if (!(is.logical(`is_automated_campaign`) && length(`is_automated_campaign`) == 1)) {
          stop(paste("Error! Invalid data for `is_automated_campaign`. Must be a boolean:", `is_automated_campaign`))
        }
        self$`is_automated_campaign` <- `is_automated_campaign`
      }
      if (!is.null(`is_flexible_daily_budgets`)) {
        if (!(is.logical(`is_flexible_daily_budgets`) && length(`is_flexible_daily_budgets`) == 1)) {
          stop(paste("Error! Invalid data for `is_flexible_daily_budgets`. Must be a boolean:", `is_flexible_daily_budgets`))
        }
        self$`is_flexible_daily_budgets` <- `is_flexible_daily_budgets`
      }
      if (!is.null(`lifetime_spend_cap`)) {
        if (!(is.numeric(`lifetime_spend_cap`) && length(`lifetime_spend_cap`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_spend_cap`. Must be an integer:", `lifetime_spend_cap`))
        }
        self$`lifetime_spend_cap` <- `lifetime_spend_cap`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`order_line_id`)) {
        if (!(is.character(`order_line_id`) && length(`order_line_id`) == 1)) {
          stop(paste("Error! Invalid data for `order_line_id`. Must be a string:", `order_line_id`))
        }
        self$`order_line_id` <- `order_line_id`
      }
      if (!is.null(`start_time`)) {
        if (!(is.numeric(`start_time`) && length(`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be an integer:", `start_time`))
        }
        self$`start_time` <- `start_time`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`tracking_urls`)) {
        stopifnot(R6::is.R6(`tracking_urls`))
        self$`tracking_urls` <- `tracking_urls`
      }
      if (!is.null(`bid_options`)) {
        stopifnot(R6::is.R6(`bid_options`))
        self$`bid_options` <- `bid_options`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`is_campaign_budget_optimization`)) {
        if (!(is.logical(`is_campaign_budget_optimization`) && length(`is_campaign_budget_optimization`) == 1)) {
          stop(paste("Error! Invalid data for `is_campaign_budget_optimization`. Must be a boolean:", `is_campaign_budget_optimization`))
        }
        self$`is_campaign_budget_optimization` <- `is_campaign_budget_optimization`
      }
      if (!is.null(`is_performance_plus`)) {
        if (!(is.logical(`is_performance_plus`) && length(`is_performance_plus`) == 1)) {
          stop(paste("Error! Invalid data for `is_performance_plus`. Must be a boolean:", `is_performance_plus`))
        }
        self$`is_performance_plus` <- `is_performance_plus`
      }
      if (!is.null(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
      }
      if (!is.null(`summary_status`)) {
        if (!(`summary_status` %in% c())) {
          stop(paste("Error! \"", `summary_status`, "\" cannot be assigned to `summary_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`summary_status`))
        self$`summary_status` <- `summary_status`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
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
    #' @return CampaignResponse as a base R list.
    #' @examples
    #' # convert array of CampaignResponse (x) to a data frame
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
    #' Convert CampaignResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignResponseObject <- list()
      if (!is.null(self$`id`)) {
        CampaignResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ad_account_id`)) {
        CampaignResponseObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`daily_spend_cap`)) {
        CampaignResponseObject[["daily_spend_cap"]] <-
          self$`daily_spend_cap`
      }
      if (!is.null(self$`end_time`)) {
        CampaignResponseObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`is_automated_campaign`)) {
        CampaignResponseObject[["is_automated_campaign"]] <-
          self$`is_automated_campaign`
      }
      if (!is.null(self$`is_flexible_daily_budgets`)) {
        CampaignResponseObject[["is_flexible_daily_budgets"]] <-
          self$`is_flexible_daily_budgets`
      }
      if (!is.null(self$`lifetime_spend_cap`)) {
        CampaignResponseObject[["lifetime_spend_cap"]] <-
          self$`lifetime_spend_cap`
      }
      if (!is.null(self$`name`)) {
        CampaignResponseObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`order_line_id`)) {
        CampaignResponseObject[["order_line_id"]] <-
          self$`order_line_id`
      }
      if (!is.null(self$`start_time`)) {
        CampaignResponseObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`status`)) {
        CampaignResponseObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`tracking_urls`)) {
        CampaignResponseObject[["tracking_urls"]] <-
          self$`tracking_urls`$toSimpleType()
      }
      if (!is.null(self$`bid_options`)) {
        CampaignResponseObject[["bid_options"]] <-
          self$`bid_options`$toSimpleType()
      }
      if (!is.null(self$`created_time`)) {
        CampaignResponseObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`is_campaign_budget_optimization`)) {
        CampaignResponseObject[["is_campaign_budget_optimization"]] <-
          self$`is_campaign_budget_optimization`
      }
      if (!is.null(self$`is_performance_plus`)) {
        CampaignResponseObject[["is_performance_plus"]] <-
          self$`is_performance_plus`
      }
      if (!is.null(self$`objective_type`)) {
        CampaignResponseObject[["objective_type"]] <-
          self$`objective_type`$toSimpleType()
      }
      if (!is.null(self$`summary_status`)) {
        CampaignResponseObject[["summary_status"]] <-
          self$`summary_status`$toSimpleType()
      }
      if (!is.null(self$`type`)) {
        CampaignResponseObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`updated_time`)) {
        CampaignResponseObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(CampaignResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`daily_spend_cap`)) {
        self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`is_automated_campaign`)) {
        self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      }
      if (!is.null(this_object$`is_flexible_daily_budgets`)) {
        self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      }
      if (!is.null(this_object$`lifetime_spend_cap`)) {
        self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`order_line_id`)) {
        self$`order_line_id` <- this_object$`order_line_id`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`bid_options`)) {
        `bid_options_object` <- CampaignBidOptions$new()
        `bid_options_object`$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
        self$`bid_options` <- `bid_options_object`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`is_campaign_budget_optimization`)) {
        self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      }
      if (!is.null(this_object$`is_performance_plus`)) {
        self$`is_performance_plus` <- this_object$`is_performance_plus`
      }
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- ObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
      }
      if (!is.null(this_object$`summary_status`)) {
        `summary_status_object` <- CampaignSummaryStatus$new()
        `summary_status_object`$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
        self$`summary_status` <- `summary_status_object`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      self$`end_time` <- this_object$`end_time`
      self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      self$`name` <- this_object$`name`
      self$`order_line_id` <- this_object$`order_line_id`
      self$`start_time` <- this_object$`start_time`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`bid_options` <- CampaignBidOptions$new()$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      self$`is_performance_plus` <- this_object$`is_performance_plus`
      self$`objective_type` <- ObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self$`summary_status` <- CampaignSummaryStatus$new()$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`order_line_id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`order_line_id`, "^\\d+$")) {
        invalid_fields["order_line_id"] <- "Invalid value for `order_line_id`, must conform to the pattern ^\\d+$."
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
# CampaignResponse$unlock()
#
## Below is an example to define the print function
# CampaignResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignResponse$lock()

