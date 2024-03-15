#' @docType class
#' @title CatalogsFeedProcessingStatus
#' @description CatalogsFeedProcessingStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedProcessingStatus <- R6::R6Class(
  "CatalogsFeedProcessingStatus",
  public = list(
    #' Initialize a new CatalogsFeedProcessingStatus class.
    #'
    #' @description
    #' Initialize a new CatalogsFeedProcessingStatus class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CatalogsFeedProcessingStatus()

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
    #' @return CatalogsFeedProcessingStatus in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProcessingStatus
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
    #' @return CatalogsFeedProcessingStatus in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProcessingStatus
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
.parse_CatalogsFeedProcessingStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[COMPLETED, COMPLETED_EARLY, DISAPPROVED, FAILED, PROCESSING, QUEUED_FOR_PROCESSING, UNDER_APPEAL, UNDER_REVIEW]")
  unlist(strsplit(res, ", "))
}

