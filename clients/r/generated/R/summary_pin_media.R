#' Create a new SummaryPinMedia
#'
#' @description
#' SummaryPinMedia Class
#'
#' @docType class
#' @title SummaryPinMedia
#' @description SummaryPinMedia Class
#' @format An \code{R6Class} generator object
#' @field media_type  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SummaryPinMedia <- R6::R6Class(
  "SummaryPinMedia",
  inherit = PinMedia,
  public = list(
    `media_type` = NULL,
    #' Initialize a new SummaryPinMedia class.
    #'
    #' @description
    #' Initialize a new SummaryPinMedia class.
    #'
    #' @param media_type media_type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`media_type` = NULL, ...) {
      if (!is.null(`media_type`)) {
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SummaryPinMedia in JSON format
    #' @export
    toJSON = function() {
      SummaryPinMediaObject <- list()
      if (!is.null(self$`media_type`)) {
        SummaryPinMediaObject[["media_type"]] <-
          self$`media_type`
      }
      SummaryPinMediaObject
    },
    #' Deserialize JSON string into an instance of SummaryPinMedia
    #'
    #' @description
    #' Deserialize JSON string into an instance of SummaryPinMedia
    #'
    #' @param input_json the JSON input
    #' @return the instance of SummaryPinMedia
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- this_object$`media_type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SummaryPinMedia in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`media_type`)) {
          sprintf(
          '"media_type":
            "%s"
                    ',
          self$`media_type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SummaryPinMedia
    #'
    #' @description
    #' Deserialize JSON string into an instance of SummaryPinMedia
    #'
    #' @param input_json the JSON input
    #' @return the instance of SummaryPinMedia
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_type` <- this_object$`media_type`
      self
    },
    #' Validate JSON input with respect to SummaryPinMedia
    #'
    #' @description
    #' Validate JSON input with respect to SummaryPinMedia and throw an exception if invalid
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
    #' @return String representation of SummaryPinMedia
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
# SummaryPinMedia$unlock()
#
## Below is an example to define the print function
# SummaryPinMedia$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SummaryPinMedia$lock()

