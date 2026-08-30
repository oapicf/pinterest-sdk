#' @docType class
#' @title MultiPinsAnalyticsMetricTypesItem
#' @description MultiPinsAnalyticsMetricTypesItem Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MultiPinsAnalyticsMetricTypesItem <- R6::R6Class(
  "MultiPinsAnalyticsMetricTypesItem",
  public = list(

    #' @description
    #' Initialize a new MultiPinsAnalyticsMetricTypesItem class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_MultiPinsAnalyticsMetricTypesItem()

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
    #' Convert MultiPinsAnalyticsMetricTypesItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of MultiPinsAnalyticsMetricTypesItem
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of MultiPinsAnalyticsMetricTypesItem
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MultiPinsAnalyticsMetricTypesItem in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MultiPinsAnalyticsMetricTypesItem
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of MultiPinsAnalyticsMetricTypesItem
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
.parse_MultiPinsAnalyticsMetricTypesItem <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE, SAVE_RATE, TOTAL_COMMENTS, TOTAL_REACTIONS, USER_FOLLOW, PROFILE_VISIT, VIDEO_MRC_VIEW, VIDEO_10S_VIEW, QUARTILE_95_PERCENT_VIEW, VIDEO_V50_WATCH_TIME, VIDEO_START, VIDEO_AVG_WATCH_TIME]")
  unlist(strsplit(res, ", "))
}

