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

    #' @description
    #' Initialize a new ObjectiveType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ObjectiveType()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
        warning("Initializing ObjectiveType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ObjectiveType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return ObjectiveType in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of ObjectiveType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ObjectiveType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ObjectiveType in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of ObjectiveType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ObjectiveType
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
  res <- gsub("^\\[|\\]$", "", "[AWARENESS, CONSIDERATION, VIDEO_VIEW, WEB_CONVERSION, CATALOG_SALES, WEB_SESSIONS, VIDEO_COMPLETION]")
  unlist(strsplit(res, ", "))
}

