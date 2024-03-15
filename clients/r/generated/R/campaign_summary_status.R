#' @docType class
#' @title CampaignSummaryStatus
#' @description CampaignSummaryStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignSummaryStatus <- R6::R6Class(
  "CampaignSummaryStatus",
  public = list(
    #' Initialize a new CampaignSummaryStatus class.
    #'
    #' @description
    #' Initialize a new CampaignSummaryStatus class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CampaignSummaryStatus()

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
    #' @return CampaignSummaryStatus in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of CampaignSummaryStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSummaryStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSummaryStatus
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
    #' @return CampaignSummaryStatus in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of CampaignSummaryStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSummaryStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSummaryStatus
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
.parse_CampaignSummaryStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[RUNNING, PAUSED, NOT_STARTED, COMPLETED, ADVERTISER_DISABLED, ARCHIVED, DRAFT, DELETED_DRAFT]")
  unlist(strsplit(res, ", "))
}

