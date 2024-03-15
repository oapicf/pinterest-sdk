#' @docType class
#' @title UserListType
#' @description UserListType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserListType <- R6::R6Class(
  "UserListType",
  public = list(
    #' Initialize a new UserListType class.
    #'
    #' @description
    #' Initialize a new UserListType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_UserListType()

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
    #' @return UserListType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of UserListType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserListType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserListType
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
    #' @return UserListType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of UserListType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserListType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserListType
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
.parse_UserListType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[EMAIL, IDFA, MAID, LR_ID, DLX_ID, HASHED_PINNER_ID]")
  unlist(strsplit(res, ", "))
}

