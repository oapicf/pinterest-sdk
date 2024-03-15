#' @docType class
#' @title EnhancedMatchStatusType
#' @description EnhancedMatchStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EnhancedMatchStatusType <- R6::R6Class(
  "EnhancedMatchStatusType",
  public = list(
    #' Initialize a new EnhancedMatchStatusType class.
    #'
    #' @description
    #' Initialize a new EnhancedMatchStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_EnhancedMatchStatusType()

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
    #' @return EnhancedMatchStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of EnhancedMatchStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of EnhancedMatchStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of EnhancedMatchStatusType
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
    #' @return EnhancedMatchStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of EnhancedMatchStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of EnhancedMatchStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of EnhancedMatchStatusType
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
.parse_EnhancedMatchStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[UNKNOWN, NOT_VALIDATED, VALIDATING_IN_PROGRESS, VALIDATION_COMPLETE, null]")
  unlist(strsplit(res, ", "))
}

