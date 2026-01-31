#' Create a new PromotionsResponse
#'
#' @description
#' PromotionsResponse Class
#'
#' @docType class
#' @title PromotionsResponse
#' @description PromotionsResponse Class
#' @format An \code{R6Class} generator object
#' @field promotions  list(\link{PromotionArrayElement}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromotionsResponse <- R6::R6Class(
  "PromotionsResponse",
  public = list(
    `promotions` = NULL,

    #' @description
    #' Initialize a new PromotionsResponse class.
    #'
    #' @param promotions promotions
    #' @param ... Other optional arguments.
    initialize = function(`promotions` = NULL, ...) {
      if (!is.null(`promotions`)) {
        stopifnot(is.vector(`promotions`), length(`promotions`) != 0)
        sapply(`promotions`, function(x) stopifnot(R6::is.R6(x)))
        self$`promotions` <- `promotions`
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
    #' @return PromotionsResponse as a base R list.
    #' @examples
    #' # convert array of PromotionsResponse (x) to a data frame
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
    #' Convert PromotionsResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PromotionsResponseObject <- list()
      if (!is.null(self$`promotions`)) {
        PromotionsResponseObject[["promotions"]] <-
          lapply(self$`promotions`, function(x) x$toSimpleType())
      }
      return(PromotionsResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PromotionsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromotionsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`promotions`)) {
        self$`promotions` <- ApiClient$new()$deserializeObj(this_object$`promotions`, "array[PromotionArrayElement]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PromotionsResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PromotionsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromotionsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`promotions` <- ApiClient$new()$deserializeObj(this_object$`promotions`, "array[PromotionArrayElement]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PromotionsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PromotionsResponse
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
# PromotionsResponse$unlock()
#
## Below is an example to define the print function
# PromotionsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromotionsResponse$lock()

