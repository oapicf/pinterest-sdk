#' Create a new BrandFilter
#'
#' @description
#' BrandFilter Class
#'
#' @docType class
#' @title BrandFilter
#' @description BrandFilter Class
#' @format An \code{R6Class} generator object
#' @field BRAND  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BrandFilter <- R6::R6Class(
  "BrandFilter",
  public = list(
    `BRAND` = NULL,

    #' @description
    #' Initialize a new BrandFilter class.
    #'
    #' @param BRAND BRAND
    #' @param ... Other optional arguments.
    initialize = function(`BRAND`, ...) {
      if (!missing(`BRAND`)) {
        stopifnot(R6::is.R6(`BRAND`))
        self$`BRAND` <- `BRAND`
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
    #' @return BrandFilter as a base R list.
    #' @examples
    #' # convert array of BrandFilter (x) to a data frame
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
    #' Convert BrandFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BrandFilterObject <- list()
      if (!is.null(self$`BRAND`)) {
        BrandFilterObject[["BRAND"]] <-
          self$extractSimpleType(self$`BRAND`)
      }
      return(BrandFilterObject)
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
    #' Deserialize JSON string into an instance of BrandFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`BRAND`)) {
        `brand_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `brand_object`$fromJSON(jsonlite::toJSON(this_object$`BRAND`, auto_unbox = TRUE, digits = NA))
        self$`BRAND` <- `brand_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BrandFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`BRAND` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`BRAND`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BrandFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `BRAND`
      if (!is.null(input_json$`BRAND`)) {
        stopifnot(R6::is.R6(input_json$`BRAND`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BrandFilter: the required field `BRAND` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `BRAND` is null
      if (is.null(self$`BRAND`)) {
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
      # check if the required `BRAND` is null
      if (is.null(self$`BRAND`)) {
        invalid_fields["BRAND"] <- "Non-nullable required field `BRAND` cannot be null."
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
# BrandFilter$unlock()
#
## Below is an example to define the print function
# BrandFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandFilter$lock()

