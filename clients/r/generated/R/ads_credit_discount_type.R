#' @docType class
#' @title AdsCreditDiscountType
#' @description AdsCreditDiscountType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsCreditDiscountType <- R6::R6Class(
  "AdsCreditDiscountType",
  public = list(

    #' @description
    #' Initialize a new AdsCreditDiscountType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdsCreditDiscountType()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
      }
      private$value <- val
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AdsCreditDiscountType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditDiscountType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdsCreditDiscountType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdsCreditDiscountType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsCreditDiscountType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdsCreditDiscountType
    fromJSONString = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    }
  ),
  private = list(
    value = NULL
  )
)

# add to utils.R
.parse_AdsCreditDiscountType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[COUPON, CREDIT, COUPON_APPLIED, CREDIT_APPLIED, MARKETING_OFFER_CREDIT, MARKETING_OFFER_CREDIT_APPLIED, GOODWILL_CREDIT, GOODWILL_CREDIT_APPLIED, INTERNAL_CREDIT, INTERNAL_CREDIT_APPLIED, PREPAID_CREDIT, PREPAID_CREDIT_APPLIED, SALES_INCENTIVE_CREDIT, SALES_INCENTIVE_CREDIT_APPLIED, CREDIT_EXPIRED, FUTURE_CREDIT, REFERRAL_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT_APPLIED, PREPAID_CREDIT_REFUND, null]")
  unlist(strsplit(res, ", "))
}

