#' @docType class
#' @title PermissionsWithOwner
#' @description PermissionsWithOwner Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PermissionsWithOwner <- R6::R6Class(
  "PermissionsWithOwner",
  public = list(

    #' @description
    #' Initialize a new PermissionsWithOwner class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_PermissionsWithOwner()

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
        warning("Initializing PermissionsWithOwner with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize PermissionsWithOwner, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return PermissionsWithOwner in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of PermissionsWithOwner
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of PermissionsWithOwner
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return PermissionsWithOwner in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of PermissionsWithOwner
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of PermissionsWithOwner
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
.parse_PermissionsWithOwner <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ADMIN, ANALYST, FINANCE_MANAGER, AUDIENCE_MANAGER, CAMPAIGN_MANAGER, CATALOGS_MANAGER, CATALOGS_VIEWER, PROFILE_PUBLISHER, OWNER]")
  unlist(strsplit(res, ", "))
}

