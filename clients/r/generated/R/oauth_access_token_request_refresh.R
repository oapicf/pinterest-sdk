#' Create a new OauthAccessTokenRequestRefresh
#'
#' @description
#' A request to exchange a refresh token for a new access token.
#'
#' @docType class
#' @title OauthAccessTokenRequestRefresh
#' @description OauthAccessTokenRequestRefresh Class
#' @format An \code{R6Class} generator object
#' @field grant_type  character
#' @field refresh_token  character
#' @field scope  character [optional]
#' @field refresh_on Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\". character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OauthAccessTokenRequestRefresh <- R6::R6Class(
  "OauthAccessTokenRequestRefresh",
  inherit = OauthAccessTokenRequest,
  public = list(
    `grant_type` = NULL,
    `refresh_token` = NULL,
    `scope` = NULL,
    `refresh_on` = NULL,
    #' Initialize a new OauthAccessTokenRequestRefresh class.
    #'
    #' @description
    #' Initialize a new OauthAccessTokenRequestRefresh class.
    #'
    #' @param grant_type grant_type
    #' @param refresh_token refresh_token
    #' @param scope scope
    #' @param refresh_on Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`grant_type`, `refresh_token`, `scope` = NULL, `refresh_on` = NULL, ...) {
      if (!missing(`grant_type`)) {
        if (!(`grant_type` %in% c("authorization_code", "refresh_token"))) {
          stop(paste("Error! \"", `grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\".", sep = ""))
        }
        if (!(is.character(`grant_type`) && length(`grant_type`) == 1)) {
          stop(paste("Error! Invalid data for `grant_type`. Must be a string:", `grant_type`))
        }
        self$`grant_type` <- `grant_type`
      }
      if (!missing(`refresh_token`)) {
        if (!(is.character(`refresh_token`) && length(`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", `refresh_token`))
        }
        self$`refresh_token` <- `refresh_token`
      }
      if (!is.null(`scope`)) {
        if (!(is.character(`scope`) && length(`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", `scope`))
        }
        self$`scope` <- `scope`
      }
      if (!is.null(`refresh_on`)) {
        if (!(is.logical(`refresh_on`) && length(`refresh_on`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_on`. Must be a boolean:", `refresh_on`))
        }
        self$`refresh_on` <- `refresh_on`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OauthAccessTokenRequestRefresh in JSON format
    #' @export
    toJSON = function() {
      OauthAccessTokenRequestRefreshObject <- list()
      if (!is.null(self$`grant_type`)) {
        OauthAccessTokenRequestRefreshObject[["grant_type"]] <-
          self$`grant_type`
      }
      if (!is.null(self$`refresh_token`)) {
        OauthAccessTokenRequestRefreshObject[["refresh_token"]] <-
          self$`refresh_token`
      }
      if (!is.null(self$`scope`)) {
        OauthAccessTokenRequestRefreshObject[["scope"]] <-
          self$`scope`
      }
      if (!is.null(self$`refresh_on`)) {
        OauthAccessTokenRequestRefreshObject[["refresh_on"]] <-
          self$`refresh_on`
      }
      OauthAccessTokenRequestRefreshObject
    },
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestRefresh
    #'
    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestRefresh
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`grant_type`)) {
        if (!is.null(this_object$`grant_type`) && !(this_object$`grant_type` %in% c("authorization_code", "refresh_token"))) {
          stop(paste("Error! \"", this_object$`grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\".", sep = ""))
        }
        self$`grant_type` <- this_object$`grant_type`
      }
      if (!is.null(this_object$`refresh_token`)) {
        self$`refresh_token` <- this_object$`refresh_token`
      }
      if (!is.null(this_object$`scope`)) {
        self$`scope` <- this_object$`scope`
      }
      if (!is.null(this_object$`refresh_on`)) {
        self$`refresh_on` <- this_object$`refresh_on`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OauthAccessTokenRequestRefresh in JSON format
    #' @export
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
        if (!is.null(self$`refresh_token`)) {
          sprintf(
          '"refresh_token":
            "%s"
                    ',
          self$`refresh_token`
          )
        },
        if (!is.null(self$`scope`)) {
          sprintf(
          '"scope":
            "%s"
                    ',
          self$`scope`
          )
        },
        if (!is.null(self$`refresh_on`)) {
          sprintf(
          '"refresh_on":
            %s
                    ',
          tolower(self$`refresh_on`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestRefresh
    #'
    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestRefresh
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`grant_type`) && !(this_object$`grant_type` %in% c("authorization_code", "refresh_token"))) {
        stop(paste("Error! \"", this_object$`grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\".", sep = ""))
      }
      self$`grant_type` <- this_object$`grant_type`
      self$`refresh_token` <- this_object$`refresh_token`
      self$`scope` <- this_object$`scope`
      self$`refresh_on` <- this_object$`refresh_on`
      self
    },
    #' Validate JSON input with respect to OauthAccessTokenRequestRefresh
    #'
    #' @description
    #' Validate JSON input with respect to OauthAccessTokenRequestRefresh and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `grant_type`
      if (!is.null(input_json$`grant_type`)) {
        if (!(is.character(input_json$`grant_type`) && length(input_json$`grant_type`) == 1)) {
          stop(paste("Error! Invalid data for `grant_type`. Must be a string:", input_json$`grant_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestRefresh: the required field `grant_type` is missing."))
      }
      # check the required field `refresh_token`
      if (!is.null(input_json$`refresh_token`)) {
        if (!(is.character(input_json$`refresh_token`) && length(input_json$`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", input_json$`refresh_token`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestRefresh: the required field `refresh_token` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OauthAccessTokenRequestRefresh
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
      # check if the required `grant_type` is null
      if (is.null(self$`grant_type`)) {
        return(FALSE)
      }

      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        return(FALSE)
      }

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
      # check if the required `grant_type` is null
      if (is.null(self$`grant_type`)) {
        invalid_fields["grant_type"] <- "Non-nullable required field `grant_type` cannot be null."
      }

      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        invalid_fields["refresh_token"] <- "Non-nullable required field `refresh_token` cannot be null."
      }

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
# OauthAccessTokenRequestRefresh$unlock()
#
## Below is an example to define the print function
# OauthAccessTokenRequestRefresh$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OauthAccessTokenRequestRefresh$lock()

