#' Create a new CatalogsProductGroupFilterOperatorTypeCriteria
#'
#' @description
#' CatalogsProductGroupFilterOperatorTypeCriteria Class
#'
#' @docType class
#' @title CatalogsProductGroupFilterOperatorTypeCriteria
#' @description CatalogsProductGroupFilterOperatorTypeCriteria Class
#' @format An \code{R6Class} generator object
#' @field filter_operator_type  character [optional]
#' @field negated  character [optional]
#' @field values  list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupFilterOperatorTypeCriteria <- R6::R6Class(
  "CatalogsProductGroupFilterOperatorTypeCriteria",
  public = list(
    `filter_operator_type` = NULL,
    `negated` = NULL,
    `values` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupFilterOperatorTypeCriteria class.
    #'
    #' @param values values
    #' @param filter_operator_type filter_operator_type. Default to "IS".
    #' @param negated negated. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`values`, `filter_operator_type` = "IS", `negated` = FALSE, ...) {
      if (!missing(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(is.character(x)))
        self$`values` <- `values`
      }
      if (!is.null(`filter_operator_type`)) {
        if (!(`filter_operator_type` %in% c("IS", "CONTAINS"))) {
          stop(paste("Error! \"", `filter_operator_type`, "\" cannot be assigned to `filter_operator_type`. Must be \"IS\", \"CONTAINS\".", sep = ""))
        }
        if (!(is.character(`filter_operator_type`) && length(`filter_operator_type`) == 1)) {
          stop(paste("Error! Invalid data for `filter_operator_type`. Must be a string:", `filter_operator_type`))
        }
        self$`filter_operator_type` <- `filter_operator_type`
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
    #' @return CatalogsProductGroupFilterOperatorTypeCriteria as a base R list.
    #' @examples
    #' # convert array of CatalogsProductGroupFilterOperatorTypeCriteria (x) to a data frame
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
    #' Convert CatalogsProductGroupFilterOperatorTypeCriteria to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsProductGroupFilterOperatorTypeCriteriaObject <- list()
      if (!is.null(self$`filter_operator_type`)) {
        CatalogsProductGroupFilterOperatorTypeCriteriaObject[["filter_operator_type"]] <-
          self$`filter_operator_type`
      }
      if (!is.null(self$`negated`)) {
        CatalogsProductGroupFilterOperatorTypeCriteriaObject[["negated"]] <-
          self$`negated`
      }
      if (!is.null(self$`values`)) {
        CatalogsProductGroupFilterOperatorTypeCriteriaObject[["values"]] <-
          self$`values`
      }
      return(CatalogsProductGroupFilterOperatorTypeCriteriaObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilterOperatorTypeCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupFilterOperatorTypeCriteria
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`filter_operator_type`)) {
        if (!is.null(this_object$`filter_operator_type`) && !(this_object$`filter_operator_type` %in% c("IS", "CONTAINS"))) {
          stop(paste("Error! \"", this_object$`filter_operator_type`, "\" cannot be assigned to `filter_operator_type`. Must be \"IS\", \"CONTAINS\".", sep = ""))
        }
        self$`filter_operator_type` <- this_object$`filter_operator_type`
      }
      if (!is.null(this_object$`negated`)) {
        self$`negated` <- this_object$`negated`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsProductGroupFilterOperatorTypeCriteria in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilterOperatorTypeCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupFilterOperatorTypeCriteria
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`filter_operator_type`) && !(this_object$`filter_operator_type` %in% c("IS", "CONTAINS"))) {
        stop(paste("Error! \"", this_object$`filter_operator_type`, "\" cannot be assigned to `filter_operator_type`. Must be \"IS\", \"CONTAINS\".", sep = ""))
      }
      self$`filter_operator_type` <- this_object$`filter_operator_type`
      self$`negated` <- this_object$`negated`
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupFilterOperatorTypeCriteria and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
        stopifnot(is.vector(input_json$`values`), length(input_json$`values`) != 0)
        tmp <- sapply(input_json$`values`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupFilterOperatorTypeCriteria: the required field `values` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupFilterOperatorTypeCriteria
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
# CatalogsProductGroupFilterOperatorTypeCriteria$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupFilterOperatorTypeCriteria$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupFilterOperatorTypeCriteria$lock()

