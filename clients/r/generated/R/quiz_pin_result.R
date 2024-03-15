#' Create a new QuizPinResult
#'
#' @description
#' The result, and link out, based on the user’s choice.
#'
#' @docType class
#' @title QuizPinResult
#' @description QuizPinResult Class
#' @format An \code{R6Class} generator object
#' @field organic_pin_id  character [optional]
#' @field android_deep_link  character [optional]
#' @field ios_deep_link  character [optional]
#' @field destination_url  character [optional]
#' @field result_id  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuizPinResult <- R6::R6Class(
  "QuizPinResult",
  public = list(
    `organic_pin_id` = NULL,
    `android_deep_link` = NULL,
    `ios_deep_link` = NULL,
    `destination_url` = NULL,
    `result_id` = NULL,
    #' Initialize a new QuizPinResult class.
    #'
    #' @description
    #' Initialize a new QuizPinResult class.
    #'
    #' @param organic_pin_id organic_pin_id
    #' @param android_deep_link android_deep_link
    #' @param ios_deep_link ios_deep_link
    #' @param destination_url destination_url
    #' @param result_id result_id
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`organic_pin_id` = NULL, `android_deep_link` = NULL, `ios_deep_link` = NULL, `destination_url` = NULL, `result_id` = NULL, ...) {
      if (!is.null(`organic_pin_id`)) {
        if (!(is.character(`organic_pin_id`) && length(`organic_pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `organic_pin_id`. Must be a string:", `organic_pin_id`))
        }
        self$`organic_pin_id` <- `organic_pin_id`
      }
      if (!is.null(`android_deep_link`)) {
        if (!(is.character(`android_deep_link`) && length(`android_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `android_deep_link`. Must be a string:", `android_deep_link`))
        }
        self$`android_deep_link` <- `android_deep_link`
      }
      if (!is.null(`ios_deep_link`)) {
        if (!(is.character(`ios_deep_link`) && length(`ios_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `ios_deep_link`. Must be a string:", `ios_deep_link`))
        }
        self$`ios_deep_link` <- `ios_deep_link`
      }
      if (!is.null(`destination_url`)) {
        if (!(is.character(`destination_url`) && length(`destination_url`) == 1)) {
          stop(paste("Error! Invalid data for `destination_url`. Must be a string:", `destination_url`))
        }
        self$`destination_url` <- `destination_url`
      }
      if (!is.null(`result_id`)) {
        self$`result_id` <- `result_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuizPinResult in JSON format
    #' @export
    toJSON = function() {
      QuizPinResultObject <- list()
      if (!is.null(self$`organic_pin_id`)) {
        QuizPinResultObject[["organic_pin_id"]] <-
          self$`organic_pin_id`
      }
      if (!is.null(self$`android_deep_link`)) {
        QuizPinResultObject[["android_deep_link"]] <-
          self$`android_deep_link`
      }
      if (!is.null(self$`ios_deep_link`)) {
        QuizPinResultObject[["ios_deep_link"]] <-
          self$`ios_deep_link`
      }
      if (!is.null(self$`destination_url`)) {
        QuizPinResultObject[["destination_url"]] <-
          self$`destination_url`
      }
      if (!is.null(self$`result_id`)) {
        QuizPinResultObject[["result_id"]] <-
          self$`result_id`
      }
      QuizPinResultObject
    },
    #' Deserialize JSON string into an instance of QuizPinResult
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuizPinResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinResult
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`organic_pin_id`)) {
        self$`organic_pin_id` <- this_object$`organic_pin_id`
      }
      if (!is.null(this_object$`android_deep_link`)) {
        self$`android_deep_link` <- this_object$`android_deep_link`
      }
      if (!is.null(this_object$`ios_deep_link`)) {
        self$`ios_deep_link` <- this_object$`ios_deep_link`
      }
      if (!is.null(this_object$`destination_url`)) {
        self$`destination_url` <- this_object$`destination_url`
      }
      if (!is.null(this_object$`result_id`)) {
        self$`result_id` <- this_object$`result_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuizPinResult in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`organic_pin_id`)) {
          sprintf(
          '"organic_pin_id":
            "%s"
                    ',
          self$`organic_pin_id`
          )
        },
        if (!is.null(self$`android_deep_link`)) {
          sprintf(
          '"android_deep_link":
            "%s"
                    ',
          self$`android_deep_link`
          )
        },
        if (!is.null(self$`ios_deep_link`)) {
          sprintf(
          '"ios_deep_link":
            "%s"
                    ',
          self$`ios_deep_link`
          )
        },
        if (!is.null(self$`destination_url`)) {
          sprintf(
          '"destination_url":
            "%s"
                    ',
          self$`destination_url`
          )
        },
        if (!is.null(self$`result_id`)) {
          sprintf(
          '"result_id":
            %d
                    ',
          self$`result_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QuizPinResult
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuizPinResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinResult
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`organic_pin_id` <- this_object$`organic_pin_id`
      self$`android_deep_link` <- this_object$`android_deep_link`
      self$`ios_deep_link` <- this_object$`ios_deep_link`
      self$`destination_url` <- this_object$`destination_url`
      self$`result_id` <- this_object$`result_id`
      self
    },
    #' Validate JSON input with respect to QuizPinResult
    #'
    #' @description
    #' Validate JSON input with respect to QuizPinResult and throw an exception if invalid
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
    #' @return String representation of QuizPinResult
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
# QuizPinResult$unlock()
#
## Below is an example to define the print function
# QuizPinResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuizPinResult$lock()

