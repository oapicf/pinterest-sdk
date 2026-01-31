#' Create a new S3MultipartUploadData
#'
#' @description
#' S3MultipartUploadData Class
#'
#' @docType class
#' @title S3MultipartUploadData
#' @description S3MultipartUploadData Class
#' @format An \code{R6Class} generator object
#' @field file_parts Array of file parts with pre-signed URLs. list(\link{S3FilePart}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
S3MultipartUploadData <- R6::R6Class(
  "S3MultipartUploadData",
  public = list(
    `file_parts` = NULL,

    #' @description
    #' Initialize a new S3MultipartUploadData class.
    #'
    #' @param file_parts Array of file parts with pre-signed URLs.
    #' @param ... Other optional arguments.
    initialize = function(`file_parts` = NULL, ...) {
      if (!is.null(`file_parts`)) {
        stopifnot(is.vector(`file_parts`), length(`file_parts`) != 0)
        sapply(`file_parts`, function(x) stopifnot(R6::is.R6(x)))
        self$`file_parts` <- `file_parts`
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
    #' @return S3MultipartUploadData as a base R list.
    #' @examples
    #' # convert array of S3MultipartUploadData (x) to a data frame
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
    #' Convert S3MultipartUploadData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      S3MultipartUploadDataObject <- list()
      if (!is.null(self$`file_parts`)) {
        S3MultipartUploadDataObject[["file_parts"]] <-
          lapply(self$`file_parts`, function(x) x$toSimpleType())
      }
      return(S3MultipartUploadDataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of S3MultipartUploadData
    #'
    #' @param input_json the JSON input
    #' @return the instance of S3MultipartUploadData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_parts`)) {
        self$`file_parts` <- ApiClient$new()$deserializeObj(this_object$`file_parts`, "array[S3FilePart]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return S3MultipartUploadData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of S3MultipartUploadData
    #'
    #' @param input_json the JSON input
    #' @return the instance of S3MultipartUploadData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_parts` <- ApiClient$new()$deserializeObj(this_object$`file_parts`, "array[S3FilePart]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to S3MultipartUploadData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of S3MultipartUploadData
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
# S3MultipartUploadData$unlock()
#
## Below is an example to define the print function
# S3MultipartUploadData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# S3MultipartUploadData$lock()

