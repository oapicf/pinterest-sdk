#' Create a new AdGroupCreate
#'
#' @description
#' AdGroupCreate Class
#'
#' @docType class
#' @title AdGroupCreate
#' @description AdGroupCreate Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Advertiser ID. character [optional]
#' @field bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. integer [optional]
#' @field bid_strategy_type  \link{BidStrategyType} [optional]
#' @field billable_event  \link{ActionType}
#' @field budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. integer [optional]
#' @field campaign_id Campaign ID of the ad group. character
#' @field conversion_learning_mode_type oCPM learn mode \link{ConversionLearningModeType}
#' @field created_time Ad group creation time. Unix timestamp in seconds. integer
#' @field customer_segment_id Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'. character [optional]
#' @field dca_assets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. \link{AnyType} [optional]
#' @field end_time Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. integer [optional]
#' @field ext_features  \link{AdgroupTrackingFeatures} [optional]
#' @field feed_profile_id Feed Profile ID associated to the adgroup. character [optional]
#' @field id Ad group ID. character
#' @field is_creative_optimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. character [optional]
#' @field is_local_inventory Indicates whether the ad group should use the local inventory. character [optional]
#' @field lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field. integer [optional]
#' @field local_inventory_radius_in_miles The targeting radius of the local inventory ads in miles. numeric [optional]
#' @field name Ad group name. character
#' @field optimization_goal_metadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. \link{NullableOptimizationGoalMetadata} [optional]
#' @field performance_plus_campaign_settings Pinterest Performance+ campaign settings. \link{PerformancePlusCampaignSettings} [optional]
#' @field placement_group [Placement group](https://help.pinterest.com/en/business/article/placement-groups). \link{PlacementGroupType} [optional]
#' @field placement_traffic_type A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both \link{PlacementTrafficType} [optional]
#' @field promotion_application_level Specify if the promotion is applied at ad group or item level \link{PromotionApplicationLevel} [optional]
#' @field promotion_id Promotion ID. To clear this field, set to null. character [optional]
#' @field promotion_ids Promotion IDs list. To clear this field, set to an empty array []. list(character) [optional]
#' @field start_time Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. integer [optional]
#' @field status Ad group/entity status. \link{EntityStatus} [optional]
#' @field summary_status  \link{SummaryStatus}
#' @field targeting_spec  \link{TargetingSpecOptimal} [optional]
#' @field targeting_template_ids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. list(character) [optional]
#' @field tracking_urls  \link{AdGroupTrackingURLs} [optional]
#' @field type Always \"adgroup\". character
#' @field updated_time Ad group last update time. Unix timestamp in seconds. integer
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting). character [optional]
#' @field bid_multiplier [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). numeric [optional]
#' @field budget_type  \link{BudgetType} [optional]
#' @field pacing_delivery_type  \link{PacingDeliveryType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupCreate <- R6::R6Class(
  "AdGroupCreate",
  public = list(
    `ad_account_id` = NULL,
    `bid_in_micro_currency` = NULL,
    `bid_strategy_type` = NULL,
    `billable_event` = NULL,
    `budget_in_micro_currency` = NULL,
    `campaign_id` = NULL,
    `conversion_learning_mode_type` = NULL,
    `created_time` = NULL,
    `customer_segment_id` = NULL,
    `dca_assets` = NULL,
    `end_time` = NULL,
    `ext_features` = NULL,
    `feed_profile_id` = NULL,
    `id` = NULL,
    `is_creative_optimization` = NULL,
    `is_local_inventory` = NULL,
    `lifetime_frequency_cap` = NULL,
    `local_inventory_radius_in_miles` = NULL,
    `name` = NULL,
    `optimization_goal_metadata` = NULL,
    `performance_plus_campaign_settings` = NULL,
    `placement_group` = NULL,
    `placement_traffic_type` = NULL,
    `promotion_application_level` = NULL,
    `promotion_id` = NULL,
    `promotion_ids` = NULL,
    `start_time` = NULL,
    `status` = NULL,
    `summary_status` = NULL,
    `targeting_spec` = NULL,
    `targeting_template_ids` = NULL,
    `tracking_urls` = NULL,
    `type` = NULL,
    `updated_time` = NULL,
    `auto_targeting_enabled` = NULL,
    `bid_multiplier` = NULL,
    `budget_type` = NULL,
    `pacing_delivery_type` = NULL,

    #' @description
    #' Initialize a new AdGroupCreate class.
    #'
    #' @param billable_event billable_event
    #' @param campaign_id Campaign ID of the ad group.
    #' @param conversion_learning_mode_type oCPM learn mode
    #' @param created_time Ad group creation time. Unix timestamp in seconds.
    #' @param id Ad group ID.
    #' @param name Ad group name.
    #' @param summary_status summary_status
    #' @param type Always \"adgroup\".
    #' @param updated_time Ad group last update time. Unix timestamp in seconds.
    #' @param ad_account_id Advertiser ID.
    #' @param bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
    #' @param bid_strategy_type bid_strategy_type
    #' @param budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    #' @param customer_segment_id Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
    #' @param dca_assets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
    #' @param end_time Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
    #' @param ext_features ext_features
    #' @param feed_profile_id Feed Profile ID associated to the adgroup.
    #' @param is_creative_optimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
    #' @param is_local_inventory Indicates whether the ad group should use the local inventory.
    #' @param lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
    #' @param local_inventory_radius_in_miles The targeting radius of the local inventory ads in miles.
    #' @param optimization_goal_metadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
    #' @param performance_plus_campaign_settings Pinterest Performance+ campaign settings.
    #' @param placement_group [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
    #' @param placement_traffic_type A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
    #' @param promotion_application_level Specify if the promotion is applied at ad group or item level
    #' @param promotion_id Promotion ID. To clear this field, set to null.. Default to "0".
    #' @param promotion_ids Promotion IDs list. To clear this field, set to an empty array [].
    #' @param start_time Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
    #' @param status Ad group/entity status.
    #' @param targeting_spec targeting_spec
    #' @param targeting_template_ids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
    #' @param tracking_urls tracking_urls
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
    #' @param bid_multiplier [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
    #' @param budget_type budget_type
    #' @param pacing_delivery_type pacing_delivery_type
    #' @param ... Other optional arguments.
    initialize = function(`billable_event`, `campaign_id`, `conversion_learning_mode_type`, `created_time`, `id`, `name`, `summary_status`, `type`, `updated_time`, `ad_account_id` = NULL, `bid_in_micro_currency` = NULL, `bid_strategy_type` = NULL, `budget_in_micro_currency` = NULL, `customer_segment_id` = NULL, `dca_assets` = NULL, `end_time` = NULL, `ext_features` = NULL, `feed_profile_id` = NULL, `is_creative_optimization` = NULL, `is_local_inventory` = NULL, `lifetime_frequency_cap` = NULL, `local_inventory_radius_in_miles` = NULL, `optimization_goal_metadata` = NULL, `performance_plus_campaign_settings` = NULL, `placement_group` = NULL, `placement_traffic_type` = NULL, `promotion_application_level` = NULL, `promotion_id` = "0", `promotion_ids` = NULL, `start_time` = NULL, `status` = NULL, `targeting_spec` = NULL, `targeting_template_ids` = NULL, `tracking_urls` = NULL, `auto_targeting_enabled` = NULL, `bid_multiplier` = NULL, `budget_type` = NULL, `pacing_delivery_type` = NULL, ...) {
      if (!missing(`billable_event`)) {
        if (!(`billable_event` %in% c())) {
          stop(paste("Error! \"", `billable_event`, "\" cannot be assigned to `billable_event`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`billable_event`))
        self$`billable_event` <- `billable_event`
      }
      if (!missing(`campaign_id`)) {
        if (!(is.character(`campaign_id`) && length(`campaign_id`) == 1)) {
          stop(paste("Error! Invalid data for `campaign_id`. Must be a string:", `campaign_id`))
        }
        self$`campaign_id` <- `campaign_id`
      }
      if (!missing(`conversion_learning_mode_type`)) {
        if (!(`conversion_learning_mode_type` %in% c())) {
          stop(paste("Error! \"", `conversion_learning_mode_type`, "\" cannot be assigned to `conversion_learning_mode_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`conversion_learning_mode_type`))
        self$`conversion_learning_mode_type` <- `conversion_learning_mode_type`
      }
      if (!missing(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`summary_status`)) {
        if (!(`summary_status` %in% c())) {
          stop(paste("Error! \"", `summary_status`, "\" cannot be assigned to `summary_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`summary_status`))
        self$`summary_status` <- `summary_status`
      }
      if (!missing(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`bid_in_micro_currency`)) {
        if (!(is.numeric(`bid_in_micro_currency`) && length(`bid_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `bid_in_micro_currency`. Must be an integer:", `bid_in_micro_currency`))
        }
        self$`bid_in_micro_currency` <- `bid_in_micro_currency`
      }
      if (!is.null(`bid_strategy_type`)) {
        if (!(`bid_strategy_type` %in% c())) {
          stop(paste("Error! \"", `bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`bid_strategy_type`))
        self$`bid_strategy_type` <- `bid_strategy_type`
      }
      if (!is.null(`budget_in_micro_currency`)) {
        if (!(is.numeric(`budget_in_micro_currency`) && length(`budget_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `budget_in_micro_currency`. Must be an integer:", `budget_in_micro_currency`))
        }
        self$`budget_in_micro_currency` <- `budget_in_micro_currency`
      }
      if (!is.null(`customer_segment_id`)) {
        if (!(is.character(`customer_segment_id`) && length(`customer_segment_id`) == 1)) {
          stop(paste("Error! Invalid data for `customer_segment_id`. Must be a string:", `customer_segment_id`))
        }
        self$`customer_segment_id` <- `customer_segment_id`
      }
      if (!is.null(`dca_assets`)) {
        stopifnot(R6::is.R6(`dca_assets`))
        self$`dca_assets` <- `dca_assets`
      }
      if (!is.null(`end_time`)) {
        if (!(is.numeric(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!is.null(`ext_features`)) {
        stopifnot(R6::is.R6(`ext_features`))
        self$`ext_features` <- `ext_features`
      }
      if (!is.null(`feed_profile_id`)) {
        if (!(is.character(`feed_profile_id`) && length(`feed_profile_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_profile_id`. Must be a string:", `feed_profile_id`))
        }
        self$`feed_profile_id` <- `feed_profile_id`
      }
      if (!is.null(`is_creative_optimization`)) {
        if (!(is.logical(`is_creative_optimization`) && length(`is_creative_optimization`) == 1)) {
          stop(paste("Error! Invalid data for `is_creative_optimization`. Must be a boolean:", `is_creative_optimization`))
        }
        self$`is_creative_optimization` <- `is_creative_optimization`
      }
      if (!is.null(`is_local_inventory`)) {
        if (!(is.logical(`is_local_inventory`) && length(`is_local_inventory`) == 1)) {
          stop(paste("Error! Invalid data for `is_local_inventory`. Must be a boolean:", `is_local_inventory`))
        }
        self$`is_local_inventory` <- `is_local_inventory`
      }
      if (!is.null(`lifetime_frequency_cap`)) {
        if (!(is.numeric(`lifetime_frequency_cap`) && length(`lifetime_frequency_cap`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_frequency_cap`. Must be an integer:", `lifetime_frequency_cap`))
        }
        self$`lifetime_frequency_cap` <- `lifetime_frequency_cap`
      }
      if (!is.null(`local_inventory_radius_in_miles`)) {
        self$`local_inventory_radius_in_miles` <- `local_inventory_radius_in_miles`
      }
      if (!is.null(`optimization_goal_metadata`)) {
        stopifnot(R6::is.R6(`optimization_goal_metadata`))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata`
      }
      if (!is.null(`performance_plus_campaign_settings`)) {
        stopifnot(R6::is.R6(`performance_plus_campaign_settings`))
        self$`performance_plus_campaign_settings` <- `performance_plus_campaign_settings`
      }
      if (!is.null(`placement_group`)) {
        if (!(`placement_group` %in% c())) {
          stop(paste("Error! \"", `placement_group`, "\" cannot be assigned to `placement_group`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`placement_group`))
        self$`placement_group` <- `placement_group`
      }
      if (!is.null(`placement_traffic_type`)) {
        if (!(`placement_traffic_type` %in% c())) {
          stop(paste("Error! \"", `placement_traffic_type`, "\" cannot be assigned to `placement_traffic_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`placement_traffic_type`))
        self$`placement_traffic_type` <- `placement_traffic_type`
      }
      if (!is.null(`promotion_application_level`)) {
        if (!(`promotion_application_level` %in% c())) {
          stop(paste("Error! \"", `promotion_application_level`, "\" cannot be assigned to `promotion_application_level`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`promotion_application_level`))
        self$`promotion_application_level` <- `promotion_application_level`
      }
      if (!is.null(`promotion_id`)) {
        if (!(is.character(`promotion_id`) && length(`promotion_id`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_id`. Must be a string:", `promotion_id`))
        }
        self$`promotion_id` <- `promotion_id`
      }
      if (!is.null(`promotion_ids`)) {
        stopifnot(is.vector(`promotion_ids`), length(`promotion_ids`) != 0)
        sapply(`promotion_ids`, function(x) stopifnot(is.character(x)))
        self$`promotion_ids` <- `promotion_ids`
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
      if (!is.null(`targeting_spec`)) {
        stopifnot(R6::is.R6(`targeting_spec`))
        self$`targeting_spec` <- `targeting_spec`
      }
      if (!is.null(`targeting_template_ids`)) {
        stopifnot(is.vector(`targeting_template_ids`), length(`targeting_template_ids`) != 0)
        sapply(`targeting_template_ids`, function(x) stopifnot(is.character(x)))
        self$`targeting_template_ids` <- `targeting_template_ids`
      }
      if (!is.null(`tracking_urls`)) {
        stopifnot(R6::is.R6(`tracking_urls`))
        self$`tracking_urls` <- `tracking_urls`
      }
      if (!is.null(`auto_targeting_enabled`)) {
        if (!(is.logical(`auto_targeting_enabled`) && length(`auto_targeting_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `auto_targeting_enabled`. Must be a boolean:", `auto_targeting_enabled`))
        }
        self$`auto_targeting_enabled` <- `auto_targeting_enabled`
      }
      if (!is.null(`bid_multiplier`)) {
        self$`bid_multiplier` <- `bid_multiplier`
      }
      if (!is.null(`budget_type`)) {
        if (!(`budget_type` %in% c())) {
          stop(paste("Error! \"", `budget_type`, "\" cannot be assigned to `budget_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`budget_type`))
        self$`budget_type` <- `budget_type`
      }
      if (!is.null(`pacing_delivery_type`)) {
        if (!(`pacing_delivery_type` %in% c())) {
          stop(paste("Error! \"", `pacing_delivery_type`, "\" cannot be assigned to `pacing_delivery_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`pacing_delivery_type`))
        self$`pacing_delivery_type` <- `pacing_delivery_type`
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
    #' @return AdGroupCreate as a base R list.
    #' @examples
    #' # convert array of AdGroupCreate (x) to a data frame
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
    #' Convert AdGroupCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupCreateObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AdGroupCreateObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`bid_in_micro_currency`)) {
        AdGroupCreateObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`bid_strategy_type`)) {
        AdGroupCreateObject[["bid_strategy_type"]] <-
          self$extractSimpleType(self$`bid_strategy_type`)
      }
      if (!is.null(self$`billable_event`)) {
        AdGroupCreateObject[["billable_event"]] <-
          self$extractSimpleType(self$`billable_event`)
      }
      if (!is.null(self$`budget_in_micro_currency`)) {
        AdGroupCreateObject[["budget_in_micro_currency"]] <-
          self$`budget_in_micro_currency`
      }
      if (!is.null(self$`campaign_id`)) {
        AdGroupCreateObject[["campaign_id"]] <-
          self$`campaign_id`
      }
      if (!is.null(self$`conversion_learning_mode_type`)) {
        AdGroupCreateObject[["conversion_learning_mode_type"]] <-
          self$extractSimpleType(self$`conversion_learning_mode_type`)
      }
      if (!is.null(self$`created_time`)) {
        AdGroupCreateObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`customer_segment_id`)) {
        AdGroupCreateObject[["customer_segment_id"]] <-
          self$`customer_segment_id`
      }
      if (!is.null(self$`dca_assets`)) {
        AdGroupCreateObject[["dca_assets"]] <-
          self$extractSimpleType(self$`dca_assets`)
      }
      if (!is.null(self$`end_time`)) {
        AdGroupCreateObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`ext_features`)) {
        AdGroupCreateObject[["ext_features"]] <-
          self$extractSimpleType(self$`ext_features`)
      }
      if (!is.null(self$`feed_profile_id`)) {
        AdGroupCreateObject[["feed_profile_id"]] <-
          self$`feed_profile_id`
      }
      if (!is.null(self$`id`)) {
        AdGroupCreateObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`is_creative_optimization`)) {
        AdGroupCreateObject[["is_creative_optimization"]] <-
          self$`is_creative_optimization`
      }
      if (!is.null(self$`is_local_inventory`)) {
        AdGroupCreateObject[["is_local_inventory"]] <-
          self$`is_local_inventory`
      }
      if (!is.null(self$`lifetime_frequency_cap`)) {
        AdGroupCreateObject[["lifetime_frequency_cap"]] <-
          self$`lifetime_frequency_cap`
      }
      if (!is.null(self$`local_inventory_radius_in_miles`)) {
        AdGroupCreateObject[["local_inventory_radius_in_miles"]] <-
          self$`local_inventory_radius_in_miles`
      }
      if (!is.null(self$`name`)) {
        AdGroupCreateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`optimization_goal_metadata`)) {
        AdGroupCreateObject[["optimization_goal_metadata"]] <-
          self$extractSimpleType(self$`optimization_goal_metadata`)
      }
      if (!is.null(self$`performance_plus_campaign_settings`)) {
        AdGroupCreateObject[["performance_plus_campaign_settings"]] <-
          self$extractSimpleType(self$`performance_plus_campaign_settings`)
      }
      if (!is.null(self$`placement_group`)) {
        AdGroupCreateObject[["placement_group"]] <-
          self$extractSimpleType(self$`placement_group`)
      }
      if (!is.null(self$`placement_traffic_type`)) {
        AdGroupCreateObject[["placement_traffic_type"]] <-
          self$extractSimpleType(self$`placement_traffic_type`)
      }
      if (!is.null(self$`promotion_application_level`)) {
        AdGroupCreateObject[["promotion_application_level"]] <-
          self$extractSimpleType(self$`promotion_application_level`)
      }
      if (!is.null(self$`promotion_id`)) {
        AdGroupCreateObject[["promotion_id"]] <-
          self$`promotion_id`
      }
      if (!is.null(self$`promotion_ids`)) {
        AdGroupCreateObject[["promotion_ids"]] <-
          self$`promotion_ids`
      }
      if (!is.null(self$`start_time`)) {
        AdGroupCreateObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`status`)) {
        AdGroupCreateObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`summary_status`)) {
        AdGroupCreateObject[["summary_status"]] <-
          self$extractSimpleType(self$`summary_status`)
      }
      if (!is.null(self$`targeting_spec`)) {
        AdGroupCreateObject[["targeting_spec"]] <-
          self$extractSimpleType(self$`targeting_spec`)
      }
      if (!is.null(self$`targeting_template_ids`)) {
        AdGroupCreateObject[["targeting_template_ids"]] <-
          self$`targeting_template_ids`
      }
      if (!is.null(self$`tracking_urls`)) {
        AdGroupCreateObject[["tracking_urls"]] <-
          self$extractSimpleType(self$`tracking_urls`)
      }
      if (!is.null(self$`type`)) {
        AdGroupCreateObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`updated_time`)) {
        AdGroupCreateObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupCreateObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`bid_multiplier`)) {
        AdGroupCreateObject[["bid_multiplier"]] <-
          self$`bid_multiplier`
      }
      if (!is.null(self$`budget_type`)) {
        AdGroupCreateObject[["budget_type"]] <-
          self$extractSimpleType(self$`budget_type`)
      }
      if (!is.null(self$`pacing_delivery_type`)) {
        AdGroupCreateObject[["pacing_delivery_type"]] <-
          self$extractSimpleType(self$`pacing_delivery_type`)
      }
      return(AdGroupCreateObject)
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
    #' Deserialize JSON string into an instance of AdGroupCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`bid_in_micro_currency`)) {
        self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      }
      if (!is.null(this_object$`bid_strategy_type`)) {
        `bid_strategy_type_object` <- BidStrategyType$new()
        `bid_strategy_type_object`$fromJSON(jsonlite::toJSON(this_object$`bid_strategy_type`, auto_unbox = TRUE, digits = NA))
        self$`bid_strategy_type` <- `bid_strategy_type_object`
      }
      if (!is.null(this_object$`billable_event`)) {
        `billable_event_object` <- ActionType$new()
        `billable_event_object`$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
        self$`billable_event` <- `billable_event_object`
      }
      if (!is.null(this_object$`budget_in_micro_currency`)) {
        self$`budget_in_micro_currency` <- this_object$`budget_in_micro_currency`
      }
      if (!is.null(this_object$`campaign_id`)) {
        self$`campaign_id` <- this_object$`campaign_id`
      }
      if (!is.null(this_object$`conversion_learning_mode_type`)) {
        `conversion_learning_mode_type_object` <- ConversionLearningModeType$new()
        `conversion_learning_mode_type_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_learning_mode_type`, auto_unbox = TRUE, digits = NA))
        self$`conversion_learning_mode_type` <- `conversion_learning_mode_type_object`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`customer_segment_id`)) {
        self$`customer_segment_id` <- this_object$`customer_segment_id`
      }
      if (!is.null(this_object$`dca_assets`)) {
        `dca_assets_object` <- AnyType$new()
        `dca_assets_object`$fromJSON(jsonlite::toJSON(this_object$`dca_assets`, auto_unbox = TRUE, digits = NA))
        self$`dca_assets` <- `dca_assets_object`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`ext_features`)) {
        `ext_features_object` <- AdgroupTrackingFeatures$new()
        `ext_features_object`$fromJSON(jsonlite::toJSON(this_object$`ext_features`, auto_unbox = TRUE, digits = NA))
        self$`ext_features` <- `ext_features_object`
      }
      if (!is.null(this_object$`feed_profile_id`)) {
        self$`feed_profile_id` <- this_object$`feed_profile_id`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`is_creative_optimization`)) {
        self$`is_creative_optimization` <- this_object$`is_creative_optimization`
      }
      if (!is.null(this_object$`is_local_inventory`)) {
        self$`is_local_inventory` <- this_object$`is_local_inventory`
      }
      if (!is.null(this_object$`lifetime_frequency_cap`)) {
        self$`lifetime_frequency_cap` <- this_object$`lifetime_frequency_cap`
      }
      if (!is.null(this_object$`local_inventory_radius_in_miles`)) {
        self$`local_inventory_radius_in_miles` <- this_object$`local_inventory_radius_in_miles`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`optimization_goal_metadata`)) {
        `optimization_goal_metadata_object` <- NullableOptimizationGoalMetadata$new()
        `optimization_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata_object`
      }
      if (!is.null(this_object$`performance_plus_campaign_settings`)) {
        `performance_plus_campaign_settings_object` <- PerformancePlusCampaignSettings$new()
        `performance_plus_campaign_settings_object`$fromJSON(jsonlite::toJSON(this_object$`performance_plus_campaign_settings`, auto_unbox = TRUE, digits = NA))
        self$`performance_plus_campaign_settings` <- `performance_plus_campaign_settings_object`
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- PlacementGroupType$new()
        `placement_group_object`$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
        self$`placement_group` <- `placement_group_object`
      }
      if (!is.null(this_object$`placement_traffic_type`)) {
        `placement_traffic_type_object` <- PlacementTrafficType$new()
        `placement_traffic_type_object`$fromJSON(jsonlite::toJSON(this_object$`placement_traffic_type`, auto_unbox = TRUE, digits = NA))
        self$`placement_traffic_type` <- `placement_traffic_type_object`
      }
      if (!is.null(this_object$`promotion_application_level`)) {
        `promotion_application_level_object` <- PromotionApplicationLevel$new()
        `promotion_application_level_object`$fromJSON(jsonlite::toJSON(this_object$`promotion_application_level`, auto_unbox = TRUE, digits = NA))
        self$`promotion_application_level` <- `promotion_application_level_object`
      }
      if (!is.null(this_object$`promotion_id`)) {
        self$`promotion_id` <- this_object$`promotion_id`
      }
      if (!is.null(this_object$`promotion_ids`)) {
        self$`promotion_ids` <- ApiClient$new()$deserializeObj(this_object$`promotion_ids`, "array[character]", loadNamespace("openapi"))
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
      if (!is.null(this_object$`targeting_spec`)) {
        `targeting_spec_object` <- TargetingSpecOptimal$new()
        `targeting_spec_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
        self$`targeting_spec` <- `targeting_spec_object`
      }
      if (!is.null(this_object$`targeting_template_ids`)) {
        self$`targeting_template_ids` <- ApiClient$new()$deserializeObj(this_object$`targeting_template_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- AdGroupTrackingURLs$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`bid_multiplier`)) {
        self$`bid_multiplier` <- this_object$`bid_multiplier`
      }
      if (!is.null(this_object$`budget_type`)) {
        `budget_type_object` <- BudgetType$new()
        `budget_type_object`$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
        self$`budget_type` <- `budget_type_object`
      }
      if (!is.null(this_object$`pacing_delivery_type`)) {
        `pacing_delivery_type_object` <- PacingDeliveryType$new()
        `pacing_delivery_type_object`$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
        self$`pacing_delivery_type` <- `pacing_delivery_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      self$`bid_strategy_type` <- BidStrategyType$new()$fromJSON(jsonlite::toJSON(this_object$`bid_strategy_type`, auto_unbox = TRUE, digits = NA))
      self$`billable_event` <- ActionType$new()$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
      self$`budget_in_micro_currency` <- this_object$`budget_in_micro_currency`
      self$`campaign_id` <- this_object$`campaign_id`
      self$`conversion_learning_mode_type` <- ConversionLearningModeType$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_learning_mode_type`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`customer_segment_id` <- this_object$`customer_segment_id`
      self$`dca_assets` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`dca_assets`, auto_unbox = TRUE, digits = NA))
      self$`end_time` <- this_object$`end_time`
      self$`ext_features` <- AdgroupTrackingFeatures$new()$fromJSON(jsonlite::toJSON(this_object$`ext_features`, auto_unbox = TRUE, digits = NA))
      self$`feed_profile_id` <- this_object$`feed_profile_id`
      self$`id` <- this_object$`id`
      self$`is_creative_optimization` <- this_object$`is_creative_optimization`
      self$`is_local_inventory` <- this_object$`is_local_inventory`
      self$`lifetime_frequency_cap` <- this_object$`lifetime_frequency_cap`
      self$`local_inventory_radius_in_miles` <- this_object$`local_inventory_radius_in_miles`
      self$`name` <- this_object$`name`
      self$`optimization_goal_metadata` <- NullableOptimizationGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`performance_plus_campaign_settings` <- PerformancePlusCampaignSettings$new()$fromJSON(jsonlite::toJSON(this_object$`performance_plus_campaign_settings`, auto_unbox = TRUE, digits = NA))
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`placement_traffic_type` <- PlacementTrafficType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_traffic_type`, auto_unbox = TRUE, digits = NA))
      self$`promotion_application_level` <- PromotionApplicationLevel$new()$fromJSON(jsonlite::toJSON(this_object$`promotion_application_level`, auto_unbox = TRUE, digits = NA))
      self$`promotion_id` <- this_object$`promotion_id`
      self$`promotion_ids` <- ApiClient$new()$deserializeObj(this_object$`promotion_ids`, "array[character]", loadNamespace("openapi"))
      self$`start_time` <- this_object$`start_time`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`summary_status` <- SummaryStatus$new()$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
      self$`targeting_spec` <- TargetingSpecOptimal$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self$`targeting_template_ids` <- ApiClient$new()$deserializeObj(this_object$`targeting_template_ids`, "array[character]", loadNamespace("openapi"))
      self$`tracking_urls` <- AdGroupTrackingURLs$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self$`updated_time` <- this_object$`updated_time`
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`bid_multiplier` <- this_object$`bid_multiplier`
      self$`budget_type` <- BudgetType$new()$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
      self$`pacing_delivery_type` <- PacingDeliveryType$new()$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `billable_event`
      if (!is.null(input_json$`billable_event`)) {
        stopifnot(R6::is.R6(input_json$`billable_event`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `billable_event` is missing."))
      }
      # check the required field `campaign_id`
      if (!is.null(input_json$`campaign_id`)) {
        if (!(is.character(input_json$`campaign_id`) && length(input_json$`campaign_id`) == 1)) {
          stop(paste("Error! Invalid data for `campaign_id`. Must be a string:", input_json$`campaign_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `campaign_id` is missing."))
      }
      # check the required field `conversion_learning_mode_type`
      if (!is.null(input_json$`conversion_learning_mode_type`)) {
        stopifnot(R6::is.R6(input_json$`conversion_learning_mode_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `conversion_learning_mode_type` is missing."))
      }
      # check the required field `created_time`
      if (!is.null(input_json$`created_time`)) {
        if (!(is.numeric(input_json$`created_time`) && length(input_json$`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", input_json$`created_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `created_time` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `name` is missing."))
      }
      # check the required field `summary_status`
      if (!is.null(input_json$`summary_status`)) {
        stopifnot(R6::is.R6(input_json$`summary_status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `summary_status` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `type` is missing."))
      }
      # check the required field `updated_time`
      if (!is.null(input_json$`updated_time`)) {
        if (!(is.numeric(input_json$`updated_time`) && length(input_json$`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", input_json$`updated_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupCreate: the required field `updated_time` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupCreate
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

      # check if the required `billable_event` is null
      if (is.null(self$`billable_event`)) {
        return(FALSE)
      }

      # check if the required `campaign_id` is null
      if (is.null(self$`campaign_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`campaign_id`, "^[C]?\\d+$")) {
        return(FALSE)
      }

      # check if the required `created_time` is null
      if (is.null(self$`created_time`)) {
        return(FALSE)
      }

      if (!str_detect(self$`customer_segment_id`, "^\\d+$")) {
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (!str_detect(self$`promotion_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `summary_status` is null
      if (is.null(self$`summary_status`)) {
        return(FALSE)
      }

      if (length(self$`targeting_template_ids`) > 1) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `updated_time` is null
      if (is.null(self$`updated_time`)) {
        return(FALSE)
      }

      if (self$`bid_multiplier` > 10) {
        return(FALSE)
      }
      if (self$`bid_multiplier` < 0) {
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

      # check if the required `billable_event` is null
      if (is.null(self$`billable_event`)) {
        invalid_fields["billable_event"] <- "Non-nullable required field `billable_event` cannot be null."
      }

      # check if the required `campaign_id` is null
      if (is.null(self$`campaign_id`)) {
        invalid_fields["campaign_id"] <- "Non-nullable required field `campaign_id` cannot be null."
      }

      if (!str_detect(self$`campaign_id`, "^[C]?\\d+$")) {
        invalid_fields["campaign_id"] <- "Invalid value for `campaign_id`, must conform to the pattern ^[C]?\\d+$."
      }

      # check if the required `created_time` is null
      if (is.null(self$`created_time`)) {
        invalid_fields["created_time"] <- "Non-nullable required field `created_time` cannot be null."
      }

      if (!str_detect(self$`customer_segment_id`, "^\\d+$")) {
        invalid_fields["customer_segment_id"] <- "Invalid value for `customer_segment_id`, must conform to the pattern ^\\d+$."
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (!str_detect(self$`promotion_id`, "^\\d+$")) {
        invalid_fields["promotion_id"] <- "Invalid value for `promotion_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `summary_status` is null
      if (is.null(self$`summary_status`)) {
        invalid_fields["summary_status"] <- "Non-nullable required field `summary_status` cannot be null."
      }

      if (length(self$`targeting_template_ids`) > 1) {
        invalid_fields["targeting_template_ids"] <- "Invalid length for `targeting_template_ids`, number of items must be less than or equal to 1."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `updated_time` is null
      if (is.null(self$`updated_time`)) {
        invalid_fields["updated_time"] <- "Non-nullable required field `updated_time` cannot be null."
      }

      if (self$`bid_multiplier` > 10) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be smaller than or equal to 10."
      }
      if (self$`bid_multiplier` < 0) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be bigger than or equal to 0."
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
# AdGroupCreate$unlock()
#
## Below is an example to define the print function
# AdGroupCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupCreate$lock()

