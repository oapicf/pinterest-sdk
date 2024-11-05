#' Create a new AdsAnalyticsCreateAsyncResponse
#'
#' @description
#' AdsAnalyticsCreateAsyncResponse Class
#'
#' @docType class
#' @title AdsAnalyticsCreateAsyncResponse
#' @description AdsAnalyticsCreateAsyncResponse Class
#' @format An \code{R6Class} generator object
#' @field report_status  \link{BulkReportingJobStatus} [optional]
#' @field token  character [optional]
#' @field message  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsCreateAsyncResponse <- R6::R6Class(
  "AdsAnalyticsCreateAsyncResponse",
  public = list(
    `report_status` = NULL,
    `token` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new AdsAnalyticsCreateAsyncResponse class.
    #'
    #' @param report_status report_status
    #' @param token token
    #' @param message message
    #' @param ... Other optional arguments.
    initialize = function(`report_status` = NULL, `token` = NULL, `message` = NULL, ...) {
      if (!is.null(`report_status`)) {
        if (!(`report_status` %in% c())) {
          stop(paste("Error! \"", `report_status`, "\" cannot be assigned to `report_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_status`))
        self$`report_status` <- `report_status`
      }
      if (!is.null(`token`)) {
        if (!(is.character(`token`) && length(`token`) == 1)) {
          stop(paste("Error! Invalid data for `token`. Must be a string:", `token`))
        }
        self$`token` <- `token`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsCreateAsyncResponse in JSON format
    toJSON = function() {
      AdsAnalyticsCreateAsyncResponseObject <- list()
      if (!is.null(self$`report_status`)) {
        AdsAnalyticsCreateAsyncResponseObject[["report_status"]] <-
          self$`report_status`$toJSON()
      }
      if (!is.null(self$`token`)) {
        AdsAnalyticsCreateAsyncResponseObject[["token"]] <-
          self$`token`
      }
      if (!is.null(self$`message`)) {
        AdsAnalyticsCreateAsyncResponseObject[["message"]] <-
          self$`message`
      }
      AdsAnalyticsCreateAsyncResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsCreateAsyncResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsCreateAsyncResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_status`)) {
        `report_status_object` <- BulkReportingJobStatus$new()
        `report_status_object`$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
        self$`report_status` <- `report_status_object`
      }
      if (!is.null(this_object$`token`)) {
        self$`token` <- this_object$`token`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsCreateAsyncResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`report_status`)) {
          sprintf(
          '"report_status":
          %s
          ',
          jsonlite::toJSON(self$`report_status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`token`)) {
          sprintf(
          '"token":
            "%s"
                    ',
          self$`token`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsCreateAsyncResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsCreateAsyncResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`report_status` <- BulkReportingJobStatus$new()$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
      self$`token` <- this_object$`token`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsAnalyticsCreateAsyncResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsAnalyticsCreateAsyncResponse
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
# AdsAnalyticsCreateAsyncResponse$unlock()
#
## Below is an example to define the print function
# AdsAnalyticsCreateAsyncResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsAnalyticsCreateAsyncResponse$lock()

