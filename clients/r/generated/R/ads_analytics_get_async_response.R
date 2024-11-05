#' Create a new AdsAnalyticsGetAsyncResponse
#'
#' @description
#' AdsAnalyticsGetAsyncResponse Class
#'
#' @docType class
#' @title AdsAnalyticsGetAsyncResponse
#' @description AdsAnalyticsGetAsyncResponse Class
#' @format An \code{R6Class} generator object
#' @field report_status  \link{BulkReportingJobStatus} [optional]
#' @field url  character [optional]
#' @field size  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsGetAsyncResponse <- R6::R6Class(
  "AdsAnalyticsGetAsyncResponse",
  public = list(
    `report_status` = NULL,
    `url` = NULL,
    `size` = NULL,

    #' @description
    #' Initialize a new AdsAnalyticsGetAsyncResponse class.
    #'
    #' @param report_status report_status
    #' @param url url
    #' @param size size
    #' @param ... Other optional arguments.
    initialize = function(`report_status` = NULL, `url` = NULL, `size` = NULL, ...) {
      if (!is.null(`report_status`)) {
        if (!(`report_status` %in% c())) {
          stop(paste("Error! \"", `report_status`, "\" cannot be assigned to `report_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_status`))
        self$`report_status` <- `report_status`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`size`)) {
        self$`size` <- `size`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsGetAsyncResponse in JSON format
    toJSON = function() {
      AdsAnalyticsGetAsyncResponseObject <- list()
      if (!is.null(self$`report_status`)) {
        AdsAnalyticsGetAsyncResponseObject[["report_status"]] <-
          self$`report_status`$toJSON()
      }
      if (!is.null(self$`url`)) {
        AdsAnalyticsGetAsyncResponseObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`size`)) {
        AdsAnalyticsGetAsyncResponseObject[["size"]] <-
          self$`size`
      }
      AdsAnalyticsGetAsyncResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsGetAsyncResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsGetAsyncResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_status`)) {
        `report_status_object` <- BulkReportingJobStatus$new()
        `report_status_object`$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
        self$`report_status` <- `report_status_object`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsGetAsyncResponse in JSON format
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
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`size`)) {
          sprintf(
          '"size":
            %d
                    ',
          self$`size`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsGetAsyncResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsGetAsyncResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`report_status` <- BulkReportingJobStatus$new()$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
      self$`url` <- this_object$`url`
      self$`size` <- this_object$`size`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsAnalyticsGetAsyncResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsAnalyticsGetAsyncResponse
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
# AdsAnalyticsGetAsyncResponse$unlock()
#
## Below is an example to define the print function
# AdsAnalyticsGetAsyncResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsAnalyticsGetAsyncResponse$lock()

