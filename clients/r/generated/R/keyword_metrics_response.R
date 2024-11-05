#' Create a new KeywordMetricsResponse
#'
#' @description
#' KeywordMetricsResponse Class
#'
#' @docType class
#' @title KeywordMetricsResponse
#' @description KeywordMetricsResponse Class
#' @format An \code{R6Class} generator object
#' @field keyword Keyword name, e.g., \"keyword\":\"fashion outfits\" character [optional]
#' @field metrics  \link{KeywordMetrics} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordMetricsResponse <- R6::R6Class(
  "KeywordMetricsResponse",
  public = list(
    `keyword` = NULL,
    `metrics` = NULL,

    #' @description
    #' Initialize a new KeywordMetricsResponse class.
    #'
    #' @param keyword Keyword name, e.g., \"keyword\":\"fashion outfits\"
    #' @param metrics metrics
    #' @param ... Other optional arguments.
    initialize = function(`keyword` = NULL, `metrics` = NULL, ...) {
      if (!is.null(`keyword`)) {
        if (!(is.character(`keyword`) && length(`keyword`) == 1)) {
          stop(paste("Error! Invalid data for `keyword`. Must be a string:", `keyword`))
        }
        self$`keyword` <- `keyword`
      }
      if (!is.null(`metrics`)) {
        stopifnot(R6::is.R6(`metrics`))
        self$`metrics` <- `metrics`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordMetricsResponse in JSON format
    toJSON = function() {
      KeywordMetricsResponseObject <- list()
      if (!is.null(self$`keyword`)) {
        KeywordMetricsResponseObject[["keyword"]] <-
          self$`keyword`
      }
      if (!is.null(self$`metrics`)) {
        KeywordMetricsResponseObject[["metrics"]] <-
          self$`metrics`$toJSON()
      }
      KeywordMetricsResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordMetricsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`keyword`)) {
        self$`keyword` <- this_object$`keyword`
      }
      if (!is.null(this_object$`metrics`)) {
        `metrics_object` <- KeywordMetrics$new()
        `metrics_object`$fromJSON(jsonlite::toJSON(this_object$`metrics`, auto_unbox = TRUE, digits = NA))
        self$`metrics` <- `metrics_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordMetricsResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`keyword`)) {
          sprintf(
          '"keyword":
            "%s"
                    ',
          self$`keyword`
          )
        },
        if (!is.null(self$`metrics`)) {
          sprintf(
          '"metrics":
          %s
          ',
          jsonlite::toJSON(self$`metrics`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordMetricsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordMetricsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`keyword` <- this_object$`keyword`
      self$`metrics` <- KeywordMetrics$new()$fromJSON(jsonlite::toJSON(this_object$`metrics`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordMetricsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordMetricsResponse
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
# KeywordMetricsResponse$unlock()
#
## Below is an example to define the print function
# KeywordMetricsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordMetricsResponse$lock()

