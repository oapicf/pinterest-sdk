#' Create a new SSIOCreateInsertionOrderRequest
#'
#' @description
#' SSIOCreateInsertionOrderRequest Class
#'
#' @docType class
#' @title SSIOCreateInsertionOrderRequest
#' @description SSIOCreateInsertionOrderRequest Class
#' @format An \code{R6Class} generator object
#' @field start_date Starting date of time period. Format: YYYY-MM-DD character
#' @field end_date End date of time period. Format: YYYY-MM-DD character [optional]
#' @field po_number The po number character
#' @field budget_amount If Budget order line, the budget amount. numeric [optional]
#' @field billing_contact_firstname The billing contact first name character
#' @field billing_contact_lastname The billing contact last name character
#' @field billing_contact_email The billing contact email character
#' @field media_contact_firstname The media contact first name character
#' @field media_contact_lastname The media contact last name character
#' @field media_contact_email The media contact email character
#' @field agency_link URL link for agency character [optional]
#' @field user_email The email of user submitting the insertion order character [optional]
#' @field accepted_terms_time The UTC timestamp (to the nearest sec) of when terms were accepted integer [optional]
#' @field pmp_id The pmp id character
#' @field order_name The order name character
#' @field order_line_type Type can be Budget or Perpetual character
#' @field accepted_terms_id The SFDC id for the terms character
#' @field billto_company_id The bill-to company id character
#' @field billto_business_address_id The bill-to business address id character
#' @field billto_billing_address_id The bill-to billing address id character
#' @field estimated_monthly_spend If Ongoing (perpetual) order line, the estimated monthly spend numeric [optional]
#' @field currency_info  \link{Currency}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOCreateInsertionOrderRequest <- R6::R6Class(
  "SSIOCreateInsertionOrderRequest",
  public = list(
    `start_date` = NULL,
    `end_date` = NULL,
    `po_number` = NULL,
    `budget_amount` = NULL,
    `billing_contact_firstname` = NULL,
    `billing_contact_lastname` = NULL,
    `billing_contact_email` = NULL,
    `media_contact_firstname` = NULL,
    `media_contact_lastname` = NULL,
    `media_contact_email` = NULL,
    `agency_link` = NULL,
    `user_email` = NULL,
    `accepted_terms_time` = NULL,
    `pmp_id` = NULL,
    `order_name` = NULL,
    `order_line_type` = NULL,
    `accepted_terms_id` = NULL,
    `billto_company_id` = NULL,
    `billto_business_address_id` = NULL,
    `billto_billing_address_id` = NULL,
    `estimated_monthly_spend` = NULL,
    `currency_info` = NULL,
    #' Initialize a new SSIOCreateInsertionOrderRequest class.
    #'
    #' @description
    #' Initialize a new SSIOCreateInsertionOrderRequest class.
    #'
    #' @param start_date Starting date of time period. Format: YYYY-MM-DD
    #' @param po_number The po number
    #' @param billing_contact_firstname The billing contact first name
    #' @param billing_contact_lastname The billing contact last name
    #' @param billing_contact_email The billing contact email
    #' @param media_contact_firstname The media contact first name
    #' @param media_contact_lastname The media contact last name
    #' @param media_contact_email The media contact email
    #' @param pmp_id The pmp id
    #' @param order_name The order name
    #' @param order_line_type Type can be Budget or Perpetual
    #' @param accepted_terms_id The SFDC id for the terms
    #' @param billto_company_id The bill-to company id
    #' @param billto_business_address_id The bill-to business address id
    #' @param billto_billing_address_id The bill-to billing address id
    #' @param currency_info currency_info
    #' @param end_date End date of time period. Format: YYYY-MM-DD
    #' @param budget_amount If Budget order line, the budget amount.
    #' @param agency_link URL link for agency
    #' @param user_email The email of user submitting the insertion order
    #' @param accepted_terms_time The UTC timestamp (to the nearest sec) of when terms were accepted
    #' @param estimated_monthly_spend If Ongoing (perpetual) order line, the estimated monthly spend
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`start_date`, `po_number`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `media_contact_email`, `pmp_id`, `order_name`, `order_line_type`, `accepted_terms_id`, `billto_company_id`, `billto_business_address_id`, `billto_billing_address_id`, `currency_info`, `end_date` = NULL, `budget_amount` = NULL, `agency_link` = NULL, `user_email` = NULL, `accepted_terms_time` = NULL, `estimated_monthly_spend` = NULL, ...) {
      if (!missing(`start_date`)) {
        if (!(is.character(`start_date`) && length(`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
      }
      if (!missing(`po_number`)) {
        if (!(is.character(`po_number`) && length(`po_number`) == 1)) {
          stop(paste("Error! Invalid data for `po_number`. Must be a string:", `po_number`))
        }
        self$`po_number` <- `po_number`
      }
      if (!missing(`billing_contact_firstname`)) {
        if (!(is.character(`billing_contact_firstname`) && length(`billing_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_firstname`. Must be a string:", `billing_contact_firstname`))
        }
        self$`billing_contact_firstname` <- `billing_contact_firstname`
      }
      if (!missing(`billing_contact_lastname`)) {
        if (!(is.character(`billing_contact_lastname`) && length(`billing_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_lastname`. Must be a string:", `billing_contact_lastname`))
        }
        self$`billing_contact_lastname` <- `billing_contact_lastname`
      }
      if (!missing(`billing_contact_email`)) {
        if (!(is.character(`billing_contact_email`) && length(`billing_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_email`. Must be a string:", `billing_contact_email`))
        }
        self$`billing_contact_email` <- `billing_contact_email`
      }
      if (!missing(`media_contact_firstname`)) {
        if (!(is.character(`media_contact_firstname`) && length(`media_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_firstname`. Must be a string:", `media_contact_firstname`))
        }
        self$`media_contact_firstname` <- `media_contact_firstname`
      }
      if (!missing(`media_contact_lastname`)) {
        if (!(is.character(`media_contact_lastname`) && length(`media_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_lastname`. Must be a string:", `media_contact_lastname`))
        }
        self$`media_contact_lastname` <- `media_contact_lastname`
      }
      if (!missing(`media_contact_email`)) {
        if (!(is.character(`media_contact_email`) && length(`media_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_email`. Must be a string:", `media_contact_email`))
        }
        self$`media_contact_email` <- `media_contact_email`
      }
      if (!missing(`pmp_id`)) {
        if (!(is.character(`pmp_id`) && length(`pmp_id`) == 1)) {
          stop(paste("Error! Invalid data for `pmp_id`. Must be a string:", `pmp_id`))
        }
        self$`pmp_id` <- `pmp_id`
      }
      if (!missing(`order_name`)) {
        if (!(is.character(`order_name`) && length(`order_name`) == 1)) {
          stop(paste("Error! Invalid data for `order_name`. Must be a string:", `order_name`))
        }
        self$`order_name` <- `order_name`
      }
      if (!missing(`order_line_type`)) {
        if (!(`order_line_type` %in% c("BUDGET", "PERPETUALS"))) {
          stop(paste("Error! \"", `order_line_type`, "\" cannot be assigned to `order_line_type`. Must be \"BUDGET\", \"PERPETUALS\".", sep = ""))
        }
        if (!(is.character(`order_line_type`) && length(`order_line_type`) == 1)) {
          stop(paste("Error! Invalid data for `order_line_type`. Must be a string:", `order_line_type`))
        }
        self$`order_line_type` <- `order_line_type`
      }
      if (!missing(`accepted_terms_id`)) {
        if (!(is.character(`accepted_terms_id`) && length(`accepted_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_id`. Must be a string:", `accepted_terms_id`))
        }
        self$`accepted_terms_id` <- `accepted_terms_id`
      }
      if (!missing(`billto_company_id`)) {
        if (!(is.character(`billto_company_id`) && length(`billto_company_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_company_id`. Must be a string:", `billto_company_id`))
        }
        self$`billto_company_id` <- `billto_company_id`
      }
      if (!missing(`billto_business_address_id`)) {
        if (!(is.character(`billto_business_address_id`) && length(`billto_business_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_business_address_id`. Must be a string:", `billto_business_address_id`))
        }
        self$`billto_business_address_id` <- `billto_business_address_id`
      }
      if (!missing(`billto_billing_address_id`)) {
        if (!(is.character(`billto_billing_address_id`) && length(`billto_billing_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_billing_address_id`. Must be a string:", `billto_billing_address_id`))
        }
        self$`billto_billing_address_id` <- `billto_billing_address_id`
      }
      if (!missing(`currency_info`)) {
        if (!(`currency_info` %in% c())) {
          stop(paste("Error! \"", `currency_info`, "\" cannot be assigned to `currency_info`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency_info`))
        self$`currency_info` <- `currency_info`
      }
      if (!is.null(`end_date`)) {
        if (!(is.character(`end_date`) && length(`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!is.null(`budget_amount`)) {
        self$`budget_amount` <- `budget_amount`
      }
      if (!is.null(`agency_link`)) {
        if (!(is.character(`agency_link`) && length(`agency_link`) == 1)) {
          stop(paste("Error! Invalid data for `agency_link`. Must be a string:", `agency_link`))
        }
        self$`agency_link` <- `agency_link`
      }
      if (!is.null(`user_email`)) {
        if (!(is.character(`user_email`) && length(`user_email`) == 1)) {
          stop(paste("Error! Invalid data for `user_email`. Must be a string:", `user_email`))
        }
        self$`user_email` <- `user_email`
      }
      if (!is.null(`accepted_terms_time`)) {
        if (!(is.numeric(`accepted_terms_time`) && length(`accepted_terms_time`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_time`. Must be an integer:", `accepted_terms_time`))
        }
        self$`accepted_terms_time` <- `accepted_terms_time`
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
    #' @return SSIOCreateInsertionOrderRequest in JSON format
    #' @export
    toJSON = function() {
      SSIOCreateInsertionOrderRequestObject <- list()
      if (!is.null(self$`start_date`)) {
        SSIOCreateInsertionOrderRequestObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`end_date`)) {
        SSIOCreateInsertionOrderRequestObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`po_number`)) {
        SSIOCreateInsertionOrderRequestObject[["po_number"]] <-
          self$`po_number`
      }
      if (!is.null(self$`budget_amount`)) {
        SSIOCreateInsertionOrderRequestObject[["budget_amount"]] <-
          self$`budget_amount`
      }
      if (!is.null(self$`billing_contact_firstname`)) {
        SSIOCreateInsertionOrderRequestObject[["billing_contact_firstname"]] <-
          self$`billing_contact_firstname`
      }
      if (!is.null(self$`billing_contact_lastname`)) {
        SSIOCreateInsertionOrderRequestObject[["billing_contact_lastname"]] <-
          self$`billing_contact_lastname`
      }
      if (!is.null(self$`billing_contact_email`)) {
        SSIOCreateInsertionOrderRequestObject[["billing_contact_email"]] <-
          self$`billing_contact_email`
      }
      if (!is.null(self$`media_contact_firstname`)) {
        SSIOCreateInsertionOrderRequestObject[["media_contact_firstname"]] <-
          self$`media_contact_firstname`
      }
      if (!is.null(self$`media_contact_lastname`)) {
        SSIOCreateInsertionOrderRequestObject[["media_contact_lastname"]] <-
          self$`media_contact_lastname`
      }
      if (!is.null(self$`media_contact_email`)) {
        SSIOCreateInsertionOrderRequestObject[["media_contact_email"]] <-
          self$`media_contact_email`
      }
      if (!is.null(self$`agency_link`)) {
        SSIOCreateInsertionOrderRequestObject[["agency_link"]] <-
          self$`agency_link`
      }
      if (!is.null(self$`user_email`)) {
        SSIOCreateInsertionOrderRequestObject[["user_email"]] <-
          self$`user_email`
      }
      if (!is.null(self$`accepted_terms_time`)) {
        SSIOCreateInsertionOrderRequestObject[["accepted_terms_time"]] <-
          self$`accepted_terms_time`
      }
      if (!is.null(self$`pmp_id`)) {
        SSIOCreateInsertionOrderRequestObject[["pmp_id"]] <-
          self$`pmp_id`
      }
      if (!is.null(self$`order_name`)) {
        SSIOCreateInsertionOrderRequestObject[["order_name"]] <-
          self$`order_name`
      }
      if (!is.null(self$`order_line_type`)) {
        SSIOCreateInsertionOrderRequestObject[["order_line_type"]] <-
          self$`order_line_type`
      }
      if (!is.null(self$`accepted_terms_id`)) {
        SSIOCreateInsertionOrderRequestObject[["accepted_terms_id"]] <-
          self$`accepted_terms_id`
      }
      if (!is.null(self$`billto_company_id`)) {
        SSIOCreateInsertionOrderRequestObject[["billto_company_id"]] <-
          self$`billto_company_id`
      }
      if (!is.null(self$`billto_business_address_id`)) {
        SSIOCreateInsertionOrderRequestObject[["billto_business_address_id"]] <-
          self$`billto_business_address_id`
      }
      if (!is.null(self$`billto_billing_address_id`)) {
        SSIOCreateInsertionOrderRequestObject[["billto_billing_address_id"]] <-
          self$`billto_billing_address_id`
      }
      if (!is.null(self$`estimated_monthly_spend`)) {
        SSIOCreateInsertionOrderRequestObject[["estimated_monthly_spend"]] <-
          self$`estimated_monthly_spend`
      }
      if (!is.null(self$`currency_info`)) {
        SSIOCreateInsertionOrderRequestObject[["currency_info"]] <-
          self$`currency_info`$toJSON()
      }
      SSIOCreateInsertionOrderRequestObject
    },
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOCreateInsertionOrderRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`po_number`)) {
        self$`po_number` <- this_object$`po_number`
      }
      if (!is.null(this_object$`budget_amount`)) {
        self$`budget_amount` <- this_object$`budget_amount`
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
      if (!is.null(this_object$`media_contact_firstname`)) {
        self$`media_contact_firstname` <- this_object$`media_contact_firstname`
      }
      if (!is.null(this_object$`media_contact_lastname`)) {
        self$`media_contact_lastname` <- this_object$`media_contact_lastname`
      }
      if (!is.null(this_object$`media_contact_email`)) {
        self$`media_contact_email` <- this_object$`media_contact_email`
      }
      if (!is.null(this_object$`agency_link`)) {
        self$`agency_link` <- this_object$`agency_link`
      }
      if (!is.null(this_object$`user_email`)) {
        self$`user_email` <- this_object$`user_email`
      }
      if (!is.null(this_object$`accepted_terms_time`)) {
        self$`accepted_terms_time` <- this_object$`accepted_terms_time`
      }
      if (!is.null(this_object$`pmp_id`)) {
        self$`pmp_id` <- this_object$`pmp_id`
      }
      if (!is.null(this_object$`order_name`)) {
        self$`order_name` <- this_object$`order_name`
      }
      if (!is.null(this_object$`order_line_type`)) {
        if (!is.null(this_object$`order_line_type`) && !(this_object$`order_line_type` %in% c("BUDGET", "PERPETUALS"))) {
          stop(paste("Error! \"", this_object$`order_line_type`, "\" cannot be assigned to `order_line_type`. Must be \"BUDGET\", \"PERPETUALS\".", sep = ""))
        }
        self$`order_line_type` <- this_object$`order_line_type`
      }
      if (!is.null(this_object$`accepted_terms_id`)) {
        self$`accepted_terms_id` <- this_object$`accepted_terms_id`
      }
      if (!is.null(this_object$`billto_company_id`)) {
        self$`billto_company_id` <- this_object$`billto_company_id`
      }
      if (!is.null(this_object$`billto_business_address_id`)) {
        self$`billto_business_address_id` <- this_object$`billto_business_address_id`
      }
      if (!is.null(this_object$`billto_billing_address_id`)) {
        self$`billto_billing_address_id` <- this_object$`billto_billing_address_id`
      }
      if (!is.null(this_object$`estimated_monthly_spend`)) {
        self$`estimated_monthly_spend` <- this_object$`estimated_monthly_spend`
      }
      if (!is.null(this_object$`currency_info`)) {
        `currency_info_object` <- Currency$new()
        `currency_info_object`$fromJSON(jsonlite::toJSON(this_object$`currency_info`, auto_unbox = TRUE, digits = NA))
        self$`currency_info` <- `currency_info_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOCreateInsertionOrderRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
        if (!is.null(self$`po_number`)) {
          sprintf(
          '"po_number":
            "%s"
                    ',
          self$`po_number`
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
        if (!is.null(self$`media_contact_email`)) {
          sprintf(
          '"media_contact_email":
            "%s"
                    ',
          self$`media_contact_email`
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
        if (!is.null(self$`user_email`)) {
          sprintf(
          '"user_email":
            "%s"
                    ',
          self$`user_email`
          )
        },
        if (!is.null(self$`accepted_terms_time`)) {
          sprintf(
          '"accepted_terms_time":
            %d
                    ',
          self$`accepted_terms_time`
          )
        },
        if (!is.null(self$`pmp_id`)) {
          sprintf(
          '"pmp_id":
            "%s"
                    ',
          self$`pmp_id`
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
        if (!is.null(self$`order_line_type`)) {
          sprintf(
          '"order_line_type":
            "%s"
                    ',
          self$`order_line_type`
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
        if (!is.null(self$`billto_company_id`)) {
          sprintf(
          '"billto_company_id":
            "%s"
                    ',
          self$`billto_company_id`
          )
        },
        if (!is.null(self$`billto_business_address_id`)) {
          sprintf(
          '"billto_business_address_id":
            "%s"
                    ',
          self$`billto_business_address_id`
          )
        },
        if (!is.null(self$`billto_billing_address_id`)) {
          sprintf(
          '"billto_billing_address_id":
            "%s"
                    ',
          self$`billto_billing_address_id`
          )
        },
        if (!is.null(self$`estimated_monthly_spend`)) {
          sprintf(
          '"estimated_monthly_spend":
            %d
                    ',
          self$`estimated_monthly_spend`
          )
        },
        if (!is.null(self$`currency_info`)) {
          sprintf(
          '"currency_info":
          %s
          ',
          jsonlite::toJSON(self$`currency_info`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOCreateInsertionOrderRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOCreateInsertionOrderRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`start_date` <- this_object$`start_date`
      self$`end_date` <- this_object$`end_date`
      self$`po_number` <- this_object$`po_number`
      self$`budget_amount` <- this_object$`budget_amount`
      self$`billing_contact_firstname` <- this_object$`billing_contact_firstname`
      self$`billing_contact_lastname` <- this_object$`billing_contact_lastname`
      self$`billing_contact_email` <- this_object$`billing_contact_email`
      self$`media_contact_firstname` <- this_object$`media_contact_firstname`
      self$`media_contact_lastname` <- this_object$`media_contact_lastname`
      self$`media_contact_email` <- this_object$`media_contact_email`
      self$`agency_link` <- this_object$`agency_link`
      self$`user_email` <- this_object$`user_email`
      self$`accepted_terms_time` <- this_object$`accepted_terms_time`
      self$`pmp_id` <- this_object$`pmp_id`
      self$`order_name` <- this_object$`order_name`
      if (!is.null(this_object$`order_line_type`) && !(this_object$`order_line_type` %in% c("BUDGET", "PERPETUALS"))) {
        stop(paste("Error! \"", this_object$`order_line_type`, "\" cannot be assigned to `order_line_type`. Must be \"BUDGET\", \"PERPETUALS\".", sep = ""))
      }
      self$`order_line_type` <- this_object$`order_line_type`
      self$`accepted_terms_id` <- this_object$`accepted_terms_id`
      self$`billto_company_id` <- this_object$`billto_company_id`
      self$`billto_business_address_id` <- this_object$`billto_business_address_id`
      self$`billto_billing_address_id` <- this_object$`billto_billing_address_id`
      self$`estimated_monthly_spend` <- this_object$`estimated_monthly_spend`
      self$`currency_info` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency_info`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to SSIOCreateInsertionOrderRequest
    #'
    #' @description
    #' Validate JSON input with respect to SSIOCreateInsertionOrderRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `start_date` is missing."))
      }
      # check the required field `po_number`
      if (!is.null(input_json$`po_number`)) {
        if (!(is.character(input_json$`po_number`) && length(input_json$`po_number`) == 1)) {
          stop(paste("Error! Invalid data for `po_number`. Must be a string:", input_json$`po_number`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `po_number` is missing."))
      }
      # check the required field `billing_contact_firstname`
      if (!is.null(input_json$`billing_contact_firstname`)) {
        if (!(is.character(input_json$`billing_contact_firstname`) && length(input_json$`billing_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_firstname`. Must be a string:", input_json$`billing_contact_firstname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `billing_contact_firstname` is missing."))
      }
      # check the required field `billing_contact_lastname`
      if (!is.null(input_json$`billing_contact_lastname`)) {
        if (!(is.character(input_json$`billing_contact_lastname`) && length(input_json$`billing_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_lastname`. Must be a string:", input_json$`billing_contact_lastname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `billing_contact_lastname` is missing."))
      }
      # check the required field `billing_contact_email`
      if (!is.null(input_json$`billing_contact_email`)) {
        if (!(is.character(input_json$`billing_contact_email`) && length(input_json$`billing_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_email`. Must be a string:", input_json$`billing_contact_email`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `billing_contact_email` is missing."))
      }
      # check the required field `media_contact_firstname`
      if (!is.null(input_json$`media_contact_firstname`)) {
        if (!(is.character(input_json$`media_contact_firstname`) && length(input_json$`media_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_firstname`. Must be a string:", input_json$`media_contact_firstname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `media_contact_firstname` is missing."))
      }
      # check the required field `media_contact_lastname`
      if (!is.null(input_json$`media_contact_lastname`)) {
        if (!(is.character(input_json$`media_contact_lastname`) && length(input_json$`media_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_lastname`. Must be a string:", input_json$`media_contact_lastname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `media_contact_lastname` is missing."))
      }
      # check the required field `media_contact_email`
      if (!is.null(input_json$`media_contact_email`)) {
        if (!(is.character(input_json$`media_contact_email`) && length(input_json$`media_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_email`. Must be a string:", input_json$`media_contact_email`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `media_contact_email` is missing."))
      }
      # check the required field `pmp_id`
      if (!is.null(input_json$`pmp_id`)) {
        if (!(is.character(input_json$`pmp_id`) && length(input_json$`pmp_id`) == 1)) {
          stop(paste("Error! Invalid data for `pmp_id`. Must be a string:", input_json$`pmp_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `pmp_id` is missing."))
      }
      # check the required field `order_name`
      if (!is.null(input_json$`order_name`)) {
        if (!(is.character(input_json$`order_name`) && length(input_json$`order_name`) == 1)) {
          stop(paste("Error! Invalid data for `order_name`. Must be a string:", input_json$`order_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `order_name` is missing."))
      }
      # check the required field `order_line_type`
      if (!is.null(input_json$`order_line_type`)) {
        if (!(is.character(input_json$`order_line_type`) && length(input_json$`order_line_type`) == 1)) {
          stop(paste("Error! Invalid data for `order_line_type`. Must be a string:", input_json$`order_line_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `order_line_type` is missing."))
      }
      # check the required field `accepted_terms_id`
      if (!is.null(input_json$`accepted_terms_id`)) {
        if (!(is.character(input_json$`accepted_terms_id`) && length(input_json$`accepted_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_id`. Must be a string:", input_json$`accepted_terms_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `accepted_terms_id` is missing."))
      }
      # check the required field `billto_company_id`
      if (!is.null(input_json$`billto_company_id`)) {
        if (!(is.character(input_json$`billto_company_id`) && length(input_json$`billto_company_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_company_id`. Must be a string:", input_json$`billto_company_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `billto_company_id` is missing."))
      }
      # check the required field `billto_business_address_id`
      if (!is.null(input_json$`billto_business_address_id`)) {
        if (!(is.character(input_json$`billto_business_address_id`) && length(input_json$`billto_business_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_business_address_id`. Must be a string:", input_json$`billto_business_address_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `billto_business_address_id` is missing."))
      }
      # check the required field `billto_billing_address_id`
      if (!is.null(input_json$`billto_billing_address_id`)) {
        if (!(is.character(input_json$`billto_billing_address_id`) && length(input_json$`billto_billing_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_billing_address_id`. Must be a string:", input_json$`billto_billing_address_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `billto_billing_address_id` is missing."))
      }
      # check the required field `currency_info`
      if (!is.null(input_json$`currency_info`)) {
        stopifnot(R6::is.R6(input_json$`currency_info`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOCreateInsertionOrderRequest: the required field `currency_info` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOCreateInsertionOrderRequest
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
      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        return(FALSE)
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        return(FALSE)
      }

      # check if the required `po_number` is null
      if (is.null(self$`po_number`)) {
        return(FALSE)
      }

      # check if the required `billing_contact_firstname` is null
      if (is.null(self$`billing_contact_firstname`)) {
        return(FALSE)
      }

      # check if the required `billing_contact_lastname` is null
      if (is.null(self$`billing_contact_lastname`)) {
        return(FALSE)
      }

      # check if the required `billing_contact_email` is null
      if (is.null(self$`billing_contact_email`)) {
        return(FALSE)
      }

      # check if the required `media_contact_firstname` is null
      if (is.null(self$`media_contact_firstname`)) {
        return(FALSE)
      }

      # check if the required `media_contact_lastname` is null
      if (is.null(self$`media_contact_lastname`)) {
        return(FALSE)
      }

      # check if the required `media_contact_email` is null
      if (is.null(self$`media_contact_email`)) {
        return(FALSE)
      }

      # check if the required `pmp_id` is null
      if (is.null(self$`pmp_id`)) {
        return(FALSE)
      }

      # check if the required `order_name` is null
      if (is.null(self$`order_name`)) {
        return(FALSE)
      }

      # check if the required `order_line_type` is null
      if (is.null(self$`order_line_type`)) {
        return(FALSE)
      }

      # check if the required `accepted_terms_id` is null
      if (is.null(self$`accepted_terms_id`)) {
        return(FALSE)
      }

      # check if the required `billto_company_id` is null
      if (is.null(self$`billto_company_id`)) {
        return(FALSE)
      }

      # check if the required `billto_business_address_id` is null
      if (is.null(self$`billto_business_address_id`)) {
        return(FALSE)
      }

      # check if the required `billto_billing_address_id` is null
      if (is.null(self$`billto_billing_address_id`)) {
        return(FALSE)
      }

      # check if the required `currency_info` is null
      if (is.null(self$`currency_info`)) {
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
      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        invalid_fields["start_date"] <- "Non-nullable required field `start_date` cannot be null."
      }

      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["start_date"] <- "Invalid value for `start_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      # check if the required `po_number` is null
      if (is.null(self$`po_number`)) {
        invalid_fields["po_number"] <- "Non-nullable required field `po_number` cannot be null."
      }

      # check if the required `billing_contact_firstname` is null
      if (is.null(self$`billing_contact_firstname`)) {
        invalid_fields["billing_contact_firstname"] <- "Non-nullable required field `billing_contact_firstname` cannot be null."
      }

      # check if the required `billing_contact_lastname` is null
      if (is.null(self$`billing_contact_lastname`)) {
        invalid_fields["billing_contact_lastname"] <- "Non-nullable required field `billing_contact_lastname` cannot be null."
      }

      # check if the required `billing_contact_email` is null
      if (is.null(self$`billing_contact_email`)) {
        invalid_fields["billing_contact_email"] <- "Non-nullable required field `billing_contact_email` cannot be null."
      }

      # check if the required `media_contact_firstname` is null
      if (is.null(self$`media_contact_firstname`)) {
        invalid_fields["media_contact_firstname"] <- "Non-nullable required field `media_contact_firstname` cannot be null."
      }

      # check if the required `media_contact_lastname` is null
      if (is.null(self$`media_contact_lastname`)) {
        invalid_fields["media_contact_lastname"] <- "Non-nullable required field `media_contact_lastname` cannot be null."
      }

      # check if the required `media_contact_email` is null
      if (is.null(self$`media_contact_email`)) {
        invalid_fields["media_contact_email"] <- "Non-nullable required field `media_contact_email` cannot be null."
      }

      # check if the required `pmp_id` is null
      if (is.null(self$`pmp_id`)) {
        invalid_fields["pmp_id"] <- "Non-nullable required field `pmp_id` cannot be null."
      }

      # check if the required `order_name` is null
      if (is.null(self$`order_name`)) {
        invalid_fields["order_name"] <- "Non-nullable required field `order_name` cannot be null."
      }

      # check if the required `order_line_type` is null
      if (is.null(self$`order_line_type`)) {
        invalid_fields["order_line_type"] <- "Non-nullable required field `order_line_type` cannot be null."
      }

      # check if the required `accepted_terms_id` is null
      if (is.null(self$`accepted_terms_id`)) {
        invalid_fields["accepted_terms_id"] <- "Non-nullable required field `accepted_terms_id` cannot be null."
      }

      # check if the required `billto_company_id` is null
      if (is.null(self$`billto_company_id`)) {
        invalid_fields["billto_company_id"] <- "Non-nullable required field `billto_company_id` cannot be null."
      }

      # check if the required `billto_business_address_id` is null
      if (is.null(self$`billto_business_address_id`)) {
        invalid_fields["billto_business_address_id"] <- "Non-nullable required field `billto_business_address_id` cannot be null."
      }

      # check if the required `billto_billing_address_id` is null
      if (is.null(self$`billto_billing_address_id`)) {
        invalid_fields["billto_billing_address_id"] <- "Non-nullable required field `billto_billing_address_id` cannot be null."
      }

      # check if the required `currency_info` is null
      if (is.null(self$`currency_info`)) {
        invalid_fields["currency_info"] <- "Non-nullable required field `currency_info` cannot be null."
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
# SSIOCreateInsertionOrderRequest$unlock()
#
## Below is an example to define the print function
# SSIOCreateInsertionOrderRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOCreateInsertionOrderRequest$lock()

