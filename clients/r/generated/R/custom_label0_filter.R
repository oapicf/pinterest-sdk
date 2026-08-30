#' Create a new CustomLabel0Filter
#'
#' @description
#' CustomLabel0Filter Class
#'
#' @docType class
#' @title CustomLabel0Filter
#' @description CustomLabel0Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_LABEL_0  \link{CatalogsProductGroupFilterOperatorTypeCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomLabel0Filter <- R6::R6Class(
  "CustomLabel0Filter",
  public = list(
    `CUSTOM_LABEL_0` = NULL,

    #' @description
    #' Initialize a new CustomLabel0Filter class.
    #'
    #' @param CUSTOM_LABEL_0 CUSTOM_LABEL_0
    #' @param ... Other optional arguments.
    initialize = function(`CUSTOM_LABEL_0`, ...) {
      if (!missing(`CUSTOM_LABEL_0`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_0`))
        self$`CUSTOM_LABEL_0` <- `CUSTOM_LABEL_0`
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
    #' @return CustomLabel0Filter as a base R list.
    #' @examples
    #' # convert array of CustomLabel0Filter (x) to a data frame
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
    #' Convert CustomLabel0Filter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomLabel0FilterObject <- list()
      if (!is.null(self$`CUSTOM_LABEL_0`)) {
        CustomLabel0FilterObject[["CUSTOM_LABEL_0"]] <-
          self$extractSimpleType(self$`CUSTOM_LABEL_0`)
      }
      return(CustomLabel0FilterObject)
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
    #' Deserialize JSON string into an instance of CustomLabel0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel0Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_LABEL_0`)) {
        `custom_label_0_object` <- CatalogsProductGroupFilterOperatorTypeCriteria$new()
        `custom_label_0_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_0`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_0` <- `custom_label_0_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomLabel0Filter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomLabel0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel0Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_LABEL_0` <- CatalogsProductGroupFilterOperatorTypeCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_0`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomLabel0Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_LABEL_0`
      if (!is.null(input_json$`CUSTOM_LABEL_0`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_LABEL_0`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomLabel0Filter: the required field `CUSTOM_LABEL_0` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomLabel0Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CUSTOM_LABEL_0` is null
      if (is.null(self$`CUSTOM_LABEL_0`)) {
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
      # check if the required `CUSTOM_LABEL_0` is null
      if (is.null(self$`CUSTOM_LABEL_0`)) {
        invalid_fields["CUSTOM_LABEL_0"] <- "Non-nullable required field `CUSTOM_LABEL_0` cannot be null."
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
# CustomLabel0Filter$unlock()
#
## Below is an example to define the print function
# CustomLabel0Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomLabel0Filter$lock()

