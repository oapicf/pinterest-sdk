#' Create a new BulkDownloadResponse
#'
#' @description
#' BulkDownloadResponse Class
#'
#' @docType class
#' @title BulkDownloadResponse
#' @description BulkDownloadResponse Class
#' @format An \code{R6Class} generator object
#' @field request_id ID of the bulk request. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkDownloadResponse <- R6::R6Class(
  "BulkDownloadResponse",
  public = list(
    `request_id` = NULL,
    #' Initialize a new BulkDownloadResponse class.
    #'
    #' @description
    #' Initialize a new BulkDownloadResponse class.
    #'
    #' @param request_id ID of the bulk request.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`request_id` = NULL, ...) {
      if (!is.null(`request_id`)) {
        if (!(is.character(`request_id`) && length(`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", `request_id`))
        }
        self$`request_id` <- `request_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkDownloadResponse in JSON format
    #' @export
    toJSON = function() {
      BulkDownloadResponseObject <- list()
      if (!is.null(self$`request_id`)) {
        BulkDownloadResponseObject[["request_id"]] <-
          self$`request_id`
      }
      BulkDownloadResponseObject
    },
    #' Deserialize JSON string into an instance of BulkDownloadResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`request_id`)) {
        self$`request_id` <- this_object$`request_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkDownloadResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`request_id`)) {
          sprintf(
          '"request_id":
            "%s"
                    ',
          self$`request_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BulkDownloadResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkDownloadResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkDownloadResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`request_id` <- this_object$`request_id`
      self
    },
    #' Validate JSON input with respect to BulkDownloadResponse
    #'
    #' @description
    #' Validate JSON input with respect to BulkDownloadResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkDownloadResponse
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# BulkDownloadResponse$unlock()
#
## Below is an example to define the print function
# BulkDownloadResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkDownloadResponse$lock()

