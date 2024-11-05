#' Create a new DetailedError
#'
#' @description
#' Used for including extra details to a base error
#'
#' @docType class
#' @title DetailedError
#' @description DetailedError Class
#' @format An \code{R6Class} generator object
#' @field code  integer
#' @field message  character
#' @field details  object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DetailedError <- R6::R6Class(
  "DetailedError",
  public = list(
    `code` = NULL,
    `message` = NULL,
    `details` = NULL,

    #' @description
    #' Initialize a new DetailedError class.
    #'
    #' @param code code
    #' @param message message
    #' @param details details
    #' @param ... Other optional arguments.
    initialize = function(`code`, `message`, `details`, ...) {
      if (!missing(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!missing(`details`)) {
        self$`details` <- `details`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DetailedError in JSON format
    toJSON = function() {
      DetailedErrorObject <- list()
      if (!is.null(self$`code`)) {
        DetailedErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        DetailedErrorObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`details`)) {
        DetailedErrorObject[["details"]] <-
          self$`details`
      }
      DetailedErrorObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DetailedError
    #'
    #' @param input_json the JSON input
    #' @return the instance of DetailedError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`details`)) {
        self$`details` <- this_object$`details`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DetailedError in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            %d
                    ',
          self$`code`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        },
        if (!is.null(self$`details`)) {
          sprintf(
          '"details":
            "%s"
                    ',
          self$`details`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DetailedError
    #'
    #' @param input_json the JSON input
    #' @return the instance of DetailedError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self$`details` <- this_object$`details`
      self
    },

    #' @description
    #' Validate JSON input with respect to DetailedError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        if (!(is.numeric(input_json$`code`) && length(input_json$`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", input_json$`code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DetailedError: the required field `code` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DetailedError: the required field `message` is missing."))
      }
      # check the required field `details`
      if (!is.null(input_json$`details`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DetailedError: the required field `details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DetailedError
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

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        return(FALSE)
      }

      # check if the required `details` is null
      if (is.null(self$`details`)) {
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

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
      }

      # check if the required `details` is null
      if (is.null(self$`details`)) {
        invalid_fields["details"] <- "Non-nullable required field `details` cannot be null."
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
# DetailedError$unlock()
#
## Below is an example to define the print function
# DetailedError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DetailedError$lock()

