#' Create a new InviteExceptionResponse
#'
#' @description
#' An exception object if there is an error performing the action. Will only be provided if there is an error.
#'
#' @docType class
#' @title InviteExceptionResponse
#' @description InviteExceptionResponse Class
#' @format An \code{R6Class} generator object
#' @field code Error code associated with the error in performing the action on the invite/request. integer [optional]
#' @field invite_or_request_id Unique identifier of the invite/request. character [optional]
#' @field message Error message associated with the error in performing the action on the invite/request. character [optional]
#' @field users_or_partner_ids A list of users' usernames or emails OR a list of partner ids that caused the error. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteExceptionResponse <- R6::R6Class(
  "InviteExceptionResponse",
  public = list(
    `code` = NULL,
    `invite_or_request_id` = NULL,
    `message` = NULL,
    `users_or_partner_ids` = NULL,

    #' @description
    #' Initialize a new InviteExceptionResponse class.
    #'
    #' @param code Error code associated with the error in performing the action on the invite/request.
    #' @param invite_or_request_id Unique identifier of the invite/request.
    #' @param message Error message associated with the error in performing the action on the invite/request.
    #' @param users_or_partner_ids A list of users' usernames or emails OR a list of partner ids that caused the error.
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `invite_or_request_id` = NULL, `message` = NULL, `users_or_partner_ids` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`invite_or_request_id`)) {
        if (!(is.character(`invite_or_request_id`) && length(`invite_or_request_id`) == 1)) {
          stop(paste("Error! Invalid data for `invite_or_request_id`. Must be a string:", `invite_or_request_id`))
        }
        self$`invite_or_request_id` <- `invite_or_request_id`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`users_or_partner_ids`)) {
        stopifnot(is.vector(`users_or_partner_ids`), length(`users_or_partner_ids`) != 0)
        sapply(`users_or_partner_ids`, function(x) stopifnot(is.character(x)))
        self$`users_or_partner_ids` <- `users_or_partner_ids`
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
    #' @return InviteExceptionResponse as a base R list.
    #' @examples
    #' # convert array of InviteExceptionResponse (x) to a data frame
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
    #' Convert InviteExceptionResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteExceptionResponseObject <- list()
      if (!is.null(self$`code`)) {
        InviteExceptionResponseObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`invite_or_request_id`)) {
        InviteExceptionResponseObject[["invite_or_request_id"]] <-
          self$`invite_or_request_id`
      }
      if (!is.null(self$`message`)) {
        InviteExceptionResponseObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`users_or_partner_ids`)) {
        InviteExceptionResponseObject[["users_or_partner_ids"]] <-
          self$`users_or_partner_ids`
      }
      return(InviteExceptionResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteExceptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteExceptionResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`invite_or_request_id`)) {
        self$`invite_or_request_id` <- this_object$`invite_or_request_id`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`users_or_partner_ids`)) {
        self$`users_or_partner_ids` <- ApiClient$new()$deserializeObj(this_object$`users_or_partner_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InviteExceptionResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteExceptionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteExceptionResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`invite_or_request_id` <- this_object$`invite_or_request_id`
      self$`message` <- this_object$`message`
      self$`users_or_partner_ids` <- ApiClient$new()$deserializeObj(this_object$`users_or_partner_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteExceptionResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteExceptionResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`invite_or_request_id`, "^\\d+$")) {
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
      if (!str_detect(self$`invite_or_request_id`, "^\\d+$")) {
        invalid_fields["invite_or_request_id"] <- "Invalid value for `invite_or_request_id`, must conform to the pattern ^\\d+$."
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
# InviteExceptionResponse$unlock()
#
## Below is an example to define the print function
# InviteExceptionResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteExceptionResponse$lock()

