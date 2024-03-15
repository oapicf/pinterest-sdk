#' @docType class
#' @title Currency
#' @description Currency Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Currency <- R6::R6Class(
  "Currency",
  public = list(
    #' Initialize a new Currency class.
    #'
    #' @description
    #' Initialize a new Currency class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_Currency()

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
    #' @return Currency in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of Currency
    #'
    #' @description
    #' Deserialize JSON string into an instance of Currency
    #'
    #' @param input_json the JSON input
    #' @return the instance of Currency
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
    #' @return Currency in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of Currency
    #'
    #' @description
    #' Deserialize JSON string into an instance of Currency
    #'
    #' @param input_json the JSON input
    #' @return the instance of Currency
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
.parse_Currency <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[UNK, USD, GBP, CAD, EUR, AUD, NZD, SEK, ILS, CHF, HKD, JPY, SGD, KRW, NOK, DKK, PLN, RON, HUF, CZK, BRL, MXN, ARS, CLP, COP]")
  unlist(strsplit(res, ", "))
}

