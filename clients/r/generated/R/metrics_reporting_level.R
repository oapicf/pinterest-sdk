#' @docType class
#' @title MetricsReportingLevel
#' @description MetricsReportingLevel Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MetricsReportingLevel <- R6::R6Class(
  "MetricsReportingLevel",
  public = list(

    #' @description
    #' Initialize a new MetricsReportingLevel class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_MetricsReportingLevel()

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
    #' Convert MetricsReportingLevel to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of MetricsReportingLevel
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of MetricsReportingLevel
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MetricsReportingLevel in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MetricsReportingLevel
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of MetricsReportingLevel
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
.parse_MetricsReportingLevel <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ADVERTISER, ADVERTISER_TARGETING, CAMPAIGN, CAMPAIGN_TARGETING, AD_GROUP, AD_GROUP_TARGETING, PIN_PROMOTION, PIN_PROMOTION_TARGETING, KEYWORD, PRODUCT_GROUP, PRODUCT_GROUP_TARGETING, PRODUCT_ITEM, PRODUCT_ITEM_TARGETING]")
  unlist(strsplit(res, ", "))
}

