#' Create a new CatalogBinding
#'
#' @description
#' Information about a catalog asset.
#'
#' @docType class
#' @title CatalogBinding
#' @description CatalogBinding Class
#' @format An \code{R6Class} generator object
#' @field catalog_type Catalog type character [optional]
#' @field id Catalog ID. character [optional]
#' @field name Catalog name character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogBinding <- R6::R6Class(
  "CatalogBinding",
  public = list(
    `catalog_type` = NULL,
    `id` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new CatalogBinding class.
    #'
    #' @param catalog_type Catalog type
    #' @param id Catalog ID.
    #' @param name Catalog name
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type` = NULL, `id` = NULL, `name` = NULL, ...) {
      if (!is.null(`catalog_type`)) {
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return CatalogBinding as a base R list.
    #' @examples
    #' # convert array of CatalogBinding (x) to a data frame
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
    #' Convert CatalogBinding to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogBindingObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogBindingObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`id`)) {
        CatalogBindingObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CatalogBindingObject[["name"]] <-
          self$`name`
      }
      return(CatalogBindingObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogBinding
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogBinding in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogBinding
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_type` <- this_object$`catalog_type`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogBinding and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogBinding
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# CatalogBinding$unlock()
#
## Below is an example to define the print function
# CatalogBinding$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogBinding$lock()

