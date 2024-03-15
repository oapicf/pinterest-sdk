#' @docType class
#' @title ObjectiveType
#' @description ObjectiveType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ObjectiveType <- R6::R6Class(
  "ObjectiveType",
  public = list(
    #' Initialize a new ObjectiveType class.
    #'
    #' @description
    #' Initialize a new ObjectiveType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ObjectiveType()

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
    #' @return ObjectiveType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ObjectiveType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ObjectiveType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ObjectiveType
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
    #' @return ObjectiveType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ObjectiveType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ObjectiveType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ObjectiveType
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
.parse_ObjectiveType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[AWARENESS, CONSIDERATION, VIDEO_VIEW, WEB_CONVERSION, CATALOG_SALES, WEB_SESSIONS]")
  unlist(strsplit(res, ", "))
}

