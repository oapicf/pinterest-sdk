#' Create a new ItemCreateBatchRecord
#'
#' @description
#' Object describing an item batch record to create items
#'
#' @docType class
#' @title ItemCreateBatchRecord
#' @description ItemCreateBatchRecord Class
#' @format An \code{R6Class} generator object
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @field attributes  \link{ItemAttributes} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemCreateBatchRecord <- R6::R6Class(
  "ItemCreateBatchRecord",
  public = list(
    `item_id` = NULL,
    `attributes` = NULL,
    #' Initialize a new ItemCreateBatchRecord class.
    #'
    #' @description
    #' Initialize a new ItemCreateBatchRecord class.
    #'
    #' @param item_id The catalog item id in the merchant namespace
    #' @param attributes attributes
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemCreateBatchRecord in JSON format
    #' @export
    toJSON = function() {
      ItemCreateBatchRecordObject <- list()
      if (!is.null(self$`item_id`)) {
        ItemCreateBatchRecordObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`attributes`)) {
        ItemCreateBatchRecordObject[["attributes"]] <-
          self$`attributes`$toJSON()
      }
      ItemCreateBatchRecordObject
    },
    #' Deserialize JSON string into an instance of ItemCreateBatchRecord
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemCreateBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemCreateBatchRecord
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- ItemAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemCreateBatchRecord in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of ItemCreateBatchRecord
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemCreateBatchRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemCreateBatchRecord
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      self$`attributes` <- ItemAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ItemCreateBatchRecord
    #'
    #' @description
    #' Validate JSON input with respect to ItemCreateBatchRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemCreateBatchRecord
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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

