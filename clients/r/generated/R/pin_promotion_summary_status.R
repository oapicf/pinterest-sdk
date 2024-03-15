#' @docType class
#' @title PinPromotionSummaryStatus
#' @description PinPromotionSummaryStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinPromotionSummaryStatus <- R6::R6Class(
  "PinPromotionSummaryStatus",
  public = list(
    #' Initialize a new PinPromotionSummaryStatus class.
    #'
    #' @description
    #' Initialize a new PinPromotionSummaryStatus class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_PinPromotionSummaryStatus()

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
    #' @return PinPromotionSummaryStatus in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of PinPromotionSummaryStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinPromotionSummaryStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinPromotionSummaryStatus
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
    #' @return PinPromotionSummaryStatus in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of PinPromotionSummaryStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinPromotionSummaryStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinPromotionSummaryStatus
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
.parse_PinPromotionSummaryStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[APPROVED, PAUSED, PENDING, REJECTED, ADVERTISER_DISABLED, ARCHIVED, DRAFT, DELETED_DRAFT]")
  unlist(strsplit(res, ", "))
}

