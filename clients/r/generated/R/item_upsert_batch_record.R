#' Create a new ItemUpsertBatchRecord
#'
#' @description
#' Object describing an item batch record to upsert items
#'
#' @docType class
#' @title ItemUpsertBatchRecord
#' @description ItemUpsertBatchRecord Class
#' @format An \code{R6Class} generator object
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @field attributes  \link{ItemAttributesRequest} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemUpsertBatchRecord <- R6::R6Class(
  "ItemUpsertBatchRecord",
  public = list(
    `item_id` = NULL,
    `attributes` = NULL,

    #' @description
    #' Initialize a new ItemUpsertBatchRecord class.
    #'
    #' @param item_id The catalog item id in the merchant namespace
    #' @param attributes attributes
    #' @param ... Other optional arguments.
    initialize = function(`item_id` = NULL, `attributes` = NULL, ...) {
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!is.null(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ItemUpsertBatchRecord in JSON format
    toJSON = function() {
      ItemUpsertBatchRecordObject <- list()
      if (!is.null(self$`item_id`)) {
        ItemUpsertBatchRecordObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`attributes`)) {
        ItemUpsertBatchRecordObject[["attributes"]] <-
          self$`attributes`$toJSON()
      }
      ItemUpsertBatchRecordObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemUpsertBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemUpsertBatchRecord
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- ItemAttributesRequest$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ItemUpsertBatchRecord in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
          )
        },
        if (!is.null(self$`attributes`)) {
          sprintf(
          '"attributes":
          %s
          ',
          jsonlite::toJSON(self$`attributes`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemUpsertBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemUpsertBatchRecord
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      self$`attributes` <- ItemAttributesRequest$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemUpsertBatchRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemUpsertBatchRecord
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
# ItemUpsertBatchRecord$unlock()
#
## Below is an example to define the print function
# ItemUpsertBatchRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemUpsertBatchRecord$lock()

