#' Create a new OrderLineError
#'
#' @description
#' OrderLineError Class
#'
#' @docType class
#' @title OrderLineError
#' @description OrderLineError Class
#' @format An \code{R6Class} generator object
#' @field data  \link{OrderLine} [optional]
#' @field error_messages  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLineError <- R6::R6Class(
  "OrderLineError",
  public = list(
    `data` = NULL,
    `error_messages` = NULL,
    #' Initialize a new OrderLineError class.
    #'
    #' @description
    #' Initialize a new OrderLineError class.
    #'
    #' @param data data
    #' @param error_messages error_messages
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`data` = NULL, `error_messages` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`error_messages`)) {
        stopifnot(is.vector(`error_messages`), length(`error_messages`) != 0)
        sapply(`error_messages`, function(x) stopifnot(is.character(x)))
        self$`error_messages` <- `error_messages`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderLineError in JSON format
    #' @export
    toJSON = function() {
      OrderLineErrorObject <- list()
      if (!is.null(self$`data`)) {
        OrderLineErrorObject[["data"]] <-
          self$`data`$toJSON()
      }
      if (!is.null(self$`error_messages`)) {
        OrderLineErrorObject[["error_messages"]] <-
          self$`error_messages`
      }
      OrderLineErrorObject
    },
    #' Deserialize JSON string into an instance of OrderLineError
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLineError
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineError
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- OrderLine$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`error_messages`)) {
        self$`error_messages` <- ApiClient$new()$deserializeObj(this_object$`error_messages`, "array[character]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderLineError in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`error_messages`)) {
          sprintf(
          '"error_messages":
             [%s]
          ',
          paste(unlist(lapply(self$`error_messages`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderLineError
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLineError
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLineError
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- OrderLine$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`error_messages` <- ApiClient$new()$deserializeObj(this_object$`error_messages`, "array[character]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to OrderLineError
    #'
    #' @description
    #' Validate JSON input with respect to OrderLineError and throw an exception if invalid
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
    #' @return String representation of OrderLineError
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
# OrderLineError$unlock()
#
## Below is an example to define the print function
# OrderLineError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLineError$lock()

