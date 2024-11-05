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
#' @field tie_breaker_type Quiz ad tie breaker type, default is RANDOM character [optional]
#' @field tie_breaker_custom_result  \link{QuizPinResult} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuizPinData <- R6::R6Class(
  "QuizPinData",
  public = list(
    `questions` = NULL,
    `results` = NULL,
    `tie_breaker_type` = NULL,
    `tie_breaker_custom_result` = NULL,

    #' @description
    #' Initialize a new QuizPinData class.
    #'
    #' @param questions questions
    #' @param results results
    #' @param tie_breaker_type Quiz ad tie breaker type, default is RANDOM
    #' @param tie_breaker_custom_result tie_breaker_custom_result
    #' @param ... Other optional arguments.
    initialize = function(`questions` = NULL, `results` = NULL, `tie_breaker_type` = NULL, `tie_breaker_custom_result` = NULL, ...) {
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
      if (!is.null(`tie_breaker_type`)) {
        if (!(`tie_breaker_type` %in% c("RANDOM", "CUSTOM"))) {
          stop(paste("Error! \"", `tie_breaker_type`, "\" cannot be assigned to `tie_breaker_type`. Must be \"RANDOM\", \"CUSTOM\".", sep = ""))
        }
        if (!(is.character(`tie_breaker_type`) && length(`tie_breaker_type`) == 1)) {
          stop(paste("Error! Invalid data for `tie_breaker_type`. Must be a string:", `tie_breaker_type`))
        }
        self$`tie_breaker_type` <- `tie_breaker_type`
      }
      if (!is.null(`tie_breaker_custom_result`)) {
        stopifnot(R6::is.R6(`tie_breaker_custom_result`))
        self$`tie_breaker_custom_result` <- `tie_breaker_custom_result`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return QuizPinData in JSON format
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
      if (!is.null(self$`tie_breaker_type`)) {
        QuizPinDataObject[["tie_breaker_type"]] <-
          self$`tie_breaker_type`
      }
      if (!is.null(self$`tie_breaker_custom_result`)) {
        QuizPinDataObject[["tie_breaker_custom_result"]] <-
          self$`tie_breaker_custom_result`$toJSON()
      }
      QuizPinDataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of QuizPinData
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`questions`)) {
        self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[QuizPinQuestion]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`results`)) {
        self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[QuizPinResult]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tie_breaker_type`)) {
        if (!is.null(this_object$`tie_breaker_type`) && !(this_object$`tie_breaker_type` %in% c("RANDOM", "CUSTOM"))) {
          stop(paste("Error! \"", this_object$`tie_breaker_type`, "\" cannot be assigned to `tie_breaker_type`. Must be \"RANDOM\", \"CUSTOM\".", sep = ""))
        }
        self$`tie_breaker_type` <- this_object$`tie_breaker_type`
      }
      if (!is.null(this_object$`tie_breaker_custom_result`)) {
        `tie_breaker_custom_result_object` <- QuizPinResult$new()
        `tie_breaker_custom_result_object`$fromJSON(jsonlite::toJSON(this_object$`tie_breaker_custom_result`, auto_unbox = TRUE, digits = NA))
        self$`tie_breaker_custom_result` <- `tie_breaker_custom_result_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return QuizPinData in JSON format
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
        },
        if (!is.null(self$`tie_breaker_type`)) {
          sprintf(
          '"tie_breaker_type":
            "%s"
                    ',
          self$`tie_breaker_type`
          )
        },
        if (!is.null(self$`tie_breaker_custom_result`)) {
          sprintf(
          '"tie_breaker_custom_result":
          %s
          ',
          jsonlite::toJSON(self$`tie_breaker_custom_result`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of QuizPinData
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[QuizPinQuestion]", loadNamespace("openapi"))
      self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[QuizPinResult]", loadNamespace("openapi"))
      if (!is.null(this_object$`tie_breaker_type`) && !(this_object$`tie_breaker_type` %in% c("RANDOM", "CUSTOM"))) {
        stop(paste("Error! \"", this_object$`tie_breaker_type`, "\" cannot be assigned to `tie_breaker_type`. Must be \"RANDOM\", \"CUSTOM\".", sep = ""))
      }
      self$`tie_breaker_type` <- this_object$`tie_breaker_type`
      self$`tie_breaker_custom_result` <- QuizPinResult$new()$fromJSON(jsonlite::toJSON(this_object$`tie_breaker_custom_result`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to QuizPinData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QuizPinData
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
# QuizPinData$unlock()
#
## Below is an example to define the print function
# QuizPinData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuizPinData$lock()

