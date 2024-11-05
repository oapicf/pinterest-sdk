#' Create a new DeleteInvitesResultsResponseArrayItemsInnerException
#'
#' @description
#' An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
#'
#' @docType class
#' @title DeleteInvitesResultsResponseArrayItemsInnerException
#' @description DeleteInvitesResultsResponseArrayItemsInnerException Class
#' @format An \code{R6Class} generator object
#' @field invite_id Unique identifier of an invite. character [optional]
#' @field message Error message associated with the error in performing the action on the invite/request. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteInvitesResultsResponseArrayItemsInnerException <- R6::R6Class(
  "DeleteInvitesResultsResponseArrayItemsInnerException",
  public = list(
    `invite_id` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new DeleteInvitesResultsResponseArrayItemsInnerException class.
    #'
    #' @param invite_id Unique identifier of an invite.
    #' @param message Error message associated with the error in performing the action on the invite/request.
    #' @param ... Other optional arguments.
    initialize = function(`invite_id` = NULL, `message` = NULL, ...) {
      if (!is.null(`invite_id`)) {
        if (!(is.character(`invite_id`) && length(`invite_id`) == 1)) {
          stop(paste("Error! Invalid data for `invite_id`. Must be a string:", `invite_id`))
        }
        self$`invite_id` <- `invite_id`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteInvitesResultsResponseArrayItemsInnerException in JSON format
    toJSON = function() {
      DeleteInvitesResultsResponseArrayItemsInnerExceptionObject <- list()
      if (!is.null(self$`invite_id`)) {
        DeleteInvitesResultsResponseArrayItemsInnerExceptionObject[["invite_id"]] <-
          self$`invite_id`
      }
      if (!is.null(self$`message`)) {
        DeleteInvitesResultsResponseArrayItemsInnerExceptionObject[["message"]] <-
          self$`message`
      }
      DeleteInvitesResultsResponseArrayItemsInnerExceptionObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteInvitesResultsResponseArrayItemsInnerException
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteInvitesResultsResponseArrayItemsInnerException
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`invite_id`)) {
        self$`invite_id` <- this_object$`invite_id`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteInvitesResultsResponseArrayItemsInnerException in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`invite_id`)) {
          sprintf(
          '"invite_id":
            "%s"
                    ',
          self$`invite_id`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteInvitesResultsResponseArrayItemsInnerException
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteInvitesResultsResponseArrayItemsInnerException
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invite_id` <- this_object$`invite_id`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteInvitesResultsResponseArrayItemsInnerException and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteInvitesResultsResponseArrayItemsInnerException
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`invite_id`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`invite_id`, "^\\d+$")) {
        invalid_fields["invite_id"] <- "Invalid value for `invite_id`, must conform to the pattern ^\\d+$."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# DeleteInvitesResultsResponseArrayItemsInnerException$unlock()
#
## Below is an example to define the print function
# DeleteInvitesResultsResponseArrayItemsInnerException$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteInvitesResultsResponseArrayItemsInnerException$lock()

