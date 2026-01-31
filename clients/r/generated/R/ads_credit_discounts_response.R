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
#' @field discountCurrency Currency value for the discount. character [optional]
#' @field discountInMicroCurrency The discount applied in the offer’s currency value. numeric [optional]
#' @field discountType The type of discount of this credit character [optional]
#' @field remainingDiscountInMicroCurrency The credits left to spend. numeric [optional]
#' @field title Human readable title of the offer code. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsCreditDiscountsResponse <- R6::R6Class(
  "AdsCreditDiscountsResponse",
  public = list(
    `active` = NULL,
    `advertiser_id` = NULL,
    `discountCurrency` = NULL,
    `discountInMicroCurrency` = NULL,
    `discountType` = NULL,
    `remainingDiscountInMicroCurrency` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new AdsCreditDiscountsResponse class.
    #'
    #' @param active True if the offer code is currently active.
    #' @param advertiser_id Advertiser ID the offer was applied to.
    #' @param discountCurrency Currency value for the discount.
    #' @param discountInMicroCurrency The discount applied in the offer’s currency value.
    #' @param discountType The type of discount of this credit
    #' @param remainingDiscountInMicroCurrency The credits left to spend.
    #' @param title Human readable title of the offer code.
    #' @param ... Other optional arguments.
    initialize = function(`active` = NULL, `advertiser_id` = NULL, `discountCurrency` = NULL, `discountInMicroCurrency` = NULL, `discountType` = NULL, `remainingDiscountInMicroCurrency` = NULL, `title` = NULL, ...) {
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
      if (!is.null(`discountCurrency`)) {
        if (!(is.character(`discountCurrency`) && length(`discountCurrency`) == 1)) {
          stop(paste("Error! Invalid data for `discountCurrency`. Must be a string:", `discountCurrency`))
        }
        self$`discountCurrency` <- `discountCurrency`
      }
      if (!is.null(`discountInMicroCurrency`)) {
        self$`discountInMicroCurrency` <- `discountInMicroCurrency`
      }
      if (!is.null(`discountType`)) {
        if (!(`discountType` %in% c("COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND"))) {
          stop(paste("Error! \"", `discountType`, "\" cannot be assigned to `discountType`. Must be \"COUPON\", \"CREDIT\", \"COUPON_APPLIED\", \"CREDIT_APPLIED\", \"MARKETING_OFFER_CREDIT\", \"MARKETING_OFFER_CREDIT_APPLIED\", \"GOODWILL_CREDIT\", \"GOODWILL_CREDIT_APPLIED\", \"INTERNAL_CREDIT\", \"INTERNAL_CREDIT_APPLIED\", \"PREPAID_CREDIT\", \"PREPAID_CREDIT_APPLIED\", \"SALES_INCENTIVE_CREDIT\", \"SALES_INCENTIVE_CREDIT_APPLIED\", \"CREDIT_EXPIRED\", \"FUTURE_CREDIT\", \"REFERRAL_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED\", \"PREPAID_CREDIT_REFUND\".", sep = ""))
        }
        if (!(is.character(`discountType`) && length(`discountType`) == 1)) {
          stop(paste("Error! Invalid data for `discountType`. Must be a string:", `discountType`))
        }
        self$`discountType` <- `discountType`
      }
      if (!is.null(`remainingDiscountInMicroCurrency`)) {
        self$`remainingDiscountInMicroCurrency` <- `remainingDiscountInMicroCurrency`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
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
    #' @return AdsCreditDiscountsResponse as a base R list.
    #' @examples
    #' # convert array of AdsCreditDiscountsResponse (x) to a data frame
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
    #' Convert AdsCreditDiscountsResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdsCreditDiscountsResponseObject <- list()
      if (!is.null(self$`active`)) {
        AdsCreditDiscountsResponseObject[["active"]] <-
          self$`active`
      }
      if (!is.null(self$`advertiser_id`)) {
        AdsCreditDiscountsResponseObject[["advertiser_id"]] <-
          self$`advertiser_id`
      }
      if (!is.null(self$`discountCurrency`)) {
        AdsCreditDiscountsResponseObject[["discountCurrency"]] <-
          self$`discountCurrency`
      }
      if (!is.null(self$`discountInMicroCurrency`)) {
        AdsCreditDiscountsResponseObject[["discountInMicroCurrency"]] <-
          self$`discountInMicroCurrency`
      }
      if (!is.null(self$`discountType`)) {
        AdsCreditDiscountsResponseObject[["discountType"]] <-
          self$`discountType`
      }
      if (!is.null(self$`remainingDiscountInMicroCurrency`)) {
        AdsCreditDiscountsResponseObject[["remainingDiscountInMicroCurrency"]] <-
          self$`remainingDiscountInMicroCurrency`
      }
      if (!is.null(self$`title`)) {
        AdsCreditDiscountsResponseObject[["title"]] <-
          self$`title`
      }
      return(AdsCreditDiscountsResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditDiscountsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditDiscountsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`active`)) {
        self$`active` <- this_object$`active`
      }
      if (!is.null(this_object$`advertiser_id`)) {
        self$`advertiser_id` <- this_object$`advertiser_id`
      }
      if (!is.null(this_object$`discountCurrency`)) {
        self$`discountCurrency` <- this_object$`discountCurrency`
      }
      if (!is.null(this_object$`discountInMicroCurrency`)) {
        self$`discountInMicroCurrency` <- this_object$`discountInMicroCurrency`
      }
      if (!is.null(this_object$`discountType`)) {
        if (!is.null(this_object$`discountType`) && !(this_object$`discountType` %in% c("COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND"))) {
          stop(paste("Error! \"", this_object$`discountType`, "\" cannot be assigned to `discountType`. Must be \"COUPON\", \"CREDIT\", \"COUPON_APPLIED\", \"CREDIT_APPLIED\", \"MARKETING_OFFER_CREDIT\", \"MARKETING_OFFER_CREDIT_APPLIED\", \"GOODWILL_CREDIT\", \"GOODWILL_CREDIT_APPLIED\", \"INTERNAL_CREDIT\", \"INTERNAL_CREDIT_APPLIED\", \"PREPAID_CREDIT\", \"PREPAID_CREDIT_APPLIED\", \"SALES_INCENTIVE_CREDIT\", \"SALES_INCENTIVE_CREDIT_APPLIED\", \"CREDIT_EXPIRED\", \"FUTURE_CREDIT\", \"REFERRAL_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED\", \"PREPAID_CREDIT_REFUND\".", sep = ""))
        }
        self$`discountType` <- this_object$`discountType`
      }
      if (!is.null(this_object$`remainingDiscountInMicroCurrency`)) {
        self$`remainingDiscountInMicroCurrency` <- this_object$`remainingDiscountInMicroCurrency`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdsCreditDiscountsResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditDiscountsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditDiscountsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`active` <- this_object$`active`
      self$`advertiser_id` <- this_object$`advertiser_id`
      self$`discountCurrency` <- this_object$`discountCurrency`
      self$`discountInMicroCurrency` <- this_object$`discountInMicroCurrency`
      if (!is.null(this_object$`discountType`) && !(this_object$`discountType` %in% c("COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND"))) {
        stop(paste("Error! \"", this_object$`discountType`, "\" cannot be assigned to `discountType`. Must be \"COUPON\", \"CREDIT\", \"COUPON_APPLIED\", \"CREDIT_APPLIED\", \"MARKETING_OFFER_CREDIT\", \"MARKETING_OFFER_CREDIT_APPLIED\", \"GOODWILL_CREDIT\", \"GOODWILL_CREDIT_APPLIED\", \"INTERNAL_CREDIT\", \"INTERNAL_CREDIT_APPLIED\", \"PREPAID_CREDIT\", \"PREPAID_CREDIT_APPLIED\", \"SALES_INCENTIVE_CREDIT\", \"SALES_INCENTIVE_CREDIT_APPLIED\", \"CREDIT_EXPIRED\", \"FUTURE_CREDIT\", \"REFERRAL_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT\", \"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED\", \"PREPAID_CREDIT_REFUND\".", sep = ""))
      }
      self$`discountType` <- this_object$`discountType`
      self$`remainingDiscountInMicroCurrency` <- this_object$`remainingDiscountInMicroCurrency`
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsCreditDiscountsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsCreditDiscountsResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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
# AdsCreditDiscountsResponse$unlock()
#
## Below is an example to define the print function
# AdsCreditDiscountsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsCreditDiscountsResponse$lock()

