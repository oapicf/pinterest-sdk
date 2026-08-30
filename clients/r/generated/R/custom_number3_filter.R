#' Create a new CustomNumber3Filter
#'
#' @description
#' CustomNumber3Filter Class
#'
#' @docType class
#' @title CustomNumber3Filter
#' @description CustomNumber3Filter Class
#' @format An \code{R6Class} generator object
#' @field CUSTOM_NUMBER_3  \link{CatalogsProductGroupUint32Criteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomNumber3Filter <- R6::R6Class(
  "CustomNumber3Filter",
  public = list(
    `CUSTOM_NUMBER_3` = NULL,

    #' @description
    #' Initialize a new CustomNumber3Filter class.
    #'
    #' @param CUSTOM_NUMBER_3 CUSTOM_NUMBER_3
    #' @param ... Other optional arguments.
    initialize = function(`CUSTOM_NUMBER_3`, ...) {
      if (!missing(`CUSTOM_NUMBER_3`)) {
        stopifnot(R6::is.R6(`CUSTOM_NUMBER_3`))
        self$`CUSTOM_NUMBER_3` <- `CUSTOM_NUMBER_3`
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
    #' @return CustomNumber3Filter as a base R list.
    #' @examples
    #' # convert array of CustomNumber3Filter (x) to a data frame
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
    #' Convert CustomNumber3Filter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomNumber3FilterObject <- list()
      if (!is.null(self$`CUSTOM_NUMBER_3`)) {
        CustomNumber3FilterObject[["CUSTOM_NUMBER_3"]] <-
          self$extractSimpleType(self$`CUSTOM_NUMBER_3`)
      }
      return(CustomNumber3FilterObject)
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
    #' Deserialize JSON string into an instance of CustomNumber3Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomNumber3Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CUSTOM_NUMBER_3`)) {
        `custom_number_3_object` <- CatalogsProductGroupUint32Criteria$new()
        `custom_number_3_object`$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_NUMBER_3`, auto_unbox = TRUE, digits = NA))
        self$`CUSTOM_NUMBER_3` <- `custom_number_3_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomNumber3Filter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomNumber3Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomNumber3Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CUSTOM_NUMBER_3` <- CatalogsProductGroupUint32Criteria$new()$fromJSON(jsonlite::toJSON(this_object$`CUSTOM_NUMBER_3`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomNumber3Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CUSTOM_NUMBER_3`
      if (!is.null(input_json$`CUSTOM_NUMBER_3`)) {
        stopifnot(R6::is.R6(input_json$`CUSTOM_NUMBER_3`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomNumber3Filter: the required field `CUSTOM_NUMBER_3` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomNumber3Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CUSTOM_NUMBER_3` is null
      if (is.null(self$`CUSTOM_NUMBER_3`)) {
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
      # check if the required `CUSTOM_NUMBER_3` is null
      if (is.null(self$`CUSTOM_NUMBER_3`)) {
        invalid_fields["CUSTOM_NUMBER_3"] <- "Non-nullable required field `CUSTOM_NUMBER_3` cannot be null."
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
# CustomNumber3Filter$unlock()
#
## Below is an example to define the print function
# CustomNumber3Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomNumber3Filter$lock()

