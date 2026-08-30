#' @docType class
#' @title ConversionProductReportBreakdownType
#' @description ConversionProductReportBreakdownType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionProductReportBreakdownType <- R6::R6Class(
  "ConversionProductReportBreakdownType",
  public = list(

    #' @description
    #' Initialize a new ConversionProductReportBreakdownType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ConversionProductReportBreakdownType()

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
    #' Convert ConversionProductReportBreakdownType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionProductReportBreakdownType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ConversionProductReportBreakdownType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionProductReportBreakdownType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionProductReportBreakdownType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ConversionProductReportBreakdownType
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
.parse_ConversionProductReportBreakdownType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PRODUCT_BRAND, PRODUCT_CATEGORY, PRODUCT_BRAND_AND_CATEGORY, PRODUCT_SKU, PRODUCT_SKU_GROUP]")
  unlist(strsplit(res, ", "))
}

