#' Create a new TotalCountByEntityStatus
#'
#' @description
#' Breakdown of asset counts by entity status.
#'
#' @docType class
#' @title TotalCountByEntityStatus
#' @description TotalCountByEntityStatus Class
#' @format An \code{R6Class} generator object
#' @field ACTIVE Count of ACTIVE assets integer [optional]
#' @field ARCHIVED Count of ARCHIVED assets integer [optional]
#' @field PAUSED Count of PAUSED assets integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TotalCountByEntityStatus <- R6::R6Class(
  "TotalCountByEntityStatus",
  public = list(
    `ACTIVE` = NULL,
    `ARCHIVED` = NULL,
    `PAUSED` = NULL,

    #' @description
    #' Initialize a new TotalCountByEntityStatus class.
    #'
    #' @param ACTIVE Count of ACTIVE assets
    #' @param ARCHIVED Count of ARCHIVED assets
    #' @param PAUSED Count of PAUSED assets
    #' @param ... Other optional arguments.
    initialize = function(`ACTIVE` = NULL, `ARCHIVED` = NULL, `PAUSED` = NULL, ...) {
      if (!is.null(`ACTIVE`)) {
        if (!(is.numeric(`ACTIVE`) && length(`ACTIVE`) == 1)) {
          stop(paste("Error! Invalid data for `ACTIVE`. Must be an integer:", `ACTIVE`))
        }
        self$`ACTIVE` <- `ACTIVE`
      }
      if (!is.null(`ARCHIVED`)) {
        if (!(is.numeric(`ARCHIVED`) && length(`ARCHIVED`) == 1)) {
          stop(paste("Error! Invalid data for `ARCHIVED`. Must be an integer:", `ARCHIVED`))
        }
        self$`ARCHIVED` <- `ARCHIVED`
      }
      if (!is.null(`PAUSED`)) {
        if (!(is.numeric(`PAUSED`) && length(`PAUSED`) == 1)) {
          stop(paste("Error! Invalid data for `PAUSED`. Must be an integer:", `PAUSED`))
        }
        self$`PAUSED` <- `PAUSED`
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
    #' @return TotalCountByEntityStatus as a base R list.
    #' @examples
    #' # convert array of TotalCountByEntityStatus (x) to a data frame
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
    #' Convert TotalCountByEntityStatus to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TotalCountByEntityStatusObject <- list()
      if (!is.null(self$`ACTIVE`)) {
        TotalCountByEntityStatusObject[["ACTIVE"]] <-
          self$`ACTIVE`
      }
      if (!is.null(self$`ARCHIVED`)) {
        TotalCountByEntityStatusObject[["ARCHIVED"]] <-
          self$`ARCHIVED`
      }
      if (!is.null(self$`PAUSED`)) {
        TotalCountByEntityStatusObject[["PAUSED"]] <-
          self$`PAUSED`
      }
      return(TotalCountByEntityStatusObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TotalCountByEntityStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of TotalCountByEntityStatus
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ACTIVE`)) {
        self$`ACTIVE` <- this_object$`ACTIVE`
      }
      if (!is.null(this_object$`ARCHIVED`)) {
        self$`ARCHIVED` <- this_object$`ARCHIVED`
      }
      if (!is.null(this_object$`PAUSED`)) {
        self$`PAUSED` <- this_object$`PAUSED`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TotalCountByEntityStatus in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TotalCountByEntityStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of TotalCountByEntityStatus
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ACTIVE` <- this_object$`ACTIVE`
      self$`ARCHIVED` <- this_object$`ARCHIVED`
      self$`PAUSED` <- this_object$`PAUSED`
      self
    },

    #' @description
    #' Validate JSON input with respect to TotalCountByEntityStatus and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TotalCountByEntityStatus
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
# TotalCountByEntityStatus$unlock()
#
## Below is an example to define the print function
# TotalCountByEntityStatus$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TotalCountByEntityStatus$lock()

