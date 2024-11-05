#' Create a new BillingProfilesResponse
#'
#' @description
#' BillingProfilesResponse Class
#'
#' @docType class
#' @title BillingProfilesResponse
#' @description BillingProfilesResponse Class
#' @format An \code{R6Class} generator object
#' @field id Billing ID. character [optional]
#' @field card_type Type of the card. character [optional]
#' @field status Status of the billing. character [optional]
#' @field advertiser_id Advertiser ID of the billing. character [optional]
#' @field payment_method_brand Brand of the payment method. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BillingProfilesResponse <- R6::R6Class(
  "BillingProfilesResponse",
  public = list(
    `id` = NULL,
    `card_type` = NULL,
    `status` = NULL,
    `advertiser_id` = NULL,
    `payment_method_brand` = NULL,

    #' @description
    #' Initialize a new BillingProfilesResponse class.
    #'
    #' @param id Billing ID.
    #' @param card_type Type of the card.
    #' @param status Status of the billing.
    #' @param advertiser_id Advertiser ID of the billing.
    #' @param payment_method_brand Brand of the payment method.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `card_type` = NULL, `status` = NULL, `advertiser_id` = NULL, `payment_method_brand` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`card_type`)) {
        if (!(`card_type` %in% c("UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "ELO"))) {
          stop(paste("Error! \"", `card_type`, "\" cannot be assigned to `card_type`. Must be \"UNKNOWN\", \"VISA\", \"MASTERCARD\", \"AMERICAN_EXPRESS\", \"DISCOVER\", \"ELO\".", sep = ""))
        }
        if (!(is.character(`card_type`) && length(`card_type`) == 1)) {
          stop(paste("Error! Invalid data for `card_type`. Must be a string:", `card_type`))
        }
        self$`card_type` <- `card_type`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c("UNSPECIFIED", "VALID", "INVALID", "PENDING", "DELETED", "SECONDARY", "PENDING_SECONDARY"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"UNSPECIFIED\", \"VALID\", \"INVALID\", \"PENDING\", \"DELETED\", \"SECONDARY\", \"PENDING_SECONDARY\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`advertiser_id`)) {
        if (!(is.character(`advertiser_id`) && length(`advertiser_id`) == 1)) {
          stop(paste("Error! Invalid data for `advertiser_id`. Must be a string:", `advertiser_id`))
        }
        self$`advertiser_id` <- `advertiser_id`
      }
      if (!is.null(`payment_method_brand`)) {
        if (!(`payment_method_brand` %in% c("UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "SOFORT", "DINERS_CLUB", "ELO", "CARTE_BANCAIRE"))) {
          stop(paste("Error! \"", `payment_method_brand`, "\" cannot be assigned to `payment_method_brand`. Must be \"UNKNOWN\", \"VISA\", \"MASTERCARD\", \"AMERICAN_EXPRESS\", \"DISCOVER\", \"SOFORT\", \"DINERS_CLUB\", \"ELO\", \"CARTE_BANCAIRE\".", sep = ""))
        }
        if (!(is.character(`payment_method_brand`) && length(`payment_method_brand`) == 1)) {
          stop(paste("Error! Invalid data for `payment_method_brand`. Must be a string:", `payment_method_brand`))
        }
        self$`payment_method_brand` <- `payment_method_brand`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BillingProfilesResponse in JSON format
    toJSON = function() {
      BillingProfilesResponseObject <- list()
      if (!is.null(self$`id`)) {
        BillingProfilesResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`card_type`)) {
        BillingProfilesResponseObject[["card_type"]] <-
          self$`card_type`
      }
      if (!is.null(self$`status`)) {
        BillingProfilesResponseObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`advertiser_id`)) {
        BillingProfilesResponseObject[["advertiser_id"]] <-
          self$`advertiser_id`
      }
      if (!is.null(self$`payment_method_brand`)) {
        BillingProfilesResponseObject[["payment_method_brand"]] <-
          self$`payment_method_brand`
      }
      BillingProfilesResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BillingProfilesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BillingProfilesResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`card_type`)) {
        if (!is.null(this_object$`card_type`) && !(this_object$`card_type` %in% c("UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "ELO"))) {
          stop(paste("Error! \"", this_object$`card_type`, "\" cannot be assigned to `card_type`. Must be \"UNKNOWN\", \"VISA\", \"MASTERCARD\", \"AMERICAN_EXPRESS\", \"DISCOVER\", \"ELO\".", sep = ""))
        }
        self$`card_type` <- this_object$`card_type`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("UNSPECIFIED", "VALID", "INVALID", "PENDING", "DELETED", "SECONDARY", "PENDING_SECONDARY"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"UNSPECIFIED\", \"VALID\", \"INVALID\", \"PENDING\", \"DELETED\", \"SECONDARY\", \"PENDING_SECONDARY\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`advertiser_id`)) {
        self$`advertiser_id` <- this_object$`advertiser_id`
      }
      if (!is.null(this_object$`payment_method_brand`)) {
        if (!is.null(this_object$`payment_method_brand`) && !(this_object$`payment_method_brand` %in% c("UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "SOFORT", "DINERS_CLUB", "ELO", "CARTE_BANCAIRE"))) {
          stop(paste("Error! \"", this_object$`payment_method_brand`, "\" cannot be assigned to `payment_method_brand`. Must be \"UNKNOWN\", \"VISA\", \"MASTERCARD\", \"AMERICAN_EXPRESS\", \"DISCOVER\", \"SOFORT\", \"DINERS_CLUB\", \"ELO\", \"CARTE_BANCAIRE\".", sep = ""))
        }
        self$`payment_method_brand` <- this_object$`payment_method_brand`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BillingProfilesResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`card_type`)) {
          sprintf(
          '"card_type":
            "%s"
                    ',
          self$`card_type`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`advertiser_id`)) {
          sprintf(
          '"advertiser_id":
            "%s"
                    ',
          self$`advertiser_id`
          )
        },
        if (!is.null(self$`payment_method_brand`)) {
          sprintf(
          '"payment_method_brand":
            "%s"
                    ',
          self$`payment_method_brand`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BillingProfilesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BillingProfilesResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`card_type`) && !(this_object$`card_type` %in% c("UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "ELO"))) {
        stop(paste("Error! \"", this_object$`card_type`, "\" cannot be assigned to `card_type`. Must be \"UNKNOWN\", \"VISA\", \"MASTERCARD\", \"AMERICAN_EXPRESS\", \"DISCOVER\", \"ELO\".", sep = ""))
      }
      self$`card_type` <- this_object$`card_type`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("UNSPECIFIED", "VALID", "INVALID", "PENDING", "DELETED", "SECONDARY", "PENDING_SECONDARY"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"UNSPECIFIED\", \"VALID\", \"INVALID\", \"PENDING\", \"DELETED\", \"SECONDARY\", \"PENDING_SECONDARY\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`advertiser_id` <- this_object$`advertiser_id`
      if (!is.null(this_object$`payment_method_brand`) && !(this_object$`payment_method_brand` %in% c("UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "SOFORT", "DINERS_CLUB", "ELO", "CARTE_BANCAIRE"))) {
        stop(paste("Error! \"", this_object$`payment_method_brand`, "\" cannot be assigned to `payment_method_brand`. Must be \"UNKNOWN\", \"VISA\", \"MASTERCARD\", \"AMERICAN_EXPRESS\", \"DISCOVER\", \"SOFORT\", \"DINERS_CLUB\", \"ELO\", \"CARTE_BANCAIRE\".", sep = ""))
      }
      self$`payment_method_brand` <- this_object$`payment_method_brand`
      self
    },

    #' @description
    #' Validate JSON input with respect to BillingProfilesResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BillingProfilesResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`advertiser_id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`advertiser_id`, "^\\d+$")) {
        invalid_fields["advertiser_id"] <- "Invalid value for `advertiser_id`, must conform to the pattern ^\\d+$."
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
# BillingProfilesResponse$unlock()
#
## Below is an example to define the print function
# BillingProfilesResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BillingProfilesResponse$lock()

