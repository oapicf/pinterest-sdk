#' Create a new CustomNumber0Filter
#'
#' @description
#' CustomNumber0Filter Class
#'
#' @docType class
#' @title CustomNumber0Filter
#' @description CustomNumber0Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_NUMBER_0  \link{CatalogsProductGroupUint32Criteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomNumber0Filter <- R6::R6Class(
  "CustomNumber0Filter",
  public = list(
    `CUSTOM_NUMBER_0` = NULL,

    #' @description
    #' Initialize a new CustomNumber0Filter class.
    #'
    #' @param CUSTOM_NUMBER_0 CUSTOM_NUMBER_0
    #' @param ... Other optional arguments.
    initialize = function(`CUSTOM_NUMBER_0`, ...) {
      if (!missing(`CUSTOM_NUMBER_0`)) {
        stopifnot(R6::is.R6(`CUSTOM_NUMBER_0`))
        self$`CUSTOM_NUMBER_0` <- `CUSTOM_NUMBER_0`
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
    #' @return CustomNumber0Filter as a base R list.
    #' @examples
    #' # convert array of CustomNumber0Filter (x) to a data frame
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
    #' Convert CustomNumber0Filter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomNumber0FilterObject <- list()
      if (!is.null(self$`CUSTOM_NUMBER_0`)) {
        CustomNumber0FilterObject[["CUSTOM_NUMBER_0"]] <-
          self$extractSimpleType(self$`CUSTOM_NUMBER_0`)
      }
      return(CustomNumber0FilterObject)
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
    #' Deserialize JSON string into an instance of CustomNumber0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomNumber0Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_NUMBER_0`)) {
        `custom_number_0_object` <- CatalogsProductGroupUint32Criteria$new()
        `custom_number_0_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_NUMBER_0`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_NUMBER_0` <- `custom_number_0_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomNumber0Filter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomNumber0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomNumber0Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_NUMBER_0` <- CatalogsProductGroupUint32Criteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_NUMBER_0`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomNumber0Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_NUMBER_0`
      if (!is.null(input_json$`CUSTOM_NUMBER_0`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_NUMBER_0`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomNumber0Filter: the required field `CUSTOM_NUMBER_0` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomNumber0Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CUSTOM_NUMBER_0` is null
      if (is.null(self$`CUSTOM_NUMBER_0`)) {
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
      # check if the required `CUSTOM_NUMBER_0` is null
      if (is.null(self$`CUSTOM_NUMBER_0`)) {
        invalid_fields["CUSTOM_NUMBER_0"] <- "Non-nullable required field `CUSTOM_NUMBER_0` cannot be null."
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
# CustomNumber0Filter$unlock()
#
## Below is an example to define the print function
# CustomNumber0Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomNumber0Filter$lock()

