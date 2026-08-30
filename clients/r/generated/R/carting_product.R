#' Create a new CartingProduct
#'
#' @description
#' CartingProduct Class
#'
#' @docType class
#' @title CartingProduct
#' @description CartingProduct Class
#' @format An \code{R6Class} generator object
#' @field carting_product_id the internal Pinterest carting product id (different from industry product id) character
#' @field display_preferred_retailers_only Whether to display only the preferred retailers for the carting product character [optional]
#' @field display_product_price Whether to display the price for the carting product character [optional]
#' @field preferred_retailers A sorted array of preferred retailers for the carting product list(\link{CartingRetailer}) [optional]
#' @field randomize_preferred_retailers Whether to randomize preferred retailers for the carting product character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CartingProduct <- R6::R6Class(
  "CartingProduct",
  public = list(
    `carting_product_id` = NULL,
    `display_preferred_retailers_only` = NULL,
    `display_product_price` = NULL,
    `preferred_retailers` = NULL,
    `randomize_preferred_retailers` = NULL,

    #' @description
    #' Initialize a new CartingProduct class.
    #'
    #' @param carting_product_id the internal Pinterest carting product id (different from industry product id)
    #' @param display_preferred_retailers_only Whether to display only the preferred retailers for the carting product
    #' @param display_product_price Whether to display the price for the carting product
    #' @param preferred_retailers A sorted array of preferred retailers for the carting product
    #' @param randomize_preferred_retailers Whether to randomize preferred retailers for the carting product
    #' @param ... Other optional arguments.
    initialize = function(`carting_product_id`, `display_preferred_retailers_only` = NULL, `display_product_price` = NULL, `preferred_retailers` = NULL, `randomize_preferred_retailers` = NULL, ...) {
      if (!missing(`carting_product_id`)) {
        if (!(is.character(`carting_product_id`) && length(`carting_product_id`) == 1)) {
          stop(paste("Error! Invalid data for `carting_product_id`. Must be a string:", `carting_product_id`))
        }
        self$`carting_product_id` <- `carting_product_id`
      }
      if (!is.null(`display_preferred_retailers_only`)) {
        if (!(is.logical(`display_preferred_retailers_only`) && length(`display_preferred_retailers_only`) == 1)) {
          stop(paste("Error! Invalid data for `display_preferred_retailers_only`. Must be a boolean:", `display_preferred_retailers_only`))
        }
        self$`display_preferred_retailers_only` <- `display_preferred_retailers_only`
      }
      if (!is.null(`display_product_price`)) {
        if (!(is.logical(`display_product_price`) && length(`display_product_price`) == 1)) {
          stop(paste("Error! Invalid data for `display_product_price`. Must be a boolean:", `display_product_price`))
        }
        self$`display_product_price` <- `display_product_price`
      }
      if (!is.null(`preferred_retailers`)) {
        stopifnot(is.vector(`preferred_retailers`), length(`preferred_retailers`) != 0)
        sapply(`preferred_retailers`, function(x) stopifnot(R6::is.R6(x)))
        self$`preferred_retailers` <- `preferred_retailers`
      }
      if (!is.null(`randomize_preferred_retailers`)) {
        if (!(is.logical(`randomize_preferred_retailers`) && length(`randomize_preferred_retailers`) == 1)) {
          stop(paste("Error! Invalid data for `randomize_preferred_retailers`. Must be a boolean:", `randomize_preferred_retailers`))
        }
        self$`randomize_preferred_retailers` <- `randomize_preferred_retailers`
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
    #' @return CartingProduct as a base R list.
    #' @examples
    #' # convert array of CartingProduct (x) to a data frame
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
    #' Convert CartingProduct to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CartingProductObject <- list()
      if (!is.null(self$`carting_product_id`)) {
        CartingProductObject[["carting_product_id"]] <-
          self$`carting_product_id`
      }
      if (!is.null(self$`display_preferred_retailers_only`)) {
        CartingProductObject[["display_preferred_retailers_only"]] <-
          self$`display_preferred_retailers_only`
      }
      if (!is.null(self$`display_product_price`)) {
        CartingProductObject[["display_product_price"]] <-
          self$`display_product_price`
      }
      if (!is.null(self$`preferred_retailers`)) {
        CartingProductObject[["preferred_retailers"]] <-
          self$extractSimpleType(self$`preferred_retailers`)
      }
      if (!is.null(self$`randomize_preferred_retailers`)) {
        CartingProductObject[["randomize_preferred_retailers"]] <-
          self$`randomize_preferred_retailers`
      }
      return(CartingProductObject)
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
    #' Deserialize JSON string into an instance of CartingProduct
    #'
    #' @param input_json the JSON input
    #' @return the instance of CartingProduct
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`carting_product_id`)) {
        self$`carting_product_id` <- this_object$`carting_product_id`
      }
      if (!is.null(this_object$`display_preferred_retailers_only`)) {
        self$`display_preferred_retailers_only` <- this_object$`display_preferred_retailers_only`
      }
      if (!is.null(this_object$`display_product_price`)) {
        self$`display_product_price` <- this_object$`display_product_price`
      }
      if (!is.null(this_object$`preferred_retailers`)) {
        self$`preferred_retailers` <- ApiClient$new()$deserializeObj(this_object$`preferred_retailers`, "array[CartingRetailer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`randomize_preferred_retailers`)) {
        self$`randomize_preferred_retailers` <- this_object$`randomize_preferred_retailers`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CartingProduct in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CartingProduct
    #'
    #' @param input_json the JSON input
    #' @return the instance of CartingProduct
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`carting_product_id` <- this_object$`carting_product_id`
      self$`display_preferred_retailers_only` <- this_object$`display_preferred_retailers_only`
      self$`display_product_price` <- this_object$`display_product_price`
      self$`preferred_retailers` <- ApiClient$new()$deserializeObj(this_object$`preferred_retailers`, "array[CartingRetailer]", loadNamespace("openapi"))
      self$`randomize_preferred_retailers` <- this_object$`randomize_preferred_retailers`
      self
    },

    #' @description
    #' Validate JSON input with respect to CartingProduct and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `carting_product_id`
      if (!is.null(input_json$`carting_product_id`)) {
        if (!(is.character(input_json$`carting_product_id`) && length(input_json$`carting_product_id`) == 1)) {
          stop(paste("Error! Invalid data for `carting_product_id`. Must be a string:", input_json$`carting_product_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CartingProduct: the required field `carting_product_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CartingProduct
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `carting_product_id` is null
      if (is.null(self$`carting_product_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`carting_product_id`, "^\\d+$")) {
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
      # check if the required `carting_product_id` is null
      if (is.null(self$`carting_product_id`)) {
        invalid_fields["carting_product_id"] <- "Non-nullable required field `carting_product_id` cannot be null."
      }

      if (!str_detect(self$`carting_product_id`, "^\\d+$")) {
        invalid_fields["carting_product_id"] <- "Invalid value for `carting_product_id`, must conform to the pattern ^\\d+$."
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
# CartingProduct$unlock()
#
## Below is an example to define the print function
# CartingProduct$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CartingProduct$lock()

