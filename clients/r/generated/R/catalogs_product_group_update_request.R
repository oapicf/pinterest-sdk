#' Create a new CatalogsProductGroupUpdateRequest
#'
#' @description
#' Request object for updating a product group.
#'
#' @docType class
#' @title CatalogsProductGroupUpdateRequest
#' @description CatalogsProductGroupUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field filters  \link{CatalogsProductGroupFiltersRequest} [optional]
#' @field is_featured boolean indicator of whether the product group is being featured or not character [optional]
#' @field name  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupUpdateRequest <- R6::R6Class(
  "CatalogsProductGroupUpdateRequest",
  public = list(
    `description` = NULL,
    `filters` = NULL,
    `is_featured` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupUpdateRequest class.
    #'
    #' @param description description
    #' @param filters filters
    #' @param is_featured boolean indicator of whether the product group is being featured or not
    #' @param name name
    #' @param ... Other optional arguments.
    initialize = function(`description` = NULL, `filters` = NULL, `is_featured` = NULL, `name` = NULL, ...) {
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
      if (!is.null(`is_featured`)) {
        if (!(is.logical(`is_featured`) && length(`is_featured`) == 1)) {
          stop(paste("Error! Invalid data for `is_featured`. Must be a boolean:", `is_featured`))
        }
        self$`is_featured` <- `is_featured`
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
    #' @return CatalogsProductGroupUpdateRequest as a base R list.
    #' @examples
    #' # convert array of CatalogsProductGroupUpdateRequest (x) to a data frame
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
    #' Convert CatalogsProductGroupUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsProductGroupUpdateRequestObject <- list()
      if (!is.null(self$`description`)) {
        CatalogsProductGroupUpdateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsProductGroupUpdateRequestObject[["filters"]] <-
          self$extractSimpleType(self$`filters`)
      }
      if (!is.null(self$`is_featured`)) {
        CatalogsProductGroupUpdateRequestObject[["is_featured"]] <-
          self$`is_featured`
      }
      if (!is.null(self$`name`)) {
        CatalogsProductGroupUpdateRequestObject[["name"]] <-
          self$`name`
      }
      return(CatalogsProductGroupUpdateRequestObject)
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
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsProductGroupFiltersRequest$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      if (!is.null(this_object$`is_featured`)) {
        self$`is_featured` <- this_object$`is_featured`
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
    #' @return CatalogsProductGroupUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`filters` <- CatalogsProductGroupFiltersRequest$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`is_featured` <- this_object$`is_featured`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupUpdateRequest
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
# CatalogsProductGroupUpdateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupUpdateRequest$lock()

