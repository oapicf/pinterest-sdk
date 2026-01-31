#' Create a new TrendingProductCategory
#'
#' @description
#' Trending shopping product category
#'
#' @docType class
#' @title TrendingProductCategory
#' @description TrendingProductCategory Class
#' @format An \code{R6Class} generator object
#' @field engagement_type Engagement type \link{ProductCategoriesEngagementType}
#' @field pct_change_mom Month-over-month change percentage integer
#' @field percent_relative_volume Relative volume percentage integer
#' @field product_category Product Category Name character
#' @field verticals Vertical name associated with the product category list(\link{VerticalProductCategory}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingProductCategory <- R6::R6Class(
  "TrendingProductCategory",
  public = list(
    `engagement_type` = NULL,
    `pct_change_mom` = NULL,
    `percent_relative_volume` = NULL,
    `product_category` = NULL,
    `verticals` = NULL,

    #' @description
    #' Initialize a new TrendingProductCategory class.
    #'
    #' @param engagement_type Engagement type
    #' @param pct_change_mom Month-over-month change percentage
    #' @param percent_relative_volume Relative volume percentage
    #' @param product_category Product Category Name
    #' @param verticals Vertical name associated with the product category
    #' @param ... Other optional arguments.
    initialize = function(`engagement_type`, `pct_change_mom`, `percent_relative_volume`, `product_category`, `verticals` = NULL, ...) {
      if (!missing(`engagement_type`)) {
        if (!(`engagement_type` %in% c())) {
          stop(paste("Error! \"", `engagement_type`, "\" cannot be assigned to `engagement_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`engagement_type`))
        self$`engagement_type` <- `engagement_type`
      }
      if (!missing(`pct_change_mom`)) {
        if (!(is.numeric(`pct_change_mom`) && length(`pct_change_mom`) == 1)) {
          stop(paste("Error! Invalid data for `pct_change_mom`. Must be an integer:", `pct_change_mom`))
        }
        self$`pct_change_mom` <- `pct_change_mom`
      }
      if (!missing(`percent_relative_volume`)) {
        if (!(is.numeric(`percent_relative_volume`) && length(`percent_relative_volume`) == 1)) {
          stop(paste("Error! Invalid data for `percent_relative_volume`. Must be an integer:", `percent_relative_volume`))
        }
        self$`percent_relative_volume` <- `percent_relative_volume`
      }
      if (!missing(`product_category`)) {
        if (!(is.character(`product_category`) && length(`product_category`) == 1)) {
          stop(paste("Error! Invalid data for `product_category`. Must be a string:", `product_category`))
        }
        self$`product_category` <- `product_category`
      }
      if (!is.null(`verticals`)) {
        stopifnot(is.vector(`verticals`), length(`verticals`) != 0)
        sapply(`verticals`, function(x) stopifnot(R6::is.R6(x)))
        self$`verticals` <- `verticals`
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
    #' @return TrendingProductCategory as a base R list.
    #' @examples
    #' # convert array of TrendingProductCategory (x) to a data frame
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
    #' Convert TrendingProductCategory to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingProductCategoryObject <- list()
      if (!is.null(self$`engagement_type`)) {
        TrendingProductCategoryObject[["engagement_type"]] <-
          self$`engagement_type`$toSimpleType()
      }
      if (!is.null(self$`pct_change_mom`)) {
        TrendingProductCategoryObject[["pct_change_mom"]] <-
          self$`pct_change_mom`
      }
      if (!is.null(self$`percent_relative_volume`)) {
        TrendingProductCategoryObject[["percent_relative_volume"]] <-
          self$`percent_relative_volume`
      }
      if (!is.null(self$`product_category`)) {
        TrendingProductCategoryObject[["product_category"]] <-
          self$`product_category`
      }
      if (!is.null(self$`verticals`)) {
        TrendingProductCategoryObject[["verticals"]] <-
          lapply(self$`verticals`, function(x) x$toSimpleType())
      }
      return(TrendingProductCategoryObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingProductCategory
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingProductCategory
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`engagement_type`)) {
        `engagement_type_object` <- ProductCategoriesEngagementType$new()
        `engagement_type_object`$fromJSON(jsonlite::toJSON(this_object$`engagement_type`, auto_unbox = TRUE, digits = NA))
        self$`engagement_type` <- `engagement_type_object`
      }
      if (!is.null(this_object$`pct_change_mom`)) {
        self$`pct_change_mom` <- this_object$`pct_change_mom`
      }
      if (!is.null(this_object$`percent_relative_volume`)) {
        self$`percent_relative_volume` <- this_object$`percent_relative_volume`
      }
      if (!is.null(this_object$`product_category`)) {
        self$`product_category` <- this_object$`product_category`
      }
      if (!is.null(this_object$`verticals`)) {
        self$`verticals` <- ApiClient$new()$deserializeObj(this_object$`verticals`, "array[VerticalProductCategory]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TrendingProductCategory in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingProductCategory
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingProductCategory
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`engagement_type` <- ProductCategoriesEngagementType$new()$fromJSON(jsonlite::toJSON(this_object$`engagement_type`, auto_unbox = TRUE, digits = NA))
      self$`pct_change_mom` <- this_object$`pct_change_mom`
      self$`percent_relative_volume` <- this_object$`percent_relative_volume`
      self$`product_category` <- this_object$`product_category`
      self$`verticals` <- ApiClient$new()$deserializeObj(this_object$`verticals`, "array[VerticalProductCategory]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingProductCategory and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `engagement_type`
      if (!is.null(input_json$`engagement_type`)) {
        stopifnot(R6::is.R6(input_json$`engagement_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingProductCategory: the required field `engagement_type` is missing."))
      }
      # check the required field `pct_change_mom`
      if (!is.null(input_json$`pct_change_mom`)) {
        if (!(is.numeric(input_json$`pct_change_mom`) && length(input_json$`pct_change_mom`) == 1)) {
          stop(paste("Error! Invalid data for `pct_change_mom`. Must be an integer:", input_json$`pct_change_mom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingProductCategory: the required field `pct_change_mom` is missing."))
      }
      # check the required field `percent_relative_volume`
      if (!is.null(input_json$`percent_relative_volume`)) {
        if (!(is.numeric(input_json$`percent_relative_volume`) && length(input_json$`percent_relative_volume`) == 1)) {
          stop(paste("Error! Invalid data for `percent_relative_volume`. Must be an integer:", input_json$`percent_relative_volume`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingProductCategory: the required field `percent_relative_volume` is missing."))
      }
      # check the required field `product_category`
      if (!is.null(input_json$`product_category`)) {
        if (!(is.character(input_json$`product_category`) && length(input_json$`product_category`) == 1)) {
          stop(paste("Error! Invalid data for `product_category`. Must be a string:", input_json$`product_category`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingProductCategory: the required field `product_category` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingProductCategory
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `engagement_type` is null
      if (is.null(self$`engagement_type`)) {
        return(FALSE)
      }

      # check if the required `pct_change_mom` is null
      if (is.null(self$`pct_change_mom`)) {
        return(FALSE)
      }

      # check if the required `percent_relative_volume` is null
      if (is.null(self$`percent_relative_volume`)) {
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
      # check if the required `engagement_type` is null
      if (is.null(self$`engagement_type`)) {
        invalid_fields["engagement_type"] <- "Non-nullable required field `engagement_type` cannot be null."
      }

      # check if the required `pct_change_mom` is null
      if (is.null(self$`pct_change_mom`)) {
        invalid_fields["pct_change_mom"] <- "Non-nullable required field `pct_change_mom` cannot be null."
      }

      # check if the required `percent_relative_volume` is null
      if (is.null(self$`percent_relative_volume`)) {
        invalid_fields["percent_relative_volume"] <- "Non-nullable required field `percent_relative_volume` cannot be null."
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
# TrendingProductCategory$unlock()
#
## Below is an example to define the print function
# TrendingProductCategory$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingProductCategory$lock()

