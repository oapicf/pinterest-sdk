#' @docType class
#' @title CatalogsProductGroupStatus
#' @description CatalogsProductGroupStatus Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupStatus <- R6::R6Class(
  "CatalogsProductGroupStatus",
  public = list(
    #' Initialize a new CatalogsProductGroupStatus class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupStatus class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CatalogsProductGroupStatus()

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
    #' @return CatalogsProductGroupStatus in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupStatus
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
    #' @return CatalogsProductGroupStatus in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupStatus
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupStatus
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
.parse_CatalogsProductGroupStatus <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ACTIVE, INACTIVE]")
  unlist(strsplit(res, ", "))
}

