#' @docType class
#' @title Role
#' @description Role Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Role <- R6::R6Class(
  "Role",
  public = list(
    #' Initialize a new Role class.
    #'
    #' @description
    #' Initialize a new Role class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_Role()

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
    #' @return Role in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of Role
    #'
    #' @description
    #' Deserialize JSON string into an instance of Role
    #'
    #' @param input_json the JSON input
    #' @return the instance of Role
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
    #' @return Role in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of Role
    #'
    #' @description
    #' Deserialize JSON string into an instance of Role
    #'
    #' @param input_json the JSON input
    #' @return the instance of Role
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
.parse_Role <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[UNKNOWN, OWNER, ADMIN, ANALYST, SOS_READER, FINANCE_MANAGER, AUDIENCE_MANAGER, CAMPAIGN_MANAGER, CATALOGS_MANAGER, RESTRICTED_OWNER, PROFILE_MANAGER, PROFILE_PUBLISHER, RESOURCE_PINNER_LIST_OWNER, RESOURCE_PINNER_LIST_READER, BIZ_PINNER_LIST_SHARER, RESOURCE_CONVERSION_TAGS_READER]")
  unlist(strsplit(res, ", "))
}

