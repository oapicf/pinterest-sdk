#' @docType class
#' @title GridClickType
#' @description GridClickType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GridClickType <- R6::R6Class(
  "GridClickType",
  public = list(
    #' Initialize a new GridClickType class.
    #'
    #' @description
    #' Initialize a new GridClickType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_GridClickType()

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
    #' @return GridClickType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of GridClickType
    #'
    #' @description
    #' Deserialize JSON string into an instance of GridClickType
    #'
    #' @param input_json the JSON input
    #' @return the instance of GridClickType
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
    #' @return GridClickType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of GridClickType
    #'
    #' @description
    #' Deserialize JSON string into an instance of GridClickType
    #'
    #' @param input_json the JSON input
    #' @return the instance of GridClickType
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
.parse_GridClickType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CLOSEUP, DIRECT_TO_DESTINATION]")
  unlist(strsplit(res, ", "))
}

