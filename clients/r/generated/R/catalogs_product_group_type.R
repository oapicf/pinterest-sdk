#' @docType class
#' @title CatalogsProductGroupType
#' @description CatalogsProductGroupType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupType <- R6::R6Class(
  "CatalogsProductGroupType",
  public = list(

    #' @description
    #' Initialize a new CatalogsProductGroupType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CatalogsProductGroupType()

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
        warning("Initializing CatalogsProductGroupType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize CatalogsProductGroupType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupType in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of CatalogsProductGroupType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupType in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of CatalogsProductGroupType
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
.parse_CatalogsProductGroupType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[MERCHANT_CREATED, ALL_PRODUCTS, BEST_DEALS, PINNER_FAVORITES, TOP_SELLERS, BACK_IN_STOCK, NEW_ARRIVALS, SHOPIFY_COLLECTIONS, I2PC]")
  unlist(strsplit(res, ", "))
}

