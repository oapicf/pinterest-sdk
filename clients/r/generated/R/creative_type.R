#' @docType class
#' @title CreativeType
#' @description CreativeType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreativeType <- R6::R6Class(
  "CreativeType",
  public = list(
    #' Initialize a new CreativeType class.
    #'
    #' @description
    #' Initialize a new CreativeType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CreativeType()

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
    #' @return CreativeType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of CreativeType
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreativeType
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreativeType
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
    #' @return CreativeType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of CreativeType
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreativeType
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreativeType
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
.parse_CreativeType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA, SHOWCASE, QUIZ]")
  unlist(strsplit(res, ", "))
}

