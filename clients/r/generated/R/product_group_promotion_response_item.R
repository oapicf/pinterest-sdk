#' Create a new ProductGroupPromotionResponseItem
#'
#' @description
#' ProductGroupPromotionResponseItem Class
#'
#' @docType class
#' @title ProductGroupPromotionResponseItem
#' @description ProductGroupPromotionResponseItem Class
#' @format An \code{R6Class} generator object
#' @field data  \link{ProductGroupPromotion} [optional]
#' @field exceptions  list(\link{Exception}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductGroupPromotionResponseItem <- R6::R6Class(
  "ProductGroupPromotionResponseItem",
  public = list(
    `data` = NULL,
    `exceptions` = NULL,
    #' Initialize a new ProductGroupPromotionResponseItem class.
    #'
    #' @description
    #' Initialize a new ProductGroupPromotionResponseItem class.
    #'
    #' @param data data
    #' @param exceptions exceptions
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ProductGroupPromotionResponseItem in JSON format
    #' @export
    toJSON = function() {
      ProductGroupPromotionResponseItemObject <- list()
      if (!is.null(self$`data`)) {
        ProductGroupPromotionResponseItemObject[["data"]] <-
          self$`data`$toJSON()
      }
      if (!is.null(self$`exceptions`)) {
        ProductGroupPromotionResponseItemObject[["exceptions"]] <-
          lapply(self$`exceptions`, function(x) x$toJSON())
      }
      ProductGroupPromotionResponseItemObject
    },
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionResponseItem
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        `data_object` <- ProductGroupPromotion$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[Exception]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ProductGroupPromotionResponseItem in JSON format
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
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionResponseItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionResponseItem
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ProductGroupPromotion$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[Exception]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to ProductGroupPromotionResponseItem
    #'
    #' @description
    #' Validate JSON input with respect to ProductGroupPromotionResponseItem and throw an exception if invalid
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
    #' @return String representation of ProductGroupPromotionResponseItem
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
# ProductGroupPromotionResponseItem$unlock()
#
## Below is an example to define the print function
# ProductGroupPromotionResponseItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductGroupPromotionResponseItem$lock()

