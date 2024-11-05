#' Create a new TemplateResponseDateRange
#'
#' @description
#' TemplateResponseDateRange Class
#'
#' @docType class
#' @title TemplateResponseDateRange
#' @description TemplateResponseDateRange Class
#' @format An \code{R6Class} generator object
#' @field dynamic_date_range  \link{TemplateResponseDateRangeDynamicDateRange} [optional]
#' @field relative_date_range  \link{TemplateResponseDateRangeRelativeDateRange} [optional]
#' @field absolute_date_range  \link{TemplateResponseDateRangeAbsoluteDateRange} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TemplateResponseDateRange <- R6::R6Class(
  "TemplateResponseDateRange",
  public = list(
    `dynamic_date_range` = NULL,
    `relative_date_range` = NULL,
    `absolute_date_range` = NULL,

    #' @description
    #' Initialize a new TemplateResponseDateRange class.
    #'
    #' @param dynamic_date_range dynamic_date_range
    #' @param relative_date_range relative_date_range
    #' @param absolute_date_range absolute_date_range
    #' @param ... Other optional arguments.
    initialize = function(`dynamic_date_range` = NULL, `relative_date_range` = NULL, `absolute_date_range` = NULL, ...) {
      if (!is.null(`dynamic_date_range`)) {
        stopifnot(R6::is.R6(`dynamic_date_range`))
        self$`dynamic_date_range` <- `dynamic_date_range`
      }
      if (!is.null(`relative_date_range`)) {
        stopifnot(R6::is.R6(`relative_date_range`))
        self$`relative_date_range` <- `relative_date_range`
      }
      if (!is.null(`absolute_date_range`)) {
        stopifnot(R6::is.R6(`absolute_date_range`))
        self$`absolute_date_range` <- `absolute_date_range`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponseDateRange in JSON format
    toJSON = function() {
      TemplateResponseDateRangeObject <- list()
      if (!is.null(self$`dynamic_date_range`)) {
        TemplateResponseDateRangeObject[["dynamic_date_range"]] <-
          self$`dynamic_date_range`$toJSON()
      }
      if (!is.null(self$`relative_date_range`)) {
        TemplateResponseDateRangeObject[["relative_date_range"]] <-
          self$`relative_date_range`$toJSON()
      }
      if (!is.null(self$`absolute_date_range`)) {
        TemplateResponseDateRangeObject[["absolute_date_range"]] <-
          self$`absolute_date_range`$toJSON()
      }
      TemplateResponseDateRangeObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dynamic_date_range`)) {
        `dynamic_date_range_object` <- TemplateResponseDateRangeDynamicDateRange$new()
        `dynamic_date_range_object`$fromJSON(jsonlite::toJSON(this_object$`dynamic_date_range`, auto_unbox = TRUE, digits = NA))
        self$`dynamic_date_range` <- `dynamic_date_range_object`
      }
      if (!is.null(this_object$`relative_date_range`)) {
        `relative_date_range_object` <- TemplateResponseDateRangeRelativeDateRange$new()
        `relative_date_range_object`$fromJSON(jsonlite::toJSON(this_object$`relative_date_range`, auto_unbox = TRUE, digits = NA))
        self$`relative_date_range` <- `relative_date_range_object`
      }
      if (!is.null(this_object$`absolute_date_range`)) {
        `absolute_date_range_object` <- TemplateResponseDateRangeAbsoluteDateRange$new()
        `absolute_date_range_object`$fromJSON(jsonlite::toJSON(this_object$`absolute_date_range`, auto_unbox = TRUE, digits = NA))
        self$`absolute_date_range` <- `absolute_date_range_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TemplateResponseDateRange in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`dynamic_date_range`)) {
          sprintf(
          '"dynamic_date_range":
          %s
          ',
          jsonlite::toJSON(self$`dynamic_date_range`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`relative_date_range`)) {
          sprintf(
          '"relative_date_range":
          %s
          ',
          jsonlite::toJSON(self$`relative_date_range`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`absolute_date_range`)) {
          sprintf(
          '"absolute_date_range":
          %s
          ',
          jsonlite::toJSON(self$`absolute_date_range`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dynamic_date_range` <- TemplateResponseDateRangeDynamicDateRange$new()$fromJSON(jsonlite::toJSON(this_object$`dynamic_date_range`, auto_unbox = TRUE, digits = NA))
      self$`relative_date_range` <- TemplateResponseDateRangeRelativeDateRange$new()$fromJSON(jsonlite::toJSON(this_object$`relative_date_range`, auto_unbox = TRUE, digits = NA))
      self$`absolute_date_range` <- TemplateResponseDateRangeAbsoluteDateRange$new()$fromJSON(jsonlite::toJSON(this_object$`absolute_date_range`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TemplateResponseDateRange and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TemplateResponseDateRange
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
# TemplateResponseDateRange$unlock()
#
## Below is an example to define the print function
# TemplateResponseDateRange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TemplateResponseDateRange$lock()

