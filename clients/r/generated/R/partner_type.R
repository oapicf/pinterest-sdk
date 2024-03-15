#' @docType class
#' @title PartnerType
#' @description PartnerType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PartnerType <- R6::R6Class(
  "PartnerType",
  public = list(
    #' Initialize a new PartnerType class.
    #'
    #' @description
    #' Initialize a new PartnerType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_PartnerType()

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
    #' @return PartnerType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of PartnerType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PartnerType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PartnerType
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
    #' @return PartnerType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of PartnerType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PartnerType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PartnerType
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
.parse_PartnerType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[INTERNAL, EXTERNAL]")
  unlist(strsplit(res, ", "))
}

