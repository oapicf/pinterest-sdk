#' Create a new CreativeAssetsProcessingRecord
#'
#' @description
#' Object describing an item processing record
#'
#' @docType class
#' @title CreativeAssetsProcessingRecord
#' @description CreativeAssetsProcessingRecord Class
#' @format An \code{R6Class} generator object
#' @field creative_assets_id The catalog creative assets id in the merchant namespace character [optional]
#' @field errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. list(\link{ItemValidationEvent}) [optional]
#' @field warnings Array with the validation warnings for the item processing record list(\link{ItemValidationEvent}) [optional]
#' @field status  \link{ItemProcessingStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreativeAssetsProcessingRecord <- R6::R6Class(
  "CreativeAssetsProcessingRecord",
  public = list(
    `creative_assets_id` = NULL,
    `errors` = NULL,
    `warnings` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new CreativeAssetsProcessingRecord class.
    #'
    #' @param creative_assets_id The catalog creative assets id in the merchant namespace
    #' @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
    #' @param warnings Array with the validation warnings for the item processing record
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`creative_assets_id` = NULL, `errors` = NULL, `warnings` = NULL, `status` = NULL, ...) {
      if (!is.null(`creative_assets_id`)) {
        if (!(is.character(`creative_assets_id`) && length(`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", `creative_assets_id`))
        }
        self$`creative_assets_id` <- `creative_assets_id`
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
    #' @return CreativeAssetsProcessingRecord as a base R list.
    #' @examples
    #' # convert array of CreativeAssetsProcessingRecord (x) to a data frame
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
    #' Convert CreativeAssetsProcessingRecord to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreativeAssetsProcessingRecordObject <- list()
      if (!is.null(self$`creative_assets_id`)) {
        CreativeAssetsProcessingRecordObject[["creative_assets_id"]] <-
          self$`creative_assets_id`
      }
      if (!is.null(self$`errors`)) {
        CreativeAssetsProcessingRecordObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`warnings`)) {
        CreativeAssetsProcessingRecordObject[["warnings"]] <-
          lapply(self$`warnings`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`status`)) {
        CreativeAssetsProcessingRecordObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      return(CreativeAssetsProcessingRecordObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreativeAssetsProcessingRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreativeAssetsProcessingRecord
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`creative_assets_id`)) {
        self$`creative_assets_id` <- this_object$`creative_assets_id`
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreativeAssetsProcessingRecord in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreativeAssetsProcessingRecord
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreativeAssetsProcessingRecord
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`creative_assets_id` <- this_object$`creative_assets_id`
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[ItemValidationEvent]", loadNamespace("openapi"))
      self$`status` <- ItemProcessingStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreativeAssetsProcessingRecord and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreativeAssetsProcessingRecord
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
# CreativeAssetsProcessingRecord$unlock()
#
## Below is an example to define the print function
# CreativeAssetsProcessingRecord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreativeAssetsProcessingRecord$lock()

