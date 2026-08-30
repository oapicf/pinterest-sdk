#' @docType class
#' @title Language
#' @description Language Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Language <- R6::R6Class(
  "Language",
  public = list(

    #' @description
    #' Initialize a new Language class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_Language()

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
    #' Convert Language to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of Language
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of Language
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Language in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Language
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of Language
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
.parse_Language <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[AM, AR, AZ, BG, BN, BS, CA, CS, DA, DV, DZ, DE, EL, EN, ES, ET, FA, FI, FR, HE, HI, HR, HU, HY, ID, IN, IS, IT, IW, JA, KA, KM, KO, LO, LT, LV, MK, MN, MS, MY, NB, NE, NL, false, PL, PT, RO, RU, SK, SL, SQ, SR, SV, TL, UK, VI, TE, TH, TR, XX, ZH]")
  unlist(strsplit(res, ", "))
}

