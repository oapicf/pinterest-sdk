#' @docType class
#' @title CatalogsFormat
#' @description CatalogsFormat Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFormat <- R6::R6Class(
  "CatalogsFormat",
  public = list(
    #' Initialize a new CatalogsFormat class.
    #'
    #' @description
    #' Initialize a new CatalogsFormat class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CatalogsFormat()

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
    #' @return CatalogsFormat in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of CatalogsFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFormat
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
    #' @return CatalogsFormat in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of CatalogsFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFormat
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
.parse_CatalogsFormat <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[TSV, CSV, XML]")
  unlist(strsplit(res, ", "))
}

