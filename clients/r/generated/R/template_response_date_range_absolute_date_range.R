#' Create a new TemplateResponseDateRangeAbsoluteDateRange
#'
#' @description
#' The absolute date range of the template
#'
#' @docType class
#' @title TemplateResponseDateRangeAbsoluteDateRange
#' @description TemplateResponseDateRangeAbsoluteDateRange Class
#' @format An \code{R6Class} generator object
#' @field type The date range type character [optional]
#' @field start_date The start date of the date range numeric [optional]
#' @field end_date The end date of the date range numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TemplateResponseDateRangeAbsoluteDateRange <- R6::R6Class(
  "TemplateResponseDateRangeAbsoluteDateRange",
  public = list(
    `type` = NULL,
    `start_date` = NULL,
    `end_date` = NULL,

    #' @description
    #' Initialize a new TemplateResponseDateRangeAbsoluteDateRange class.
    #'
    #' @param type The date range type
    #' @param start_date The start date of the date range
    #' @param end_date The end date of the date range
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `start_date` = NULL, `end_date` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`start_date`)) {
        self$`start_date` <- `start_date`
      }
      if (!is.null(`end_date`)) {
        self$`end_date` <- `end_date`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponseDateRangeAbsoluteDateRange in JSON format
    toJSON = function() {
      TemplateResponseDateRangeAbsoluteDateRangeObject <- list()
      if (!is.null(self$`type`)) {
        TemplateResponseDateRangeAbsoluteDateRangeObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`start_date`)) {
        TemplateResponseDateRangeAbsoluteDateRangeObject[["start_date"]] <-
          self$`start_date`
      }
      if (!is.null(self$`end_date`)) {
        TemplateResponseDateRangeAbsoluteDateRangeObject[["end_date"]] <-
          self$`end_date`
      }
      TemplateResponseDateRangeAbsoluteDateRangeObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRangeAbsoluteDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRangeAbsoluteDateRange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponseDateRangeAbsoluteDateRange in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`start_date`)) {
          sprintf(
          '"start_date":
            %d
                    ',
          self$`start_date`
          )
        },
        if (!is.null(self$`end_date`)) {
          sprintf(
          '"end_date":
            %d
                    ',
          self$`end_date`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRangeAbsoluteDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRangeAbsoluteDateRange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      self$`start_date` <- this_object$`start_date`
      self$`end_date` <- this_object$`end_date`
      self
    },

    #' @description
    #' Validate JSON input with respect to TemplateResponseDateRangeAbsoluteDateRange and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TemplateResponseDateRangeAbsoluteDateRange
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
# TemplateResponseDateRangeAbsoluteDateRange$unlock()
#
## Below is an example to define the print function
# TemplateResponseDateRangeAbsoluteDateRange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TemplateResponseDateRangeAbsoluteDateRange$lock()

