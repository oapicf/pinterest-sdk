#' Create a new AgeBucketMultipliers
#'
#' @description
#' This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
#'
#' @docType class
#' @title AgeBucketMultipliers
#' @description AgeBucketMultipliers Class
#' @format An \code{R6Class} generator object
#' @field AGE_BUCKET Age bucket identifier. \link{TargetingSpecAgeBucket} [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AgeBucketMultipliers <- R6::R6Class(
  "AgeBucketMultipliers",
  inherit = numeric,
  public = list(
    `AGE_BUCKET` = NULL,
    `_field_list` = c("AGE_BUCKET"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new AgeBucketMultipliers class.
    #'
    #' @param AGE_BUCKET Age bucket identifier.
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`AGE_BUCKET` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`AGE_BUCKET`)) {
        if (!(`AGE_BUCKET` %in% c())) {
          stop(paste("Error! \"", `AGE_BUCKET`, "\" cannot be assigned to `AGE_BUCKET`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`AGE_BUCKET`))
        self$`AGE_BUCKET` <- `AGE_BUCKET`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
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
    #' @return AgeBucketMultipliers as a base R list.
    #' @examples
    #' # convert array of AgeBucketMultipliers (x) to a data frame
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
    #' Convert AgeBucketMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AgeBucketMultipliersObject <- list()
      if (!is.null(self$`AGE_BUCKET`)) {
        AgeBucketMultipliersObject[["AGE_BUCKET"]] <-
          self$extractSimpleType(self$`AGE_BUCKET`)
      }
      for (key in names(self$additional_properties)) {
        AgeBucketMultipliersObject[[key]] <- self$additional_properties[[key]]
      }

      return(AgeBucketMultipliersObject)
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
    #' Deserialize JSON string into an instance of AgeBucketMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of AgeBucketMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AGE_BUCKET`)) {
        `age_bucket_object` <- TargetingSpecAgeBucket$new()
        `age_bucket_object`$fromJSON(jsonlite::toJSON(this_object$`AGE_BUCKET`, auto_unbox = TRUE, digits = NA))
        self$`AGE_BUCKET` <- `age_bucket_object`
      }
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AgeBucketMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AgeBucketMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of AgeBucketMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AGE_BUCKET` <- TargetingSpecAgeBucket$new()$fromJSON(jsonlite::toJSON(this_object$`AGE_BUCKET`, auto_unbox = TRUE, digits = NA))
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to AgeBucketMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AgeBucketMultipliers
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
# AgeBucketMultipliers$unlock()
#
## Below is an example to define the print function
# AgeBucketMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AgeBucketMultipliers$lock()

