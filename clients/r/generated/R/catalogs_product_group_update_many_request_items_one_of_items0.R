#' Create a new CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
#'
#' @description
#' CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 Class
#'
#' @docType class
#' @title CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
#' @description CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field filters  \link{CatalogsProductGroupFiltersRequest} [optional]
#' @field is_featured boolean indicator of whether the product group is being featured or not character [optional]
#' @field name  character [optional]
#' @field id ID of the product group. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 <- R6::R6Class(
  "CatalogsProductGroupUpdateManyRequestItemsOneOfItems0",
  public = list(
    `description` = NULL,
    `filters` = NULL,
    `is_featured` = NULL,
    `name` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 class.
    #'
    #' @param id ID of the product group.
    #' @param description description
    #' @param filters filters
    #' @param is_featured boolean indicator of whether the product group is being featured or not
    #' @param name name
    #' @param ... Other optional arguments.
    initialize = function(`id`, `description` = NULL, `filters` = NULL, `is_featured` = NULL, `name` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
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
    #' @return CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 as a base R list.
    #' @examples
    #' # convert array of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 (x) to a data frame
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
    #' Convert CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Object <- list()
      if (!is.null(self$`description`)) {
        CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Object[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Object[["filters"]] <-
          self$extractSimpleType(self$`filters`)
      }
      if (!is.null(self$`is_featured`)) {
        CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Object[["is_featured"]] <-
          self$`is_featured`
      }
      if (!is.null(self$`name`)) {
        CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Object[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`id`)) {
        CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Object[["id"]] <-
          self$`id`
      }
      return(CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Object)
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
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
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
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`filters` <- CatalogsProductGroupFiltersRequest$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`is_featured` <- this_object$`is_featured`
      self$`name` <- this_object$`name`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupUpdateManyRequestItemsOneOfItems0: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

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
# CatalogsProductGroupUpdateManyRequestItemsOneOfItems0$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupUpdateManyRequestItemsOneOfItems0$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupUpdateManyRequestItemsOneOfItems0$lock()

