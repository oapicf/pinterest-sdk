#' @docType class
#' @title TrendsSupportedRegion
#' @description TrendsSupportedRegion Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendsSupportedRegion <- R6::R6Class(
  "TrendsSupportedRegion",
  public = list(
    #' Initialize a new TrendsSupportedRegion class.
    #'
    #' @description
    #' Initialize a new TrendsSupportedRegion class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_TrendsSupportedRegion()

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
    #' @return TrendsSupportedRegion in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of TrendsSupportedRegion
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendsSupportedRegion
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendsSupportedRegion
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
    #' @return TrendsSupportedRegion in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of TrendsSupportedRegion
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendsSupportedRegion
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendsSupportedRegion
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
.parse_TrendsSupportedRegion <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[US, CA, DE, FR, ES, IT, DE+AT+CH, GB+IE, IT+ES+PT+GR+MT, PL+RO+HU+SK+CZ, SE+DK+FI+NO, NL+BE+LU, AR, BR, CO, MX, MX+AR+CO+CL, AU+NZ]")
  unlist(strsplit(res, ", "))
}

