#' Create a new CampaignCreateResponseData
#'
#' @description
#' CampaignCreateResponseData Class
#'
#' @docType class
#' @title CampaignCreateResponseData
#' @description CampaignCreateResponseData Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. character [optional]
#' @field name Campaign name. character [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field lifetime_spend_cap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. integer [optional]
#' @field daily_spend_cap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. integer [optional]
#' @field order_line_id Order line ID that appears on the invoice. character [optional]
#' @field tracking_urls  \link{AdCommonTrackingUrls} [optional]
#' @field start_time Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. integer [optional]
#' @field end_time Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. integer [optional]
#' @field summary_status  \link{CampaignSummaryStatus} [optional]
#' @field is_flexible_daily_budgets Determines if a campaign has flexible daily budgets setup. character [optional]
#' @field default_ad_group_budget_in_micro_currency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. integer [optional]
#' @field is_automated_campaign Specifies whether the campaign was created in the automated campaign flow character [optional]
#' @field id Campaign ID. character [optional]
#' @field objective_type  \link{ObjectiveType} [optional]
#' @field created_time Campaign creation time. Unix timestamp in seconds. integer [optional]
#' @field updated_time UTC timestamp. Last update time. integer [optional]
#' @field type Always \"campaign\". character [optional]
#' @field is_campaign_budget_optimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignCreateResponseData <- R6::R6Class(
  "CampaignCreateResponseData",
  public = list(
    `ad_account_id` = NULL,
    `name` = NULL,
    `status` = NULL,
    `lifetime_spend_cap` = NULL,
    `daily_spend_cap` = NULL,
    `order_line_id` = NULL,
    `tracking_urls` = NULL,
    `start_time` = NULL,
    `end_time` = NULL,
    `summary_status` = NULL,
    `is_flexible_daily_budgets` = NULL,
    `default_ad_group_budget_in_micro_currency` = NULL,
    `is_automated_campaign` = NULL,
    `id` = NULL,
    `objective_type` = NULL,
    `created_time` = NULL,
    `updated_time` = NULL,
    `type` = NULL,
    `is_campaign_budget_optimization` = NULL,
    #' Initialize a new CampaignCreateResponseData class.
    #'
    #' @description
    #' Initialize a new CampaignCreateResponseData class.
    #'
    #' @param ad_account_id Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
    #' @param name Campaign name.
    #' @param status status
    #' @param lifetime_spend_cap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
    #' @param daily_spend_cap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
    #' @param order_line_id Order line ID that appears on the invoice.
    #' @param tracking_urls tracking_urls
    #' @param start_time Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    #' @param end_time Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    #' @param summary_status summary_status
    #' @param is_flexible_daily_budgets Determines if a campaign has flexible daily budgets setup.
    #' @param default_ad_group_budget_in_micro_currency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
    #' @param is_automated_campaign Specifies whether the campaign was created in the automated campaign flow. Default to FALSE.
    #' @param id Campaign ID.
    #' @param objective_type objective_type
    #' @param created_time Campaign creation time. Unix timestamp in seconds.
    #' @param updated_time UTC timestamp. Last update time.
    #' @param type Always \"campaign\".
    #' @param is_campaign_budget_optimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ad_account_id` = NULL, `name` = NULL, `status` = NULL, `lifetime_spend_cap` = NULL, `daily_spend_cap` = NULL, `order_line_id` = NULL, `tracking_urls` = NULL, `start_time` = NULL, `end_time` = NULL, `summary_status` = NULL, `is_flexible_daily_budgets` = NULL, `default_ad_group_budget_in_micro_currency` = NULL, `is_automated_campaign` = FALSE, `id` = NULL, `objective_type` = NULL, `created_time` = NULL, `updated_time` = NULL, `type` = NULL, `is_campaign_budget_optimization` = NULL, ...) {
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
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
      if (!is.null(`lifetime_spend_cap`)) {
        if (!(is.numeric(`lifetime_spend_cap`) && length(`lifetime_spend_cap`) == 1)) {
          stop(paste("Error! Invalid data for `lifetime_spend_cap`. Must be an integer:", `lifetime_spend_cap`))
        }
        self$`lifetime_spend_cap` <- `lifetime_spend_cap`
      }
      if (!is.null(`daily_spend_cap`)) {
        if (!(is.numeric(`daily_spend_cap`) && length(`daily_spend_cap`) == 1)) {
          stop(paste("Error! Invalid data for `daily_spend_cap`. Must be an integer:", `daily_spend_cap`))
        }
        self$`daily_spend_cap` <- `daily_spend_cap`
      }
      if (!is.null(`order_line_id`)) {
        if (!(is.character(`order_line_id`) && length(`order_line_id`) == 1)) {
          stop(paste("Error! Invalid data for `order_line_id`. Must be a string:", `order_line_id`))
        }
        self$`order_line_id` <- `order_line_id`
      }
      if (!is.null(`tracking_urls`)) {
        stopifnot(R6::is.R6(`tracking_urls`))
        self$`tracking_urls` <- `tracking_urls`
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
      if (!is.null(`summary_status`)) {
        if (!(`summary_status` %in% c())) {
          stop(paste("Error! \"", `summary_status`, "\" cannot be assigned to `summary_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`summary_status`))
        self$`summary_status` <- `summary_status`
      }
      if (!is.null(`is_flexible_daily_budgets`)) {
        if (!(is.logical(`is_flexible_daily_budgets`) && length(`is_flexible_daily_budgets`) == 1)) {
          stop(paste("Error! Invalid data for `is_flexible_daily_budgets`. Must be a boolean:", `is_flexible_daily_budgets`))
        }
        self$`is_flexible_daily_budgets` <- `is_flexible_daily_budgets`
      }
      if (!is.null(`default_ad_group_budget_in_micro_currency`)) {
        if (!(is.numeric(`default_ad_group_budget_in_micro_currency`) && length(`default_ad_group_budget_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `default_ad_group_budget_in_micro_currency`. Must be an integer:", `default_ad_group_budget_in_micro_currency`))
        }
        self$`default_ad_group_budget_in_micro_currency` <- `default_ad_group_budget_in_micro_currency`
      }
      if (!is.null(`is_automated_campaign`)) {
        if (!(is.logical(`is_automated_campaign`) && length(`is_automated_campaign`) == 1)) {
          stop(paste("Error! Invalid data for `is_automated_campaign`. Must be a boolean:", `is_automated_campaign`))
        }
        self$`is_automated_campaign` <- `is_automated_campaign`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
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
      if (!is.null(`is_campaign_budget_optimization`)) {
        if (!(is.logical(`is_campaign_budget_optimization`) && length(`is_campaign_budget_optimization`) == 1)) {
          stop(paste("Error! Invalid data for `is_campaign_budget_optimization`. Must be a boolean:", `is_campaign_budget_optimization`))
        }
        self$`is_campaign_budget_optimization` <- `is_campaign_budget_optimization`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignCreateResponseData in JSON format
    #' @export
    toJSON = function() {
      CampaignCreateResponseDataObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CampaignCreateResponseDataObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`name`)) {
        CampaignCreateResponseDataObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`status`)) {
        CampaignCreateResponseDataObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`lifetime_spend_cap`)) {
        CampaignCreateResponseDataObject[["lifetime_spend_cap"]] <-
          self$`lifetime_spend_cap`
      }
      if (!is.null(self$`daily_spend_cap`)) {
        CampaignCreateResponseDataObject[["daily_spend_cap"]] <-
          self$`daily_spend_cap`
      }
      if (!is.null(self$`order_line_id`)) {
        CampaignCreateResponseDataObject[["order_line_id"]] <-
          self$`order_line_id`
      }
      if (!is.null(self$`tracking_urls`)) {
        CampaignCreateResponseDataObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      if (!is.null(self$`start_time`)) {
        CampaignCreateResponseDataObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        CampaignCreateResponseDataObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`summary_status`)) {
        CampaignCreateResponseDataObject[["summary_status"]] <-
          self$`summary_status`$toJSON()
      }
      if (!is.null(self$`is_flexible_daily_budgets`)) {
        CampaignCreateResponseDataObject[["is_flexible_daily_budgets"]] <-
          self$`is_flexible_daily_budgets`
      }
      if (!is.null(self$`default_ad_group_budget_in_micro_currency`)) {
        CampaignCreateResponseDataObject[["default_ad_group_budget_in_micro_currency"]] <-
          self$`default_ad_group_budget_in_micro_currency`
      }
      if (!is.null(self$`is_automated_campaign`)) {
        CampaignCreateResponseDataObject[["is_automated_campaign"]] <-
          self$`is_automated_campaign`
      }
      if (!is.null(self$`id`)) {
        CampaignCreateResponseDataObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`objective_type`)) {
        CampaignCreateResponseDataObject[["objective_type"]] <-
          self$`objective_type`$toJSON()
      }
      if (!is.null(self$`created_time`)) {
        CampaignCreateResponseDataObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`updated_time`)) {
        CampaignCreateResponseDataObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`type`)) {
        CampaignCreateResponseDataObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`is_campaign_budget_optimization`)) {
        CampaignCreateResponseDataObject[["is_campaign_budget_optimization"]] <-
          self$`is_campaign_budget_optimization`
      }
      CampaignCreateResponseDataObject
    },
    #' Deserialize JSON string into an instance of CampaignCreateResponseData
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateResponseData
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`lifetime_spend_cap`)) {
        self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      }
      if (!is.null(this_object$`daily_spend_cap`)) {
        self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      }
      if (!is.null(this_object$`order_line_id`)) {
        self$`order_line_id` <- this_object$`order_line_id`
      }
      if (!is.null(this_object$`tracking_urls`)) {
        `tracking_urls_object` <- AdCommonTrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`summary_status`)) {
        `summary_status_object` <- CampaignSummaryStatus$new()
        `summary_status_object`$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
        self$`summary_status` <- `summary_status_object`
      }
      if (!is.null(this_object$`is_flexible_daily_budgets`)) {
        self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      }
      if (!is.null(this_object$`default_ad_group_budget_in_micro_currency`)) {
        self$`default_ad_group_budget_in_micro_currency` <- this_object$`default_ad_group_budget_in_micro_currency`
      }
      if (!is.null(this_object$`is_automated_campaign`)) {
        self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- ObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
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
      if (!is.null(this_object$`is_campaign_budget_optimization`)) {
        self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignCreateResponseData in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
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
        if (!is.null(self$`lifetime_spend_cap`)) {
          sprintf(
          '"lifetime_spend_cap":
            %d
                    ',
          self$`lifetime_spend_cap`
          )
        },
        if (!is.null(self$`daily_spend_cap`)) {
          sprintf(
          '"daily_spend_cap":
            %d
                    ',
          self$`daily_spend_cap`
          )
        },
        if (!is.null(self$`order_line_id`)) {
          sprintf(
          '"order_line_id":
            "%s"
                    ',
          self$`order_line_id`
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
        if (!is.null(self$`summary_status`)) {
          sprintf(
          '"summary_status":
          %s
          ',
          jsonlite::toJSON(self$`summary_status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`is_flexible_daily_budgets`)) {
          sprintf(
          '"is_flexible_daily_budgets":
            %s
                    ',
          tolower(self$`is_flexible_daily_budgets`)
          )
        },
        if (!is.null(self$`default_ad_group_budget_in_micro_currency`)) {
          sprintf(
          '"default_ad_group_budget_in_micro_currency":
            %d
                    ',
          self$`default_ad_group_budget_in_micro_currency`
          )
        },
        if (!is.null(self$`is_automated_campaign`)) {
          sprintf(
          '"is_automated_campaign":
            %s
                    ',
          tolower(self$`is_automated_campaign`)
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
        if (!is.null(self$`objective_type`)) {
          sprintf(
          '"objective_type":
          %s
          ',
          jsonlite::toJSON(self$`objective_type`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`is_campaign_budget_optimization`)) {
          sprintf(
          '"is_campaign_budget_optimization":
            %s
                    ',
          tolower(self$`is_campaign_budget_optimization`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignCreateResponseData
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateResponseData
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`name` <- this_object$`name`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      self$`order_line_id` <- this_object$`order_line_id`
      self$`tracking_urls` <- AdCommonTrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`start_time` <- this_object$`start_time`
      self$`end_time` <- this_object$`end_time`
      self$`summary_status` <- CampaignSummaryStatus$new()$fromJSON(jsonlite::toJSON(this_object$`summary_status`, auto_unbox = TRUE, digits = NA))
      self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      self$`default_ad_group_budget_in_micro_currency` <- this_object$`default_ad_group_budget_in_micro_currency`
      self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      self$`id` <- this_object$`id`
      self$`objective_type` <- ObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`updated_time` <- this_object$`updated_time`
      self$`type` <- this_object$`type`
      self$`is_campaign_budget_optimization` <- this_object$`is_campaign_budget_optimization`
      self
    },
    #' Validate JSON input with respect to CampaignCreateResponseData
    #'
    #' @description
    #' Validate JSON input with respect to CampaignCreateResponseData and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignCreateResponseData
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`order_line_id`, "^\\d+$")) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`order_line_id`, "^\\d+$")) {
        invalid_fields["order_line_id"] <- "Invalid value for `order_line_id`, must conform to the pattern ^\\d+$."
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
# CampaignCreateResponseData$unlock()
#
## Below is an example to define the print function
# CampaignCreateResponseData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignCreateResponseData$lock()

