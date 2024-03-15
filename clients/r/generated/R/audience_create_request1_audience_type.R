#' Create a new AudienceCreateRequest1AudienceType
#'
#' @description
#' AudienceCreateRequest1AudienceType Class
#'
#' @docType class
#' @title AudienceCreateRequest1AudienceType
#' @description AudienceCreateRequest1AudienceType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceCreateRequest1AudienceType <- R6::R6Class(
  "AudienceCreateRequest1AudienceType",
  public = list(
    #' Initialize a new AudienceCreateRequest1AudienceType class.
    #'
    #' @description
    #' Initialize a new AudienceCreateRequest1AudienceType class.
    #'
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(...) {
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateRequest1AudienceType in JSON format
    #' @export
    toJSON = function() {
      AudienceCreateRequest1AudienceTypeObject <- list()
      AudienceCreateRequest1AudienceTypeObject
    },
    #' Deserialize JSON string into an instance of AudienceCreateRequest1AudienceType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateRequest1AudienceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateRequest1AudienceType
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateRequest1AudienceType in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AudienceCreateRequest1AudienceType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateRequest1AudienceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateRequest1AudienceType
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self
    },
    #' Validate JSON input with respect to AudienceCreateRequest1AudienceType
    #'
    #' @description
    #' Validate JSON input with respect to AudienceCreateRequest1AudienceType and throw an exception if invalid
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
    #' @return String representation of AudienceCreateRequest1AudienceType
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
# AudienceCreateRequest1AudienceType$unlock()
#
## Below is an example to define the print function
# AudienceCreateRequest1AudienceType$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceCreateRequest1AudienceType$lock()

