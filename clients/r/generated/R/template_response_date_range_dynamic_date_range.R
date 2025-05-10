#' Create a new TemplateResponseDateRangeDynamicDateRange
#'
#' @description
#' The dynamic date range of the template
#'
#' @docType class
#' @title TemplateResponseDateRangeDynamicDateRange
#' @description TemplateResponseDateRangeDynamicDateRange Class
#' @format An \code{R6Class} generator object
#' @field type The date range type character [optional]
#' @field range The dynamic range type character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TemplateResponseDateRangeDynamicDateRange <- R6::R6Class(
  "TemplateResponseDateRangeDynamicDateRange",
  public = list(
    `type` = NULL,
    `range` = NULL,

    #' @description
    #' Initialize a new TemplateResponseDateRangeDynamicDateRange class.
    #'
    #' @param type The date range type
    #' @param range The dynamic range type
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `range` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`range`)) {
        if (!(`range` %in% c("YEAR_TO_DATE", "QUARTER_TO_DATE", "MONTH_TO_DATE", "LAST_MONTH"))) {
          stop(paste("Error! \"", `range`, "\" cannot be assigned to `range`. Must be \"YEAR_TO_DATE\", \"QUARTER_TO_DATE\", \"MONTH_TO_DATE\", \"LAST_MONTH\".", sep = ""))
        }
        if (!(is.character(`range`) && length(`range`) == 1)) {
          stop(paste("Error! Invalid data for `range`. Must be a string:", `range`))
        }
        self$`range` <- `range`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return TemplateResponseDateRangeDynamicDateRange as a base R list.
    #' @examples
    #' # convert array of TemplateResponseDateRangeDynamicDateRange (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert TemplateResponseDateRangeDynamicDateRange to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TemplateResponseDateRangeDynamicDateRangeObject <- list()
      if (!is.null(self$`type`)) {
        TemplateResponseDateRangeDynamicDateRangeObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`range`)) {
        TemplateResponseDateRangeDynamicDateRangeObject[["range"]] <-
          self$`range`
      }
      return(TemplateResponseDateRangeDynamicDateRangeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRangeDynamicDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRangeDynamicDateRange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`range`)) {
        if (!is.null(this_object$`range`) && !(this_object$`range` %in% c("YEAR_TO_DATE", "QUARTER_TO_DATE", "MONTH_TO_DATE", "LAST_MONTH"))) {
          stop(paste("Error! \"", this_object$`range`, "\" cannot be assigned to `range`. Must be \"YEAR_TO_DATE\", \"QUARTER_TO_DATE\", \"MONTH_TO_DATE\", \"LAST_MONTH\".", sep = ""))
        }
        self$`range` <- this_object$`range`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TemplateResponseDateRangeDynamicDateRange in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateResponseDateRangeDynamicDateRange
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateResponseDateRangeDynamicDateRange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      if (!is.null(this_object$`range`) && !(this_object$`range` %in% c("YEAR_TO_DATE", "QUARTER_TO_DATE", "MONTH_TO_DATE", "LAST_MONTH"))) {
        stop(paste("Error! \"", this_object$`range`, "\" cannot be assigned to `range`. Must be \"YEAR_TO_DATE\", \"QUARTER_TO_DATE\", \"MONTH_TO_DATE\", \"LAST_MONTH\".", sep = ""))
      }
      self$`range` <- this_object$`range`
      self
    },

    #' @description
    #' Validate JSON input with respect to TemplateResponseDateRangeDynamicDateRange and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TemplateResponseDateRangeDynamicDateRange
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
# TemplateResponseDateRangeDynamicDateRange$unlock()
#
## Below is an example to define the print function
# TemplateResponseDateRangeDynamicDateRange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TemplateResponseDateRangeDynamicDateRange$lock()

