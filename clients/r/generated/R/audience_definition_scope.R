#' Create a new AudienceDefinitionScope
#'
#' @description
#' Generated audience scope to request.
#'
#' @docType class
#' @title AudienceDefinitionScope
#' @description AudienceDefinitionScope Class
#' @format An \code{R6Class} generator object
#' @field scope  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceDefinitionScope <- R6::R6Class(
  "AudienceDefinitionScope",
  public = list(
    `scope` = NULL,

    #' @description
    #' Initialize a new AudienceDefinitionScope class.
    #'
    #' @param scope scope
    #' @param ... Other optional arguments.
    initialize = function(`scope` = NULL, ...) {
      if (!is.null(`scope`)) {
        if (!(`scope` %in% c("PARTNER", "PINTEREST"))) {
          stop(paste("Error! \"", `scope`, "\" cannot be assigned to `scope`. Must be \"PARTNER\", \"PINTEREST\".", sep = ""))
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
    #' @return AudienceDefinitionScope as a base R list.
    #' @examples
    #' # convert array of AudienceDefinitionScope (x) to a data frame
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
    #' Convert AudienceDefinitionScope to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AudienceDefinitionScopeObject <- list()
      if (!is.null(self$`scope`)) {
        AudienceDefinitionScopeObject[["scope"]] <-
          self$`scope`
      }
      return(AudienceDefinitionScopeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDefinitionScope
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDefinitionScope
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`scope`)) {
        if (!is.null(this_object$`scope`) && !(this_object$`scope` %in% c("PARTNER", "PINTEREST"))) {
          stop(paste("Error! \"", this_object$`scope`, "\" cannot be assigned to `scope`. Must be \"PARTNER\", \"PINTEREST\".", sep = ""))
        }
        self$`scope` <- this_object$`scope`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AudienceDefinitionScope in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceDefinitionScope
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceDefinitionScope
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`scope`) && !(this_object$`scope` %in% c("PARTNER", "PINTEREST"))) {
        stop(paste("Error! \"", this_object$`scope`, "\" cannot be assigned to `scope`. Must be \"PARTNER\", \"PINTEREST\".", sep = ""))
      }
      self$`scope` <- this_object$`scope`
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceDefinitionScope and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceDefinitionScope
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
# AudienceDefinitionScope$unlock()
#
## Below is an example to define the print function
# AudienceDefinitionScope$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceDefinitionScope$lock()

