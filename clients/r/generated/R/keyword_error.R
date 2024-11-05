#' Create a new KeywordError
#'
#' @description
#' KeywordError Class
#'
#' @docType class
#' @title KeywordError
#' @description KeywordError Class
#' @format An \code{R6Class} generator object
#' @field data  \link{Keyword} [optional]
#' @field error_messages  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordError <- R6::R6Class(
  "KeywordError",
  public = list(
    `data` = NULL,
    `error_messages` = NULL,

    #' @description
    #' Initialize a new KeywordError class.
    #'
    #' @param data data
    #' @param error_messages error_messages
    #' @param ... Other optional arguments.
    initialize = function(`data` = NULL, `error_messages` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`error_messages`)) {
        stopifnot(is.vector(`error_messages`), length(`error_messages`) != 0)
        sapply(`error_messages`, function(x) stopifnot(is.character(x)))
        self$`error_messages` <- `error_messages`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordError in JSON format
    toJSON = function() {
      KeywordErrorObject <- list()
      if (!is.null(self$`data`)) {
        KeywordErrorObject[["data"]] <-
          self$`data`$toJSON()
      }
      if (!is.null(self$`error_messages`)) {
        KeywordErrorObject[["error_messages"]] <-
          self$`error_messages`
      }
      KeywordErrorObject
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordError
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- Keyword$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`error_messages`)) {
        self$`error_messages` <- ApiClient$new()$deserializeObj(this_object$`error_messages`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordError in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`error_messages`)) {
          sprintf(
          '"error_messages":
             [%s]
          ',
          paste(unlist(lapply(self$`error_messages`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordError
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- Keyword$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`error_messages` <- ApiClient$new()$deserializeObj(this_object$`error_messages`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordError
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
# KeywordError$unlock()
#
## Below is an example to define the print function
# KeywordError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordError$lock()

