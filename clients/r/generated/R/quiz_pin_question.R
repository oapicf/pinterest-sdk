#' Create a new QuizPinQuestion
#'
#' @description
#' A specific quiz inquiry.
#'
#' @docType class
#' @title QuizPinQuestion
#' @description QuizPinQuestion Class
#' @format An \code{R6Class} generator object
#' @field question_id  numeric [optional]
#' @field question_text  character [optional]
#' @field options  list(\link{QuizPinOption}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuizPinQuestion <- R6::R6Class(
  "QuizPinQuestion",
  public = list(
    `question_id` = NULL,
    `question_text` = NULL,
    `options` = NULL,
    #' Initialize a new QuizPinQuestion class.
    #'
    #' @description
    #' Initialize a new QuizPinQuestion class.
    #'
    #' @param question_id question_id
    #' @param question_text question_text
    #' @param options options
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`question_id` = NULL, `question_text` = NULL, `options` = NULL, ...) {
      if (!is.null(`question_id`)) {
        self$`question_id` <- `question_id`
      }
      if (!is.null(`question_text`)) {
        if (!(is.character(`question_text`) && length(`question_text`) == 1)) {
          stop(paste("Error! Invalid data for `question_text`. Must be a string:", `question_text`))
        }
        self$`question_text` <- `question_text`
      }
      if (!is.null(`options`)) {
        stopifnot(is.vector(`options`), length(`options`) != 0)
        sapply(`options`, function(x) stopifnot(R6::is.R6(x)))
        self$`options` <- `options`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuizPinQuestion in JSON format
    #' @export
    toJSON = function() {
      QuizPinQuestionObject <- list()
      if (!is.null(self$`question_id`)) {
        QuizPinQuestionObject[["question_id"]] <-
          self$`question_id`
      }
      if (!is.null(self$`question_text`)) {
        QuizPinQuestionObject[["question_text"]] <-
          self$`question_text`
      }
      if (!is.null(self$`options`)) {
        QuizPinQuestionObject[["options"]] <-
          lapply(self$`options`, function(x) x$toJSON())
      }
      QuizPinQuestionObject
    },
    #' Deserialize JSON string into an instance of QuizPinQuestion
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuizPinQuestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinQuestion
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`question_id`)) {
        self$`question_id` <- this_object$`question_id`
      }
      if (!is.null(this_object$`question_text`)) {
        self$`question_text` <- this_object$`question_text`
      }
      if (!is.null(this_object$`options`)) {
        self$`options` <- ApiClient$new()$deserializeObj(this_object$`options`, "array[QuizPinOption]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuizPinQuestion in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`question_id`)) {
          sprintf(
          '"question_id":
            %d
                    ',
          self$`question_id`
          )
        },
        if (!is.null(self$`question_text`)) {
          sprintf(
          '"question_text":
            "%s"
                    ',
          self$`question_text`
          )
        },
        if (!is.null(self$`options`)) {
          sprintf(
          '"options":
          [%s]
',
          paste(sapply(self$`options`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QuizPinQuestion
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuizPinQuestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinQuestion
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`question_id` <- this_object$`question_id`
      self$`question_text` <- this_object$`question_text`
      self$`options` <- ApiClient$new()$deserializeObj(this_object$`options`, "array[QuizPinOption]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to QuizPinQuestion
    #'
    #' @description
    #' Validate JSON input with respect to QuizPinQuestion and throw an exception if invalid
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
    #' @return String representation of QuizPinQuestion
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
# QuizPinQuestion$unlock()
#
## Below is an example to define the print function
# QuizPinQuestion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuizPinQuestion$lock()

