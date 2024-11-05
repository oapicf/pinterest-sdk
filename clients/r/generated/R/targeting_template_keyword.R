#' Create a new TargetingTemplateKeyword
#'
#' @description
#' TargetingTemplateKeyword Class
#'
#' @docType class
#' @title TargetingTemplateKeyword
#' @description TargetingTemplateKeyword Class
#' @format An \code{R6Class} generator object
#' @field match_type  \link{MatchType} [optional]
#' @field value The keyword targeting (120 chars max). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplateKeyword <- R6::R6Class(
  "TargetingTemplateKeyword",
  public = list(
    `match_type` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new TargetingTemplateKeyword class.
    #'
    #' @param match_type match_type
    #' @param value The keyword targeting (120 chars max).
    #' @param ... Other optional arguments.
    initialize = function(`match_type` = NULL, `value` = NULL, ...) {
      if (!is.null(`match_type`)) {
        if (!(`match_type` %in% c())) {
          stop(paste("Error! \"", `match_type`, "\" cannot be assigned to `match_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`match_type`))
        self$`match_type` <- `match_type`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateKeyword in JSON format
    toJSON = function() {
      TargetingTemplateKeywordObject <- list()
      if (!is.null(self$`match_type`)) {
        TargetingTemplateKeywordObject[["match_type"]] <-
          self$`match_type`$toJSON()
      }
      if (!is.null(self$`value`)) {
        TargetingTemplateKeywordObject[["value"]] <-
          self$`value`
      }
      TargetingTemplateKeywordObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateKeyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateKeyword
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`match_type`)) {
        `match_type_object` <- MatchType$new()
        `match_type_object`$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
        self$`match_type` <- `match_type_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateKeyword in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`match_type`)) {
          sprintf(
          '"match_type":
          %s
          ',
          jsonlite::toJSON(self$`match_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateKeyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateKeyword
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`match_type` <- MatchType$new()$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTemplateKeyword and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplateKeyword
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
# TargetingTemplateKeyword$unlock()
#
## Below is an example to define the print function
# TargetingTemplateKeyword$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplateKeyword$lock()

