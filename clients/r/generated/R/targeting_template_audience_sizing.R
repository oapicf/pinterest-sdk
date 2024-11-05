#' Create a new TargetingTemplateAudienceSizing
#'
#' @description
#' Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
#'
#' @docType class
#' @title TargetingTemplateAudienceSizing
#' @description TargetingTemplateAudienceSizing Class
#' @format An \code{R6Class} generator object
#' @field reach_estimate  \link{TargetingTemplateAudienceSizingReachEstimate} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplateAudienceSizing <- R6::R6Class(
  "TargetingTemplateAudienceSizing",
  public = list(
    `reach_estimate` = NULL,

    #' @description
    #' Initialize a new TargetingTemplateAudienceSizing class.
    #'
    #' @param reach_estimate reach_estimate
    #' @param ... Other optional arguments.
    initialize = function(`reach_estimate` = NULL, ...) {
      if (!is.null(`reach_estimate`)) {
        stopifnot(R6::is.R6(`reach_estimate`))
        self$`reach_estimate` <- `reach_estimate`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateAudienceSizing in JSON format
    toJSON = function() {
      TargetingTemplateAudienceSizingObject <- list()
      if (!is.null(self$`reach_estimate`)) {
        TargetingTemplateAudienceSizingObject[["reach_estimate"]] <-
          self$`reach_estimate`$toJSON()
      }
      TargetingTemplateAudienceSizingObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateAudienceSizing
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateAudienceSizing
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`reach_estimate`)) {
        `reach_estimate_object` <- TargetingTemplateAudienceSizingReachEstimate$new()
        `reach_estimate_object`$fromJSON(jsonlite::toJSON(this_object$`reach_estimate`, auto_unbox = TRUE, digits = NA))
        self$`reach_estimate` <- `reach_estimate_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateAudienceSizing in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`reach_estimate`)) {
          sprintf(
          '"reach_estimate":
          %s
          ',
          jsonlite::toJSON(self$`reach_estimate`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateAudienceSizing
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateAudienceSizing
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`reach_estimate` <- TargetingTemplateAudienceSizingReachEstimate$new()$fromJSON(jsonlite::toJSON(this_object$`reach_estimate`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTemplateAudienceSizing and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplateAudienceSizing
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
# TargetingTemplateAudienceSizing$unlock()
#
## Below is an example to define the print function
# TargetingTemplateAudienceSizing$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplateAudienceSizing$lock()

