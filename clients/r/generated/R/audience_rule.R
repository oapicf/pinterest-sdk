#' Create a new AudienceRule
#'
#' @description
#' JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
#'
#' @docType class
#' @title AudienceRule
#' @description AudienceRule Class
#' @format An \code{R6Class} generator object
#' @field country Valid countries include: \"US\", \"CA\", and \"GB\". character [optional]
#' @field customer_list_id Customer list ID. For CUSTOMER_LIST `audience_type`. character [optional]
#' @field engagement_domain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. list(character) [optional]
#' @field engagement_type Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. character [optional]
#' @field event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. character [optional]
#' @field event_data  \link{PinterestTagEventData} [optional]
#' @field percentage Percentage should be 1-10. The targeted audience should be this \% size across Pinterest. integer [optional]
#' @field pin_id IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] list(character) [optional]
#' @field prefill Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. character [optional]
#' @field retention_days Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. integer [optional]
#' @field seed_id Audience ID(s). For ACTALIKE `audience_type`. list(character) [optional]
#' @field url Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} list(character) [optional]
#' @field visitor_source_id The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. character [optional]
#' @field event_source Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline object [optional]
#' @field ingestion_source Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api object [optional]
#' @field engager_type Optional for ENGAGEMENT. Engager type value should be 1-2. integer [optional]
#' @field campaign_id Campaign ID for engagement audience filter. list(character) [optional]
#' @field ad_id Ad ID for engagement audience filter. list(character) [optional]
#' @field objective_type Objective for engagement audience filter. list(\link{ObjectiveType}) [optional]
#' @field ad_account_id Ad account ID. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceRule <- R6::R6Class(
  "AudienceRule",
  public = list(
    `country` = NULL,
    `customer_list_id` = NULL,
    `engagement_domain` = NULL,
    `engagement_type` = NULL,
    `event` = NULL,
    `event_data` = NULL,
    `percentage` = NULL,
    `pin_id` = NULL,
    `prefill` = NULL,
    `retention_days` = NULL,
    `seed_id` = NULL,
    `url` = NULL,
    `visitor_source_id` = NULL,
    `event_source` = NULL,
    `ingestion_source` = NULL,
    `engager_type` = NULL,
    `campaign_id` = NULL,
    `ad_id` = NULL,
    `objective_type` = NULL,
    `ad_account_id` = NULL,

    #' @description
    #' Initialize a new AudienceRule class.
    #'
    #' @param country Valid countries include: \"US\", \"CA\", and \"GB\".
    #' @param customer_list_id Customer list ID. For CUSTOMER_LIST `audience_type`.
    #' @param engagement_domain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
    #' @param engagement_type Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
    #' @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
    #' @param event_data event_data
    #' @param percentage Percentage should be 1-10. The targeted audience should be this \% size across Pinterest.
    #' @param pin_id IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
    #' @param prefill Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
    #' @param retention_days Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
    #' @param seed_id Audience ID(s). For ACTALIKE `audience_type`.
    #' @param url Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
    #' @param visitor_source_id The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
    #' @param event_source Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
    #' @param ingestion_source Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
    #' @param engager_type Optional for ENGAGEMENT. Engager type value should be 1-2.
    #' @param campaign_id Campaign ID for engagement audience filter.
    #' @param ad_id Ad ID for engagement audience filter.
    #' @param objective_type Objective for engagement audience filter.
    #' @param ad_account_id Ad account ID.
    #' @param ... Other optional arguments.
    initialize = function(`country` = NULL, `customer_list_id` = NULL, `engagement_domain` = NULL, `engagement_type` = NULL, `event` = NULL, `event_data` = NULL, `percentage` = NULL, `pin_id` = NULL, `prefill` = NULL, `retention_days` = NULL, `seed_id` = NULL, `url` = NULL, `visitor_source_id` = NULL, `event_source` = NULL, `ingestion_source` = NULL, `engager_type` = NULL, `campaign_id` = NULL, `ad_id` = NULL, `objective_type` = NULL, `ad_account_id` = NULL, ...) {
      if (!is.null(`country`)) {
        if (!(is.character(`country`) && length(`country`) == 1)) {
          stop(paste("Error! Invalid data for `country`. Must be a string:", `country`))
        }
        self$`country` <- `country`
      }
      if (!is.null(`customer_list_id`)) {
        if (!(is.character(`customer_list_id`) && length(`customer_list_id`) == 1)) {
          stop(paste("Error! Invalid data for `customer_list_id`. Must be a string:", `customer_list_id`))
        }
        self$`customer_list_id` <- `customer_list_id`
      }
      if (!is.null(`engagement_domain`)) {
        stopifnot(is.vector(`engagement_domain`), length(`engagement_domain`) != 0)
        sapply(`engagement_domain`, function(x) stopifnot(is.character(x)))
        self$`engagement_domain` <- `engagement_domain`
      }
      if (!is.null(`engagement_type`)) {
        if (!(is.character(`engagement_type`) && length(`engagement_type`) == 1)) {
          stop(paste("Error! Invalid data for `engagement_type`. Must be a string:", `engagement_type`))
        }
        self$`engagement_type` <- `engagement_type`
      }
      if (!is.null(`event`)) {
        if (!(is.character(`event`) && length(`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", `event`))
        }
        self$`event` <- `event`
      }
      if (!is.null(`event_data`)) {
        stopifnot(R6::is.R6(`event_data`))
        self$`event_data` <- `event_data`
      }
      if (!is.null(`percentage`)) {
        if (!(is.numeric(`percentage`) && length(`percentage`) == 1)) {
          stop(paste("Error! Invalid data for `percentage`. Must be an integer:", `percentage`))
        }
        self$`percentage` <- `percentage`
      }
      if (!is.null(`pin_id`)) {
        stopifnot(is.vector(`pin_id`), length(`pin_id`) != 0)
        sapply(`pin_id`, function(x) stopifnot(is.character(x)))
        self$`pin_id` <- `pin_id`
      }
      if (!is.null(`prefill`)) {
        if (!(is.logical(`prefill`) && length(`prefill`) == 1)) {
          stop(paste("Error! Invalid data for `prefill`. Must be a boolean:", `prefill`))
        }
        self$`prefill` <- `prefill`
      }
      if (!is.null(`retention_days`)) {
        if (!(is.numeric(`retention_days`) && length(`retention_days`) == 1)) {
          stop(paste("Error! Invalid data for `retention_days`. Must be an integer:", `retention_days`))
        }
        self$`retention_days` <- `retention_days`
      }
      if (!is.null(`seed_id`)) {
        stopifnot(is.vector(`seed_id`), length(`seed_id`) != 0)
        sapply(`seed_id`, function(x) stopifnot(is.character(x)))
        self$`seed_id` <- `seed_id`
      }
      if (!is.null(`url`)) {
        stopifnot(is.vector(`url`), length(`url`) != 0)
        sapply(`url`, function(x) stopifnot(is.character(x)))
        self$`url` <- `url`
      }
      if (!is.null(`visitor_source_id`)) {
        if (!(is.character(`visitor_source_id`) && length(`visitor_source_id`) == 1)) {
          stop(paste("Error! Invalid data for `visitor_source_id`. Must be a string:", `visitor_source_id`))
        }
        self$`visitor_source_id` <- `visitor_source_id`
      }
      if (!is.null(`event_source`)) {
        self$`event_source` <- `event_source`
      }
      if (!is.null(`ingestion_source`)) {
        self$`ingestion_source` <- `ingestion_source`
      }
      if (!is.null(`engager_type`)) {
        if (!(is.numeric(`engager_type`) && length(`engager_type`) == 1)) {
          stop(paste("Error! Invalid data for `engager_type`. Must be an integer:", `engager_type`))
        }
        self$`engager_type` <- `engager_type`
      }
      if (!is.null(`campaign_id`)) {
        stopifnot(is.vector(`campaign_id`), length(`campaign_id`) != 0)
        sapply(`campaign_id`, function(x) stopifnot(is.character(x)))
        self$`campaign_id` <- `campaign_id`
      }
      if (!is.null(`ad_id`)) {
        stopifnot(is.vector(`ad_id`), length(`ad_id`) != 0)
        sapply(`ad_id`, function(x) stopifnot(is.character(x)))
        self$`ad_id` <- `ad_id`
      }
      if (!is.null(`objective_type`)) {
        stopifnot(is.vector(`objective_type`), length(`objective_type`) != 0)
        sapply(`objective_type`, function(x) stopifnot(R6::is.R6(x)))
        self$`objective_type` <- `objective_type`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceRule in JSON format
    toJSON = function() {
      AudienceRuleObject <- list()
      if (!is.null(self$`country`)) {
        AudienceRuleObject[["country"]] <-
          self$`country`
      }
      if (!is.null(self$`customer_list_id`)) {
        AudienceRuleObject[["customer_list_id"]] <-
          self$`customer_list_id`
      }
      if (!is.null(self$`engagement_domain`)) {
        AudienceRuleObject[["engagement_domain"]] <-
          self$`engagement_domain`
      }
      if (!is.null(self$`engagement_type`)) {
        AudienceRuleObject[["engagement_type"]] <-
          self$`engagement_type`
      }
      if (!is.null(self$`event`)) {
        AudienceRuleObject[["event"]] <-
          self$`event`
      }
      if (!is.null(self$`event_data`)) {
        AudienceRuleObject[["event_data"]] <-
          self$`event_data`$toJSON()
      }
      if (!is.null(self$`percentage`)) {
        AudienceRuleObject[["percentage"]] <-
          self$`percentage`
      }
      if (!is.null(self$`pin_id`)) {
        AudienceRuleObject[["pin_id"]] <-
          self$`pin_id`
      }
      if (!is.null(self$`prefill`)) {
        AudienceRuleObject[["prefill"]] <-
          self$`prefill`
      }
      if (!is.null(self$`retention_days`)) {
        AudienceRuleObject[["retention_days"]] <-
          self$`retention_days`
      }
      if (!is.null(self$`seed_id`)) {
        AudienceRuleObject[["seed_id"]] <-
          self$`seed_id`
      }
      if (!is.null(self$`url`)) {
        AudienceRuleObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`visitor_source_id`)) {
        AudienceRuleObject[["visitor_source_id"]] <-
          self$`visitor_source_id`
      }
      if (!is.null(self$`event_source`)) {
        AudienceRuleObject[["event_source"]] <-
          self$`event_source`
      }
      if (!is.null(self$`ingestion_source`)) {
        AudienceRuleObject[["ingestion_source"]] <-
          self$`ingestion_source`
      }
      if (!is.null(self$`engager_type`)) {
        AudienceRuleObject[["engager_type"]] <-
          self$`engager_type`
      }
      if (!is.null(self$`campaign_id`)) {
        AudienceRuleObject[["campaign_id"]] <-
          self$`campaign_id`
      }
      if (!is.null(self$`ad_id`)) {
        AudienceRuleObject[["ad_id"]] <-
          self$`ad_id`
      }
      if (!is.null(self$`objective_type`)) {
        AudienceRuleObject[["objective_type"]] <-
          lapply(self$`objective_type`, function(x) x$toJSON())
      }
      if (!is.null(self$`ad_account_id`)) {
        AudienceRuleObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      AudienceRuleObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceRule
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceRule
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        self$`country` <- this_object$`country`
      }
      if (!is.null(this_object$`customer_list_id`)) {
        self$`customer_list_id` <- this_object$`customer_list_id`
      }
      if (!is.null(this_object$`engagement_domain`)) {
        self$`engagement_domain` <- ApiClient$new()$deserializeObj(this_object$`engagement_domain`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`engagement_type`)) {
        self$`engagement_type` <- this_object$`engagement_type`
      }
      if (!is.null(this_object$`event`)) {
        self$`event` <- this_object$`event`
      }
      if (!is.null(this_object$`event_data`)) {
        `event_data_object` <- PinterestTagEventData$new()
        `event_data_object`$fromJSON(jsonlite::toJSON(this_object$`event_data`, auto_unbox = TRUE, digits = NA))
        self$`event_data` <- `event_data_object`
      }
      if (!is.null(this_object$`percentage`)) {
        self$`percentage` <- this_object$`percentage`
      }
      if (!is.null(this_object$`pin_id`)) {
        self$`pin_id` <- ApiClient$new()$deserializeObj(this_object$`pin_id`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`prefill`)) {
        self$`prefill` <- this_object$`prefill`
      }
      if (!is.null(this_object$`retention_days`)) {
        self$`retention_days` <- this_object$`retention_days`
      }
      if (!is.null(this_object$`seed_id`)) {
        self$`seed_id` <- ApiClient$new()$deserializeObj(this_object$`seed_id`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- ApiClient$new()$deserializeObj(this_object$`url`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`visitor_source_id`)) {
        self$`visitor_source_id` <- this_object$`visitor_source_id`
      }
      if (!is.null(this_object$`event_source`)) {
        self$`event_source` <- this_object$`event_source`
      }
      if (!is.null(this_object$`ingestion_source`)) {
        self$`ingestion_source` <- this_object$`ingestion_source`
      }
      if (!is.null(this_object$`engager_type`)) {
        self$`engager_type` <- this_object$`engager_type`
      }
      if (!is.null(this_object$`campaign_id`)) {
        self$`campaign_id` <- ApiClient$new()$deserializeObj(this_object$`campaign_id`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_id`)) {
        self$`ad_id` <- ApiClient$new()$deserializeObj(this_object$`ad_id`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`objective_type`)) {
        self$`objective_type` <- ApiClient$new()$deserializeObj(this_object$`objective_type`, "array[ObjectiveType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceRule in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
            "%s"
                    ',
          self$`country`
          )
        },
        if (!is.null(self$`customer_list_id`)) {
          sprintf(
          '"customer_list_id":
            "%s"
                    ',
          self$`customer_list_id`
          )
        },
        if (!is.null(self$`engagement_domain`)) {
          sprintf(
          '"engagement_domain":
             [%s]
          ',
          paste(unlist(lapply(self$`engagement_domain`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`engagement_type`)) {
          sprintf(
          '"engagement_type":
            "%s"
                    ',
          self$`engagement_type`
          )
        },
        if (!is.null(self$`event`)) {
          sprintf(
          '"event":
            "%s"
                    ',
          self$`event`
          )
        },
        if (!is.null(self$`event_data`)) {
          sprintf(
          '"event_data":
          %s
          ',
          jsonlite::toJSON(self$`event_data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`percentage`)) {
          sprintf(
          '"percentage":
            %d
                    ',
          self$`percentage`
          )
        },
        if (!is.null(self$`pin_id`)) {
          sprintf(
          '"pin_id":
             [%s]
          ',
          paste(unlist(lapply(self$`pin_id`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`prefill`)) {
          sprintf(
          '"prefill":
            %s
                    ',
          tolower(self$`prefill`)
          )
        },
        if (!is.null(self$`retention_days`)) {
          sprintf(
          '"retention_days":
            %d
                    ',
          self$`retention_days`
          )
        },
        if (!is.null(self$`seed_id`)) {
          sprintf(
          '"seed_id":
             [%s]
          ',
          paste(unlist(lapply(self$`seed_id`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
             [%s]
          ',
          paste(unlist(lapply(self$`url`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`visitor_source_id`)) {
          sprintf(
          '"visitor_source_id":
            "%s"
                    ',
          self$`visitor_source_id`
          )
        },
        if (!is.null(self$`event_source`)) {
          sprintf(
          '"event_source":
            "%s"
                    ',
          self$`event_source`
          )
        },
        if (!is.null(self$`ingestion_source`)) {
          sprintf(
          '"ingestion_source":
            "%s"
                    ',
          self$`ingestion_source`
          )
        },
        if (!is.null(self$`engager_type`)) {
          sprintf(
          '"engager_type":
            %d
                    ',
          self$`engager_type`
          )
        },
        if (!is.null(self$`campaign_id`)) {
          sprintf(
          '"campaign_id":
             [%s]
          ',
          paste(unlist(lapply(self$`campaign_id`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`ad_id`)) {
          sprintf(
          '"ad_id":
             [%s]
          ',
          paste(unlist(lapply(self$`ad_id`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`objective_type`)) {
          sprintf(
          '"objective_type":
          [%s]
',
          paste(sapply(self$`objective_type`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceRule
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceRule
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- this_object$`country`
      self$`customer_list_id` <- this_object$`customer_list_id`
      self$`engagement_domain` <- ApiClient$new()$deserializeObj(this_object$`engagement_domain`, "array[character]", loadNamespace("openapi"))
      self$`engagement_type` <- this_object$`engagement_type`
      self$`event` <- this_object$`event`
      self$`event_data` <- PinterestTagEventData$new()$fromJSON(jsonlite::toJSON(this_object$`event_data`, auto_unbox = TRUE, digits = NA))
      self$`percentage` <- this_object$`percentage`
      self$`pin_id` <- ApiClient$new()$deserializeObj(this_object$`pin_id`, "array[character]", loadNamespace("openapi"))
      self$`prefill` <- this_object$`prefill`
      self$`retention_days` <- this_object$`retention_days`
      self$`seed_id` <- ApiClient$new()$deserializeObj(this_object$`seed_id`, "array[character]", loadNamespace("openapi"))
      self$`url` <- ApiClient$new()$deserializeObj(this_object$`url`, "array[character]", loadNamespace("openapi"))
      self$`visitor_source_id` <- this_object$`visitor_source_id`
      self$`event_source` <- this_object$`event_source`
      self$`ingestion_source` <- this_object$`ingestion_source`
      self$`engager_type` <- this_object$`engager_type`
      self$`campaign_id` <- ApiClient$new()$deserializeObj(this_object$`campaign_id`, "array[character]", loadNamespace("openapi"))
      self$`ad_id` <- ApiClient$new()$deserializeObj(this_object$`ad_id`, "array[character]", loadNamespace("openapi"))
      self$`objective_type` <- ApiClient$new()$deserializeObj(this_object$`objective_type`, "array[ObjectiveType]", loadNamespace("openapi"))
      self$`ad_account_id` <- this_object$`ad_account_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceRule and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceRule
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`customer_list_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`visitor_source_id`, "^\\d+$")) {
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
      if (!str_detect(self$`customer_list_id`, "^\\d+$")) {
        invalid_fields["customer_list_id"] <- "Invalid value for `customer_list_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`visitor_source_id`, "^\\d+$")) {
        invalid_fields["visitor_source_id"] <- "Invalid value for `visitor_source_id`, must conform to the pattern ^\\d+$."
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
# AudienceRule$unlock()
#
## Below is an example to define the print function
# AudienceRule$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceRule$lock()

