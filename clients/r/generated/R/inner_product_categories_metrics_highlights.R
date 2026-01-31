#' Create a new InnerProductCategoriesMetricsHighlights
#'
#' @description
#' InnerProductCategoriesMetricsHighlights Class
#'
#' @docType class
#' @title InnerProductCategoriesMetricsHighlights
#' @description InnerProductCategoriesMetricsHighlights Class
#' @format An \code{R6Class} generator object
#' @field pct_change_mom Month-over-month percentage change numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InnerProductCategoriesMetricsHighlights <- R6::R6Class(
  "InnerProductCategoriesMetricsHighlights",
  public = list(
    `pct_change_mom` = NULL,

    #' @description
    #' Initialize a new InnerProductCategoriesMetricsHighlights class.
    #'
    #' @param pct_change_mom Month-over-month percentage change
    #' @param ... Other optional arguments.
    initialize = function(`pct_change_mom`, ...) {
      if (!missing(`pct_change_mom`)) {
        self$`pct_change_mom` <- `pct_change_mom`
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
    #' @return InnerProductCategoriesMetricsHighlights as a base R list.
    #' @examples
    #' # convert array of InnerProductCategoriesMetricsHighlights (x) to a data frame
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
    #' Convert InnerProductCategoriesMetricsHighlights to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InnerProductCategoriesMetricsHighlightsObject <- list()
      if (!is.null(self$`pct_change_mom`)) {
        InnerProductCategoriesMetricsHighlightsObject[["pct_change_mom"]] <-
          self$`pct_change_mom`
      }
      return(InnerProductCategoriesMetricsHighlightsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InnerProductCategoriesMetricsHighlights
    #'
    #' @param input_json the JSON input
    #' @return the instance of InnerProductCategoriesMetricsHighlights
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pct_change_mom`)) {
        self$`pct_change_mom` <- this_object$`pct_change_mom`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InnerProductCategoriesMetricsHighlights in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InnerProductCategoriesMetricsHighlights
    #'
    #' @param input_json the JSON input
    #' @return the instance of InnerProductCategoriesMetricsHighlights
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pct_change_mom` <- this_object$`pct_change_mom`
      self
    },

    #' @description
    #' Validate JSON input with respect to InnerProductCategoriesMetricsHighlights and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `pct_change_mom`
      if (!is.null(input_json$`pct_change_mom`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for InnerProductCategoriesMetricsHighlights: the required field `pct_change_mom` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InnerProductCategoriesMetricsHighlights
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `pct_change_mom` is null
      if (is.null(self$`pct_change_mom`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `pct_change_mom` is null
      if (is.null(self$`pct_change_mom`)) {
        invalid_fields["pct_change_mom"] <- "Non-nullable required field `pct_change_mom` cannot be null."
      }

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
# InnerProductCategoriesMetricsHighlights$unlock()
#
## Below is an example to define the print function
# InnerProductCategoriesMetricsHighlights$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InnerProductCategoriesMetricsHighlights$lock()

