#' Create a new Campaign
#'
#' @description
#' Campaign Class
#'
#' @docType class
#' @title Campaign
#' @description Campaign Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Campaign's Advertiser ID. character [optional]
#' @field bid_options [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. \link{CampaignBidOptions} [optional]
#' @field created_time Campaign creation time. Unix timestamp in seconds. integer [optional]
#' @field daily_spend_cap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. integer [optional]
#' @field default_ad_group_budget_in_micro_currency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. integer [optional]
#' @field end_time Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. integer [optional]
#' @field id Campaign ID, must be associated with the ad account ID provided in the path. character
#' @field intended_promotion_type  \link{IntendedPromotionType} [optional]
#' @field is_automated_campaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES character [optional]
#' @field is_campaign_budget_optimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. character [optional]
#' @field is_carting Whether the campaign contains a carting(where-to-buy link) ad. character [optional]
#' @field is_flexible_daily_budgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. character [optional]
#' @field is_ltv_optimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. character [optional]
#' @field is_performance_plus Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) character [optional]
#' @field is_top_of_search Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. character [optional]
#' @field lifetime_spend_cap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. integer [optional]
#' @field name Campaign name - 255 chars max. character [optional]
#' @field objective_type  \link{CampaignObjectiveType}
#' @field order_line_id Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. character [optional]
#' @field performance_plus_campaign_settings Pinterest Performance+ campaign settings. \link{PerformancePlusCampaignSettings} [optional]
#' @field start_time Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. integer [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field summary_status  \link{SummaryStatus} [optional]
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @field type Always \"campaign\". character [optional]
#' @field updated_time UTC timestamp. Last update time. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Campaign <- R6::R6Class(
  "Campaign",
  public = list(
    `ad_account_id` = NULL,
    `bid_options` = NULL,
    `created_time` = NULL,
    `daily_spend_cap` = NULL,
    `default_ad_group_budget_in_micro_currency` = NULL,
    `end_time` = NULL,
    `id` = NULL,
    `intended_promotion_type` = NULL,
    `is_automated_campaign` = NULL,
    `is_campaign_budget_optimization` = NULL,
    `is_carting` = NULL,
    `is_flexible_daily_budgets` = NULL,
    `is_ltv_optimized` = NULL,
    `is_performance_plus` = NULL,
    `is_top_of_search` = NULL,
    `lifetime_spend_cap` = NULL,
    `name` = NULL,
    `objective_type` = NULL,
    `order_line_id` = NULL,
    `performance_plus_campaign_settings` = NULL,
    `start_time` = NULL,
    `status` = NULL,
    `summary_status` = NULL,
    `tracking_urls` = NULL,
    `type` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new Campaign class.
    #'
    #' @param id Campaign ID, must be associated with the ad account ID provided in the path.
    #' @param objective_type objective_type
    #' @param ad_account_id Campaign's Advertiser ID.
    #' @param bid_options [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
    #' @param created_time Campaign creation time. Unix timestamp in seconds.
    #' @param daily_spend_cap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
    #' @param default_ad_group_budget_in_micro_currency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
    #' @param end_time Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
    #' @param intended_promotion_type intended_promotion_type
    #' @param is_automated_campaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
    #' @param is_campaign_budget_optimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
    #' @param is_carting Whether the campaign contains a carting(where-to-buy link) ad.
    #' @param is_flexible_daily_budgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
    #' @param is_ltv_optimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
    #' @param is_performance_plus Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
    #' @param is_top_of_search Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
    #' @param lifetime_spend_cap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
    #' @param name Campaign name - 255 chars max.
    #' @param order_line_id Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
    #' @param performance_plus_campaign_settings Pinterest Performance+ campaign settings.
    #' @param start_time Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
    #' @param status status
    #' @param summary_status summary_status
    #' @param tracking_urls tracking_urls
    #' @param type Always \"campaign\".
    #' @param updated_time UTC timestamp. Last update time.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `objective_type`, `ad_account_id` = NULL, `bid_options` = NULL, `created_time` = NULL, `daily_spend_cap` = NULL, `default_ad_group_budget_in_micro_currency` = NULL, `end_time` = NULL, `intended_promotion_type` = NULL, `is_automated_campaign` = NULL, `is_campaign_budget_optimization` = NULL, `is_carting` = NULL, `is_flexible_daily_budgets` = NULL, `is_ltv_optimized` = NULL, `is_performance_plus` = NULL, `is_top_of_search` = NULL, `lifetime_spend_cap` = NULL, `name` = NULL, `order_line_id` = NULL, `performance_plus_campaign_settings` = NULL, `start_time` = NULL, `status` = NULL, `summary_status` = NULL, `tracking_urls` = NULL, `type` = NULL, `updated_time` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
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
      if (!is.null(`daily_spend_cap`)) {
        if (!(is.numeric(`daily_spend_cap`) && length(`daily_spend_cap`) == 1)) {
          stop(paste("Error! Invalid data for `daily_spend_cap`. Must be an integer:", `daily_spend_cap`))
        }
        self$`daily_spend_cap` <- `daily_spend_cap`
      }
      if (!is.null(`default_ad_group_budget_in_micro_currency`)) {
        if (!(is.numeric(`default_ad_group_budget_in_micro_currency`) && length(`default_ad_group_budget_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `default_ad_group_budget_in_micro_currency`. Must be an integer:", `default_ad_group_budget_in_micro_currency`))
        }
        self$`default_ad_group_budget_in_micro_currency` <- `default_ad_group_budget_in_micro_currency`
      }
      if (!is.null(`end_time`)) {
        if (!(is.numeric(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!is.null(`intended_promotion_type`)) {
        if (!(`intended_promotion_type` %in% c())) {
          stop(paste("Error! \"", `intended_promotion_type`, "\" cannot be assigned to `intended_promotion_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`intended_promotion_type`))
        self$`intended_promotion_type` <- `intended_promotion_type`
      }
      if (!is.null(`is_automated_campaign`)) {
        if (!(is.logical(`is_automated_campaign`) && length(`is_automated_campaign`) == 1)) {
          stop(paste("Error! Invalid data for `is_automated_campaign`. Must be a boolean:", `is_automated_campaign`))
        }
        self$`is_automated_campaign` <- `is_automated_campaign`
      }
      if (!is.null(`is_campaign_budget_optimization`)) {
        if (!(is.logical(`is_campaign_budget_optimization`) && length(`is_campaign_budget_optimization`) == 1)) {
          stop(paste("Error! Invalid data for `is_campaign_budget_optimization`. Must be a boolean:", `is_campaign_budget_optimization`))
        }
        self$`is_campaign_budget_optimization` <- `is_campaign_budget_optimization`
      }
      if (!is.null(`is_carting`)) {
        if (!(is.logical(`is_carting`) && length(`is_carting`) == 1)) {
          stop(paste("Error! Invalid data for `is_carting`. Must be a boolean:", `is_carting`))
        }
        self$`is_carting` <- `is_carting`
      }
      if (!is.null(`is_flexible_daily_budgets`)) {
        if (!(is.logical(`is_flexible_daily_budgets`) && length(`is_flexible_daily_budgets`) == 1)) {
          stop(paste("Error! Invalid data for `is_flexible_daily_budgets`. Must be a boolean:", `is_flexible_daily_budgets`))
        }
        self$`is_flexible_daily_budgets` <- `is_flexible_daily_budgets`
      }
      if (!is.null(`is_ltv_optimized`)) {
        if (!(is.logical(`is_ltv_optimized`) && length(`is_ltv_optimized`) == 1)) {
          stop(paste("Error! Invalid data for `is_ltv_optimized`. Must be a boolean:", `is_ltv_optimized`))
        }
        self$`is_ltv_optimized` <- `is_ltv_optimized`
      }
      if (!is.null(`is_performance_plus`)) {
        if (!(is.logical(`is_performance_plus`) && length(`is_performance_plus`) == 1)) {
          stop(paste("Error! Invalid data for `is_performance_plus`. Must be a boolean:", `is_performance_plus`))
        }
        self$`is_performance_plus` <- `is_performance_plus`
      }
      if (!is.null(`is_top_of_search`)) {
        if (!(is.logical(`is_top_of_search`) && length(`is_top_of_search`) == 1)) {
          stop(paste("Error! Invalid data for `is_top_of_search`. Must be a boolean:", `is_top_of_search`))
        }
        self$`is_top_of_search` <- `is_top_of_search`
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
      if (!is.null(`performance_plus_campaign_settings`)) {
        stopifnot(R6::is.R6(`performance_plus_campaign_settings`))
        self$`performance_plus_campaign_settings` <- `performance_plus_campaign_settings`
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
      if (!is.null(`summary_status`)) {
        if (!(`summary_status` %in% c())) {
          stop(paste("Error! \"", `summary_status`, "\" cannot be assigned to `summary_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`summary_status`))
        self$`summary_status` <- `summary_status`
      }
      if (!is.null(`tracking_urls`)) {
        stopifnot(R6::is.R6(`tracking_urls`))
        self$`tracking_urls` <- `tracking_urls`
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
    #' @return Campaign as a base R list.
    #' @examples
    #' # convert array of Campaign (x) to a data frame
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
    #' Convert Campaign to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CampaignObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`bid_options`)) {
        CampaignObject[["bid_options"]] <-
          self$extractSimpleType(self$`bid_options`)
      }
      if (!is.null(self$`created_time`)) {
        CampaignObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`daily_spend_cap`)) {
        CampaignObject[["daily_spend_cap"]] <-
          self$`daily_spend_cap`
      }
      if (!is.null(self$`default_ad_group_budget_in_micro_currency`)) {
        CampaignObject[["default_ad_group_budget_in_micro_currency"]] <-
          self$`default_ad_group_budget_in_micro_currency`
      }
      if (!is.null(self$`end_time`)) {
        CampaignObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`id`)) {
        CampaignObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`intended_promotion_type`)) {
        CampaignObject[["intended_promotion_type"]] <-
          self$extractSimpleType(self$`intended_promotion_type`)
      }
      if (!is.null(self$`is_automated_campaign`)) {
        CampaignObject[["is_automated_campaign"]] <-
          self$`is_automated_campaign`
      }
      if (!is.null(self$`is_campaign_budget_optimization`)) {
        CampaignObject[["is_campaign_budget_optimization"]] <-
          self$`is_campaign_budget_optimization`
      }
      if (!is.null(self$`is_carting`)) {
        CampaignObject[["is_carting"]] <-
          self$`is_carting`
      }
      if (!is.null(self$`is_flexible_daily_budgets`)) {
        CampaignObject[["is_flexible_daily_budgets"]] <-
          self$`is_flexible_daily_budgets`
      }
      if (!is.null(self$`is_ltv_optimized`)) {
        CampaignObject[["is_ltv_optimized"]] <-
          self$`is_ltv_optimized`
      }
      if (!is.null(self$`is_performance_plus`)) {
        CampaignObject[["is_performance_plus"]] <-
          self$`is_performance_plus`
      }
      if (!is.null(self$`is_top_of_search`)) {
        CampaignObject[["is_top_of_search"]] <-
          self$`is_top_of_search`
      }
      if (!is.null(self$`lifetime_spend_cap`)) {
        CampaignObject[["lifetime_spend_cap"]] <-
          self$`lifetime_spend_cap`
      }
      if (!is.null(self$`name`)) {
        CampaignObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`objective_type`)) {
        CampaignObject[["objective_type"]] <-
          self$extractSimpleType(self$`objective_type`)
      }
      if (!is.null(self$`order_line_id`)) {
        CampaignObject[["order_line_id"]] <-
          self$`order_line_id`
      }
      if (!is.null(self$`performance_plus_campaign_settings`)) {
        CampaignObject[["performance_plus_campaign_settings"]] <-
          self$extractSimpleType(self$`performance_plus_campaign_settings`)
      }
      if (!is.null(self$`start_time`)) {
        CampaignObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`status`)) {
        CampaignObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`summary_status`)) {
        CampaignObject[["summary_status"]] <-
          self$extractSimpleType(self$`summary_status`)
      }
      if (!is.null(self$`tracking_urls`)) {
        CampaignObject[["tracking_urls"]] <-
          self$extractSimpleType(self$`tracking_urls`)
      }
      if (!is.null(self$`type`)) {
        CampaignObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`updated_time`)) {
        CampaignObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(CampaignObject)
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
    #' Deserialize JSON string into an instance of Campaign
    #'
    #' @param input_json the JSON input
    #' @return the instance of Campaign
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`bid_options`)) {
        `bid_options_object` <- CampaignBidOptions$new()
        `bid_options_object`$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
        self$`bid_options` <- `bid_options_object`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`daily_spend_cap`)) {
        self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      }
      if (!is.null(this_object$`default_ad_group_budget_in_micro_currency`)) {
        self$`default_ad_group_budget_in_micro_currency` <- this_object$`default_ad_group_budget_in_micro_currency`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`intended_promotion_type`)) {
        `intended_promotion_type_object` <- IntendedPromotionType$new()
        `intended_promotion_type_object`$fromJSON(jsonlite::toJSON(this_object$`intended_promotion_type`, auto_unbox = TRUE, digits = NA))
        self$`intended_promotion_type` <- `intended_promotion_type_object`
      }
      if (!is.null(this_object$`is_automated_campaign`)) {
        self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      }
      if (!is.null(this_object$`is_campaign_budget_optimization`)) {
        self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      }
      if (!is.null(this_object$`is_carting`)) {
        self$`is_carting` <- this_object$`is_carting`
      }
      if (!is.null(this_object$`is_flexible_daily_budgets`)) {
        self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      }
      if (!is.null(this_object$`is_ltv_optimized`)) {
        self$`is_ltv_optimized` <- this_object$`is_ltv_optimized`
      }
      if (!is.null(this_object$`is_performance_plus`)) {
        self$`is_performance_plus` <- this_object$`is_performance_plus`
      }
      if (!is.null(this_object$`is_top_of_search`)) {
        self$`is_top_of_search` <- this_object$`is_top_of_search`
      }
      if (!is.null(this_object$`lifetime_spend_cap`)) {
        self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- CampaignObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
      }
      if (!is.null(this_object$`order_line_id`)) {
        self$`order_line_id` <- this_object$`order_line_id`
      }
      if (!is.null(this_object$`performance_plus_campaign_settings`)) {
        `performance_plus_campaign_settings_object` <- PerformancePlusCampaignSettings$new()
        `performance_plus_campaign_settings_object`$fromJSON(jsonlite::toJSON(this_object$`performance_plus_campaign_settings`, auto_unbox = TRUE, digits = NA))
        self$`performance_plus_campaign_settings` <- `performance_plus_campaign_settings_object`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`summary_status`)) {
        `summary_status_object` <- SummaryStatus$new()
        `summary_status_object`$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
        self$`summary_status` <- `summary_status_object`
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
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
    #' @return Campaign in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Campaign
    #'
    #' @param input_json the JSON input
    #' @return the instance of Campaign
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`bid_options` <- CampaignBidOptions$new()$fromJSON(jsonlite::toJSON(this_object$`bid_options`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      self$`default_ad_group_budget_in_micro_currency` <- this_object$`default_ad_group_budget_in_micro_currency`
      self$`end_time` <- this_object$`end_time`
      self$`id` <- this_object$`id`
      self$`intended_promotion_type` <- IntendedPromotionType$new()$fromJSON(jsonlite::toJSON(this_object$`intended_promotion_type`, auto_unbox = TRUE, digits = NA))
      self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      self$`is_carting` <- this_object$`is_carting`
      self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      self$`is_ltv_optimized` <- this_object$`is_ltv_optimized`
      self$`is_performance_plus` <- this_object$`is_performance_plus`
      self$`is_top_of_search` <- this_object$`is_top_of_search`
      self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      self$`name` <- this_object$`name`
      self$`objective_type` <- CampaignObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self$`order_line_id` <- this_object$`order_line_id`
      self$`performance_plus_campaign_settings` <- PerformancePlusCampaignSettings$new()$fromJSON(jsonlite::toJSON(this_object$`performance_plus_campaign_settings`, auto_unbox = TRUE, digits = NA))
      self$`start_time` <- this_object$`start_time`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`summary_status` <- SummaryStatus$new()$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to Campaign and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Campaign: the required field `id` is missing."))
      }
      # check the required field `objective_type`
      if (!is.null(input_json$`objective_type`)) {
        stopifnot(R6::is.R6(input_json$`objective_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Campaign: the required field `objective_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Campaign
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) > 18) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
        invalid_fields["objective_type"] <- "Non-nullable required field `objective_type` cannot be null."
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
# Campaign$unlock()
#
## Below is an example to define the print function
# Campaign$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Campaign$lock()

