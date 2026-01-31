#' Create a new AudienceDefinitionType
#'
#' @description
#' Generated audience type to request.
#'
#' @docType class
#' @title AudienceDefinitionType
#' @description AudienceDefinitionType Class
#' @format An \code{R6Class} generator object
#' @field scope  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceDefinitionType <- R6::R6Class(
  "AudienceDefinitionType",
  public = list(
    `scope` = NULL,

    #' @description
    #' Initialize a new AudienceDefinitionType class.
    #'
    #' @param scope scope
    #' @param ... Other optional arguments.
    initialize = function(`scope` = NULL, ...) {
      if (!is.null(`scope`)) {
        if (!(`scope` %in% c("IMPRESSION_PLUS_ENGAGEMENT", "ENGAGEMENT"))) {
          stop(paste("Error! \"", `scope`, "\" cannot be assigned to `scope`. Must be \"IMPRESSION_PLUS_ENGAGEMENT\", \"ENGAGEMENT\".", sep = ""))
        }
        if (!(is.character(`scope`) && length(`scope`) == 1)) {
          stop(paste("Error! Invalid data for `scope`. Must be a string:", `scope`))
        }
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
    #' @return AudienceDefinitionType as a base R list.
    #' @examples
    #' # convert array of AudienceDefinitionType (x) to a data frame
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
    #' Convert AudienceDefinitionType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AudienceDefinitionTypeObject <- list()
      if (!is.null(self$`scope`)) {
        AudienceDefinitionTypeObject[["scope"]] <-
          self$`scope`
      }
      return(AudienceDefinitionTypeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDefinitionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDefinitionType
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`scope`)) {
        if (!is.null(this_object$`scope`) && !(this_object$`scope` %in% c("IMPRESSION_PLUS_ENGAGEMENT", "ENGAGEMENT"))) {
          stop(paste("Error! \"", this_object$`scope`, "\" cannot be assigned to `scope`. Must be \"IMPRESSION_PLUS_ENGAGEMENT\", \"ENGAGEMENT\".", sep = ""))
        }
        self$`scope` <- this_object$`scope`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AudienceDefinitionType in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDefinitionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDefinitionType
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`scope`) && !(this_object$`scope` %in% c("IMPRESSION_PLUS_ENGAGEMENT", "ENGAGEMENT"))) {
        stop(paste("Error! \"", this_object$`scope`, "\" cannot be assigned to `scope`. Must be \"IMPRESSION_PLUS_ENGAGEMENT\", \"ENGAGEMENT\".", sep = ""))
      }
      self$`scope` <- this_object$`scope`
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceDefinitionType and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceDefinitionType
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
# AudienceDefinitionType$unlock()
#
## Below is an example to define the print function
# AudienceDefinitionType$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceDefinitionType$lock()

