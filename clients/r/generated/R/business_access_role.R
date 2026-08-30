#' @docType class
#' @title BusinessAccessRole
#' @description BusinessAccessRole Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessAccessRole <- R6::R6Class(
  "BusinessAccessRole",
  public = list(

    #' @description
    #' Initialize a new BusinessAccessRole class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_BusinessAccessRole()

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
    #' Convert BusinessAccessRole to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessAccessRole
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of BusinessAccessRole
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BusinessAccessRole in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessAccessRole
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of BusinessAccessRole
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
.parse_BusinessAccessRole <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[OWNER, ADMIN, ANALYST, SOS_READER, FINANCE_MANAGER, FINANCE_VIEW, FINANCE_EDIT, AUDIENCE_MANAGER, CAMPAIGN_MANAGER, CATALOGS_MANAGER, RESTRICTED_OWNER, PROFILE_MANAGER, PROFILE_PUBLISHER, RESOURCE_PINNER_LIST_OWNER, RESOURCE_PINNER_LIST_READER, BIZ_PINNER_LIST_SHARER, RESOURCE_CONVERSION_TAGS_READER]")
  unlist(strsplit(res, ", "))
}

