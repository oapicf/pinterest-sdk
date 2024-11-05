#' Create a new CatalogsReport
#'
#' @description
#' CatalogsReport Class
#'
#' @docType class
#' @title CatalogsReport
#' @description CatalogsReport Class
#' @format An \code{R6Class} generator object
#' @field report_status  character [optional]
#' @field url URL to download the report character [optional]
#' @field size Size of the report in bytes numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsReport <- R6::R6Class(
  "CatalogsReport",
  public = list(
    `report_status` = NULL,
    `url` = NULL,
    `size` = NULL,

    #' @description
    #' Initialize a new CatalogsReport class.
    #'
    #' @param report_status report_status
    #' @param url URL to download the report
    #' @param size Size of the report in bytes
    #' @param ... Other optional arguments.
    initialize = function(`report_status` = NULL, `url` = NULL, `size` = NULL, ...) {
      if (!is.null(`report_status`)) {
        if (!(`report_status` %in% c("FINISHED", "IN_PROGRESS"))) {
          stop(paste("Error! \"", `report_status`, "\" cannot be assigned to `report_status`. Must be \"FINISHED\", \"IN_PROGRESS\".", sep = ""))
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

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReport in JSON format
    toJSON = function() {
      CatalogsReportObject <- list()
      if (!is.null(self$`report_status`)) {
        CatalogsReportObject[["report_status"]] <-
          self$`report_status`
      }
      if (!is.null(self$`url`)) {
        CatalogsReportObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`size`)) {
        CatalogsReportObject[["size"]] <-
          self$`size`
      }
      CatalogsReportObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReport
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReport
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_status`)) {
        if (!is.null(this_object$`report_status`) && !(this_object$`report_status` %in% c("FINISHED", "IN_PROGRESS"))) {
          stop(paste("Error! \"", this_object$`report_status`, "\" cannot be assigned to `report_status`. Must be \"FINISHED\", \"IN_PROGRESS\".", sep = ""))
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

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReport in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReport
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReport
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_status`) && !(this_object$`report_status` %in% c("FINISHED", "IN_PROGRESS"))) {
        stop(paste("Error! \"", this_object$`report_status`, "\" cannot be assigned to `report_status`. Must be \"FINISHED\", \"IN_PROGRESS\".", sep = ""))
      }
      self$`report_status` <- this_object$`report_status`
      self$`url` <- this_object$`url`
      self$`size` <- this_object$`size`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsReport and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsReport
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
# CatalogsReport$unlock()
#
## Below is an example to define the print function
# CatalogsReport$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsReport$lock()

