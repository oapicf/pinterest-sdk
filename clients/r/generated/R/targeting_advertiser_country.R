#' @docType class
#' @title TargetingAdvertiserCountry
#' @description TargetingAdvertiserCountry Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingAdvertiserCountry <- R6::R6Class(
  "TargetingAdvertiserCountry",
  public = list(
    #' Initialize a new TargetingAdvertiserCountry class.
    #'
    #' @description
    #' Initialize a new TargetingAdvertiserCountry class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_TargetingAdvertiserCountry()

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
    #' @return TargetingAdvertiserCountry in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of TargetingAdvertiserCountry
    #'
    #' @description
    #' Deserialize JSON string into an instance of TargetingAdvertiserCountry
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingAdvertiserCountry
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
    #' @return TargetingAdvertiserCountry in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of TargetingAdvertiserCountry
    #'
    #' @description
    #' Deserialize JSON string into an instance of TargetingAdvertiserCountry
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingAdvertiserCountry
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
.parse_TargetingAdvertiserCountry <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[US, GB, CA, IE, AU, NZ, FR, SE, IL, DE, AT, IT, ES, NL, BE, PT, CH, HK, JP, KR, SG, NO, DK, FI, CY, LU, MT, PL, RO, HU, CZ, GR, SK, BR, MX, AR, CL, CO]")
  unlist(strsplit(res, ", "))
}

