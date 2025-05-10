#' Create a new CreateMMMReportResponse
#'
#' @description
#' CreateMMMReportResponse Class
#'
#' @docType class
#' @title CreateMMMReportResponse
#' @description CreateMMMReportResponse Class
#' @format An \code{R6Class} generator object
#' @field code  numeric [optional]
#' @field data  \link{CreateMMMReportResponseData} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateMMMReportResponse <- R6::R6Class(
  "CreateMMMReportResponse",
  public = list(
    `code` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new CreateMMMReportResponse class.
    #'
    #' @param code code
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `data` = NULL, ...) {
      if (!is.null(`code`)) {
        self$`code` <- `code`
      }
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
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
    #' @return CreateMMMReportResponse as a base R list.
    #' @examples
    #' # convert array of CreateMMMReportResponse (x) to a data frame
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
    #' Convert CreateMMMReportResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateMMMReportResponseObject <- list()
      if (!is.null(self$`code`)) {
        CreateMMMReportResponseObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`data`)) {
        CreateMMMReportResponseObject[["data"]] <-
          self$`data`$toSimpleType()
      }
      return(CreateMMMReportResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateMMMReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMMMReportResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`data`)) {
        `data_object` <- CreateMMMReportResponseData$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateMMMReportResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateMMMReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMMMReportResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`data` <- CreateMMMReportResponseData$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateMMMReportResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateMMMReportResponse
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
# CreateMMMReportResponse$unlock()
#
## Below is an example to define the print function
# CreateMMMReportResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateMMMReportResponse$lock()

