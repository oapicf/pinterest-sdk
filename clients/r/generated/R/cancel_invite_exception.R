#' Create a new CancelInviteException
#'
#' @description
#' An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
#'
#' @docType class
#' @title CancelInviteException
#' @description CancelInviteException Class
#' @format An \code{R6Class} generator object
#' @field invite_id  character [optional]
#' @field message  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CancelInviteException <- R6::R6Class(
  "CancelInviteException",
  public = list(
    `invite_id` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new CancelInviteException class.
    #'
    #' @param invite_id invite_id
    #' @param message message
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
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CancelInviteException as a base R list.
    #' @examples
    #' # convert array of CancelInviteException (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CancelInviteException to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CancelInviteExceptionObject <- list()
      if (!is.null(self$`invite_id`)) {
        CancelInviteExceptionObject[["invite_id"]] <-
          self$`invite_id`
      }
      if (!is.null(self$`message`)) {
        CancelInviteExceptionObject[["message"]] <-
          self$`message`
      }
      return(CancelInviteExceptionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInviteException
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInviteException
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
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CancelInviteException in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInviteException
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInviteException
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invite_id` <- this_object$`invite_id`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to CancelInviteException and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CancelInviteException
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
# CancelInviteException$unlock()
#
## Below is an example to define the print function
# CancelInviteException$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CancelInviteException$lock()

