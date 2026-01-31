#' Create a new MediaUploadParameters
#'
#' @description
#' MediaUploadParameters Class
#'
#' @docType class
#' @title MediaUploadParameters
#' @description MediaUploadParameters Class
#' @format An \code{R6Class} generator object
#' @field Content-Type  character [optional]
#' @field key  character [optional]
#' @field policy  character [optional]
#' @field x-amz-algorithm  character [optional]
#' @field x-amz-credential  character [optional]
#' @field x-amz-date  character [optional]
#' @field x-amz-security-token  character [optional]
#' @field x-amz-signature  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MediaUploadParameters <- R6::R6Class(
  "MediaUploadParameters",
  public = list(
    `Content-Type` = NULL,
    `key` = NULL,
    `policy` = NULL,
    `x-amz-algorithm` = NULL,
    `x-amz-credential` = NULL,
    `x-amz-date` = NULL,
    `x-amz-security-token` = NULL,
    `x-amz-signature` = NULL,

    #' @description
    #' Initialize a new MediaUploadParameters class.
    #'
    #' @param Content-Type Content-Type
    #' @param key key
    #' @param policy policy
    #' @param x-amz-algorithm x-amz-algorithm
    #' @param x-amz-credential x-amz-credential
    #' @param x-amz-date x-amz-date
    #' @param x-amz-security-token x-amz-security-token
    #' @param x-amz-signature x-amz-signature
    #' @param ... Other optional arguments.
    initialize = function(`Content-Type` = NULL, `key` = NULL, `policy` = NULL, `x-amz-algorithm` = NULL, `x-amz-credential` = NULL, `x-amz-date` = NULL, `x-amz-security-token` = NULL, `x-amz-signature` = NULL, ...) {
      if (!is.null(`Content-Type`)) {
        if (!(is.character(`Content-Type`) && length(`Content-Type`) == 1)) {
          stop(paste("Error! Invalid data for `Content-Type`. Must be a string:", `Content-Type`))
        }
        self$`Content-Type` <- `Content-Type`
      }
      if (!is.null(`key`)) {
        if (!(is.character(`key`) && length(`key`) == 1)) {
          stop(paste("Error! Invalid data for `key`. Must be a string:", `key`))
        }
        self$`key` <- `key`
      }
      if (!is.null(`policy`)) {
        if (!(is.character(`policy`) && length(`policy`) == 1)) {
          stop(paste("Error! Invalid data for `policy`. Must be a string:", `policy`))
        }
        self$`policy` <- `policy`
      }
      if (!is.null(`x-amz-algorithm`)) {
        if (!(is.character(`x-amz-algorithm`) && length(`x-amz-algorithm`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-algorithm`. Must be a string:", `x-amz-algorithm`))
        }
        self$`x-amz-algorithm` <- `x-amz-algorithm`
      }
      if (!is.null(`x-amz-credential`)) {
        if (!(is.character(`x-amz-credential`) && length(`x-amz-credential`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-credential`. Must be a string:", `x-amz-credential`))
        }
        self$`x-amz-credential` <- `x-amz-credential`
      }
      if (!is.null(`x-amz-date`)) {
        if (!(is.character(`x-amz-date`) && length(`x-amz-date`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-date`. Must be a string:", `x-amz-date`))
        }
        self$`x-amz-date` <- `x-amz-date`
      }
      if (!is.null(`x-amz-security-token`)) {
        if (!(is.character(`x-amz-security-token`) && length(`x-amz-security-token`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-security-token`. Must be a string:", `x-amz-security-token`))
        }
        self$`x-amz-security-token` <- `x-amz-security-token`
      }
      if (!is.null(`x-amz-signature`)) {
        if (!(is.character(`x-amz-signature`) && length(`x-amz-signature`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-signature`. Must be a string:", `x-amz-signature`))
        }
        self$`x-amz-signature` <- `x-amz-signature`
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
    #' @return MediaUploadParameters as a base R list.
    #' @examples
    #' # convert array of MediaUploadParameters (x) to a data frame
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
    #' Convert MediaUploadParameters to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MediaUploadParametersObject <- list()
      if (!is.null(self$`Content-Type`)) {
        MediaUploadParametersObject[["Content-Type"]] <-
          self$`Content-Type`
      }
      if (!is.null(self$`key`)) {
        MediaUploadParametersObject[["key"]] <-
          self$`key`
      }
      if (!is.null(self$`policy`)) {
        MediaUploadParametersObject[["policy"]] <-
          self$`policy`
      }
      if (!is.null(self$`x-amz-algorithm`)) {
        MediaUploadParametersObject[["x-amz-algorithm"]] <-
          self$`x-amz-algorithm`
      }
      if (!is.null(self$`x-amz-credential`)) {
        MediaUploadParametersObject[["x-amz-credential"]] <-
          self$`x-amz-credential`
      }
      if (!is.null(self$`x-amz-date`)) {
        MediaUploadParametersObject[["x-amz-date"]] <-
          self$`x-amz-date`
      }
      if (!is.null(self$`x-amz-security-token`)) {
        MediaUploadParametersObject[["x-amz-security-token"]] <-
          self$`x-amz-security-token`
      }
      if (!is.null(self$`x-amz-signature`)) {
        MediaUploadParametersObject[["x-amz-signature"]] <-
          self$`x-amz-signature`
      }
      return(MediaUploadParametersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaUploadParameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadParameters
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`Content-Type`)) {
        self$`Content-Type` <- this_object$`Content-Type`
      }
      if (!is.null(this_object$`key`)) {
        self$`key` <- this_object$`key`
      }
      if (!is.null(this_object$`policy`)) {
        self$`policy` <- this_object$`policy`
      }
      if (!is.null(this_object$`x-amz-algorithm`)) {
        self$`x-amz-algorithm` <- this_object$`x-amz-algorithm`
      }
      if (!is.null(this_object$`x-amz-credential`)) {
        self$`x-amz-credential` <- this_object$`x-amz-credential`
      }
      if (!is.null(this_object$`x-amz-date`)) {
        self$`x-amz-date` <- this_object$`x-amz-date`
      }
      if (!is.null(this_object$`x-amz-security-token`)) {
        self$`x-amz-security-token` <- this_object$`x-amz-security-token`
      }
      if (!is.null(this_object$`x-amz-signature`)) {
        self$`x-amz-signature` <- this_object$`x-amz-signature`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MediaUploadParameters in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaUploadParameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadParameters
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`Content-Type` <- this_object$`Content-Type`
      self$`key` <- this_object$`key`
      self$`policy` <- this_object$`policy`
      self$`x-amz-algorithm` <- this_object$`x-amz-algorithm`
      self$`x-amz-credential` <- this_object$`x-amz-credential`
      self$`x-amz-date` <- this_object$`x-amz-date`
      self$`x-amz-security-token` <- this_object$`x-amz-security-token`
      self$`x-amz-signature` <- this_object$`x-amz-signature`
      self
    },

    #' @description
    #' Validate JSON input with respect to MediaUploadParameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MediaUploadParameters
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# MediaUploadParameters$unlock()
#
## Below is an example to define the print function
# MediaUploadParameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MediaUploadParameters$lock()

