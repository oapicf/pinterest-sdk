#' Create a new ItemProcessingRecord
#'
#' @description
#' Object describing an item processing record
#'
#' @docType class
#' @title ItemProcessingRecord
#' @description ItemProcessingRecord Class
#' @format An \code{R6Class} generator object
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @field errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. list(\link{ItemValidationEvent}) [optional]
#' @field warnings Array with the validation warnings for the item processing record list(\link{ItemValidationEvent}) [optional]
#' @field status  \link{ItemProcessingStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemProcessingRecord <- R6::R6Class(
  "ItemProcessingRecord",
  public = list(
    `item_id` = NULL,
    `errors` = NULL,
    `warnings` = NULL,
    `status` = NULL,
    #' Initialize a new ItemProcessingRecord class.
    #'
    #' @description
    #' Initialize a new ItemProcessingRecord class.
    #'
    #' @param item_id The catalog item id in the merchant namespace
    #' @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
    #' @param warnings Array with the validation warnings for the item processing record
    #' @param status status
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`item_id` = NULL, `errors` = NULL, `warnings` = NULL, `status` = NULL, ...) {
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`warnings`)) {
        stopifnot(is.vector(`warnings`), length(`warnings`) != 0)
        sapply(`warnings`, function(x) stopifnot(R6::is.R6(x)))
        self$`warnings` <- `warnings`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemProcessingRecord in JSON format
    #' @export
    toJSON = function() {
      ItemProcessingRecordObject <- list()
      if (!is.null(self$`item_id`)) {
        ItemProcessingRecordObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`errors`)) {
        ItemProcessingRecordObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      if (!is.null(self$`warnings`)) {
        ItemProcessingRecordObject[["warnings"]] <-
          lapply(self$`warnings`, function(x) x$toJSON())
      }
      if (!is.null(self$`status`)) {
        ItemProcessingRecordObject[["status"]] <-
          self$`status`$toJSON()
      }
      ItemProcessingRecordObject
    },
    #' Deserialize JSON string into an instance of ItemProcessingRecord
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemProcessingRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemProcessingRecord
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`warnings`)) {
        self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- ItemProcessingStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemProcessingRecord in JSON format
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
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          [%s]
',
          paste(sapply(self$`errors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`warnings`)) {
          sprintf(
          '"warnings":
          [%s]
',
          paste(sapply(self$`warnings`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ItemProcessingRecord
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemProcessingRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemProcessingRecord
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self$`status` <- ItemProcessingStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ItemProcessingRecord
    #'
    #' @description
    #' Validate JSON input with respect to ItemProcessingRecord and throw an exception if invalid
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
    #' @return String representation of ItemProcessingRecord
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
# ItemProcessingRecord$unlock()
#
## Below is an example to define the print function
# ItemProcessingRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemProcessingRecord$lock()

