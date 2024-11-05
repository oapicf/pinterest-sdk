#' Create a new LeadFormArrayResponseItemsInner
#'
#' @description
#' LeadFormArrayResponseItemsInner Class
#'
#' @docType class
#' @title LeadFormArrayResponseItemsInner
#' @description LeadFormArrayResponseItemsInner Class
#' @format An \code{R6Class} generator object
#' @field data  \link{LeadFormResponse} [optional]
#' @field exceptions  list(\link{Exception}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormArrayResponseItemsInner <- R6::R6Class(
  "LeadFormArrayResponseItemsInner",
  public = list(
    `data` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new LeadFormArrayResponseItemsInner class.
    #'
    #' @param data data
    #' @param exceptions exceptions
    #' @param ... Other optional arguments.
    initialize = function(`data` = NULL, `exceptions` = NULL, ...) {
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`exceptions`)) {
        stopifnot(is.vector(`exceptions`), length(`exceptions`) != 0)
        sapply(`exceptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`exceptions` <- `exceptions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormArrayResponseItemsInner in JSON format
    toJSON = function() {
      LeadFormArrayResponseItemsInnerObject <- list()
      if (!is.null(self$`data`)) {
        LeadFormArrayResponseItemsInnerObject[["data"]] <-
          self$`data`$toJSON()
      }
      if (!is.null(self$`exceptions`)) {
        LeadFormArrayResponseItemsInnerObject[["exceptions"]] <-
          lapply(self$`exceptions`, function(x) x$toJSON())
      }
      LeadFormArrayResponseItemsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormArrayResponseItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormArrayResponseItemsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- LeadFormResponse$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[Exception]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormArrayResponseItemsInner in JSON format
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
        if (!is.null(self$`exceptions`)) {
          sprintf(
          '"exceptions":
          [%s]
',
          paste(sapply(self$`exceptions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormArrayResponseItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormArrayResponseItemsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- LeadFormResponse$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[Exception]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadFormArrayResponseItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormArrayResponseItemsInner
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
# LeadFormArrayResponseItemsInner$unlock()
#
## Below is an example to define the print function
# LeadFormArrayResponseItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormArrayResponseItemsInner$lock()

