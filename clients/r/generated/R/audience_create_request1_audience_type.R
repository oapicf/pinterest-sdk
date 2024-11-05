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

    #' @description
    #' Initialize a new AudienceCreateRequest1AudienceType class.
    #'
    #' @param ... Other optional arguments.
    initialize = function(...) {
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateRequest1AudienceType in JSON format
    toJSON = function() {
      AudienceCreateRequest1AudienceTypeObject <- list()
      AudienceCreateRequest1AudienceTypeObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateRequest1AudienceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateRequest1AudienceType
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateRequest1AudienceType in JSON format
    toJSONString = function() {
      jsoncontent <- c(
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateRequest1AudienceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateRequest1AudienceType
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceCreateRequest1AudienceType and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceCreateRequest1AudienceType
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
# AudienceCreateRequest1AudienceType$unlock()
#
## Below is an example to define the print function
# AudienceCreateRequest1AudienceType$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceCreateRequest1AudienceType$lock()

