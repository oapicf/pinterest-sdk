#' Create a new NullableOptimizationGoalMetadata
#'
#' @description
#' NullableOptimizationGoalMetadata Class
#'
#' @docType class
#' @title NullableOptimizationGoalMetadata
#' @description NullableOptimizationGoalMetadata Class
#' @format An \code{R6Class} generator object
#' @field conversion_tag_v3_goal_metadata  \link{ConversionTagV3GoalMetadata} [optional]
#' @field frequency_goal_metadata  \link{FrequencyGoalMetadata} [optional]
#' @field scrollup_goal_metadata  \link{ScrollupGoalMetadata} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NullableOptimizationGoalMetadata <- R6::R6Class(
  "NullableOptimizationGoalMetadata",
  public = list(
    `conversion_tag_v3_goal_metadata` = NULL,
    `frequency_goal_metadata` = NULL,
    `scrollup_goal_metadata` = NULL,

    #' @description
    #' Initialize a new NullableOptimizationGoalMetadata class.
    #'
    #' @param conversion_tag_v3_goal_metadata conversion_tag_v3_goal_metadata
    #' @param frequency_goal_metadata frequency_goal_metadata
    #' @param scrollup_goal_metadata scrollup_goal_metadata
    #' @param ... Other optional arguments.
    initialize = function(`conversion_tag_v3_goal_metadata` = NULL, `frequency_goal_metadata` = NULL, `scrollup_goal_metadata` = NULL, ...) {
      if (!is.null(`conversion_tag_v3_goal_metadata`)) {
        stopifnot(R6::is.R6(`conversion_tag_v3_goal_metadata`))
        self$`conversion_tag_v3_goal_metadata` <- `conversion_tag_v3_goal_metadata`
      }
      if (!is.null(`frequency_goal_metadata`)) {
        stopifnot(R6::is.R6(`frequency_goal_metadata`))
        self$`frequency_goal_metadata` <- `frequency_goal_metadata`
      }
      if (!is.null(`scrollup_goal_metadata`)) {
        stopifnot(R6::is.R6(`scrollup_goal_metadata`))
        self$`scrollup_goal_metadata` <- `scrollup_goal_metadata`
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
    #' @return NullableOptimizationGoalMetadata as a base R list.
    #' @examples
    #' # convert array of NullableOptimizationGoalMetadata (x) to a data frame
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
    #' Convert NullableOptimizationGoalMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      NullableOptimizationGoalMetadataObject <- list()
      if (!is.null(self$`conversion_tag_v3_goal_metadata`)) {
        NullableOptimizationGoalMetadataObject[["conversion_tag_v3_goal_metadata"]] <-
          self$extractSimpleType(self$`conversion_tag_v3_goal_metadata`)
      }
      if (!is.null(self$`frequency_goal_metadata`)) {
        NullableOptimizationGoalMetadataObject[["frequency_goal_metadata"]] <-
          self$extractSimpleType(self$`frequency_goal_metadata`)
      }
      if (!is.null(self$`scrollup_goal_metadata`)) {
        NullableOptimizationGoalMetadataObject[["scrollup_goal_metadata"]] <-
          self$extractSimpleType(self$`scrollup_goal_metadata`)
      }
      return(NullableOptimizationGoalMetadataObject)
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
    #' Deserialize JSON string into an instance of NullableOptimizationGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of NullableOptimizationGoalMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`conversion_tag_v3_goal_metadata`)) {
        `conversion_tag_v3_goal_metadata_object` <- ConversionTagV3GoalMetadata$new()
        `conversion_tag_v3_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`conversion_tag_v3_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`conversion_tag_v3_goal_metadata` <- `conversion_tag_v3_goal_metadata_object`
      }
      if (!is.null(this_object$`frequency_goal_metadata`)) {
        `frequency_goal_metadata_object` <- FrequencyGoalMetadata$new()
        `frequency_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`frequency_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`frequency_goal_metadata` <- `frequency_goal_metadata_object`
      }
      if (!is.null(this_object$`scrollup_goal_metadata`)) {
        `scrollup_goal_metadata_object` <- ScrollupGoalMetadata$new()
        `scrollup_goal_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`scrollup_goal_metadata`, auto_unbox = TRUE, digits = NA))
        self$`scrollup_goal_metadata` <- `scrollup_goal_metadata_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return NullableOptimizationGoalMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of NullableOptimizationGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of NullableOptimizationGoalMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`conversion_tag_v3_goal_metadata` <- ConversionTagV3GoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`conversion_tag_v3_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`frequency_goal_metadata` <- FrequencyGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`frequency_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self$`scrollup_goal_metadata` <- ScrollupGoalMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`scrollup_goal_metadata`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to NullableOptimizationGoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of NullableOptimizationGoalMetadata
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
# NullableOptimizationGoalMetadata$unlock()
#
## Below is an example to define the print function
# NullableOptimizationGoalMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# NullableOptimizationGoalMetadata$lock()

