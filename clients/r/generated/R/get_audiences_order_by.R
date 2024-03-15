#' @docType class
#' @title GetAudiencesOrderBy
#' @description GetAudiencesOrderBy Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetAudiencesOrderBy <- R6::R6Class(
  "GetAudiencesOrderBy",
  public = list(
    #' Initialize a new GetAudiencesOrderBy class.
    #'
    #' @description
    #' Initialize a new GetAudiencesOrderBy class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_GetAudiencesOrderBy()

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
    #' @return GetAudiencesOrderBy in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of GetAudiencesOrderBy
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetAudiencesOrderBy
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetAudiencesOrderBy
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
    #' @return GetAudiencesOrderBy in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of GetAudiencesOrderBy
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetAudiencesOrderBy
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetAudiencesOrderBy
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
.parse_GetAudiencesOrderBy <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[NONE, ID, SIZE, CREATION_DATE, UPDATED_TIME, NAME, STATUS, TYPE]")
  unlist(strsplit(res, ", "))
}

