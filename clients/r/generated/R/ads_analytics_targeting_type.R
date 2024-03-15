#' @docType class
#' @title AdsAnalyticsTargetingType
#' @description AdsAnalyticsTargetingType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsTargetingType <- R6::R6Class(
  "AdsAnalyticsTargetingType",
  public = list(
    #' Initialize a new AdsAnalyticsTargetingType class.
    #'
    #' @description
    #' Initialize a new AdsAnalyticsTargetingType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdsAnalyticsTargetingType()

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
    #' @return AdsAnalyticsTargetingType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsTargetingType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsTargetingType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsTargetingType
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
    #' @return AdsAnalyticsTargetingType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsTargetingType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsTargetingType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsTargetingType
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
.parse_AdsAnalyticsTargetingType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[KEYWORD, APPTYPE, GENDER, LOCATION, PLACEMENT, COUNTRY, TARGETED_INTEREST, PINNER_INTEREST, AUDIENCE_INCLUDE, GEO, AGE_BUCKET, REGION]")
  unlist(strsplit(res, ", "))
}

