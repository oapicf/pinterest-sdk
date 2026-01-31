#' Create a new BulkUpsertStatusResponse
#'
#' @description
#' ID of the bulk request.
#'
#' @docType class
#' @title BulkUpsertStatusResponse
#' @description BulkUpsertStatusResponse Class
#' @format An \code{R6Class} generator object
#' @field result_url  character [optional]
#' @field status  \link{BulkUpsertStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkUpsertStatusResponse <- R6::R6Class(
  "BulkUpsertStatusResponse",
  public = list(
    `result_url` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new BulkUpsertStatusResponse class.
    #'
    #' @param result_url result_url
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`result_url` = NULL, `status` = NULL, ...) {
      if (!is.null(`result_url`)) {
        if (!(is.character(`result_url`) && length(`result_url`) == 1)) {
          stop(paste("Error! Invalid data for `result_url`. Must be a string:", `result_url`))
        }
        self$`result_url` <- `result_url`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
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
    #' @return BulkUpsertStatusResponse as a base R list.
    #' @examples
    #' # convert array of BulkUpsertStatusResponse (x) to a data frame
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
    #' Convert BulkUpsertStatusResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkUpsertStatusResponseObject <- list()
      if (!is.null(self$`result_url`)) {
        BulkUpsertStatusResponseObject[["result_url"]] <-
          self$`result_url`
      }
      if (!is.null(self$`status`)) {
        BulkUpsertStatusResponseObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      return(BulkUpsertStatusResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertStatusResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`result_url`)) {
        self$`result_url` <- this_object$`result_url`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- BulkUpsertStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkUpsertStatusResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertStatusResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`result_url` <- this_object$`result_url`
      self$`status` <- BulkUpsertStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkUpsertStatusResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkUpsertStatusResponse
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
# BulkUpsertStatusResponse$unlock()
#
## Below is an example to define the print function
# BulkUpsertStatusResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertStatusResponse$lock()

