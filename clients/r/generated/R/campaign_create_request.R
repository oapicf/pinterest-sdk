#' Create a new CampaignCreateRequest
#'
#' @description
#' CampaignCreateRequest Class
#'
#' @docType class
#' @title CampaignCreateRequest
#' @description CampaignCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. character
#' @field name Campaign name. character
#' @field status  \link{EntityStatus} [optional]
#' @field lifetime_spend_cap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. integer [optional]
#' @field daily_spend_cap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. integer [optional]
#' @field order_line_id Order line ID that appears on the invoice. character [optional]
#' @field tracking_urls  \link{TrackingUrls} [optional]
#' @field start_time Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. integer [optional]
#' @field end_time Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. integer [optional]
#' @field is_flexible_daily_budgets Determine if a campaign has flexible daily budgets setup. character [optional]
#' @field default_ad_group_budget_in_micro_currency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. integer [optional]
#' @field is_automated_campaign Specifies whether the campaign was created in the automated campaign flow character [optional]
#' @field objective_type  \link{ObjectiveType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignCreateRequest <- R6::R6Class(
  "CampaignCreateRequest",
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
    `is_flexible_daily_budgets` = NULL,
    `default_ad_group_budget_in_micro_currency` = NULL,
    `is_automated_campaign` = NULL,
    `objective_type` = NULL,

    #' @description
    #' Initialize a new CampaignCreateRequest class.
    #'
    #' @param ad_account_id Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
    #' @param name Campaign name.
    #' @param objective_type objective_type
    #' @param status status. Default to "ACTIVE".
    #' @param lifetime_spend_cap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
    #' @param daily_spend_cap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
    #' @param order_line_id Order line ID that appears on the invoice.
    #' @param tracking_urls tracking_urls
    #' @param start_time Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    #' @param end_time Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    #' @param is_flexible_daily_budgets Determine if a campaign has flexible daily budgets setup.. Default to FALSE.
    #' @param default_ad_group_budget_in_micro_currency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
    #' @param is_automated_campaign Specifies whether the campaign was created in the automated campaign flow. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id`, `name`, `objective_type`, `status` = "ACTIVE", `lifetime_spend_cap` = NULL, `daily_spend_cap` = NULL, `order_line_id` = NULL, `tracking_urls` = NULL, `start_time` = NULL, `end_time` = NULL, `is_flexible_daily_budgets` = FALSE, `default_ad_group_budget_in_micro_currency` = NULL, `is_automated_campaign` = FALSE, ...) {
      if (!missing(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`objective_type`)) {
        if (!(`objective_type` %in% c())) {
          stop(paste("Error! \"", `objective_type`, "\" cannot be assigned to `objective_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`objective_type`))
        self$`objective_type` <- `objective_type`
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
    },

    #' @description
    #' To JSON String
    #'
    #' @return CampaignCreateRequest in JSON format
    toJSON = function() {
      CampaignCreateRequestObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CampaignCreateRequestObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`name`)) {
        CampaignCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`status`)) {
        CampaignCreateRequestObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`lifetime_spend_cap`)) {
        CampaignCreateRequestObject[["lifetime_spend_cap"]] <-
          self$`lifetime_spend_cap`
      }
      if (!is.null(self$`daily_spend_cap`)) {
        CampaignCreateRequestObject[["daily_spend_cap"]] <-
          self$`daily_spend_cap`
      }
      if (!is.null(self$`order_line_id`)) {
        CampaignCreateRequestObject[["order_line_id"]] <-
          self$`order_line_id`
      }
      if (!is.null(self$`tracking_urls`)) {
        CampaignCreateRequestObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      if (!is.null(self$`start_time`)) {
        CampaignCreateRequestObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        CampaignCreateRequestObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`is_flexible_daily_budgets`)) {
        CampaignCreateRequestObject[["is_flexible_daily_budgets"]] <-
          self$`is_flexible_daily_budgets`
      }
      if (!is.null(self$`default_ad_group_budget_in_micro_currency`)) {
        CampaignCreateRequestObject[["default_ad_group_budget_in_micro_currency"]] <-
          self$`default_ad_group_budget_in_micro_currency`
      }
      if (!is.null(self$`is_automated_campaign`)) {
        CampaignCreateRequestObject[["is_automated_campaign"]] <-
          self$`is_automated_campaign`
      }
      if (!is.null(self$`objective_type`)) {
        CampaignCreateRequestObject[["objective_type"]] <-
          self$`objective_type`$toJSON()
      }
      CampaignCreateRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateRequest
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
        `tracking_urls_object` <- TrackingUrls$new()
        `tracking_urls_object`$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
        self$`tracking_urls` <- `tracking_urls_object`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
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
      if (!is.null(this_object$`objective_type`)) {
        `objective_type_object` <- ObjectiveType$new()
        `objective_type_object`$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
        self$`objective_type` <- `objective_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CampaignCreateRequest in JSON format
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
        if (!is.null(self$`objective_type`)) {
          sprintf(
          '"objective_type":
          %s
          ',
          jsonlite::toJSON(self$`objective_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`name` <- this_object$`name`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`lifetime_spend_cap` <- this_object$`lifetime_spend_cap`
      self$`daily_spend_cap` <- this_object$`daily_spend_cap`
      self$`order_line_id` <- this_object$`order_line_id`
      self$`tracking_urls` <- TrackingUrls$new()$fromJSON(jsonlite::toJSON(this_object$`tracking_urls`, auto_unbox = TRUE, digits = NA))
      self$`start_time` <- this_object$`start_time`
      self$`end_time` <- this_object$`end_time`
      self$`is_flexible_daily_budgets` <- this_object$`is_flexible_daily_budgets`
      self$`default_ad_group_budget_in_micro_currency` <- this_object$`default_ad_group_budget_in_micro_currency`
      self$`is_automated_campaign` <- this_object$`is_automated_campaign`
      self$`objective_type` <- ObjectiveType$new()$fromJSON(jsonlite::toJSON(this_object$`objective_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_account_id`
      if (!is.null(input_json$`ad_account_id`)) {
        if (!(is.character(input_json$`ad_account_id`) && length(input_json$`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", input_json$`ad_account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignCreateRequest: the required field `ad_account_id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignCreateRequest: the required field `name` is missing."))
      }
      # check the required field `objective_type`
      if (!is.null(input_json$`objective_type`)) {
        stopifnot(R6::is.R6(input_json$`objective_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignCreateRequest: the required field `objective_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (!str_detect(self$`order_line_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
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
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        invalid_fields["ad_account_id"] <- "Non-nullable required field `ad_account_id` cannot be null."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (!str_detect(self$`order_line_id`, "^\\d+$")) {
        invalid_fields["order_line_id"] <- "Invalid value for `order_line_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `objective_type` is null
      if (is.null(self$`objective_type`)) {
        invalid_fields["objective_type"] <- "Non-nullable required field `objective_type` cannot be null."
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
# CampaignCreateRequest$unlock()
#
## Below is an example to define the print function
# CampaignCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignCreateRequest$lock()

