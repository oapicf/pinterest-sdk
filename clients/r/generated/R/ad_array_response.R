#' Create a new AdArrayResponse
#'
#' @description
#' AdArrayResponse Class
#'
#' @docType class
#' @title AdArrayResponse
#' @description AdArrayResponse Class
#' @format An \code{R6Class} generator object
#' @field items  list(\link{AdArrayResponseElement}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdArrayResponse <- R6::R6Class(
  "AdArrayResponse",
  public = list(
    `items` = NULL,
    #' Initialize a new AdArrayResponse class.
    #'
    #' @description
    #' Initialize a new AdArrayResponse class.
    #'
    #' @param items items
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items` = NULL, ...) {
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdArrayResponse in JSON format
    #' @export
    toJSON = function() {
      AdArrayResponseObject <- list()
      if (!is.null(self$`items`)) {
        AdArrayResponseObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      AdArrayResponseObject
    },
    #' Deserialize JSON string into an instance of AdArrayResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdArrayResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdArrayResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AdArrayResponseElement]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdArrayResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdArrayResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdArrayResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdArrayResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AdArrayResponseElement]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to AdArrayResponse
    #'
    #' @description
    #' Validate JSON input with respect to AdArrayResponse and throw an exception if invalid
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
    #' @return String representation of AdArrayResponse
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
# AdArrayResponse$unlock()
#
## Below is an example to define the print function
# AdArrayResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdArrayResponse$lock()

