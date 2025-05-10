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

    #' @description
    #' Initialize a new AudienceDemographicValue class.
    #'
    #' @param key Unique key for demographic item
    #' @param name Display name for demographic
    #' @param ratio Value of demographic item as a percent of total audience
    #' @param ... Other optional arguments.
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

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return AudienceDemographicValue as a base R list.
    #' @examples
    #' # convert array of AudienceDemographicValue (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AudienceDemographicValue to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
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
      return(AudienceDemographicValueObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDemographicValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDemographicValue
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AudienceDemographicValue in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDemographicValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDemographicValue
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`key` <- this_object$`key`
      self$`name` <- this_object$`name`
      self$`ratio` <- this_object$`ratio`
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceDemographicValue and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceDemographicValue
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
# AudienceDemographicValue$unlock()
#
## Below is an example to define the print function
# AudienceDemographicValue$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceDemographicValue$lock()

