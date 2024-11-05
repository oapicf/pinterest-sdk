#' Create a new LeadsExportResponseData
#'
#' @description
#' LeadsExportResponseData Class
#'
#' @docType class
#' @title LeadsExportResponseData
#' @description LeadsExportResponseData Class
#' @format An \code{R6Class} generator object
#' @field export_status  \link{LeadsExportStatus} [optional]
#' @field download_url  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadsExportResponseData <- R6::R6Class(
  "LeadsExportResponseData",
  public = list(
    `export_status` = NULL,
    `download_url` = NULL,

    #' @description
    #' Initialize a new LeadsExportResponseData class.
    #'
    #' @param export_status export_status
    #' @param download_url download_url
    #' @param ... Other optional arguments.
    initialize = function(`export_status` = NULL, `download_url` = NULL, ...) {
      if (!is.null(`export_status`)) {
        if (!(`export_status` %in% c())) {
          stop(paste("Error! \"", `export_status`, "\" cannot be assigned to `export_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`export_status`))
        self$`export_status` <- `export_status`
      }
      if (!is.null(`download_url`)) {
        if (!(is.character(`download_url`) && length(`download_url`) == 1)) {
          stop(paste("Error! Invalid data for `download_url`. Must be a string:", `download_url`))
        }
        self$`download_url` <- `download_url`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadsExportResponseData in JSON format
    toJSON = function() {
      LeadsExportResponseDataObject <- list()
      if (!is.null(self$`export_status`)) {
        LeadsExportResponseDataObject[["export_status"]] <-
          self$`export_status`$toJSON()
      }
      if (!is.null(self$`download_url`)) {
        LeadsExportResponseDataObject[["download_url"]] <-
          self$`download_url`
      }
      LeadsExportResponseDataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportResponseData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`export_status`)) {
        `export_status_object` <- LeadsExportStatus$new()
        `export_status_object`$fromJSON(jsonlite::toJSON(this_object$`export_status`, auto_unbox = TRUE, digits = NA))
        self$`export_status` <- `export_status_object`
      }
      if (!is.null(this_object$`download_url`)) {
        self$`download_url` <- this_object$`download_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadsExportResponseData in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`export_status`)) {
          sprintf(
          '"export_status":
          %s
          ',
          jsonlite::toJSON(self$`export_status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`download_url`)) {
          sprintf(
          '"download_url":
            "%s"
                    ',
          self$`download_url`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportResponseData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`export_status` <- LeadsExportStatus$new()$fromJSON(jsonlite::toJSON(this_object$`export_status`, auto_unbox = TRUE, digits = NA))
      self$`download_url` <- this_object$`download_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadsExportResponseData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadsExportResponseData
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
# LeadsExportResponseData$unlock()
#
## Below is an example to define the print function
# LeadsExportResponseData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadsExportResponseData$lock()

