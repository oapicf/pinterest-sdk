#' Create a new AuthRespondInvitesBodyInvitesInnerAction
#'
#' @description
#' AuthRespondInvitesBodyInvitesInnerAction Class
#'
#' @docType class
#' @title AuthRespondInvitesBodyInvitesInnerAction
#' @description AuthRespondInvitesBodyInvitesInnerAction Class
#' @format An \code{R6Class} generator object
#' @field accept_invite Whether the invite/request is accepted. character
#' @field asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. named list(list(\link{Permissions})) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuthRespondInvitesBodyInvitesInnerAction <- R6::R6Class(
  "AuthRespondInvitesBodyInvitesInnerAction",
  public = list(
    `accept_invite` = NULL,
    `asset_id_to_permissions` = NULL,

    #' @description
    #' Initialize a new AuthRespondInvitesBodyInvitesInnerAction class.
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
    #' To JSON String
    #'
    #' @return AuthRespondInvitesBodyInvitesInnerAction in JSON format
    toJSON = function() {
      AuthRespondInvitesBodyInvitesInnerActionObject <- list()
      if (!is.null(self$`accept_invite`)) {
        AuthRespondInvitesBodyInvitesInnerActionObject[["accept_invite"]] <-
          self$`accept_invite`
      }
      if (!is.null(self$`asset_id_to_permissions`)) {
        AuthRespondInvitesBodyInvitesInnerActionObject[["asset_id_to_permissions"]] <-
          lapply(self$`asset_id_to_permissions`, function(x) x$toJSON())
      }
      AuthRespondInvitesBodyInvitesInnerActionObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AuthRespondInvitesBodyInvitesInnerAction
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInvitesBodyInvitesInnerAction
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`accept_invite`)) {
        self$`accept_invite` <- this_object$`accept_invite`
      }
      if (!is.null(this_object$`asset_id_to_permissions`)) {
        self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(array[Permissions])", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AuthRespondInvitesBodyInvitesInnerAction in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`accept_invite`)) {
          sprintf(
          '"accept_invite":
            %s
                    ',
          tolower(self$`accept_invite`)
          )
        },
        if (!is.null(self$`asset_id_to_permissions`)) {
          sprintf(
          '"asset_id_to_permissions":
          %s
',
          jsonlite::toJSON(lapply(self$`asset_id_to_permissions`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuthRespondInvitesBodyInvitesInnerAction
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInvitesBodyInvitesInnerAction
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`accept_invite` <- this_object$`accept_invite`
      self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(array[Permissions])", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuthRespondInvitesBodyInvitesInnerAction and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AuthRespondInvitesBodyInvitesInnerAction: the required field `accept_invite` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuthRespondInvitesBodyInvitesInnerAction
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

      if (length(self$`asset_id_to_permissions`) < 1) {
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

      if (length(self$`asset_id_to_permissions`) < 1) {
        invalid_fields["asset_id_to_permissions"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# AuthRespondInvitesBodyInvitesInnerAction$unlock()
#
## Below is an example to define the print function
# AuthRespondInvitesBodyInvitesInnerAction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuthRespondInvitesBodyInvitesInnerAction$lock()

