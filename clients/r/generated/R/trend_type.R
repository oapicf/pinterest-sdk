#' @docType class
#' @title TrendType
#' @description TrendType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendType <- R6::R6Class(
  "TrendType",
  public = list(
    #' Initialize a new TrendType class.
    #'
    #' @description
    #' Initialize a new TrendType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_TrendType()

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
    #' @return TrendType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of TrendType
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendType
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendType
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
    #' @return TrendType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of TrendType
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendType
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendType
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
.parse_TrendType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[growing, monthly, yearly, seasonal]")
  unlist(strsplit(res, ", "))
}

