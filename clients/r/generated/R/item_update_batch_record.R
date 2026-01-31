#' Create a new ItemUpdateBatchRecord
#'
#' @description
#' Object describing an item batch record to update items
#'
#' @docType class
#' @title ItemUpdateBatchRecord
#' @description ItemUpdateBatchRecord Class
#' @format An \code{R6Class} generator object
#' @field attributes  \link{UpdatableItemAttributes} [optional]
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @field update_mask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. list(\link{UpdateMaskFieldType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemUpdateBatchRecord <- R6::R6Class(
  "ItemUpdateBatchRecord",
  public = list(
    `attributes` = NULL,
    `item_id` = NULL,
    `update_mask` = NULL,

    #' @description
    #' Initialize a new ItemUpdateBatchRecord class.
    #'
    #' @param attributes attributes
    #' @param item_id The catalog item id in the merchant namespace
    #' @param update_mask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
    #' @param ... Other optional arguments.
    initialize = function(`attributes` = NULL, `item_id` = NULL, `update_mask` = NULL, ...) {
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
      if (!is.null(`update_mask`)) {
        stopifnot(is.vector(`update_mask`), length(`update_mask`) != 0)
        sapply(`update_mask`, function(x) stopifnot(R6::is.R6(x)))
        self$`update_mask` <- `update_mask`
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
    #' @return ItemUpdateBatchRecord as a base R list.
    #' @examples
    #' # convert array of ItemUpdateBatchRecord (x) to a data frame
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
    #' Convert ItemUpdateBatchRecord to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemUpdateBatchRecordObject <- list()
      if (!is.null(self$`attributes`)) {
        ItemUpdateBatchRecordObject[["attributes"]] <-
          self$`attributes`$toSimpleType()
      }
      if (!is.null(self$`item_id`)) {
        ItemUpdateBatchRecordObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`update_mask`)) {
        ItemUpdateBatchRecordObject[["update_mask"]] <-
          lapply(self$`update_mask`, function(x) x$toSimpleType())
      }
      return(ItemUpdateBatchRecordObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemUpdateBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemUpdateBatchRecord
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- UpdatableItemAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`update_mask`)) {
        self$`update_mask` <- ApiClient$new()$deserializeObj(this_object$`update_mask`, "array[UpdateMaskFieldType]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemUpdateBatchRecord in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemUpdateBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemUpdateBatchRecord
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attributes` <- UpdatableItemAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self$`item_id` <- this_object$`item_id`
      self$`update_mask` <- ApiClient$new()$deserializeObj(this_object$`update_mask`, "array[UpdateMaskFieldType]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemUpdateBatchRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemUpdateBatchRecord
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
# ItemUpdateBatchRecord$unlock()
#
## Below is an example to define the print function
# ItemUpdateBatchRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemUpdateBatchRecord$lock()

