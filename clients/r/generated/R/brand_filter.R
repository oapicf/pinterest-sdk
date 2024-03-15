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
    #' Initialize a new BrandFilter class.
    #'
    #' @description
    #' Initialize a new BrandFilter class.
    #'
    #' @param BRAND BRAND
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`BRAND`, ...) {
      if (!missing(`BRAND`)) {
        stopifnot(R6::is.R6(`BRAND`))
        self$`BRAND` <- `BRAND`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BrandFilter in JSON format
    #' @export
    toJSON = function() {
      BrandFilterObject <- list()
      if (!is.null(self$`BRAND`)) {
        BrandFilterObject[["BRAND"]] <-
          self$`BRAND`$toJSON()
      }
      BrandFilterObject
    },
    #' Deserialize JSON string into an instance of BrandFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of BrandFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`BRAND`)) {
        `brand_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `brand_object`$fromJSON(jsonlite::toJSON(this_object$`BRAND`, auto_unbox = TRUE, digits = NA))
        self$`BRAND` <- `brand_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BrandFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`BRAND`)) {
          sprintf(
          '"BRAND":
          %s
          ',
          jsonlite::toJSON(self$`BRAND`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BrandFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of BrandFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`BRAND` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`BRAND`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to BrandFilter
    #'
    #' @description
    #' Validate JSON input with respect to BrandFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `BRAND`
      if (!is.null(input_json$`BRAND`)) {
        stopifnot(R6::is.R6(input_json$`BRAND`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BrandFilter: the required field `BRAND` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandFilter
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
      # check if the required `BRAND` is null
      if (is.null(self$`BRAND`)) {
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
      # check if the required `BRAND` is null
      if (is.null(self$`BRAND`)) {
        invalid_fields["BRAND"] <- "Non-nullable required field `BRAND` cannot be null."
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
# BrandFilter$unlock()
#
## Below is an example to define the print function
# BrandFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandFilter$lock()

