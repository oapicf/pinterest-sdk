#' Create a new BulkUpsertStatusResponse
#'
#' @description
#' ID of the bulk request.
#'
#' @docType class
#' @title BulkUpsertStatusResponse
#' @description BulkUpsertStatusResponse Class
#' @format An \code{R6Class} generator object
#' @field status  \link{BulkUpsertStatus} [optional]
#' @field result_url  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkUpsertStatusResponse <- R6::R6Class(
  "BulkUpsertStatusResponse",
  public = list(
    `status` = NULL,
    `result_url` = NULL,
    #' Initialize a new BulkUpsertStatusResponse class.
    #'
    #' @description
    #' Initialize a new BulkUpsertStatusResponse class.
    #'
    #' @param status status
    #' @param result_url result_url
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `result_url` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`result_url`)) {
        if (!(is.character(`result_url`) && length(`result_url`) == 1)) {
          stop(paste("Error! Invalid data for `result_url`. Must be a string:", `result_url`))
        }
        self$`result_url` <- `result_url`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertStatusResponse in JSON format
    #' @export
    toJSON = function() {
      BulkUpsertStatusResponseObject <- list()
      if (!is.null(self$`status`)) {
        BulkUpsertStatusResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`result_url`)) {
        BulkUpsertStatusResponseObject[["result_url"]] <-
          self$`result_url`
      }
      BulkUpsertStatusResponseObject
    },
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertStatusResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- BulkUpsertStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`result_url`)) {
        self$`result_url` <- this_object$`result_url`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertStatusResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`result_url`)) {
          sprintf(
          '"result_url":
            "%s"
                    ',
          self$`result_url`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertStatusResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- BulkUpsertStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`result_url` <- this_object$`result_url`
      self
    },
    #' Validate JSON input with respect to BulkUpsertStatusResponse
    #'
    #' @description
    #' Validate JSON input with respect to BulkUpsertStatusResponse and throw an exception if invalid
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
    #' @return String representation of BulkUpsertStatusResponse
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
# BulkUpsertStatusResponse$unlock()
#
## Below is an example to define the print function
# BulkUpsertStatusResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertStatusResponse$lock()

