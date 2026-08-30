#' Create a new DynamicTitlesDownloadCSV
#'
#' @description
#' DynamicTitlesDownloadCSV Class
#'
#' @docType class
#' @title DynamicTitlesDownloadCSV
#' @description DynamicTitlesDownloadCSV Class
#' @format An \code{R6Class} generator object
#' @field download_url Pre-signed S3 URL to download the CSV file. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DynamicTitlesDownloadCSV <- R6::R6Class(
  "DynamicTitlesDownloadCSV",
  public = list(
    `download_url` = NULL,

    #' @description
    #' Initialize a new DynamicTitlesDownloadCSV class.
    #'
    #' @param download_url Pre-signed S3 URL to download the CSV file.
    #' @param ... Other optional arguments.
    initialize = function(`download_url` = NULL, ...) {
      if (!is.null(`download_url`)) {
        if (!(is.character(`download_url`) && length(`download_url`) == 1)) {
          stop(paste("Error! Invalid data for `download_url`. Must be a string:", `download_url`))
        }
        self$`download_url` <- `download_url`
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
    #' @return DynamicTitlesDownloadCSV as a base R list.
    #' @examples
    #' # convert array of DynamicTitlesDownloadCSV (x) to a data frame
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
    #' Convert DynamicTitlesDownloadCSV to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DynamicTitlesDownloadCSVObject <- list()
      if (!is.null(self$`download_url`)) {
        DynamicTitlesDownloadCSVObject[["download_url"]] <-
          self$`download_url`
      }
      return(DynamicTitlesDownloadCSVObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesDownloadCSV
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesDownloadCSV
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`download_url`)) {
        self$`download_url` <- this_object$`download_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DynamicTitlesDownloadCSV in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DynamicTitlesDownloadCSV
    #'
    #' @param input_json the JSON input
    #' @return the instance of DynamicTitlesDownloadCSV
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`download_url` <- this_object$`download_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to DynamicTitlesDownloadCSV and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DynamicTitlesDownloadCSV
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
# DynamicTitlesDownloadCSV$unlock()
#
## Below is an example to define the print function
# DynamicTitlesDownloadCSV$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DynamicTitlesDownloadCSV$lock()

