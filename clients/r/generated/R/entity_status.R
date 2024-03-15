#' @docType class
#' @title EntityStatus
#' @description EntityStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EntityStatus <- R6::R6Class(
  "EntityStatus",
  public = list(
    #' Initialize a new EntityStatus class.
    #'
    #' @description
    #' Initialize a new EntityStatus class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_EntityStatus()

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
    #' @return EntityStatus in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of EntityStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of EntityStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityStatus
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
    #' @return EntityStatus in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of EntityStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of EntityStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of EntityStatus
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
.parse_EntityStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT]")
  unlist(strsplit(res, ", "))
}

