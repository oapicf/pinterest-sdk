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
        warning("Initializing Language with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize Language, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return Language in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
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
    #' @return Language in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
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
  res <- gsub("^\\[|\\]$", "", "[AM, AR, AZ, BG, BN, BS, CA, CS, DA, DV, DZ, DE, EL, EN, ES, ET, FA, FI, FR, HE, HI, HR, HU, HY, ID, IN, IS, IT, IW, JA, KA, KM, KO, LO, LT, LV, MK, MN, MS, MY, NB, NE, NL, NO, PL, PT, RO, RU, SK, SL, SQ, SR, SV, TL, UK, VI, TE, TH, TR, XX, ZH]")
  unlist(strsplit(res, ", "))
}

