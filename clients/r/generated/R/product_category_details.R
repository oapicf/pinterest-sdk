#' Create a new ProductCategoryDetails
#'
#' @description
#' Product category details
#'
#' @docType class
#' @title ProductCategoryDetails
#' @description ProductCategoryDetails Class
#' @format An \code{R6Class} generator object
#' @field demographics  \link{ProductCategoriesDemographic} [optional]
#' @field has_prediction Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response. character
#' @field metrics_highlights  \link{ProductCategoriesMetricsHighlights} [optional]
#' @field predicted_time_series A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07. named list(numeric) [optional]
#' @field product_category  \link{ProductCategoryEnum}
#' @field related_searches Related search terms for this product category list(character) [optional]
#' @field time_series Time series data showing trend values over time, indexed between 0 and 100 named list(numeric) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductCategoryDetails <- R6::R6Class(
  "ProductCategoryDetails",
  public = list(
    `demographics` = NULL,
    `has_prediction` = NULL,
    `metrics_highlights` = NULL,
    `predicted_time_series` = NULL,
    `product_category` = NULL,
    `related_searches` = NULL,
    `time_series` = NULL,

    #' @description
    #' Initialize a new ProductCategoryDetails class.
    #'
    #' @param has_prediction Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
    #' @param product_category product_category
    #' @param demographics demographics
    #' @param metrics_highlights metrics_highlights
    #' @param predicted_time_series A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
    #' @param related_searches Related search terms for this product category
    #' @param time_series Time series data showing trend values over time, indexed between 0 and 100
    #' @param ... Other optional arguments.
    initialize = function(`has_prediction`, `product_category`, `demographics` = NULL, `metrics_highlights` = NULL, `predicted_time_series` = NULL, `related_searches` = NULL, `time_series` = NULL, ...) {
      if (!missing(`has_prediction`)) {
        if (!(is.logical(`has_prediction`) && length(`has_prediction`) == 1)) {
          stop(paste("Error! Invalid data for `has_prediction`. Must be a boolean:", `has_prediction`))
        }
        self$`has_prediction` <- `has_prediction`
      }
      if (!missing(`product_category`)) {
        if (!(`product_category` %in% c())) {
          stop(paste("Error! \"", `product_category`, "\" cannot be assigned to `product_category`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`product_category`))
        self$`product_category` <- `product_category`
      }
      if (!is.null(`demographics`)) {
        stopifnot(R6::is.R6(`demographics`))
        self$`demographics` <- `demographics`
      }
      if (!is.null(`metrics_highlights`)) {
        stopifnot(R6::is.R6(`metrics_highlights`))
        self$`metrics_highlights` <- `metrics_highlights`
      }
      if (!is.null(`predicted_time_series`)) {
        stopifnot(is.vector(`predicted_time_series`), length(`predicted_time_series`) != 0)
        sapply(`predicted_time_series`, function(x) stopifnot(is.character(x)))
        self$`predicted_time_series` <- `predicted_time_series`
      }
      if (!is.null(`related_searches`)) {
        stopifnot(is.vector(`related_searches`), length(`related_searches`) != 0)
        sapply(`related_searches`, function(x) stopifnot(is.character(x)))
        self$`related_searches` <- `related_searches`
      }
      if (!is.null(`time_series`)) {
        stopifnot(is.vector(`time_series`), length(`time_series`) != 0)
        sapply(`time_series`, function(x) stopifnot(is.character(x)))
        self$`time_series` <- `time_series`
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
    #' @return ProductCategoryDetails as a base R list.
    #' @examples
    #' # convert array of ProductCategoryDetails (x) to a data frame
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
    #' Convert ProductCategoryDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductCategoryDetailsObject <- list()
      if (!is.null(self$`demographics`)) {
        ProductCategoryDetailsObject[["demographics"]] <-
          self$`demographics`$toSimpleType()
      }
      if (!is.null(self$`has_prediction`)) {
        ProductCategoryDetailsObject[["has_prediction"]] <-
          self$`has_prediction`
      }
      if (!is.null(self$`metrics_highlights`)) {
        ProductCategoryDetailsObject[["metrics_highlights"]] <-
          self$`metrics_highlights`$toSimpleType()
      }
      if (!is.null(self$`predicted_time_series`)) {
        ProductCategoryDetailsObject[["predicted_time_series"]] <-
          self$`predicted_time_series`
      }
      if (!is.null(self$`product_category`)) {
        ProductCategoryDetailsObject[["product_category"]] <-
          self$`product_category`$toSimpleType()
      }
      if (!is.null(self$`related_searches`)) {
        ProductCategoryDetailsObject[["related_searches"]] <-
          self$`related_searches`
      }
      if (!is.null(self$`time_series`)) {
        ProductCategoryDetailsObject[["time_series"]] <-
          self$`time_series`
      }
      return(ProductCategoryDetailsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductCategoryDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductCategoryDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`demographics`)) {
        `demographics_object` <- ProductCategoriesDemographic$new()
        `demographics_object`$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
        self$`demographics` <- `demographics_object`
      }
      if (!is.null(this_object$`has_prediction`)) {
        self$`has_prediction` <- this_object$`has_prediction`
      }
      if (!is.null(this_object$`metrics_highlights`)) {
        `metrics_highlights_object` <- ProductCategoriesMetricsHighlights$new()
        `metrics_highlights_object`$fromJSON(jsonlite::toJSON(this_object$`metrics_highlights`, auto_unbox = TRUE, digits = NA))
        self$`metrics_highlights` <- `metrics_highlights_object`
      }
      if (!is.null(this_object$`predicted_time_series`)) {
        self$`predicted_time_series` <- ApiClient$new()$deserializeObj(this_object$`predicted_time_series`, "map(numeric)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_category`)) {
        `product_category_object` <- ProductCategoryEnum$new()
        `product_category_object`$fromJSON(jsonlite::toJSON(this_object$`product_category`, auto_unbox = TRUE, digits = NA))
        self$`product_category` <- `product_category_object`
      }
      if (!is.null(this_object$`related_searches`)) {
        self$`related_searches` <- ApiClient$new()$deserializeObj(this_object$`related_searches`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`time_series`)) {
        self$`time_series` <- ApiClient$new()$deserializeObj(this_object$`time_series`, "map(numeric)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductCategoryDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductCategoryDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductCategoryDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`demographics` <- ProductCategoriesDemographic$new()$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
      self$`has_prediction` <- this_object$`has_prediction`
      self$`metrics_highlights` <- ProductCategoriesMetricsHighlights$new()$fromJSON(jsonlite::toJSON(this_object$`metrics_highlights`, auto_unbox = TRUE, digits = NA))
      self$`predicted_time_series` <- ApiClient$new()$deserializeObj(this_object$`predicted_time_series`, "map(numeric)", loadNamespace("openapi"))
      self$`product_category` <- ProductCategoryEnum$new()$fromJSON(jsonlite::toJSON(this_object$`product_category`, auto_unbox = TRUE, digits = NA))
      self$`related_searches` <- ApiClient$new()$deserializeObj(this_object$`related_searches`, "array[character]", loadNamespace("openapi"))
      self$`time_series` <- ApiClient$new()$deserializeObj(this_object$`time_series`, "map(numeric)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductCategoryDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `has_prediction`
      if (!is.null(input_json$`has_prediction`)) {
        if (!(is.logical(input_json$`has_prediction`) && length(input_json$`has_prediction`) == 1)) {
          stop(paste("Error! Invalid data for `has_prediction`. Must be a boolean:", input_json$`has_prediction`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductCategoryDetails: the required field `has_prediction` is missing."))
      }
      # check the required field `product_category`
      if (!is.null(input_json$`product_category`)) {
        stopifnot(R6::is.R6(input_json$`product_category`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductCategoryDetails: the required field `product_category` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductCategoryDetails
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `has_prediction` is null
      if (is.null(self$`has_prediction`)) {
        return(FALSE)
      }

      # check if the required `product_category` is null
      if (is.null(self$`product_category`)) {
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
      # check if the required `has_prediction` is null
      if (is.null(self$`has_prediction`)) {
        invalid_fields["has_prediction"] <- "Non-nullable required field `has_prediction` cannot be null."
      }

      # check if the required `product_category` is null
      if (is.null(self$`product_category`)) {
        invalid_fields["product_category"] <- "Non-nullable required field `product_category` cannot be null."
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
# ProductCategoryDetails$unlock()
#
## Below is an example to define the print function
# ProductCategoryDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductCategoryDetails$lock()

