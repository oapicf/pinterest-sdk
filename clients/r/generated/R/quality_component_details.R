#' Create a new QualityComponentDetails
#'
#' @description
#' Metrics for a specific event type within a quality component.
#'
#' @docType class
#' @title QualityComponentDetails
#' @description QualityComponentDetails Class
#' @format An \code{R6Class} generator object
#' @field coverage Coverage percentage for this event type. numeric
#' @field issues List of issues detected for this event type, if any. list(\link{QualityComponentIssue}) [optional]
#' @field overlap Overlap percentage for this event type. Only populated for external_event_id numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QualityComponentDetails <- R6::R6Class(
  "QualityComponentDetails",
  public = list(
    `coverage` = NULL,
    `issues` = NULL,
    `overlap` = NULL,

    #' @description
    #' Initialize a new QualityComponentDetails class.
    #'
    #' @param coverage Coverage percentage for this event type.
    #' @param issues List of issues detected for this event type, if any.
    #' @param overlap Overlap percentage for this event type. Only populated for external_event_id
    #' @param ... Other optional arguments.
    initialize = function(`coverage`, `issues` = NULL, `overlap` = NULL, ...) {
      if (!missing(`coverage`)) {
        self$`coverage` <- `coverage`
      }
      if (!is.null(`issues`)) {
        stopifnot(is.vector(`issues`), length(`issues`) != 0)
        sapply(`issues`, function(x) stopifnot(R6::is.R6(x)))
        self$`issues` <- `issues`
      }
      if (!is.null(`overlap`)) {
        self$`overlap` <- `overlap`
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
    #' @return QualityComponentDetails as a base R list.
    #' @examples
    #' # convert array of QualityComponentDetails (x) to a data frame
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
    #' Convert QualityComponentDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      QualityComponentDetailsObject <- list()
      if (!is.null(self$`coverage`)) {
        QualityComponentDetailsObject[["coverage"]] <-
          self$`coverage`
      }
      if (!is.null(self$`issues`)) {
        QualityComponentDetailsObject[["issues"]] <-
          self$extractSimpleType(self$`issues`)
      }
      if (!is.null(self$`overlap`)) {
        QualityComponentDetailsObject[["overlap"]] <-
          self$`overlap`
      }
      return(QualityComponentDetailsObject)
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
    #' Deserialize JSON string into an instance of QualityComponentDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityComponentDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`coverage`)) {
        self$`coverage` <- this_object$`coverage`
      }
      if (!is.null(this_object$`issues`)) {
        self$`issues` <- ApiClient$new()$deserializeObj(this_object$`issues`, "array[QualityComponentIssue]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`overlap`)) {
        self$`overlap` <- this_object$`overlap`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return QualityComponentDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of QualityComponentDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityComponentDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`coverage` <- this_object$`coverage`
      self$`issues` <- ApiClient$new()$deserializeObj(this_object$`issues`, "array[QualityComponentIssue]", loadNamespace("openapi"))
      self$`overlap` <- this_object$`overlap`
      self
    },

    #' @description
    #' Validate JSON input with respect to QualityComponentDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `coverage`
      if (!is.null(input_json$`coverage`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityComponentDetails: the required field `coverage` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QualityComponentDetails
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `coverage` is null
      if (is.null(self$`coverage`)) {
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
      # check if the required `coverage` is null
      if (is.null(self$`coverage`)) {
        invalid_fields["coverage"] <- "Non-nullable required field `coverage` cannot be null."
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
# QualityComponentDetails$unlock()
#
## Below is an example to define the print function
# QualityComponentDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QualityComponentDetails$lock()

