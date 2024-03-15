#' @docType class
#' @title PacingDeliveryType
#' @description PacingDeliveryType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PacingDeliveryType <- R6::R6Class(
  "PacingDeliveryType",
  public = list(
    #' Initialize a new PacingDeliveryType class.
    #'
    #' @description
    #' Initialize a new PacingDeliveryType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_PacingDeliveryType()

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
    #' @return PacingDeliveryType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of PacingDeliveryType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PacingDeliveryType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PacingDeliveryType
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
    #' @return PacingDeliveryType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of PacingDeliveryType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PacingDeliveryType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PacingDeliveryType
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
.parse_PacingDeliveryType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[STANDARD, ACCELERATED]")
  unlist(strsplit(res, ", "))
}

