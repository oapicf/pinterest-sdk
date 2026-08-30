#' Create a new TemplateBasedReportCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title TemplateBasedReportCreate
#' @description TemplateBasedReportCreate Class
#' @format An \code{R6Class} generator object
#' @field message  character [optional]
#' @field report_status  \link{BulkReportingJobStatus}
#' @field token  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TemplateBasedReportCreate <- R6::R6Class(
  "TemplateBasedReportCreate",
  public = list(
    `message` = NULL,
    `report_status` = NULL,
    `token` = NULL,

    #' @description
    #' Initialize a new TemplateBasedReportCreate class.
    #'
    #' @param report_status report_status
    #' @param message message
    #' @param token token
    #' @param ... Other optional arguments.
    initialize = function(`report_status`, `message` = NULL, `token` = NULL, ...) {
      if (!missing(`report_status`)) {
        if (!(`report_status` %in% c())) {
          stop(paste("Error! \"", `report_status`, "\" cannot be assigned to `report_status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`report_status`))
        self$`report_status` <- `report_status`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`token`)) {
        if (!(is.character(`token`) && length(`token`) == 1)) {
          stop(paste("Error! Invalid data for `token`. Must be a string:", `token`))
        }
        self$`token` <- `token`
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
    #' @return TemplateBasedReportCreate as a base R list.
    #' @examples
    #' # convert array of TemplateBasedReportCreate (x) to a data frame
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
    #' Convert TemplateBasedReportCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TemplateBasedReportCreateObject <- list()
      if (!is.null(self$`message`)) {
        TemplateBasedReportCreateObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`report_status`)) {
        TemplateBasedReportCreateObject[["report_status"]] <-
          self$extractSimpleType(self$`report_status`)
      }
      if (!is.null(self$`token`)) {
        TemplateBasedReportCreateObject[["token"]] <-
          self$`token`
      }
      return(TemplateBasedReportCreateObject)
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
    #' Deserialize JSON string into an instance of TemplateBasedReportCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateBasedReportCreate
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
      if (!is.null(this_object$`token`)) {
        self$`token` <- this_object$`token`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TemplateBasedReportCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TemplateBasedReportCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TemplateBasedReportCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message` <- this_object$`message`
      self$`report_status` <- BulkReportingJobStatus$new()$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
      self$`token` <- this_object$`token`
      self
    },

    #' @description
    #' Validate JSON input with respect to TemplateBasedReportCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `report_status`
      if (!is.null(input_json$`report_status`)) {
        stopifnot(R6::is.R6(input_json$`report_status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TemplateBasedReportCreate: the required field `report_status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TemplateBasedReportCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `report_status` is null
      if (is.null(self$`report_status`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `report_status` is null
      if (is.null(self$`report_status`)) {
        invalid_fields["report_status"] <- "Non-nullable required field `report_status` cannot be null."
      }

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
# TemplateBasedReportCreate$unlock()
#
## Below is an example to define the print function
# TemplateBasedReportCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TemplateBasedReportCreate$lock()

