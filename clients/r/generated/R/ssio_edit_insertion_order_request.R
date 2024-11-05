#' Create a new SSIOEditInsertionOrderRequest
#'
#' @description
#' SSIOEditInsertionOrderRequest Class
#'
#' @docType class
#' @title SSIOEditInsertionOrderRequest
#' @description SSIOEditInsertionOrderRequest Class
#' @format An \code{R6Class} generator object
#' @field start_date Starting date of time period. Format: YYYY-MM-DD character [optional]
#' @field end_date End date of time period. Format: YYYY-MM-DD character [optional]
#' @field po_number The po number character [optional]
#' @field budget_amount If Budget order line, the budget amount. numeric [optional]
#' @field billing_contact_firstname The billing contact first name character [optional]
#' @field billing_contact_lastname The billing contact last name character [optional]
#' @field billing_contact_email The billing contact email character [optional]
#' @field media_contact_firstname The media contact first name character [optional]
#' @field media_contact_lastname The media contact last name character [optional]
#' @field media_contact_email The media contact email character [optional]
#' @field agency_link URL link for agency character [optional]
#' @field user_email The email of user submitting the insertion order character [optional]
#' @field oracle_line_id LineId in the Oracle DB character [optional]
#' @field salesforce_order_id OrderId in SFDC character [optional]
#' @field salesforce_order_line_id OrderLineId in SFDC character [optional]
#' @field ads_manager_order_line_id Ads manager OrderLineId character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOEditInsertionOrderRequest <- R6::R6Class(
  "SSIOEditInsertionOrderRequest",
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
    `oracle_line_id` = NULL,
    `salesforce_order_id` = NULL,
    `salesforce_order_line_id` = NULL,
    `ads_manager_order_line_id` = NULL,

    #' @description
    #' Initialize a new SSIOEditInsertionOrderRequest class.
    #'
    #' @param start_date Starting date of time period. Format: YYYY-MM-DD
    #' @param end_date End date of time period. Format: YYYY-MM-DD
    #' @param po_number The po number
    #' @param budget_amount If Budget order line, the budget amount.
    #' @param billing_contact_firstname The billing contact first name
    #' @param billing_contact_lastname The billing contact last name
    #' @param billing_contact_email The billing contact email
    #' @param media_contact_firstname The media contact first name
    #' @param media_contact_lastname The media contact last name
    #' @param media_contact_email The media contact email
    #' @param agency_link URL link for agency
    #' @param user_email The email of user submitting the insertion order
    #' @param oracle_line_id LineId in the Oracle DB
    #' @param salesforce_order_id OrderId in SFDC
    #' @param salesforce_order_line_id OrderLineId in SFDC
    #' @param ads_manager_order_line_id Ads manager OrderLineId
    #' @param ... Other optional arguments.
    initialize = function(`start_date` = NULL, `end_date` = NULL, `po_number` = NULL, `budget_amount` = NULL, `billing_contact_firstname` = NULL, `billing_contact_lastname` = NULL, `billing_contact_email` = NULL, `media_contact_firstname` = NULL, `media_contact_lastname` = NULL, `media_contact_email` = NULL, `agency_link` = NULL, `user_email` = NULL, `oracle_line_id` = NULL, `salesforce_order_id` = NULL, `salesforce_order_line_id` = NULL, `ads_manager_order_line_id` = NULL, ...) {
      if (!is.null(`start_date`)) {
        if (!(is.character(`start_date`) && length(`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
      }
      if (!is.null(`end_date`)) {
        if (!(is.character(`end_date`) && length(`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!is.null(`po_number`)) {
        if (!(is.character(`po_number`) && length(`po_number`) == 1)) {
          stop(paste("Error! Invalid data for `po_number`. Must be a string:", `po_number`))
        }
        self$`po_number` <- `po_number`
      }
      if (!is.null(`budget_amount`)) {
        self$`budget_amount` <- `budget_amount`
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
      if (!is.null(`media_contact_email`)) {
        if (!(is.character(`media_contact_email`) && length(`media_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `media_contact_email`. Must be a string:", `media_contact_email`))
        }
        self$`media_contact_email` <- `media_contact_email`
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
      if (!is.null(`oracle_line_id`)) {
        if (!(is.character(`oracle_line_id`) && length(`oracle_line_id`) == 1)) {
          stop(paste("Error! Invalid data for `oracle_line_id`. Must be a string:", `oracle_line_id`))
        }
        self$`oracle_line_id` <- `oracle_line_id`
      }
      if (!is.null(`salesforce_order_id`)) {
        if (!(is.character(`salesforce_order_id`) && length(`salesforce_order_id`) == 1)) {
          stop(paste("Error! Invalid data for `salesforce_order_id`. Must be a string:", `salesforce_order_id`))
        }
        self$`salesforce_order_id` <- `salesforce_order_id`
      }
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
    },

    #' @description
    #' To JSON String
    #'
    #' @return SSIOEditInsertionOrderRequest in JSON format
    toJSON = function() {
      SSIOEditInsertionOrderRequestObject <- list()
      if (!is.null(self$`start_date`)) {
        SSIOEditInsertionOrderRequestObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`end_date`)) {
        SSIOEditInsertionOrderRequestObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`po_number`)) {
        SSIOEditInsertionOrderRequestObject[["po_number"]] <-
          self$`po_number`
      }
      if (!is.null(self$`budget_amount`)) {
        SSIOEditInsertionOrderRequestObject[["budget_amount"]] <-
          self$`budget_amount`
      }
      if (!is.null(self$`billing_contact_firstname`)) {
        SSIOEditInsertionOrderRequestObject[["billing_contact_firstname"]] <-
          self$`billing_contact_firstname`
      }
      if (!is.null(self$`billing_contact_lastname`)) {
        SSIOEditInsertionOrderRequestObject[["billing_contact_lastname"]] <-
          self$`billing_contact_lastname`
      }
      if (!is.null(self$`billing_contact_email`)) {
        SSIOEditInsertionOrderRequestObject[["billing_contact_email"]] <-
          self$`billing_contact_email`
      }
      if (!is.null(self$`media_contact_firstname`)) {
        SSIOEditInsertionOrderRequestObject[["media_contact_firstname"]] <-
          self$`media_contact_firstname`
      }
      if (!is.null(self$`media_contact_lastname`)) {
        SSIOEditInsertionOrderRequestObject[["media_contact_lastname"]] <-
          self$`media_contact_lastname`
      }
      if (!is.null(self$`media_contact_email`)) {
        SSIOEditInsertionOrderRequestObject[["media_contact_email"]] <-
          self$`media_contact_email`
      }
      if (!is.null(self$`agency_link`)) {
        SSIOEditInsertionOrderRequestObject[["agency_link"]] <-
          self$`agency_link`
      }
      if (!is.null(self$`user_email`)) {
        SSIOEditInsertionOrderRequestObject[["user_email"]] <-
          self$`user_email`
      }
      if (!is.null(self$`oracle_line_id`)) {
        SSIOEditInsertionOrderRequestObject[["oracle_line_id"]] <-
          self$`oracle_line_id`
      }
      if (!is.null(self$`salesforce_order_id`)) {
        SSIOEditInsertionOrderRequestObject[["salesforce_order_id"]] <-
          self$`salesforce_order_id`
      }
      if (!is.null(self$`salesforce_order_line_id`)) {
        SSIOEditInsertionOrderRequestObject[["salesforce_order_line_id"]] <-
          self$`salesforce_order_line_id`
      }
      if (!is.null(self$`ads_manager_order_line_id`)) {
        SSIOEditInsertionOrderRequestObject[["ads_manager_order_line_id"]] <-
          self$`ads_manager_order_line_id`
      }
      SSIOEditInsertionOrderRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOEditInsertionOrderRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOEditInsertionOrderRequest
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
      if (!is.null(this_object$`oracle_line_id`)) {
        self$`oracle_line_id` <- this_object$`oracle_line_id`
      }
      if (!is.null(this_object$`salesforce_order_id`)) {
        self$`salesforce_order_id` <- this_object$`salesforce_order_id`
      }
      if (!is.null(this_object$`salesforce_order_line_id`)) {
        self$`salesforce_order_line_id` <- this_object$`salesforce_order_line_id`
      }
      if (!is.null(this_object$`ads_manager_order_line_id`)) {
        self$`ads_manager_order_line_id` <- this_object$`ads_manager_order_line_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return SSIOEditInsertionOrderRequest in JSON format
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
        if (!is.null(self$`oracle_line_id`)) {
          sprintf(
          '"oracle_line_id":
            "%s"
                    ',
          self$`oracle_line_id`
          )
        },
        if (!is.null(self$`salesforce_order_id`)) {
          sprintf(
          '"salesforce_order_id":
            "%s"
                    ',
          self$`salesforce_order_id`
          )
        },
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOEditInsertionOrderRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOEditInsertionOrderRequest
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
      self$`oracle_line_id` <- this_object$`oracle_line_id`
      self$`salesforce_order_id` <- this_object$`salesforce_order_id`
      self$`salesforce_order_line_id` <- this_object$`salesforce_order_line_id`
      self$`ads_manager_order_line_id` <- this_object$`ads_manager_order_line_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOEditInsertionOrderRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOEditInsertionOrderRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        return(FALSE)
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
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
      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["start_date"] <- "Invalid value for `start_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
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
# SSIOEditInsertionOrderRequest$unlock()
#
## Below is an example to define the print function
# SSIOEditInsertionOrderRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOEditInsertionOrderRequest$lock()

