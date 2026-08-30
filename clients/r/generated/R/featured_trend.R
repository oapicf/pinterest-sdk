#' Create a new FeaturedTrend
#'
#' @description
#' Featured trending topics for a specific interest and market
#'
#' @docType class
#' @title FeaturedTrend
#' @description FeaturedTrend Class
#' @format An \code{R6Class} generator object
#' @field interest The main interest category \link{InterestsEnum}
#' @field market Market code (e.g., 'US', 'UK', etc.) \link{ProductCategoryRegion} [optional]
#' @field trends List of trending topics within this interest category list(\link{TrendingTopic}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeaturedTrend <- R6::R6Class(
  "FeaturedTrend",
  public = list(
    `interest` = NULL,
    `market` = NULL,
    `trends` = NULL,

    #' @description
    #' Initialize a new FeaturedTrend class.
    #'
    #' @param interest The main interest category
    #' @param market Market code (e.g., 'US', 'UK', etc.)
    #' @param trends List of trending topics within this interest category
    #' @param ... Other optional arguments.
    initialize = function(`interest`, `market` = NULL, `trends` = NULL, ...) {
      if (!missing(`interest`)) {
        if (!(`interest` %in% c())) {
          stop(paste("Error! \"", `interest`, "\" cannot be assigned to `interest`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`interest`))
        self$`interest` <- `interest`
      }
      if (!is.null(`market`)) {
        if (!(`market` %in% c())) {
          stop(paste("Error! \"", `market`, "\" cannot be assigned to `market`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`market`))
        self$`market` <- `market`
      }
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
    #' @return FeaturedTrend as a base R list.
    #' @examples
    #' # convert array of FeaturedTrend (x) to a data frame
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
    #' Convert FeaturedTrend to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FeaturedTrendObject <- list()
      if (!is.null(self$`interest`)) {
        FeaturedTrendObject[["interest"]] <-
          self$extractSimpleType(self$`interest`)
      }
      if (!is.null(self$`market`)) {
        FeaturedTrendObject[["market"]] <-
          self$extractSimpleType(self$`market`)
      }
      if (!is.null(self$`trends`)) {
        FeaturedTrendObject[["trends"]] <-
          self$extractSimpleType(self$`trends`)
      }
      return(FeaturedTrendObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of FeaturedTrend
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeaturedTrend
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`interest`)) {
        `interest_object` <- InterestsEnum$new()
        `interest_object`$fromJSON(jsonlite::toJSON(this_object$`interest`, auto_unbox = TRUE, digits = NA))
        self$`interest` <- `interest_object`
      }
      if (!is.null(this_object$`market`)) {
        `market_object` <- ProductCategoryRegion$new()
        `market_object`$fromJSON(jsonlite::toJSON(this_object$`market`, auto_unbox = TRUE, digits = NA))
        self$`market` <- `market_object`
      }
      if (!is.null(this_object$`trends`)) {
        self$`trends` <- ApiClient$new()$deserializeObj(this_object$`trends`, "array[TrendingTopic]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FeaturedTrend in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FeaturedTrend
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeaturedTrend
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`interest` <- InterestsEnum$new()$fromJSON(jsonlite::toJSON(this_object$`interest`, auto_unbox = TRUE, digits = NA))
      self$`market` <- ProductCategoryRegion$new()$fromJSON(jsonlite::toJSON(this_object$`market`, auto_unbox = TRUE, digits = NA))
      self$`trends` <- ApiClient$new()$deserializeObj(this_object$`trends`, "array[TrendingTopic]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to FeaturedTrend and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `interest`
      if (!is.null(input_json$`interest`)) {
        stopifnot(R6::is.R6(input_json$`interest`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FeaturedTrend: the required field `interest` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FeaturedTrend
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `interest` is null
      if (is.null(self$`interest`)) {
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
      # check if the required `interest` is null
      if (is.null(self$`interest`)) {
        invalid_fields["interest"] <- "Non-nullable required field `interest` cannot be null."
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
# FeaturedTrend$unlock()
#
## Below is an example to define the print function
# FeaturedTrend$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeaturedTrend$lock()

