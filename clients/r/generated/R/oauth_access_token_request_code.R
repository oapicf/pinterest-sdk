#' Create a new OauthAccessTokenRequestCode
#'
#' @description
#' OauthAccessTokenRequestCode Class
#'
#' @docType class
#' @title OauthAccessTokenRequestCode
#' @description OauthAccessTokenRequestCode Class
#' @format An \code{R6Class} generator object
#' @field code  character
#' @field redirect_uri  character
#' @field grant_type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OauthAccessTokenRequestCode <- R6::R6Class(
  "OauthAccessTokenRequestCode",
  public = list(
    `code` = NULL,
    `redirect_uri` = NULL,
    `grant_type` = NULL,

    #' @description
    #' Initialize a new OauthAccessTokenRequestCode class.
    #'
    #' @param code code
    #' @param redirect_uri redirect_uri
    #' @param grant_type grant_type
    #' @param ... Other optional arguments.
    initialize = function(`code`, `redirect_uri`, `grant_type`, ...) {
      if (!missing(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
      }
      if (!missing(`redirect_uri`)) {
        if (!(is.character(`redirect_uri`) && length(`redirect_uri`) == 1)) {
          stop(paste("Error! Invalid data for `redirect_uri`. Must be a string:", `redirect_uri`))
        }
        self$`redirect_uri` <- `redirect_uri`
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
    #' @return OauthAccessTokenRequestCode as a base R list.
    #' @examples
    #' # convert array of OauthAccessTokenRequestCode (x) to a data frame
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
    #' Convert OauthAccessTokenRequestCode to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OauthAccessTokenRequestCodeObject <- list()
      if (!is.null(self$`code`)) {
        OauthAccessTokenRequestCodeObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`redirect_uri`)) {
        OauthAccessTokenRequestCodeObject[["redirect_uri"]] <-
          self$`redirect_uri`
      }
      if (!is.null(self$`grant_type`)) {
        OauthAccessTokenRequestCodeObject[["grant_type"]] <-
          self$`grant_type`
      }
      return(OauthAccessTokenRequestCodeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestCode
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestCode
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`redirect_uri`)) {
        self$`redirect_uri` <- this_object$`redirect_uri`
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
    #' @return OauthAccessTokenRequestCode in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OauthAccessTokenRequestCode
    #'
    #' @param input_json the JSON input
    #' @return the instance of OauthAccessTokenRequestCode
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`redirect_uri` <- this_object$`redirect_uri`
      if (!is.null(this_object$`grant_type`) && !(this_object$`grant_type` %in% c("authorization_code", "refresh_token", "client_credentials"))) {
        stop(paste("Error! \"", this_object$`grant_type`, "\" cannot be assigned to `grant_type`. Must be \"authorization_code\", \"refresh_token\", \"client_credentials\".", sep = ""))
      }
      self$`grant_type` <- this_object$`grant_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to OauthAccessTokenRequestCode and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        if (!(is.character(input_json$`code`) && length(input_json$`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", input_json$`code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestCode: the required field `code` is missing."))
      }
      # check the required field `redirect_uri`
      if (!is.null(input_json$`redirect_uri`)) {
        if (!(is.character(input_json$`redirect_uri`) && length(input_json$`redirect_uri`) == 1)) {
          stop(paste("Error! Invalid data for `redirect_uri`. Must be a string:", input_json$`redirect_uri`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestCode: the required field `redirect_uri` is missing."))
      }
      # check the required field `grant_type`
      if (!is.null(input_json$`grant_type`)) {
        if (!(is.character(input_json$`grant_type`) && length(input_json$`grant_type`) == 1)) {
          stop(paste("Error! Invalid data for `grant_type`. Must be a string:", input_json$`grant_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OauthAccessTokenRequestCode: the required field `grant_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OauthAccessTokenRequestCode
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        return(FALSE)
      }

      # check if the required `redirect_uri` is null
      if (is.null(self$`redirect_uri`)) {
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
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        invalid_fields["code"] <- "Non-nullable required field `code` cannot be null."
      }

      # check if the required `redirect_uri` is null
      if (is.null(self$`redirect_uri`)) {
        invalid_fields["redirect_uri"] <- "Non-nullable required field `redirect_uri` cannot be null."
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
# OauthAccessTokenRequestCode$unlock()
#
## Below is an example to define the print function
# OauthAccessTokenRequestCode$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OauthAccessTokenRequestCode$lock()

