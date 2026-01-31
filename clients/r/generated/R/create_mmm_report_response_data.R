#' Create a new CreateMMMReportResponseData
#'
#' @description
#' CreateMMMReportResponseData Class
#'
#' @docType class
#' @title CreateMMMReportResponseData
#' @description CreateMMMReportResponseData Class
#' @format An \code{R6Class} generator object
#' @field message  character [optional]
#' @field report_status  \link{BulkReportingJobStatus} [optional]
#' @field status  character [optional]
#' @field token  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateMMMReportResponseData <- R6::R6Class(
  "CreateMMMReportResponseData",
  public = list(
    `message` = NULL,
    `report_status` = NULL,
    `status` = NULL,
    `token` = NULL,

    #' @description
    #' Initialize a new CreateMMMReportResponseData class.
    #'
    #' @param message message
    #' @param report_status report_status
    #' @param status status
    #' @param token token
    #' @param ... Other optional arguments.
    initialize = function(`message` = NULL, `report_status` = NULL, `status` = NULL, `token` = NULL, ...) {
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
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
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
    #' @return CreateMMMReportResponseData as a base R list.
    #' @examples
    #' # convert array of CreateMMMReportResponseData (x) to a data frame
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
    #' Convert CreateMMMReportResponseData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateMMMReportResponseDataObject <- list()
      if (!is.null(self$`message`)) {
        CreateMMMReportResponseDataObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`report_status`)) {
        CreateMMMReportResponseDataObject[["report_status"]] <-
          self$`report_status`$toSimpleType()
      }
      if (!is.null(self$`status`)) {
        CreateMMMReportResponseDataObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`token`)) {
        CreateMMMReportResponseDataObject[["token"]] <-
          self$`token`
      }
      return(CreateMMMReportResponseDataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateMMMReportResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMMMReportResponseData
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
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
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
    #' @return CreateMMMReportResponseData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateMMMReportResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMMMReportResponseData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message` <- this_object$`message`
      self$`report_status` <- BulkReportingJobStatus$new()$fromJSON(jsonlite::toJSON(this_object$`report_status`, auto_unbox = TRUE, digits = NA))
      self$`status` <- this_object$`status`
      self$`token` <- this_object$`token`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateMMMReportResponseData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateMMMReportResponseData
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
# CreateMMMReportResponseData$unlock()
#
## Below is an example to define the print function
# CreateMMMReportResponseData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateMMMReportResponseData$lock()

