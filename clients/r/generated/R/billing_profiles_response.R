#' Create a new BillingProfilesResponse
#'
#' @description
#' BillingProfilesResponse Class
#'
#' @docType class
#' @title BillingProfilesResponse
#' @description BillingProfilesResponse Class
#' @format An \code{R6Class} generator object
#' @field advertiser_id Advertiser ID of the billing. character [optional]
#' @field billing_type Billing type of the advertiser \link{BillingType} [optional]
#' @field card_type Type of the card. \link{BillingProfileCardType} [optional]
#' @field id Billing ID. character [optional]
#' @field payment_method_brand Brand of the payment method. \link{BillingProfilePaymentMethodBrand} [optional]
#' @field status Status of the billing. \link{BillingProfileStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BillingProfilesResponse <- R6::R6Class(
  "BillingProfilesResponse",
  public = list(
    `advertiser_id` = NULL,
    `billing_type` = NULL,
    `card_type` = NULL,
    `id` = NULL,
    `payment_method_brand` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new BillingProfilesResponse class.
    #'
    #' @param advertiser_id Advertiser ID of the billing.
    #' @param billing_type Billing type of the advertiser
    #' @param card_type Type of the card.
    #' @param id Billing ID.
    #' @param payment_method_brand Brand of the payment method.
    #' @param status Status of the billing.
    #' @param ... Other optional arguments.
    initialize = function(`advertiser_id` = NULL, `billing_type` = NULL, `card_type` = NULL, `id` = NULL, `payment_method_brand` = NULL, `status` = NULL, ...) {
      if (!is.null(`advertiser_id`)) {
        if (!(is.character(`advertiser_id`) && length(`advertiser_id`) == 1)) {
          stop(paste("Error! Invalid data for `advertiser_id`. Must be a string:", `advertiser_id`))
        }
        self$`advertiser_id` <- `advertiser_id`
      }
      if (!is.null(`billing_type`)) {
        if (!(`billing_type` %in% c())) {
          stop(paste("Error! \"", `billing_type`, "\" cannot be assigned to `billing_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`billing_type`))
        self$`billing_type` <- `billing_type`
      }
      if (!is.null(`card_type`)) {
        if (!(`card_type` %in% c())) {
          stop(paste("Error! \"", `card_type`, "\" cannot be assigned to `card_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`card_type`))
        self$`card_type` <- `card_type`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`payment_method_brand`)) {
        if (!(`payment_method_brand` %in% c())) {
          stop(paste("Error! \"", `payment_method_brand`, "\" cannot be assigned to `payment_method_brand`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`payment_method_brand`))
        self$`payment_method_brand` <- `payment_method_brand`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
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
    #' @return BillingProfilesResponse as a base R list.
    #' @examples
    #' # convert array of BillingProfilesResponse (x) to a data frame
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
    #' Convert BillingProfilesResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BillingProfilesResponseObject <- list()
      if (!is.null(self$`advertiser_id`)) {
        BillingProfilesResponseObject[["advertiser_id"]] <-
          self$`advertiser_id`
      }
      if (!is.null(self$`billing_type`)) {
        BillingProfilesResponseObject[["billing_type"]] <-
          self$extractSimpleType(self$`billing_type`)
      }
      if (!is.null(self$`card_type`)) {
        BillingProfilesResponseObject[["card_type"]] <-
          self$extractSimpleType(self$`card_type`)
      }
      if (!is.null(self$`id`)) {
        BillingProfilesResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`payment_method_brand`)) {
        BillingProfilesResponseObject[["payment_method_brand"]] <-
          self$extractSimpleType(self$`payment_method_brand`)
      }
      if (!is.null(self$`status`)) {
        BillingProfilesResponseObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      return(BillingProfilesResponseObject)
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
    #' Deserialize JSON string into an instance of BillingProfilesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BillingProfilesResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`advertiser_id`)) {
        self$`advertiser_id` <- this_object$`advertiser_id`
      }
      if (!is.null(this_object$`billing_type`)) {
        `billing_type_object` <- BillingType$new()
        `billing_type_object`$fromJSON(jsonlite::toJSON(this_object$`billing_type`, auto_unbox = TRUE, digits = NA))
        self$`billing_type` <- `billing_type_object`
      }
      if (!is.null(this_object$`card_type`)) {
        `card_type_object` <- BillingProfileCardType$new()
        `card_type_object`$fromJSON(jsonlite::toJSON(this_object$`card_type`, auto_unbox = TRUE, digits = NA))
        self$`card_type` <- `card_type_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`payment_method_brand`)) {
        `payment_method_brand_object` <- BillingProfilePaymentMethodBrand$new()
        `payment_method_brand_object`$fromJSON(jsonlite::toJSON(this_object$`payment_method_brand`, auto_unbox = TRUE, digits = NA))
        self$`payment_method_brand` <- `payment_method_brand_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- BillingProfileStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BillingProfilesResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BillingProfilesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BillingProfilesResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`advertiser_id` <- this_object$`advertiser_id`
      self$`billing_type` <- BillingType$new()$fromJSON(jsonlite::toJSON(this_object$`billing_type`, auto_unbox = TRUE, digits = NA))
      self$`card_type` <- BillingProfileCardType$new()$fromJSON(jsonlite::toJSON(this_object$`card_type`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`payment_method_brand` <- BillingProfilePaymentMethodBrand$new()$fromJSON(jsonlite::toJSON(this_object$`payment_method_brand`, auto_unbox = TRUE, digits = NA))
      self$`status` <- BillingProfileStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
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
      if (!str_detect(self$`advertiser_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
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

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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

