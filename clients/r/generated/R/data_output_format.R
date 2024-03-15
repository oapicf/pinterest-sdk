#' @docType class
#' @title DataOutputFormat
#' @description DataOutputFormat Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DataOutputFormat <- R6::R6Class(
  "DataOutputFormat",
  public = list(
    #' Initialize a new DataOutputFormat class.
    #'
    #' @description
    #' Initialize a new DataOutputFormat class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_DataOutputFormat()

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
    #' @return DataOutputFormat in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of DataOutputFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of DataOutputFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of DataOutputFormat
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
    #' @return DataOutputFormat in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of DataOutputFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of DataOutputFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of DataOutputFormat
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
.parse_DataOutputFormat <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[JSON, CSV]")
  unlist(strsplit(res, ", "))
}

