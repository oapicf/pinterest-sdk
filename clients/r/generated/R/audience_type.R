#' @docType class
#' @title AudienceType
#' @description AudienceType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceType <- R6::R6Class(
  "AudienceType",
  public = list(
    #' Initialize a new AudienceType class.
    #'
    #' @description
    #' Initialize a new AudienceType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AudienceType()

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
    #' @return AudienceType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AudienceType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceType
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
    #' @return AudienceType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AudienceType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceType
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
.parse_AudienceType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CUSTOMER_LIST, VISITOR, ENGAGEMENT, ACTALIKE, PERSONA]")
  unlist(strsplit(res, ", "))
}

