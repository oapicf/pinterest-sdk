#' Create a new KeywordsMetricsArrayResponse
#'
#' @description
#' KeywordsMetricsArrayResponse Class
#'
#' @docType class
#' @title KeywordsMetricsArrayResponse
#' @description KeywordsMetricsArrayResponse Class
#' @format An \code{R6Class} generator object
#' @field data  list(\link{KeywordMetricsResponse}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordsMetricsArrayResponse <- R6::R6Class(
  "KeywordsMetricsArrayResponse",
  public = list(
    `data` = NULL,

    #' @description
    #' Initialize a new KeywordsMetricsArrayResponse class.
    #'
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`data` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordsMetricsArrayResponse in JSON format
    toJSON = function() {
      KeywordsMetricsArrayResponseObject <- list()
      if (!is.null(self$`data`)) {
        KeywordsMetricsArrayResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toJSON())
      }
      KeywordsMetricsArrayResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordsMetricsArrayResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsMetricsArrayResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[KeywordMetricsResponse]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordsMetricsArrayResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          [%s]
',
          paste(sapply(self$`data`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordsMetricsArrayResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsMetricsArrayResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[KeywordMetricsResponse]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordsMetricsArrayResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordsMetricsArrayResponse
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
# KeywordsMetricsArrayResponse$unlock()
#
## Below is an example to define the print function
# KeywordsMetricsArrayResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordsMetricsArrayResponse$lock()

