#' Create a new KeywordMetrics
#'
#' @description
#' Keyword metrics JSON
#'
#' @docType class
#' @title KeywordMetrics
#' @description KeywordMetrics Class
#' @format An \code{R6Class} generator object
#' @field avg_cpc_in_micro_currency Average cost per click numeric [optional]
#' @field keyword_query_volume Keyword's search frequency. This value is based on keyword frequency in pepsi client response character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordMetrics <- R6::R6Class(
  "KeywordMetrics",
  public = list(
    `avg_cpc_in_micro_currency` = NULL,
    `keyword_query_volume` = NULL,

    #' @description
    #' Initialize a new KeywordMetrics class.
    #'
    #' @param avg_cpc_in_micro_currency Average cost per click
    #' @param keyword_query_volume Keyword's search frequency. This value is based on keyword frequency in pepsi client response
    #' @param ... Other optional arguments.
    initialize = function(`avg_cpc_in_micro_currency` = NULL, `keyword_query_volume` = NULL, ...) {
      if (!is.null(`avg_cpc_in_micro_currency`)) {
        self$`avg_cpc_in_micro_currency` <- `avg_cpc_in_micro_currency`
      }
      if (!is.null(`keyword_query_volume`)) {
        if (!(is.character(`keyword_query_volume`) && length(`keyword_query_volume`) == 1)) {
          stop(paste("Error! Invalid data for `keyword_query_volume`. Must be a string:", `keyword_query_volume`))
        }
        self$`keyword_query_volume` <- `keyword_query_volume`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordMetrics in JSON format
    toJSON = function() {
      KeywordMetricsObject <- list()
      if (!is.null(self$`avg_cpc_in_micro_currency`)) {
        KeywordMetricsObject[["avg_cpc_in_micro_currency"]] <-
          self$`avg_cpc_in_micro_currency`
      }
      if (!is.null(self$`keyword_query_volume`)) {
        KeywordMetricsObject[["keyword_query_volume"]] <-
          self$`keyword_query_volume`
      }
      KeywordMetricsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordMetrics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`avg_cpc_in_micro_currency`)) {
        self$`avg_cpc_in_micro_currency` <- this_object$`avg_cpc_in_micro_currency`
      }
      if (!is.null(this_object$`keyword_query_volume`)) {
        self$`keyword_query_volume` <- this_object$`keyword_query_volume`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordMetrics in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`avg_cpc_in_micro_currency`)) {
          sprintf(
          '"avg_cpc_in_micro_currency":
            %d
                    ',
          self$`avg_cpc_in_micro_currency`
          )
        },
        if (!is.null(self$`keyword_query_volume`)) {
          sprintf(
          '"keyword_query_volume":
            "%s"
                    ',
          self$`keyword_query_volume`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordMetrics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`avg_cpc_in_micro_currency` <- this_object$`avg_cpc_in_micro_currency`
      self$`keyword_query_volume` <- this_object$`keyword_query_volume`
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordMetrics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordMetrics
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
# KeywordMetrics$unlock()
#
## Below is an example to define the print function
# KeywordMetrics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordMetrics$lock()

