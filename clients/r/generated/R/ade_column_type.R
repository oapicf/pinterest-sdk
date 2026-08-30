#' @docType class
#' @title AdeColumnType
#' @description AdeColumnType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdeColumnType <- R6::R6Class(
  "AdeColumnType",
  public = list(

    #' @description
    #' Initialize a new AdeColumnType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdeColumnType()

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
    #' Convert AdeColumnType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdeColumnType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdeColumnType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdeColumnType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdeColumnType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdeColumnType
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
.parse_AdeColumnType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ADE_COST_PER_ACTION, ADE_ROAS, ADE_TOTAL_CONVERSIONS, ADE_TOTAL_VALUE_IN_MICRO_DOLLAR, ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_CLICK, ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_VIEW, ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_CONVERSION_RATE, ADE_WEB_COST_PER_ACTION, ADE_WEB_ROAS, ADE_TOTAL_WEB_CONVERSIONS, ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_WEB_CLICK, ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_WEB_VIEW, ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR, ADE_INAPP_COST_PER_ACTION, ADE_INAPP_ROAS, ADE_TOTAL_INAPP_CONVERSIONS, ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_INAPP_CLICK, ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_INAPP_VIEW, ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR, ADE_OFFLINE_COST_PER_ACTION, ADE_OFFLINE_ROAS, ADE_TOTAL_OFFLINE_CONVERSIONS, ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_OFFLINE_CLICK, ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_OFFLINE_VIEW, ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR, ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY, ADE_TOTAL_CONVERSION_PRODUCT_VALUE, ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS, ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD, ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD, ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY, ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE, ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS, ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD, ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD, ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY, ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE, ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS, ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD, ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD, ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY, ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE, ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS, ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD, ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD]")
  unlist(strsplit(res, ", "))
}

