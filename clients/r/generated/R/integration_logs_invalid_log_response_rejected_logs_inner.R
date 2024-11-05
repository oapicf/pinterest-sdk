#' Create a new IntegrationLogsInvalidLogResponseRejectedLogsInner
#'
#' @description
#' IntegrationLogsInvalidLogResponseRejectedLogsInner Class
#'
#' @docType class
#' @title IntegrationLogsInvalidLogResponseRejectedLogsInner
#' @description IntegrationLogsInvalidLogResponseRejectedLogsInner Class
#' @format An \code{R6Class} generator object
#' @field log_index Index of the log in the batch. integer [optional]
#' @field field The field name containing an invalid value. character
#' @field value The value that is invalid. character
#' @field reason The reason the value is invalid. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationLogsInvalidLogResponseRejectedLogsInner <- R6::R6Class(
  "IntegrationLogsInvalidLogResponseRejectedLogsInner",
  public = list(
    `log_index` = NULL,
    `field` = NULL,
    `value` = NULL,
    `reason` = NULL,

    #' @description
    #' Initialize a new IntegrationLogsInvalidLogResponseRejectedLogsInner class.
    #'
    #' @param field The field name containing an invalid value.
    #' @param value The value that is invalid.
    #' @param reason The reason the value is invalid.
    #' @param log_index Index of the log in the batch.
    #' @param ... Other optional arguments.
    initialize = function(`field`, `value`, `reason`, `log_index` = NULL, ...) {
      if (!missing(`field`)) {
        if (!(is.character(`field`) && length(`field`) == 1)) {
          stop(paste("Error! Invalid data for `field`. Must be a string:", `field`))
        }
        self$`field` <- `field`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!missing(`reason`)) {
        if (!(is.character(`reason`) && length(`reason`) == 1)) {
          stop(paste("Error! Invalid data for `reason`. Must be a string:", `reason`))
        }
        self$`reason` <- `reason`
      }
      if (!is.null(`log_index`)) {
        if (!(is.numeric(`log_index`) && length(`log_index`) == 1)) {
          stop(paste("Error! Invalid data for `log_index`. Must be an integer:", `log_index`))
        }
        self$`log_index` <- `log_index`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsInvalidLogResponseRejectedLogsInner in JSON format
    toJSON = function() {
      IntegrationLogsInvalidLogResponseRejectedLogsInnerObject <- list()
      if (!is.null(self$`log_index`)) {
        IntegrationLogsInvalidLogResponseRejectedLogsInnerObject[["log_index"]] <-
          self$`log_index`
      }
      if (!is.null(self$`field`)) {
        IntegrationLogsInvalidLogResponseRejectedLogsInnerObject[["field"]] <-
          self$`field`
      }
      if (!is.null(self$`value`)) {
        IntegrationLogsInvalidLogResponseRejectedLogsInnerObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`reason`)) {
        IntegrationLogsInvalidLogResponseRejectedLogsInnerObject[["reason"]] <-
          self$`reason`
      }
      IntegrationLogsInvalidLogResponseRejectedLogsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponseRejectedLogsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsInvalidLogResponseRejectedLogsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`log_index`)) {
        self$`log_index` <- this_object$`log_index`
      }
      if (!is.null(this_object$`field`)) {
        self$`field` <- this_object$`field`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`reason`)) {
        self$`reason` <- this_object$`reason`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationLogsInvalidLogResponseRejectedLogsInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`log_index`)) {
          sprintf(
          '"log_index":
            %d
                    ',
          self$`log_index`
          )
        },
        if (!is.null(self$`field`)) {
          sprintf(
          '"field":
            "%s"
                    ',
          self$`field`
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`reason`)) {
          sprintf(
          '"reason":
            "%s"
                    ',
          self$`reason`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationLogsInvalidLogResponseRejectedLogsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationLogsInvalidLogResponseRejectedLogsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`log_index` <- this_object$`log_index`
      self$`field` <- this_object$`field`
      self$`value` <- this_object$`value`
      self$`reason` <- this_object$`reason`
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationLogsInvalidLogResponseRejectedLogsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `field`
      if (!is.null(input_json$`field`)) {
        if (!(is.character(input_json$`field`) && length(input_json$`field`) == 1)) {
          stop(paste("Error! Invalid data for `field`. Must be a string:", input_json$`field`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogsInvalidLogResponseRejectedLogsInner: the required field `field` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogsInvalidLogResponseRejectedLogsInner: the required field `value` is missing."))
      }
      # check the required field `reason`
      if (!is.null(input_json$`reason`)) {
        if (!(is.character(input_json$`reason`) && length(input_json$`reason`) == 1)) {
          stop(paste("Error! Invalid data for `reason`. Must be a string:", input_json$`reason`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IntegrationLogsInvalidLogResponseRejectedLogsInner: the required field `reason` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationLogsInvalidLogResponseRejectedLogsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        return(FALSE)
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        return(FALSE)
      }

      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
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
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        invalid_fields["field"] <- "Non-nullable required field `field` cannot be null."
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
      }

      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
        invalid_fields["reason"] <- "Non-nullable required field `reason` cannot be null."
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
# IntegrationLogsInvalidLogResponseRejectedLogsInner$unlock()
#
## Below is an example to define the print function
# IntegrationLogsInvalidLogResponseRejectedLogsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationLogsInvalidLogResponseRejectedLogsInner$lock()

