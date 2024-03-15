#' Create a new SSIOOrderLine
#'
#' @description
#' SSIOOrderLine Class
#'
#' @docType class
#' @title SSIOOrderLine
#' @description SSIOOrderLine Class
#' @format An \code{R6Class} generator object
#' @field salesforce_order_line_id OrderLineId in SFDC character [optional]
#' @field ads_manager_order_line_id Ads manager OrderLineId character [optional]
#' @field pin_order_id The pin order id associated with the order line in SFDC character [optional]
#' @field last_modified_date_time Last modified date. character [optional]
#' @field start_date Start date of the order line. character [optional]
#' @field end_date End date of the order line. character [optional]
#' @field bill_to_company_name Bill To Company name character [optional]
#' @field billing_contact_firstname Billing contact first name character [optional]
#' @field billing_contact_lastname Billing contact last name character [optional]
#' @field billing_contact_email Billing contact email character [optional]
#' @field media_contact_email Billing media email character [optional]
#' @field media_contact_firstname Billing contact first name character [optional]
#' @field media_contact_lastname Billing contact first name character [optional]
#' @field currency_info  \link{Currency} [optional]
#' @field agency_link Agency link character [optional]
#' @field po_number The po number character [optional]
#' @field order_name The order name character [optional]
#' @field pmp_name The Pinterest marketing partner name character [optional]
#' @field accepted_terms_id The SFDC id for the terms character [optional]
#' @field accepted_terms_time The UTC timestamp (to the nearest sec) of when terms were accepted character [optional]
#' @field budget_amount If Budget order line, the budget amount. numeric [optional]
#' @field estimated_monthly_spend If Ongoing (perpetual) order line, the estimated monthly spend numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOOrderLine <- R6::R6Class(
  "SSIOOrderLine",
  public = list(
    `salesforce_order_line_id` = NULL,
    `ads_manager_order_line_id` = NULL,
    `pin_order_id` = NULL,
    `last_modified_date_time` = NULL,
    `start_date` = NULL,
    `end_date` = NULL,
    `bill_to_company_name` = NULL,
    `billing_contact_firstname` = NULL,
    `billing_contact_lastname` = NULL,
    `billing_contact_email` = NULL,
    `media_contact_email` = NULL,
    `media_contact_firstname` = NULL,
    `media_contact_lastname` = NULL,
    `currency_info` = NULL,
    `agency_link` = NULL,
    `po_number` = NULL,
    `order_name` = NULL,
    `pmp_name` = NULL,
    `accepted_terms_id` = NULL,
    `accepted_terms_time` = NULL,
    `budget_amount` = NULL,
    `estimated_monthly_spend` = NULL,
    #' Initialize a new SSIOOrderLine class.
    #'
    #' @description
    #' Initialize a new SSIOOrderLine class.
    #'
    #' @param salesforce_order_line_id OrderLineId in SFDC
    #' @param ads_manager_order_line_id Ads manager OrderLineId
    #' @param pin_order_id The pin order id associated with the order line in SFDC
    #' @param last_modified_date_time Last modified date.
    #' @param start_date Start date of the order line.
    #' @param end_date End date of the order line.
    #' @param bill_to_company_name Bill To Company name
    #' @param billing_contact_firstname Billing contact first name
    #' @param billing_contact_lastname Billing contact last name
    #' @param billing_contact_email Billing contact email
    #' @param media_contact_email Billing media email
    #' @param media_contact_firstname Billing contact first name
    #' @param media_contact_lastname Billing contact first name
    #' @param currency_info currency_info
    #' @param agency_link Agency link
    #' @param po_number The po number
    #' @param order_name The order name
    #' @param pmp_name The Pinterest marketing partner name
    #' @param accepted_terms_id The SFDC id for the terms
    #' @param accepted_terms_time The UTC timestamp (to the nearest sec) of when terms were accepted
    #' @param budget_amount If Budget order line, the budget amount.
    #' @param estimated_monthly_spend If Ongoing (perpetual) order line, the estimated monthly spend
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`salesforce_order_line_id` = NULL, `ads_manager_order_line_id` = NULL, `pin_order_id` = NULL, `last_modified_date_time` = NULL, `start_date` = NULL, `end_date` = NULL, `bill_to_company_name` = NULL, `billing_contact_firstname` = NULL, `billing_contact_lastname` = NULL, `billing_contact_email` = NULL, `media_contact_email` = NULL, `media_contact_firstname` = NULL, `media_contact_lastname` = NULL, `currency_info` = NULL, `agency_link` = NULL, `po_number` = NULL, `order_name` = NULL, `pmp_name` = NULL, `accepted_terms_id` = NULL, `accepted_terms_time` = NULL, `budget_amount` = NULL, `estimated_monthly_spend` = NULL, ...) {
      if (!is.null(`salesforce_order_line_id`)) {
        if (!(is.character(`salesforce_order_line_id`) && length(`salesforce_order_line_id`) == 1)) {
          stop(paste("Error! Invalid data for `salesforce_order_line_id`. Must be a string:", `salesforce_order_line_id`))
        }
        self$`salesforce_order_line_id` <- `salesforce_order_line_id`
      }
      if (!is.null(`ads_manager_order_line_id`)) {
        if (!(is.character(`ads_manager_order_line_id`) && length(`ads_manager_order_line_id`) == 1)) {
          stop(paste("Error! Invalid data for `ads_manager_order_line_id`. Must be a string:", `ads_manager_order_line_id`))
        }
        self$`ads_manager_order_line_id` <- `ads_manager_order_line_id`
      }
      if (!is.null(`pin_order_id`)) {
        if (!(is.character(`pin_order_id`) && length(`pin_order_id`) == 1)) {
          stop(paste("Error! Invalid data for `pin_order_id`. Must be a string:", `pin_order_id`))
        }
        self$`pin_order_id` <- `pin_order_id`
      }
      if (!is.null(`last_modified_date_time`)) {
        if (!(is.character(`last_modified_date_time`) && length(`last_modified_date_time`) == 1)) {
          stop(paste("Error! Invalid data for `last_modified_date_time`. Must be a string:", `last_modified_date_time`))
        }
        self$`last_modified_date_time` <- `last_modified_date_time`
      }
      if (!is.null(`start_date`)) {
        if (!is.character(`start_date`)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
      }
      if (!is.null(`end_date`)) {
        if (!is.character(`end_date`)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!is.null(`bill_to_company_name`)) {
        if (!(is.character(`bill_to_company_name`) && length(`bill_to_company_name`) == 1)) {
          stop(paste("Error! Invalid data for `bill_to_company_name`. Must be a string:", `bill_to_company_name`))
        }
        self$`bill_to_company_name` <- `bill_to_company_name`
      }
      if (!is.null(`billing_contact_firstname`)) {
        if (!(is.character(`billing_contact_firstname`) && length(`billing_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_firstname`. Must be a string:", `billing_contact_firstname`))
        }
        self$`billing_contact_firstname` <- `billing_contact_firstname`
      }
      if (!is.null(`billing_contact_lastname`)) {
        if (!(is.character(`billing_contact_lastname`) && length(`billing_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_lastname`. Must be a string:", `billing_contact_lastname`))
        }
        self$`billing_contact_lastname` <- `billing_contact_lastname`
      }
      if (!is.null(`billing_contact_email`)) {
        if (!(is.character(`billing_contact_email`) && length(`billing_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_email`. Must be a string:", `billing_contact_email`))
        }
        self$`billing_contact_email` <- `billing_contact_email`
      }
      if (!is.null(`media_contact_email`)) {
        if (!(is.character(`media_contact_email`) && length(`media_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_email`. Must be a string:", `media_contact_email`))
        }
        self$`media_contact_email` <- `media_contact_email`
      }
      if (!is.null(`media_contact_firstname`)) {
        if (!(is.character(`media_contact_firstname`) && length(`media_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_firstname`. Must be a string:", `media_contact_firstname`))
        }
        self$`media_contact_firstname` <- `media_contact_firstname`
      }
      if (!is.null(`media_contact_lastname`)) {
        if (!(is.character(`media_contact_lastname`) && length(`media_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_lastname`. Must be a string:", `media_contact_lastname`))
        }
        self$`media_contact_lastname` <- `media_contact_lastname`
      }
      if (!is.null(`currency_info`)) {
        if (!(`currency_info` %in% c())) {
          stop(paste("Error! \"", `currency_info`, "\" cannot be assigned to `currency_info`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency_info`))
        self$`currency_info` <- `currency_info`
      }
      if (!is.null(`agency_link`)) {
        if (!(is.character(`agency_link`) && length(`agency_link`) == 1)) {
          stop(paste("Error! Invalid data for `agency_link`. Must be a string:", `agency_link`))
        }
        self$`agency_link` <- `agency_link`
      }
      if (!is.null(`po_number`)) {
        if (!(is.character(`po_number`) && length(`po_number`) == 1)) {
          stop(paste("Error! Invalid data for `po_number`. Must be a string:", `po_number`))
        }
        self$`po_number` <- `po_number`
      }
      if (!is.null(`order_name`)) {
        if (!(is.character(`order_name`) && length(`order_name`) == 1)) {
          stop(paste("Error! Invalid data for `order_name`. Must be a string:", `order_name`))
        }
        self$`order_name` <- `order_name`
      }
      if (!is.null(`pmp_name`)) {
        if (!(is.character(`pmp_name`) && length(`pmp_name`) == 1)) {
          stop(paste("Error! Invalid data for `pmp_name`. Must be a string:", `pmp_name`))
        }
        self$`pmp_name` <- `pmp_name`
      }
      if (!is.null(`accepted_terms_id`)) {
        if (!(is.character(`accepted_terms_id`) && length(`accepted_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_id`. Must be a string:", `accepted_terms_id`))
        }
        self$`accepted_terms_id` <- `accepted_terms_id`
      }
      if (!is.null(`accepted_terms_time`)) {
        if (!(is.character(`accepted_terms_time`) && length(`accepted_terms_time`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_time`. Must be a string:", `accepted_terms_time`))
        }
        self$`accepted_terms_time` <- `accepted_terms_time`
      }
      if (!is.null(`budget_amount`)) {
        self$`budget_amount` <- `budget_amount`
      }
      if (!is.null(`estimated_monthly_spend`)) {
        self$`estimated_monthly_spend` <- `estimated_monthly_spend`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOOrderLine in JSON format
    #' @export
    toJSON = function() {
      SSIOOrderLineObject <- list()
      if (!is.null(self$`salesforce_order_line_id`)) {
        SSIOOrderLineObject[["salesforce_order_line_id"]] <-
          self$`salesforce_order_line_id`
      }
      if (!is.null(self$`ads_manager_order_line_id`)) {
        SSIOOrderLineObject[["ads_manager_order_line_id"]] <-
          self$`ads_manager_order_line_id`
      }
      if (!is.null(self$`pin_order_id`)) {
        SSIOOrderLineObject[["pin_order_id"]] <-
          self$`pin_order_id`
      }
      if (!is.null(self$`last_modified_date_time`)) {
        SSIOOrderLineObject[["last_modified_date_time"]] <-
          self$`last_modified_date_time`
      }
      if (!is.null(self$`start_date`)) {
        SSIOOrderLineObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`end_date`)) {
        SSIOOrderLineObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`bill_to_company_name`)) {
        SSIOOrderLineObject[["bill_to_company_name"]] <-
          self$`bill_to_company_name`
      }
      if (!is.null(self$`billing_contact_firstname`)) {
        SSIOOrderLineObject[["billing_contact_firstname"]] <-
          self$`billing_contact_firstname`
      }
      if (!is.null(self$`billing_contact_lastname`)) {
        SSIOOrderLineObject[["billing_contact_lastname"]] <-
          self$`billing_contact_lastname`
      }
      if (!is.null(self$`billing_contact_email`)) {
        SSIOOrderLineObject[["billing_contact_email"]] <-
          self$`billing_contact_email`
      }
      if (!is.null(self$`media_contact_email`)) {
        SSIOOrderLineObject[["media_contact_email"]] <-
          self$`media_contact_email`
      }
      if (!is.null(self$`media_contact_firstname`)) {
        SSIOOrderLineObject[["media_contact_firstname"]] <-
          self$`media_contact_firstname`
      }
      if (!is.null(self$`media_contact_lastname`)) {
        SSIOOrderLineObject[["media_contact_lastname"]] <-
          self$`media_contact_lastname`
      }
      if (!is.null(self$`currency_info`)) {
        SSIOOrderLineObject[["currency_info"]] <-
          self$`currency_info`$toJSON()
      }
      if (!is.null(self$`agency_link`)) {
        SSIOOrderLineObject[["agency_link"]] <-
          self$`agency_link`
      }
      if (!is.null(self$`po_number`)) {
        SSIOOrderLineObject[["po_number"]] <-
          self$`po_number`
      }
      if (!is.null(self$`order_name`)) {
        SSIOOrderLineObject[["order_name"]] <-
          self$`order_name`
      }
      if (!is.null(self$`pmp_name`)) {
        SSIOOrderLineObject[["pmp_name"]] <-
          self$`pmp_name`
      }
      if (!is.null(self$`accepted_terms_id`)) {
        SSIOOrderLineObject[["accepted_terms_id"]] <-
          self$`accepted_terms_id`
      }
      if (!is.null(self$`accepted_terms_time`)) {
        SSIOOrderLineObject[["accepted_terms_time"]] <-
          self$`accepted_terms_time`
      }
      if (!is.null(self$`budget_amount`)) {
        SSIOOrderLineObject[["budget_amount"]] <-
          self$`budget_amount`
      }
      if (!is.null(self$`estimated_monthly_spend`)) {
        SSIOOrderLineObject[["estimated_monthly_spend"]] <-
          self$`estimated_monthly_spend`
      }
      SSIOOrderLineObject
    },
    #' Deserialize JSON string into an instance of SSIOOrderLine
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOOrderLine
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOOrderLine
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`salesforce_order_line_id`)) {
        self$`salesforce_order_line_id` <- this_object$`salesforce_order_line_id`
      }
      if (!is.null(this_object$`ads_manager_order_line_id`)) {
        self$`ads_manager_order_line_id` <- this_object$`ads_manager_order_line_id`
      }
      if (!is.null(this_object$`pin_order_id`)) {
        self$`pin_order_id` <- this_object$`pin_order_id`
      }
      if (!is.null(this_object$`last_modified_date_time`)) {
        self$`last_modified_date_time` <- this_object$`last_modified_date_time`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`bill_to_company_name`)) {
        self$`bill_to_company_name` <- this_object$`bill_to_company_name`
      }
      if (!is.null(this_object$`billing_contact_firstname`)) {
        self$`billing_contact_firstname` <- this_object$`billing_contact_firstname`
      }
      if (!is.null(this_object$`billing_contact_lastname`)) {
        self$`billing_contact_lastname` <- this_object$`billing_contact_lastname`
      }
      if (!is.null(this_object$`billing_contact_email`)) {
        self$`billing_contact_email` <- this_object$`billing_contact_email`
      }
      if (!is.null(this_object$`media_contact_email`)) {
        self$`media_contact_email` <- this_object$`media_contact_email`
      }
      if (!is.null(this_object$`media_contact_firstname`)) {
        self$`media_contact_firstname` <- this_object$`media_contact_firstname`
      }
      if (!is.null(this_object$`media_contact_lastname`)) {
        self$`media_contact_lastname` <- this_object$`media_contact_lastname`
      }
      if (!is.null(this_object$`currency_info`)) {
        `currency_info_object` <- Currency$new()
        `currency_info_object`$fromJSON(jsonlite::toJSON(this_object$`currency_info`, auto_unbox = TRUE, digits = NA))
        self$`currency_info` <- `currency_info_object`
      }
      if (!is.null(this_object$`agency_link`)) {
        self$`agency_link` <- this_object$`agency_link`
      }
      if (!is.null(this_object$`po_number`)) {
        self$`po_number` <- this_object$`po_number`
      }
      if (!is.null(this_object$`order_name`)) {
        self$`order_name` <- this_object$`order_name`
      }
      if (!is.null(this_object$`pmp_name`)) {
        self$`pmp_name` <- this_object$`pmp_name`
      }
      if (!is.null(this_object$`accepted_terms_id`)) {
        self$`accepted_terms_id` <- this_object$`accepted_terms_id`
      }
      if (!is.null(this_object$`accepted_terms_time`)) {
        self$`accepted_terms_time` <- this_object$`accepted_terms_time`
      }
      if (!is.null(this_object$`budget_amount`)) {
        self$`budget_amount` <- this_object$`budget_amount`
      }
      if (!is.null(this_object$`estimated_monthly_spend`)) {
        self$`estimated_monthly_spend` <- this_object$`estimated_monthly_spend`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOOrderLine in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`salesforce_order_line_id`)) {
          sprintf(
          '"salesforce_order_line_id":
            "%s"
                    ',
          self$`salesforce_order_line_id`
          )
        },
        if (!is.null(self$`ads_manager_order_line_id`)) {
          sprintf(
          '"ads_manager_order_line_id":
            "%s"
                    ',
          self$`ads_manager_order_line_id`
          )
        },
        if (!is.null(self$`pin_order_id`)) {
          sprintf(
          '"pin_order_id":
            "%s"
                    ',
          self$`pin_order_id`
          )
        },
        if (!is.null(self$`last_modified_date_time`)) {
          sprintf(
          '"last_modified_date_time":
            "%s"
                    ',
          self$`last_modified_date_time`
          )
        },
        if (!is.null(self$`start_date`)) {
          sprintf(
          '"start_date":
            "%s"
                    ',
          self$`start_date`
          )
        },
        if (!is.null(self$`end_date`)) {
          sprintf(
          '"end_date":
            "%s"
                    ',
          self$`end_date`
          )
        },
        if (!is.null(self$`bill_to_company_name`)) {
          sprintf(
          '"bill_to_company_name":
            "%s"
                    ',
          self$`bill_to_company_name`
          )
        },
        if (!is.null(self$`billing_contact_firstname`)) {
          sprintf(
          '"billing_contact_firstname":
            "%s"
                    ',
          self$`billing_contact_firstname`
          )
        },
        if (!is.null(self$`billing_contact_lastname`)) {
          sprintf(
          '"billing_contact_lastname":
            "%s"
                    ',
          self$`billing_contact_lastname`
          )
        },
        if (!is.null(self$`billing_contact_email`)) {
          sprintf(
          '"billing_contact_email":
            "%s"
                    ',
          self$`billing_contact_email`
          )
        },
        if (!is.null(self$`media_contact_email`)) {
          sprintf(
          '"media_contact_email":
            "%s"
                    ',
          self$`media_contact_email`
          )
        },
        if (!is.null(self$`media_contact_firstname`)) {
          sprintf(
          '"media_contact_firstname":
            "%s"
                    ',
          self$`media_contact_firstname`
          )
        },
        if (!is.null(self$`media_contact_lastname`)) {
          sprintf(
          '"media_contact_lastname":
            "%s"
                    ',
          self$`media_contact_lastname`
          )
        },
        if (!is.null(self$`currency_info`)) {
          sprintf(
          '"currency_info":
          %s
          ',
          jsonlite::toJSON(self$`currency_info`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`agency_link`)) {
          sprintf(
          '"agency_link":
            "%s"
                    ',
          self$`agency_link`
          )
        },
        if (!is.null(self$`po_number`)) {
          sprintf(
          '"po_number":
            "%s"
                    ',
          self$`po_number`
          )
        },
        if (!is.null(self$`order_name`)) {
          sprintf(
          '"order_name":
            "%s"
                    ',
          self$`order_name`
          )
        },
        if (!is.null(self$`pmp_name`)) {
          sprintf(
          '"pmp_name":
            "%s"
                    ',
          self$`pmp_name`
          )
        },
        if (!is.null(self$`accepted_terms_id`)) {
          sprintf(
          '"accepted_terms_id":
            "%s"
                    ',
          self$`accepted_terms_id`
          )
        },
        if (!is.null(self$`accepted_terms_time`)) {
          sprintf(
          '"accepted_terms_time":
            "%s"
                    ',
          self$`accepted_terms_time`
          )
        },
        if (!is.null(self$`budget_amount`)) {
          sprintf(
          '"budget_amount":
            %d
                    ',
          self$`budget_amount`
          )
        },
        if (!is.null(self$`estimated_monthly_spend`)) {
          sprintf(
          '"estimated_monthly_spend":
            %d
                    ',
          self$`estimated_monthly_spend`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SSIOOrderLine
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOOrderLine
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOOrderLine
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`salesforce_order_line_id` <- this_object$`salesforce_order_line_id`
      self$`ads_manager_order_line_id` <- this_object$`ads_manager_order_line_id`
      self$`pin_order_id` <- this_object$`pin_order_id`
      self$`last_modified_date_time` <- this_object$`last_modified_date_time`
      self$`start_date` <- this_object$`start_date`
      self$`end_date` <- this_object$`end_date`
      self$`bill_to_company_name` <- this_object$`bill_to_company_name`
      self$`billing_contact_firstname` <- this_object$`billing_contact_firstname`
      self$`billing_contact_lastname` <- this_object$`billing_contact_lastname`
      self$`billing_contact_email` <- this_object$`billing_contact_email`
      self$`media_contact_email` <- this_object$`media_contact_email`
      self$`media_contact_firstname` <- this_object$`media_contact_firstname`
      self$`media_contact_lastname` <- this_object$`media_contact_lastname`
      self$`currency_info` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency_info`, auto_unbox = TRUE, digits = NA))
      self$`agency_link` <- this_object$`agency_link`
      self$`po_number` <- this_object$`po_number`
      self$`order_name` <- this_object$`order_name`
      self$`pmp_name` <- this_object$`pmp_name`
      self$`accepted_terms_id` <- this_object$`accepted_terms_id`
      self$`accepted_terms_time` <- this_object$`accepted_terms_time`
      self$`budget_amount` <- this_object$`budget_amount`
      self$`estimated_monthly_spend` <- this_object$`estimated_monthly_spend`
      self
    },
    #' Validate JSON input with respect to SSIOOrderLine
    #'
    #' @description
    #' Validate JSON input with respect to SSIOOrderLine and throw an exception if invalid
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
    #' @return String representation of SSIOOrderLine
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
      if (!str_detect(self$`last_modified_date_time`, "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")) {
        return(FALSE)
      }

      if (!str_detect(self$`accepted_terms_time`, "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")) {
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
      if (!str_detect(self$`last_modified_date_time`, "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")) {
        invalid_fields["last_modified_date_time"] <- "Invalid value for `last_modified_date_time`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$."
      }

      if (!str_detect(self$`accepted_terms_time`, "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")) {
        invalid_fields["accepted_terms_time"] <- "Invalid value for `accepted_terms_time`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$."
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
# SSIOOrderLine$unlock()
#
## Below is an example to define the print function
# SSIOOrderLine$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOOrderLine$lock()

