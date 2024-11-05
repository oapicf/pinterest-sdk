#' Create a new AudienceDefinition
#'
#' @description
#' Queryable audience representation.
#'
#' @docType class
#' @title AudienceDefinition
#' @description AudienceDefinition Class
#' @format An \code{R6Class} generator object
#' @field date Generation date character [optional]
#' @field type Generated audience type to request. character [optional]
#' @field scope Generated audience scope to request. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceDefinition <- R6::R6Class(
  "AudienceDefinition",
  public = list(
    `date` = NULL,
    `type` = NULL,
    `scope` = NULL,

    #' @description
    #' Initialize a new AudienceDefinition class.
    #'
    #' @param date Generation date
    #' @param type Generated audience type to request.
    #' @param scope Generated audience scope to request.
    #' @param ... Other optional arguments.
    initialize = function(`date` = NULL, `type` = NULL, `scope` = NULL, ...) {
      if (!is.null(`date`)) {
        if (!(is.character(`date`) && length(`date`) == 1)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
      if (!is.null(`type`)) {
        self$`type` <- `type`
      }
      if (!is.null(`scope`)) {
        self$`scope` <- `scope`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceDefinition in JSON format
    toJSON = function() {
      AudienceDefinitionObject <- list()
      if (!is.null(self$`date`)) {
        AudienceDefinitionObject[["date"]] <-
          self$`date`
      }
      if (!is.null(self$`type`)) {
        AudienceDefinitionObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`scope`)) {
        AudienceDefinitionObject[["scope"]] <-
          self$`scope`
      }
      AudienceDefinitionObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDefinition
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDefinition
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`scope`)) {
        self$`scope` <- this_object$`scope`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceDefinition in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`date`)) {
          sprintf(
          '"date":
            "%s"
                    ',
          self$`date`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`scope`)) {
          sprintf(
          '"scope":
            "%s"
                    ',
          self$`scope`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDefinition
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDefinition
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`date` <- this_object$`date`
      self$`type` <- this_object$`type`
      self$`scope` <- this_object$`scope`
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceDefinition and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceDefinition
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
# AudienceDefinition$unlock()
#
## Below is an example to define the print function
# AudienceDefinition$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceDefinition$lock()

