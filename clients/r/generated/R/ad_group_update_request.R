#' Create a new AdGroupUpdateRequest
#'
#' @description
#' AdGroupUpdateRequest Class
#'
#' @docType class
#' @title AdGroupUpdateRequest
#' @description AdGroupUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field name Ad group name. character [optional]
#' @field status Ad group/entity status. \link{EntityStatus} [optional]
#' @field budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. integer [optional]
#' @field bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. integer [optional]
#' @field optimization_goal_metadata  \link{AdGroupCommonOptimizationGoalMetadata} [optional]
#' @field budget_type  \link{BudgetType} [optional]
#' @field start_time Ad group start time. Unix timestamp in seconds. Defaults to current time. integer [optional]
#' @field end_time Ad group end time. Unix timestamp in seconds. integer [optional]
#' @field targeting_spec  \link{TargetingSpec} [optional]
#' @field lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. integer [optional]
#' @field tracking_urls  \link{AdGroupCommonTrackingUrls} [optional]
#' @field auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. character [optional]
#' @field placement_group <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. \link{PlacementGroupType} [optional]
#' @field pacing_delivery_type  \link{PacingDeliveryType} [optional]
#' @field campaign_id Campaign ID of the ad group. character [optional]
#' @field billable_event  \link{ActionType} [optional]
#' @field bid_strategy_type Bid strategy type character [optional]
#' @field id Ad group ID. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupUpdateRequest <- R6::R6Class(
  "AdGroupUpdateRequest",
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
    `id` = NULL,
    #' Initialize a new AdGroupUpdateRequest class.
    #'
    #' @description
    #' Initialize a new AdGroupUpdateRequest class.
    #'
    #' @param id Ad group ID.
    #' @param name Ad group name.
    #' @param status Ad group/entity status.
    #' @param budget_in_micro_currency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    #' @param bid_in_micro_currency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
    #' @param optimization_goal_metadata optimization_goal_metadata
    #' @param budget_type budget_type
    #' @param start_time Ad group start time. Unix timestamp in seconds. Defaults to current time.
    #' @param end_time Ad group end time. Unix timestamp in seconds.
    #' @param targeting_spec targeting_spec
    #' @param lifetime_frequency_cap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    #' @param tracking_urls tracking_urls
    #' @param auto_targeting_enabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    #' @param placement_group <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
    #' @param pacing_delivery_type pacing_delivery_type
    #' @param campaign_id Campaign ID of the ad group.
    #' @param billable_event billable_event
    #' @param bid_strategy_type Bid strategy type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `name` = NULL, `status` = NULL, `budget_in_micro_currency` = NULL, `bid_in_micro_currency` = NULL, `optimization_goal_metadata` = NULL, `budget_type` = NULL, `start_time` = NULL, `end_time` = NULL, `targeting_spec` = NULL, `lifetime_frequency_cap` = NULL, `tracking_urls` = NULL, `auto_targeting_enabled` = NULL, `placement_group` = NULL, `pacing_delivery_type` = NULL, `campaign_id` = NULL, `billable_event` = NULL, `bid_strategy_type` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
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
        if (!(`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "null"))) {
          stop(paste("Error! \"", `bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\", \"null\".", sep = ""))
        }
        if (!(is.character(`bid_strategy_type`) && length(`bid_strategy_type`) == 1)) {
          stop(paste("Error! Invalid data for `bid_strategy_type`. Must be a string:", `bid_strategy_type`))
        }
        self$`bid_strategy_type` <- `bid_strategy_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupUpdateRequest in JSON format
    #' @export
    toJSON = function() {
      AdGroupUpdateRequestObject <- list()
      if (!is.null(self$`name`)) {
        AdGroupUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`status`)) {
        AdGroupUpdateRequestObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`budget_in_micro_currency`)) {
        AdGroupUpdateRequestObject[["budget_in_micro_currency"]] <-
          self$`budget_in_micro_currency`
      }
      if (!is.null(self$`bid_in_micro_currency`)) {
        AdGroupUpdateRequestObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`optimization_goal_metadata`)) {
        AdGroupUpdateRequestObject[["optimization_goal_metadata"]] <-
          self$`optimization_goal_metadata`$toJSON()
      }
      if (!is.null(self$`budget_type`)) {
        AdGroupUpdateRequestObject[["budget_type"]] <-
          self$`budget_type`$toJSON()
      }
      if (!is.null(self$`start_time`)) {
        AdGroupUpdateRequestObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        AdGroupUpdateRequestObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`targeting_spec`)) {
        AdGroupUpdateRequestObject[["targeting_spec"]] <-
          self$`targeting_spec`$toJSON()
      }
      if (!is.null(self$`lifetime_frequency_cap`)) {
        AdGroupUpdateRequestObject[["lifetime_frequency_cap"]] <-
          self$`lifetime_frequency_cap`
      }
      if (!is.null(self$`tracking_urls`)) {
        AdGroupUpdateRequestObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      if (!is.null(self$`auto_targeting_enabled`)) {
        AdGroupUpdateRequestObject[["auto_targeting_enabled"]] <-
          self$`auto_targeting_enabled`
      }
      if (!is.null(self$`placement_group`)) {
        AdGroupUpdateRequestObject[["placement_group"]] <-
          self$`placement_group`$toJSON()
      }
      if (!is.null(self$`pacing_delivery_type`)) {
        AdGroupUpdateRequestObject[["pacing_delivery_type"]] <-
          self$`pacing_delivery_type`$toJSON()
      }
      if (!is.null(self$`campaign_id`)) {
        AdGroupUpdateRequestObject[["campaign_id"]] <-
          self$`campaign_id`
      }
      if (!is.null(self$`billable_event`)) {
        AdGroupUpdateRequestObject[["billable_event"]] <-
          self$`billable_event`$toJSON()
      }
      if (!is.null(self$`bid_strategy_type`)) {
        AdGroupUpdateRequestObject[["bid_strategy_type"]] <-
          self$`bid_strategy_type`
      }
      if (!is.null(self$`id`)) {
        AdGroupUpdateRequestObject[["id"]] <-
          self$`id`
      }
      AdGroupUpdateRequestObject
    },
    #' Deserialize JSON string into an instance of AdGroupUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupUpdateRequest
    #' @export
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
        `optimization_goal_metadata_object` <- AdGroupCommonOptimizationGoalMetadata$new()
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
        `tracking_urls_object` <- AdGroupCommonTrackingUrls$new()
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
        if (!is.null(this_object$`bid_strategy_type`) && !(this_object$`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "null"))) {
          stop(paste("Error! \"", this_object$`bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\", \"null\".", sep = ""))
        }
        self$`bid_strategy_type` <- this_object$`bid_strategy_type`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupUpdateRequest in JSON format
    #' @export
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
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdGroupUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupUpdateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`budget_in_micro_currency` <- this_object$`budget_in_micro_currency`
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      self$`optimization_goal_metadata` <- AdGroupCommonOptimizationGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`optimization_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`budget_type` <- BudgetType$new()$fromJSON(jsonlite::toJSON(this_object$`budget_type`, auto_unbox = TRUE, digits = NA))
      self$`start_time` <- this_object$`start_time`
      self$`end_time` <- this_object$`end_time`
      self$`targeting_spec` <- TargetingSpec$new()$fromJSON(jsonlite::toJSON(this_object$`targeting_spec`, auto_unbox = TRUE, digits = NA))
      self$`lifetime_frequency_cap` <- this_object$`lifetime_frequency_cap`
      self$`tracking_urls` <- AdGroupCommonTrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`auto_targeting_enabled` <- this_object$`auto_targeting_enabled`
      self$`placement_group` <- PlacementGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`placement_group`, auto_unbox = TRUE, digits = NA))
      self$`pacing_delivery_type` <- PacingDeliveryType$new()$fromJSON(jsonlite::toJSON(this_object$`pacing_delivery_type`, auto_unbox = TRUE, digits = NA))
      self$`campaign_id` <- this_object$`campaign_id`
      self$`billable_event` <- ActionType$new()$fromJSON(jsonlite::toJSON(this_object$`billable_event`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`bid_strategy_type`) && !(this_object$`bid_strategy_type` %in% c("AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "null"))) {
        stop(paste("Error! \"", this_object$`bid_strategy_type`, "\" cannot be assigned to `bid_strategy_type`. Must be \"AUTOMATIC_BID\", \"MAX_BID\", \"TARGET_AVG\", \"null\".", sep = ""))
      }
      self$`bid_strategy_type` <- this_object$`bid_strategy_type`
      self$`id` <- this_object$`id`
      self
    },
    #' Validate JSON input with respect to AdGroupUpdateRequest
    #'
    #' @description
    #' Validate JSON input with respect to AdGroupUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
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
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupUpdateRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      if (!str_detect(self$`campaign_id`, "^[C]?\\d+$")) {
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
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`campaign_id`, "^[C]?\\d+$")) {
        invalid_fields["campaign_id"] <- "Invalid value for `campaign_id`, must conform to the pattern ^[C]?\\d+$."
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
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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

