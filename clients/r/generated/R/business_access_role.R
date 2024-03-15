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
    #' Initialize a new BusinessAccessRole class.
    #'
    #' @description
    #' Initialize a new BusinessAccessRole class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_BusinessAccessRole()

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
    #' @return BusinessAccessRole in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of BusinessAccessRole
    #'
    #' @description
    #' Deserialize JSON string into an instance of BusinessAccessRole
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessAccessRole
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
    #' @return BusinessAccessRole in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of BusinessAccessRole
    #'
    #' @description
    #' Deserialize JSON string into an instance of BusinessAccessRole
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessAccessRole
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
.parse_BusinessAccessRole <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[OWNER, ADMIN, ANALYST, SOS_READER, FINANCE_MANAGER, AUDIENCE_MANAGER, CAMPAIGN_MANAGER, CATALOGS_MANAGER, RESTRICTED_OWNER, PROFILE_MANAGER, PROFILE_PUBLISHER, RESOURCE_PINNER_LIST_OWNER, RESOURCE_PINNER_LIST_READER, BIZ_PINNER_LIST_SHARER, RESOURCE_CONVERSION_TAGS_READER]")
  unlist(strsplit(res, ", "))
}

