#' Create a new AuthRespondInvitesBodyItem
#'
#' @description
#' AuthRespondInvitesBodyItem Class
#'
#' @docType class
#' @title AuthRespondInvitesBodyItem
#' @description AuthRespondInvitesBodyItem Class
#' @format An \code{R6Class} generator object
#' @field action  \link{AuthRespondInviteAction}
#' @field invite_id Unique identifier of an invite. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuthRespondInvitesBodyItem <- R6::R6Class(
  "AuthRespondInvitesBodyItem",
  public = list(
    `action` = NULL,
    `invite_id` = NULL,

    #' @description
    #' Initialize a new AuthRespondInvitesBodyItem class.
    #'
    #' @param action action
    #' @param invite_id Unique identifier of an invite.
    #' @param ... Other optional arguments.
    initialize = function(`action`, `invite_id`, ...) {
      if (!missing(`action`)) {
        stopifnot(R6::is.R6(`action`))
        self$`action` <- `action`
      }
      if (!missing(`invite_id`)) {
        if (!(is.character(`invite_id`) && length(`invite_id`) == 1)) {
          stop(paste("Error! Invalid data for `invite_id`. Must be a string:", `invite_id`))
        }
        self$`invite_id` <- `invite_id`
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
    #' @return AuthRespondInvitesBodyItem as a base R list.
    #' @examples
    #' # convert array of AuthRespondInvitesBodyItem (x) to a data frame
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
    #' Convert AuthRespondInvitesBodyItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuthRespondInvitesBodyItemObject <- list()
      if (!is.null(self$`action`)) {
        AuthRespondInvitesBodyItemObject[["action"]] <-
          self$extractSimpleType(self$`action`)
      }
      if (!is.null(self$`invite_id`)) {
        AuthRespondInvitesBodyItemObject[["invite_id"]] <-
          self$`invite_id`
      }
      return(AuthRespondInvitesBodyItemObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of AuthRespondInvitesBodyItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInvitesBodyItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`action`)) {
        `action_object` <- AuthRespondInviteAction$new()
        `action_object`$fromJSON(jsonlite::toJSON(this_object$`action`, auto_unbox = TRUE, digits = NA))
        self$`action` <- `action_object`
      }
      if (!is.null(this_object$`invite_id`)) {
        self$`invite_id` <- this_object$`invite_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuthRespondInvitesBodyItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuthRespondInvitesBodyItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInvitesBodyItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`action` <- AuthRespondInviteAction$new()$fromJSON(jsonlite::toJSON(this_object$`action`, auto_unbox = TRUE, digits = NA))
      self$`invite_id` <- this_object$`invite_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuthRespondInvitesBodyItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `action`
      if (!is.null(input_json$`action`)) {
        stopifnot(R6::is.R6(input_json$`action`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuthRespondInvitesBodyItem: the required field `action` is missing."))
      }
      # check the required field `invite_id`
      if (!is.null(input_json$`invite_id`)) {
        if (!(is.character(input_json$`invite_id`) && length(input_json$`invite_id`) == 1)) {
          stop(paste("Error! Invalid data for `invite_id`. Must be a string:", input_json$`invite_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuthRespondInvitesBodyItem: the required field `invite_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuthRespondInvitesBodyItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `action` is null
      if (is.null(self$`action`)) {
        return(FALSE)
      }

      # check if the required `invite_id` is null
      if (is.null(self$`invite_id`)) {
        return(FALSE)
      }

      if (nchar(self$`invite_id`) > 25) {
        return(FALSE)
      }
      if (nchar(self$`invite_id`) < 1) {
        return(FALSE)
      }
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
      # check if the required `action` is null
      if (is.null(self$`action`)) {
        invalid_fields["action"] <- "Non-nullable required field `action` cannot be null."
      }

      # check if the required `invite_id` is null
      if (is.null(self$`invite_id`)) {
        invalid_fields["invite_id"] <- "Non-nullable required field `invite_id` cannot be null."
      }

      if (nchar(self$`invite_id`) > 25) {
        invalid_fields["invite_id"] <- "Invalid length for `invite_id`, must be smaller than or equal to 25."
      }
      if (nchar(self$`invite_id`) < 1) {
        invalid_fields["invite_id"] <- "Invalid length for `invite_id`, must be bigger than or equal to 1."
      }
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
# AuthRespondInvitesBodyItem$unlock()
#
## Below is an example to define the print function
# AuthRespondInvitesBodyItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuthRespondInvitesBodyItem$lock()

