#' @docType class
#' @title AdsAnalyticsFilterOperator
#' @description AdsAnalyticsFilterOperator Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsFilterOperator <- R6::R6Class(
  "AdsAnalyticsFilterOperator",
  public = list(
    #' Initialize a new AdsAnalyticsFilterOperator class.
    #'
    #' @description
    #' Initialize a new AdsAnalyticsFilterOperator class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdsAnalyticsFilterOperator()

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
    #' @return AdsAnalyticsFilterOperator in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterOperator
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterOperator
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsFilterOperator
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
    #' @return AdsAnalyticsFilterOperator in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterOperator
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsFilterOperator
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsFilterOperator
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
.parse_AdsAnalyticsFilterOperator <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[LESS_THAN, GREATER_THAN]")
  unlist(strsplit(res, ", "))
}

