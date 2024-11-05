#' @docType class
#' @title LeadFormQuestionType
#' @description LeadFormQuestionType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormQuestionType <- R6::R6Class(
  "LeadFormQuestionType",
  public = list(

    #' @description
    #' Initialize a new LeadFormQuestionType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_LeadFormQuestionType()

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
        warning("Initializing LeadFormQuestionType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize LeadFormQuestionType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormQuestionType in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of LeadFormQuestionType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormQuestionType in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of LeadFormQuestionType
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
.parse_LeadFormQuestionType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CUSTOM, FULL_NAME, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, ZIP_CODE, GENDER, CITY, COUNTRY, STATE_PROVINCE, ADDRESS, DATE_OF_BIRTH, AGE]")
  unlist(strsplit(res, ", "))
}

