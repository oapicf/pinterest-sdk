#' Create a new TrendingKeywordsResponse
#'
#' @description
#' TrendingKeywordsResponse Class
#'
#' @docType class
#' @title TrendingKeywordsResponse
#' @description TrendingKeywordsResponse Class
#' @format An \code{R6Class} generator object
#' @field trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend. list(\link{TrendingKeyword}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeywordsResponse <- R6::R6Class(
  "TrendingKeywordsResponse",
  public = list(
    `trends` = NULL,

    #' @description
    #' Initialize a new TrendingKeywordsResponse class.
    #'
    #' @param trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
    #' @param ... Other optional arguments.
    initialize = function(`trends` = NULL, ...) {
      if (!is.null(`trends`)) {
        stopifnot(is.vector(`trends`), length(`trends`) != 0)
        sapply(`trends`, function(x) stopifnot(R6::is.R6(x)))
        self$`trends` <- `trends`
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
    #' @return TrendingKeywordsResponse as a base R list.
    #' @examples
    #' # convert array of TrendingKeywordsResponse (x) to a data frame
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
    #' Convert TrendingKeywordsResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingKeywordsResponseObject <- list()
      if (!is.null(self$`trends`)) {
        TrendingKeywordsResponseObject[["trends"]] <-
          lapply(self$`trends`, function(x) x$toSimpleType())
      }
      return(TrendingKeywordsResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`trends`)) {
        self$`trends` <- ApiClient$new()$deserializeObj(this_object$`trends`, "array[TrendingKeyword]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TrendingKeywordsResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`trends` <- ApiClient$new()$deserializeObj(this_object$`trends`, "array[TrendingKeyword]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingKeywordsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingKeywordsResponse
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
# TrendingKeywordsResponse$unlock()
#
## Below is an example to define the print function
# TrendingKeywordsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeywordsResponse$lock()

