#' @docType class
#' @title AudienceDataParty
#' @description AudienceDataParty Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceDataParty <- R6::R6Class(
  "AudienceDataParty",
  public = list(
    #' Initialize a new AudienceDataParty class.
    #'
    #' @description
    #' Initialize a new AudienceDataParty class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AudienceDataParty()

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
    #' @return AudienceDataParty in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AudienceDataParty
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceDataParty
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDataParty
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
    #' @return AudienceDataParty in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AudienceDataParty
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceDataParty
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDataParty
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
.parse_AudienceDataParty <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[1p, 3p]")
  unlist(strsplit(res, ", "))
}

