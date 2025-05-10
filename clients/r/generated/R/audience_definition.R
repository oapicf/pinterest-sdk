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
    #' @return AudienceDefinition as a base R list.
    #' @examples
    #' # convert array of AudienceDefinition (x) to a data frame
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
    #' Convert AudienceDefinition to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
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
      return(AudienceDefinitionObject)
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
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AudienceDefinition in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
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

