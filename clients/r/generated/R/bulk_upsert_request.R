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

    #' @description
    #' Initialize a new BulkUpsertRequest class.
    #'
    #' @param create create
    #' @param update update
    #' @param ... Other optional arguments.
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
    #' @return BulkUpsertRequest as a base R list.
    #' @examples
    #' # convert array of BulkUpsertRequest (x) to a data frame
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
    #' Convert BulkUpsertRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkUpsertRequestObject <- list()
      if (!is.null(self$`create`)) {
        BulkUpsertRequestObject[["create"]] <-
          self$extractSimpleType(self$`create`)
      }
      if (!is.null(self$`update`)) {
        BulkUpsertRequestObject[["update"]] <-
          self$extractSimpleType(self$`update`)
      }
      return(BulkUpsertRequestObject)
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
    #' Deserialize JSON string into an instance of BulkUpsertRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequest
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkUpsertRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`create` <- BulkUpsertRequestCreate$new()$fromJSON(jsonlite::toJSON(this_object$`create`, auto_unbox = TRUE, digits = NA))
      self$`update` <- BulkUpsertRequestUpdate$new()$fromJSON(jsonlite::toJSON(this_object$`update`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkUpsertRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkUpsertRequest
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
# BulkUpsertRequest$unlock()
#
## Below is an example to define the print function
# BulkUpsertRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertRequest$lock()

