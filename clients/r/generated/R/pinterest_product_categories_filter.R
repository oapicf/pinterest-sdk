#' Create a new PinterestProductCategoriesFilter
#'
#' @description
#' PinterestProductCategoriesFilter Class
#'
#' @docType class
#' @title PinterestProductCategoriesFilter
#' @description PinterestProductCategoriesFilter Class
#' @format An \code{R6Class} generator object
#' @field PINTEREST_PRODUCT_CATEGORIES  \link{CatalogsProductGroupMultiplePinterestProductCategoryCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinterestProductCategoriesFilter <- R6::R6Class(
  "PinterestProductCategoriesFilter",
  public = list(
    `PINTEREST_PRODUCT_CATEGORIES` = NULL,

    #' @description
    #' Initialize a new PinterestProductCategoriesFilter class.
    #'
    #' @param PINTEREST_PRODUCT_CATEGORIES PINTEREST_PRODUCT_CATEGORIES
    #' @param ... Other optional arguments.
    initialize = function(`PINTEREST_PRODUCT_CATEGORIES`, ...) {
      if (!missing(`PINTEREST_PRODUCT_CATEGORIES`)) {
        stopifnot(R6::is.R6(`PINTEREST_PRODUCT_CATEGORIES`))
        self$`PINTEREST_PRODUCT_CATEGORIES` <- `PINTEREST_PRODUCT_CATEGORIES`
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
    #' @return PinterestProductCategoriesFilter as a base R list.
    #' @examples
    #' # convert array of PinterestProductCategoriesFilter (x) to a data frame
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
    #' Convert PinterestProductCategoriesFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinterestProductCategoriesFilterObject <- list()
      if (!is.null(self$`PINTEREST_PRODUCT_CATEGORIES`)) {
        PinterestProductCategoriesFilterObject[["PINTEREST_PRODUCT_CATEGORIES"]] <-
          self$extractSimpleType(self$`PINTEREST_PRODUCT_CATEGORIES`)
      }
      return(PinterestProductCategoriesFilterObject)
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
    #' Deserialize JSON string into an instance of PinterestProductCategoriesFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinterestProductCategoriesFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PINTEREST_PRODUCT_CATEGORIES`)) {
        `pinterest_product_categories_object` <- CatalogsProductGroupMultiplePinterestProductCategoryCriteria$new()
        `pinterest_product_categories_object`$fromJSON(jsonlite::toJSON(this_object$`PINTEREST_PRODUCT_CATEGORIES`, auto_unbox = TRUE, digits = NA))
        self$`PINTEREST_PRODUCT_CATEGORIES` <- `pinterest_product_categories_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinterestProductCategoriesFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinterestProductCategoriesFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinterestProductCategoriesFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`PINTEREST_PRODUCT_CATEGORIES` <- CatalogsProductGroupMultiplePinterestProductCategoryCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`PINTEREST_PRODUCT_CATEGORIES`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PinterestProductCategoriesFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PINTEREST_PRODUCT_CATEGORIES`
      if (!is.null(input_json$`PINTEREST_PRODUCT_CATEGORIES`)) {
        stopifnot(R6::is.R6(input_json$`PINTEREST_PRODUCT_CATEGORIES`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinterestProductCategoriesFilter: the required field `PINTEREST_PRODUCT_CATEGORIES` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinterestProductCategoriesFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `PINTEREST_PRODUCT_CATEGORIES` is null
      if (is.null(self$`PINTEREST_PRODUCT_CATEGORIES`)) {
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
      # check if the required `PINTEREST_PRODUCT_CATEGORIES` is null
      if (is.null(self$`PINTEREST_PRODUCT_CATEGORIES`)) {
        invalid_fields["PINTEREST_PRODUCT_CATEGORIES"] <- "Non-nullable required field `PINTEREST_PRODUCT_CATEGORIES` cannot be null."
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
# PinterestProductCategoriesFilter$unlock()
#
## Below is an example to define the print function
# PinterestProductCategoriesFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinterestProductCategoriesFilter$lock()

