#' Create a new SSIOInsertionOrderUpdate
#'
#' @description
#' Resource create or update operation model.
#'
#' @docType class
#' @title SSIOInsertionOrderUpdate
#' @description SSIOInsertionOrderUpdate Class
#' @format An \code{R6Class} generator object
#' @field ads_manager_order_line_id Ads manager OrderLineId character [optional]
#' @field agency_link URL link for agency character [optional]
#' @field billing_contact_email The billing contact email character [optional]
#' @field billing_contact_firstname The billing contact first name character [optional]
#' @field billing_contact_lastname The billing contact last name character [optional]
#' @field budget_amount If Budget order line, the budget amount. numeric [optional]
#' @field end_date End date of time period. Format: YYYY-MM-DD character [optional]
#' @field media_contact_email The media contact email character [optional]
#' @field media_contact_firstname The media contact first name character [optional]
#' @field media_contact_lastname The media contact last name character [optional]
#' @field oracle_line_id LineId in the Oracle DB character [optional]
#' @field po_number The po number character [optional]
#' @field salesforce_order_id OrderId in SFDC character [optional]
#' @field salesforce_order_line_id OrderLineId in SFDC character [optional]
#' @field start_date Starting date of time period. Format: YYYY-MM-DD character [optional]
#' @field user_email The email of user submitting the insertion order character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOInsertionOrderUpdate <- R6::R6Class(
  "SSIOInsertionOrderUpdate",
  public = list(
    `ads_manager_order_line_id` = NULL,
    `agency_link` = NULL,
    `billing_contact_email` = NULL,
    `billing_contact_firstname` = NULL,
    `billing_contact_lastname` = NULL,
    `budget_amount` = NULL,
    `end_date` = NULL,
    `media_contact_email` = NULL,
    `media_contact_firstname` = NULL,
    `media_contact_lastname` = NULL,
    `oracle_line_id` = NULL,
    `po_number` = NULL,
    `salesforce_order_id` = NULL,
    `salesforce_order_line_id` = NULL,
    `start_date` = NULL,
    `user_email` = NULL,

    #' @description
    #' Initialize a new SSIOInsertionOrderUpdate class.
    #'
    #' @param ads_manager_order_line_id Ads manager OrderLineId
    #' @param agency_link URL link for agency
    #' @param billing_contact_email The billing contact email
    #' @param billing_contact_firstname The billing contact first name
    #' @param billing_contact_lastname The billing contact last name
    #' @param budget_amount If Budget order line, the budget amount.
    #' @param end_date End date of time period. Format: YYYY-MM-DD
    #' @param media_contact_email The media contact email
    #' @param media_contact_firstname The media contact first name
    #' @param media_contact_lastname The media contact last name
    #' @param oracle_line_id LineId in the Oracle DB
    #' @param po_number The po number
    #' @param salesforce_order_id OrderId in SFDC
    #' @param salesforce_order_line_id OrderLineId in SFDC
    #' @param start_date Starting date of time period. Format: YYYY-MM-DD
    #' @param user_email The email of user submitting the insertion order
    #' @param ... Other optional arguments.
    initialize = function(`ads_manager_order_line_id` = NULL, `agency_link` = NULL, `billing_contact_email` = NULL, `billing_contact_firstname` = NULL, `billing_contact_lastname` = NULL, `budget_amount` = NULL, `end_date` = NULL, `media_contact_email` = NULL, `media_contact_firstname` = NULL, `media_contact_lastname` = NULL, `oracle_line_id` = NULL, `po_number` = NULL, `salesforce_order_id` = NULL, `salesforce_order_line_id` = NULL, `start_date` = NULL, `user_email` = NULL, ...) {
      if (!is.null(`ads_manager_order_line_id`)) {
        if (!(is.character(`ads_manager_order_line_id`) && length(`ads_manager_order_line_id`) == 1)) {
          stop(paste("Error! Invalid data for `ads_manager_order_line_id`. Must be a string:", `ads_manager_order_line_id`))
        }
        self$`ads_manager_order_line_id` <- `ads_manager_order_line_id`
      }
      if (!is.null(`agency_link`)) {
        if (!(is.character(`agency_link`) && length(`agency_link`) == 1)) {
          stop(paste("Error! Invalid data for `agency_link`. Must be a string:", `agency_link`))
        }
        self$`agency_link` <- `agency_link`
      }
      if (!is.null(`billing_contact_email`)) {
        if (!(is.character(`billing_contact_email`) && length(`billing_contact_email`) == 1)) {
          stop(paste("Error! Invalid data for `billing_contact_email`. Must be a string:", `billing_contact_email`))
        }
        self$`billing_contact_email` <- `billing_contact_email`
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
      if (!is.null(`oracle_line_id`)) {
        if (!(is.character(`oracle_line_id`) && length(`oracle_line_id`) == 1)) {
          stop(paste("Error! Invalid data for `oracle_line_id`. Must be a string:", `oracle_line_id`))
        }
        self$`oracle_line_id` <- `oracle_line_id`
      }
      if (!is.null(`po_number`)) {
        if (!(is.character(`po_number`) && length(`po_number`) == 1)) {
          stop(paste("Error! Invalid data for `po_number`. Must be a string:", `po_number`))
        }
        self$`po_number` <- `po_number`
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
      if (!is.null(`start_date`)) {
        if (!(is.character(`start_date`) && length(`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
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
    #' @return SSIOInsertionOrderUpdate as a base R list.
    #' @examples
    #' # convert array of SSIOInsertionOrderUpdate (x) to a data frame
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
    #' Convert SSIOInsertionOrderUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SSIOInsertionOrderUpdateObject <- list()
      if (!is.null(self$`ads_manager_order_line_id`)) {
        SSIOInsertionOrderUpdateObject[["ads_manager_order_line_id"]] <-
          self$`ads_manager_order_line_id`
      }
      if (!is.null(self$`agency_link`)) {
        SSIOInsertionOrderUpdateObject[["agency_link"]] <-
          self$`agency_link`
      }
      if (!is.null(self$`billing_contact_email`)) {
        SSIOInsertionOrderUpdateObject[["billing_contact_email"]] <-
          self$`billing_contact_email`
      }
      if (!is.null(self$`billing_contact_firstname`)) {
        SSIOInsertionOrderUpdateObject[["billing_contact_firstname"]] <-
          self$`billing_contact_firstname`
      }
      if (!is.null(self$`billing_contact_lastname`)) {
        SSIOInsertionOrderUpdateObject[["billing_contact_lastname"]] <-
          self$`billing_contact_lastname`
      }
      if (!is.null(self$`budget_amount`)) {
        SSIOInsertionOrderUpdateObject[["budget_amount"]] <-
          self$`budget_amount`
      }
      if (!is.null(self$`end_date`)) {
        SSIOInsertionOrderUpdateObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`media_contact_email`)) {
        SSIOInsertionOrderUpdateObject[["media_contact_email"]] <-
          self$`media_contact_email`
      }
      if (!is.null(self$`media_contact_firstname`)) {
        SSIOInsertionOrderUpdateObject[["media_contact_firstname"]] <-
          self$`media_contact_firstname`
      }
      if (!is.null(self$`media_contact_lastname`)) {
        SSIOInsertionOrderUpdateObject[["media_contact_lastname"]] <-
          self$`media_contact_lastname`
      }
      if (!is.null(self$`oracle_line_id`)) {
        SSIOInsertionOrderUpdateObject[["oracle_line_id"]] <-
          self$`oracle_line_id`
      }
      if (!is.null(self$`po_number`)) {
        SSIOInsertionOrderUpdateObject[["po_number"]] <-
          self$`po_number`
      }
      if (!is.null(self$`salesforce_order_id`)) {
        SSIOInsertionOrderUpdateObject[["salesforce_order_id"]] <-
          self$`salesforce_order_id`
      }
      if (!is.null(self$`salesforce_order_line_id`)) {
        SSIOInsertionOrderUpdateObject[["salesforce_order_line_id"]] <-
          self$`salesforce_order_line_id`
      }
      if (!is.null(self$`start_date`)) {
        SSIOInsertionOrderUpdateObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`user_email`)) {
        SSIOInsertionOrderUpdateObject[["user_email"]] <-
          self$`user_email`
      }
      return(SSIOInsertionOrderUpdateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOInsertionOrderUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOInsertionOrderUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ads_manager_order_line_id`)) {
        self$`ads_manager_order_line_id` <- this_object$`ads_manager_order_line_id`
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
      if (!is.null(this_object$`budget_amount`)) {
        self$`budget_amount` <- this_object$`budget_amount`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
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
      if (!is.null(this_object$`oracle_line_id`)) {
        self$`oracle_line_id` <- this_object$`oracle_line_id`
      }
      if (!is.null(this_object$`po_number`)) {
        self$`po_number` <- this_object$`po_number`
      }
      if (!is.null(this_object$`salesforce_order_id`)) {
        self$`salesforce_order_id` <- this_object$`salesforce_order_id`
      }
      if (!is.null(this_object$`salesforce_order_line_id`)) {
        self$`salesforce_order_line_id` <- this_object$`salesforce_order_line_id`
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
    #' @return SSIOInsertionOrderUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOInsertionOrderUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOInsertionOrderUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ads_manager_order_line_id` <- this_object$`ads_manager_order_line_id`
      self$`agency_link` <- this_object$`agency_link`
      self$`billing_contact_email` <- this_object$`billing_contact_email`
      self$`billing_contact_firstname` <- this_object$`billing_contact_firstname`
      self$`billing_contact_lastname` <- this_object$`billing_contact_lastname`
      self$`budget_amount` <- this_object$`budget_amount`
      self$`end_date` <- this_object$`end_date`
      self$`media_contact_email` <- this_object$`media_contact_email`
      self$`media_contact_firstname` <- this_object$`media_contact_firstname`
      self$`media_contact_lastname` <- this_object$`media_contact_lastname`
      self$`oracle_line_id` <- this_object$`oracle_line_id`
      self$`po_number` <- this_object$`po_number`
      self$`salesforce_order_id` <- this_object$`salesforce_order_id`
      self$`salesforce_order_line_id` <- this_object$`salesforce_order_line_id`
      self$`start_date` <- this_object$`start_date`
      self$`user_email` <- this_object$`user_email`
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOInsertionOrderUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOInsertionOrderUpdate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
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
      if (!str_detect(self$`end_date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
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
# SSIOInsertionOrderUpdate$unlock()
#
## Below is an example to define the print function
# SSIOInsertionOrderUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOInsertionOrderUpdate$lock()

