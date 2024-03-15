#' Create a new IntegrationLogClientError
#'
#' @description
#' System error details included in the log sent by the client.
#'
#' @docType class
#' @title IntegrationLogClientError
#' @description IntegrationLogClientError Class
#' @format An \code{R6Class} generator object
#' @field cause Original cause of the error. character [optional]
#' @field column_number Column number in the line of the file that raised the error. integer [optional]
#' @field file_name Filename where the error happened. character [optional]
#' @field line_number Line number where the error happened. integer [optional]
#' @field message Human-readable description of the error. character [optional]
#' @field message_detail More detail about the message. character [optional]
#' @field name Filename where the error happened. character [optional]
#' @field number Integer that specifies the error code. integer [optional]
#' @field stack_trace Stack trace of where the error happened. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLogClientError <- R6::R6Class(
  "IntegrationLogClientError",
  public = list(
    `cause` = NULL,
    `column_number` = NULL,
    `file_name` = NULL,
    `line_number` = NULL,
    `message` = NULL,
    `message_detail` = NULL,
    `name` = NULL,
    `number` = NULL,
    `stack_trace` = NULL,
    #' Initialize a new IntegrationLogClientError class.
    #'
    #' @description
    #' Initialize a new IntegrationLogClientError class.
    #'
    #' @param cause Original cause of the error.
    #' @param column_number Column number in the line of the file that raised the error.
    #' @param file_name Filename where the error happened.
    #' @param line_number Line number where the error happened.
    #' @param message Human-readable description of the error.
    #' @param message_detail More detail about the message.
    #' @param name Filename where the error happened.
    #' @param number Integer that specifies the error code.
    #' @param stack_trace Stack trace of where the error happened.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`cause` = NULL, `column_number` = NULL, `file_name` = NULL, `line_number` = NULL, `message` = NULL, `message_detail` = NULL, `name` = NULL, `number` = NULL, `stack_trace` = NULL, ...) {
      if (!is.null(`cause`)) {
        if (!(is.character(`cause`) && length(`cause`) == 1)) {
          stop(paste("Error! Invalid data for `cause`. Must be a string:", `cause`))
        }
        self$`cause` <- `cause`
      }
      if (!is.null(`column_number`)) {
        if (!(is.numeric(`column_number`) && length(`column_number`) == 1)) {
          stop(paste("Error! Invalid data for `column_number`. Must be an integer:", `column_number`))
        }
        self$`column_number` <- `column_number`
      }
      if (!is.null(`file_name`)) {
        if (!(is.character(`file_name`) && length(`file_name`) == 1)) {
          stop(paste("Error! Invalid data for `file_name`. Must be a string:", `file_name`))
        }
        self$`file_name` <- `file_name`
      }
      if (!is.null(`line_number`)) {
        if (!(is.numeric(`line_number`) && length(`line_number`) == 1)) {
          stop(paste("Error! Invalid data for `line_number`. Must be an integer:", `line_number`))
        }
        self$`line_number` <- `line_number`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`message_detail`)) {
        if (!(is.character(`message_detail`) && length(`message_detail`) == 1)) {
          stop(paste("Error! Invalid data for `message_detail`. Must be a string:", `message_detail`))
        }
        self$`message_detail` <- `message_detail`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`number`)) {
        if (!(is.numeric(`number`) && length(`number`) == 1)) {
          stop(paste("Error! Invalid data for `number`. Must be an integer:", `number`))
        }
        self$`number` <- `number`
      }
      if (!is.null(`stack_trace`)) {
        if (!(is.character(`stack_trace`) && length(`stack_trace`) == 1)) {
          stop(paste("Error! Invalid data for `stack_trace`. Must be a string:", `stack_trace`))
        }
        self$`stack_trace` <- `stack_trace`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogClientError in JSON format
    #' @export
    toJSON = function() {
      IntegrationLogClientErrorObject <- list()
      if (!is.null(self$`cause`)) {
        IntegrationLogClientErrorObject[["cause"]] <-
          self$`cause`
      }
      if (!is.null(self$`column_number`)) {
        IntegrationLogClientErrorObject[["column_number"]] <-
          self$`column_number`
      }
      if (!is.null(self$`file_name`)) {
        IntegrationLogClientErrorObject[["file_name"]] <-
          self$`file_name`
      }
      if (!is.null(self$`line_number`)) {
        IntegrationLogClientErrorObject[["line_number"]] <-
          self$`line_number`
      }
      if (!is.null(self$`message`)) {
        IntegrationLogClientErrorObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`message_detail`)) {
        IntegrationLogClientErrorObject[["message_detail"]] <-
          self$`message_detail`
      }
      if (!is.null(self$`name`)) {
        IntegrationLogClientErrorObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`number`)) {
        IntegrationLogClientErrorObject[["number"]] <-
          self$`number`
      }
      if (!is.null(self$`stack_trace`)) {
        IntegrationLogClientErrorObject[["stack_trace"]] <-
          self$`stack_trace`
      }
      IntegrationLogClientErrorObject
    },
    #' Deserialize JSON string into an instance of IntegrationLogClientError
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogClientError
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogClientError
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cause`)) {
        self$`cause` <- this_object$`cause`
      }
      if (!is.null(this_object$`column_number`)) {
        self$`column_number` <- this_object$`column_number`
      }
      if (!is.null(this_object$`file_name`)) {
        self$`file_name` <- this_object$`file_name`
      }
      if (!is.null(this_object$`line_number`)) {
        self$`line_number` <- this_object$`line_number`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`message_detail`)) {
        self$`message_detail` <- this_object$`message_detail`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`number`)) {
        self$`number` <- this_object$`number`
      }
      if (!is.null(this_object$`stack_trace`)) {
        self$`stack_trace` <- this_object$`stack_trace`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogClientError in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`cause`)) {
          sprintf(
          '"cause":
            "%s"
                    ',
          self$`cause`
          )
        },
        if (!is.null(self$`column_number`)) {
          sprintf(
          '"column_number":
            %d
                    ',
          self$`column_number`
          )
        },
        if (!is.null(self$`file_name`)) {
          sprintf(
          '"file_name":
            "%s"
                    ',
          self$`file_name`
          )
        },
        if (!is.null(self$`line_number`)) {
          sprintf(
          '"line_number":
            %d
                    ',
          self$`line_number`
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
        if (!is.null(self$`message_detail`)) {
          sprintf(
          '"message_detail":
            "%s"
                    ',
          self$`message_detail`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`number`)) {
          sprintf(
          '"number":
            %d
                    ',
          self$`number`
          )
        },
        if (!is.null(self$`stack_trace`)) {
          sprintf(
          '"stack_trace":
            "%s"
                    ',
          self$`stack_trace`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of IntegrationLogClientError
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogClientError
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogClientError
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cause` <- this_object$`cause`
      self$`column_number` <- this_object$`column_number`
      self$`file_name` <- this_object$`file_name`
      self$`line_number` <- this_object$`line_number`
      self$`message` <- this_object$`message`
      self$`message_detail` <- this_object$`message_detail`
      self$`name` <- this_object$`name`
      self$`number` <- this_object$`number`
      self$`stack_trace` <- this_object$`stack_trace`
      self
    },
    #' Validate JSON input with respect to IntegrationLogClientError
    #'
    #' @description
    #' Validate JSON input with respect to IntegrationLogClientError and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogClientError
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
      if (nchar(self$`cause`) > 512) {
        return(FALSE)
      }

      if (nchar(self$`file_name`) > 256) {
        return(FALSE)
      }

      if (nchar(self$`message`) > 512) {
        return(FALSE)
      }

      if (nchar(self$`message_detail`) > 1024) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 256) {
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
      if (nchar(self$`cause`) > 512) {
        invalid_fields["cause"] <- "Invalid length for `cause`, must be smaller than or equal to 512."
      }

      if (nchar(self$`file_name`) > 256) {
        invalid_fields["file_name"] <- "Invalid length for `file_name`, must be smaller than or equal to 256."
      }

      if (nchar(self$`message`) > 512) {
        invalid_fields["message"] <- "Invalid length for `message`, must be smaller than or equal to 512."
      }

      if (nchar(self$`message_detail`) > 1024) {
        invalid_fields["message_detail"] <- "Invalid length for `message_detail`, must be smaller than or equal to 1024."
      }

      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
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
# IntegrationLogClientError$unlock()
#
## Below is an example to define the print function
# IntegrationLogClientError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogClientError$lock()

