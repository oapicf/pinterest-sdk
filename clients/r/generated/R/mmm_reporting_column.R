#' @docType class
#' @title MMMReportingColumn
#' @description MMMReportingColumn Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MMMReportingColumn <- R6::R6Class(
  "MMMReportingColumn",
  public = list(

    #' @description
    #' Initialize a new MMMReportingColumn class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_MMMReportingColumn()

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
    #' Convert MMMReportingColumn to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of MMMReportingColumn
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of MMMReportingColumn
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MMMReportingColumn in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MMMReportingColumn
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of MMMReportingColumn
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
.parse_MMMReportingColumn <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, ECTR, CAMPAIGN_NAME, TOTAL_ENGAGEMENT, EENGAGEMENT_RATE, ECPM_IN_DOLLAR, CAMPAIGN_ID, ADVERTISER_ID, AD_GROUP_ID, AD_GROUP_NAME, CLICKTHROUGH_1, IMPRESSION_1, CLICKTHROUGH_2, IMPRESSION_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, ADVERTISER_NAME, SPEND_ORDER_LINE_PAID_TYPE, CAMPAIGN_OBJECTIVE_TYPE, PINNER_LIST_NAME, ADS_CREDIT_SPEND_IN_DOLLAR, ADVERTISER_PAID_SPEND_IN_DOLLAR, ADVERTISER_PAID_ECPC_IN_DOLLAR, ADVERTISER_PAID_ECPM_IN_DOLLAR]")
  unlist(strsplit(res, ", "))
}

