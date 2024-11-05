#' Create a new CatalogsFeedValidationDetails
#'
#' @description
#' CatalogsFeedValidationDetails Class
#'
#' @docType class
#' @title CatalogsFeedValidationDetails
#' @description CatalogsFeedValidationDetails Class
#' @format An \code{R6Class} generator object
#' @field errors  \link{CatalogsFeedValidationErrors}
#' @field warnings  \link{CatalogsFeedValidationWarnings}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedValidationDetails <- R6::R6Class(
  "CatalogsFeedValidationDetails",
  public = list(
    `errors` = NULL,
    `warnings` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedValidationDetails class.
    #'
    #' @param errors errors
    #' @param warnings warnings
    #' @param ... Other optional arguments.
    initialize = function(`errors`, `warnings`, ...) {
      if (!missing(`errors`)) {
        stopifnot(R6::is.R6(`errors`))
        self$`errors` <- `errors`
      }
      if (!missing(`warnings`)) {
        stopifnot(R6::is.R6(`warnings`))
        self$`warnings` <- `warnings`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedValidationDetails in JSON format
    toJSON = function() {
      CatalogsFeedValidationDetailsObject <- list()
      if (!is.null(self$`errors`)) {
        CatalogsFeedValidationDetailsObject[["errors"]] <-
          self$`errors`$toJSON()
      }
      if (!is.null(self$`warnings`)) {
        CatalogsFeedValidationDetailsObject[["warnings"]] <-
          self$`warnings`$toJSON()
      }
      CatalogsFeedValidationDetailsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedValidationDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedValidationDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errors`)) {
        `errors_object` <- CatalogsFeedValidationErrors$new()
        `errors_object`$fromJSON(jsonlite::toJSON(this_object$`errors`, auto_unbox = TRUE, digits = NA))
        self$`errors` <- `errors_object`
      }
      if (!is.null(this_object$`warnings`)) {
        `warnings_object` <- CatalogsFeedValidationWarnings$new()
        `warnings_object`$fromJSON(jsonlite::toJSON(this_object$`warnings`, auto_unbox = TRUE, digits = NA))
        self$`warnings` <- `warnings_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedValidationDetails in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          %s
          ',
          jsonlite::toJSON(self$`errors`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`warnings`)) {
          sprintf(
          '"warnings":
          %s
          ',
          jsonlite::toJSON(self$`warnings`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedValidationDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedValidationDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errors` <- CatalogsFeedValidationErrors$new()$fromJSON(jsonlite::toJSON(this_object$`errors`, auto_unbox = TRUE, digits = NA))
      self$`warnings` <- CatalogsFeedValidationWarnings$new()$fromJSON(jsonlite::toJSON(this_object$`warnings`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedValidationDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `errors`
      if (!is.null(input_json$`errors`)) {
        stopifnot(R6::is.R6(input_json$`errors`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedValidationDetails: the required field `errors` is missing."))
      }
      # check the required field `warnings`
      if (!is.null(input_json$`warnings`)) {
        stopifnot(R6::is.R6(input_json$`warnings`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedValidationDetails: the required field `warnings` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedValidationDetails
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `errors` is null
      if (is.null(self$`errors`)) {
        return(FALSE)
      }

      # check if the required `warnings` is null
      if (is.null(self$`warnings`)) {
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
      # check if the required `errors` is null
      if (is.null(self$`errors`)) {
        invalid_fields["errors"] <- "Non-nullable required field `errors` cannot be null."
      }

      # check if the required `warnings` is null
      if (is.null(self$`warnings`)) {
        invalid_fields["warnings"] <- "Non-nullable required field `warnings` cannot be null."
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
# CatalogsFeedValidationDetails$unlock()
#
## Below is an example to define the print function
# CatalogsFeedValidationDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedValidationDetails$lock()

