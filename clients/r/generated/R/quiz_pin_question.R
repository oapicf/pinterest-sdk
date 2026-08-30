#' Create a new QuizPinQuestion
#'
#' @description
#' A specific quiz inquiry.
#'
#' @docType class
#' @title QuizPinQuestion
#' @description QuizPinQuestion Class
#' @format An \code{R6Class} generator object
#' @field options  list(\link{QuizPinOption}) [optional]
#' @field question_id  numeric [optional]
#' @field question_text  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuizPinQuestion <- R6::R6Class(
  "QuizPinQuestion",
  public = list(
    `options` = NULL,
    `question_id` = NULL,
    `question_text` = NULL,

    #' @description
    #' Initialize a new QuizPinQuestion class.
    #'
    #' @param options options
    #' @param question_id question_id
    #' @param question_text question_text
    #' @param ... Other optional arguments.
    initialize = function(`options` = NULL, `question_id` = NULL, `question_text` = NULL, ...) {
      if (!is.null(`options`)) {
        stopifnot(is.vector(`options`), length(`options`) != 0)
        sapply(`options`, function(x) stopifnot(R6::is.R6(x)))
        self$`options` <- `options`
      }
      if (!is.null(`question_id`)) {
        self$`question_id` <- `question_id`
      }
      if (!is.null(`question_text`)) {
        if (!(is.character(`question_text`) && length(`question_text`) == 1)) {
          stop(paste("Error! Invalid data for `question_text`. Must be a string:", `question_text`))
        }
        self$`question_text` <- `question_text`
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
    #' @return QuizPinQuestion as a base R list.
    #' @examples
    #' # convert array of QuizPinQuestion (x) to a data frame
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
    #' Convert QuizPinQuestion to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      QuizPinQuestionObject <- list()
      if (!is.null(self$`options`)) {
        QuizPinQuestionObject[["options"]] <-
          self$extractSimpleType(self$`options`)
      }
      if (!is.null(self$`question_id`)) {
        QuizPinQuestionObject[["question_id"]] <-
          self$`question_id`
      }
      if (!is.null(self$`question_text`)) {
        QuizPinQuestionObject[["question_text"]] <-
          self$`question_text`
      }
      return(QuizPinQuestionObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of QuizPinQuestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinQuestion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`options`)) {
        self$`options` <- ApiClient$new()$deserializeObj(this_object$`options`, "array[QuizPinOption]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`question_id`)) {
        self$`question_id` <- this_object$`question_id`
      }
      if (!is.null(this_object$`question_text`)) {
        self$`question_text` <- this_object$`question_text`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return QuizPinQuestion in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of QuizPinQuestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinQuestion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`options` <- ApiClient$new()$deserializeObj(this_object$`options`, "array[QuizPinOption]", loadNamespace("openapi"))
      self$`question_id` <- this_object$`question_id`
      self$`question_text` <- this_object$`question_text`
      self
    },

    #' @description
    #' Validate JSON input with respect to QuizPinQuestion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QuizPinQuestion
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
# QuizPinQuestion$unlock()
#
## Below is an example to define the print function
# QuizPinQuestion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuizPinQuestion$lock()

