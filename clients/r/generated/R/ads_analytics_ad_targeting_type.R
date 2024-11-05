#' @docType class
#' @title AdsAnalyticsAdTargetingType
#' @description AdsAnalyticsAdTargetingType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsAdTargetingType <- R6::R6Class(
  "AdsAnalyticsAdTargetingType",
  public = list(

    #' @description
    #' Initialize a new AdsAnalyticsAdTargetingType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdsAnalyticsAdTargetingType()

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
        warning("Initializing AdsAnalyticsAdTargetingType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize AdsAnalyticsAdTargetingType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsAdTargetingType in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsAdTargetingType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdsAnalyticsAdTargetingType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsAdTargetingType in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsAdTargetingType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdsAnalyticsAdTargetingType
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
.parse_AdsAnalyticsAdTargetingType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[KEYWORD, APPTYPE, GENDER, LOCATION, PLACEMENT, COUNTRY, TARGETED_INTEREST, PINNER_INTEREST, AUDIENCE_INCLUDE, GEO, AGE_BUCKET, REGION, QUIZ_RESULT, AGE_BUCKET_AND_GENDER]")
  unlist(strsplit(res, ", "))
}

