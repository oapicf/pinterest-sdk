#' @docType class
#' @title ConversionTagType
#' @description ConversionTagType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionTagType <- R6::R6Class(
  "ConversionTagType",
  public = list(
    #' Initialize a new ConversionTagType class.
    #'
    #' @description
    #' Initialize a new ConversionTagType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ConversionTagType()

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
    #' @return ConversionTagType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ConversionTagType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionTagType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagType
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
    #' @return ConversionTagType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ConversionTagType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionTagType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagType
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
.parse_ConversionTagType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PAGE_LOAD, UNKNOWN, INITIALIZED, PAGE_VISIT, SIGNUP, CHECKOUT, CUSTOM, VIEW_CATEGORY, SEARCH, ADD_TO_CART, WATCH_VIDEO, LEAD, APP_INSTALL, WEB_SESSION, EXTERNAL_MEASUREMENT]")
  unlist(strsplit(res, ", "))
}

