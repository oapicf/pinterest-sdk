#' @docType class
#' @title UserFollowingFeedType
#' @description UserFollowingFeedType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserFollowingFeedType <- R6::R6Class(
  "UserFollowingFeedType",
  public = list(
    #' Initialize a new UserFollowingFeedType class.
    #'
    #' @description
    #' Initialize a new UserFollowingFeedType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_UserFollowingFeedType()

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
    #' @return UserFollowingFeedType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of UserFollowingFeedType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserFollowingFeedType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserFollowingFeedType
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
    #' @return UserFollowingFeedType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of UserFollowingFeedType
    #'
    #' @description
    #' Deserialize JSON string into an instance of UserFollowingFeedType
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserFollowingFeedType
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
.parse_UserFollowingFeedType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY]")
  unlist(strsplit(res, ", "))
}

