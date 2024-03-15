#' @docType class
#' @title MatchType
#' @description MatchType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MatchType <- R6::R6Class(
  "MatchType",
  public = list(
    #' Initialize a new MatchType class.
    #'
    #' @description
    #' Initialize a new MatchType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_MatchType()

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
    #' @return MatchType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of MatchType
    #'
    #' @description
    #' Deserialize JSON string into an instance of MatchType
    #'
    #' @param input_json the JSON input
    #' @return the instance of MatchType
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
    #' @return MatchType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of MatchType
    #'
    #' @description
    #' Deserialize JSON string into an instance of MatchType
    #'
    #' @param input_json the JSON input
    #' @return the instance of MatchType
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
.parse_MatchType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[BROAD, PHRASE, EXACT, EXACT_NEGATIVE, PHRASE_NEGATIVE]")
  unlist(strsplit(res, ", "))
}

