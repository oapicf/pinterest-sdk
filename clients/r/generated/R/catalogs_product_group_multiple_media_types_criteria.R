#' Create a new CatalogsProductGroupMultipleMediaTypesCriteria
#'
#' @description
#' CatalogsProductGroupMultipleMediaTypesCriteria Class
#'
#' @docType class
#' @title CatalogsProductGroupMultipleMediaTypesCriteria
#' @description CatalogsProductGroupMultipleMediaTypesCriteria Class
#' @format An \code{R6Class} generator object
#' @field values  list(\link{MediaType})
#' @field negated  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupMultipleMediaTypesCriteria <- R6::R6Class(
  "CatalogsProductGroupMultipleMediaTypesCriteria",
  public = list(
    `values` = NULL,
    `negated` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupMultipleMediaTypesCriteria class.
    #'
    #' @param values values
    #' @param negated negated. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`values`, `negated` = FALSE, ...) {
      if (!missing(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(R6::is.R6(x)))
        self$`values` <- `values`
      }
      if (!is.null(`negated`)) {
        if (!(is.logical(`negated`) && length(`negated`) == 1)) {
          stop(paste("Error! Invalid data for `negated`. Must be a boolean:", `negated`))
        }
        self$`negated` <- `negated`
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
    #' @return CatalogsProductGroupMultipleMediaTypesCriteria as a base R list.
    #' @examples
    #' # convert array of CatalogsProductGroupMultipleMediaTypesCriteria (x) to a data frame
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
    #' Convert CatalogsProductGroupMultipleMediaTypesCriteria to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsProductGroupMultipleMediaTypesCriteriaObject <- list()
      if (!is.null(self$`values`)) {
        CatalogsProductGroupMultipleMediaTypesCriteriaObject[["values"]] <-
          lapply(self$`values`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`negated`)) {
        CatalogsProductGroupMultipleMediaTypesCriteriaObject[["negated"]] <-
          self$`negated`
      }
      return(CatalogsProductGroupMultipleMediaTypesCriteriaObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupMultipleMediaTypesCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupMultipleMediaTypesCriteria
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[MediaType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`negated`)) {
        self$`negated` <- this_object$`negated`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsProductGroupMultipleMediaTypesCriteria in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupMultipleMediaTypesCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupMultipleMediaTypesCriteria
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[MediaType]", loadNamespace("openapi"))
      self$`negated` <- this_object$`negated`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupMultipleMediaTypesCriteria and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
        stopifnot(is.vector(input_json$`values`), length(input_json$`values`) != 0)
        tmp <- sapply(input_json$`values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupMultipleMediaTypesCriteria: the required field `values` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupMultipleMediaTypesCriteria
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `values` is null
      if (is.null(self$`values`)) {
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
      # check if the required `values` is null
      if (is.null(self$`values`)) {
        invalid_fields["values"] <- "Non-nullable required field `values` cannot be null."
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
# CatalogsProductGroupMultipleMediaTypesCriteria$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupMultipleMediaTypesCriteria$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupMultipleMediaTypesCriteria$lock()

