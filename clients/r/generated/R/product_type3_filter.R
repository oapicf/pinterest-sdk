# Pinterest REST API
#
# Pinterest's REST API
#
# The version of the OpenAPI document: 5.3.0
# Contact: pinterest-api@pinterest.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title ProductType3Filter
#'
#' @description ProductType3Filter Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field PRODUCT_TYPE_3  \link{CatalogsProductGroupMultipleStringListCriteria} 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductType3Filter <- R6::R6Class(
  'ProductType3Filter',
  public = list(
    `PRODUCT_TYPE_3` = NULL,
    initialize = function(
        `PRODUCT_TYPE_3`, ...
    ) {
      local.optional.var <- list(...)
      if (!missing(`PRODUCT_TYPE_3`)) {
        stopifnot(R6::is.R6(`PRODUCT_TYPE_3`))
        self$`PRODUCT_TYPE_3` <- `PRODUCT_TYPE_3`
      }
    },
    toJSON = function() {
      ProductType3FilterObject <- list()
      if (!is.null(self$`PRODUCT_TYPE_3`)) {
        ProductType3FilterObject[['PRODUCT_TYPE_3']] <-
          self$`PRODUCT_TYPE_3`$toJSON()
      }

      ProductType3FilterObject
    },
    fromJSON = function(ProductType3FilterJson) {
      ProductType3FilterObject <- jsonlite::fromJSON(ProductType3FilterJson)
      if (!is.null(ProductType3FilterObject$`PRODUCT_TYPE_3`)) {
        PRODUCT_TYPE_3Object <- CatalogsProductGroupMultipleStringListCriteria$new()
        PRODUCT_TYPE_3Object$fromJSON(jsonlite::toJSON(ProductType3FilterObject$PRODUCT_TYPE_3, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_TYPE_3` <- PRODUCT_TYPE_3Object
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`PRODUCT_TYPE_3`)) {
        sprintf(
        '"PRODUCT_TYPE_3":
        %s
        ',
        jsonlite::toJSON(self$`PRODUCT_TYPE_3`$toJSON(), auto_unbox=TRUE, digits = NA)
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(ProductType3FilterJson) {
      ProductType3FilterObject <- jsonlite::fromJSON(ProductType3FilterJson)
      self$`PRODUCT_TYPE_3` <- CatalogsProductGroupMultipleStringListCriteria$new()$fromJSON(jsonlite::toJSON(ProductType3FilterObject$PRODUCT_TYPE_3, auto_unbox = TRUE, digits = NA))
      self
    }
  )
)