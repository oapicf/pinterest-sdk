#' @docType class
#' @title CatalogsLocale
#' @description CatalogsLocale Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsLocale <- R6::R6Class(
  "CatalogsLocale",
  public = list(
    #' Initialize a new CatalogsLocale class.
    #'
    #' @description
    #' Initialize a new CatalogsLocale class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CatalogsLocale()

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
    #' @return CatalogsLocale in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of CatalogsLocale
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsLocale
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsLocale
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
    #' @return CatalogsLocale in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of CatalogsLocale
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsLocale
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsLocale
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
.parse_CatalogsLocale <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[af-ZA, ar-SA, bg-BG, bn-IN, cs-CZ, da-DK, de, el-GR, en-AU, en-CA, en-GB, en-IN, en-US, es-419, es-AR, es-ES, es-MX, fi-FI, fr, fr-CA, he-IL, hi-IN, hr-HR, hu-HU, id-ID, it, ja, ko-KR, ms-MY, nb-NO, nl, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sk-SK, sv-SE, te-IN, th-TH, tl-PH, tr, uk-UA, vi-VN, zh-CN, zh-TW]")
  unlist(strsplit(res, ", "))
}

