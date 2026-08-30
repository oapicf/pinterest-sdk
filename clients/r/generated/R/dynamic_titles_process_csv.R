#' Create a new DynamicTitlesProcessCSV
#'
#' @description
#' DynamicTitlesProcessCSV Class
#'
#' @docType class
#' @title DynamicTitlesProcessCSV
#' @description DynamicTitlesProcessCSV Class
#' @format An \code{R6Class} generator object
#' @field errors List of validation errors. Empty on success. list(\link{DynamicTitlesProcessCSVError}) [optional]
#' @field status Processing status. Present on success. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DynamicTitlesProcessCSV <- R6::R6Class(
  "DynamicTitlesProcessCSV",
  public = list(
    `errors` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new DynamicTitlesProcessCSV class.
    #'
    #' @param errors List of validation errors. Empty on success.
    #' @param status Processing status. Present on success.
    #' @param ... Other optional arguments.
    initialize = function(`errors` = NULL, `status` = NULL, ...) {
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
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
    #' @return DynamicTitlesProcessCSV as a base R list.
    #' @examples
    #' # convert array of DynamicTitlesProcessCSV (x) to a data frame
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
    #' Convert DynamicTitlesProcessCSV to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DynamicTitlesProcessCSVObject <- list()
      if (!is.null(self$`errors`)) {
        DynamicTitlesProcessCSVObject[["errors"]] <-
          self$extractSimpleType(self$`errors`)
      }
      if (!is.null(self$`status`)) {
        DynamicTitlesProcessCSVObject[["status"]] <-
          self$`status`
      }
      return(DynamicTitlesProcessCSVObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesProcessCSV
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesProcessCSV
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[DynamicTitlesProcessCSVError]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DynamicTitlesProcessCSV in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesProcessCSV
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesProcessCSV
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[DynamicTitlesProcessCSVError]", loadNamespace("openapi"))
      self$`status` <- this_object$`status`
      self
    },

    #' @description
    #' Validate JSON input with respect to DynamicTitlesProcessCSV and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DynamicTitlesProcessCSV
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
# DynamicTitlesProcessCSV$unlock()
#
## Below is an example to define the print function
# DynamicTitlesProcessCSV$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DynamicTitlesProcessCSV$lock()

