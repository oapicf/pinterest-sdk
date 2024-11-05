#' Create a new GoogleProductCategory1Filter
#'
#' @description
#' GoogleProductCategory1Filter Class
#'
#' @docType class
#' @title GoogleProductCategory1Filter
#' @description GoogleProductCategory1Filter Class
#' @format An \code{R6Class} generator object
#' @field GOOGLE_PRODUCT_CATEGORY_1  \link{CatalogsProductGroupMultipleStringListCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoogleProductCategory1Filter <- R6::R6Class(
  "GoogleProductCategory1Filter",
  public = list(
    `GOOGLE_PRODUCT_CATEGORY_1` = NULL,

    #' @description
    #' Initialize a new GoogleProductCategory1Filter class.
    #'
    #' @param GOOGLE_PRODUCT_CATEGORY_1 GOOGLE_PRODUCT_CATEGORY_1
    #' @param ... Other optional arguments.
    initialize = function(`GOOGLE_PRODUCT_CATEGORY_1`, ...) {
      if (!missing(`GOOGLE_PRODUCT_CATEGORY_1`)) {
        stopifnot(R6::is.R6(`GOOGLE_PRODUCT_CATEGORY_1`))
        self$`GOOGLE_PRODUCT_CATEGORY_1` <- `GOOGLE_PRODUCT_CATEGORY_1`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return GoogleProductCategory1Filter in JSON format
    toJSON = function() {
      GoogleProductCategory1FilterObject <- list()
      if (!is.null(self$`GOOGLE_PRODUCT_CATEGORY_1`)) {
        GoogleProductCategory1FilterObject[["GOOGLE_PRODUCT_CATEGORY_1"]] <-
          self$`GOOGLE_PRODUCT_CATEGORY_1`$toJSON()
      }
      GoogleProductCategory1FilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of GoogleProductCategory1Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoogleProductCategory1Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`GOOGLE_PRODUCT_CATEGORY_1`)) {
        `google_product_category_1_object` <- CatalogsProductGroupMultipleStringListCriteria$new()
        `google_product_category_1_object`$fromJSON(jsonlite::toJSON(this_object$`GOOGLE_PRODUCT_CATEGORY_1`, auto_unbox = TRUE, digits = NA))
        self$`GOOGLE_PRODUCT_CATEGORY_1` <- `google_product_category_1_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return GoogleProductCategory1Filter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`GOOGLE_PRODUCT_CATEGORY_1`)) {
          sprintf(
          '"GOOGLE_PRODUCT_CATEGORY_1":
          %s
          ',
          jsonlite::toJSON(self$`GOOGLE_PRODUCT_CATEGORY_1`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of GoogleProductCategory1Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoogleProductCategory1Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`GOOGLE_PRODUCT_CATEGORY_1` <- CatalogsProductGroupMultipleStringListCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`GOOGLE_PRODUCT_CATEGORY_1`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to GoogleProductCategory1Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `GOOGLE_PRODUCT_CATEGORY_1`
      if (!is.null(input_json$`GOOGLE_PRODUCT_CATEGORY_1`)) {
        stopifnot(R6::is.R6(input_json$`GOOGLE_PRODUCT_CATEGORY_1`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoogleProductCategory1Filter: the required field `GOOGLE_PRODUCT_CATEGORY_1` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoogleProductCategory1Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `GOOGLE_PRODUCT_CATEGORY_1` is null
      if (is.null(self$`GOOGLE_PRODUCT_CATEGORY_1`)) {
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
      # check if the required `GOOGLE_PRODUCT_CATEGORY_1` is null
      if (is.null(self$`GOOGLE_PRODUCT_CATEGORY_1`)) {
        invalid_fields["GOOGLE_PRODUCT_CATEGORY_1"] <- "Non-nullable required field `GOOGLE_PRODUCT_CATEGORY_1` cannot be null."
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
# GoogleProductCategory1Filter$unlock()
#
## Below is an example to define the print function
# GoogleProductCategory1Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoogleProductCategory1Filter$lock()

