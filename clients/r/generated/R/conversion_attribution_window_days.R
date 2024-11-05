#' @docType class
#' @title ConversionAttributionWindowDays
#' @description ConversionAttributionWindowDays Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionAttributionWindowDays <- R6::R6Class(
  "ConversionAttributionWindowDays",
  public = list(

    #' @description
    #' Initialize a new ConversionAttributionWindowDays class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ConversionAttributionWindowDays()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
        warning("Initializing ConversionAttributionWindowDays with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ConversionAttributionWindowDays, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionAttributionWindowDays in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionAttributionWindowDays
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ConversionAttributionWindowDays
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionAttributionWindowDays in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionAttributionWindowDays
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ConversionAttributionWindowDays
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
.parse_ConversionAttributionWindowDays <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[0, 1, 7, 14, 30, 60]")
  unlist(strsplit(res, ", "))
}

