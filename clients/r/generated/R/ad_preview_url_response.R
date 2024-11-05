#' Create a new AdPreviewURLResponse
#'
#' @description
#' AdPreviewURLResponse Class
#'
#' @docType class
#' @title AdPreviewURLResponse
#' @description AdPreviewURLResponse Class
#' @format An \code{R6Class} generator object
#' @field url 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19' character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPreviewURLResponse <- R6::R6Class(
  "AdPreviewURLResponse",
  public = list(
    `url` = NULL,

    #' @description
    #' Initialize a new AdPreviewURLResponse class.
    #'
    #' @param url 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
    #' @param ... Other optional arguments.
    initialize = function(`url` = NULL, ...) {
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewURLResponse in JSON format
    toJSON = function() {
      AdPreviewURLResponseObject <- list()
      if (!is.null(self$`url`)) {
        AdPreviewURLResponseObject[["url"]] <-
          self$`url`
      }
      AdPreviewURLResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPreviewURLResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewURLResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewURLResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPreviewURLResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewURLResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdPreviewURLResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPreviewURLResponse
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
# AdPreviewURLResponse$unlock()
#
## Below is an example to define the print function
# AdPreviewURLResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPreviewURLResponse$lock()

