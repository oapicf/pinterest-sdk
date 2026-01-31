#' Create a new CatalogsHotelFilterValuesMap
#'
#' @description
#' A map of filter attributes to their available values.
#'
#' @docType class
#' @title CatalogsHotelFilterValuesMap
#' @description CatalogsHotelFilterValuesMap Class
#' @format An \code{R6Class} generator object
#' @field brand  list(character) [optional]
#' @field custom_label_0  list(character) [optional]
#' @field custom_label_1  list(character) [optional]
#' @field custom_label_2  list(character) [optional]
#' @field custom_label_3  list(character) [optional]
#' @field custom_label_4  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelFilterValuesMap <- R6::R6Class(
  "CatalogsHotelFilterValuesMap",
  public = list(
    `brand` = NULL,
    `custom_label_0` = NULL,
    `custom_label_1` = NULL,
    `custom_label_2` = NULL,
    `custom_label_3` = NULL,
    `custom_label_4` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelFilterValuesMap class.
    #'
    #' @param brand brand
    #' @param custom_label_0 custom_label_0
    #' @param custom_label_1 custom_label_1
    #' @param custom_label_2 custom_label_2
    #' @param custom_label_3 custom_label_3
    #' @param custom_label_4 custom_label_4
    #' @param ... Other optional arguments.
    initialize = function(`brand` = NULL, `custom_label_0` = NULL, `custom_label_1` = NULL, `custom_label_2` = NULL, `custom_label_3` = NULL, `custom_label_4` = NULL, ...) {
      if (!is.null(`brand`)) {
        stopifnot(is.vector(`brand`), length(`brand`) != 0)
        sapply(`brand`, function(x) stopifnot(is.character(x)))
        self$`brand` <- `brand`
      }
      if (!is.null(`custom_label_0`)) {
        stopifnot(is.vector(`custom_label_0`), length(`custom_label_0`) != 0)
        sapply(`custom_label_0`, function(x) stopifnot(is.character(x)))
        self$`custom_label_0` <- `custom_label_0`
      }
      if (!is.null(`custom_label_1`)) {
        stopifnot(is.vector(`custom_label_1`), length(`custom_label_1`) != 0)
        sapply(`custom_label_1`, function(x) stopifnot(is.character(x)))
        self$`custom_label_1` <- `custom_label_1`
      }
      if (!is.null(`custom_label_2`)) {
        stopifnot(is.vector(`custom_label_2`), length(`custom_label_2`) != 0)
        sapply(`custom_label_2`, function(x) stopifnot(is.character(x)))
        self$`custom_label_2` <- `custom_label_2`
      }
      if (!is.null(`custom_label_3`)) {
        stopifnot(is.vector(`custom_label_3`), length(`custom_label_3`) != 0)
        sapply(`custom_label_3`, function(x) stopifnot(is.character(x)))
        self$`custom_label_3` <- `custom_label_3`
      }
      if (!is.null(`custom_label_4`)) {
        stopifnot(is.vector(`custom_label_4`), length(`custom_label_4`) != 0)
        sapply(`custom_label_4`, function(x) stopifnot(is.character(x)))
        self$`custom_label_4` <- `custom_label_4`
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
    #' @return CatalogsHotelFilterValuesMap as a base R list.
    #' @examples
    #' # convert array of CatalogsHotelFilterValuesMap (x) to a data frame
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
    #' Convert CatalogsHotelFilterValuesMap to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsHotelFilterValuesMapObject <- list()
      if (!is.null(self$`brand`)) {
        CatalogsHotelFilterValuesMapObject[["brand"]] <-
          self$`brand`
      }
      if (!is.null(self$`custom_label_0`)) {
        CatalogsHotelFilterValuesMapObject[["custom_label_0"]] <-
          self$`custom_label_0`
      }
      if (!is.null(self$`custom_label_1`)) {
        CatalogsHotelFilterValuesMapObject[["custom_label_1"]] <-
          self$`custom_label_1`
      }
      if (!is.null(self$`custom_label_2`)) {
        CatalogsHotelFilterValuesMapObject[["custom_label_2"]] <-
          self$`custom_label_2`
      }
      if (!is.null(self$`custom_label_3`)) {
        CatalogsHotelFilterValuesMapObject[["custom_label_3"]] <-
          self$`custom_label_3`
      }
      if (!is.null(self$`custom_label_4`)) {
        CatalogsHotelFilterValuesMapObject[["custom_label_4"]] <-
          self$`custom_label_4`
      }
      return(CatalogsHotelFilterValuesMapObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelFilterValuesMap
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelFilterValuesMap
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`brand`)) {
        self$`brand` <- ApiClient$new()$deserializeObj(this_object$`brand`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_0`)) {
        self$`custom_label_0` <- ApiClient$new()$deserializeObj(this_object$`custom_label_0`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_1`)) {
        self$`custom_label_1` <- ApiClient$new()$deserializeObj(this_object$`custom_label_1`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_2`)) {
        self$`custom_label_2` <- ApiClient$new()$deserializeObj(this_object$`custom_label_2`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_3`)) {
        self$`custom_label_3` <- ApiClient$new()$deserializeObj(this_object$`custom_label_3`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_4`)) {
        self$`custom_label_4` <- ApiClient$new()$deserializeObj(this_object$`custom_label_4`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsHotelFilterValuesMap in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelFilterValuesMap
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelFilterValuesMap
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`brand` <- ApiClient$new()$deserializeObj(this_object$`brand`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_0` <- ApiClient$new()$deserializeObj(this_object$`custom_label_0`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_1` <- ApiClient$new()$deserializeObj(this_object$`custom_label_1`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_2` <- ApiClient$new()$deserializeObj(this_object$`custom_label_2`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_3` <- ApiClient$new()$deserializeObj(this_object$`custom_label_3`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_4` <- ApiClient$new()$deserializeObj(this_object$`custom_label_4`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelFilterValuesMap and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelFilterValuesMap
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# CatalogsHotelFilterValuesMap$unlock()
#
## Below is an example to define the print function
# CatalogsHotelFilterValuesMap$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelFilterValuesMap$lock()

