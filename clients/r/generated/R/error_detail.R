#' Create a new ErrorDetail
#'
#' @description
#' ErrorDetail Class
#'
#' @docType class
#' @title ErrorDetail
#' @description ErrorDetail Class
#' @format An \code{R6Class} generator object
#' @field count Number of records with this error integer
#' @field error_code Numeric error code integer
#' @field message Error message description character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ErrorDetail <- R6::R6Class(
  "ErrorDetail",
  public = list(
    `count` = NULL,
    `error_code` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new ErrorDetail class.
    #'
    #' @param count Number of records with this error
    #' @param error_code Numeric error code
    #' @param message Error message description
    #' @param ... Other optional arguments.
    initialize = function(`count`, `error_code`, `message`, ...) {
      if (!missing(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!missing(`error_code`)) {
        if (!(is.numeric(`error_code`) && length(`error_code`) == 1)) {
          stop(paste("Error! Invalid data for `error_code`. Must be an integer:", `error_code`))
        }
        self$`error_code` <- `error_code`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
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
    #' @return ErrorDetail as a base R list.
    #' @examples
    #' # convert array of ErrorDetail (x) to a data frame
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
    #' Convert ErrorDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ErrorDetailObject <- list()
      if (!is.null(self$`count`)) {
        ErrorDetailObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`error_code`)) {
        ErrorDetailObject[["error_code"]] <-
          self$`error_code`
      }
      if (!is.null(self$`message`)) {
        ErrorDetailObject[["message"]] <-
          self$`message`
      }
      return(ErrorDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ErrorDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ErrorDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`error_code`)) {
        self$`error_code` <- this_object$`error_code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ErrorDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ErrorDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ErrorDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`count` <- this_object$`count`
      self$`error_code` <- this_object$`error_code`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to ErrorDetail and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `count`
      if (!is.null(input_json$`count`)) {
        if (!(is.numeric(input_json$`count`) && length(input_json$`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", input_json$`count`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ErrorDetail: the required field `count` is missing."))
      }
      # check the required field `error_code`
      if (!is.null(input_json$`error_code`)) {
        if (!(is.numeric(input_json$`error_code`) && length(input_json$`error_code`) == 1)) {
          stop(paste("Error! Invalid data for `error_code`. Must be an integer:", input_json$`error_code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ErrorDetail: the required field `error_code` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ErrorDetail: the required field `message` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ErrorDetail
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `count` is null
      if (is.null(self$`count`)) {
        return(FALSE)
      }

      # check if the required `error_code` is null
      if (is.null(self$`error_code`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `count` is null
      if (is.null(self$`count`)) {
        invalid_fields["count"] <- "Non-nullable required field `count` cannot be null."
      }

      # check if the required `error_code` is null
      if (is.null(self$`error_code`)) {
        invalid_fields["error_code"] <- "Non-nullable required field `error_code` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# ErrorDetail$unlock()
#
## Below is an example to define the print function
# ErrorDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ErrorDetail$lock()

