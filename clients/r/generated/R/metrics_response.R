#' Create a new MetricsResponse
#'
#' @description
#' MetricsResponse Class
#'
#' @docType class
#' @title MetricsResponse
#' @description MetricsResponse Class
#' @format An \code{R6Class} generator object
#' @field data  list(object) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MetricsResponse <- R6::R6Class(
  "MetricsResponse",
  public = list(
    `data` = NULL,
    #' Initialize a new MetricsResponse class.
    #'
    #' @description
    #' Initialize a new MetricsResponse class.
    #'
    #' @param data data
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`data` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(is.character(x)))
        self$`data` <- `data`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MetricsResponse in JSON format
    #' @export
    toJSON = function() {
      MetricsResponseObject <- list()
      if (!is.null(self$`data`)) {
        MetricsResponseObject[["data"]] <-
          self$`data`
      }
      MetricsResponseObject
    },
    #' Deserialize JSON string into an instance of MetricsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of MetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of MetricsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[object]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MetricsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
             [%s]
          ',
          paste(unlist(lapply(self$`data`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MetricsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of MetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of MetricsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[object]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to MetricsResponse
    #'
    #' @description
    #' Validate JSON input with respect to MetricsResponse and throw an exception if invalid
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
    #' @return String representation of MetricsResponse
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
# MetricsResponse$unlock()
#
## Below is an example to define the print function
# MetricsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MetricsResponse$lock()

