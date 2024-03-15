#' @docType class
#' @title ProductAvailabilityType
#' @description ProductAvailabilityType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductAvailabilityType <- R6::R6Class(
  "ProductAvailabilityType",
  public = list(
    #' Initialize a new ProductAvailabilityType class.
    #'
    #' @description
    #' Initialize a new ProductAvailabilityType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ProductAvailabilityType()

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
    #' @return ProductAvailabilityType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ProductAvailabilityType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProductAvailabilityType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductAvailabilityType
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
    #' @return ProductAvailabilityType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ProductAvailabilityType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProductAvailabilityType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductAvailabilityType
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
.parse_ProductAvailabilityType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[IN_STOCK, OUT_OF_STOCK, PREORDER, null]")
  unlist(strsplit(res, ", "))
}

