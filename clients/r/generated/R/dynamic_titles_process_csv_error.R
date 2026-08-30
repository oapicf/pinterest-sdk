#' Create a new DynamicTitlesProcessCSVError
#'
#' @description
#' DynamicTitlesProcessCSVError Class
#'
#' @docType class
#' @title DynamicTitlesProcessCSVError
#' @description DynamicTitlesProcessCSVError Class
#' @format An \code{R6Class} generator object
#' @field error_type The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. character [optional]
#' @field row_number The row number with a validation error. -1 indicates a file-level error. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DynamicTitlesProcessCSVError <- R6::R6Class(
  "DynamicTitlesProcessCSVError",
  public = list(
    `error_type` = NULL,
    `row_number` = NULL,

    #' @description
    #' Initialize a new DynamicTitlesProcessCSVError class.
    #'
    #' @param error_type The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
    #' @param row_number The row number with a validation error. -1 indicates a file-level error.
    #' @param ... Other optional arguments.
    initialize = function(`error_type` = NULL, `row_number` = NULL, ...) {
      if (!is.null(`error_type`)) {
        if (!(is.character(`error_type`) && length(`error_type`) == 1)) {
          stop(paste("Error! Invalid data for `error_type`. Must be a string:", `error_type`))
        }
        self$`error_type` <- `error_type`
      }
      if (!is.null(`row_number`)) {
        if (!(is.numeric(`row_number`) && length(`row_number`) == 1)) {
          stop(paste("Error! Invalid data for `row_number`. Must be an integer:", `row_number`))
        }
        self$`row_number` <- `row_number`
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
    #' @return DynamicTitlesProcessCSVError as a base R list.
    #' @examples
    #' # convert array of DynamicTitlesProcessCSVError (x) to a data frame
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
    #' Convert DynamicTitlesProcessCSVError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DynamicTitlesProcessCSVErrorObject <- list()
      if (!is.null(self$`error_type`)) {
        DynamicTitlesProcessCSVErrorObject[["error_type"]] <-
          self$`error_type`
      }
      if (!is.null(self$`row_number`)) {
        DynamicTitlesProcessCSVErrorObject[["row_number"]] <-
          self$`row_number`
      }
      return(DynamicTitlesProcessCSVErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesProcessCSVError
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesProcessCSVError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`error_type`)) {
        self$`error_type` <- this_object$`error_type`
      }
      if (!is.null(this_object$`row_number`)) {
        self$`row_number` <- this_object$`row_number`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DynamicTitlesProcessCSVError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesProcessCSVError
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesProcessCSVError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`error_type` <- this_object$`error_type`
      self$`row_number` <- this_object$`row_number`
      self
    },

    #' @description
    #' Validate JSON input with respect to DynamicTitlesProcessCSVError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DynamicTitlesProcessCSVError
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
# DynamicTitlesProcessCSVError$unlock()
#
## Below is an example to define the print function
# DynamicTitlesProcessCSVError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DynamicTitlesProcessCSVError$lock()

