#' Create a new GoogleProductCategory6Filter
#'
#' @description
#' GoogleProductCategory6Filter Class
#'
#' @docType class
#' @title GoogleProductCategory6Filter
#' @description GoogleProductCategory6Filter Class
#' @format An \code{R6Class} generator object
#' @field GOOGLE_PRODUCT_CATEGORY_6  \link{CatalogsProductGroupMultipleStringListCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoogleProductCategory6Filter <- R6::R6Class(
  "GoogleProductCategory6Filter",
  public = list(
    `GOOGLE_PRODUCT_CATEGORY_6` = NULL,

    #' @description
    #' Initialize a new GoogleProductCategory6Filter class.
    #'
    #' @param GOOGLE_PRODUCT_CATEGORY_6 GOOGLE_PRODUCT_CATEGORY_6
    #' @param ... Other optional arguments.
    initialize = function(`GOOGLE_PRODUCT_CATEGORY_6`, ...) {
      if (!missing(`GOOGLE_PRODUCT_CATEGORY_6`)) {
        stopifnot(R6::is.R6(`GOOGLE_PRODUCT_CATEGORY_6`))
        self$`GOOGLE_PRODUCT_CATEGORY_6` <- `GOOGLE_PRODUCT_CATEGORY_6`
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
    #' @return GoogleProductCategory6Filter as a base R list.
    #' @examples
    #' # convert array of GoogleProductCategory6Filter (x) to a data frame
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
    #' Convert GoogleProductCategory6Filter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      GoogleProductCategory6FilterObject <- list()
      if (!is.null(self$`GOOGLE_PRODUCT_CATEGORY_6`)) {
        GoogleProductCategory6FilterObject[["GOOGLE_PRODUCT_CATEGORY_6"]] <-
          self$`GOOGLE_PRODUCT_CATEGORY_6`$toSimpleType()
      }
      return(GoogleProductCategory6FilterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of GoogleProductCategory6Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoogleProductCategory6Filter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`GOOGLE_PRODUCT_CATEGORY_6`)) {
        `google_product_category_6_object` <- CatalogsProductGroupMultipleStringListCriteria$new()
        `google_product_category_6_object`$fromJSON(jsonlite::toJSON(this_object$`GOOGLE_PRODUCT_CATEGORY_6`, auto_unbox = TRUE, digits = NA))
        self$`GOOGLE_PRODUCT_CATEGORY_6` <- `google_product_category_6_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return GoogleProductCategory6Filter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of GoogleProductCategory6Filter
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoogleProductCategory6Filter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`GOOGLE_PRODUCT_CATEGORY_6` <- CatalogsProductGroupMultipleStringListCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`GOOGLE_PRODUCT_CATEGORY_6`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to GoogleProductCategory6Filter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `GOOGLE_PRODUCT_CATEGORY_6`
      if (!is.null(input_json$`GOOGLE_PRODUCT_CATEGORY_6`)) {
        stopifnot(R6::is.R6(input_json$`GOOGLE_PRODUCT_CATEGORY_6`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoogleProductCategory6Filter: the required field `GOOGLE_PRODUCT_CATEGORY_6` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoogleProductCategory6Filter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `GOOGLE_PRODUCT_CATEGORY_6` is null
      if (is.null(self$`GOOGLE_PRODUCT_CATEGORY_6`)) {
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
      # check if the required `GOOGLE_PRODUCT_CATEGORY_6` is null
      if (is.null(self$`GOOGLE_PRODUCT_CATEGORY_6`)) {
        invalid_fields["GOOGLE_PRODUCT_CATEGORY_6"] <- "Non-nullable required field `GOOGLE_PRODUCT_CATEGORY_6` cannot be null."
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
# GoogleProductCategory6Filter$unlock()
#
## Below is an example to define the print function
# GoogleProductCategory6Filter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoogleProductCategory6Filter$lock()

