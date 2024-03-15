#' Create a new BulkUpsertRequest
#'
#' @description
#' Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
#'
#' @docType class
#' @title BulkUpsertRequest
#' @description BulkUpsertRequest Class
#' @format An \code{R6Class} generator object
#' @field create  \link{BulkUpsertRequestCreate} [optional]
#' @field update  \link{BulkUpsertRequestUpdate} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkUpsertRequest <- R6::R6Class(
  "BulkUpsertRequest",
  public = list(
    `create` = NULL,
    `update` = NULL,
    #' Initialize a new BulkUpsertRequest class.
    #'
    #' @description
    #' Initialize a new BulkUpsertRequest class.
    #'
    #' @param create create
    #' @param update update
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`create` = NULL, `update` = NULL, ...) {
      if (!is.null(`create`)) {
        stopifnot(R6::is.R6(`create`))
        self$`create` <- `create`
      }
      if (!is.null(`update`)) {
        stopifnot(R6::is.R6(`update`))
        self$`update` <- `update`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertRequest in JSON format
    #' @export
    toJSON = function() {
      BulkUpsertRequestObject <- list()
      if (!is.null(self$`create`)) {
        BulkUpsertRequestObject[["create"]] <-
          self$`create`$toJSON()
      }
      if (!is.null(self$`update`)) {
        BulkUpsertRequestObject[["update"]] <-
          self$`update`$toJSON()
      }
      BulkUpsertRequestObject
    },
    #' Deserialize JSON string into an instance of BulkUpsertRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`create`)) {
        `create_object` <- BulkUpsertRequestCreate$new()
        `create_object`$fromJSON(jsonlite::toJSON(this_object$`create`, auto_unbox = TRUE, digits = NA))
        self$`create` <- `create_object`
      }
      if (!is.null(this_object$`update`)) {
        `update_object` <- BulkUpsertRequestUpdate$new()
        `update_object`$fromJSON(jsonlite::toJSON(this_object$`update`, auto_unbox = TRUE, digits = NA))
        self$`update` <- `update_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BulkUpsertRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`create`)) {
          sprintf(
          '"create":
          %s
          ',
          jsonlite::toJSON(self$`create`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`update`)) {
          sprintf(
          '"update":
          %s
          ',
          jsonlite::toJSON(self$`update`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BulkUpsertRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`create` <- BulkUpsertRequestCreate$new()$fromJSON(jsonlite::toJSON(this_object$`create`, auto_unbox = TRUE, digits = NA))
      self$`update` <- BulkUpsertRequestUpdate$new()$fromJSON(jsonlite::toJSON(this_object$`update`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to BulkUpsertRequest
    #'
    #' @description
    #' Validate JSON input with respect to BulkUpsertRequest and throw an exception if invalid
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
    #' @return String representation of BulkUpsertRequest
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
# BulkUpsertRequest$unlock()
#
## Below is an example to define the print function
# BulkUpsertRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertRequest$lock()

