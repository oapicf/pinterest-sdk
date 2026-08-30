#' Create a new ConversionProductReport
#'
#' @description
#' ConversionProductReport Class
#'
#' @docType class
#' @title ConversionProductReport
#' @description ConversionProductReport Class
#' @format An \code{R6Class} generator object
#' @field message Message returned from the create report request character [optional]
#' @field report_status Async report status \link{BulkReportingJobStatus} [optional]
#' @field size Size of the report in bytes numeric [optional]
#' @field token Token returned from the create report request character [optional]
#' @field url URL of the report character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionProductReport <- R6::R6Class(
  "ConversionProductReport",
  public = list(
    `message` = NULL,
    `report_status` = NULL,
    `size` = NULL,
    `token` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new ConversionProductReport class.
    #'
    #' @param message Message returned from the create report request
    #' @param report_status Async report status
    #' @param size Size of the report in bytes
    #' @param token Token returned from the create report request
    #' @param url URL of the report
    #' @param ... Other optional arguments.
    initialize = function(`message` = NULL, `report_status` = NULL, `size` = NULL, `token` = NULL, `url` = NULL, ...) {
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`report_status`)) {
        if (!(`report_status` %in% c())) {
          stop(paste("Error! \"", `report_status`, "\" cannot be assigned to `report_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_status`))
        self$`report_status` <- `report_status`
      }
      if (!is.null(`size`)) {
        self$`size` <- `size`
      }
      if (!is.null(`token`)) {
        if (!(is.character(`token`) && length(`token`) == 1)) {
          stop(paste("Error! Invalid data for `token`. Must be a string:", `token`))
        }
        self$`token` <- `token`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
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
    #' @return ConversionProductReport as a base R list.
    #' @examples
    #' # convert array of ConversionProductReport (x) to a data frame
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
    #' Convert ConversionProductReport to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionProductReportObject <- list()
      if (!is.null(self$`message`)) {
        ConversionProductReportObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`report_status`)) {
        ConversionProductReportObject[["report_status"]] <-
          self$extractSimpleType(self$`report_status`)
      }
      if (!is.null(self$`size`)) {
        ConversionProductReportObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`token`)) {
        ConversionProductReportObject[["token"]] <-
          self$`token`
      }
      if (!is.null(self$`url`)) {
        ConversionProductReportObject[["url"]] <-
          self$`url`
      }
      return(ConversionProductReportObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionProductReport
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionProductReport
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`report_status`)) {
        `report_status_object` <- BulkReportingJobStatus$new()
        `report_status_object`$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
        self$`report_status` <- `report_status_object`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`token`)) {
        self$`token` <- this_object$`token`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionProductReport in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionProductReport
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionProductReport
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message` <- this_object$`message`
      self$`report_status` <- BulkReportingJobStatus$new()$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
      self$`size` <- this_object$`size`
      self$`token` <- this_object$`token`
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionProductReport and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionProductReport
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
# ConversionProductReport$unlock()
#
## Below is an example to define the print function
# ConversionProductReport$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionProductReport$lock()

