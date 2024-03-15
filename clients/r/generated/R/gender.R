#' @docType class
#' @title Gender
#' @description Gender Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Gender <- R6::R6Class(
  "Gender",
  public = list(
    #' Initialize a new Gender class.
    #'
    #' @description
    #' Initialize a new Gender class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_Gender()

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
    #' @return Gender in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of Gender
    #'
    #' @description
    #' Deserialize JSON string into an instance of Gender
    #'
    #' @param input_json the JSON input
    #' @return the instance of Gender
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
    #' @return Gender in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of Gender
    #'
    #' @description
    #' Deserialize JSON string into an instance of Gender
    #'
    #' @param input_json the JSON input
    #' @return the instance of Gender
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
.parse_Gender <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[FEMALE, MALE, UNISEX]")
  unlist(strsplit(res, ", "))
}

