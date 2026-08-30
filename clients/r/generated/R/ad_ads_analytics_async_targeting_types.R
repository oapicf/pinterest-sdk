#' @docType class
#' @title AdAdsAnalyticsAsyncTargetingTypes
#' @description AdAdsAnalyticsAsyncTargetingTypes Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAdsAnalyticsAsyncTargetingTypes <- R6::R6Class(
  "AdAdsAnalyticsAsyncTargetingTypes",
  public = list(

    #' @description
    #' Initialize a new AdAdsAnalyticsAsyncTargetingTypes class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdAdsAnalyticsAsyncTargetingTypes()

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
    #' Convert AdAdsAnalyticsAsyncTargetingTypes to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAdsAnalyticsAsyncTargetingTypes
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdAdsAnalyticsAsyncTargetingTypes
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdAdsAnalyticsAsyncTargetingTypes in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAdsAnalyticsAsyncTargetingTypes
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdAdsAnalyticsAsyncTargetingTypes
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
.parse_AdAdsAnalyticsAsyncTargetingTypes <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[KEYWORD, APPTYPE, GENDER, LOCATION, PLACEMENT, COUNTRY, TARGETED_INTEREST, PINNER_INTEREST, AUDIENCE_INCLUDE, GEO, AGE_BUCKET, REGION, MEDIA_TYPE, AGE_BUCKET_AND_GENDER, AUDIENCE_MULTIPLIER, CREATIVE_ENHANCEMENTS, LOCAL_ADS_STORE_CODE]")
  unlist(strsplit(res, ", "))
}

