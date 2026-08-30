#' @docType class
#' @title AdvertiserDefinedEventMappingType
#' @description AdvertiserDefinedEventMappingType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvertiserDefinedEventMappingType <- R6::R6Class(
  "AdvertiserDefinedEventMappingType",
  public = list(

    #' @description
    #' Initialize a new AdvertiserDefinedEventMappingType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AdvertiserDefinedEventMappingType()

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
    #' Convert AdvertiserDefinedEventMappingType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvertiserDefinedEventMappingType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdvertiserDefinedEventMappingType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdvertiserDefinedEventMappingType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvertiserDefinedEventMappingType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AdvertiserDefinedEventMappingType
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
.parse_AdvertiserDefinedEventMappingType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[SIGNUP, ADD_TO_CART, LEAD, CHECKOUT, SUBSCRIBE, ADD_TO_WISHLIST, ADD_PAYMENT_INFO, INITIATE_CHECKOUT, CONTACT, CUSTOMIZE_PRODUCT, FIND_LOCATION, SCHEDULE, SUBMIT_APPLICATION, START_TRIAL, PAGE_VISIT, VIEW_CATEGORY, VIEW_CONTENT, SEARCH, WATCH_VIDEO]")
  unlist(strsplit(res, ", "))
}

