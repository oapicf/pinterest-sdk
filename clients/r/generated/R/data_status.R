#' @docType class
#' @title DataStatus
#' @description DataStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DataStatus <- R6::R6Class(
  "DataStatus",
  public = list(

    #' @description
    #' Initialize a new DataStatus class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_DataStatus()

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
        warning("Initializing DataStatus with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize DataStatus, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return DataStatus in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of DataStatus
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of DataStatus
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DataStatus in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of DataStatus
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of DataStatus
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
.parse_DataStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PROCESSING, READY, ESTIMATE, BEFORE_BUSINESS_CREATED, BEFORE_DATA_RETENTION_PERIOD, BEFORE_PIN_DATA_RETENTION_PERIOD, BEFORE_METRIC_START_DATE, BEFORE_CORE_METRIC_START_DATE, BEFORE_PIN_FORMAT_METRIC_START_DATE, BEFORE_AUDIENCE_METRIC_START_DATE, BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE, BEFORE_VIDEO_METRIC_START_DATE, BEFORE_CONVERSION_METRIC_START_DATE, PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD, IN_BAD_TAG_DATE, BEFORE_PUBLISHED_METRIC_START_DATE, BEFORE_ASSIST_METRIC_START_DATE, BEFORE_PIN_CREATED, BEFORE_ACCOUNT_CLAIMED, BEFORE_DEMOGRAPHIC_FILTERS_START_DATE, AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD, AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD, BEFORE_PRODUCT_GROUP_FILTER_START_DATE]")
  unlist(strsplit(res, ", "))
}

