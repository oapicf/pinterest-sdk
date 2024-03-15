#' Create a new ItemValidationEvent
#'
#' @description
#' Object describing an item validation event
#'
#' @docType class
#' @title ItemValidationEvent
#' @description ItemValidationEvent Class
#' @format An \code{R6Class} generator object
#' @field attribute The attribute that the item validation event references character [optional]
#' @field code The event code that the item validation event references integer [optional]
#' @field message Title message describing the item validation event character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemValidationEvent <- R6::R6Class(
  "ItemValidationEvent",
  public = list(
    `attribute` = NULL,
    `code` = NULL,
    `message` = NULL,
    #' Initialize a new ItemValidationEvent class.
    #'
    #' @description
    #' Initialize a new ItemValidationEvent class.
    #'
    #' @param attribute The attribute that the item validation event references
    #' @param code The event code that the item validation event references
    #' @param message Title message describing the item validation event
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`attribute` = NULL, `code` = NULL, `message` = NULL, ...) {
      if (!is.null(`attribute`)) {
        if (!(is.character(`attribute`) && length(`attribute`) == 1)) {
          stop(paste("Error! Invalid data for `attribute`. Must be a string:", `attribute`))
        }
        self$`attribute` <- `attribute`
      }
      if (!is.null(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemValidationEvent in JSON format
    #' @export
    toJSON = function() {
      ItemValidationEventObject <- list()
      if (!is.null(self$`attribute`)) {
        ItemValidationEventObject[["attribute"]] <-
          self$`attribute`
      }
      if (!is.null(self$`code`)) {
        ItemValidationEventObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        ItemValidationEventObject[["message"]] <-
          self$`message`
      }
      ItemValidationEventObject
    },
    #' Deserialize JSON string into an instance of ItemValidationEvent
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemValidationEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemValidationEvent
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attribute`)) {
        self$`attribute` <- this_object$`attribute`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemValidationEvent in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`attribute`)) {
          sprintf(
          '"attribute":
            "%s"
                    ',
          self$`attribute`
          )
        },
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ItemValidationEvent
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemValidationEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemValidationEvent
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attribute` <- this_object$`attribute`
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },
    #' Validate JSON input with respect to ItemValidationEvent
    #'
    #' @description
    #' Validate JSON input with respect to ItemValidationEvent and throw an exception if invalid
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
    #' @return String representation of ItemValidationEvent
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
# ItemValidationEvent$unlock()
#
## Below is an example to define the print function
# ItemValidationEvent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemValidationEvent$lock()

