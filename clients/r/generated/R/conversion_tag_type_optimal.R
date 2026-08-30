#' @docType class
#' @title ConversionTagTypeOptimal
#' @description ConversionTagTypeOptimal Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionTagTypeOptimal <- R6::R6Class(
  "ConversionTagTypeOptimal",
  public = list(

    #' @description
    #' Initialize a new ConversionTagTypeOptimal class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ConversionTagTypeOptimal()

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
    #' Convert ConversionTagTypeOptimal to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionTagTypeOptimal
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ConversionTagTypeOptimal
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionTagTypeOptimal in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionTagTypeOptimal
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of ConversionTagTypeOptimal
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
.parse_ConversionTagTypeOptimal <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PAGE_LOAD, UNKNOWN, INITIALIZED, PAGE_VISIT, SIGNUP, CHECKOUT, CUSTOM, VIEW_CATEGORY, SEARCH, ADD_TO_CART, WATCH_VIDEO, LEAD, APP_INSTALL, WEB_SESSION, EXTERNAL_MEASUREMENT, ADD_PAYMENT_INFO, ADD_TO_WISHLIST, INITIATE_CHECKOUT, SUBSCRIBE, VIEW_CONTENT, ADVERTISER_DEFINED_EVENT, APP_OPEN, CONTACT, SCHEDULE, FIND_LOCATION, CUSTOMIZE_PRODUCT, SUBMIT_APPLICATION, START_TRIAL]")
  unlist(strsplit(res, ", "))
}

