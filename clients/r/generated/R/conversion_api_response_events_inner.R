#' Create a new ConversionApiResponseEventsInner
#'
#' @description
#' ConversionApiResponseEventsInner Class
#'
#' @docType class
#' @title ConversionApiResponseEventsInner
#' @description ConversionApiResponseEventsInner Class
#' @format An \code{R6Class} generator object
#' @field status Whether the event was processed successfully. character
#' @field error_message Error message containing more information about why the event failed to be processed. character [optional]
#' @field warning_message Warning messages about any fields in the event which are not standard. These are not critical to event processing. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionApiResponseEventsInner <- R6::R6Class(
  "ConversionApiResponseEventsInner",
  public = list(
    `status` = NULL,
    `error_message` = NULL,
    `warning_message` = NULL,
    #' Initialize a new ConversionApiResponseEventsInner class.
    #'
    #' @description
    #' Initialize a new ConversionApiResponseEventsInner class.
    #'
    #' @param status Whether the event was processed successfully.
    #' @param error_message Error message containing more information about why the event failed to be processed.
    #' @param warning_message Warning messages about any fields in the event which are not standard. These are not critical to event processing.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status`, `error_message` = NULL, `warning_message` = NULL, ...) {
      if (!missing(`status`)) {
        if (!(`status` %in% c("failed", "processed"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"failed\", \"processed\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`error_message`)) {
        if (!(is.character(`error_message`) && length(`error_message`) == 1)) {
          stop(paste("Error! Invalid data for `error_message`. Must be a string:", `error_message`))
        }
        self$`error_message` <- `error_message`
      }
      if (!is.null(`warning_message`)) {
        if (!(is.character(`warning_message`) && length(`warning_message`) == 1)) {
          stop(paste("Error! Invalid data for `warning_message`. Must be a string:", `warning_message`))
        }
        self$`warning_message` <- `warning_message`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionApiResponseEventsInner in JSON format
    #' @export
    toJSON = function() {
      ConversionApiResponseEventsInnerObject <- list()
      if (!is.null(self$`status`)) {
        ConversionApiResponseEventsInnerObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`error_message`)) {
        ConversionApiResponseEventsInnerObject[["error_message"]] <-
          self$`error_message`
      }
      if (!is.null(self$`warning_message`)) {
        ConversionApiResponseEventsInnerObject[["warning_message"]] <-
          self$`warning_message`
      }
      ConversionApiResponseEventsInnerObject
    },
    #' Deserialize JSON string into an instance of ConversionApiResponseEventsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionApiResponseEventsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionApiResponseEventsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("failed", "processed"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"failed\", \"processed\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`error_message`)) {
        self$`error_message` <- this_object$`error_message`
      }
      if (!is.null(this_object$`warning_message`)) {
        self$`warning_message` <- this_object$`warning_message`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionApiResponseEventsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`error_message`)) {
          sprintf(
          '"error_message":
            "%s"
                    ',
          self$`error_message`
          )
        },
        if (!is.null(self$`warning_message`)) {
          sprintf(
          '"warning_message":
            "%s"
                    ',
          self$`warning_message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ConversionApiResponseEventsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionApiResponseEventsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionApiResponseEventsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("failed", "processed"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"failed\", \"processed\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`error_message` <- this_object$`error_message`
      self$`warning_message` <- this_object$`warning_message`
      self
    },
    #' Validate JSON input with respect to ConversionApiResponseEventsInner
    #'
    #' @description
    #' Validate JSON input with respect to ConversionApiResponseEventsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionApiResponseEventsInner: the required field `status` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionApiResponseEventsInner
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
      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# ConversionApiResponseEventsInner$unlock()
#
## Below is an example to define the print function
# ConversionApiResponseEventsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionApiResponseEventsInner$lock()

