#' Create a new AudienceDemographicValue
#'
#' @description
#' Demographic detail for a single audience demographic
#'
#' @docType class
#' @title AudienceDemographicValue
#' @description AudienceDemographicValue Class
#' @format An \code{R6Class} generator object
#' @field key Unique key for demographic item character [optional]
#' @field name Display name for demographic character [optional]
#' @field ratio Value of demographic item as a percent of total audience numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceDemographicValue <- R6::R6Class(
  "AudienceDemographicValue",
  public = list(
    `key` = NULL,
    `name` = NULL,
    `ratio` = NULL,
    #' Initialize a new AudienceDemographicValue class.
    #'
    #' @description
    #' Initialize a new AudienceDemographicValue class.
    #'
    #' @param key Unique key for demographic item
    #' @param name Display name for demographic
    #' @param ratio Value of demographic item as a percent of total audience
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`key` = NULL, `name` = NULL, `ratio` = NULL, ...) {
      if (!is.null(`key`)) {
        if (!(is.character(`key`) && length(`key`) == 1)) {
          stop(paste("Error! Invalid data for `key`. Must be a string:", `key`))
        }
        self$`key` <- `key`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`ratio`)) {
        self$`ratio` <- `ratio`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceDemographicValue in JSON format
    #' @export
    toJSON = function() {
      AudienceDemographicValueObject <- list()
      if (!is.null(self$`key`)) {
        AudienceDemographicValueObject[["key"]] <-
          self$`key`
      }
      if (!is.null(self$`name`)) {
        AudienceDemographicValueObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`ratio`)) {
        AudienceDemographicValueObject[["ratio"]] <-
          self$`ratio`
      }
      AudienceDemographicValueObject
    },
    #' Deserialize JSON string into an instance of AudienceDemographicValue
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceDemographicValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDemographicValue
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`key`)) {
        self$`key` <- this_object$`key`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`ratio`)) {
        self$`ratio` <- this_object$`ratio`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceDemographicValue in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`key`)) {
          sprintf(
          '"key":
            "%s"
                    ',
          self$`key`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`ratio`)) {
          sprintf(
          '"ratio":
            %d
                    ',
          self$`ratio`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AudienceDemographicValue
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceDemographicValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDemographicValue
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`key` <- this_object$`key`
      self$`name` <- this_object$`name`
      self$`ratio` <- this_object$`ratio`
      self
    },
    #' Validate JSON input with respect to AudienceDemographicValue
    #'
    #' @description
    #' Validate JSON input with respect to AudienceDemographicValue and throw an exception if invalid
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
    #' @return String representation of AudienceDemographicValue
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
# AudienceDemographicValue$unlock()
#
## Below is an example to define the print function
# AudienceDemographicValue$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceDemographicValue$lock()

