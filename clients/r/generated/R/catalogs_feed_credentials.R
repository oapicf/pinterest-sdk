#' Create a new CatalogsFeedCredentials
#'
#' @description
#' This field is **OPTIONAL**. Use this if your feed file requires username and password.
#'
#' @docType class
#' @title CatalogsFeedCredentials
#' @description CatalogsFeedCredentials Class
#' @format An \code{R6Class} generator object
#' @field password The required password for downloading a feed. character
#' @field username The required username for downloading a feed. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedCredentials <- R6::R6Class(
  "CatalogsFeedCredentials",
  public = list(
    `password` = NULL,
    `username` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedCredentials class.
    #'
    #' @param password The required password for downloading a feed.
    #' @param username The required username for downloading a feed.
    #' @param ... Other optional arguments.
    initialize = function(`password`, `username`, ...) {
      if (!missing(`password`)) {
        if (!(is.character(`password`) && length(`password`) == 1)) {
          stop(paste("Error! Invalid data for `password`. Must be a string:", `password`))
        }
        self$`password` <- `password`
      }
      if (!missing(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedCredentials in JSON format
    toJSON = function() {
      CatalogsFeedCredentialsObject <- list()
      if (!is.null(self$`password`)) {
        CatalogsFeedCredentialsObject[["password"]] <-
          self$`password`
      }
      if (!is.null(self$`username`)) {
        CatalogsFeedCredentialsObject[["username"]] <-
          self$`username`
      }
      CatalogsFeedCredentialsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedCredentials
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedCredentials
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`password`)) {
        self$`password` <- this_object$`password`
      }
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedCredentials in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`password`)) {
          sprintf(
          '"password":
            "%s"
                    ',
          self$`password`
          )
        },
        if (!is.null(self$`username`)) {
          sprintf(
          '"username":
            "%s"
                    ',
          self$`username`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedCredentials
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedCredentials
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`password` <- this_object$`password`
      self$`username` <- this_object$`username`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedCredentials and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `password`
      if (!is.null(input_json$`password`)) {
        if (!(is.character(input_json$`password`) && length(input_json$`password`) == 1)) {
          stop(paste("Error! Invalid data for `password`. Must be a string:", input_json$`password`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedCredentials: the required field `password` is missing."))
      }
      # check the required field `username`
      if (!is.null(input_json$`username`)) {
        if (!(is.character(input_json$`username`) && length(input_json$`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", input_json$`username`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedCredentials: the required field `username` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedCredentials
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `password` is null
      if (is.null(self$`password`)) {
        return(FALSE)
      }

      # check if the required `username` is null
      if (is.null(self$`username`)) {
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
      # check if the required `password` is null
      if (is.null(self$`password`)) {
        invalid_fields["password"] <- "Non-nullable required field `password` cannot be null."
      }

      # check if the required `username` is null
      if (is.null(self$`username`)) {
        invalid_fields["username"] <- "Non-nullable required field `username` cannot be null."
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
# CatalogsFeedCredentials$unlock()
#
## Below is an example to define the print function
# CatalogsFeedCredentials$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedCredentials$lock()

