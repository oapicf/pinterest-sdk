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
    #' Initialize a new AdPreviewURLResponse class.
    #'
    #' @description
    #' Initialize a new AdPreviewURLResponse class.
    #'
    #' @param url 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`url` = NULL, ...) {
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewURLResponse in JSON format
    #' @export
    toJSON = function() {
      AdPreviewURLResponseObject <- list()
      if (!is.null(self$`url`)) {
        AdPreviewURLResponseObject[["url"]] <-
          self$`url`
      }
      AdPreviewURLResponseObject
    },
    #' Deserialize JSON string into an instance of AdPreviewURLResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPreviewURLResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewURLResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdPreviewURLResponse in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of AdPreviewURLResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdPreviewURLResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewURLResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`url` <- this_object$`url`
      self
    },
    #' Validate JSON input with respect to AdPreviewURLResponse
    #'
    #' @description
    #' Validate JSON input with respect to AdPreviewURLResponse and throw an exception if invalid
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
    #' @return String representation of AdPreviewURLResponse
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
# AdPreviewURLResponse$unlock()
#
## Below is an example to define the print function
# AdPreviewURLResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPreviewURLResponse$lock()

