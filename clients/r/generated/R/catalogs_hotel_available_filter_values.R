#' Create a new CatalogsHotelAvailableFilterValues
#'
#' @description
#' CatalogsHotelAvailableFilterValues Class
#'
#' @docType class
#' @title CatalogsHotelAvailableFilterValues
#' @description CatalogsHotelAvailableFilterValues Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field filter_values  \link{CatalogsHotelFilterValuesMap}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelAvailableFilterValues <- R6::R6Class(
  "CatalogsHotelAvailableFilterValues",
  public = list(
    `catalog_type` = NULL,
    `filter_values` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelAvailableFilterValues class.
    #'
    #' @param catalog_type catalog_type
    #' @param filter_values filter_values
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `filter_values`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`filter_values`)) {
        stopifnot(R6::is.R6(`filter_values`))
        self$`filter_values` <- `filter_values`
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
    #' @return CatalogsHotelAvailableFilterValues as a base R list.
    #' @examples
    #' # convert array of CatalogsHotelAvailableFilterValues (x) to a data frame
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
    #' Convert CatalogsHotelAvailableFilterValues to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsHotelAvailableFilterValuesObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelAvailableFilterValuesObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`filter_values`)) {
        CatalogsHotelAvailableFilterValuesObject[["filter_values"]] <-
          self$extractSimpleType(self$`filter_values`)
      }
      return(CatalogsHotelAvailableFilterValuesObject)
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
    #' Deserialize JSON string into an instance of CatalogsHotelAvailableFilterValues
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelAvailableFilterValues
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`filter_values`)) {
        `filter_values_object` <- CatalogsHotelFilterValuesMap$new()
        `filter_values_object`$fromJSON(jsonlite::toJSON(this_object$`filter_values`, auto_unbox = TRUE, digits = NA))
        self$`filter_values` <- `filter_values_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsHotelAvailableFilterValues in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelAvailableFilterValues
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelAvailableFilterValues
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`filter_values` <- CatalogsHotelFilterValuesMap$new()$fromJSON(jsonlite::toJSON(this_object$`filter_values`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelAvailableFilterValues and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelAvailableFilterValues: the required field `catalog_type` is missing."))
      }
      # check the required field `filter_values`
      if (!is.null(input_json$`filter_values`)) {
        stopifnot(R6::is.R6(input_json$`filter_values`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelAvailableFilterValues: the required field `filter_values` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelAvailableFilterValues
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `filter_values` is null
      if (is.null(self$`filter_values`)) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `filter_values` is null
      if (is.null(self$`filter_values`)) {
        invalid_fields["filter_values"] <- "Non-nullable required field `filter_values` cannot be null."
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
# CatalogsHotelAvailableFilterValues$unlock()
#
## Below is an example to define the print function
# CatalogsHotelAvailableFilterValues$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelAvailableFilterValues$lock()

