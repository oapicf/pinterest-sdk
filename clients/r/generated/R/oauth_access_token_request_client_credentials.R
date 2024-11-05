#' Create a new OauthAccessTokenRequestClientCredentials
#'
#' @description
#' A request to receive a client token.
#'
#' @docType class
#' @title OauthAccessTokenRequestClientCredentials
#' @description OauthAccessTokenRequestClientCredentials Class
#' @format An \code{R6Class} generator object
#' @field grant_type  character
#' @field scope  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OauthAccessTokenRequestClientCredentials <- R6::R6Class(
  "OauthAccessTokenRequestClientCredentials",
  public = list(
    `grant_type` = NULL,
    `scope` = NULL,

    #' @description
    #' Initialize a new OauthAccessTokenRequestClientCredentials class.
    #'
    #' @param grant_type grant_type
    #' @param scope scope
    #' @param ... Other optional arguments.
    initialize = function(`grant_type`, `scope`, ...) {
      if (!missing(`grant_type`)) {
        if (!(`grant_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
          stop(paste("Error! \"", `grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
        }
        if (!(is.character(`grant_type`) && length(`grant_type`) == 1)) {
          stop(paste("Error! Invalid data for `grant_type`. Must be a string:", `grant_type`))
        }
        self$`grant_type` <- `grant_type`
      }
      if (!missing(`scope`)) {
        if (!(is.character(`scope`) && length(`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", `scope`))
        }
        self$`scope` <- `scope`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return OauthAccessTokenRequestClientCredentials in JSON format
    toJSON = function() {
      OauthAccessTokenRequestClientCredentialsObject <- list()
      if (!is.null(self$`grant_type`)) {
        OauthAccessTokenRequestClientCredentialsObject[["grant_type"]] <-
          self$`grant_type`
      }
      if (!is.null(self$`scope`)) {
        OauthAccessTokenRequestClientCredentialsObject[["scope"]] <-
          self$`scope`
      }
      OauthAccessTokenRequestClientCredentialsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestClientCredentials
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestClientCredentials
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`grant_type`)) {
        if (!is.null(this_object$`grant_type`) && !(this_object$`grant_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
          stop(paste("Error! \"", this_object$`grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
        }
        self$`grant_type` <- this_object$`grant_type`
      }
      if (!is.null(this_object$`scope`)) {
        self$`scope` <- this_object$`scope`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return OauthAccessTokenRequestClientCredentials in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`grant_type`)) {
          sprintf(
          '"grant_type":
            "%s"
                    ',
          self$`grant_type`
          )
        },
        if (!is.null(self$`scope`)) {
          sprintf(
          '"scope":
            "%s"
                    ',
          self$`scope`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestClientCredentials
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestClientCredentials
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`grant_type`) && !(this_object$`grant_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
        stop(paste("Error! \"", this_object$`grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
      }
      self$`grant_type` <- this_object$`grant_type`
      self$`scope` <- this_object$`scope`
      self
    },

    #' @description
    #' Validate JSON input with respect to OauthAccessTokenRequestClientCredentials and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `grant_type`
      if (!is.null(input_json$`grant_type`)) {
        if (!(is.character(input_json$`grant_type`) && length(input_json$`grant_type`) == 1)) {
          stop(paste("Error! Invalid data for `grant_type`. Must be a string:", input_json$`grant_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestClientCredentials: the required field `grant_type` is missing."))
      }
      # check the required field `scope`
      if (!is.null(input_json$`scope`)) {
        if (!(is.character(input_json$`scope`) && length(input_json$`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", input_json$`scope`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestClientCredentials: the required field `scope` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OauthAccessTokenRequestClientCredentials
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `grant_type` is null
      if (is.null(self$`grant_type`)) {
        return(FALSE)
      }

      # check if the required `scope` is null
      if (is.null(self$`scope`)) {
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
      # check if the required `grant_type` is null
      if (is.null(self$`grant_type`)) {
        invalid_fields["grant_type"] <- "Non-nullable required field `grant_type` cannot be null."
      }

      # check if the required `scope` is null
      if (is.null(self$`scope`)) {
        invalid_fields["scope"] <- "Non-nullable required field `scope` cannot be null."
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
# OauthAccessTokenRequestClientCredentials$unlock()
#
## Below is an example to define the print function
# OauthAccessTokenRequestClientCredentials$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OauthAccessTokenRequestClientCredentials$lock()

