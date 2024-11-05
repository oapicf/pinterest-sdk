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
    #' To JSON String
    #'
    #' @return ProductType0Filter in JSON format
    toJSON = function() {
      ProductType0FilterObject <- list()
      if (!is.null(self$`PRODUCT_TYPE_0`)) {
        ProductType0FilterObject[["PRODUCT_TYPE_0"]] <-
          self$`PRODUCT_TYPE_0`$toJSON()
      }
      ProductType0FilterObject
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
    #' @return ProductType0Filter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`PRODUCT_TYPE_0`)) {
          sprintf(
          '"PRODUCT_TYPE_0":
          %s
          ',
          jsonlite::toJSON(self$`PRODUCT_TYPE_0`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
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

