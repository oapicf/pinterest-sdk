#' Create a new AdGroupUpdateRequest
#'
#' @description
#' AdGroupUpdateRequest Class
#'
#' @docType class
#' @title AdGroupUpdateRequest
#' @description AdGroupUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. character [optional]
#' @field bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. integer [optional]
#' @field bid_strategy_type Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\". character [optional]
#' @field billable_event  \link{ActionType} [optional]
#' @field budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. integer [optional]
#' @field budget_type  \link{BudgetType} [optional]
#' @field campaign_id Campaign ID of the ad group. character [optional]
#' @field end_time Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. integer [optional]
#' @field is_creative_optimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. character [optional]
#' @field lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. integer [optional]
#' @field name Ad group name. character [optional]
#' @field optimization_goal_metadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. \link{OptimizationGoalMetadata} [optional]
#' @field pacing_delivery_type  \link{PacingDeliveryType} [optional]
#' @field placement_group <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. \link{PlacementGroupType} [optional]
#' @field promotion_application_level Specify if the promotion is applied at ad group or item level character [optional]
#' @field promotion_id Promotion ID. To clear this field, set to null. character [optional]
#' @field start_time Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. integer [optional]
#' @field status Ad group/entity status. \link{EntityStatus} [optional]
#' @field targeting_spec  \link{TargetingSpec} [optional]
#' @field targeting_template_ids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. list(character) [optional]
#' @field tracking_urls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. \link{TrackingUrls} [optional]
#' @field bid_multiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. numeric [optional]
#' @field id Ad group ID. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupUpdateRequest <- R6::R6Class(
  "AdGroupUpdateRequest",
  public = list(
    `auto_targeting_enabled` = NULL,
    `bid_in_micro_currency` = NULL,
    `bid_strategy_type` = NULL,
    `billable_event` = NULL,
    `budget_in_micro_currency` = NULL,
    `budget_type` = NULL,
    `campaign_id` = NULL,
    `end_time` = NULL,
    `is_creative_optimization` = NULL,
    `lifetime_frequency_cap` = NULL,
    `name` = NULL,
    `optimization_goal_metadata` = NULL,
    `pacing_delivery_type` = NULL,
    `placement_group` = NULL,
    `promotion_application_level` = NULL,
    `promotion_id` = NULL,
    `start_time` = NULL,
    `status` = NULL,
    `targeting_spec` = NULL,
    `targeting_template_ids` = NULL,
    `tracking_urls` = NULL,
    `bid_multiplier` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new AdGroupUpdateRequest class.
    #'
    #' @param id Ad group ID.
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
    #' @param bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
    #' @param bid_strategy_type Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
    #' @param billable_event billable_event
    #' @param budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    #' @param budget_type budget_type
    #' @param campaign_id Campaign ID of the ad group.
    #' @param end_time Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
    #' @param is_creative_optimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
    #' @param lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    #' @param name Ad group name.
    #' @param optimization_goal_metadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
    #' @param pacing_delivery_type pacing_delivery_type
    #' @param placement_group <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
    #' @param promotion_application_level Specify if the promotion is applied at ad group or item level
    #' @param promotion_id Promotion ID. To clear this field, set to null.. Default to "0".
    #' @param start_time Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
    #' @param status Ad group/entity status.
    #' @param targeting_spec targeting_spec
    #' @param targeting_template_ids Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
    #' @param tracking_urls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
    #' @param bid_multiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `auto_targeting_enabled` = NULL, `bid_in_micro_currency` = NULL, `bid_strategy_type` = NULL, `billable_event` = NULL, `budget_in_micro_currency` = NULL, `budget_type` = NULL, `campaign_id` = NULL, `end_time` = NULL, `is_creative_optimization` = NULL, `lifetime_frequency_cap` = NULL, `name` = NULL, `optimization_goal_metadata` = NULL, `pacing_delivery_type` = NULL, `placement_group` = NULL, `promotion_application_level` = NULL, `promotion_id` = "0", `start_time` = NULL, `status` = NULL, `targeting_spec` = NULL, `targeting_template_ids` = NULL, `tracking_urls` = NULL, `bid_multiplier` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`auto_targeting_enabled`)) {
        if (!(is.logical(`auto_targeting_enabled`) && length(`auto_targeting_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `auto_targeting_enabled`. Must be a boolean:", `auto_targeting_enabled`))
        }
        self$`auto_targeting_enabled` <- `auto_targeting_enabled`
      }
      if (!is.null(`bid_in_micro_currency`)) {
        if (!(is.numeric(`bid_in_micro_currency`) && length(`bid_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `bid_in_micro_currency`. Must be an integer:", `bid_in_micro_currency`))
        }
        self$`bid_in_micro_currency` <- `bid_in_micro_currency`
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
      if (!is.null(`billable_event`)) {
        if (!(`billable_event` %in% c())) {
          stop(paste("Error! \"", `billable_event`, "\" cannot be assigned to `billable_event`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`billable_event`))
        self$`billable_event` <- `billable_event`
      }
      if (!is.null(`budget_in_micro_currency`)) {
        if (!(is.numeric(`budget_in_micro_currency`) && length(`budget_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `budget_in_micro_currency`. Must be an integer:", `budget_in_micro_currency`))
        }
        self$`budget_in_micro_currency` <- `budget_in_micro_currency`
      }
      if (!is.null(`budget_type`)) {
        if (!(`budget_type` %in% c())) {
          stop(paste("Error! \"", `budget_type`, "\" cannot be assigned to `budget_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`budget_type`))
        self$`budget_type` <- `budget_type`
      }
      if (!is.null(`campaign_id`)) {
        if (!(is.character(`campaign_id`) && length(`campaign_id`) == 1)) {
          stop(paste("Error! Invalid data for `campaign_id`. Must be a string:", `campaign_id`))
        }
        self$`campaign_id` <- `campaign_id`
      }
      if (!is.null(`end_time`)) {
        if (!(is.numeric(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!is.null(`is_creative_optimization`)) {
        if (!(is.logical(`is_creative_optimization`) && length(`is_creative_optimization`) == 1)) {
          stop(paste("Error! Invalid data for `is_creative_optimization`. Must be a boolean:", `is_creative_optimization`))
        }
        self$`is_creative_optimization` <- `is_creative_optimization`
      }
      if (!is.null(`lifetime_frequency_cap`)) {
        if (!(is.numeric(`lifetime_frequency_cap`) && length(`lifetime_frequency_cap`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_frequency_cap`. Must be an integer:", `lifetime_frequency_cap`))
        }
        self$`lifetime_frequency_cap` <- `lifetime_frequency_cap`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`optimization_goal_metadata`)) {
        stopifnot(R6::is.R6(`optimization_goal_metadata`))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata`
      }
      if (!is.null(`pacing_delivery_type`)) {
        if (!(`pacing_delivery_type` %in% c())) {
          stop(paste("Error! \"", `pacing_delivery_type`, "\" cannot be assigned to `pacing_delivery_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`pacing_delivery_type`))
        self$`pacing_delivery_type` <- `pacing_delivery_type`
      }
      if (!is.null(`placement_group`)) {
        if (!(`placement_group` %in% c())) {
          stop(paste("Error! \"", `placement_group`, "\" cannot be assigned to `placement_group`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`placement_group`))
        self$`placement_group` <- `placement_group`
      }
      if (!is.null(`promotion_application_level`)) {
        if (!(`promotion_application_level` %in% c("NONE", "ITEM", "AD_GROUP"))) {
          stop(paste("Error! \"", `promotion_application_level`, "\" cannot be assigned to `promotion_application_level`. Must be \"NONE\", \"ITEM\", \"AD_GROUP\".", sep = ""))
        }
        if (!(is.character(`promotion_application_level`) && length(`promotion_application_level`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_application_level`. Must be a string:", `promotion_application_level`))
        }
        self$`promotion_application_level` <- `promotion_application_level`
      }
      if (!is.null(`promotion_id`)) {
        if (!(is.character(`promotion_id`) && length(`promotion_id`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_id`. Must be a string:", `promotion_id`))
        }
        self$`promotion_id` <- `promotion_id`
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
      if (!is.null(`bid_multiplier`)) {
        self$`bid_multiplier` <- `bid_multiplier`
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
    #' @return AdGroupUpdateRequest as a base R list.
    #' @examples
    #' # convert array of AdGroupUpdateRequest (x) to a data frame
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
    #' Convert AdGroupUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupUpdateRequestObject <- list()
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupUpdateRequestObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`bid_in_micro_currency`)) {
        AdGroupUpdateRequestObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`bid_strategy_type`)) {
        AdGroupUpdateRequestObject[["bid_strategy_type"]] <-
          self$`bid_strategy_type`
      }
      if (!is.null(self$`billable_event`)) {
        AdGroupUpdateRequestObject[["billable_event"]] <-
          self$`billable_event`$toSimpleType()
      }
      if (!is.null(self$`budget_in_micro_currency`)) {
        AdGroupUpdateRequestObject[["budget_in_micro_currency"]] <-
          self$`budget_in_micro_currency`
      }
      if (!is.null(self$`budget_type`)) {
        AdGroupUpdateRequestObject[["budget_type"]] <-
          self$`budget_type`$toSimpleType()
      }
      if (!is.null(self$`campaign_id`)) {
        AdGroupUpdateRequestObject[["campaign_id"]] <-
          self$`campaign_id`
      }
      if (!is.null(self$`end_time`)) {
        AdGroupUpdateRequestObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`is_creative_optimization`)) {
        AdGroupUpdateRequestObject[["is_creative_optimization"]] <-
          self$`is_creative_optimization`
      }
      if (!is.null(self$`lifetime_frequency_cap`)) {
        AdGroupUpdateRequestObject[["lifetime_frequency_cap"]] <-
          self$`lifetime_frequency_cap`
      }
      if (!is.null(self$`name`)) {
        AdGroupUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`optimization_goal_metadata`)) {
        AdGroupUpdateRequestObject[["optimization_goal_metadata"]] <-
          self$`optimization_goal_metadata`$toSimpleType()
      }
      if (!is.null(self$`pacing_delivery_type`)) {
        AdGroupUpdateRequestObject[["pacing_delivery_type"]] <-
          self$`pacing_delivery_type`$toSimpleType()
      }
      if (!is.null(self$`placement_group`)) {
        AdGroupUpdateRequestObject[["placement_group"]] <-
          self$`placement_group`$toSimpleType()
      }
      if (!is.null(self$`promotion_application_level`)) {
        AdGroupUpdateRequestObject[["promotion_application_level"]] <-
          self$`promotion_application_level`
      }
      if (!is.null(self$`promotion_id`)) {
        AdGroupUpdateRequestObject[["promotion_id"]] <-
          self$`promotion_id`
      }
      if (!is.null(self$`start_time`)) {
        AdGroupUpdateRequestObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`status`)) {
        AdGroupUpdateRequestObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`targeting_spec`)) {
        AdGroupUpdateRequestObject[["targeting_spec"]] <-
          self$`targeting_spec`$toSimpleType()
      }
      if (!is.null(self$`targeting_template_ids`)) {
        AdGroupUpdateRequestObject[["targeting_template_ids"]] <-
          self$`targeting_template_ids`
      }
      if (!is.null(self$`tracking_urls`)) {
        AdGroupUpdateRequestObject[["tracking_urls"]] <-
          self$`tracking_urls`$toSimpleType()
      }
      if (!is.null(self$`bid_multiplier`)) {
        AdGroupUpdateRequestObject[["bid_multiplier"]] <-
          self$`bid_multiplier`
      }
      if (!is.null(self$`id`)) {
        AdGroupUpdateRequestObject[["id"]] <-
          self$`id`
      }
      return(AdGroupUpdateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`auto_targeting_enabled`)) {
        self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      }
      if (!is.null(this_object$`bid_in_micro_currency`)) {
        self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      }
      if (!is.null(this_object$`bid_strategy_type`)) {
        if (!is.null(this_object$`bid_strategy_type`) && !(this_object$`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG"))) {
          stop(paste("Error! \"", this_object$`bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\".", sep = ""))
        }
        self$`bid_strategy_type` <- this_object$`bid_strategy_type`
      }
      if (!is.null(this_object$`billable_event`)) {
        `billable_event_object` <- ActionType$new()
        `billable_event_object`$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
        self$`billable_event` <- `billable_event_object`
      }
      if (!is.null(this_object$`budget_in_micro_currency`)) {
        self$`budget_in_micro_currency` <- this_object$`budget_in_micro_currency`
      }
      if (!is.null(this_object$`budget_type`)) {
        `budget_type_object` <- BudgetType$new()
        `budget_type_object`$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
        self$`budget_type` <- `budget_type_object`
      }
      if (!is.null(this_object$`campaign_id`)) {
        self$`campaign_id` <- this_object$`campaign_id`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`is_creative_optimization`)) {
        self$`is_creative_optimization` <- this_object$`is_creative_optimization`
      }
      if (!is.null(this_object$`lifetime_frequency_cap`)) {
        self$`lifetime_frequency_cap` <- this_object$`lifetime_frequency_cap`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`optimization_goal_metadata`)) {
        `optimization_goal_metadata_object` <- OptimizationGoalMetadata$new()
        `optimization_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`optimization_goal_metadata` <- `optimization_goal_metadata_object`
      }
      if (!is.null(this_object$`pacing_delivery_type`)) {
        `pacing_delivery_type_object` <- PacingDeliveryType$new()
        `pacing_delivery_type_object`$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
        self$`pacing_delivery_type` <- `pacing_delivery_type_object`
      }
      if (!is.null(this_object$`placement_group`)) {
        `placement_group_object` <- PlacementGroupType$new()
        `placement_group_object`$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
        self$`placement_group` <- `placement_group_object`
      }
      if (!is.null(this_object$`promotion_application_level`)) {
        if (!is.null(this_object$`promotion_application_level`) && !(this_object$`promotion_application_level` %in% c("NONE", "ITEM", "AD_GROUP"))) {
          stop(paste("Error! \"", this_object$`promotion_application_level`, "\" cannot be assigned to `promotion_application_level`. Must be \"NONE\", \"ITEM\", \"AD_GROUP\".", sep = ""))
        }
        self$`promotion_application_level` <- this_object$`promotion_application_level`
      }
      if (!is.null(this_object$`promotion_id`)) {
        self$`promotion_id` <- this_object$`promotion_id`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`targeting_spec`)) {
        `targeting_spec_object` <- TargetingSpec$new()
        `targeting_spec_object`$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
        self$`targeting_spec` <- `targeting_spec_object`
      }
      if (!is.null(this_object$`targeting_template_ids`)) {
        self$`targeting_template_ids` <- ApiClient$new()$deserializeObj(this_object$`targeting_template_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`bid_multiplier`)) {
        self$`bid_multiplier` <- this_object$`bid_multiplier`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      if (!is.null(this_object$`bid_strategy_type`) && !(this_object$`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG"))) {
        stop(paste("Error! \"", this_object$`bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\".", sep = ""))
      }
      self$`bid_strategy_type` <- this_object$`bid_strategy_type`
      self$`billable_event` <- ActionType$new()$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
      self$`budget_in_micro_currency` <- this_object$`budget_in_micro_currency`
      self$`budget_type` <- BudgetType$new()$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
      self$`campaign_id` <- this_object$`campaign_id`
      self$`end_time` <- this_object$`end_time`
      self$`is_creative_optimization` <- this_object$`is_creative_optimization`
      self$`lifetime_frequency_cap` <- this_object$`lifetime_frequency_cap`
      self$`name` <- this_object$`name`
      self$`optimization_goal_metadata` <- OptimizationGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`pacing_delivery_type` <- PacingDeliveryType$new()$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`promotion_application_level`) && !(this_object$`promotion_application_level` %in% c("NONE", "ITEM", "AD_GROUP"))) {
        stop(paste("Error! \"", this_object$`promotion_application_level`, "\" cannot be assigned to `promotion_application_level`. Must be \"NONE\", \"ITEM\", \"AD_GROUP\".", sep = ""))
      }
      self$`promotion_application_level` <- this_object$`promotion_application_level`
      self$`promotion_id` <- this_object$`promotion_id`
      self$`start_time` <- this_object$`start_time`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`targeting_spec` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self$`targeting_template_ids` <- ApiClient$new()$deserializeObj(this_object$`targeting_template_ids`, "array[character]", loadNamespace("openapi"))
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`bid_multiplier` <- this_object$`bid_multiplier`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupUpdateRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AdGroupUpdateRequest: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupUpdateRequest
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

      if (!str_detect(self$`promotion_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (length(self$`targeting_template_ids`) > 1) {
        return(FALSE)
      }

      if (self$`bid_multiplier` > 10) {
        return(FALSE)
      }
      if (self$`bid_multiplier` < 0) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
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

      if (!str_detect(self$`promotion_id`, "^\\d+$")) {
        invalid_fields["promotion_id"] <- "Invalid value for `promotion_id`, must conform to the pattern ^\\d+$."
      }

      if (length(self$`targeting_template_ids`) > 1) {
        invalid_fields["targeting_template_ids"] <- "Invalid length for `targeting_template_ids`, number of items must be less than or equal to 1."
      }

      if (self$`bid_multiplier` > 10) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be smaller than or equal to 10."
      }
      if (self$`bid_multiplier` < 0) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be bigger than or equal to 0."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# AdGroupUpdateRequest$unlock()
#
## Below is an example to define the print function
# AdGroupUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupUpdateRequest$lock()

