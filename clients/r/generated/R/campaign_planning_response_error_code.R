#' @docType class
#' @title CampaignPlanningResponseErrorCode
#' @description CampaignPlanningResponseErrorCode Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningResponseErrorCode <- R6::R6Class(
  "CampaignPlanningResponseErrorCode",
  public = list(

    #' @description
    #' Initialize a new CampaignPlanningResponseErrorCode class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CampaignPlanningResponseErrorCode()

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
    #' Convert CampaignPlanningResponseErrorCode to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningResponseErrorCode
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of CampaignPlanningResponseErrorCode
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningResponseErrorCode in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningResponseErrorCode
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of CampaignPlanningResponseErrorCode
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
.parse_CampaignPlanningResponseErrorCode <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[SERVER_ERROR, AUDIENCE_LIST_MISSING, INVALID_REQUEST, PRODUCT_GROUP_MISSING]")
  unlist(strsplit(res, ", "))
}

