#' Create a new GetMMMReportResponseData
#'
#' @description
#' GetMMMReportResponseData Class
#'
#' @docType class
#' @title GetMMMReportResponseData
#' @description GetMMMReportResponseData Class
#' @format An \code{R6Class} generator object
#' @field report_status  character [optional]
#' @field url  character [optional]
#' @field size  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetMMMReportResponseData <- R6::R6Class(
  "GetMMMReportResponseData",
  public = list(
    `report_status` = NULL,
    `url` = NULL,
    `size` = NULL,
    #' Initialize a new GetMMMReportResponseData class.
    #'
    #' @description
    #' Initialize a new GetMMMReportResponseData class.
    #'
    #' @param report_status report_status
    #' @param url url
    #' @param size size
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`report_status` = NULL, `url` = NULL, `size` = NULL, ...) {
      if (!is.null(`report_status`)) {
        if (!(`report_status` %in% c("DOES_NOT_EXIST", "FINISHED", "IN_PROGRESS", "EXPIRED", "FAILED", "CANCELLED"))) {
          stop(paste("Error! \"", `report_status`, "\" cannot be assigned to `report_status`. Must be \"DOES_NOT_EXIST\", \"FINISHED\", \"IN_PROGRESS\", \"EXPIRED\", \"FAILED\", \"CANCELLED\".", sep = ""))
        }
        if (!(is.character(`report_status`) && length(`report_status`) == 1)) {
          stop(paste("Error! Invalid data for `report_status`. Must be a string:", `report_status`))
        }
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetMMMReportResponseData in JSON format
    #' @export
    toJSON = function() {
      GetMMMReportResponseDataObject <- list()
      if (!is.null(self$`report_status`)) {
        GetMMMReportResponseDataObject[["report_status"]] <-
          self$`report_status`
      }
      if (!is.null(self$`url`)) {
        GetMMMReportResponseDataObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`size`)) {
        GetMMMReportResponseDataObject[["size"]] <-
          self$`size`
      }
      GetMMMReportResponseDataObject
    },
    #' Deserialize JSON string into an instance of GetMMMReportResponseData
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetMMMReportResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetMMMReportResponseData
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_status`)) {
        if (!is.null(this_object$`report_status`) && !(this_object$`report_status` %in% c("DOES_NOT_EXIST", "FINISHED", "IN_PROGRESS", "EXPIRED", "FAILED", "CANCELLED"))) {
          stop(paste("Error! \"", this_object$`report_status`, "\" cannot be assigned to `report_status`. Must be \"DOES_NOT_EXIST\", \"FINISHED\", \"IN_PROGRESS\", \"EXPIRED\", \"FAILED\", \"CANCELLED\".", sep = ""))
        }
        self$`report_status` <- this_object$`report_status`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetMMMReportResponseData in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`report_status`)) {
          sprintf(
          '"report_status":
            "%s"
                    ',
          self$`report_status`
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
    #' Deserialize JSON string into an instance of GetMMMReportResponseData
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetMMMReportResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetMMMReportResponseData
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_status`) && !(this_object$`report_status` %in% c("DOES_NOT_EXIST", "FINISHED", "IN_PROGRESS", "EXPIRED", "FAILED", "CANCELLED"))) {
        stop(paste("Error! \"", this_object$`report_status`, "\" cannot be assigned to `report_status`. Must be \"DOES_NOT_EXIST\", \"FINISHED\", \"IN_PROGRESS\", \"EXPIRED\", \"FAILED\", \"CANCELLED\".", sep = ""))
      }
      self$`report_status` <- this_object$`report_status`
      self$`url` <- this_object$`url`
      self$`size` <- this_object$`size`
      self
    },
    #' Validate JSON input with respect to GetMMMReportResponseData
    #'
    #' @description
    #' Validate JSON input with respect to GetMMMReportResponseData and throw an exception if invalid
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
    #' @return String representation of GetMMMReportResponseData
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
# GetMMMReportResponseData$unlock()
#
## Below is an example to define the print function
# GetMMMReportResponseData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetMMMReportResponseData$lock()

