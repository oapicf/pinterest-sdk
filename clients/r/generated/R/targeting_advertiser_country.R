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

    #' @description
    #' Initialize a new TargetingAdvertiserCountry class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_TargetingAdvertiserCountry()

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
      }
      private$value <- val
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert TargetingAdvertiserCountry to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingAdvertiserCountry
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of TargetingAdvertiserCountry
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingAdvertiserCountry in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingAdvertiserCountry
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of TargetingAdvertiserCountry
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
  res <- gsub("^\\[|\\]$", "", "[US, GB, CA, IE, AU, NZ, FR, SE, IL, DE, AT, IT, ES, NL, BE, PT, CH, HK, JP, KR, SG, false, DK, FI, CY, LU, MT, PL, RO, HU, CZ, GR, SK, BR, MX, AR, CL, CO]")
  unlist(strsplit(res, ", "))
}

