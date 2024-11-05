#' @docType class
#' @title AdsAnalyticsFilterColumn
#' @description AdsAnalyticsFilterColumn Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsFilterColumn <- R6::R6Class(
  "AdsAnalyticsFilterColumn",
  public = list(

    #' @description
    #' Initialize a new AdsAnalyticsFilterColumn class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdsAnalyticsFilterColumn()

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
        warning("Initializing AdsAnalyticsFilterColumn with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize AdsAnalyticsFilterColumn, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsFilterColumn in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterColumn
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdsAnalyticsFilterColumn
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsFilterColumn in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterColumn
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdsAnalyticsFilterColumn
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
.parse_AdsAnalyticsFilterColumn <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[SPEND_IN_DOLLAR, TOTAL_IMPRESSION]")
  unlist(strsplit(res, ", "))
}

