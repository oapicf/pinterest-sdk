#' @docType class
#' @title UserListOperationType
#' @description UserListOperationType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserListOperationType <- R6::R6Class(
  "UserListOperationType",
  public = list(
    #' Initialize a new UserListOperationType class.
    #'
    #' @description
    #' Initialize a new UserListOperationType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_UserListOperationType()

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
    #' @return UserListOperationType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of UserListOperationType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserListOperationType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserListOperationType
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
    #' @return UserListOperationType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of UserListOperationType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserListOperationType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserListOperationType
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
.parse_UserListOperationType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ADD, REMOVE]")
  unlist(strsplit(res, ", "))
}

