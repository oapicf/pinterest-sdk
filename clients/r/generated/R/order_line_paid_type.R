#' @docType class
#' @title OrderLinePaidType
#' @description OrderLinePaidType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLinePaidType <- R6::R6Class(
  "OrderLinePaidType",
  public = list(
    #' Initialize a new OrderLinePaidType class.
    #'
    #' @description
    #' Initialize a new OrderLinePaidType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderLinePaidType()

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
    #' @return OrderLinePaidType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderLinePaidType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLinePaidType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLinePaidType
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
    #' @return OrderLinePaidType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderLinePaidType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLinePaidType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLinePaidType
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
.parse_OrderLinePaidType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PAID, BONUS, MAKE_GOOD, TEST, null]")
  unlist(strsplit(res, ", "))
}

