#' Create a new CustomLabel2Filter
#'
#' @description
#' CustomLabel2Filter Class
#'
#' @docType class
#' @title CustomLabel2Filter
#' @description CustomLabel2Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_LABEL_2  \link{CatalogsProductGroupFilterOperatorTypeCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomLabel2Filter <- R6::R6Class(
  "CustomLabel2Filter",
  public = list(
    `CUSTOM_LABEL_2` = NULL,

    #' @description
    #' Initialize a new CustomLabel2Filter class.
    #'
    #' @param CUSTOM_LABEL_2 CUSTOM_LABEL_2
    #' @param ... Other optional arguments.
    initialize = function(`CUSTOM_LABEL_2`, ...) {
      if (!missing(`CUSTOM_LABEL_2`)) {
        stopifnot(R6::is.R6(`CUSTOM_LABEL_2`))
        self$`CUSTOM_LABEL_2` <- `CUSTOM_LABEL_2`
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
    #' @return CustomLabel2Filter as a base R list.
    #' @examples
    #' # convert array of CustomLabel2Filter (x) to a data frame
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
    #' Convert CustomLabel2Filter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomLabel2FilterObject <- list()
      if (!is.null(self$`CUSTOM_LABEL_2`)) {
        CustomLabel2FilterObject[["CUSTOM_LABEL_2"]] <-
          self$extractSimpleType(self$`CUSTOM_LABEL_2`)
      }
      return(CustomLabel2FilterObject)
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
    #' Deserialize JSON string into an instance of CustomLabel2Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel2Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_LABEL_2`)) {
        `custom_label_2_object` <- CatalogsProductGroupFilterOperatorTypeCriteria$new()
        `custom_label_2_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_2`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_LABEL_2` <- `custom_label_2_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomLabel2Filter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomLabel2Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomLabel2Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_LABEL_2` <- CatalogsProductGroupFilterOperatorTypeCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_LABEL_2`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomLabel2Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_LABEL_2`
      if (!is.null(input_json$`CUSTOM_LABEL_2`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_LABEL_2`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomLabel2Filter: the required field `CUSTOM_LABEL_2` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomLabel2Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CUSTOM_LABEL_2` is null
      if (is.null(self$`CUSTOM_LABEL_2`)) {
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
      # check if the required `CUSTOM_LABEL_2` is null
      if (is.null(self$`CUSTOM_LABEL_2`)) {
        invalid_fields["CUSTOM_LABEL_2"] <- "Non-nullable required field `CUSTOM_LABEL_2` cannot be null."
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
# CustomLabel2Filter$unlock()
#
## Below is an example to define the print function
# CustomLabel2Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomLabel2Filter$lock()

