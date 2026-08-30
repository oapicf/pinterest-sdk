#' Create a new PriceFilter
#'
#' @description
#' PriceFilter Class
#'
#' @docType class
#' @title PriceFilter
#' @description PriceFilter Class
#' @format An \code{R6Class} generator object
#' @field PRICE  \link{PriceFilterPrice}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceFilter <- R6::R6Class(
  "PriceFilter",
  public = list(
    `PRICE` = NULL,

    #' @description
    #' Initialize a new PriceFilter class.
    #'
    #' @param PRICE PRICE
    #' @param ... Other optional arguments.
    initialize = function(`PRICE`, ...) {
      if (!missing(`PRICE`)) {
        stopifnot(R6::is.R6(`PRICE`))
        self$`PRICE` <- `PRICE`
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
    #' @return PriceFilter as a base R list.
    #' @examples
    #' # convert array of PriceFilter (x) to a data frame
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
    #' Convert PriceFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PriceFilterObject <- list()
      if (!is.null(self$`PRICE`)) {
        PriceFilterObject[["PRICE"]] <-
          self$extractSimpleType(self$`PRICE`)
      }
      return(PriceFilterObject)
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
    #' Deserialize JSON string into an instance of PriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PRICE`)) {
        `price_object` <- PriceFilterPrice$new()
        `price_object`$fromJSON(jsonlite::toJSON(this_object$`PRICE`, auto_unbox = TRUE, digits = NA))
        self$`PRICE` <- `price_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PriceFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`PRICE` <- PriceFilterPrice$new()$fromJSON(jsonlite::toJSON(this_object$`PRICE`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PriceFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PRICE`
      if (!is.null(input_json$`PRICE`)) {
        stopifnot(R6::is.R6(input_json$`PRICE`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceFilter: the required field `PRICE` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PriceFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `PRICE` is null
      if (is.null(self$`PRICE`)) {
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
      # check if the required `PRICE` is null
      if (is.null(self$`PRICE`)) {
        invalid_fields["PRICE"] <- "Non-nullable required field `PRICE` cannot be null."
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
# PriceFilter$unlock()
#
## Below is an example to define the print function
# PriceFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceFilter$lock()

