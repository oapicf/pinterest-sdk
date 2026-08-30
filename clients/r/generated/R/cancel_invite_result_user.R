#' Create a new CancelInviteResultUser
#'
#' @description
#' Metadata of the member/partner that has access to the asset.
#'
#' @docType class
#' @title CancelInviteResultUser
#' @description CancelInviteResultUser Class
#' @format An \code{R6Class} generator object
#' @field email Email of the business member/partner. character [optional]
#' @field id Unique identifier of the business member/partner. character [optional]
#' @field username Username of the business member/partner. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CancelInviteResultUser <- R6::R6Class(
  "CancelInviteResultUser",
  public = list(
    `email` = NULL,
    `id` = NULL,
    `username` = NULL,

    #' @description
    #' Initialize a new CancelInviteResultUser class.
    #'
    #' @param email Email of the business member/partner.
    #' @param id Unique identifier of the business member/partner.
    #' @param username Username of the business member/partner.
    #' @param ... Other optional arguments.
    initialize = function(`email` = NULL, `id` = NULL, `username` = NULL, ...) {
      if (!is.null(`email`)) {
        if (!(is.character(`email`) && length(`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", `email`))
        }
        self$`email` <- `email`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
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
    #' @return CancelInviteResultUser as a base R list.
    #' @examples
    #' # convert array of CancelInviteResultUser (x) to a data frame
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
    #' Convert CancelInviteResultUser to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CancelInviteResultUserObject <- list()
      if (!is.null(self$`email`)) {
        CancelInviteResultUserObject[["email"]] <-
          self$`email`
      }
      if (!is.null(self$`id`)) {
        CancelInviteResultUserObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`username`)) {
        CancelInviteResultUserObject[["username"]] <-
          self$`username`
      }
      return(CancelInviteResultUserObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInviteResultUser
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInviteResultUser
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`email`)) {
        self$`email` <- this_object$`email`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CancelInviteResultUser in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInviteResultUser
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInviteResultUser
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`email` <- this_object$`email`
      self$`id` <- this_object$`id`
      self$`username` <- this_object$`username`
      self
    },

    #' @description
    #' Validate JSON input with respect to CancelInviteResultUser and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CancelInviteResultUser
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`id`) > 20) {
        return(FALSE)
      }
      if (nchar(self$`id`) < 1) {
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
      if (nchar(self$`id`) > 20) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 20."
      }
      if (nchar(self$`id`) < 1) {
        invalid_fields["id"] <- "Invalid length for `id`, must be bigger than or equal to 1."
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
# CancelInviteResultUser$unlock()
#
## Below is an example to define the print function
# CancelInviteResultUser$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CancelInviteResultUser$lock()

