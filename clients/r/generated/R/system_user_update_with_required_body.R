#' Create a new SystemUserUpdateWithRequiredBody
#'
#' @description
#' Resource create or update operation model with required body fields (no OptionalProperties).
#'
#' @docType class
#' @title SystemUserUpdateWithRequiredBody
#' @description SystemUserUpdateWithRequiredBody Class
#' @format An \code{R6Class} generator object
#' @field name New system user name character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SystemUserUpdateWithRequiredBody <- R6::R6Class(
  "SystemUserUpdateWithRequiredBody",
  public = list(
    `name` = NULL,

    #' @description
    #' Initialize a new SystemUserUpdateWithRequiredBody class.
    #'
    #' @param name New system user name
    #' @param ... Other optional arguments.
    initialize = function(`name`, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return SystemUserUpdateWithRequiredBody as a base R list.
    #' @examples
    #' # convert array of SystemUserUpdateWithRequiredBody (x) to a data frame
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
    #' Convert SystemUserUpdateWithRequiredBody to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SystemUserUpdateWithRequiredBodyObject <- list()
      if (!is.null(self$`name`)) {
        SystemUserUpdateWithRequiredBodyObject[["name"]] <-
          self$`name`
      }
      return(SystemUserUpdateWithRequiredBodyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SystemUserUpdateWithRequiredBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of SystemUserUpdateWithRequiredBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SystemUserUpdateWithRequiredBody in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SystemUserUpdateWithRequiredBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of SystemUserUpdateWithRequiredBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to SystemUserUpdateWithRequiredBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SystemUserUpdateWithRequiredBody: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SystemUserUpdateWithRequiredBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

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
# SystemUserUpdateWithRequiredBody$unlock()
#
## Below is an example to define the print function
# SystemUserUpdateWithRequiredBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SystemUserUpdateWithRequiredBody$lock()

