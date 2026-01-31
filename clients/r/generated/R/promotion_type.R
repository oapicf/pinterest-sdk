#' @docType class
#' @title PromotionType
#' @description PromotionType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromotionType <- R6::R6Class(
  "PromotionType",
  public = list(

    #' @description
    #' Initialize a new PromotionType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_PromotionType()

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
        warning("Initializing PromotionType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize PromotionType, this may already be overwritten by an enum loaded from a JSON config.")
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
    #' Convert PromotionType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of PromotionType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of PromotionType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PromotionType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PromotionType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of PromotionType
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
.parse_PromotionType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[VARIABLE, SITEWIDE, CHECKOUT, SAVE_X_ON_Y, BUY_X_GET_Y, SPEND_X_SAVE_Y, FREE_SHIPPING, FREE_SHIPPING_MINIMUM, FREE_SHIPPING_WITH_DISCOUNT, SITEWIDE_IN_STORES, EXTRA_PERCENT_OFF, GIFT_WITH_PURCHASE, GIFT_WITH_PURCHASE_MINIMUM, FIXED, PERCENT_OFF_CLEARANCE, X_OFF_Y, GIFT_WITH_FIRST_PURCHASE, BUY_X_GET_ONE_FREE, CASH_BACK, POINTS_ON_ALL_PURCHASES, BONUS, POINTS_WITH_PURCHASE, CUSTOM]")
  unlist(strsplit(res, ", "))
}

