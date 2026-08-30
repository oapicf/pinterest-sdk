#' @docType class
#' @title AdDisapprovalReasons
#' @description AdDisapprovalReasons Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdDisapprovalReasons <- R6::R6Class(
  "AdDisapprovalReasons",
  public = list(

    #' @description
    #' Initialize a new AdDisapprovalReasons class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdDisapprovalReasons()

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
    #' Convert AdDisapprovalReasons to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdDisapprovalReasons
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdDisapprovalReasons
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdDisapprovalReasons in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdDisapprovalReasons
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdDisapprovalReasons
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
.parse_AdDisapprovalReasons <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[HASHTAGS, PROMOTIONS_AND_PRICES, TARGETING, LANDING_PAGE, CAPS_AND_SYMBOLS, SHOCKING, WEIGHT_LOSS, PROHIBITED_PRODUCT, AUTHENTICITY, NUDITY, CONFUSING_DESIGN, URGENCY, RATINGS, APP, ALCOHOL, CONTESTS, POLITICAL, OTHER, IMAGE, NAR, INCONSISTENT, CLICKBAIT, NO_DESCRIPTION, LOW_QUALITY, EXAGGERATED_CLAIMS, PINTEREST_BRAND, ALCOHOL_NO_SALE, LANDING_PAGE_SPEED, LANDING_PAGE_HARDWALL, LANDING_PAGE_BROKEN, LANDING_PAGE_QUALITY, OUT_OF_STOCK, IMAGE_LOW_QUALITY, IMAGE_BUSY, IMAGE_POORLY_EDITED, IMAGE_BEFORE_AFTER, UGC, FAKE_BUTTONS, WEAPONS, SENSITIVE, UNACCEPTABLE_BUSINESS, SUSPICIOUS_CLAIMS, PHARMA, SUSPICIOUS_SUPPLEMENTS, ILLEGAL_RECREATIONAL_DRUG, LOW_QUALITY_LANDING_PAGE, RESTRICTED_HEALTHCARE, INCONSISTENT_LANG_FR]")
  unlist(strsplit(res, ", "))
}

