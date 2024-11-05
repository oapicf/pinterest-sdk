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

    #' @description
    #' Initialize a new BulkUpsertStatusResponse class.
    #'
    #' @param status status
    #' @param result_url result_url
    #' @param ... Other optional arguments.
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

    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertStatusResponse in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertStatusResponse
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

    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertStatusResponse in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertStatusResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertStatusResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- BulkUpsertStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`result_url` <- this_object$`result_url`
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

