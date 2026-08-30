#' Create a new CatalogsProductGroupUint32Criteria
#'
#' @description
#' CatalogsProductGroupUint32Criteria Class
#'
#' @docType class
#' @title CatalogsProductGroupUint32Criteria
#' @description CatalogsProductGroupUint32Criteria Class
#' @format An \code{R6Class} generator object
#' @field negated  character [optional]
#' @field operator  \link{NumericFilterOperatorType}
#' @field value  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupUint32Criteria <- R6::R6Class(
  "CatalogsProductGroupUint32Criteria",
  public = list(
    `negated` = NULL,
    `operator` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupUint32Criteria class.
    #'
    #' @param operator operator
    #' @param value value
    #' @param negated negated
    #' @param ... Other optional arguments.
    initialize = function(`operator`, `value`, `negated` = NULL, ...) {
      if (!missing(`operator`)) {
        if (!(`operator` %in% c())) {
          stop(paste("Error! \"", `operator`, "\" cannot be assigned to `operator`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operator`))
        self$`operator` <- `operator`
      }
      if (!missing(`value`)) {
        if (!(is.numeric(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be an integer:", `value`))
        }
        self$`value` <- `value`
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
    #' @return CatalogsProductGroupUint32Criteria as a base R list.
    #' @examples
    #' # convert array of CatalogsProductGroupUint32Criteria (x) to a data frame
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
    #' Convert CatalogsProductGroupUint32Criteria to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsProductGroupUint32CriteriaObject <- list()
      if (!is.null(self$`negated`)) {
        CatalogsProductGroupUint32CriteriaObject[["negated"]] <-
          self$`negated`
      }
      if (!is.null(self$`operator`)) {
        CatalogsProductGroupUint32CriteriaObject[["operator"]] <-
          self$extractSimpleType(self$`operator`)
      }
      if (!is.null(self$`value`)) {
        CatalogsProductGroupUint32CriteriaObject[["value"]] <-
          self$`value`
      }
      return(CatalogsProductGroupUint32CriteriaObject)
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
    #' Deserialize JSON string into an instance of CatalogsProductGroupUint32Criteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUint32Criteria
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`negated`)) {
        self$`negated` <- this_object$`negated`
      }
      if (!is.null(this_object$`operator`)) {
        `operator_object` <- NumericFilterOperatorType$new()
        `operator_object`$fromJSON(jsonlite::toJSON(this_object$`operator`, auto_unbox = TRUE, digits = NA))
        self$`operator` <- `operator_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsProductGroupUint32Criteria in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupUint32Criteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUint32Criteria
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`negated` <- this_object$`negated`
      self$`operator` <- NumericFilterOperatorType$new()$fromJSON(jsonlite::toJSON(this_object$`operator`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupUint32Criteria and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `operator`
      if (!is.null(input_json$`operator`)) {
        stopifnot(R6::is.R6(input_json$`operator`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupUint32Criteria: the required field `operator` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.numeric(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be an integer:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupUint32Criteria: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupUint32Criteria
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        return(FALSE)
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        return(FALSE)
      }

      if (self$`value` > 4294967295) {
        return(FALSE)
      }
      if (self$`value` < 0) {
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
      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        invalid_fields["operator"] <- "Non-nullable required field `operator` cannot be null."
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
      }

      if (self$`value` > 4294967295) {
        invalid_fields["value"] <- "Invalid value for `value`, must be smaller than or equal to 4294967295."
      }
      if (self$`value` < 0) {
        invalid_fields["value"] <- "Invalid value for `value`, must be bigger than or equal to 0."
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
# CatalogsProductGroupUint32Criteria$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupUint32Criteria$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupUint32Criteria$lock()

