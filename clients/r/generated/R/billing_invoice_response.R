#' Create a new BillingInvoiceResponse
#'
#' @description
#' BillingInvoiceResponse Class
#'
#' @docType class
#' @title BillingInvoiceResponse
#' @description BillingInvoiceResponse Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id The ID of the ad account this invoice belongs to character [optional]
#' @field ad_account_name The name of the ad account this invoice belongs to character [optional]
#' @field amount_billed_micro_currency The amount billed in this invoice. Denoted in micro currency integer [optional]
#' @field amount_discount_micro_currency The discount in this invoice. Denoted in micro currency integer [optional]
#' @field amount_net_micro_currency The net amount in this invoice. Denoted in micro currency integer [optional]
#' @field amount_tax_micro_currency The tax in this invoice. Denoted in micro currency integer [optional]
#' @field bill_to_country The country of the bill to address character [optional]
#' @field billing_period_end_date The end date of the billing period. Format: YYYY-MM-DD character [optional]
#' @field billing_period_start_date The start date of the billing period. Format: YYYY-MM-DD character [optional]
#' @field currency  \link{Currency} [optional]
#' @field document_type The type of the document character [optional]
#' @field id Unique identifier for the billing invoice character [optional]
#' @field invoice_due_date The date the invoice is due. Format: YYYY-MM-DD character [optional]
#' @field payment_terms The payment terms of the invoice character [optional]
#' @field status The status of the invoice character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BillingInvoiceResponse <- R6::R6Class(
  "BillingInvoiceResponse",
  public = list(
    `ad_account_id` = NULL,
    `ad_account_name` = NULL,
    `amount_billed_micro_currency` = NULL,
    `amount_discount_micro_currency` = NULL,
    `amount_net_micro_currency` = NULL,
    `amount_tax_micro_currency` = NULL,
    `bill_to_country` = NULL,
    `billing_period_end_date` = NULL,
    `billing_period_start_date` = NULL,
    `currency` = NULL,
    `document_type` = NULL,
    `id` = NULL,
    `invoice_due_date` = NULL,
    `payment_terms` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new BillingInvoiceResponse class.
    #'
    #' @param ad_account_id The ID of the ad account this invoice belongs to
    #' @param ad_account_name The name of the ad account this invoice belongs to
    #' @param amount_billed_micro_currency The amount billed in this invoice. Denoted in micro currency
    #' @param amount_discount_micro_currency The discount in this invoice. Denoted in micro currency
    #' @param amount_net_micro_currency The net amount in this invoice. Denoted in micro currency
    #' @param amount_tax_micro_currency The tax in this invoice. Denoted in micro currency
    #' @param bill_to_country The country of the bill to address
    #' @param billing_period_end_date The end date of the billing period. Format: YYYY-MM-DD
    #' @param billing_period_start_date The start date of the billing period. Format: YYYY-MM-DD
    #' @param currency currency
    #' @param document_type The type of the document
    #' @param id Unique identifier for the billing invoice
    #' @param invoice_due_date The date the invoice is due. Format: YYYY-MM-DD
    #' @param payment_terms The payment terms of the invoice
    #' @param status The status of the invoice
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id` = NULL, `ad_account_name` = NULL, `amount_billed_micro_currency` = NULL, `amount_discount_micro_currency` = NULL, `amount_net_micro_currency` = NULL, `amount_tax_micro_currency` = NULL, `bill_to_country` = NULL, `billing_period_end_date` = NULL, `billing_period_start_date` = NULL, `currency` = NULL, `document_type` = NULL, `id` = NULL, `invoice_due_date` = NULL, `payment_terms` = NULL, `status` = NULL, ...) {
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`ad_account_name`)) {
        if (!(is.character(`ad_account_name`) && length(`ad_account_name`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_name`. Must be a string:", `ad_account_name`))
        }
        self$`ad_account_name` <- `ad_account_name`
      }
      if (!is.null(`amount_billed_micro_currency`)) {
        if (!(is.numeric(`amount_billed_micro_currency`) && length(`amount_billed_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `amount_billed_micro_currency`. Must be an integer:", `amount_billed_micro_currency`))
        }
        self$`amount_billed_micro_currency` <- `amount_billed_micro_currency`
      }
      if (!is.null(`amount_discount_micro_currency`)) {
        if (!(is.numeric(`amount_discount_micro_currency`) && length(`amount_discount_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `amount_discount_micro_currency`. Must be an integer:", `amount_discount_micro_currency`))
        }
        self$`amount_discount_micro_currency` <- `amount_discount_micro_currency`
      }
      if (!is.null(`amount_net_micro_currency`)) {
        if (!(is.numeric(`amount_net_micro_currency`) && length(`amount_net_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `amount_net_micro_currency`. Must be an integer:", `amount_net_micro_currency`))
        }
        self$`amount_net_micro_currency` <- `amount_net_micro_currency`
      }
      if (!is.null(`amount_tax_micro_currency`)) {
        if (!(is.numeric(`amount_tax_micro_currency`) && length(`amount_tax_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `amount_tax_micro_currency`. Must be an integer:", `amount_tax_micro_currency`))
        }
        self$`amount_tax_micro_currency` <- `amount_tax_micro_currency`
      }
      if (!is.null(`bill_to_country`)) {
        if (!(is.character(`bill_to_country`) && length(`bill_to_country`) == 1)) {
          stop(paste("Error! Invalid data for `bill_to_country`. Must be a string:", `bill_to_country`))
        }
        self$`bill_to_country` <- `bill_to_country`
      }
      if (!is.null(`billing_period_end_date`)) {
        if (!is.character(`billing_period_end_date`)) {
          stop(paste("Error! Invalid data for `billing_period_end_date`. Must be a string:", `billing_period_end_date`))
        }
        self$`billing_period_end_date` <- `billing_period_end_date`
      }
      if (!is.null(`billing_period_start_date`)) {
        if (!is.character(`billing_period_start_date`)) {
          stop(paste("Error! Invalid data for `billing_period_start_date`. Must be a string:", `billing_period_start_date`))
        }
        self$`billing_period_start_date` <- `billing_period_start_date`
      }
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`document_type`)) {
        if (!(`document_type` %in% c("INVOICE", "CREDIT_MEMO"))) {
          stop(paste("Error! \"", `document_type`, "\" cannot be assigned to `document_type`. Must be \"INVOICE\", \"CREDIT_MEMO\".", sep = ""))
        }
        if (!(is.character(`document_type`) && length(`document_type`) == 1)) {
          stop(paste("Error! Invalid data for `document_type`. Must be a string:", `document_type`))
        }
        self$`document_type` <- `document_type`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`invoice_due_date`)) {
        if (!is.character(`invoice_due_date`)) {
          stop(paste("Error! Invalid data for `invoice_due_date`. Must be a string:", `invoice_due_date`))
        }
        self$`invoice_due_date` <- `invoice_due_date`
      }
      if (!is.null(`payment_terms`)) {
        if (!(is.character(`payment_terms`) && length(`payment_terms`) == 1)) {
          stop(paste("Error! Invalid data for `payment_terms`. Must be a string:", `payment_terms`))
        }
        self$`payment_terms` <- `payment_terms`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c("OPEN", "CLOSED"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"OPEN\", \"CLOSED\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
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
    #' @return BillingInvoiceResponse as a base R list.
    #' @examples
    #' # convert array of BillingInvoiceResponse (x) to a data frame
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
    #' Convert BillingInvoiceResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BillingInvoiceResponseObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        BillingInvoiceResponseObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`ad_account_name`)) {
        BillingInvoiceResponseObject[["ad_account_name"]] <-
          self$`ad_account_name`
      }
      if (!is.null(self$`amount_billed_micro_currency`)) {
        BillingInvoiceResponseObject[["amount_billed_micro_currency"]] <-
          self$`amount_billed_micro_currency`
      }
      if (!is.null(self$`amount_discount_micro_currency`)) {
        BillingInvoiceResponseObject[["amount_discount_micro_currency"]] <-
          self$`amount_discount_micro_currency`
      }
      if (!is.null(self$`amount_net_micro_currency`)) {
        BillingInvoiceResponseObject[["amount_net_micro_currency"]] <-
          self$`amount_net_micro_currency`
      }
      if (!is.null(self$`amount_tax_micro_currency`)) {
        BillingInvoiceResponseObject[["amount_tax_micro_currency"]] <-
          self$`amount_tax_micro_currency`
      }
      if (!is.null(self$`bill_to_country`)) {
        BillingInvoiceResponseObject[["bill_to_country"]] <-
          self$`bill_to_country`
      }
      if (!is.null(self$`billing_period_end_date`)) {
        BillingInvoiceResponseObject[["billing_period_end_date"]] <-
          self$`billing_period_end_date`
      }
      if (!is.null(self$`billing_period_start_date`)) {
        BillingInvoiceResponseObject[["billing_period_start_date"]] <-
          self$`billing_period_start_date`
      }
      if (!is.null(self$`currency`)) {
        BillingInvoiceResponseObject[["currency"]] <-
          self$`currency`$toSimpleType()
      }
      if (!is.null(self$`document_type`)) {
        BillingInvoiceResponseObject[["document_type"]] <-
          self$`document_type`
      }
      if (!is.null(self$`id`)) {
        BillingInvoiceResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`invoice_due_date`)) {
        BillingInvoiceResponseObject[["invoice_due_date"]] <-
          self$`invoice_due_date`
      }
      if (!is.null(self$`payment_terms`)) {
        BillingInvoiceResponseObject[["payment_terms"]] <-
          self$`payment_terms`
      }
      if (!is.null(self$`status`)) {
        BillingInvoiceResponseObject[["status"]] <-
          self$`status`
      }
      return(BillingInvoiceResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BillingInvoiceResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BillingInvoiceResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`ad_account_name`)) {
        self$`ad_account_name` <- this_object$`ad_account_name`
      }
      if (!is.null(this_object$`amount_billed_micro_currency`)) {
        self$`amount_billed_micro_currency` <- this_object$`amount_billed_micro_currency`
      }
      if (!is.null(this_object$`amount_discount_micro_currency`)) {
        self$`amount_discount_micro_currency` <- this_object$`amount_discount_micro_currency`
      }
      if (!is.null(this_object$`amount_net_micro_currency`)) {
        self$`amount_net_micro_currency` <- this_object$`amount_net_micro_currency`
      }
      if (!is.null(this_object$`amount_tax_micro_currency`)) {
        self$`amount_tax_micro_currency` <- this_object$`amount_tax_micro_currency`
      }
      if (!is.null(this_object$`bill_to_country`)) {
        self$`bill_to_country` <- this_object$`bill_to_country`
      }
      if (!is.null(this_object$`billing_period_end_date`)) {
        self$`billing_period_end_date` <- this_object$`billing_period_end_date`
      }
      if (!is.null(this_object$`billing_period_start_date`)) {
        self$`billing_period_start_date` <- this_object$`billing_period_start_date`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- Currency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`document_type`)) {
        if (!is.null(this_object$`document_type`) && !(this_object$`document_type` %in% c("INVOICE", "CREDIT_MEMO"))) {
          stop(paste("Error! \"", this_object$`document_type`, "\" cannot be assigned to `document_type`. Must be \"INVOICE\", \"CREDIT_MEMO\".", sep = ""))
        }
        self$`document_type` <- this_object$`document_type`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`invoice_due_date`)) {
        self$`invoice_due_date` <- this_object$`invoice_due_date`
      }
      if (!is.null(this_object$`payment_terms`)) {
        self$`payment_terms` <- this_object$`payment_terms`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("OPEN", "CLOSED"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"OPEN\", \"CLOSED\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BillingInvoiceResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BillingInvoiceResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BillingInvoiceResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`ad_account_name` <- this_object$`ad_account_name`
      self$`amount_billed_micro_currency` <- this_object$`amount_billed_micro_currency`
      self$`amount_discount_micro_currency` <- this_object$`amount_discount_micro_currency`
      self$`amount_net_micro_currency` <- this_object$`amount_net_micro_currency`
      self$`amount_tax_micro_currency` <- this_object$`amount_tax_micro_currency`
      self$`bill_to_country` <- this_object$`bill_to_country`
      self$`billing_period_end_date` <- this_object$`billing_period_end_date`
      self$`billing_period_start_date` <- this_object$`billing_period_start_date`
      self$`currency` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`document_type`) && !(this_object$`document_type` %in% c("INVOICE", "CREDIT_MEMO"))) {
        stop(paste("Error! \"", this_object$`document_type`, "\" cannot be assigned to `document_type`. Must be \"INVOICE\", \"CREDIT_MEMO\".", sep = ""))
      }
      self$`document_type` <- this_object$`document_type`
      self$`id` <- this_object$`id`
      self$`invoice_due_date` <- this_object$`invoice_due_date`
      self$`payment_terms` <- this_object$`payment_terms`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("OPEN", "CLOSED"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"OPEN\", \"CLOSED\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self
    },

    #' @description
    #' Validate JSON input with respect to BillingInvoiceResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BillingInvoiceResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`billing_period_end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        return(FALSE)
      }

      if (!str_detect(self$`billing_period_start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`invoice_due_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`billing_period_end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["billing_period_end_date"] <- "Invalid value for `billing_period_end_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      if (!str_detect(self$`billing_period_start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["billing_period_start_date"] <- "Invalid value for `billing_period_start_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`invoice_due_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["invoice_due_date"] <- "Invalid value for `invoice_due_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
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
# BillingInvoiceResponse$unlock()
#
## Below is an example to define the print function
# BillingInvoiceResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BillingInvoiceResponse$lock()

