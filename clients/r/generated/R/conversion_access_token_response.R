#' Create a new ConversionAccessTokenResponse
#'
#' @description
#' A successful conversion access token response.
#'
#' @docType class
#' @title ConversionAccessTokenResponse
#' @description ConversionAccessTokenResponse Class
#' @format An \code{R6Class} generator object
#' @field access_token  character
#' @field token_type  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionAccessTokenResponse <- R6::R6Class(
  "ConversionAccessTokenResponse",
  public = list(
    `access_token` = NULL,
    `token_type` = NULL,

    #' @description
    #' Initialize a new ConversionAccessTokenResponse class.
    #'
    #' @param access_token access_token
    #' @param token_type token_type. Default to "conversion".
    #' @param ... Other optional arguments.
    initialize = function(`access_token`, `token_type` = "conversion", ...) {
      if (!missing(`access_token`)) {
        if (!(is.character(`access_token`) && length(`access_token`) == 1)) {
          stop(paste("Error! Invalid data for `access_token`. Must be a string:", `access_token`))
        }
        self$`access_token` <- `access_token`
      }
      if (!is.null(`token_type`)) {
        if (!(is.character(`token_type`) && length(`token_type`) == 1)) {
          stop(paste("Error! Invalid data for `token_type`. Must be a string:", `token_type`))
        }
        self$`token_type` <- `token_type`
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
    #' @return ConversionAccessTokenResponse as a base R list.
    #' @examples
    #' # convert array of ConversionAccessTokenResponse (x) to a data frame
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
    #' Convert ConversionAccessTokenResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionAccessTokenResponseObject <- list()
      if (!is.null(self$`access_token`)) {
        ConversionAccessTokenResponseObject[["access_token"]] <-
          self$`access_token`
      }
      if (!is.null(self$`token_type`)) {
        ConversionAccessTokenResponseObject[["token_type"]] <-
          self$`token_type`
      }
      return(ConversionAccessTokenResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionAccessTokenResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionAccessTokenResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`access_token`)) {
        self$`access_token` <- this_object$`access_token`
      }
      if (!is.null(this_object$`token_type`)) {
        self$`token_type` <- this_object$`token_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionAccessTokenResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionAccessTokenResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionAccessTokenResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`access_token` <- this_object$`access_token`
      self$`token_type` <- this_object$`token_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionAccessTokenResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ConversionAccessTokenResponse: the required field `access_token` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionAccessTokenResponse
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
# ConversionAccessTokenResponse$unlock()
#
## Below is an example to define the print function
# ConversionAccessTokenResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionAccessTokenResponse$lock()

