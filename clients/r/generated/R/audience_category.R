#' Create a new AudienceCategory
#'
#' @description
#' AudienceCategory Class
#'
#' @docType class
#' @title AudienceCategory
#' @description AudienceCategory Class
#' @format An \code{R6Class} generator object
#' @field id Interest ID. character [optional]
#' @field index Interest affinity index. numeric [optional]
#' @field key Interest unique key (same as ID). character [optional]
#' @field name Interest name. character [optional]
#' @field ratio Interest's percent of category's total audience. numeric [optional]
#' @field subcategories Subcategory interest distribution list(\link{AudienceSubcategory}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceCategory <- R6::R6Class(
  "AudienceCategory",
  public = list(
    `id` = NULL,
    `index` = NULL,
    `key` = NULL,
    `name` = NULL,
    `ratio` = NULL,
    `subcategories` = NULL,

    #' @description
    #' Initialize a new AudienceCategory class.
    #'
    #' @param id Interest ID.
    #' @param index Interest affinity index.
    #' @param key Interest unique key (same as ID).
    #' @param name Interest name.
    #' @param ratio Interest's percent of category's total audience.
    #' @param subcategories Subcategory interest distribution
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `index` = NULL, `key` = NULL, `name` = NULL, `ratio` = NULL, `subcategories` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`index`)) {
        self$`index` <- `index`
      }
      if (!is.null(`key`)) {
        if (!(is.character(`key`) && length(`key`) == 1)) {
          stop(paste("Error! Invalid data for `key`. Must be a string:", `key`))
        }
        self$`key` <- `key`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`ratio`)) {
        self$`ratio` <- `ratio`
      }
      if (!is.null(`subcategories`)) {
        stopifnot(is.vector(`subcategories`), length(`subcategories`) != 0)
        sapply(`subcategories`, function(x) stopifnot(R6::is.R6(x)))
        self$`subcategories` <- `subcategories`
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
    #' @return AudienceCategory as a base R list.
    #' @examples
    #' # convert array of AudienceCategory (x) to a data frame
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
    #' Convert AudienceCategory to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AudienceCategoryObject <- list()
      if (!is.null(self$`id`)) {
        AudienceCategoryObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`index`)) {
        AudienceCategoryObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`key`)) {
        AudienceCategoryObject[["key"]] <-
          self$`key`
      }
      if (!is.null(self$`name`)) {
        AudienceCategoryObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`ratio`)) {
        AudienceCategoryObject[["ratio"]] <-
          self$`ratio`
      }
      if (!is.null(self$`subcategories`)) {
        AudienceCategoryObject[["subcategories"]] <-
          lapply(self$`subcategories`, function(x) x$toSimpleType())
      }
      return(AudienceCategoryObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCategory
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCategory
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`key`)) {
        self$`key` <- this_object$`key`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`ratio`)) {
        self$`ratio` <- this_object$`ratio`
      }
      if (!is.null(this_object$`subcategories`)) {
        self$`subcategories` <- ApiClient$new()$deserializeObj(this_object$`subcategories`, "array[AudienceSubcategory]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AudienceCategory in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCategory
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCategory
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`index` <- this_object$`index`
      self$`key` <- this_object$`key`
      self$`name` <- this_object$`name`
      self$`ratio` <- this_object$`ratio`
      self$`subcategories` <- ApiClient$new()$deserializeObj(this_object$`subcategories`, "array[AudienceSubcategory]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceCategory and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceCategory
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
# AudienceCategory$unlock()
#
## Below is an example to define the print function
# AudienceCategory$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceCategory$lock()

