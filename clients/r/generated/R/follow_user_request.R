#' Create a new FollowUserRequest
#'
#' @description
#' FollowUserRequest Class
#'
#' @docType class
#' @title FollowUserRequest
#' @description FollowUserRequest Class
#' @format An \code{R6Class} generator object
#' @field auto_follow Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FollowUserRequest <- R6::R6Class(
  "FollowUserRequest",
  public = list(
    `auto_follow` = NULL,
    #' Initialize a new FollowUserRequest class.
    #'
    #' @description
    #' Initialize a new FollowUserRequest class.
    #'
    #' @param auto_follow Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.. Default to FALSE.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`auto_follow` = FALSE, ...) {
      if (!is.null(`auto_follow`)) {
        if (!(is.logical(`auto_follow`) && length(`auto_follow`) == 1)) {
          stop(paste("Error! Invalid data for `auto_follow`. Must be a boolean:", `auto_follow`))
        }
        self$`auto_follow` <- `auto_follow`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FollowUserRequest in JSON format
    #' @export
    toJSON = function() {
      FollowUserRequestObject <- list()
      if (!is.null(self$`auto_follow`)) {
        FollowUserRequestObject[["auto_follow"]] <-
          self$`auto_follow`
      }
      FollowUserRequestObject
    },
    #' Deserialize JSON string into an instance of FollowUserRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of FollowUserRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of FollowUserRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`auto_follow`)) {
        self$`auto_follow` <- this_object$`auto_follow`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FollowUserRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`auto_follow`)) {
          sprintf(
          '"auto_follow":
            %s
                    ',
          tolower(self$`auto_follow`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FollowUserRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of FollowUserRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of FollowUserRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`auto_follow` <- this_object$`auto_follow`
      self
    },
    #' Validate JSON input with respect to FollowUserRequest
    #'
    #' @description
    #' Validate JSON input with respect to FollowUserRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FollowUserRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# FollowUserRequest$unlock()
#
## Below is an example to define the print function
# FollowUserRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FollowUserRequest$lock()

