#' Create a new ProductType0Filter
#'
#' @description
#' ProductType0Filter Class
#'
#' @docType class
#' @title ProductType0Filter
#' @description ProductType0Filter Class
#' @format An \code{R6Class} generator object
#' @field PRODUCT_TYPE_0  \link{CatalogsProductGroupMultipleStringListCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductType0Filter <- R6::R6Class(
  "ProductType0Filter",
  public = list(
    `PRODUCT_TYPE_0` = NULL,

    #' @description
    #' Initialize a new ProductType0Filter class.
    #'
    #' @param PRODUCT_TYPE_0 PRODUCT_TYPE_0
    #' @param ... Other optional arguments.
    initialize = function(`PRODUCT_TYPE_0`, ...) {
      if (!missing(`PRODUCT_TYPE_0`)) {
        stopifnot(R6::is.R6(`PRODUCT_TYPE_0`))
        self$`PRODUCT_TYPE_0` <- `PRODUCT_TYPE_0`
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
    #' @return ProductType0Filter as a base R list.
    #' @examples
    #' # convert array of ProductType0Filter (x) to a data frame
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
    #' Convert ProductType0Filter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductType0FilterObject <- list()
      if (!is.null(self$`PRODUCT_TYPE_0`)) {
        ProductType0FilterObject[["PRODUCT_TYPE_0"]] <-
          self$`PRODUCT_TYPE_0`$toSimpleType()
      }
      return(ProductType0FilterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductType0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductType0Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PRODUCT_TYPE_0`)) {
        `product_type_0_object` <- CatalogsProductGroupMultipleStringListCriteria$new()
        `product_type_0_object`$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_TYPE_0`, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_TYPE_0` <- `product_type_0_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductType0Filter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductType0Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductType0Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`PRODUCT_TYPE_0` <- CatalogsProductGroupMultipleStringListCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_TYPE_0`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductType0Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PRODUCT_TYPE_0`
      if (!is.null(input_json$`PRODUCT_TYPE_0`)) {
        stopifnot(R6::is.R6(input_json$`PRODUCT_TYPE_0`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductType0Filter: the required field `PRODUCT_TYPE_0` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductType0Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `PRODUCT_TYPE_0` is null
      if (is.null(self$`PRODUCT_TYPE_0`)) {
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
      # check if the required `PRODUCT_TYPE_0` is null
      if (is.null(self$`PRODUCT_TYPE_0`)) {
        invalid_fields["PRODUCT_TYPE_0"] <- "Non-nullable required field `PRODUCT_TYPE_0` cannot be null."
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
# ProductType0Filter$unlock()
#
## Below is an example to define the print function
# ProductType0Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductType0Filter$lock()

