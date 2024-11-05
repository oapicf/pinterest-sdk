#' Create a new MediaUploadAllOfUploadParameters
#'
#' @description
#' The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
#'
#' @docType class
#' @title MediaUploadAllOfUploadParameters
#' @description MediaUploadAllOfUploadParameters Class
#' @format An \code{R6Class} generator object
#' @field x-amz-date  character [optional]
#' @field x-amz-signature  character [optional]
#' @field x-amz-security-token  character [optional]
#' @field x-amz-algorithm  character [optional]
#' @field key  character [optional]
#' @field policy  character [optional]
#' @field x-amz-credential  character [optional]
#' @field Content-Type  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MediaUploadAllOfUploadParameters <- R6::R6Class(
  "MediaUploadAllOfUploadParameters",
  public = list(
    `x-amz-date` = NULL,
    `x-amz-signature` = NULL,
    `x-amz-security-token` = NULL,
    `x-amz-algorithm` = NULL,
    `key` = NULL,
    `policy` = NULL,
    `x-amz-credential` = NULL,
    `Content-Type` = NULL,

    #' @description
    #' Initialize a new MediaUploadAllOfUploadParameters class.
    #'
    #' @param x-amz-date x-amz-date
    #' @param x-amz-signature x-amz-signature
    #' @param x-amz-security-token x-amz-security-token
    #' @param x-amz-algorithm x-amz-algorithm
    #' @param key key
    #' @param policy policy
    #' @param x-amz-credential x-amz-credential
    #' @param Content-Type Content-Type
    #' @param ... Other optional arguments.
    initialize = function(`x-amz-date` = NULL, `x-amz-signature` = NULL, `x-amz-security-token` = NULL, `x-amz-algorithm` = NULL, `key` = NULL, `policy` = NULL, `x-amz-credential` = NULL, `Content-Type` = NULL, ...) {
      if (!is.null(`x-amz-date`)) {
        if (!(is.character(`x-amz-date`) && length(`x-amz-date`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-date`. Must be a string:", `x-amz-date`))
        }
        self$`x-amz-date` <- `x-amz-date`
      }
      if (!is.null(`x-amz-signature`)) {
        if (!(is.character(`x-amz-signature`) && length(`x-amz-signature`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-signature`. Must be a string:", `x-amz-signature`))
        }
        self$`x-amz-signature` <- `x-amz-signature`
      }
      if (!is.null(`x-amz-security-token`)) {
        if (!(is.character(`x-amz-security-token`) && length(`x-amz-security-token`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-security-token`. Must be a string:", `x-amz-security-token`))
        }
        self$`x-amz-security-token` <- `x-amz-security-token`
      }
      if (!is.null(`x-amz-algorithm`)) {
        if (!(is.character(`x-amz-algorithm`) && length(`x-amz-algorithm`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-algorithm`. Must be a string:", `x-amz-algorithm`))
        }
        self$`x-amz-algorithm` <- `x-amz-algorithm`
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
      if (!is.null(`x-amz-credential`)) {
        if (!(is.character(`x-amz-credential`) && length(`x-amz-credential`) == 1)) {
          stop(paste("Error! Invalid data for `x-amz-credential`. Must be a string:", `x-amz-credential`))
        }
        self$`x-amz-credential` <- `x-amz-credential`
      }
      if (!is.null(`Content-Type`)) {
        if (!(is.character(`Content-Type`) && length(`Content-Type`) == 1)) {
          stop(paste("Error! Invalid data for `Content-Type`. Must be a string:", `Content-Type`))
        }
        self$`Content-Type` <- `Content-Type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MediaUploadAllOfUploadParameters in JSON format
    toJSON = function() {
      MediaUploadAllOfUploadParametersObject <- list()
      if (!is.null(self$`x-amz-date`)) {
        MediaUploadAllOfUploadParametersObject[["x-amz-date"]] <-
          self$`x-amz-date`
      }
      if (!is.null(self$`x-amz-signature`)) {
        MediaUploadAllOfUploadParametersObject[["x-amz-signature"]] <-
          self$`x-amz-signature`
      }
      if (!is.null(self$`x-amz-security-token`)) {
        MediaUploadAllOfUploadParametersObject[["x-amz-security-token"]] <-
          self$`x-amz-security-token`
      }
      if (!is.null(self$`x-amz-algorithm`)) {
        MediaUploadAllOfUploadParametersObject[["x-amz-algorithm"]] <-
          self$`x-amz-algorithm`
      }
      if (!is.null(self$`key`)) {
        MediaUploadAllOfUploadParametersObject[["key"]] <-
          self$`key`
      }
      if (!is.null(self$`policy`)) {
        MediaUploadAllOfUploadParametersObject[["policy"]] <-
          self$`policy`
      }
      if (!is.null(self$`x-amz-credential`)) {
        MediaUploadAllOfUploadParametersObject[["x-amz-credential"]] <-
          self$`x-amz-credential`
      }
      if (!is.null(self$`Content-Type`)) {
        MediaUploadAllOfUploadParametersObject[["Content-Type"]] <-
          self$`Content-Type`
      }
      MediaUploadAllOfUploadParametersObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaUploadAllOfUploadParameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadAllOfUploadParameters
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`x-amz-date`)) {
        self$`x-amz-date` <- this_object$`x-amz-date`
      }
      if (!is.null(this_object$`x-amz-signature`)) {
        self$`x-amz-signature` <- this_object$`x-amz-signature`
      }
      if (!is.null(this_object$`x-amz-security-token`)) {
        self$`x-amz-security-token` <- this_object$`x-amz-security-token`
      }
      if (!is.null(this_object$`x-amz-algorithm`)) {
        self$`x-amz-algorithm` <- this_object$`x-amz-algorithm`
      }
      if (!is.null(this_object$`key`)) {
        self$`key` <- this_object$`key`
      }
      if (!is.null(this_object$`policy`)) {
        self$`policy` <- this_object$`policy`
      }
      if (!is.null(this_object$`x-amz-credential`)) {
        self$`x-amz-credential` <- this_object$`x-amz-credential`
      }
      if (!is.null(this_object$`Content-Type`)) {
        self$`Content-Type` <- this_object$`Content-Type`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MediaUploadAllOfUploadParameters in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`x-amz-date`)) {
          sprintf(
          '"x-amz-date":
            "%s"
                    ',
          self$`x-amz-date`
          )
        },
        if (!is.null(self$`x-amz-signature`)) {
          sprintf(
          '"x-amz-signature":
            "%s"
                    ',
          self$`x-amz-signature`
          )
        },
        if (!is.null(self$`x-amz-security-token`)) {
          sprintf(
          '"x-amz-security-token":
            "%s"
                    ',
          self$`x-amz-security-token`
          )
        },
        if (!is.null(self$`x-amz-algorithm`)) {
          sprintf(
          '"x-amz-algorithm":
            "%s"
                    ',
          self$`x-amz-algorithm`
          )
        },
        if (!is.null(self$`key`)) {
          sprintf(
          '"key":
            "%s"
                    ',
          self$`key`
          )
        },
        if (!is.null(self$`policy`)) {
          sprintf(
          '"policy":
            "%s"
                    ',
          self$`policy`
          )
        },
        if (!is.null(self$`x-amz-credential`)) {
          sprintf(
          '"x-amz-credential":
            "%s"
                    ',
          self$`x-amz-credential`
          )
        },
        if (!is.null(self$`Content-Type`)) {
          sprintf(
          '"Content-Type":
            "%s"
                    ',
          self$`Content-Type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MediaUploadAllOfUploadParameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of MediaUploadAllOfUploadParameters
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`x-amz-date` <- this_object$`x-amz-date`
      self$`x-amz-signature` <- this_object$`x-amz-signature`
      self$`x-amz-security-token` <- this_object$`x-amz-security-token`
      self$`x-amz-algorithm` <- this_object$`x-amz-algorithm`
      self$`key` <- this_object$`key`
      self$`policy` <- this_object$`policy`
      self$`x-amz-credential` <- this_object$`x-amz-credential`
      self$`Content-Type` <- this_object$`Content-Type`
      self
    },

    #' @description
    #' Validate JSON input with respect to MediaUploadAllOfUploadParameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MediaUploadAllOfUploadParameters
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
# MediaUploadAllOfUploadParameters$unlock()
#
## Below is an example to define the print function
# MediaUploadAllOfUploadParameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MediaUploadAllOfUploadParameters$lock()

