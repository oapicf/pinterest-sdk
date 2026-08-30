#' Create a new AuthRespondInviteAction
#'
#' @description
#' AuthRespondInviteAction Class
#'
#' @docType class
#' @title AuthRespondInviteAction
#' @description AuthRespondInviteAction Class
#' @format An \code{R6Class} generator object
#' @field accept_invite Whether the invite/request is accepted. character
#' @field asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. named list(list(\link{Permissions})) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuthRespondInviteAction <- R6::R6Class(
  "AuthRespondInviteAction",
  public = list(
    `accept_invite` = NULL,
    `asset_id_to_permissions` = NULL,

    #' @description
    #' Initialize a new AuthRespondInviteAction class.
    #'
    #' @param accept_invite Whether the invite/request is accepted.
    #' @param asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
    #' @param ... Other optional arguments.
    initialize = function(`accept_invite`, `asset_id_to_permissions` = NULL, ...) {
      if (!missing(`accept_invite`)) {
        if (!(is.logical(`accept_invite`) && length(`accept_invite`) == 1)) {
          stop(paste("Error! Invalid data for `accept_invite`. Must be a boolean:", `accept_invite`))
        }
        self$`accept_invite` <- `accept_invite`
      }
      if (!is.null(`asset_id_to_permissions`)) {
        stopifnot(is.vector(`asset_id_to_permissions`), length(`asset_id_to_permissions`) != 0)
        sapply(`asset_id_to_permissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`asset_id_to_permissions` <- `asset_id_to_permissions`
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
    #' @return AuthRespondInviteAction as a base R list.
    #' @examples
    #' # convert array of AuthRespondInviteAction (x) to a data frame
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
    #' Convert AuthRespondInviteAction to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuthRespondInviteActionObject <- list()
      if (!is.null(self$`accept_invite`)) {
        AuthRespondInviteActionObject[["accept_invite"]] <-
          self$`accept_invite`
      }
      if (!is.null(self$`asset_id_to_permissions`)) {
        AuthRespondInviteActionObject[["asset_id_to_permissions"]] <-
          self$extractSimpleType(self$`asset_id_to_permissions`)
      }
      return(AuthRespondInviteActionObject)
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
    #' Deserialize JSON string into an instance of AuthRespondInviteAction
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInviteAction
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`accept_invite`)) {
        self$`accept_invite` <- this_object$`accept_invite`
      }
      if (!is.null(this_object$`asset_id_to_permissions`)) {
        self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(Array)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuthRespondInviteAction in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuthRespondInviteAction
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInviteAction
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`accept_invite` <- this_object$`accept_invite`
      self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(Array)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuthRespondInviteAction and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `accept_invite`
      if (!is.null(input_json$`accept_invite`)) {
        if (!(is.logical(input_json$`accept_invite`) && length(input_json$`accept_invite`) == 1)) {
          stop(paste("Error! Invalid data for `accept_invite`. Must be a boolean:", input_json$`accept_invite`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuthRespondInviteAction: the required field `accept_invite` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuthRespondInviteAction
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `accept_invite` is null
      if (is.null(self$`accept_invite`)) {
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
      # check if the required `accept_invite` is null
      if (is.null(self$`accept_invite`)) {
        invalid_fields["accept_invite"] <- "Non-nullable required field `accept_invite` cannot be null."
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
# AuthRespondInviteAction$unlock()
#
## Below is an example to define the print function
# AuthRespondInviteAction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuthRespondInviteAction$lock()

