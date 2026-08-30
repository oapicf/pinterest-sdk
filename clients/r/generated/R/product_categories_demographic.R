#' Create a new ProductCategoriesDemographic
#'
#' @description
#' Age and gender distribution who engaged with this product category in the past 3 months
#'
#' @docType class
#' @title ProductCategoriesDemographic
#' @description ProductCategoriesDemographic Class
#' @format An \code{R6Class} generator object
#' @field age Age demographic distribution named list(numeric)
#' @field gender  \link{GenderDemographics}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductCategoriesDemographic <- R6::R6Class(
  "ProductCategoriesDemographic",
  public = list(
    `age` = NULL,
    `gender` = NULL,

    #' @description
    #' Initialize a new ProductCategoriesDemographic class.
    #'
    #' @param age Age demographic distribution
    #' @param gender gender
    #' @param ... Other optional arguments.
    initialize = function(`age`, `gender`, ...) {
      if (!missing(`age`)) {
        stopifnot(is.vector(`age`), length(`age`) != 0)
        sapply(`age`, function(x) stopifnot(is.character(x)))
        self$`age` <- `age`
      }
      if (!missing(`gender`)) {
        stopifnot(R6::is.R6(`gender`))
        self$`gender` <- `gender`
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
    #' @return ProductCategoriesDemographic as a base R list.
    #' @examples
    #' # convert array of ProductCategoriesDemographic (x) to a data frame
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
    #' Convert ProductCategoriesDemographic to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductCategoriesDemographicObject <- list()
      if (!is.null(self$`age`)) {
        ProductCategoriesDemographicObject[["age"]] <-
          self$`age`
      }
      if (!is.null(self$`gender`)) {
        ProductCategoriesDemographicObject[["gender"]] <-
          self$extractSimpleType(self$`gender`)
      }
      return(ProductCategoriesDemographicObject)
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
    #' Deserialize JSON string into an instance of ProductCategoriesDemographic
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductCategoriesDemographic
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`age`)) {
        self$`age` <- ApiClient$new()$deserializeObj(this_object$`age`, "map(numeric)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`gender`)) {
        `gender_object` <- GenderDemographics$new()
        `gender_object`$fromJSON(jsonlite::toJSON(this_object$`gender`, auto_unbox = TRUE, digits = NA))
        self$`gender` <- `gender_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductCategoriesDemographic in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductCategoriesDemographic
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductCategoriesDemographic
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`age` <- ApiClient$new()$deserializeObj(this_object$`age`, "map(numeric)", loadNamespace("openapi"))
      self$`gender` <- GenderDemographics$new()$fromJSON(jsonlite::toJSON(this_object$`gender`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductCategoriesDemographic and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `age`
      if (!is.null(input_json$`age`)) {
        stopifnot(is.vector(input_json$`age`), length(input_json$`age`) != 0)
        tmp <- sapply(input_json$`age`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductCategoriesDemographic: the required field `age` is missing."))
      }
      # check the required field `gender`
      if (!is.null(input_json$`gender`)) {
        stopifnot(R6::is.R6(input_json$`gender`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductCategoriesDemographic: the required field `gender` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductCategoriesDemographic
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `age` is null
      if (is.null(self$`age`)) {
        return(FALSE)
      }

      # check if the required `gender` is null
      if (is.null(self$`gender`)) {
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
      # check if the required `age` is null
      if (is.null(self$`age`)) {
        invalid_fields["age"] <- "Non-nullable required field `age` cannot be null."
      }

      # check if the required `gender` is null
      if (is.null(self$`gender`)) {
        invalid_fields["gender"] <- "Non-nullable required field `gender` cannot be null."
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
# ProductCategoriesDemographic$unlock()
#
## Below is an example to define the print function
# ProductCategoriesDemographic$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductCategoriesDemographic$lock()

