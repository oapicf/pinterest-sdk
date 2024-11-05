#' Create a new TemplateResponseDateRangeRelativeDateRange
#'
#' @description
#' The relative date range of the template
#'
#' @docType class
#' @title TemplateResponseDateRangeRelativeDateRange
#' @description TemplateResponseDateRangeRelativeDateRange Class
#' @format An \code{R6Class} generator object
#' @field type The date range type character [optional]
#' @field start_days_in_past The start date of the date range numeric [optional]
#' @field end_days_in_past The end date of the date range numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TemplateResponseDateRangeRelativeDateRange <- R6::R6Class(
  "TemplateResponseDateRangeRelativeDateRange",
  public = list(
    `type` = NULL,
    `start_days_in_past` = NULL,
    `end_days_in_past` = NULL,

    #' @description
    #' Initialize a new TemplateResponseDateRangeRelativeDateRange class.
    #'
    #' @param type The date range type
    #' @param start_days_in_past The start date of the date range
    #' @param end_days_in_past The end date of the date range
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `start_days_in_past` = NULL, `end_days_in_past` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`start_days_in_past`)) {
        self$`start_days_in_past` <- `start_days_in_past`
      }
      if (!is.null(`end_days_in_past`)) {
        self$`end_days_in_past` <- `end_days_in_past`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponseDateRangeRelativeDateRange in JSON format
    toJSON = function() {
      TemplateResponseDateRangeRelativeDateRangeObject <- list()
      if (!is.null(self$`type`)) {
        TemplateResponseDateRangeRelativeDateRangeObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`start_days_in_past`)) {
        TemplateResponseDateRangeRelativeDateRangeObject[["start_days_in_past"]] <-
          self$`start_days_in_past`
      }
      if (!is.null(self$`end_days_in_past`)) {
        TemplateResponseDateRangeRelativeDateRangeObject[["end_days_in_past"]] <-
          self$`end_days_in_past`
      }
      TemplateResponseDateRangeRelativeDateRangeObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRangeRelativeDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRangeRelativeDateRange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`start_days_in_past`)) {
        self$`start_days_in_past` <- this_object$`start_days_in_past`
      }
      if (!is.null(this_object$`end_days_in_past`)) {
        self$`end_days_in_past` <- this_object$`end_days_in_past`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponseDateRangeRelativeDateRange in JSON format
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
        if (!is.null(self$`start_days_in_past`)) {
          sprintf(
          '"start_days_in_past":
            %d
                    ',
          self$`start_days_in_past`
          )
        },
        if (!is.null(self$`end_days_in_past`)) {
          sprintf(
          '"end_days_in_past":
            %d
                    ',
          self$`end_days_in_past`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRangeRelativeDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRangeRelativeDateRange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      self$`start_days_in_past` <- this_object$`start_days_in_past`
      self$`end_days_in_past` <- this_object$`end_days_in_past`
      self
    },

    #' @description
    #' Validate JSON input with respect to TemplateResponseDateRangeRelativeDateRange and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TemplateResponseDateRangeRelativeDateRange
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
# TemplateResponseDateRangeRelativeDateRange$unlock()
#
## Below is an example to define the print function
# TemplateResponseDateRangeRelativeDateRange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TemplateResponseDateRangeRelativeDateRange$lock()

