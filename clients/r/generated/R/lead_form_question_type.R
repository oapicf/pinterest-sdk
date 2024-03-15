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
    #' Initialize a new LeadFormQuestionType class.
    #'
    #' @description
    #' Initialize a new LeadFormQuestionType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_LeadFormQuestionType()

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
    #' @return LeadFormQuestionType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of LeadFormQuestionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormQuestionType
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
    #' @return LeadFormQuestionType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of LeadFormQuestionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormQuestionType
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
.parse_LeadFormQuestionType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CUSTOM, FULL_NAME, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, ZIP_CODE, AGE, GENDER, CITY, COUNTRY, PREFERRED_CONTACT_METHOD, STATE_PROVINCE, ADDRESS, DATE_OF_BIRTH]")
  unlist(strsplit(res, ", "))
}

