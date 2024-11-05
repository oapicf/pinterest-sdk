#' Create a new ItemDeleteBatchRecord
#'
#' @description
#' Object describing an item batch record to delete items
#'
#' @docType class
#' @title ItemDeleteBatchRecord
#' @description ItemDeleteBatchRecord Class
#' @format An \code{R6Class} generator object
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemDeleteBatchRecord <- R6::R6Class(
  "ItemDeleteBatchRecord",
  public = list(
    `item_id` = NULL,

    #' @description
    #' Initialize a new ItemDeleteBatchRecord class.
    #'
    #' @param item_id The catalog item id in the merchant namespace
    #' @param ... Other optional arguments.
    initialize = function(`item_id` = NULL, ...) {
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ItemDeleteBatchRecord in JSON format
    toJSON = function() {
      ItemDeleteBatchRecordObject <- list()
      if (!is.null(self$`item_id`)) {
        ItemDeleteBatchRecordObject[["item_id"]] <-
          self$`item_id`
      }
      ItemDeleteBatchRecordObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDeleteBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDeleteBatchRecord
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ItemDeleteBatchRecord in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDeleteBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDeleteBatchRecord
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemDeleteBatchRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemDeleteBatchRecord
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
# ItemDeleteBatchRecord$unlock()
#
## Below is an example to define the print function
# ItemDeleteBatchRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemDeleteBatchRecord$lock()

