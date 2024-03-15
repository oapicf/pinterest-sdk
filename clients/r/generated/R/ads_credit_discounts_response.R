#' Create a new AdsCreditDiscountsResponse
#'
#' @description
#' AdsCreditDiscountsResponse Class
#'
#' @docType class
#' @title AdsCreditDiscountsResponse
#' @description AdsCreditDiscountsResponse Class
#' @format An \code{R6Class} generator object
#' @field active True if the offer code is currently active. character [optional]
#' @field advertiser_id Advertiser ID the offer was applied to. character [optional]
#' @field discountType The type of discount of this credit character [optional]
#' @field discountInMicroCurrency The discount applied in the offer’s currency value. numeric [optional]
#' @field discountCurrency Currency value for the discount. character [optional]
#' @field title Human readable title of the offer code. character [optional]
#' @field remainingDiscountInMicroCurrency The credits left to spend. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsCreditDiscountsResponse <- R6::R6Class(
  "AdsCreditDiscountsResponse",
  public = list(
    `active` = NULL,
    `advertiser_id` = NULL,
    `discountType` = NULL,
    `discountInMicroCurrency` = NULL,
    `discountCurrency` = NULL,
    `title` = NULL,
    `remainingDiscountInMicroCurrency` = NULL,
    #' Initialize a new AdsCreditDiscountsResponse class.
    #'
    #' @description
    #' Initialize a new AdsCreditDiscountsResponse class.
    #'
    #' @param active True if the offer code is currently active.
    #' @param advertiser_id Advertiser ID the offer was applied to.
    #' @param discountType The type of discount of this credit
    #' @param discountInMicroCurrency The discount applied in the offer’s currency value.
    #' @param discountCurrency Currency value for the discount.
    #' @param title Human readable title of the offer code.
    #' @param remainingDiscountInMicroCurrency The credits left to spend.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`active` = NULL, `advertiser_id` = NULL, `discountType` = NULL, `discountInMicroCurrency` = NULL, `discountCurrency` = NULL, `title` = NULL, `remainingDiscountInMicroCurrency` = NULL, ...) {
      if (!is.null(`active`)) {
        if (!(is.logical(`active`) && length(`active`) == 1)) {
          stop(paste("Error! Invalid data for `active`. Must be a boolean:", `active`))
        }
        self$`active` <- `active`
      }
      if (!is.null(`advertiser_id`)) {
        if (!(is.character(`advertiser_id`) && length(`advertiser_id`) == 1)) {
          stop(paste("Error! Invalid data for `advertiser_id`. Must be a string:", `advertiser_id`))
        }
        self$`advertiser_id` <- `advertiser_id`
      }
      if (!is.null(`discountType`)) {
        if (!(`discountType` %in% c("COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND", "null"))) {
          stop(paste("Error! \"", `discountType`, "\" cannot be assigned to `discountType`. Must be \"COUPON\", \"CREDIT\", \"COUPON_APPLIED\", \"CREDIT_APPLIED\", \"MARKETING_OFFER_CREDIT\", \"MARKETING_OFFER_CREDIT_APPLIED\", \"GOODWILL_CREDIT\", \"GOODWILL_CREDIT_APPLIED\", \"INTERNAL_CREDIT\", \"INTERNAL_CREDIT_APPLIED\", \"PREPAID_CREDIT\", \"PREPAID_CREDIT_APPLIED\", \"SALES_INCENTIVE_CREDIT\", \"SALES_INCENTIVE_CREDIT_APPLIED\", \"CREDIT_EXPIRED\", \"FUTURE_CREDIT\", \"REFERRAL_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED\", \"PREPAID_CREDIT_REFUND\", \"null\".", sep = ""))
        }
        if (!(is.character(`discountType`) && length(`discountType`) == 1)) {
          stop(paste("Error! Invalid data for `discountType`. Must be a string:", `discountType`))
        }
        self$`discountType` <- `discountType`
      }
      if (!is.null(`discountInMicroCurrency`)) {
        self$`discountInMicroCurrency` <- `discountInMicroCurrency`
      }
      if (!is.null(`discountCurrency`)) {
        if (!(is.character(`discountCurrency`) && length(`discountCurrency`) == 1)) {
          stop(paste("Error! Invalid data for `discountCurrency`. Must be a string:", `discountCurrency`))
        }
        self$`discountCurrency` <- `discountCurrency`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`remainingDiscountInMicroCurrency`)) {
        self$`remainingDiscountInMicroCurrency` <- `remainingDiscountInMicroCurrency`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditDiscountsResponse in JSON format
    #' @export
    toJSON = function() {
      AdsCreditDiscountsResponseObject <- list()
      if (!is.null(self$`active`)) {
        AdsCreditDiscountsResponseObject[["active"]] <-
          self$`active`
      }
      if (!is.null(self$`advertiser_id`)) {
        AdsCreditDiscountsResponseObject[["advertiser_id"]] <-
          self$`advertiser_id`
      }
      if (!is.null(self$`discountType`)) {
        AdsCreditDiscountsResponseObject[["discountType"]] <-
          self$`discountType`
      }
      if (!is.null(self$`discountInMicroCurrency`)) {
        AdsCreditDiscountsResponseObject[["discountInMicroCurrency"]] <-
          self$`discountInMicroCurrency`
      }
      if (!is.null(self$`discountCurrency`)) {
        AdsCreditDiscountsResponseObject[["discountCurrency"]] <-
          self$`discountCurrency`
      }
      if (!is.null(self$`title`)) {
        AdsCreditDiscountsResponseObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`remainingDiscountInMicroCurrency`)) {
        AdsCreditDiscountsResponseObject[["remainingDiscountInMicroCurrency"]] <-
          self$`remainingDiscountInMicroCurrency`
      }
      AdsCreditDiscountsResponseObject
    },
    #' Deserialize JSON string into an instance of AdsCreditDiscountsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsCreditDiscountsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditDiscountsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`active`)) {
        self$`active` <- this_object$`active`
      }
      if (!is.null(this_object$`advertiser_id`)) {
        self$`advertiser_id` <- this_object$`advertiser_id`
      }
      if (!is.null(this_object$`discountType`)) {
        if (!is.null(this_object$`discountType`) && !(this_object$`discountType` %in% c("COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND", "null"))) {
          stop(paste("Error! \"", this_object$`discountType`, "\" cannot be assigned to `discountType`. Must be \"COUPON\", \"CREDIT\", \"COUPON_APPLIED\", \"CREDIT_APPLIED\", \"MARKETING_OFFER_CREDIT\", \"MARKETING_OFFER_CREDIT_APPLIED\", \"GOODWILL_CREDIT\", \"GOODWILL_CREDIT_APPLIED\", \"INTERNAL_CREDIT\", \"INTERNAL_CREDIT_APPLIED\", \"PREPAID_CREDIT\", \"PREPAID_CREDIT_APPLIED\", \"SALES_INCENTIVE_CREDIT\", \"SALES_INCENTIVE_CREDIT_APPLIED\", \"CREDIT_EXPIRED\", \"FUTURE_CREDIT\", \"REFERRAL_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED\", \"PREPAID_CREDIT_REFUND\", \"null\".", sep = ""))
        }
        self$`discountType` <- this_object$`discountType`
      }
      if (!is.null(this_object$`discountInMicroCurrency`)) {
        self$`discountInMicroCurrency` <- this_object$`discountInMicroCurrency`
      }
      if (!is.null(this_object$`discountCurrency`)) {
        self$`discountCurrency` <- this_object$`discountCurrency`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`remainingDiscountInMicroCurrency`)) {
        self$`remainingDiscountInMicroCurrency` <- this_object$`remainingDiscountInMicroCurrency`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditDiscountsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`active`)) {
          sprintf(
          '"active":
            %s
                    ',
          tolower(self$`active`)
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
        if (!is.null(self$`discountType`)) {
          sprintf(
          '"discountType":
            "%s"
                    ',
          self$`discountType`
          )
        },
        if (!is.null(self$`discountInMicroCurrency`)) {
          sprintf(
          '"discountInMicroCurrency":
            %d
                    ',
          self$`discountInMicroCurrency`
          )
        },
        if (!is.null(self$`discountCurrency`)) {
          sprintf(
          '"discountCurrency":
            "%s"
                    ',
          self$`discountCurrency`
          )
        },
        if (!is.null(self$`title`)) {
          sprintf(
          '"title":
            "%s"
                    ',
          self$`title`
          )
        },
        if (!is.null(self$`remainingDiscountInMicroCurrency`)) {
          sprintf(
          '"remainingDiscountInMicroCurrency":
            %d
                    ',
          self$`remainingDiscountInMicroCurrency`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdsCreditDiscountsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsCreditDiscountsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditDiscountsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`active` <- this_object$`active`
      self$`advertiser_id` <- this_object$`advertiser_id`
      if (!is.null(this_object$`discountType`) && !(this_object$`discountType` %in% c("COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND", "null"))) {
        stop(paste("Error! \"", this_object$`discountType`, "\" cannot be assigned to `discountType`. Must be \"COUPON\", \"CREDIT\", \"COUPON_APPLIED\", \"CREDIT_APPLIED\", \"MARKETING_OFFER_CREDIT\", \"MARKETING_OFFER_CREDIT_APPLIED\", \"GOODWILL_CREDIT\", \"GOODWILL_CREDIT_APPLIED\", \"INTERNAL_CREDIT\", \"INTERNAL_CREDIT_APPLIED\", \"PREPAID_CREDIT\", \"PREPAID_CREDIT_APPLIED\", \"SALES_INCENTIVE_CREDIT\", \"SALES_INCENTIVE_CREDIT_APPLIED\", \"CREDIT_EXPIRED\", \"FUTURE_CREDIT\", \"REFERRAL_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED\", \"PREPAID_CREDIT_REFUND\", \"null\".", sep = ""))
      }
      self$`discountType` <- this_object$`discountType`
      self$`discountInMicroCurrency` <- this_object$`discountInMicroCurrency`
      self$`discountCurrency` <- this_object$`discountCurrency`
      self$`title` <- this_object$`title`
      self$`remainingDiscountInMicroCurrency` <- this_object$`remainingDiscountInMicroCurrency`
      self
    },
    #' Validate JSON input with respect to AdsCreditDiscountsResponse
    #'
    #' @description
    #' Validate JSON input with respect to AdsCreditDiscountsResponse and throw an exception if invalid
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
    #' @return String representation of AdsCreditDiscountsResponse
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
      if (!str_detect(self$`advertiser_id`, "^\\d+$")) {
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
      if (!str_detect(self$`advertiser_id`, "^\\d+$")) {
        invalid_fields["advertiser_id"] <- "Invalid value for `advertiser_id`, must conform to the pattern ^\\d+$."
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
# AdsCreditDiscountsResponse$unlock()
#
## Below is an example to define the print function
# AdsCreditDiscountsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsCreditDiscountsResponse$lock()

