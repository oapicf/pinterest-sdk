#' Create a new GenderMultipliers
#'
#' @description
#' This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
#'
#' @docType class
#' @title GenderMultipliers
#' @description GenderMultipliers Class
#' @format An \code{R6Class} generator object
#' @field GENDER Gender identifier. \link{TargetingSpecGender} [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenderMultipliers <- R6::R6Class(
  "GenderMultipliers",
  inherit = numeric,
  public = list(
    `GENDER` = NULL,
    `_field_list` = c("GENDER"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new GenderMultipliers class.
    #'
    #' @param GENDER Gender identifier.
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`GENDER` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`GENDER`)) {
        if (!(`GENDER` %in% c())) {
          stop(paste("Error! \"", `GENDER`, "\" cannot be assigned to `GENDER`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`GENDER`))
        self$`GENDER` <- `GENDER`
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
    #' @return GenderMultipliers as a base R list.
    #' @examples
    #' # convert array of GenderMultipliers (x) to a data frame
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
    #' Convert GenderMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      GenderMultipliersObject <- list()
      if (!is.null(self$`GENDER`)) {
        GenderMultipliersObject[["GENDER"]] <-
          self$extractSimpleType(self$`GENDER`)
      }
      for (key in names(self$additional_properties)) {
        GenderMultipliersObject[[key]] <- self$additional_properties[[key]]
      }

      return(GenderMultipliersObject)
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
    #' Deserialize JSON string into an instance of GenderMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`GENDER`)) {
        `gender_object` <- TargetingSpecGender$new()
        `gender_object`$fromJSON(jsonlite::toJSON(this_object$`GENDER`, auto_unbox = TRUE, digits = NA))
        self$`GENDER` <- `gender_object`
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
    #' @return GenderMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`GENDER` <- TargetingSpecGender$new()$fromJSON(jsonlite::toJSON(this_object$`GENDER`, auto_unbox = TRUE, digits = NA))
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to GenderMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenderMultipliers
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
# GenderMultipliers$unlock()
#
## Below is an example to define the print function
# GenderMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenderMultipliers$lock()

