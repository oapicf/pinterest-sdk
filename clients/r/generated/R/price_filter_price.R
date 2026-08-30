#' Create a new PriceFilterPrice
#'
#' @description
#' PriceFilterPrice Class
#'
#' @docType class
#' @title PriceFilterPrice
#' @description PriceFilterPrice Class
#' @format An \code{R6Class} generator object
#' @field currency  \link{NonNullableCatalogsCurrency}
#' @field negated  character [optional]
#' @field operator  \link{NumericFilterOperatorType}
#' @field value  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceFilterPrice <- R6::R6Class(
  "PriceFilterPrice",
  public = list(
    `currency` = NULL,
    `negated` = NULL,
    `operator` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new PriceFilterPrice class.
    #'
    #' @param currency currency
    #' @param operator operator
    #' @param value value
    #' @param negated negated
    #' @param ... Other optional arguments.
    initialize = function(`currency`, `operator`, `value`, `negated` = NULL, ...) {
      if (!missing(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!missing(`operator`)) {
        if (!(`operator` %in% c())) {
          stop(paste("Error! \"", `operator`, "\" cannot be assigned to `operator`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operator`))
        self$`operator` <- `operator`
      }
      if (!missing(`value`)) {
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
    #' @return PriceFilterPrice as a base R list.
    #' @examples
    #' # convert array of PriceFilterPrice (x) to a data frame
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
    #' Convert PriceFilterPrice to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PriceFilterPriceObject <- list()
      if (!is.null(self$`currency`)) {
        PriceFilterPriceObject[["currency"]] <-
          self$extractSimpleType(self$`currency`)
      }
      if (!is.null(self$`negated`)) {
        PriceFilterPriceObject[["negated"]] <-
          self$`negated`
      }
      if (!is.null(self$`operator`)) {
        PriceFilterPriceObject[["operator"]] <-
          self$extractSimpleType(self$`operator`)
      }
      if (!is.null(self$`value`)) {
        PriceFilterPriceObject[["value"]] <-
          self$`value`
      }
      return(PriceFilterPriceObject)
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
    #' Deserialize JSON string into an instance of PriceFilterPrice
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceFilterPrice
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- NonNullableCatalogsCurrency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
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
    #' @return PriceFilterPrice in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PriceFilterPrice
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceFilterPrice
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`currency` <- NonNullableCatalogsCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`negated` <- this_object$`negated`
      self$`operator` <- NumericFilterOperatorType$new()$fromJSON(jsonlite::toJSON(this_object$`operator`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to PriceFilterPrice and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `currency`
      if (!is.null(input_json$`currency`)) {
        stopifnot(R6::is.R6(input_json$`currency`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceFilterPrice: the required field `currency` is missing."))
      }
      # check the required field `operator`
      if (!is.null(input_json$`operator`)) {
        stopifnot(R6::is.R6(input_json$`operator`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceFilterPrice: the required field `operator` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceFilterPrice: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PriceFilterPrice
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        return(FALSE)
      }

      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        return(FALSE)
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        invalid_fields["currency"] <- "Non-nullable required field `currency` cannot be null."
      }

      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        invalid_fields["operator"] <- "Non-nullable required field `operator` cannot be null."
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# PriceFilterPrice$unlock()
#
## Below is an example to define the print function
# PriceFilterPrice$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceFilterPrice$lock()

