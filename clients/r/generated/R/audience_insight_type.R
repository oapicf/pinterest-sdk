#' @docType class
#' @title AudienceInsightType
#' @description AudienceInsightType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceInsightType <- R6::R6Class(
  "AudienceInsightType",
  public = list(
    #' Initialize a new AudienceInsightType class.
    #'
    #' @description
    #' Initialize a new AudienceInsightType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AudienceInsightType()

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
    #' @return AudienceInsightType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AudienceInsightType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceInsightType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceInsightType
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
    #' @return AudienceInsightType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AudienceInsightType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceInsightType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceInsightType
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
.parse_AudienceInsightType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE]")
  unlist(strsplit(res, ", "))
}

