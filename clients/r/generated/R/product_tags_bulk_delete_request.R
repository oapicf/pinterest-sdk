#' Create a new ProductTagsBulkDeleteRequest
#'
#' @description
#' Request body for bulk deleting product tags from a pin.
#'
#' @docType class
#' @title ProductTagsBulkDeleteRequest
#' @description ProductTagsBulkDeleteRequest Class
#' @format An \code{R6Class} generator object
#' @field product_tags List of product tags to delete. list(\link{ProductTagItem})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductTagsBulkDeleteRequest <- R6::R6Class(
  "ProductTagsBulkDeleteRequest",
  public = list(
    `product_tags` = NULL,

    #' @description
    #' Initialize a new ProductTagsBulkDeleteRequest class.
    #'
    #' @param product_tags List of product tags to delete.
    #' @param ... Other optional arguments.
    initialize = function(`product_tags`, ...) {
      if (!missing(`product_tags`)) {
        stopifnot(is.vector(`product_tags`), length(`product_tags`) != 0)
        sapply(`product_tags`, function(x) stopifnot(R6::is.R6(x)))
        self$`product_tags` <- `product_tags`
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
    #' @return ProductTagsBulkDeleteRequest as a base R list.
    #' @examples
    #' # convert array of ProductTagsBulkDeleteRequest (x) to a data frame
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
    #' Convert ProductTagsBulkDeleteRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductTagsBulkDeleteRequestObject <- list()
      if (!is.null(self$`product_tags`)) {
        ProductTagsBulkDeleteRequestObject[["product_tags"]] <-
          self$extractSimpleType(self$`product_tags`)
      }
      return(ProductTagsBulkDeleteRequestObject)
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
    #' Deserialize JSON string into an instance of ProductTagsBulkDeleteRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductTagsBulkDeleteRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`product_tags`)) {
        self$`product_tags` <- ApiClient$new()$deserializeObj(this_object$`product_tags`, "array[ProductTagItem]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductTagsBulkDeleteRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductTagsBulkDeleteRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductTagsBulkDeleteRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`product_tags` <- ApiClient$new()$deserializeObj(this_object$`product_tags`, "array[ProductTagItem]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductTagsBulkDeleteRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `product_tags`
      if (!is.null(input_json$`product_tags`)) {
        stopifnot(is.vector(input_json$`product_tags`), length(input_json$`product_tags`) != 0)
        tmp <- sapply(input_json$`product_tags`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductTagsBulkDeleteRequest: the required field `product_tags` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductTagsBulkDeleteRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `product_tags` is null
      if (is.null(self$`product_tags`)) {
        return(FALSE)
      }

      if (length(self$`product_tags`) > 24) {
        return(FALSE)
      }
      if (length(self$`product_tags`) < 1) {
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
      # check if the required `product_tags` is null
      if (is.null(self$`product_tags`)) {
        invalid_fields["product_tags"] <- "Non-nullable required field `product_tags` cannot be null."
      }

      if (length(self$`product_tags`) > 24) {
        invalid_fields["product_tags"] <- "Invalid length for `product_tags`, number of items must be less than or equal to 24."
      }
      if (length(self$`product_tags`) < 1) {
        invalid_fields["product_tags"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# ProductTagsBulkDeleteRequest$unlock()
#
## Below is an example to define the print function
# ProductTagsBulkDeleteRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductTagsBulkDeleteRequest$lock()

