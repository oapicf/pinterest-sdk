#' Create a new ProductGroupReferenceFilter
#'
#' @description
#' ProductGroupReferenceFilter Class
#'
#' @docType class
#' @title ProductGroupReferenceFilter
#' @description ProductGroupReferenceFilter Class
#' @format An \code{R6Class} generator object
#' @field PRODUCT_GROUP  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductGroupReferenceFilter <- R6::R6Class(
  "ProductGroupReferenceFilter",
  public = list(
    `PRODUCT_GROUP` = NULL,

    #' @description
    #' Initialize a new ProductGroupReferenceFilter class.
    #'
    #' @param PRODUCT_GROUP PRODUCT_GROUP
    #' @param ... Other optional arguments.
    initialize = function(`PRODUCT_GROUP`, ...) {
      if (!missing(`PRODUCT_GROUP`)) {
        stopifnot(R6::is.R6(`PRODUCT_GROUP`))
        self$`PRODUCT_GROUP` <- `PRODUCT_GROUP`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ProductGroupReferenceFilter in JSON format
    toJSON = function() {
      ProductGroupReferenceFilterObject <- list()
      if (!is.null(self$`PRODUCT_GROUP`)) {
        ProductGroupReferenceFilterObject[["PRODUCT_GROUP"]] <-
          self$`PRODUCT_GROUP`$toJSON()
      }
      ProductGroupReferenceFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupReferenceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupReferenceFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PRODUCT_GROUP`)) {
        `product_group_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `product_group_object`$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_GROUP`, auto_unbox = TRUE, digits = NA))
        self$`PRODUCT_GROUP` <- `product_group_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ProductGroupReferenceFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`PRODUCT_GROUP`)) {
          sprintf(
          '"PRODUCT_GROUP":
          %s
          ',
          jsonlite::toJSON(self$`PRODUCT_GROUP`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupReferenceFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupReferenceFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`PRODUCT_GROUP` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`PRODUCT_GROUP`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductGroupReferenceFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PRODUCT_GROUP`
      if (!is.null(input_json$`PRODUCT_GROUP`)) {
        stopifnot(R6::is.R6(input_json$`PRODUCT_GROUP`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductGroupReferenceFilter: the required field `PRODUCT_GROUP` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductGroupReferenceFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `PRODUCT_GROUP` is null
      if (is.null(self$`PRODUCT_GROUP`)) {
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
      # check if the required `PRODUCT_GROUP` is null
      if (is.null(self$`PRODUCT_GROUP`)) {
        invalid_fields["PRODUCT_GROUP"] <- "Non-nullable required field `PRODUCT_GROUP` cannot be null."
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
# ProductGroupReferenceFilter$unlock()
#
## Below is an example to define the print function
# ProductGroupReferenceFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductGroupReferenceFilter$lock()

