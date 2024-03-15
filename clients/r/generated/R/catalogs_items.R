#' Create a new CatalogsItems
#'
#' @description
#' Response object of catalogs items
#'
#' @docType class
#' @title CatalogsItems
#' @description CatalogsItems Class
#' @format An \code{R6Class} generator object
#' @field items Array with catalogs items list(\link{ItemResponse}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItems <- R6::R6Class(
  "CatalogsItems",
  public = list(
    `items` = NULL,
    #' Initialize a new CatalogsItems class.
    #'
    #' @description
    #' Initialize a new CatalogsItems class.
    #'
    #' @param items Array with catalogs items
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
    #' @return CatalogsItems in JSON format
    #' @export
    toJSON = function() {
      CatalogsItemsObject <- list()
      if (!is.null(self$`items`)) {
        CatalogsItemsObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      CatalogsItemsObject
    },
    #' Deserialize JSON string into an instance of CatalogsItems
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItems
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemResponse]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItems in JSON format
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
    #' Deserialize JSON string into an instance of CatalogsItems
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItems
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemResponse]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsItems
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsItems and throw an exception if invalid
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
    #' @return String representation of CatalogsItems
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
# CatalogsItems$unlock()
#
## Below is an example to define the print function
# CatalogsItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItems$lock()

