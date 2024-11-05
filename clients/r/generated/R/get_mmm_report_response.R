#' Create a new GetMMMReportResponse
#'
#' @description
#' GetMMMReportResponse Class
#'
#' @docType class
#' @title GetMMMReportResponse
#' @description GetMMMReportResponse Class
#' @format An \code{R6Class} generator object
#' @field code  numeric [optional]
#' @field data  \link{GetMMMReportResponseData} [optional]
#' @field message  character [optional]
#' @field status  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetMMMReportResponse <- R6::R6Class(
  "GetMMMReportResponse",
  public = list(
    `code` = NULL,
    `data` = NULL,
    `message` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new GetMMMReportResponse class.
    #'
    #' @param code code
    #' @param data data
    #' @param message message
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `data` = NULL, `message` = NULL, `status` = NULL, ...) {
      if (!is.null(`code`)) {
        self$`code` <- `code`
      }
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return GetMMMReportResponse in JSON format
    toJSON = function() {
      GetMMMReportResponseObject <- list()
      if (!is.null(self$`code`)) {
        GetMMMReportResponseObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`data`)) {
        GetMMMReportResponseObject[["data"]] <-
          self$`data`$toJSON()
      }
      if (!is.null(self$`message`)) {
        GetMMMReportResponseObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`status`)) {
        GetMMMReportResponseObject[["status"]] <-
          self$`status`
      }
      GetMMMReportResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of GetMMMReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetMMMReportResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`data`)) {
        `data_object` <- GetMMMReportResponseData$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return GetMMMReportResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            %d
                    ',
          self$`code`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of GetMMMReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetMMMReportResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`data` <- GetMMMReportResponseData$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`message` <- this_object$`message`
      self$`status` <- this_object$`status`
      self
    },

    #' @description
    #' Validate JSON input with respect to GetMMMReportResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetMMMReportResponse
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
# GetMMMReportResponse$unlock()
#
## Below is an example to define the print function
# GetMMMReportResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetMMMReportResponse$lock()

