#' Create a new FrequencyGoalMetadata
#'
#' @description
#' Frequency target can only be between 2 and 20
#'
#' @docType class
#' @title FrequencyGoalMetadata
#' @description FrequencyGoalMetadata Class
#' @format An \code{R6Class} generator object
#' @field frequency  integer [optional]
#' @field timerange  \link{FrequencyGoalMetadataTimerange} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FrequencyGoalMetadata <- R6::R6Class(
  "FrequencyGoalMetadata",
  public = list(
    `frequency` = NULL,
    `timerange` = NULL,

    #' @description
    #' Initialize a new FrequencyGoalMetadata class.
    #'
    #' @param frequency frequency
    #' @param timerange timerange
    #' @param ... Other optional arguments.
    initialize = function(`frequency` = NULL, `timerange` = NULL, ...) {
      if (!is.null(`frequency`)) {
        if (!(is.numeric(`frequency`) && length(`frequency`) == 1)) {
          stop(paste("Error! Invalid data for `frequency`. Must be an integer:", `frequency`))
        }
        self$`frequency` <- `frequency`
      }
      if (!is.null(`timerange`)) {
        if (!(`timerange` %in% c())) {
          stop(paste("Error! \"", `timerange`, "\" cannot be assigned to `timerange`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`timerange`))
        self$`timerange` <- `timerange`
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
    #' @return FrequencyGoalMetadata as a base R list.
    #' @examples
    #' # convert array of FrequencyGoalMetadata (x) to a data frame
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
    #' Convert FrequencyGoalMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FrequencyGoalMetadataObject <- list()
      if (!is.null(self$`frequency`)) {
        FrequencyGoalMetadataObject[["frequency"]] <-
          self$`frequency`
      }
      if (!is.null(self$`timerange`)) {
        FrequencyGoalMetadataObject[["timerange"]] <-
          self$extractSimpleType(self$`timerange`)
      }
      return(FrequencyGoalMetadataObject)
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
    #' Deserialize JSON string into an instance of FrequencyGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of FrequencyGoalMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`frequency`)) {
        self$`frequency` <- this_object$`frequency`
      }
      if (!is.null(this_object$`timerange`)) {
        `timerange_object` <- FrequencyGoalMetadataTimerange$new()
        `timerange_object`$fromJSON(jsonlite::toJSON(this_object$`timerange`, auto_unbox = TRUE, digits = NA))
        self$`timerange` <- `timerange_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FrequencyGoalMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FrequencyGoalMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of FrequencyGoalMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`frequency` <- this_object$`frequency`
      self$`timerange` <- FrequencyGoalMetadataTimerange$new()$fromJSON(jsonlite::toJSON(this_object$`timerange`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FrequencyGoalMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FrequencyGoalMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`frequency` > 20) {
        return(FALSE)
      }
      if (self$`frequency` < 2) {
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
      if (self$`frequency` > 20) {
        invalid_fields["frequency"] <- "Invalid value for `frequency`, must be smaller than or equal to 20."
      }
      if (self$`frequency` < 2) {
        invalid_fields["frequency"] <- "Invalid value for `frequency`, must be bigger than or equal to 2."
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
# FrequencyGoalMetadata$unlock()
#
## Below is an example to define the print function
# FrequencyGoalMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FrequencyGoalMetadata$lock()

