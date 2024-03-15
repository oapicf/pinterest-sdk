#' Create a new CampaignCommon
#'
#' @description
#' Campaign Data
#'
#' @docType class
#' @title CampaignCommon
#' @description CampaignCommon Class
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
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignCommon <- R6::R6Class(
  "CampaignCommon",
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
    #' Initialize a new CampaignCommon class.
    #'
    #' @description
    #' Initialize a new CampaignCommon class.
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
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ad_account_id` = NULL, `name` = NULL, `status` = NULL, `lifetime_spend_cap` = NULL, `daily_spend_cap` = NULL, `order_line_id` = NULL, `tracking_urls` = NULL, `start_time` = NULL, `end_time` = NULL, `summary_status` = NULL, ...) {
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignCommon in JSON format
    #' @export
    toJSON = function() {
      CampaignCommonObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CampaignCommonObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`name`)) {
        CampaignCommonObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`status`)) {
        CampaignCommonObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`lifetime_spend_cap`)) {
        CampaignCommonObject[["lifetime_spend_cap"]] <-
          self$`lifetime_spend_cap`
      }
      if (!is.null(self$`daily_spend_cap`)) {
        CampaignCommonObject[["daily_spend_cap"]] <-
          self$`daily_spend_cap`
      }
      if (!is.null(self$`order_line_id`)) {
        CampaignCommonObject[["order_line_id"]] <-
          self$`order_line_id`
      }
      if (!is.null(self$`tracking_urls`)) {
        CampaignCommonObject[["tracking_urls"]] <-
          self$`tracking_urls`$toJSON()
      }
      if (!is.null(self$`start_time`)) {
        CampaignCommonObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        CampaignCommonObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`summary_status`)) {
        CampaignCommonObject[["summary_status"]] <-
          self$`summary_status`$toJSON()
      }
      CampaignCommonObject
    },
    #' Deserialize JSON string into an instance of CampaignCommon
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCommon
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
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignCommon in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignCommon
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignCommon
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
      self
    },
    #' Validate JSON input with respect to CampaignCommon
    #'
    #' @description
    #' Validate JSON input with respect to CampaignCommon and throw an exception if invalid
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
    #' @return String representation of CampaignCommon
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
# CampaignCommon$unlock()
#
## Below is an example to define the print function
# CampaignCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignCommon$lock()

