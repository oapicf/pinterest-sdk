#' Create a new QuizPinResult
#'
#' @description
#' The result, and link out, based on the user’s choice.
#'
#' @docType class
#' @title QuizPinResult
#' @description QuizPinResult Class
#' @format An \code{R6Class} generator object
#' @field android_deep_link  character [optional]
#' @field destination_url  character [optional]
#' @field ios_deep_link  character [optional]
#' @field organic_pin_id  character [optional]
#' @field result_id  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuizPinResult <- R6::R6Class(
  "QuizPinResult",
  public = list(
    `android_deep_link` = NULL,
    `destination_url` = NULL,
    `ios_deep_link` = NULL,
    `organic_pin_id` = NULL,
    `result_id` = NULL,

    #' @description
    #' Initialize a new QuizPinResult class.
    #'
    #' @param android_deep_link android_deep_link
    #' @param destination_url destination_url
    #' @param ios_deep_link ios_deep_link
    #' @param organic_pin_id organic_pin_id
    #' @param result_id result_id
    #' @param ... Other optional arguments.
    initialize = function(`android_deep_link` = NULL, `destination_url` = NULL, `ios_deep_link` = NULL, `organic_pin_id` = NULL, `result_id` = NULL, ...) {
      if (!is.null(`android_deep_link`)) {
        if (!(is.character(`android_deep_link`) && length(`android_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `android_deep_link`. Must be a string:", `android_deep_link`))
        }
        self$`android_deep_link` <- `android_deep_link`
      }
      if (!is.null(`destination_url`)) {
        if (!(is.character(`destination_url`) && length(`destination_url`) == 1)) {
          stop(paste("Error! Invalid data for `destination_url`. Must be a string:", `destination_url`))
        }
        self$`destination_url` <- `destination_url`
      }
      if (!is.null(`ios_deep_link`)) {
        if (!(is.character(`ios_deep_link`) && length(`ios_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `ios_deep_link`. Must be a string:", `ios_deep_link`))
        }
        self$`ios_deep_link` <- `ios_deep_link`
      }
      if (!is.null(`organic_pin_id`)) {
        if (!(is.character(`organic_pin_id`) && length(`organic_pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `organic_pin_id`. Must be a string:", `organic_pin_id`))
        }
        self$`organic_pin_id` <- `organic_pin_id`
      }
      if (!is.null(`result_id`)) {
        self$`result_id` <- `result_id`
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
    #' @return QuizPinResult as a base R list.
    #' @examples
    #' # convert array of QuizPinResult (x) to a data frame
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
    #' Convert QuizPinResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      QuizPinResultObject <- list()
      if (!is.null(self$`android_deep_link`)) {
        QuizPinResultObject[["android_deep_link"]] <-
          self$`android_deep_link`
      }
      if (!is.null(self$`destination_url`)) {
        QuizPinResultObject[["destination_url"]] <-
          self$`destination_url`
      }
      if (!is.null(self$`ios_deep_link`)) {
        QuizPinResultObject[["ios_deep_link"]] <-
          self$`ios_deep_link`
      }
      if (!is.null(self$`organic_pin_id`)) {
        QuizPinResultObject[["organic_pin_id"]] <-
          self$`organic_pin_id`
      }
      if (!is.null(self$`result_id`)) {
        QuizPinResultObject[["result_id"]] <-
          self$`result_id`
      }
      return(QuizPinResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of QuizPinResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`android_deep_link`)) {
        self$`android_deep_link` <- this_object$`android_deep_link`
      }
      if (!is.null(this_object$`destination_url`)) {
        self$`destination_url` <- this_object$`destination_url`
      }
      if (!is.null(this_object$`ios_deep_link`)) {
        self$`ios_deep_link` <- this_object$`ios_deep_link`
      }
      if (!is.null(this_object$`organic_pin_id`)) {
        self$`organic_pin_id` <- this_object$`organic_pin_id`
      }
      if (!is.null(this_object$`result_id`)) {
        self$`result_id` <- this_object$`result_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return QuizPinResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of QuizPinResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuizPinResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`android_deep_link` <- this_object$`android_deep_link`
      self$`destination_url` <- this_object$`destination_url`
      self$`ios_deep_link` <- this_object$`ios_deep_link`
      self$`organic_pin_id` <- this_object$`organic_pin_id`
      self$`result_id` <- this_object$`result_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to QuizPinResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QuizPinResult
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
# QuizPinResult$unlock()
#
## Below is an example to define the print function
# QuizPinResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuizPinResult$lock()

