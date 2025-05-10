#' Create a new CatalogsHotelProductGroupFiltersAllOf
#'
#' @description
#' CatalogsHotelProductGroupFiltersAllOf Class
#'
#' @docType class
#' @title CatalogsHotelProductGroupFiltersAllOf
#' @description CatalogsHotelProductGroupFiltersAllOf Class
#' @format An \code{R6Class} generator object
#' @field all_of  list(\link{CatalogsHotelProductGroupFilterKeys})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroupFiltersAllOf <- R6::R6Class(
  "CatalogsHotelProductGroupFiltersAllOf",
  public = list(
    `all_of` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelProductGroupFiltersAllOf class.
    #'
    #' @param all_of all_of
    #' @param ... Other optional arguments.
    initialize = function(`all_of`, ...) {
      if (!missing(`all_of`)) {
        stopifnot(is.vector(`all_of`), length(`all_of`) != 0)
        sapply(`all_of`, function(x) stopifnot(R6::is.R6(x)))
        self$`all_of` <- `all_of`
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
    #' @return CatalogsHotelProductGroupFiltersAllOf as a base R list.
    #' @examples
    #' # convert array of CatalogsHotelProductGroupFiltersAllOf (x) to a data frame
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
    #' Convert CatalogsHotelProductGroupFiltersAllOf to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsHotelProductGroupFiltersAllOfObject <- list()
      if (!is.null(self$`all_of`)) {
        CatalogsHotelProductGroupFiltersAllOfObject[["all_of"]] <-
          lapply(self$`all_of`, function(x) x$toSimpleType())
      }
      return(CatalogsHotelProductGroupFiltersAllOfObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFiltersAllOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupFiltersAllOf
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`all_of`)) {
        self$`all_of` <- ApiClient$new()$deserializeObj(this_object$`all_of`, "array[CatalogsHotelProductGroupFilterKeys]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsHotelProductGroupFiltersAllOf in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFiltersAllOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupFiltersAllOf
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`all_of` <- ApiClient$new()$deserializeObj(this_object$`all_of`, "array[CatalogsHotelProductGroupFilterKeys]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelProductGroupFiltersAllOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `all_of`
      if (!is.null(input_json$`all_of`)) {
        stopifnot(is.vector(input_json$`all_of`), length(input_json$`all_of`) != 0)
        tmp <- sapply(input_json$`all_of`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupFiltersAllOf: the required field `all_of` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelProductGroupFiltersAllOf
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `all_of` is null
      if (is.null(self$`all_of`)) {
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
      # check if the required `all_of` is null
      if (is.null(self$`all_of`)) {
        invalid_fields["all_of"] <- "Non-nullable required field `all_of` cannot be null."
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
# CatalogsHotelProductGroupFiltersAllOf$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProductGroupFiltersAllOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProductGroupFiltersAllOf$lock()

