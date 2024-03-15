#' @docType class
#' @title BatchOperationStatus
#' @description BatchOperationStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchOperationStatus <- R6::R6Class(
  "BatchOperationStatus",
  public = list(
    #' Initialize a new BatchOperationStatus class.
    #'
    #' @description
    #' Initialize a new BatchOperationStatus class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_BatchOperationStatus()

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
    #' @return BatchOperationStatus in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of BatchOperationStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of BatchOperationStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchOperationStatus
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
    #' @return BatchOperationStatus in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of BatchOperationStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of BatchOperationStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchOperationStatus
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
.parse_BatchOperationStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PROCESSING, COMPLETED]")
  unlist(strsplit(res, ", "))
}

