#' Create a new OauthAccessTokenResponseIntegrationRefresh
#'
#' @description
#' A successful OAuth access token response for the refresh token flow, with an added refresh token.
#'
#' @docType class
#' @title OauthAccessTokenResponseIntegrationRefresh
#' @description OauthAccessTokenResponseIntegrationRefresh Class
#' @format An \code{R6Class} generator object
#' @field response_type  character [optional]
#' @field access_token  character
#' @field token_type  character
#' @field expires_in  integer
#' @field scope  character
#' @field refresh_token  character
#' @field refresh_token_expires_in  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OauthAccessTokenResponseIntegrationRefresh <- R6::R6Class(
  "OauthAccessTokenResponseIntegrationRefresh",
  inherit = OauthAccessTokenResponse,
  public = list(
    `response_type` = NULL,
    `access_token` = NULL,
    `token_type` = NULL,
    `expires_in` = NULL,
    `scope` = NULL,
    `refresh_token` = NULL,
    `refresh_token_expires_in` = NULL,
    #' Initialize a new OauthAccessTokenResponseIntegrationRefresh class.
    #'
    #' @description
    #' Initialize a new OauthAccessTokenResponseIntegrationRefresh class.
    #'
    #' @param access_token access_token
    #' @param token_type token_type
    #' @param expires_in expires_in
    #' @param scope scope
    #' @param refresh_token refresh_token
    #' @param refresh_token_expires_in refresh_token_expires_in
    #' @param response_type response_type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`access_token`, `token_type`, `expires_in`, `scope`, `refresh_token`, `refresh_token_expires_in`, `response_type` = NULL, ...) {
      if (!missing(`access_token`)) {
        if (!(is.character(`access_token`) && length(`access_token`) == 1)) {
          stop(paste("Error! Invalid data for `access_token`. Must be a string:", `access_token`))
        }
        self$`access_token` <- `access_token`
      }
      if (!missing(`token_type`)) {
        if (!(is.character(`token_type`) && length(`token_type`) == 1)) {
          stop(paste("Error! Invalid data for `token_type`. Must be a string:", `token_type`))
        }
        self$`token_type` <- `token_type`
      }
      if (!missing(`expires_in`)) {
        if (!(is.numeric(`expires_in`) && length(`expires_in`) == 1)) {
          stop(paste("Error! Invalid data for `expires_in`. Must be an integer:", `expires_in`))
        }
        self$`expires_in` <- `expires_in`
      }
      if (!missing(`scope`)) {
        if (!(is.character(`scope`) && length(`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", `scope`))
        }
        self$`scope` <- `scope`
      }
      if (!missing(`refresh_token`)) {
        if (!(is.character(`refresh_token`) && length(`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", `refresh_token`))
        }
        self$`refresh_token` <- `refresh_token`
      }
      if (!missing(`refresh_token_expires_in`)) {
        if (!(is.numeric(`refresh_token_expires_in`) && length(`refresh_token_expires_in`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token_expires_in`. Must be an integer:", `refresh_token_expires_in`))
        }
        self$`refresh_token_expires_in` <- `refresh_token_expires_in`
      }
      if (!is.null(`response_type`)) {
        if (!(`response_type` %in% c("authorization_code", "refresh_token"))) {
          stop(paste("Error! \"", `response_type`, "\" cannot be assigned to `response_type`. Must be \"authorization_code\", \"refresh_token\".", sep = ""))
        }
        if (!(is.character(`response_type`) && length(`response_type`) == 1)) {
          stop(paste("Error! Invalid data for `response_type`. Must be a string:", `response_type`))
        }
        self$`response_type` <- `response_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OauthAccessTokenResponseIntegrationRefresh in JSON format
    #' @export
    toJSON = function() {
      OauthAccessTokenResponseIntegrationRefreshObject <- list()
      if (!is.null(self$`response_type`)) {
        OauthAccessTokenResponseIntegrationRefreshObject[["response_type"]] <-
          self$`response_type`
      }
      if (!is.null(self$`access_token`)) {
        OauthAccessTokenResponseIntegrationRefreshObject[["access_token"]] <-
          self$`access_token`
      }
      if (!is.null(self$`token_type`)) {
        OauthAccessTokenResponseIntegrationRefreshObject[["token_type"]] <-
          self$`token_type`
      }
      if (!is.null(self$`expires_in`)) {
        OauthAccessTokenResponseIntegrationRefreshObject[["expires_in"]] <-
          self$`expires_in`
      }
      if (!is.null(self$`scope`)) {
        OauthAccessTokenResponseIntegrationRefreshObject[["scope"]] <-
          self$`scope`
      }
      if (!is.null(self$`refresh_token`)) {
        OauthAccessTokenResponseIntegrationRefreshObject[["refresh_token"]] <-
          self$`refresh_token`
      }
      if (!is.null(self$`refresh_token_expires_in`)) {
        OauthAccessTokenResponseIntegrationRefreshObject[["refresh_token_expires_in"]] <-
          self$`refresh_token_expires_in`
      }
      OauthAccessTokenResponseIntegrationRefreshObject
    },
    #' Deserialize JSON string into an instance of OauthAccessTokenResponseIntegrationRefresh
    #'
    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenResponseIntegrationRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenResponseIntegrationRefresh
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`response_type`)) {
        if (!is.null(this_object$`response_type`) && !(this_object$`response_type` %in% c("authorization_code", "refresh_token"))) {
          stop(paste("Error! \"", this_object$`response_type`, "\" cannot be assigned to `response_type`. Must be \"authorization_code\", \"refresh_token\".", sep = ""))
        }
        self$`response_type` <- this_object$`response_type`
      }
      if (!is.null(this_object$`access_token`)) {
        self$`access_token` <- this_object$`access_token`
      }
      if (!is.null(this_object$`token_type`)) {
        self$`token_type` <- this_object$`token_type`
      }
      if (!is.null(this_object$`expires_in`)) {
        self$`expires_in` <- this_object$`expires_in`
      }
      if (!is.null(this_object$`scope`)) {
        self$`scope` <- this_object$`scope`
      }
      if (!is.null(this_object$`refresh_token`)) {
        self$`refresh_token` <- this_object$`refresh_token`
      }
      if (!is.null(this_object$`refresh_token_expires_in`)) {
        self$`refresh_token_expires_in` <- this_object$`refresh_token_expires_in`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OauthAccessTokenResponseIntegrationRefresh in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`response_type`)) {
          sprintf(
          '"response_type":
            "%s"
                    ',
          self$`response_type`
          )
        },
        if (!is.null(self$`access_token`)) {
          sprintf(
          '"access_token":
            "%s"
                    ',
          self$`access_token`
          )
        },
        if (!is.null(self$`token_type`)) {
          sprintf(
          '"token_type":
            "%s"
                    ',
          self$`token_type`
          )
        },
        if (!is.null(self$`expires_in`)) {
          sprintf(
          '"expires_in":
            %d
                    ',
          self$`expires_in`
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
        if (!is.null(self$`refresh_token`)) {
          sprintf(
          '"refresh_token":
            "%s"
                    ',
          self$`refresh_token`
          )
        },
        if (!is.null(self$`refresh_token_expires_in`)) {
          sprintf(
          '"refresh_token_expires_in":
            %d
                    ',
          self$`refresh_token_expires_in`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OauthAccessTokenResponseIntegrationRefresh
    #'
    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenResponseIntegrationRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenResponseIntegrationRefresh
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`response_type`) && !(this_object$`response_type` %in% c("authorization_code", "refresh_token"))) {
        stop(paste("Error! \"", this_object$`response_type`, "\" cannot be assigned to `response_type`. Must be \"authorization_code\", \"refresh_token\".", sep = ""))
      }
      self$`response_type` <- this_object$`response_type`
      self$`access_token` <- this_object$`access_token`
      self$`token_type` <- this_object$`token_type`
      self$`expires_in` <- this_object$`expires_in`
      self$`scope` <- this_object$`scope`
      self$`refresh_token` <- this_object$`refresh_token`
      self$`refresh_token_expires_in` <- this_object$`refresh_token_expires_in`
      self
    },
    #' Validate JSON input with respect to OauthAccessTokenResponseIntegrationRefresh
    #'
    #' @description
    #' Validate JSON input with respect to OauthAccessTokenResponseIntegrationRefresh and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `access_token`
      if (!is.null(input_json$`access_token`)) {
        if (!(is.character(input_json$`access_token`) && length(input_json$`access_token`) == 1)) {
          stop(paste("Error! Invalid data for `access_token`. Must be a string:", input_json$`access_token`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseIntegrationRefresh: the required field `access_token` is missing."))
      }
      # check the required field `token_type`
      if (!is.null(input_json$`token_type`)) {
        if (!(is.character(input_json$`token_type`) && length(input_json$`token_type`) == 1)) {
          stop(paste("Error! Invalid data for `token_type`. Must be a string:", input_json$`token_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseIntegrationRefresh: the required field `token_type` is missing."))
      }
      # check the required field `expires_in`
      if (!is.null(input_json$`expires_in`)) {
        if (!(is.numeric(input_json$`expires_in`) && length(input_json$`expires_in`) == 1)) {
          stop(paste("Error! Invalid data for `expires_in`. Must be an integer:", input_json$`expires_in`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseIntegrationRefresh: the required field `expires_in` is missing."))
      }
      # check the required field `scope`
      if (!is.null(input_json$`scope`)) {
        if (!(is.character(input_json$`scope`) && length(input_json$`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", input_json$`scope`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseIntegrationRefresh: the required field `scope` is missing."))
      }
      # check the required field `refresh_token`
      if (!is.null(input_json$`refresh_token`)) {
        if (!(is.character(input_json$`refresh_token`) && length(input_json$`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", input_json$`refresh_token`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseIntegrationRefresh: the required field `refresh_token` is missing."))
      }
      # check the required field `refresh_token_expires_in`
      if (!is.null(input_json$`refresh_token_expires_in`)) {
        if (!(is.numeric(input_json$`refresh_token_expires_in`) && length(input_json$`refresh_token_expires_in`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token_expires_in`. Must be an integer:", input_json$`refresh_token_expires_in`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseIntegrationRefresh: the required field `refresh_token_expires_in` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OauthAccessTokenResponseIntegrationRefresh
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
      # check if the required `access_token` is null
      if (is.null(self$`access_token`)) {
        return(FALSE)
      }

      # check if the required `token_type` is null
      if (is.null(self$`token_type`)) {
        return(FALSE)
      }

      # check if the required `expires_in` is null
      if (is.null(self$`expires_in`)) {
        return(FALSE)
      }

      # check if the required `scope` is null
      if (is.null(self$`scope`)) {
        return(FALSE)
      }

      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        return(FALSE)
      }

      # check if the required `refresh_token_expires_in` is null
      if (is.null(self$`refresh_token_expires_in`)) {
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
      # check if the required `access_token` is null
      if (is.null(self$`access_token`)) {
        invalid_fields["access_token"] <- "Non-nullable required field `access_token` cannot be null."
      }

      # check if the required `token_type` is null
      if (is.null(self$`token_type`)) {
        invalid_fields["token_type"] <- "Non-nullable required field `token_type` cannot be null."
      }

      # check if the required `expires_in` is null
      if (is.null(self$`expires_in`)) {
        invalid_fields["expires_in"] <- "Non-nullable required field `expires_in` cannot be null."
      }

      # check if the required `scope` is null
      if (is.null(self$`scope`)) {
        invalid_fields["scope"] <- "Non-nullable required field `scope` cannot be null."
      }

      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        invalid_fields["refresh_token"] <- "Non-nullable required field `refresh_token` cannot be null."
      }

      # check if the required `refresh_token_expires_in` is null
      if (is.null(self$`refresh_token_expires_in`)) {
        invalid_fields["refresh_token_expires_in"] <- "Non-nullable required field `refresh_token_expires_in` cannot be null."
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
# OauthAccessTokenResponseIntegrationRefresh$unlock()
#
## Below is an example to define the print function
# OauthAccessTokenResponseIntegrationRefresh$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OauthAccessTokenResponseIntegrationRefresh$lock()

