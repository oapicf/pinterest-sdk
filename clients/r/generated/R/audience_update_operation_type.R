#' @docType class
#' @title AudienceUpdateOperationType
#' @description AudienceUpdateOperationType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceUpdateOperationType <- R6::R6Class(
  "AudienceUpdateOperationType",
  public = list(
    #' Initialize a new AudienceUpdateOperationType class.
    #'
    #' @description
    #' Initialize a new AudienceUpdateOperationType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AudienceUpdateOperationType()

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
    #' @return AudienceUpdateOperationType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AudienceUpdateOperationType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceUpdateOperationType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceUpdateOperationType
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
    #' @return AudienceUpdateOperationType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AudienceUpdateOperationType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceUpdateOperationType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceUpdateOperationType
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
.parse_AudienceUpdateOperationType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[UPDATE, REMOVE]")
  unlist(strsplit(res, ", "))
}

