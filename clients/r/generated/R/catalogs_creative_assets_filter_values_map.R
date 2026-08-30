#' Create a new CatalogsCreativeAssetsFilterValuesMap
#'
#' @description
#' A map of filter attributes to their available values.
#'
#' @docType class
#' @title CatalogsCreativeAssetsFilterValuesMap
#' @description CatalogsCreativeAssetsFilterValuesMap Class
#' @format An \code{R6Class} generator object
#' @field custom_label_0  list(character) [optional]
#' @field custom_label_1  list(character) [optional]
#' @field custom_label_2  list(character) [optional]
#' @field custom_label_3  list(character) [optional]
#' @field custom_label_4  list(character) [optional]
#' @field google_product_category_0  list(character) [optional]
#' @field google_product_category_1  list(character) [optional]
#' @field google_product_category_2  list(character) [optional]
#' @field google_product_category_3  list(character) [optional]
#' @field google_product_category_4  list(character) [optional]
#' @field google_product_category_5  list(character) [optional]
#' @field google_product_category_6  list(character) [optional]
#' @field media_type  list(\link{MediaType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsFilterValuesMap <- R6::R6Class(
  "CatalogsCreativeAssetsFilterValuesMap",
  public = list(
    `custom_label_0` = NULL,
    `custom_label_1` = NULL,
    `custom_label_2` = NULL,
    `custom_label_3` = NULL,
    `custom_label_4` = NULL,
    `google_product_category_0` = NULL,
    `google_product_category_1` = NULL,
    `google_product_category_2` = NULL,
    `google_product_category_3` = NULL,
    `google_product_category_4` = NULL,
    `google_product_category_5` = NULL,
    `google_product_category_6` = NULL,
    `media_type` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsFilterValuesMap class.
    #'
    #' @param custom_label_0 custom_label_0
    #' @param custom_label_1 custom_label_1
    #' @param custom_label_2 custom_label_2
    #' @param custom_label_3 custom_label_3
    #' @param custom_label_4 custom_label_4
    #' @param google_product_category_0 google_product_category_0
    #' @param google_product_category_1 google_product_category_1
    #' @param google_product_category_2 google_product_category_2
    #' @param google_product_category_3 google_product_category_3
    #' @param google_product_category_4 google_product_category_4
    #' @param google_product_category_5 google_product_category_5
    #' @param google_product_category_6 google_product_category_6
    #' @param media_type media_type
    #' @param ... Other optional arguments.
    initialize = function(`custom_label_0` = NULL, `custom_label_1` = NULL, `custom_label_2` = NULL, `custom_label_3` = NULL, `custom_label_4` = NULL, `google_product_category_0` = NULL, `google_product_category_1` = NULL, `google_product_category_2` = NULL, `google_product_category_3` = NULL, `google_product_category_4` = NULL, `google_product_category_5` = NULL, `google_product_category_6` = NULL, `media_type` = NULL, ...) {
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
      if (!is.null(`google_product_category_0`)) {
        stopifnot(is.vector(`google_product_category_0`), length(`google_product_category_0`) != 0)
        sapply(`google_product_category_0`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_0` <- `google_product_category_0`
      }
      if (!is.null(`google_product_category_1`)) {
        stopifnot(is.vector(`google_product_category_1`), length(`google_product_category_1`) != 0)
        sapply(`google_product_category_1`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_1` <- `google_product_category_1`
      }
      if (!is.null(`google_product_category_2`)) {
        stopifnot(is.vector(`google_product_category_2`), length(`google_product_category_2`) != 0)
        sapply(`google_product_category_2`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_2` <- `google_product_category_2`
      }
      if (!is.null(`google_product_category_3`)) {
        stopifnot(is.vector(`google_product_category_3`), length(`google_product_category_3`) != 0)
        sapply(`google_product_category_3`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_3` <- `google_product_category_3`
      }
      if (!is.null(`google_product_category_4`)) {
        stopifnot(is.vector(`google_product_category_4`), length(`google_product_category_4`) != 0)
        sapply(`google_product_category_4`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_4` <- `google_product_category_4`
      }
      if (!is.null(`google_product_category_5`)) {
        stopifnot(is.vector(`google_product_category_5`), length(`google_product_category_5`) != 0)
        sapply(`google_product_category_5`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_5` <- `google_product_category_5`
      }
      if (!is.null(`google_product_category_6`)) {
        stopifnot(is.vector(`google_product_category_6`), length(`google_product_category_6`) != 0)
        sapply(`google_product_category_6`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_6` <- `google_product_category_6`
      }
      if (!is.null(`media_type`)) {
        stopifnot(is.vector(`media_type`), length(`media_type`) != 0)
        sapply(`media_type`, function(x) stopifnot(R6::is.R6(x)))
        self$`media_type` <- `media_type`
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
    #' @return CatalogsCreativeAssetsFilterValuesMap as a base R list.
    #' @examples
    #' # convert array of CatalogsCreativeAssetsFilterValuesMap (x) to a data frame
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
    #' Convert CatalogsCreativeAssetsFilterValuesMap to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsCreativeAssetsFilterValuesMapObject <- list()
      if (!is.null(self$`custom_label_0`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["custom_label_0"]] <-
          self$`custom_label_0`
      }
      if (!is.null(self$`custom_label_1`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["custom_label_1"]] <-
          self$`custom_label_1`
      }
      if (!is.null(self$`custom_label_2`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["custom_label_2"]] <-
          self$`custom_label_2`
      }
      if (!is.null(self$`custom_label_3`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["custom_label_3"]] <-
          self$`custom_label_3`
      }
      if (!is.null(self$`custom_label_4`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["custom_label_4"]] <-
          self$`custom_label_4`
      }
      if (!is.null(self$`google_product_category_0`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["google_product_category_0"]] <-
          self$`google_product_category_0`
      }
      if (!is.null(self$`google_product_category_1`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["google_product_category_1"]] <-
          self$`google_product_category_1`
      }
      if (!is.null(self$`google_product_category_2`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["google_product_category_2"]] <-
          self$`google_product_category_2`
      }
      if (!is.null(self$`google_product_category_3`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["google_product_category_3"]] <-
          self$`google_product_category_3`
      }
      if (!is.null(self$`google_product_category_4`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["google_product_category_4"]] <-
          self$`google_product_category_4`
      }
      if (!is.null(self$`google_product_category_5`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["google_product_category_5"]] <-
          self$`google_product_category_5`
      }
      if (!is.null(self$`google_product_category_6`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["google_product_category_6"]] <-
          self$`google_product_category_6`
      }
      if (!is.null(self$`media_type`)) {
        CatalogsCreativeAssetsFilterValuesMapObject[["media_type"]] <-
          self$extractSimpleType(self$`media_type`)
      }
      return(CatalogsCreativeAssetsFilterValuesMapObject)
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
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsFilterValuesMap
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsFilterValuesMap
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
      if (!is.null(this_object$`google_product_category_0`)) {
        self$`google_product_category_0` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_0`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_1`)) {
        self$`google_product_category_1` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_1`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_2`)) {
        self$`google_product_category_2` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_2`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_3`)) {
        self$`google_product_category_3` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_3`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_4`)) {
        self$`google_product_category_4` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_4`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_5`)) {
        self$`google_product_category_5` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_5`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_6`)) {
        self$`google_product_category_6` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_6`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- ApiClient$new()$deserializeObj(this_object$`media_type`, "array[MediaType]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsCreativeAssetsFilterValuesMap in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsFilterValuesMap
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsFilterValuesMap
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`custom_label_0` <- ApiClient$new()$deserializeObj(this_object$`custom_label_0`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_1` <- ApiClient$new()$deserializeObj(this_object$`custom_label_1`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_2` <- ApiClient$new()$deserializeObj(this_object$`custom_label_2`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_3` <- ApiClient$new()$deserializeObj(this_object$`custom_label_3`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_4` <- ApiClient$new()$deserializeObj(this_object$`custom_label_4`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_0` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_0`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_1` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_1`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_2` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_2`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_3` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_3`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_4` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_4`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_5` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_5`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_6` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_6`, "array[character]", loadNamespace("openapi"))
      self$`media_type` <- ApiClient$new()$deserializeObj(this_object$`media_type`, "array[MediaType]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreativeAssetsFilterValuesMap and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreativeAssetsFilterValuesMap
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
# CatalogsCreativeAssetsFilterValuesMap$unlock()
#
## Below is an example to define the print function
# CatalogsCreativeAssetsFilterValuesMap$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreativeAssetsFilterValuesMap$lock()

