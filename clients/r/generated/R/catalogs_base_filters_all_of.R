#' Create a new CatalogsBaseFiltersAllOf
#'
#' @description
#' CatalogsBaseFiltersAllOf Class
#'
#' @docType class
#' @title CatalogsBaseFiltersAllOf
#' @description CatalogsBaseFiltersAllOf Class
#' @format An \code{R6Class} generator object
#' @field all_of  list(\link{CatalogsBaseFilterKeys})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsBaseFiltersAllOf <- R6::R6Class(
  "CatalogsBaseFiltersAllOf",
  public = list(
    `all_of` = NULL,

    #' @description
    #' Initialize a new CatalogsBaseFiltersAllOf class.
    #'
    #' @param all_of all_of
    #' @param ... Other optional arguments.
    initialize = function(`all_of`, ...) {
      if (!missing(`all_of`)) {
        stopifnot(is.vector(`all_of`), length(`all_of`) != 0)
        sapply(`all_of`, function(x) stopifnot(R6::is.R6(x)))
        self$`all_of` <- `all_of`
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
    #' @return CatalogsBaseFiltersAllOf as a base R list.
    #' @examples
    #' # convert array of CatalogsBaseFiltersAllOf (x) to a data frame
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
    #' Convert CatalogsBaseFiltersAllOf to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsBaseFiltersAllOfObject <- list()
      if (!is.null(self$`all_of`)) {
        CatalogsBaseFiltersAllOfObject[["all_of"]] <-
          self$extractSimpleType(self$`all_of`)
      }
      return(CatalogsBaseFiltersAllOfObject)
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
    #' Deserialize JSON string into an instance of CatalogsBaseFiltersAllOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsBaseFiltersAllOf
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`all_of`)) {
        self$`all_of` <- ApiClient$new()$deserializeObj(this_object$`all_of`, "array[CatalogsBaseFilterKeys]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsBaseFiltersAllOf in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsBaseFiltersAllOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsBaseFiltersAllOf
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`all_of` <- ApiClient$new()$deserializeObj(this_object$`all_of`, "array[CatalogsBaseFilterKeys]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsBaseFiltersAllOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `all_of`
      if (!is.null(input_json$`all_of`)) {
        stopifnot(is.vector(input_json$`all_of`), length(input_json$`all_of`) != 0)
        tmp <- sapply(input_json$`all_of`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsBaseFiltersAllOf: the required field `all_of` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsBaseFiltersAllOf
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `all_of` is null
      if (is.null(self$`all_of`)) {
        return(FALSE)
      }

      if (length(self$`all_of`) < 1) {
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
      # check if the required `all_of` is null
      if (is.null(self$`all_of`)) {
        invalid_fields["all_of"] <- "Non-nullable required field `all_of` cannot be null."
      }

      if (length(self$`all_of`) < 1) {
        invalid_fields["all_of"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CatalogsBaseFiltersAllOf$unlock()
#
## Below is an example to define the print function
# CatalogsBaseFiltersAllOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsBaseFiltersAllOf$lock()

