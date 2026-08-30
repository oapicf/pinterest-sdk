#' Create a new ItemCreateBatchRecord
#'
#' @description
#' Object describing an item batch record to create items
#'
#' @docType class
#' @title ItemCreateBatchRecord
#' @description ItemCreateBatchRecord Class
#' @format An \code{R6Class} generator object
#' @field attributes  \link{ItemAttributesRequest} [optional]
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemCreateBatchRecord <- R6::R6Class(
  "ItemCreateBatchRecord",
  public = list(
    `attributes` = NULL,
    `item_id` = NULL,

    #' @description
    #' Initialize a new ItemCreateBatchRecord class.
    #'
    #' @param attributes attributes
    #' @param item_id The catalog item id in the merchant namespace
    #' @param ... Other optional arguments.
    initialize = function(`attributes` = NULL, `item_id` = NULL, ...) {
      if (!is.null(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
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
    #' @return ItemCreateBatchRecord as a base R list.
    #' @examples
    #' # convert array of ItemCreateBatchRecord (x) to a data frame
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
    #' Convert ItemCreateBatchRecord to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemCreateBatchRecordObject <- list()
      if (!is.null(self$`attributes`)) {
        ItemCreateBatchRecordObject[["attributes"]] <-
          self$extractSimpleType(self$`attributes`)
      }
      if (!is.null(self$`item_id`)) {
        ItemCreateBatchRecordObject[["item_id"]] <-
          self$`item_id`
      }
      return(ItemCreateBatchRecordObject)
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
    #' Deserialize JSON string into an instance of ItemCreateBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemCreateBatchRecord
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- ItemAttributesRequest$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemCreateBatchRecord in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemCreateBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemCreateBatchRecord
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attributes` <- ItemAttributesRequest$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self$`item_id` <- this_object$`item_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemCreateBatchRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemCreateBatchRecord
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
# ItemCreateBatchRecord$unlock()
#
## Below is an example to define the print function
# ItemCreateBatchRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemCreateBatchRecord$lock()

