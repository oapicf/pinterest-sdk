#' Create a new CampaignPlanningResponseError
#'
#' @description
#' Error encountered while estimating delivery for a campaign.
#'
#' @docType class
#' @title CampaignPlanningResponseError
#' @description CampaignPlanningResponseError Class
#' @format An \code{R6Class} generator object
#' @field code  \link{CampaignPlanningResponseErrorCode} [optional]
#' @field message Human-readable error message. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignPlanningResponseError <- R6::R6Class(
  "CampaignPlanningResponseError",
  public = list(
    `code` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new CampaignPlanningResponseError class.
    #'
    #' @param code code
    #' @param message Human-readable error message.
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `message` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(`code` %in% c())) {
          stop(paste("Error! \"", `code`, "\" cannot be assigned to `code`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`code`))
        self$`code` <- `code`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
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
    #' @return CampaignPlanningResponseError as a base R list.
    #' @examples
    #' # convert array of CampaignPlanningResponseError (x) to a data frame
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
    #' Convert CampaignPlanningResponseError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignPlanningResponseErrorObject <- list()
      if (!is.null(self$`code`)) {
        CampaignPlanningResponseErrorObject[["code"]] <-
          self$extractSimpleType(self$`code`)
      }
      if (!is.null(self$`message`)) {
        CampaignPlanningResponseErrorObject[["message"]] <-
          self$`message`
      }
      return(CampaignPlanningResponseErrorObject)
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
    #' Deserialize JSON string into an instance of CampaignPlanningResponseError
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningResponseError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        `code_object` <- CampaignPlanningResponseErrorCode$new()
        `code_object`$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
        self$`code` <- `code_object`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignPlanningResponseError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignPlanningResponseError
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignPlanningResponseError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- CampaignPlanningResponseErrorCode$new()$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignPlanningResponseError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignPlanningResponseError
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
# CampaignPlanningResponseError$unlock()
#
## Below is an example to define the print function
# CampaignPlanningResponseError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignPlanningResponseError$lock()

