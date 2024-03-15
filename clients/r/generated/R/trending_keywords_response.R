#' Create a new TrendingKeywordsResponse
#'
#' @description
#' TrendingKeywordsResponse Class
#'
#' @docType class
#' @title TrendingKeywordsResponse
#' @description TrendingKeywordsResponse Class
#' @format An \code{R6Class} generator object
#' @field trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend. list(\link{TrendingKeywordsResponseTrendsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeywordsResponse <- R6::R6Class(
  "TrendingKeywordsResponse",
  public = list(
    `trends` = NULL,
    #' Initialize a new TrendingKeywordsResponse class.
    #'
    #' @description
    #' Initialize a new TrendingKeywordsResponse class.
    #'
    #' @param trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`trends` = NULL, ...) {
      if (!is.null(`trends`)) {
        stopifnot(is.vector(`trends`), length(`trends`) != 0)
        sapply(`trends`, function(x) stopifnot(R6::is.R6(x)))
        self$`trends` <- `trends`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TrendingKeywordsResponse in JSON format
    #' @export
    toJSON = function() {
      TrendingKeywordsResponseObject <- list()
      if (!is.null(self$`trends`)) {
        TrendingKeywordsResponseObject[["trends"]] <-
          lapply(self$`trends`, function(x) x$toJSON())
      }
      TrendingKeywordsResponseObject
    },
    #' Deserialize JSON string into an instance of TrendingKeywordsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`trends`)) {
        self$`trends` <- ApiClient$new()$deserializeObj(this_object$`trends`, "array[TrendingKeywordsResponseTrendsInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TrendingKeywordsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`trends`)) {
          sprintf(
          '"trends":
          [%s]
',
          paste(sapply(self$`trends`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TrendingKeywordsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`trends` <- ApiClient$new()$deserializeObj(this_object$`trends`, "array[TrendingKeywordsResponseTrendsInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to TrendingKeywordsResponse
    #'
    #' @description
    #' Validate JSON input with respect to TrendingKeywordsResponse and throw an exception if invalid
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
    #' @return String representation of TrendingKeywordsResponse
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
# TrendingKeywordsResponse$unlock()
#
## Below is an example to define the print function
# TrendingKeywordsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeywordsResponse$lock()

