#' @docType class
#' @title MediaUploadStatus
#' @description MediaUploadStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MediaUploadStatus <- R6::R6Class(
  "MediaUploadStatus",
  public = list(
    #' Initialize a new MediaUploadStatus class.
    #'
    #' @description
    #' Initialize a new MediaUploadStatus class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_MediaUploadStatus()

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
    #' @return MediaUploadStatus in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of MediaUploadStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUploadStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadStatus
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
    #' @return MediaUploadStatus in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of MediaUploadStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of MediaUploadStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadStatus
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
.parse_MediaUploadStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[registered, processing, succeeded, failed]")
  unlist(strsplit(res, ", "))
}

