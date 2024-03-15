#' @docType class
#' @title ConversionReportTimeType
#' @description ConversionReportTimeType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionReportTimeType <- R6::R6Class(
  "ConversionReportTimeType",
  public = list(
    #' Initialize a new ConversionReportTimeType class.
    #'
    #' @description
    #' Initialize a new ConversionReportTimeType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ConversionReportTimeType()

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
    #' @return ConversionReportTimeType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ConversionReportTimeType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionReportTimeType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionReportTimeType
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
    #' @return ConversionReportTimeType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ConversionReportTimeType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionReportTimeType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionReportTimeType
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
.parse_ConversionReportTimeType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[TIME_OF_AD_ACTION, TIME_OF_CONVERSION]")
  unlist(strsplit(res, ", "))
}

