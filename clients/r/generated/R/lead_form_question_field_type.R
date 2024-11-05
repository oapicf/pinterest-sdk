#' @docType class
#' @title LeadFormQuestionFieldType
#' @description LeadFormQuestionFieldType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormQuestionFieldType <- R6::R6Class(
  "LeadFormQuestionFieldType",
  public = list(

    #' @description
    #' Initialize a new LeadFormQuestionFieldType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_LeadFormQuestionFieldType()

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
        warning("Initializing LeadFormQuestionFieldType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize LeadFormQuestionFieldType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormQuestionFieldType in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionFieldType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of LeadFormQuestionFieldType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormQuestionFieldType in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionFieldType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of LeadFormQuestionFieldType
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
.parse_LeadFormQuestionFieldType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[TEXT_FIELD, TEXT_AREA, RADIO_LIST, CHECKBOX, null]")
  unlist(strsplit(res, ", "))
}

