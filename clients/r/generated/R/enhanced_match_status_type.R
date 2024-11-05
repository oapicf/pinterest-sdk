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

    #' @description
    #' Initialize a new EnhancedMatchStatusType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_EnhancedMatchStatusType()

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
        warning("Initializing EnhancedMatchStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize EnhancedMatchStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return EnhancedMatchStatusType in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of EnhancedMatchStatusType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of EnhancedMatchStatusType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return EnhancedMatchStatusType in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of EnhancedMatchStatusType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of EnhancedMatchStatusType
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

