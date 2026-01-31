#' Create a new OauthAccessTokenRequestRefresh
#'
#' @description
#' OauthAccessTokenRequestRefresh Class
#'
#' @docType class
#' @title OauthAccessTokenRequestRefresh
#' @description OauthAccessTokenRequestRefresh Class
#' @format An \code{R6Class} generator object
#' @field refresh_token  character
#' @field scope  character [optional]
#' @field grant_type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OauthAccessTokenRequestRefresh <- R6::R6Class(
  "OauthAccessTokenRequestRefresh",
  public = list(
    `refresh_token` = NULL,
    `scope` = NULL,
    `grant_type` = NULL,

    #' @description
    #' Initialize a new OauthAccessTokenRequestRefresh class.
    #'
    #' @param refresh_token refresh_token
    #' @param grant_type grant_type
    #' @param scope scope
    #' @param ... Other optional arguments.
    initialize = function(`refresh_token`, `grant_type`, `scope` = NULL, ...) {
      if (!missing(`refresh_token`)) {
        if (!(is.character(`refresh_token`) && length(`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", `refresh_token`))
        }
        self$`refresh_token` <- `refresh_token`
      }
      if (!missing(`grant_type`)) {
        if (!(`grant_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
          stop(paste("Error! \"", `grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
        }
        if (!(is.character(`grant_type`) && length(`grant_type`) == 1)) {
          stop(paste("Error! Invalid data for `grant_type`. Must be a string:", `grant_type`))
        }
        self$`grant_type` <- `grant_type`
      }
      if (!is.null(`scope`)) {
        if (!(is.character(`scope`) && length(`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", `scope`))
        }
        self$`scope` <- `scope`
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
    #' @return OauthAccessTokenRequestRefresh as a base R list.
    #' @examples
    #' # convert array of OauthAccessTokenRequestRefresh (x) to a data frame
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
    #' Convert OauthAccessTokenRequestRefresh to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OauthAccessTokenRequestRefreshObject <- list()
      if (!is.null(self$`refresh_token`)) {
        OauthAccessTokenRequestRefreshObject[["refresh_token"]] <-
          self$`refresh_token`
      }
      if (!is.null(self$`scope`)) {
        OauthAccessTokenRequestRefreshObject[["scope"]] <-
          self$`scope`
      }
      if (!is.null(self$`grant_type`)) {
        OauthAccessTokenRequestRefreshObject[["grant_type"]] <-
          self$`grant_type`
      }
      return(OauthAccessTokenRequestRefreshObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestRefresh
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`refresh_token`)) {
        self$`refresh_token` <- this_object$`refresh_token`
      }
      if (!is.null(this_object$`scope`)) {
        self$`scope` <- this_object$`scope`
      }
      if (!is.null(this_object$`grant_type`)) {
        if (!is.null(this_object$`grant_type`) && !(this_object$`grant_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
          stop(paste("Error! \"", this_object$`grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
        }
        self$`grant_type` <- this_object$`grant_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return OauthAccessTokenRequestRefresh in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestRefresh
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestRefresh
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`refresh_token` <- this_object$`refresh_token`
      self$`scope` <- this_object$`scope`
      if (!is.null(this_object$`grant_type`) && !(this_object$`grant_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
        stop(paste("Error! \"", this_object$`grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
      }
      self$`grant_type` <- this_object$`grant_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to OauthAccessTokenRequestRefresh and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `refresh_token`
      if (!is.null(input_json$`refresh_token`)) {
        if (!(is.character(input_json$`refresh_token`) && length(input_json$`refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `refresh_token`. Must be a string:", input_json$`refresh_token`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestRefresh: the required field `refresh_token` is missing."))
      }
      # check the required field `grant_type`
      if (!is.null(input_json$`grant_type`)) {
        if (!(is.character(input_json$`grant_type`) && length(input_json$`grant_type`) == 1)) {
          stop(paste("Error! Invalid data for `grant_type`. Must be a string:", input_json$`grant_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestRefresh: the required field `grant_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OauthAccessTokenRequestRefresh
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        return(FALSE)
      }

      # check if the required `grant_type` is null
      if (is.null(self$`grant_type`)) {
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
      # check if the required `refresh_token` is null
      if (is.null(self$`refresh_token`)) {
        invalid_fields["refresh_token"] <- "Non-nullable required field `refresh_token` cannot be null."
      }

      # check if the required `grant_type` is null
      if (is.null(self$`grant_type`)) {
        invalid_fields["grant_type"] <- "Non-nullable required field `grant_type` cannot be null."
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
# OauthAccessTokenRequestRefresh$unlock()
#
## Below is an example to define the print function
# OauthAccessTokenRequestRefresh$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OauthAccessTokenRequestRefresh$lock()

