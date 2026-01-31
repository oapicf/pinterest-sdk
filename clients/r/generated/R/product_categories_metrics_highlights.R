#' Create a new ProductCategoriesMetricsHighlights
#'
#' @description
#' Key performance metrics highlights for this product category
#'
#' @docType class
#' @title ProductCategoriesMetricsHighlights
#' @description ProductCategoriesMetricsHighlights Class
#' @format An \code{R6Class} generator object
#' @field engagement Engagement metric value \link{InnerProductCategoriesMetricsHighlights} [optional]
#' @field outbound_clicks Number of outbound clicks \link{InnerProductCategoriesMetricsHighlights} [optional]
#' @field pin_saves Number of pin saves \link{InnerProductCategoriesMetricsHighlights} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductCategoriesMetricsHighlights <- R6::R6Class(
  "ProductCategoriesMetricsHighlights",
  public = list(
    `engagement` = NULL,
    `outbound_clicks` = NULL,
    `pin_saves` = NULL,

    #' @description
    #' Initialize a new ProductCategoriesMetricsHighlights class.
    #'
    #' @param engagement Engagement metric value
    #' @param outbound_clicks Number of outbound clicks
    #' @param pin_saves Number of pin saves
    #' @param ... Other optional arguments.
    initialize = function(`engagement` = NULL, `outbound_clicks` = NULL, `pin_saves` = NULL, ...) {
      if (!is.null(`engagement`)) {
        stopifnot(R6::is.R6(`engagement`))
        self$`engagement` <- `engagement`
      }
      if (!is.null(`outbound_clicks`)) {
        stopifnot(R6::is.R6(`outbound_clicks`))
        self$`outbound_clicks` <- `outbound_clicks`
      }
      if (!is.null(`pin_saves`)) {
        stopifnot(R6::is.R6(`pin_saves`))
        self$`pin_saves` <- `pin_saves`
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
    #' @return ProductCategoriesMetricsHighlights as a base R list.
    #' @examples
    #' # convert array of ProductCategoriesMetricsHighlights (x) to a data frame
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
    #' Convert ProductCategoriesMetricsHighlights to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductCategoriesMetricsHighlightsObject <- list()
      if (!is.null(self$`engagement`)) {
        ProductCategoriesMetricsHighlightsObject[["engagement"]] <-
          self$`engagement`$toSimpleType()
      }
      if (!is.null(self$`outbound_clicks`)) {
        ProductCategoriesMetricsHighlightsObject[["outbound_clicks"]] <-
          self$`outbound_clicks`$toSimpleType()
      }
      if (!is.null(self$`pin_saves`)) {
        ProductCategoriesMetricsHighlightsObject[["pin_saves"]] <-
          self$`pin_saves`$toSimpleType()
      }
      return(ProductCategoriesMetricsHighlightsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductCategoriesMetricsHighlights
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductCategoriesMetricsHighlights
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`engagement`)) {
        `engagement_object` <- InnerProductCategoriesMetricsHighlights$new()
        `engagement_object`$fromJSON(jsonlite::toJSON(this_object$`engagement`, auto_unbox = TRUE, digits = NA))
        self$`engagement` <- `engagement_object`
      }
      if (!is.null(this_object$`outbound_clicks`)) {
        `outbound_clicks_object` <- InnerProductCategoriesMetricsHighlights$new()
        `outbound_clicks_object`$fromJSON(jsonlite::toJSON(this_object$`outbound_clicks`, auto_unbox = TRUE, digits = NA))
        self$`outbound_clicks` <- `outbound_clicks_object`
      }
      if (!is.null(this_object$`pin_saves`)) {
        `pin_saves_object` <- InnerProductCategoriesMetricsHighlights$new()
        `pin_saves_object`$fromJSON(jsonlite::toJSON(this_object$`pin_saves`, auto_unbox = TRUE, digits = NA))
        self$`pin_saves` <- `pin_saves_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductCategoriesMetricsHighlights in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductCategoriesMetricsHighlights
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductCategoriesMetricsHighlights
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`engagement` <- InnerProductCategoriesMetricsHighlights$new()$fromJSON(jsonlite::toJSON(this_object$`engagement`, auto_unbox = TRUE, digits = NA))
      self$`outbound_clicks` <- InnerProductCategoriesMetricsHighlights$new()$fromJSON(jsonlite::toJSON(this_object$`outbound_clicks`, auto_unbox = TRUE, digits = NA))
      self$`pin_saves` <- InnerProductCategoriesMetricsHighlights$new()$fromJSON(jsonlite::toJSON(this_object$`pin_saves`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductCategoriesMetricsHighlights and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductCategoriesMetricsHighlights
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
# ProductCategoriesMetricsHighlights$unlock()
#
## Below is an example to define the print function
# ProductCategoriesMetricsHighlights$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductCategoriesMetricsHighlights$lock()

