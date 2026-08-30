#' Create a new MinPriceFilter
#'
#' @description
#' MinPriceFilter Class
#'
#' @docType class
#' @title MinPriceFilter
#' @description MinPriceFilter Class
#' @format An \code{R6Class} generator object
#' @field MIN_PRICE  \link{CatalogsProductGroupPricingCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MinPriceFilter <- R6::R6Class(
  "MinPriceFilter",
  public = list(
    `MIN_PRICE` = NULL,

    #' @description
    #' Initialize a new MinPriceFilter class.
    #'
    #' @param MIN_PRICE MIN_PRICE
    #' @param ... Other optional arguments.
    initialize = function(`MIN_PRICE`, ...) {
      if (!missing(`MIN_PRICE`)) {
        stopifnot(R6::is.R6(`MIN_PRICE`))
        self$`MIN_PRICE` <- `MIN_PRICE`
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
    #' @return MinPriceFilter as a base R list.
    #' @examples
    #' # convert array of MinPriceFilter (x) to a data frame
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
    #' Convert MinPriceFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MinPriceFilterObject <- list()
      if (!is.null(self$`MIN_PRICE`)) {
        MinPriceFilterObject[["MIN_PRICE"]] <-
          self$extractSimpleType(self$`MIN_PRICE`)
      }
      return(MinPriceFilterObject)
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
    #' Deserialize JSON string into an instance of MinPriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MinPriceFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`MIN_PRICE`)) {
        `min_price_object` <- CatalogsProductGroupPricingCriteria$new()
        `min_price_object`$fromJSON(jsonlite::toJSON(this_object$`MIN_PRICE`, auto_unbox = TRUE, digits = NA))
        self$`MIN_PRICE` <- `min_price_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MinPriceFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MinPriceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of MinPriceFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`MIN_PRICE` <- CatalogsProductGroupPricingCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`MIN_PRICE`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MinPriceFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `MIN_PRICE`
      if (!is.null(input_json$`MIN_PRICE`)) {
        stopifnot(R6::is.R6(input_json$`MIN_PRICE`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MinPriceFilter: the required field `MIN_PRICE` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MinPriceFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `MIN_PRICE` is null
      if (is.null(self$`MIN_PRICE`)) {
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
      # check if the required `MIN_PRICE` is null
      if (is.null(self$`MIN_PRICE`)) {
        invalid_fields["MIN_PRICE"] <- "Non-nullable required field `MIN_PRICE` cannot be null."
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
# MinPriceFilter$unlock()
#
## Below is an example to define the print function
# MinPriceFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MinPriceFilter$lock()

