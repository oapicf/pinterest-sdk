#' Create a new ItemProcessingRecord
#'
#' @description
#' Object describing an item processing record
#'
#' @docType class
#' @title ItemProcessingRecord
#' @description ItemProcessingRecord Class
#' @format An \code{R6Class} generator object
#' @field errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. list(\link{ItemValidationEvent}) [optional]
#' @field item_id The catalog item id in the merchant namespace character [optional]
#' @field status  \link{ItemProcessingStatus} [optional]
#' @field warnings Array with the validation warnings for the item processing record list(\link{ItemValidationEvent}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemProcessingRecord <- R6::R6Class(
  "ItemProcessingRecord",
  public = list(
    `errors` = NULL,
    `item_id` = NULL,
    `status` = NULL,
    `warnings` = NULL,

    #' @description
    #' Initialize a new ItemProcessingRecord class.
    #'
    #' @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
    #' @param item_id The catalog item id in the merchant namespace
    #' @param status status
    #' @param warnings Array with the validation warnings for the item processing record
    #' @param ... Other optional arguments.
    initialize = function(`errors` = NULL, `item_id` = NULL, `status` = NULL, `warnings` = NULL, ...) {
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`warnings`)) {
        stopifnot(is.vector(`warnings`), length(`warnings`) != 0)
        sapply(`warnings`, function(x) stopifnot(R6::is.R6(x)))
        self$`warnings` <- `warnings`
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
    #' @return ItemProcessingRecord as a base R list.
    #' @examples
    #' # convert array of ItemProcessingRecord (x) to a data frame
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
    #' Convert ItemProcessingRecord to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemProcessingRecordObject <- list()
      if (!is.null(self$`errors`)) {
        ItemProcessingRecordObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`item_id`)) {
        ItemProcessingRecordObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`status`)) {
        ItemProcessingRecordObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`warnings`)) {
        ItemProcessingRecordObject[["warnings"]] <-
          lapply(self$`warnings`, function(x) x$toSimpleType())
      }
      return(ItemProcessingRecordObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemProcessingRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemProcessingRecord
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- ItemProcessingStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`warnings`)) {
        self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemProcessingRecord in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemProcessingRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemProcessingRecord
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self$`item_id` <- this_object$`item_id`
      self$`status` <- ItemProcessingStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemProcessingRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemProcessingRecord
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
# ItemProcessingRecord$unlock()
#
## Below is an example to define the print function
# ItemProcessingRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemProcessingRecord$lock()

