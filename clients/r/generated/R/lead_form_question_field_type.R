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
    #' Initialize a new LeadFormQuestionFieldType class.
    #'
    #' @description
    #' Initialize a new LeadFormQuestionFieldType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_LeadFormQuestionFieldType()

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
    #' @return LeadFormQuestionFieldType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of LeadFormQuestionFieldType
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionFieldType
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormQuestionFieldType
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
    #' @return LeadFormQuestionFieldType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of LeadFormQuestionFieldType
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormQuestionFieldType
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormQuestionFieldType
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
.parse_LeadFormQuestionFieldType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[TEXT_FIELD, TEXT_AREA, RADIO_LIST, CHECKBOX, null]")
  unlist(strsplit(res, ", "))
}

