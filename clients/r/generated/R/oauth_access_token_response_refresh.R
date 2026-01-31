#' Create a new OauthAccessTokenResponseRefresh
#'
#' @description
#' A successful OAuth access token response for the refresh token flow.
#'
#' @docType class
#' @title OauthAccessTokenResponseRefresh
#' @description OauthAccessTokenResponseRefresh Class
#' @format An \code{R6Class} generator object
#' @field access_token  character
#' @field expires_in  integer
#' @field response_type  character [optional]
#' @field scope  character
#' @field token_type  character
#' @field refresh_token  character
#' @field refresh_token_expires_at  integer
#' @field refresh_token_expires_in  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OauthAccessTokenResponseRefresh <- R6::R6Class(
  "OauthAccessTokenResponseRefresh",
  public = list(
    `access_token` = NULL,
    `expires_in` = NULL,
    `response_type` = NULL,
    `scope` = NULL,
    `token_type` = NULL,
    `refresh_token` = NULL,
    `refresh_token_expires_at` = NULL,
    `refresh_token_expires_in` = NULL,

    #' @description
    #' Initialize a new OauthAccessTokenResponseRefresh class.
    #'
    #' @param access_token access_token
    #' @param expires_in expires_in
    #' @param scope scope
    #' @param token_type token_type
    #' @param refresh_token refresh_token
    #' @param refresh_token_expires_at refresh_token_expires_at
    #' @param refresh_token_expires_in refresh_token_expires_in
    #' @param response_type response_type
    #' @param ... Other optional arguments.
    initialize = function(`access_token`, `expires_in`, `scope`, `token_type`, `refresh_token`, `refresh_token_expires_at`, `refresh_token_expires_in`, `response_type` = NULL, ...) {
      if (!missing(`access_token`)) {
        if (!(is.character(`access_token`) && length(`access_token`) == 1)) {
          stop(paste("Error! Invalid data for `access_token`. Must be a string:", `access_token`))
        }
        self$`access_token` <- `access_token`
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
      if (!missing(`token_type`)) {
        if (!(is.character(`token_type`) && length(`token_type`) == 1)) {
          stop(paste("Error! Invalid data for `token_type`. Must be a string:", `token_type`))
        }
        self$`token_type` <- `token_type`
      }
      if (!missing(`refresh_token`)) {
        if (!(is.character(`refresh_token`) && length(`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", `refresh_token`))
        }
        self$`refresh_token` <- `refresh_token`
      }
      if (!missing(`refresh_token_expires_at`)) {
        if (!(is.numeric(`refresh_token_expires_at`) && length(`refresh_token_expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token_expires_at`. Must be an integer:", `refresh_token_expires_at`))
        }
        self$`refresh_token_expires_at` <- `refresh_token_expires_at`
      }
      if (!missing(`refresh_token_expires_in`)) {
        if (!(is.numeric(`refresh_token_expires_in`) && length(`refresh_token_expires_in`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token_expires_in`. Must be an integer:", `refresh_token_expires_in`))
        }
        self$`refresh_token_expires_in` <- `refresh_token_expires_in`
      }
      if (!is.null(`response_type`)) {
        if (!(`response_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
          stop(paste("Error! \"", `response_type`, "\" cannot be assigned to `response_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
        }
        if (!(is.character(`response_type`) && length(`response_type`) == 1)) {
          stop(paste("Error! Invalid data for `response_type`. Must be a string:", `response_type`))
        }
        self$`response_type` <- `response_type`
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
    #' @return OauthAccessTokenResponseRefresh as a base R list.
    #' @examples
    #' # convert array of OauthAccessTokenResponseRefresh (x) to a data frame
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
    #' Convert OauthAccessTokenResponseRefresh to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OauthAccessTokenResponseRefreshObject <- list()
      if (!is.null(self$`access_token`)) {
        OauthAccessTokenResponseRefreshObject[["access_token"]] <-
          self$`access_token`
      }
      if (!is.null(self$`expires_in`)) {
        OauthAccessTokenResponseRefreshObject[["expires_in"]] <-
          self$`expires_in`
      }
      if (!is.null(self$`response_type`)) {
        OauthAccessTokenResponseRefreshObject[["response_type"]] <-
          self$`response_type`
      }
      if (!is.null(self$`scope`)) {
        OauthAccessTokenResponseRefreshObject[["scope"]] <-
          self$`scope`
      }
      if (!is.null(self$`token_type`)) {
        OauthAccessTokenResponseRefreshObject[["token_type"]] <-
          self$`token_type`
      }
      if (!is.null(self$`refresh_token`)) {
        OauthAccessTokenResponseRefreshObject[["refresh_token"]] <-
          self$`refresh_token`
      }
      if (!is.null(self$`refresh_token_expires_at`)) {
        OauthAccessTokenResponseRefreshObject[["refresh_token_expires_at"]] <-
          self$`refresh_token_expires_at`
      }
      if (!is.null(self$`refresh_token_expires_in`)) {
        OauthAccessTokenResponseRefreshObject[["refresh_token_expires_in"]] <-
          self$`refresh_token_expires_in`
      }
      return(OauthAccessTokenResponseRefreshObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenResponseRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenResponseRefresh
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`access_token`)) {
        self$`access_token` <- this_object$`access_token`
      }
      if (!is.null(this_object$`expires_in`)) {
        self$`expires_in` <- this_object$`expires_in`
      }
      if (!is.null(this_object$`response_type`)) {
        if (!is.null(this_object$`response_type`) && !(this_object$`response_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
          stop(paste("Error! \"", this_object$`response_type`, "\" cannot be assigned to `response_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
        }
        self$`response_type` <- this_object$`response_type`
      }
      if (!is.null(this_object$`scope`)) {
        self$`scope` <- this_object$`scope`
      }
      if (!is.null(this_object$`token_type`)) {
        self$`token_type` <- this_object$`token_type`
      }
      if (!is.null(this_object$`refresh_token`)) {
        self$`refresh_token` <- this_object$`refresh_token`
      }
      if (!is.null(this_object$`refresh_token_expires_at`)) {
        self$`refresh_token_expires_at` <- this_object$`refresh_token_expires_at`
      }
      if (!is.null(this_object$`refresh_token_expires_in`)) {
        self$`refresh_token_expires_in` <- this_object$`refresh_token_expires_in`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return OauthAccessTokenResponseRefresh in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenResponseRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenResponseRefresh
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`access_token` <- this_object$`access_token`
      self$`expires_in` <- this_object$`expires_in`
      if (!is.null(this_object$`response_type`) && !(this_object$`response_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
        stop(paste("Error! \"", this_object$`response_type`, "\" cannot be assigned to `response_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
      }
      self$`response_type` <- this_object$`response_type`
      self$`scope` <- this_object$`scope`
      self$`token_type` <- this_object$`token_type`
      self$`refresh_token` <- this_object$`refresh_token`
      self$`refresh_token_expires_at` <- this_object$`refresh_token_expires_at`
      self$`refresh_token_expires_in` <- this_object$`refresh_token_expires_in`
      self
    },

    #' @description
    #' Validate JSON input with respect to OauthAccessTokenResponseRefresh and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `access_token`
      if (!is.null(input_json$`access_token`)) {
        if (!(is.character(input_json$`access_token`) && length(input_json$`access_token`) == 1)) {
          stop(paste("Error! Invalid data for `access_token`. Must be a string:", input_json$`access_token`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseRefresh: the required field `access_token` is missing."))
      }
      # check the required field `expires_in`
      if (!is.null(input_json$`expires_in`)) {
        if (!(is.numeric(input_json$`expires_in`) && length(input_json$`expires_in`) == 1)) {
          stop(paste("Error! Invalid data for `expires_in`. Must be an integer:", input_json$`expires_in`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseRefresh: the required field `expires_in` is missing."))
      }
      # check the required field `scope`
      if (!is.null(input_json$`scope`)) {
        if (!(is.character(input_json$`scope`) && length(input_json$`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", input_json$`scope`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseRefresh: the required field `scope` is missing."))
      }
      # check the required field `token_type`
      if (!is.null(input_json$`token_type`)) {
        if (!(is.character(input_json$`token_type`) && length(input_json$`token_type`) == 1)) {
          stop(paste("Error! Invalid data for `token_type`. Must be a string:", input_json$`token_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseRefresh: the required field `token_type` is missing."))
      }
      # check the required field `refresh_token`
      if (!is.null(input_json$`refresh_token`)) {
        if (!(is.character(input_json$`refresh_token`) && length(input_json$`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", input_json$`refresh_token`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseRefresh: the required field `refresh_token` is missing."))
      }
      # check the required field `refresh_token_expires_at`
      if (!is.null(input_json$`refresh_token_expires_at`)) {
        if (!(is.numeric(input_json$`refresh_token_expires_at`) && length(input_json$`refresh_token_expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token_expires_at`. Must be an integer:", input_json$`refresh_token_expires_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseRefresh: the required field `refresh_token_expires_at` is missing."))
      }
      # check the required field `refresh_token_expires_in`
      if (!is.null(input_json$`refresh_token_expires_in`)) {
        if (!(is.numeric(input_json$`refresh_token_expires_in`) && length(input_json$`refresh_token_expires_in`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token_expires_in`. Must be an integer:", input_json$`refresh_token_expires_in`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenResponseRefresh: the required field `refresh_token_expires_in` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OauthAccessTokenResponseRefresh
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `access_token` is null
      if (is.null(self$`access_token`)) {
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

      # check if the required `token_type` is null
      if (is.null(self$`token_type`)) {
        return(FALSE)
      }

      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        return(FALSE)
      }

      # check if the required `refresh_token_expires_at` is null
      if (is.null(self$`refresh_token_expires_at`)) {
        return(FALSE)
      }

      # check if the required `refresh_token_expires_in` is null
      if (is.null(self$`refresh_token_expires_in`)) {
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
      # check if the required `access_token` is null
      if (is.null(self$`access_token`)) {
        invalid_fields["access_token"] <- "Non-nullable required field `access_token` cannot be null."
      }

      # check if the required `expires_in` is null
      if (is.null(self$`expires_in`)) {
        invalid_fields["expires_in"] <- "Non-nullable required field `expires_in` cannot be null."
      }

      # check if the required `scope` is null
      if (is.null(self$`scope`)) {
        invalid_fields["scope"] <- "Non-nullable required field `scope` cannot be null."
      }

      # check if the required `token_type` is null
      if (is.null(self$`token_type`)) {
        invalid_fields["token_type"] <- "Non-nullable required field `token_type` cannot be null."
      }

      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        invalid_fields["refresh_token"] <- "Non-nullable required field `refresh_token` cannot be null."
      }

      # check if the required `refresh_token_expires_at` is null
      if (is.null(self$`refresh_token_expires_at`)) {
        invalid_fields["refresh_token_expires_at"] <- "Non-nullable required field `refresh_token_expires_at` cannot be null."
      }

      # check if the required `refresh_token_expires_in` is null
      if (is.null(self$`refresh_token_expires_in`)) {
        invalid_fields["refresh_token_expires_in"] <- "Non-nullable required field `refresh_token_expires_in` cannot be null."
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
# OauthAccessTokenResponseRefresh$unlock()
#
## Below is an example to define the print function
# OauthAccessTokenResponseRefresh$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OauthAccessTokenResponseRefresh$lock()

