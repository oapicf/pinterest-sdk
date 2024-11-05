#' Create a new AdGroupResponse
#'
#' @description
#' AdGroupResponse Class
#'
#' @docType class
#' @title AdGroupResponse
#' @description AdGroupResponse Class
#' @format An \code{R6Class} generator object
#' @field name Ad group name. character [optional]
#' @field status Ad group/entity status. \link{EntityStatus} [optional]
#' @field budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. integer [optional]
#' @field bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. integer [optional]
#' @field optimization_goal_metadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. \link{OptimizationGoalMetadata} [optional]
#' @field budget_type  \link{BudgetType} [optional]
#' @field start_time Ad group start time. Unix timestamp in seconds. Defaults to current time. integer [optional]
#' @field end_time Ad group end time. Unix timestamp in seconds. integer [optional]
#' @field targeting_spec  \link{TargetingSpec} [optional]
#' @field lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. integer [optional]
#' @field tracking_urls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. \link{TrackingUrls} [optional]
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. character [optional]
#' @field placement_group <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. \link{PlacementGroupType} [optional]
#' @field pacing_delivery_type  \link{PacingDeliveryType} [optional]
#' @field campaign_id Campaign ID of the ad group. character [optional]
#' @field billable_event  \link{ActionType} [optional]
#' @field bid_strategy_type Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID. character [optional]
#' @field targeting_template_ids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. list(character) [optional]
#' @field id Ad group ID. character [optional]
#' @field ad_account_id Advertiser ID. character [optional]
#' @field created_time Ad group creation time. Unix timestamp in seconds. integer [optional]
#' @field updated_time Ad group last update time. Unix timestamp in seconds. integer [optional]
#' @field type Always \"adgroup\". character [optional]
#' @field conversion_learning_mode_type oCPM learn mode character [optional]
#' @field summary_status Ad group summary status. \link{AdGroupSummaryStatus} [optional]
#' @field feed_profile_id Feed Profile ID associated to the adgroup. character [optional]
#' @field dca_assets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. \link{AnyType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupResponse <- R6::R6Class(
  "AdGroupResponse",
  public = list(
    `name` = NULL,
    `status` = NULL,
    `budget_in_micro_currency` = NULL,
    `bid_in_micro_currency` = NULL,
    `optimization_goal_metadata` = NULL,
    `budget_type` = NULL,
    `start_time` = NULL,
    `end_time` = NULL,
    `targeting_spec` = NULL,
    `lifetime_frequency_cap` = NULL,
    `tracking_urls` = NULL,
    `auto_targeting_enabled` = NULL,
    `placement_group` = NULL,
    `pacing_delivery_type` = NULL,
    `campaign_id` = NULL,
    `billable_event` = NULL,
    `bid_strategy_type` = NULL,
    `targeting_template_ids` = NULL,
    `id` = NULL,
    `ad_account_id` = NULL,
    `created_time` = NULL,
    `updated_time` = NULL,
    `type` = NULL,
    `conversion_learning_mode_type` = NULL,
    `summary_status` = NULL,
    `feed_profile_id` = NULL,
    `dca_assets` = NULL,

    #' @description
    #' Initialize a new AdGroupResponse class.
    #'
    #' @param name Ad group name.
    #' @param status Ad group/entity status.
    #' @param budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    #' @param bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
    #' @param optimization_goal_metadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
    #' @param budget_type budget_type
    #' @param start_time Ad group start time. Unix timestamp in seconds. Defaults to current time.
    #' @param end_time Ad group end time. Unix timestamp in seconds.
    #' @param targeting_spec targeting_spec
    #' @param lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    #' @param tracking_urls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    #' @param placement_group <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
    #' @param pacing_delivery_type pacing_delivery_type
    #' @param campaign_id Campaign ID of the ad group.
    #' @param billable_event billable_event
    #' @param bid_strategy_type Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
    #' @param targeting_template_ids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
    #' @param id Ad group ID.
    #' @param ad_account_id Advertiser ID.
    #' @param created_time Ad group creation time. Unix timestamp in seconds.
    #' @param updated_time Ad group last update time. Unix timestamp in seconds.
    #' @param type Always \"adgroup\".. Default to "adgroup".
    #' @param conversion_learning_mode_type oCPM learn mode
    #' @param summary_status Ad group summary status.
    #' @param feed_profile_id Feed Profile ID associated to the adgroup.
    #' @param dca_assets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `status` = NULL, `budget_in_micro_currency` = NULL, `bid_in_micro_currency` = NULL, `optimization_goal_metadata` = NULL, `budget_type` = NULL, `start_time` = NULL, `end_time` = NULL, `targeting_spec` = NULL, `lifetime_frequency_cap` = NULL, `tracking_urls` = NULL, `auto_targeting_enabled` = NULL, `placement_group` = NULL, `pacing_delivery_type` = NULL, `campaign_id` = NULL, `billable_event` = NULL, `bid_strategy_type` = NULL, `targeting_template_ids` = NULL, `id` = NULL, `ad_account_id` = NULL, `created_time` = NULL, `updated_time` = NULL, `type` = "adgroup", `conversion_learning_mode_type` = NULL, `summary_status` = NULL, `feed_profile_id` = NULL, `dca_assets` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`budget_in_micro_currency`)) {
        if (!(is.numeric(`budget_in_micro_currency`) && length(`budget_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `budget_in_micro_currency`. Must be an integer:", `budget_in_micro_currency`))
        }
        self$`budget_in_micro_currency` <- `budget_in_micro_currency`
      }
      if (!is.null(`bid_in_micro_currency`)) {
        if (!(is.numeric(`bid_in_micro_currency`) && length(`bid_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `bid_in_micro_currency`. Must be an integer:", `bid_in_micro_currency`))
        }
        self$`bid_in_micro_currency` <- `bid_in_micro_currency`
      }
      if (!is.null(`optimization_goal_metadata`)) {
        stopifnot(R6::is.R6(`optimization_goal_metadata`))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata`
      }
      if (!is.null(`budget_type`)) {
        if (!(`budget_type` %in% c())) {
          stop(paste("Error! \"", `budget_type`, "\" cannot be assigned to `budget_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`budget_type`))
        self$`budget_type` <- `budget_type`
      }
      if (!is.null(`start_time`)) {
        if (!(is.numeric(`start_time`) && length(`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be an integer:", `start_time`))
        }
        self$`start_time` <- `start_time`
      }
      if (!is.null(`end_time`)) {
        if (!(is.numeric(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!is.null(`targeting_spec`)) {
        stopifnot(R6::is.R6(`targeting_spec`))
        self$`targeting_spec` <- `targeting_spec`
      }
      if (!is.null(`lifetime_frequency_cap`)) {
        if (!(is.numeric(`lifetime_frequency_cap`) && length(`lifetime_frequency_cap`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_frequency_cap`. Must be an integer:", `lifetime_frequency_cap`))
        }
        self$`lifetime_frequency_cap` <- `lifetime_frequency_cap`
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
      if (!is.null(`placement_group`)) {
        if (!(`placement_group` %in% c())) {
          stop(paste("Error! \"", `placement_group`, "\" cannot be assigned to `placement_group`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`placement_group`))
        self$`placement_group` <- `placement_group`
      }
      if (!is.null(`pacing_delivery_type`)) {
        if (!(`pacing_delivery_type` %in% c())) {
          stop(paste("Error! \"", `pacing_delivery_type`, "\" cannot be assigned to `pacing_delivery_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`pacing_delivery_type`))
        self$`pacing_delivery_type` <- `pacing_delivery_type`
      }
      if (!is.null(`campaign_id`)) {
        if (!(is.character(`campaign_id`) && length(`campaign_id`) == 1)) {
          stop(paste("Error! Invalid data for `campaign_id`. Must be a string:", `campaign_id`))
        }
        self$`campaign_id` <- `campaign_id`
      }
      if (!is.null(`billable_event`)) {
        if (!(`billable_event` %in% c())) {
          stop(paste("Error! \"", `billable_event`, "\" cannot be assigned to `billable_event`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`billable_event`))
        self$`billable_event` <- `billable_event`
      }
      if (!is.null(`bid_strategy_type`)) {
        if (!(`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG"))) {
          stop(paste("Error! \"", `bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\".", sep = ""))
        }
        if (!(is.character(`bid_strategy_type`) && length(`bid_strategy_type`) == 1)) {
          stop(paste("Error! Invalid data for `bid_strategy_type`. Must be a string:", `bid_strategy_type`))
        }
        self$`bid_strategy_type` <- `bid_strategy_type`
      }
      if (!is.null(`targeting_template_ids`)) {
        stopifnot(is.vector(`targeting_template_ids`), length(`targeting_template_ids`) != 0)
        sapply(`targeting_template_ids`, function(x) stopifnot(is.character(x)))
        self$`targeting_template_ids` <- `targeting_template_ids`
      }
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
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`conversion_learning_mode_type`)) {
        if (!(`conversion_learning_mode_type` %in% c("NOT_ACTIVE", "ACTIVE"))) {
          stop(paste("Error! \"", `conversion_learning_mode_type`, "\" cannot be assigned to `conversion_learning_mode_type`. Must be \"NOT_ACTIVE\", \"ACTIVE\".", sep = ""))
        }
        if (!(is.character(`conversion_learning_mode_type`) && length(`conversion_learning_mode_type`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_learning_mode_type`. Must be a string:", `conversion_learning_mode_type`))
        }
        self$`conversion_learning_mode_type` <- `conversion_learning_mode_type`
      }
      if (!is.null(`summary_status`)) {
        if (!(`summary_status` %in% c())) {
          stop(paste("Error! \"", `summary_status`, "\" cannot be assigned to `summary_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`summary_status`))
        self$`summary_status` <- `summary_status`
      }
      if (!is.null(`feed_profile_id`)) {
        if (!(is.character(`feed_profile_id`) && length(`feed_profile_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_profile_id`. Must be a string:", `feed_profile_id`))
        }
        self$`feed_profile_id` <- `feed_profile_id`
      }
      if (!is.null(`dca_assets`)) {
        stopifnot(R6::is.R6(`dca_assets`))
        self$`dca_assets` <- `dca_assets`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdGroupResponse in JSON format
    toJSON = function() {
      AdGroupResponseObject <- list()
      if (!is.null(self$`name`)) {
        AdGroupResponseObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`status`)) {
        AdGroupResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`budget_in_micro_currency`)) {
        AdGroupResponseObject[["budget_in_micro_currency"]] <-
          self$`budget_in_micro_currency`
      }
      if (!is.null(self$`bid_in_micro_currency`)) {
        AdGroupResponseObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`optimization_goal_metadata`)) {
        AdGroupResponseObject[["optimization_goal_metadata"]] <-
          self$`optimization_goal_metadata`$toJSON()
      }
      if (!is.null(self$`budget_type`)) {
        AdGroupResponseObject[["budget_type"]] <-
          self$`budget_type`$toJSON()
      }
      if (!is.null(self$`start_time`)) {
        AdGroupResponseObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        AdGroupResponseObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`targeting_spec`)) {
        AdGroupResponseObject[["targeting_spec"]] <-
          self$`targeting_spec`$toJSON()
      }
      if (!is.null(self$`lifetime_frequency_cap`)) {
        AdGroupResponseObject[["lifetime_frequency_cap"]] <-
          self$`lifetime_frequency_cap`
      }
      if (!is.null(self$`tracking_urls`)) {
        AdGroupResponseObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupResponseObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`placement_group`)) {
        AdGroupResponseObject[["placement_group"]] <-
          self$`placement_group`$toJSON()
      }
      if (!is.null(self$`pacing_delivery_type`)) {
        AdGroupResponseObject[["pacing_delivery_type"]] <-
          self$`pacing_delivery_type`$toJSON()
      }
      if (!is.null(self$`campaign_id`)) {
        AdGroupResponseObject[["campaign_id"]] <-
          self$`campaign_id`
      }
      if (!is.null(self$`billable_event`)) {
        AdGroupResponseObject[["billable_event"]] <-
          self$`billable_event`$toJSON()
      }
      if (!is.null(self$`bid_strategy_type`)) {
        AdGroupResponseObject[["bid_strategy_type"]] <-
          self$`bid_strategy_type`
      }
      if (!is.null(self$`targeting_template_ids`)) {
        AdGroupResponseObject[["targeting_template_ids"]] <-
          self$`targeting_template_ids`
      }
      if (!is.null(self$`id`)) {
        AdGroupResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ad_account_id`)) {
        AdGroupResponseObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`created_time`)) {
        AdGroupResponseObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`updated_time`)) {
        AdGroupResponseObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`type`)) {
        AdGroupResponseObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`conversion_learning_mode_type`)) {
        AdGroupResponseObject[["conversion_learning_mode_type"]] <-
          self$`conversion_learning_mode_type`
      }
      if (!is.null(self$`summary_status`)) {
        AdGroupResponseObject[["summary_status"]] <-
          self$`summary_status`$toJSON()
      }
      if (!is.null(self$`feed_profile_id`)) {
        AdGroupResponseObject[["feed_profile_id"]] <-
          self$`feed_profile_id`
      }
      if (!is.null(self$`dca_assets`)) {
        AdGroupResponseObject[["dca_assets"]] <-
          self$`dca_assets`$toJSON()
      }
      AdGroupResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`budget_in_micro_currency`)) {
        self$`budget_in_micro_currency` <- this_object$`budget_in_micro_currency`
      }
      if (!is.null(this_object$`bid_in_micro_currency`)) {
        self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      }
      if (!is.null(this_object$`optimization_goal_metadata`)) {
        `optimization_goal_metadata_object` <- OptimizationGoalMetadata$new()
        `optimization_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata_object`
      }
      if (!is.null(this_object$`budget_type`)) {
        `budget_type_object` <- BudgetType$new()
        `budget_type_object`$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
        self$`budget_type` <- `budget_type_object`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`targeting_spec`)) {
        `targeting_spec_object` <- TargetingSpec$new()
        `targeting_spec_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
        self$`targeting_spec` <- `targeting_spec_object`
      }
      if (!is.null(this_object$`lifetime_frequency_cap`)) {
        self$`lifetime_frequency_cap` <- this_object$`lifetime_frequency_cap`
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- PlacementGroupType$new()
        `placement_group_object`$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
        self$`placement_group` <- `placement_group_object`
      }
      if (!is.null(this_object$`pacing_delivery_type`)) {
        `pacing_delivery_type_object` <- PacingDeliveryType$new()
        `pacing_delivery_type_object`$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
        self$`pacing_delivery_type` <- `pacing_delivery_type_object`
      }
      if (!is.null(this_object$`campaign_id`)) {
        self$`campaign_id` <- this_object$`campaign_id`
      }
      if (!is.null(this_object$`billable_event`)) {
        `billable_event_object` <- ActionType$new()
        `billable_event_object`$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
        self$`billable_event` <- `billable_event_object`
      }
      if (!is.null(this_object$`bid_strategy_type`)) {
        if (!is.null(this_object$`bid_strategy_type`) && !(this_object$`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG"))) {
          stop(paste("Error! \"", this_object$`bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\".", sep = ""))
        }
        self$`bid_strategy_type` <- this_object$`bid_strategy_type`
      }
      if (!is.null(this_object$`targeting_template_ids`)) {
        self$`targeting_template_ids` <- ApiClient$new()$deserializeObj(this_object$`targeting_template_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`conversion_learning_mode_type`)) {
        if (!is.null(this_object$`conversion_learning_mode_type`) && !(this_object$`conversion_learning_mode_type` %in% c("NOT_ACTIVE", "ACTIVE"))) {
          stop(paste("Error! \"", this_object$`conversion_learning_mode_type`, "\" cannot be assigned to `conversion_learning_mode_type`. Must be \"NOT_ACTIVE\", \"ACTIVE\".", sep = ""))
        }
        self$`conversion_learning_mode_type` <- this_object$`conversion_learning_mode_type`
      }
      if (!is.null(this_object$`summary_status`)) {
        `summary_status_object` <- AdGroupSummaryStatus$new()
        `summary_status_object`$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
        self$`summary_status` <- `summary_status_object`
      }
      if (!is.null(this_object$`feed_profile_id`)) {
        self$`feed_profile_id` <- this_object$`feed_profile_id`
      }
      if (!is.null(this_object$`dca_assets`)) {
        `dca_assets_object` <- AnyType$new()
        `dca_assets_object`$fromJSON(jsonlite::toJSON(this_object$`dca_assets`, auto_unbox = TRUE, digits = NA))
        self$`dca_assets` <- `dca_assets_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdGroupResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`budget_in_micro_currency`)) {
          sprintf(
          '"budget_in_micro_currency":
            %d
                    ',
          self$`budget_in_micro_currency`
          )
        },
        if (!is.null(self$`bid_in_micro_currency`)) {
          sprintf(
          '"bid_in_micro_currency":
            %d
                    ',
          self$`bid_in_micro_currency`
          )
        },
        if (!is.null(self$`optimization_goal_metadata`)) {
          sprintf(
          '"optimization_goal_metadata":
          %s
          ',
          jsonlite::toJSON(self$`optimization_goal_metadata`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`budget_type`)) {
          sprintf(
          '"budget_type":
          %s
          ',
          jsonlite::toJSON(self$`budget_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`start_time`)) {
          sprintf(
          '"start_time":
            %d
                    ',
          self$`start_time`
          )
        },
        if (!is.null(self$`end_time`)) {
          sprintf(
          '"end_time":
            %d
                    ',
          self$`end_time`
          )
        },
        if (!is.null(self$`targeting_spec`)) {
          sprintf(
          '"targeting_spec":
          %s
          ',
          jsonlite::toJSON(self$`targeting_spec`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`lifetime_frequency_cap`)) {
          sprintf(
          '"lifetime_frequency_cap":
            %d
                    ',
          self$`lifetime_frequency_cap`
          )
        },
        if (!is.null(self$`tracking_urls`)) {
          sprintf(
          '"tracking_urls":
          %s
          ',
          jsonlite::toJSON(self$`tracking_urls`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`auto_targeting_enabled`)) {
          sprintf(
          '"auto_targeting_enabled":
            %s
                    ',
          tolower(self$`auto_targeting_enabled`)
          )
        },
        if (!is.null(self$`placement_group`)) {
          sprintf(
          '"placement_group":
          %s
          ',
          jsonlite::toJSON(self$`placement_group`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`pacing_delivery_type`)) {
          sprintf(
          '"pacing_delivery_type":
          %s
          ',
          jsonlite::toJSON(self$`pacing_delivery_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`campaign_id`)) {
          sprintf(
          '"campaign_id":
            "%s"
                    ',
          self$`campaign_id`
          )
        },
        if (!is.null(self$`billable_event`)) {
          sprintf(
          '"billable_event":
          %s
          ',
          jsonlite::toJSON(self$`billable_event`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`bid_strategy_type`)) {
          sprintf(
          '"bid_strategy_type":
            "%s"
                    ',
          self$`bid_strategy_type`
          )
        },
        if (!is.null(self$`targeting_template_ids`)) {
          sprintf(
          '"targeting_template_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`targeting_template_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`created_time`)) {
          sprintf(
          '"created_time":
            %d
                    ',
          self$`created_time`
          )
        },
        if (!is.null(self$`updated_time`)) {
          sprintf(
          '"updated_time":
            %d
                    ',
          self$`updated_time`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`conversion_learning_mode_type`)) {
          sprintf(
          '"conversion_learning_mode_type":
            "%s"
                    ',
          self$`conversion_learning_mode_type`
          )
        },
        if (!is.null(self$`summary_status`)) {
          sprintf(
          '"summary_status":
          %s
          ',
          jsonlite::toJSON(self$`summary_status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`feed_profile_id`)) {
          sprintf(
          '"feed_profile_id":
            "%s"
                    ',
          self$`feed_profile_id`
          )
        },
        if (!is.null(self$`dca_assets`)) {
          sprintf(
          '"dca_assets":
          %s
          ',
          jsonlite::toJSON(self$`dca_assets`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`budget_in_micro_currency` <- this_object$`budget_in_micro_currency`
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      self$`optimization_goal_metadata` <- OptimizationGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`budget_type` <- BudgetType$new()$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
      self$`start_time` <- this_object$`start_time`
      self$`end_time` <- this_object$`end_time`
      self$`targeting_spec` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self$`lifetime_frequency_cap` <- this_object$`lifetime_frequency_cap`
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`pacing_delivery_type` <- PacingDeliveryType$new()$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
      self$`campaign_id` <- this_object$`campaign_id`
      self$`billable_event` <- ActionType$new()$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`bid_strategy_type`) && !(this_object$`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG"))) {
        stop(paste("Error! \"", this_object$`bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\".", sep = ""))
      }
      self$`bid_strategy_type` <- this_object$`bid_strategy_type`
      self$`targeting_template_ids` <- ApiClient$new()$deserializeObj(this_object$`targeting_template_ids`, "array[character]", loadNamespace("openapi"))
      self$`id` <- this_object$`id`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`created_time` <- this_object$`created_time`
      self$`updated_time` <- this_object$`updated_time`
      self$`type` <- this_object$`type`
      if (!is.null(this_object$`conversion_learning_mode_type`) && !(this_object$`conversion_learning_mode_type` %in% c("NOT_ACTIVE", "ACTIVE"))) {
        stop(paste("Error! \"", this_object$`conversion_learning_mode_type`, "\" cannot be assigned to `conversion_learning_mode_type`. Must be \"NOT_ACTIVE\", \"ACTIVE\".", sep = ""))
      }
      self$`conversion_learning_mode_type` <- this_object$`conversion_learning_mode_type`
      self$`summary_status` <- AdGroupSummaryStatus$new()$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
      self$`feed_profile_id` <- this_object$`feed_profile_id`
      self$`dca_assets` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`dca_assets`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`campaign_id`, "^[C]?\\d+$")) {
        return(FALSE)
      }

      if (length(self$`targeting_template_ids`) > 1) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
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
      if (!str_detect(self$`campaign_id`, "^[C]?\\d+$")) {
        invalid_fields["campaign_id"] <- "Invalid value for `campaign_id`, must conform to the pattern ^[C]?\\d+$."
      }

      if (length(self$`targeting_template_ids`) > 1) {
        invalid_fields["targeting_template_ids"] <- "Invalid length for `targeting_template_ids`, number of items must be less than or equal to 1."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
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
# AdGroupResponse$unlock()
#
## Below is an example to define the print function
# AdGroupResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupResponse$lock()

