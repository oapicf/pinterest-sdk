#' Create a new SSIOInsertionOrderCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title SSIOInsertionOrderCreate
#' @description SSIOInsertionOrderCreate Class
#' @format An \code{R6Class} generator object
#' @field accepted_terms_id The SFDC id for the terms character
#' @field accepted_terms_time The UTC timestamp (to the nearest sec) of when terms were accepted integer [optional]
#' @field agency_link URL link for agency character [optional]
#' @field billing_contact_email The billing contact email character
#' @field billing_contact_firstname The billing contact first name character
#' @field billing_contact_lastname The billing contact last name character
#' @field billto_billing_address_id The bill-to billing address id character
#' @field billto_business_address_id The bill-to business address id character
#' @field billto_company_id The bill-to company id character
#' @field budget_amount If Budget order line, the budget amount. numeric [optional]
#' @field currency_info  \link{Currency}
#' @field end_date End date of time period. Format: YYYY-MM-DD character [optional]
#' @field estimated_monthly_spend If Ongoing (perpetual) order line, the estimated monthly spend numeric [optional]
#' @field media_contact_email The media contact email character
#' @field media_contact_firstname The media contact first name character
#' @field media_contact_lastname The media contact last name character
#' @field order_line_type Type can be Budget or Perpetual \link{SSIOOrderLineType}
#' @field order_name The order name character
#' @field pmp_id The pmp id character
#' @field po_number The po number character
#' @field start_date Starting date of time period. Format: YYYY-MM-DD character
#' @field user_email The email of user submitting the insertion order character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOInsertionOrderCreate <- R6::R6Class(
  "SSIOInsertionOrderCreate",
  public = list(
    `accepted_terms_id` = NULL,
    `accepted_terms_time` = NULL,
    `agency_link` = NULL,
    `billing_contact_email` = NULL,
    `billing_contact_firstname` = NULL,
    `billing_contact_lastname` = NULL,
    `billto_billing_address_id` = NULL,
    `billto_business_address_id` = NULL,
    `billto_company_id` = NULL,
    `budget_amount` = NULL,
    `currency_info` = NULL,
    `end_date` = NULL,
    `estimated_monthly_spend` = NULL,
    `media_contact_email` = NULL,
    `media_contact_firstname` = NULL,
    `media_contact_lastname` = NULL,
    `order_line_type` = NULL,
    `order_name` = NULL,
    `pmp_id` = NULL,
    `po_number` = NULL,
    `start_date` = NULL,
    `user_email` = NULL,

    #' @description
    #' Initialize a new SSIOInsertionOrderCreate class.
    #'
    #' @param accepted_terms_id The SFDC id for the terms
    #' @param billing_contact_email The billing contact email
    #' @param billing_contact_firstname The billing contact first name
    #' @param billing_contact_lastname The billing contact last name
    #' @param billto_billing_address_id The bill-to billing address id
    #' @param billto_business_address_id The bill-to business address id
    #' @param billto_company_id The bill-to company id
    #' @param currency_info currency_info
    #' @param media_contact_email The media contact email
    #' @param media_contact_firstname The media contact first name
    #' @param media_contact_lastname The media contact last name
    #' @param order_line_type Type can be Budget or Perpetual
    #' @param order_name The order name
    #' @param pmp_id The pmp id
    #' @param po_number The po number
    #' @param start_date Starting date of time period. Format: YYYY-MM-DD
    #' @param accepted_terms_time The UTC timestamp (to the nearest sec) of when terms were accepted
    #' @param agency_link URL link for agency
    #' @param budget_amount If Budget order line, the budget amount.
    #' @param end_date End date of time period. Format: YYYY-MM-DD
    #' @param estimated_monthly_spend If Ongoing (perpetual) order line, the estimated monthly spend
    #' @param user_email The email of user submitting the insertion order
    #' @param ... Other optional arguments.
    initialize = function(`accepted_terms_id`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `billto_billing_address_id`, `billto_business_address_id`, `billto_company_id`, `currency_info`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `order_line_type`, `order_name`, `pmp_id`, `po_number`, `start_date`, `accepted_terms_time` = NULL, `agency_link` = NULL, `budget_amount` = NULL, `end_date` = NULL, `estimated_monthly_spend` = NULL, `user_email` = NULL, ...) {
      if (!missing(`accepted_terms_id`)) {
        if (!(is.character(`accepted_terms_id`) && length(`accepted_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_id`. Must be a string:", `accepted_terms_id`))
        }
        self$`accepted_terms_id` <- `accepted_terms_id`
      }
      if (!missing(`billing_contact_email`)) {
        if (!(is.character(`billing_contact_email`) && length(`billing_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_email`. Must be a string:", `billing_contact_email`))
        }
        self$`billing_contact_email` <- `billing_contact_email`
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
      if (!missing(`billto_billing_address_id`)) {
        if (!(is.character(`billto_billing_address_id`) && length(`billto_billing_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_billing_address_id`. Must be a string:", `billto_billing_address_id`))
        }
        self$`billto_billing_address_id` <- `billto_billing_address_id`
      }
      if (!missing(`billto_business_address_id`)) {
        if (!(is.character(`billto_business_address_id`) && length(`billto_business_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_business_address_id`. Must be a string:", `billto_business_address_id`))
        }
        self$`billto_business_address_id` <- `billto_business_address_id`
      }
      if (!missing(`billto_company_id`)) {
        if (!(is.character(`billto_company_id`) && length(`billto_company_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_company_id`. Must be a string:", `billto_company_id`))
        }
        self$`billto_company_id` <- `billto_company_id`
      }
      if (!missing(`currency_info`)) {
        if (!(`currency_info` %in% c())) {
          stop(paste("Error! \"", `currency_info`, "\" cannot be assigned to `currency_info`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency_info`))
        self$`currency_info` <- `currency_info`
      }
      if (!missing(`media_contact_email`)) {
        if (!(is.character(`media_contact_email`) && length(`media_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_email`. Must be a string:", `media_contact_email`))
        }
        self$`media_contact_email` <- `media_contact_email`
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
      if (!missing(`order_line_type`)) {
        if (!(`order_line_type` %in% c())) {
          stop(paste("Error! \"", `order_line_type`, "\" cannot be assigned to `order_line_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`order_line_type`))
        self$`order_line_type` <- `order_line_type`
      }
      if (!missing(`order_name`)) {
        if (!(is.character(`order_name`) && length(`order_name`) == 1)) {
          stop(paste("Error! Invalid data for `order_name`. Must be a string:", `order_name`))
        }
        self$`order_name` <- `order_name`
      }
      if (!missing(`pmp_id`)) {
        if (!(is.character(`pmp_id`) && length(`pmp_id`) == 1)) {
          stop(paste("Error! Invalid data for `pmp_id`. Must be a string:", `pmp_id`))
        }
        self$`pmp_id` <- `pmp_id`
      }
      if (!missing(`po_number`)) {
        if (!(is.character(`po_number`) && length(`po_number`) == 1)) {
          stop(paste("Error! Invalid data for `po_number`. Must be a string:", `po_number`))
        }
        self$`po_number` <- `po_number`
      }
      if (!missing(`start_date`)) {
        if (!(is.character(`start_date`) && length(`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
      }
      if (!is.null(`accepted_terms_time`)) {
        if (!(is.numeric(`accepted_terms_time`) && length(`accepted_terms_time`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_time`. Must be an integer:", `accepted_terms_time`))
        }
        self$`accepted_terms_time` <- `accepted_terms_time`
      }
      if (!is.null(`agency_link`)) {
        if (!(is.character(`agency_link`) && length(`agency_link`) == 1)) {
          stop(paste("Error! Invalid data for `agency_link`. Must be a string:", `agency_link`))
        }
        self$`agency_link` <- `agency_link`
      }
      if (!is.null(`budget_amount`)) {
        if (!(is.numeric(`budget_amount`) && length(`budget_amount`) == 1)) {
          stop(paste("Error! Invalid data for `budget_amount`. Must be a number:", `budget_amount`))
        }
        self$`budget_amount` <- `budget_amount`
      }
      if (!is.null(`end_date`)) {
        if (!(is.character(`end_date`) && length(`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!is.null(`estimated_monthly_spend`)) {
        if (!(is.numeric(`estimated_monthly_spend`) && length(`estimated_monthly_spend`) == 1)) {
          stop(paste("Error! Invalid data for `estimated_monthly_spend`. Must be a number:", `estimated_monthly_spend`))
        }
        self$`estimated_monthly_spend` <- `estimated_monthly_spend`
      }
      if (!is.null(`user_email`)) {
        if (!(is.character(`user_email`) && length(`user_email`) == 1)) {
          stop(paste("Error! Invalid data for `user_email`. Must be a string:", `user_email`))
        }
        self$`user_email` <- `user_email`
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
    #' @return SSIOInsertionOrderCreate as a base R list.
    #' @examples
    #' # convert array of SSIOInsertionOrderCreate (x) to a data frame
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
    #' Convert SSIOInsertionOrderCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SSIOInsertionOrderCreateObject <- list()
      if (!is.null(self$`accepted_terms_id`)) {
        SSIOInsertionOrderCreateObject[["accepted_terms_id"]] <-
          self$`accepted_terms_id`
      }
      if (!is.null(self$`accepted_terms_time`)) {
        SSIOInsertionOrderCreateObject[["accepted_terms_time"]] <-
          self$`accepted_terms_time`
      }
      if (!is.null(self$`agency_link`)) {
        SSIOInsertionOrderCreateObject[["agency_link"]] <-
          self$`agency_link`
      }
      if (!is.null(self$`billing_contact_email`)) {
        SSIOInsertionOrderCreateObject[["billing_contact_email"]] <-
          self$`billing_contact_email`
      }
      if (!is.null(self$`billing_contact_firstname`)) {
        SSIOInsertionOrderCreateObject[["billing_contact_firstname"]] <-
          self$`billing_contact_firstname`
      }
      if (!is.null(self$`billing_contact_lastname`)) {
        SSIOInsertionOrderCreateObject[["billing_contact_lastname"]] <-
          self$`billing_contact_lastname`
      }
      if (!is.null(self$`billto_billing_address_id`)) {
        SSIOInsertionOrderCreateObject[["billto_billing_address_id"]] <-
          self$`billto_billing_address_id`
      }
      if (!is.null(self$`billto_business_address_id`)) {
        SSIOInsertionOrderCreateObject[["billto_business_address_id"]] <-
          self$`billto_business_address_id`
      }
      if (!is.null(self$`billto_company_id`)) {
        SSIOInsertionOrderCreateObject[["billto_company_id"]] <-
          self$`billto_company_id`
      }
      if (!is.null(self$`budget_amount`)) {
        SSIOInsertionOrderCreateObject[["budget_amount"]] <-
          self$`budget_amount`
      }
      if (!is.null(self$`currency_info`)) {
        SSIOInsertionOrderCreateObject[["currency_info"]] <-
          self$extractSimpleType(self$`currency_info`)
      }
      if (!is.null(self$`end_date`)) {
        SSIOInsertionOrderCreateObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`estimated_monthly_spend`)) {
        SSIOInsertionOrderCreateObject[["estimated_monthly_spend"]] <-
          self$`estimated_monthly_spend`
      }
      if (!is.null(self$`media_contact_email`)) {
        SSIOInsertionOrderCreateObject[["media_contact_email"]] <-
          self$`media_contact_email`
      }
      if (!is.null(self$`media_contact_firstname`)) {
        SSIOInsertionOrderCreateObject[["media_contact_firstname"]] <-
          self$`media_contact_firstname`
      }
      if (!is.null(self$`media_contact_lastname`)) {
        SSIOInsertionOrderCreateObject[["media_contact_lastname"]] <-
          self$`media_contact_lastname`
      }
      if (!is.null(self$`order_line_type`)) {
        SSIOInsertionOrderCreateObject[["order_line_type"]] <-
          self$extractSimpleType(self$`order_line_type`)
      }
      if (!is.null(self$`order_name`)) {
        SSIOInsertionOrderCreateObject[["order_name"]] <-
          self$`order_name`
      }
      if (!is.null(self$`pmp_id`)) {
        SSIOInsertionOrderCreateObject[["pmp_id"]] <-
          self$`pmp_id`
      }
      if (!is.null(self$`po_number`)) {
        SSIOInsertionOrderCreateObject[["po_number"]] <-
          self$`po_number`
      }
      if (!is.null(self$`start_date`)) {
        SSIOInsertionOrderCreateObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`user_email`)) {
        SSIOInsertionOrderCreateObject[["user_email"]] <-
          self$`user_email`
      }
      return(SSIOInsertionOrderCreateObject)
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
    #' Deserialize JSON string into an instance of SSIOInsertionOrderCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOInsertionOrderCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`accepted_terms_id`)) {
        self$`accepted_terms_id` <- this_object$`accepted_terms_id`
      }
      if (!is.null(this_object$`accepted_terms_time`)) {
        self$`accepted_terms_time` <- this_object$`accepted_terms_time`
      }
      if (!is.null(this_object$`agency_link`)) {
        self$`agency_link` <- this_object$`agency_link`
      }
      if (!is.null(this_object$`billing_contact_email`)) {
        self$`billing_contact_email` <- this_object$`billing_contact_email`
      }
      if (!is.null(this_object$`billing_contact_firstname`)) {
        self$`billing_contact_firstname` <- this_object$`billing_contact_firstname`
      }
      if (!is.null(this_object$`billing_contact_lastname`)) {
        self$`billing_contact_lastname` <- this_object$`billing_contact_lastname`
      }
      if (!is.null(this_object$`billto_billing_address_id`)) {
        self$`billto_billing_address_id` <- this_object$`billto_billing_address_id`
      }
      if (!is.null(this_object$`billto_business_address_id`)) {
        self$`billto_business_address_id` <- this_object$`billto_business_address_id`
      }
      if (!is.null(this_object$`billto_company_id`)) {
        self$`billto_company_id` <- this_object$`billto_company_id`
      }
      if (!is.null(this_object$`budget_amount`)) {
        self$`budget_amount` <- this_object$`budget_amount`
      }
      if (!is.null(this_object$`currency_info`)) {
        `currency_info_object` <- Currency$new()
        `currency_info_object`$fromJSON(jsonlite::toJSON(this_object$`currency_info`, auto_unbox = TRUE, digits = NA))
        self$`currency_info` <- `currency_info_object`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`estimated_monthly_spend`)) {
        self$`estimated_monthly_spend` <- this_object$`estimated_monthly_spend`
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
      if (!is.null(this_object$`order_line_type`)) {
        `order_line_type_object` <- SSIOOrderLineType$new()
        `order_line_type_object`$fromJSON(jsonlite::toJSON(this_object$`order_line_type`, auto_unbox = TRUE, digits = NA))
        self$`order_line_type` <- `order_line_type_object`
      }
      if (!is.null(this_object$`order_name`)) {
        self$`order_name` <- this_object$`order_name`
      }
      if (!is.null(this_object$`pmp_id`)) {
        self$`pmp_id` <- this_object$`pmp_id`
      }
      if (!is.null(this_object$`po_number`)) {
        self$`po_number` <- this_object$`po_number`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`user_email`)) {
        self$`user_email` <- this_object$`user_email`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SSIOInsertionOrderCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOInsertionOrderCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOInsertionOrderCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`accepted_terms_id` <- this_object$`accepted_terms_id`
      self$`accepted_terms_time` <- this_object$`accepted_terms_time`
      self$`agency_link` <- this_object$`agency_link`
      self$`billing_contact_email` <- this_object$`billing_contact_email`
      self$`billing_contact_firstname` <- this_object$`billing_contact_firstname`
      self$`billing_contact_lastname` <- this_object$`billing_contact_lastname`
      self$`billto_billing_address_id` <- this_object$`billto_billing_address_id`
      self$`billto_business_address_id` <- this_object$`billto_business_address_id`
      self$`billto_company_id` <- this_object$`billto_company_id`
      self$`budget_amount` <- this_object$`budget_amount`
      self$`currency_info` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency_info`, auto_unbox = TRUE, digits = NA))
      self$`end_date` <- this_object$`end_date`
      self$`estimated_monthly_spend` <- this_object$`estimated_monthly_spend`
      self$`media_contact_email` <- this_object$`media_contact_email`
      self$`media_contact_firstname` <- this_object$`media_contact_firstname`
      self$`media_contact_lastname` <- this_object$`media_contact_lastname`
      self$`order_line_type` <- SSIOOrderLineType$new()$fromJSON(jsonlite::toJSON(this_object$`order_line_type`, auto_unbox = TRUE, digits = NA))
      self$`order_name` <- this_object$`order_name`
      self$`pmp_id` <- this_object$`pmp_id`
      self$`po_number` <- this_object$`po_number`
      self$`start_date` <- this_object$`start_date`
      self$`user_email` <- this_object$`user_email`
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOInsertionOrderCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `accepted_terms_id`
      if (!is.null(input_json$`accepted_terms_id`)) {
        if (!(is.character(input_json$`accepted_terms_id`) && length(input_json$`accepted_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_terms_id`. Must be a string:", input_json$`accepted_terms_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `accepted_terms_id` is missing."))
      }
      # check the required field `billing_contact_email`
      if (!is.null(input_json$`billing_contact_email`)) {
        if (!(is.character(input_json$`billing_contact_email`) && length(input_json$`billing_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_email`. Must be a string:", input_json$`billing_contact_email`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `billing_contact_email` is missing."))
      }
      # check the required field `billing_contact_firstname`
      if (!is.null(input_json$`billing_contact_firstname`)) {
        if (!(is.character(input_json$`billing_contact_firstname`) && length(input_json$`billing_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_firstname`. Must be a string:", input_json$`billing_contact_firstname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `billing_contact_firstname` is missing."))
      }
      # check the required field `billing_contact_lastname`
      if (!is.null(input_json$`billing_contact_lastname`)) {
        if (!(is.character(input_json$`billing_contact_lastname`) && length(input_json$`billing_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_lastname`. Must be a string:", input_json$`billing_contact_lastname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `billing_contact_lastname` is missing."))
      }
      # check the required field `billto_billing_address_id`
      if (!is.null(input_json$`billto_billing_address_id`)) {
        if (!(is.character(input_json$`billto_billing_address_id`) && length(input_json$`billto_billing_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_billing_address_id`. Must be a string:", input_json$`billto_billing_address_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `billto_billing_address_id` is missing."))
      }
      # check the required field `billto_business_address_id`
      if (!is.null(input_json$`billto_business_address_id`)) {
        if (!(is.character(input_json$`billto_business_address_id`) && length(input_json$`billto_business_address_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_business_address_id`. Must be a string:", input_json$`billto_business_address_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `billto_business_address_id` is missing."))
      }
      # check the required field `billto_company_id`
      if (!is.null(input_json$`billto_company_id`)) {
        if (!(is.character(input_json$`billto_company_id`) && length(input_json$`billto_company_id`) == 1)) {
          stop(paste("Error! Invalid data for `billto_company_id`. Must be a string:", input_json$`billto_company_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `billto_company_id` is missing."))
      }
      # check the required field `currency_info`
      if (!is.null(input_json$`currency_info`)) {
        stopifnot(R6::is.R6(input_json$`currency_info`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `currency_info` is missing."))
      }
      # check the required field `media_contact_email`
      if (!is.null(input_json$`media_contact_email`)) {
        if (!(is.character(input_json$`media_contact_email`) && length(input_json$`media_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_email`. Must be a string:", input_json$`media_contact_email`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `media_contact_email` is missing."))
      }
      # check the required field `media_contact_firstname`
      if (!is.null(input_json$`media_contact_firstname`)) {
        if (!(is.character(input_json$`media_contact_firstname`) && length(input_json$`media_contact_firstname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_firstname`. Must be a string:", input_json$`media_contact_firstname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `media_contact_firstname` is missing."))
      }
      # check the required field `media_contact_lastname`
      if (!is.null(input_json$`media_contact_lastname`)) {
        if (!(is.character(input_json$`media_contact_lastname`) && length(input_json$`media_contact_lastname`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_lastname`. Must be a string:", input_json$`media_contact_lastname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `media_contact_lastname` is missing."))
      }
      # check the required field `order_line_type`
      if (!is.null(input_json$`order_line_type`)) {
        stopifnot(R6::is.R6(input_json$`order_line_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `order_line_type` is missing."))
      }
      # check the required field `order_name`
      if (!is.null(input_json$`order_name`)) {
        if (!(is.character(input_json$`order_name`) && length(input_json$`order_name`) == 1)) {
          stop(paste("Error! Invalid data for `order_name`. Must be a string:", input_json$`order_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `order_name` is missing."))
      }
      # check the required field `pmp_id`
      if (!is.null(input_json$`pmp_id`)) {
        if (!(is.character(input_json$`pmp_id`) && length(input_json$`pmp_id`) == 1)) {
          stop(paste("Error! Invalid data for `pmp_id`. Must be a string:", input_json$`pmp_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `pmp_id` is missing."))
      }
      # check the required field `po_number`
      if (!is.null(input_json$`po_number`)) {
        if (!(is.character(input_json$`po_number`) && length(input_json$`po_number`) == 1)) {
          stop(paste("Error! Invalid data for `po_number`. Must be a string:", input_json$`po_number`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `po_number` is missing."))
      }
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SSIOInsertionOrderCreate: the required field `start_date` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOInsertionOrderCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `accepted_terms_id` is null
      if (is.null(self$`accepted_terms_id`)) {
        return(FALSE)
      }

      # check if the required `billing_contact_email` is null
      if (is.null(self$`billing_contact_email`)) {
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

      # check if the required `billto_billing_address_id` is null
      if (is.null(self$`billto_billing_address_id`)) {
        return(FALSE)
      }

      # check if the required `billto_business_address_id` is null
      if (is.null(self$`billto_business_address_id`)) {
        return(FALSE)
      }

      # check if the required `billto_company_id` is null
      if (is.null(self$`billto_company_id`)) {
        return(FALSE)
      }

      # check if the required `currency_info` is null
      if (is.null(self$`currency_info`)) {
        return(FALSE)
      }

      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        return(FALSE)
      }

      # check if the required `media_contact_email` is null
      if (is.null(self$`media_contact_email`)) {
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

      # check if the required `order_line_type` is null
      if (is.null(self$`order_line_type`)) {
        return(FALSE)
      }

      # check if the required `order_name` is null
      if (is.null(self$`order_name`)) {
        return(FALSE)
      }

      # check if the required `pmp_id` is null
      if (is.null(self$`pmp_id`)) {
        return(FALSE)
      }

      # check if the required `po_number` is null
      if (is.null(self$`po_number`)) {
        return(FALSE)
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`start_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
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
      # check if the required `accepted_terms_id` is null
      if (is.null(self$`accepted_terms_id`)) {
        invalid_fields["accepted_terms_id"] <- "Non-nullable required field `accepted_terms_id` cannot be null."
      }

      # check if the required `billing_contact_email` is null
      if (is.null(self$`billing_contact_email`)) {
        invalid_fields["billing_contact_email"] <- "Non-nullable required field `billing_contact_email` cannot be null."
      }

      # check if the required `billing_contact_firstname` is null
      if (is.null(self$`billing_contact_firstname`)) {
        invalid_fields["billing_contact_firstname"] <- "Non-nullable required field `billing_contact_firstname` cannot be null."
      }

      # check if the required `billing_contact_lastname` is null
      if (is.null(self$`billing_contact_lastname`)) {
        invalid_fields["billing_contact_lastname"] <- "Non-nullable required field `billing_contact_lastname` cannot be null."
      }

      # check if the required `billto_billing_address_id` is null
      if (is.null(self$`billto_billing_address_id`)) {
        invalid_fields["billto_billing_address_id"] <- "Non-nullable required field `billto_billing_address_id` cannot be null."
      }

      # check if the required `billto_business_address_id` is null
      if (is.null(self$`billto_business_address_id`)) {
        invalid_fields["billto_business_address_id"] <- "Non-nullable required field `billto_business_address_id` cannot be null."
      }

      # check if the required `billto_company_id` is null
      if (is.null(self$`billto_company_id`)) {
        invalid_fields["billto_company_id"] <- "Non-nullable required field `billto_company_id` cannot be null."
      }

      # check if the required `currency_info` is null
      if (is.null(self$`currency_info`)) {
        invalid_fields["currency_info"] <- "Non-nullable required field `currency_info` cannot be null."
      }

      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
      }

      # check if the required `media_contact_email` is null
      if (is.null(self$`media_contact_email`)) {
        invalid_fields["media_contact_email"] <- "Non-nullable required field `media_contact_email` cannot be null."
      }

      # check if the required `media_contact_firstname` is null
      if (is.null(self$`media_contact_firstname`)) {
        invalid_fields["media_contact_firstname"] <- "Non-nullable required field `media_contact_firstname` cannot be null."
      }

      # check if the required `media_contact_lastname` is null
      if (is.null(self$`media_contact_lastname`)) {
        invalid_fields["media_contact_lastname"] <- "Non-nullable required field `media_contact_lastname` cannot be null."
      }

      # check if the required `order_line_type` is null
      if (is.null(self$`order_line_type`)) {
        invalid_fields["order_line_type"] <- "Non-nullable required field `order_line_type` cannot be null."
      }

      # check if the required `order_name` is null
      if (is.null(self$`order_name`)) {
        invalid_fields["order_name"] <- "Non-nullable required field `order_name` cannot be null."
      }

      # check if the required `pmp_id` is null
      if (is.null(self$`pmp_id`)) {
        invalid_fields["pmp_id"] <- "Non-nullable required field `pmp_id` cannot be null."
      }

      # check if the required `po_number` is null
      if (is.null(self$`po_number`)) {
        invalid_fields["po_number"] <- "Non-nullable required field `po_number` cannot be null."
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        invalid_fields["start_date"] <- "Non-nullable required field `start_date` cannot be null."
      }

      if (!str_detect(self$`start_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["start_date"] <- "Invalid value for `start_date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
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
# SSIOInsertionOrderCreate$unlock()
#
## Below is an example to define the print function
# SSIOInsertionOrderCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOInsertionOrderCreate$lock()

