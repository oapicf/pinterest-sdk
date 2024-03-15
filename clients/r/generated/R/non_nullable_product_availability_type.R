#' @docType class
#' @title NonNullableProductAvailabilityType
#' @description NonNullableProductAvailabilityType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NonNullableProductAvailabilityType <- R6::R6Class(
  "NonNullableProductAvailabilityType",
  public = list(
    #' Initialize a new NonNullableProductAvailabilityType class.
    #'
    #' @description
    #' Initialize a new NonNullableProductAvailabilityType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_NonNullableProductAvailabilityType()

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
    #' @return NonNullableProductAvailabilityType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of NonNullableProductAvailabilityType
    #'
    #' @description
    #' Deserialize JSON string into an instance of NonNullableProductAvailabilityType
    #'
    #' @param input_json the JSON input
    #' @return the instance of NonNullableProductAvailabilityType
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
    #' @return NonNullableProductAvailabilityType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of NonNullableProductAvailabilityType
    #'
    #' @description
    #' Deserialize JSON string into an instance of NonNullableProductAvailabilityType
    #'
    #' @param input_json the JSON input
    #' @return the instance of NonNullableProductAvailabilityType
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
.parse_NonNullableProductAvailabilityType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[IN_STOCK, OUT_OF_STOCK, PREORDER]")
  unlist(strsplit(res, ", "))
}

