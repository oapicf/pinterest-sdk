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
    #' Initialize a new AdsAnalyticsFilterColumn class.
    #'
    #' @description
    #' Initialize a new AdsAnalyticsFilterColumn class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdsAnalyticsFilterColumn()

      stopifnot(length(val) == 1L)

      if (!val %in% enumvec)
          stop("Use one of the valid values: ",
              paste0(enumvec, collapse = ", "))
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsFilterColumn in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterColumn
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterColumn
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsFilterColumn
    #' @export
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsFilterColumn in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterColumn
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterColumn
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsFilterColumn
    #' @export
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

