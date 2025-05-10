#' Create a new AdArrayResponseElement
#'
#' @description
#' AdArrayResponseElement Class
#'
#' @docType class
#' @title AdArrayResponseElement
#' @description AdArrayResponseElement Class
#' @format An \code{R6Class} generator object
#' @field data  \link{AdResponse} [optional]
#' @field exceptions  \link{Exception} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdArrayResponseElement <- R6::R6Class(
  "AdArrayResponseElement",
  public = list(
    `data` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new AdArrayResponseElement class.
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
        stopifnot(R6::is.R6(`exceptions`))
        self$`exceptions` <- `exceptions`
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
    #' @return AdArrayResponseElement as a base R list.
    #' @examples
    #' # convert array of AdArrayResponseElement (x) to a data frame
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
    #' Convert AdArrayResponseElement to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdArrayResponseElementObject <- list()
      if (!is.null(self$`data`)) {
        AdArrayResponseElementObject[["data"]] <-
          self$`data`$toSimpleType()
      }
      if (!is.null(self$`exceptions`)) {
        AdArrayResponseElementObject[["exceptions"]] <-
          self$`exceptions`$toSimpleType()
      }
      return(AdArrayResponseElementObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdArrayResponseElement
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdArrayResponseElement
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- AdResponse$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`exceptions`)) {
        `exceptions_object` <- Exception$new()
        `exceptions_object`$fromJSON(jsonlite::toJSON(this_object$`exceptions`, auto_unbox = TRUE, digits = NA))
        self$`exceptions` <- `exceptions_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdArrayResponseElement in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdArrayResponseElement
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdArrayResponseElement
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- AdResponse$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- Exception$new()$fromJSON(jsonlite::toJSON(this_object$`exceptions`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdArrayResponseElement and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdArrayResponseElement
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
# AdArrayResponseElement$unlock()
#
## Below is an example to define the print function
# AdArrayResponseElement$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdArrayResponseElement$lock()

