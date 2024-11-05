#' Create a new AuthRespondInvitesBody
#'
#' @description
#' An object with a list of all the invites the user would like to respond to and the action to take.
#'
#' @docType class
#' @title AuthRespondInvitesBody
#' @description AuthRespondInvitesBody Class
#' @format An \code{R6Class} generator object
#' @field invites  list(\link{AuthRespondInvitesBodyInvitesInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuthRespondInvitesBody <- R6::R6Class(
  "AuthRespondInvitesBody",
  public = list(
    `invites` = NULL,

    #' @description
    #' Initialize a new AuthRespondInvitesBody class.
    #'
    #' @param invites invites
    #' @param ... Other optional arguments.
    initialize = function(`invites`, ...) {
      if (!missing(`invites`)) {
        stopifnot(is.vector(`invites`), length(`invites`) != 0)
        sapply(`invites`, function(x) stopifnot(R6::is.R6(x)))
        self$`invites` <- `invites`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AuthRespondInvitesBody in JSON format
    toJSON = function() {
      AuthRespondInvitesBodyObject <- list()
      if (!is.null(self$`invites`)) {
        AuthRespondInvitesBodyObject[["invites"]] <-
          lapply(self$`invites`, function(x) x$toJSON())
      }
      AuthRespondInvitesBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AuthRespondInvitesBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInvitesBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`invites`)) {
        self$`invites` <- ApiClient$new()$deserializeObj(this_object$`invites`, "array[AuthRespondInvitesBodyInvitesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AuthRespondInvitesBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`invites`)) {
          sprintf(
          '"invites":
          [%s]
',
          paste(sapply(self$`invites`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuthRespondInvitesBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuthRespondInvitesBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invites` <- ApiClient$new()$deserializeObj(this_object$`invites`, "array[AuthRespondInvitesBodyInvitesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuthRespondInvitesBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `invites`
      if (!is.null(input_json$`invites`)) {
        stopifnot(is.vector(input_json$`invites`), length(input_json$`invites`) != 0)
        tmp <- sapply(input_json$`invites`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuthRespondInvitesBody: the required field `invites` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuthRespondInvitesBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `invites` is null
      if (is.null(self$`invites`)) {
        return(FALSE)
      }

      if (length(self$`invites`) > 100) {
        return(FALSE)
      }
      if (length(self$`invites`) < 1) {
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
      # check if the required `invites` is null
      if (is.null(self$`invites`)) {
        invalid_fields["invites"] <- "Non-nullable required field `invites` cannot be null."
      }

      if (length(self$`invites`) > 100) {
        invalid_fields["invites"] <- "Invalid length for `invites`, number of items must be less than or equal to 100."
      }
      if (length(self$`invites`) < 1) {
        invalid_fields["invites"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# AuthRespondInvitesBody$unlock()
#
## Below is an example to define the print function
# AuthRespondInvitesBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuthRespondInvitesBody$lock()

