#' Create a new QuizPinData
#'
#' @description
#' This field includes all quiz data including questions, options, and results.
#'
#' @docType class
#' @title QuizPinData
#' @description QuizPinData Class
#' @format An \code{R6Class} generator object
#' @field questions  list(\link{QuizPinQuestion}) [optional]
#' @field results  list(\link{QuizPinResult}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuizPinData <- R6::R6Class(
  "QuizPinData",
  public = list(
    `questions` = NULL,
    `results` = NULL,
    #' Initialize a new QuizPinData class.
    #'
    #' @description
    #' Initialize a new QuizPinData class.
    #'
    #' @param questions questions
    #' @param results results
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`questions` = NULL, `results` = NULL, ...) {
      if (!is.null(`questions`)) {
        stopifnot(is.vector(`questions`), length(`questions`) != 0)
        sapply(`questions`, function(x) stopifnot(R6::is.R6(x)))
        self$`questions` <- `questions`
      }
      if (!is.null(`results`)) {
        stopifnot(is.vector(`results`), length(`results`) != 0)
        sapply(`results`, function(x) stopifnot(R6::is.R6(x)))
        self$`results` <- `results`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuizPinData in JSON format
    #' @export
    toJSON = function() {
      QuizPinDataObject <- list()
      if (!is.null(self$`questions`)) {
        QuizPinDataObject[["questions"]] <-
          lapply(self$`questions`, function(x) x$toJSON())
      }
      if (!is.null(self$`results`)) {
        QuizPinDataObject[["results"]] <-
          lapply(self$`results`, function(x) x$toJSON())
      }
      QuizPinDataObject
    },
    #' Deserialize JSON string into an instance of QuizPinData
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuizPinData
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinData
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`questions`)) {
        self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[QuizPinQuestion]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`results`)) {
        self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[QuizPinResult]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuizPinData in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`questions`)) {
          sprintf(
          '"questions":
          [%s]
',
          paste(sapply(self$`questions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`results`)) {
          sprintf(
          '"results":
          [%s]
',
          paste(sapply(self$`results`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QuizPinData
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuizPinData
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinData
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[QuizPinQuestion]", loadNamespace("openapi"))
      self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[QuizPinResult]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to QuizPinData
    #'
    #' @description
    #' Validate JSON input with respect to QuizPinData and throw an exception if invalid
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
    #' @return String representation of QuizPinData
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
# QuizPinData$unlock()
#
## Below is an example to define the print function
# QuizPinData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuizPinData$lock()

