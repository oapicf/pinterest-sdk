#' Create a new CatalogsCreateReportResponse
#'
#' @description
#' CatalogsCreateReportResponse Class
#'
#' @docType class
#' @title CatalogsCreateReportResponse
#' @description CatalogsCreateReportResponse Class
#' @format An \code{R6Class} generator object
#' @field token Token to be used to get the report character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreateReportResponse <- R6::R6Class(
  "CatalogsCreateReportResponse",
  public = list(
    `token` = NULL,

    #' @description
    #' Initialize a new CatalogsCreateReportResponse class.
    #'
    #' @param token Token to be used to get the report
    #' @param ... Other optional arguments.
    initialize = function(`token` = NULL, ...) {
      if (!is.null(`token`)) {
        if (!(is.character(`token`) && length(`token`) == 1)) {
          stop(paste("Error! Invalid data for `token`. Must be a string:", `token`))
        }
        self$`token` <- `token`
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
    #' @return CatalogsCreateReportResponse as a base R list.
    #' @examples
    #' # convert array of CatalogsCreateReportResponse (x) to a data frame
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
    #' Convert CatalogsCreateReportResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsCreateReportResponseObject <- list()
      if (!is.null(self$`token`)) {
        CatalogsCreateReportResponseObject[["token"]] <-
          self$`token`
      }
      return(CatalogsCreateReportResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateReportResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`token`)) {
        self$`token` <- this_object$`token`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsCreateReportResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateReportResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`token` <- this_object$`token`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreateReportResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreateReportResponse
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
# CatalogsCreateReportResponse$unlock()
#
## Below is an example to define the print function
# CatalogsCreateReportResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreateReportResponse$lock()

