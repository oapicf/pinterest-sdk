#' Create a new ProductGroupPromotionResponseItem
#'
#' @description
#' ProductGroupPromotionResponseItem Class
#'
#' @docType class
#' @title ProductGroupPromotionResponseItem
#' @description ProductGroupPromotionResponseItem Class
#' @format An \code{R6Class} generator object
#' @field data  \link{ProductGroupPromotionResponseElement} [optional]
#' @field exceptions  list(\link{Exception}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductGroupPromotionResponseItem <- R6::R6Class(
  "ProductGroupPromotionResponseItem",
  public = list(
    `data` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new ProductGroupPromotionResponseItem class.
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
    #' @return ProductGroupPromotionResponseItem as a base R list.
    #' @examples
    #' # convert array of ProductGroupPromotionResponseItem (x) to a data frame
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
    #' Convert ProductGroupPromotionResponseItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductGroupPromotionResponseItemObject <- list()
      if (!is.null(self$`data`)) {
        ProductGroupPromotionResponseItemObject[["data"]] <-
          self$`data`$toSimpleType()
      }
      if (!is.null(self$`exceptions`)) {
        ProductGroupPromotionResponseItemObject[["exceptions"]] <-
          lapply(self$`exceptions`, function(x) x$toSimpleType())
      }
      return(ProductGroupPromotionResponseItemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionResponseItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- ProductGroupPromotionResponseElement$new()
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
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductGroupPromotionResponseItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionResponseItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ProductGroupPromotionResponseElement$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[Exception]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductGroupPromotionResponseItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductGroupPromotionResponseItem
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
# ProductGroupPromotionResponseItem$unlock()
#
## Below is an example to define the print function
# ProductGroupPromotionResponseItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductGroupPromotionResponseItem$lock()

