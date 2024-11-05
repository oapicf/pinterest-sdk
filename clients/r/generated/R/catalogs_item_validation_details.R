#' Create a new CatalogsItemValidationDetails
#'
#' @description
#' CatalogsItemValidationDetails Class
#'
#' @docType class
#' @title CatalogsItemValidationDetails
#' @description CatalogsItemValidationDetails Class
#' @format An \code{R6Class} generator object
#' @field attribute_name  \link{NullableCatalogsItemFieldType}
#' @field provided_value Provided value that caused the validation issue. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemValidationDetails <- R6::R6Class(
  "CatalogsItemValidationDetails",
  public = list(
    `attribute_name` = NULL,
    `provided_value` = NULL,

    #' @description
    #' Initialize a new CatalogsItemValidationDetails class.
    #'
    #' @param attribute_name attribute_name
    #' @param provided_value Provided value that caused the validation issue.
    #' @param ... Other optional arguments.
    initialize = function(`attribute_name`, `provided_value`, ...) {
      if (!missing(`attribute_name`)) {
        if (!(`attribute_name` %in% c())) {
          stop(paste("Error! \"", `attribute_name`, "\" cannot be assigned to `attribute_name`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`attribute_name`))
        self$`attribute_name` <- `attribute_name`
      }
      if (!missing(`provided_value`)) {
        if (!(is.character(`provided_value`) && length(`provided_value`) == 1)) {
          stop(paste("Error! Invalid data for `provided_value`. Must be a string:", `provided_value`))
        }
        self$`provided_value` <- `provided_value`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationDetails in JSON format
    toJSON = function() {
      CatalogsItemValidationDetailsObject <- list()
      if (!is.null(self$`attribute_name`)) {
        CatalogsItemValidationDetailsObject[["attribute_name"]] <-
          self$`attribute_name`$toJSON()
      }
      if (!is.null(self$`provided_value`)) {
        CatalogsItemValidationDetailsObject[["provided_value"]] <-
          self$`provided_value`
      }
      CatalogsItemValidationDetailsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attribute_name`)) {
        `attribute_name_object` <- NullableCatalogsItemFieldType$new()
        `attribute_name_object`$fromJSON(jsonlite::toJSON(this_object$`attribute_name`, auto_unbox = TRUE, digits = NA))
        self$`attribute_name` <- `attribute_name_object`
      }
      if (!is.null(this_object$`provided_value`)) {
        self$`provided_value` <- this_object$`provided_value`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationDetails in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`attribute_name`)) {
          sprintf(
          '"attribute_name":
          %s
          ',
          jsonlite::toJSON(self$`attribute_name`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`provided_value`)) {
          sprintf(
          '"provided_value":
            "%s"
                    ',
          self$`provided_value`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attribute_name` <- NullableCatalogsItemFieldType$new()$fromJSON(jsonlite::toJSON(this_object$`attribute_name`, auto_unbox = TRUE, digits = NA))
      self$`provided_value` <- this_object$`provided_value`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsItemValidationDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `attribute_name`
      if (!is.null(input_json$`attribute_name`)) {
        stopifnot(R6::is.R6(input_json$`attribute_name`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemValidationDetails: the required field `attribute_name` is missing."))
      }
      # check the required field `provided_value`
      if (!is.null(input_json$`provided_value`)) {
        if (!(is.character(input_json$`provided_value`) && length(input_json$`provided_value`) == 1)) {
          stop(paste("Error! Invalid data for `provided_value`. Must be a string:", input_json$`provided_value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemValidationDetails: the required field `provided_value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemValidationDetails
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
# CatalogsItemValidationDetails$unlock()
#
## Below is an example to define the print function
# CatalogsItemValidationDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemValidationDetails$lock()

