#' Create a new CatalogsCreateReportResponse
#'
#' @description
#' CatalogsCreateReportResponse Class
#'
#' @docType class
#' @title CatalogsCreateReportResponse
#' @description CatalogsCreateReportResponse Class
#' @format An \code{R6Class} generator object
#' @field token Token to be used to get the report character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreateReportResponse <- R6::R6Class(
  "CatalogsCreateReportResponse",
  public = list(
    `token` = NULL,

    #' @description
    #' Initialize a new CatalogsCreateReportResponse class.
    #'
    #' @param token Token to be used to get the report
    #' @param ... Other optional arguments.
    initialize = function(`token` = NULL, ...) {
      if (!is.null(`token`)) {
        if (!(is.character(`token`) && length(`token`) == 1)) {
          stop(paste("Error! Invalid data for `token`. Must be a string:", `token`))
        }
        self$`token` <- `token`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreateReportResponse in JSON format
    toJSON = function() {
      CatalogsCreateReportResponseObject <- list()
      if (!is.null(self$`token`)) {
        CatalogsCreateReportResponseObject[["token"]] <-
          self$`token`
      }
      CatalogsCreateReportResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateReportResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`token`)) {
        self$`token` <- this_object$`token`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreateReportResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`token`)) {
          sprintf(
          '"token":
            "%s"
                    ',
          self$`token`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateReportResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateReportResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`token` <- this_object$`token`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreateReportResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreateReportResponse
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
# CatalogsCreateReportResponse$unlock()
#
## Below is an example to define the print function
# CatalogsCreateReportResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreateReportResponse$lock()

