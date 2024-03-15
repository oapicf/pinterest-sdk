#' Create a new ProductType4Filter
#'
#' @description
#' ProductType4Filter Class
#'
#' @docType class
#' @title ProductType4Filter
#' @description ProductType4Filter Class
#' @format An \code{R6Class} generator object
#' @field PRODUCT_TYPE_4  \link{CatalogsProductGroupMultipleStringListCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductType4Filter <- R6::R6Class(
  "ProductType4Filter",
  public = list(
    `PRODUCT_TYPE_4` = NULL,
    #' Initialize a new ProductType4Filter class.
    #'
    #' @description
    #' Initialize a new ProductType4Filter class.
    #'
    #' @param PRODUCT_TYPE_4 PRODUCT_TYPE_4
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`PRODUCT_TYPE_4`, ...) {
      if (!missing(`PRODUCT_TYPE_4`)) {
        stopifnot(R6::is.R6(`PRODUCT_TYPE_4`))
        self$`PRODUCT_TYPE_4` <- `PRODUCT_TYPE_4`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ProductType4Filter in JSON format
    #' @export
    toJSON = function() {
      ProductType4FilterObject <- list()
      if (!is.null(self$`PRODUCT_TYPE_4`)) {
        ProductType4FilterObject[["PRODUCT_TYPE_4"]] <-
          self$`PRODUCT_TYPE_4`$toJSON()
      }
      ProductType4FilterObject
    },
    #' Deserialize JSON string into an instance of ProductType4Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProductType4Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductType4Filter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PRODUCT_TYPE_4`)) {
        `product_type_4_object` <- CatalogsProductGroupMultipleStringListCriteria$new()
        `product_type_4_object`$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_TYPE_4`, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_TYPE_4` <- `product_type_4_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ProductType4Filter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`PRODUCT_TYPE_4`)) {
          sprintf(
          '"PRODUCT_TYPE_4":
          %s
          ',
          jsonlite::toJSON(self$`PRODUCT_TYPE_4`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ProductType4Filter
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProductType4Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductType4Filter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`PRODUCT_TYPE_4` <- CatalogsProductGroupMultipleStringListCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_TYPE_4`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ProductType4Filter
    #'
    #' @description
    #' Validate JSON input with respect to ProductType4Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PRODUCT_TYPE_4`
      if (!is.null(input_json$`PRODUCT_TYPE_4`)) {
        stopifnot(R6::is.R6(input_json$`PRODUCT_TYPE_4`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductType4Filter: the required field `PRODUCT_TYPE_4` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductType4Filter
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `PRODUCT_TYPE_4` is null
      if (is.null(self$`PRODUCT_TYPE_4`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `PRODUCT_TYPE_4` is null
      if (is.null(self$`PRODUCT_TYPE_4`)) {
        invalid_fields["PRODUCT_TYPE_4"] <- "Non-nullable required field `PRODUCT_TYPE_4` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ProductType4Filter$unlock()
#
## Below is an example to define the print function
# ProductType4Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductType4Filter$lock()

