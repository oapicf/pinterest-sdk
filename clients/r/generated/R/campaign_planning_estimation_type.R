#' @docType class
#' @title CampaignPlanningEstimationType
#' @description CampaignPlanningEstimationType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningEstimationType <- R6::R6Class(
  "CampaignPlanningEstimationType",
  public = list(

    #' @description
    #' Initialize a new CampaignPlanningEstimationType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CampaignPlanningEstimationType()

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
    #' Convert CampaignPlanningEstimationType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningEstimationType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of CampaignPlanningEstimationType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningEstimationType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningEstimationType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of CampaignPlanningEstimationType
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
.parse_CampaignPlanningEstimationType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[IMPRESSION, CLICK, CONVERSION, WEEKLY_FREQUENCY, WEEKLY_REACH, LIFETIME_FREQUENCY, LIFETIME_REACH, CPM, CPC, CPA]")
  unlist(strsplit(res, ", "))
}

