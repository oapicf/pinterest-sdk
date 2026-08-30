#' Create a new CampaignPlanningConfidenceLevelAlert
#'
#' @description
#' A confidence level alert for the delivery estimates provided in the response.
#'
#' @docType class
#' @title CampaignPlanningConfidenceLevelAlert
#' @description CampaignPlanningConfidenceLevelAlert Class
#' @format An \code{R6Class} generator object
#' @field description Human-readable context for debugging. Not intended for display to end users. character [optional]
#' @field reason Reason for the confidence level alert. \link{CampaignPlanningConfidenceLevelAlertReason} [optional]
#' @field severity Severity of the confidence level alert. \link{CampaignPlanningConfidenceLevelAlertSeverity} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningConfidenceLevelAlert <- R6::R6Class(
  "CampaignPlanningConfidenceLevelAlert",
  public = list(
    `description` = NULL,
    `reason` = NULL,
    `severity` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningConfidenceLevelAlert class.
    #'
    #' @param description Human-readable context for debugging. Not intended for display to end users.
    #' @param reason Reason for the confidence level alert.
    #' @param severity Severity of the confidence level alert.
    #' @param ... Other optional arguments.
    initialize = function(`description` = NULL, `reason` = NULL, `severity` = NULL, ...) {
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`reason`)) {
        if (!(`reason` %in% c())) {
          stop(paste("Error! \"", `reason`, "\" cannot be assigned to `reason`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`reason`))
        self$`reason` <- `reason`
      }
      if (!is.null(`severity`)) {
        if (!(`severity` %in% c())) {
          stop(paste("Error! \"", `severity`, "\" cannot be assigned to `severity`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`severity`))
        self$`severity` <- `severity`
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
    #' @return CampaignPlanningConfidenceLevelAlert as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningConfidenceLevelAlert (x) to a data frame
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
    #' Convert CampaignPlanningConfidenceLevelAlert to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningConfidenceLevelAlertObject <- list()
      if (!is.null(self$`description`)) {
        CampaignPlanningConfidenceLevelAlertObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`reason`)) {
        CampaignPlanningConfidenceLevelAlertObject[["reason"]] <-
          self$extractSimpleType(self$`reason`)
      }
      if (!is.null(self$`severity`)) {
        CampaignPlanningConfidenceLevelAlertObject[["severity"]] <-
          self$extractSimpleType(self$`severity`)
      }
      return(CampaignPlanningConfidenceLevelAlertObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningConfidenceLevelAlert
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningConfidenceLevelAlert
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`reason`)) {
        `reason_object` <- CampaignPlanningConfidenceLevelAlertReason$new()
        `reason_object`$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
        self$`reason` <- `reason_object`
      }
      if (!is.null(this_object$`severity`)) {
        `severity_object` <- CampaignPlanningConfidenceLevelAlertSeverity$new()
        `severity_object`$fromJSON(jsonlite::toJSON(this_object$`severity`, auto_unbox = TRUE, digits = NA))
        self$`severity` <- `severity_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningConfidenceLevelAlert in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningConfidenceLevelAlert
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningConfidenceLevelAlert
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`reason` <- CampaignPlanningConfidenceLevelAlertReason$new()$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
      self$`severity` <- CampaignPlanningConfidenceLevelAlertSeverity$new()$fromJSON(jsonlite::toJSON(this_object$`severity`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningConfidenceLevelAlert and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningConfidenceLevelAlert
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
# CampaignPlanningConfidenceLevelAlert$unlock()
#
## Below is an example to define the print function
# CampaignPlanningConfidenceLevelAlert$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningConfidenceLevelAlert$lock()

