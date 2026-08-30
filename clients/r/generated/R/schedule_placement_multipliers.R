#' Create a new SchedulePlacementMultipliers
#'
#' @description
#' This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
#'
#' @docType class
#' @title SchedulePlacementMultipliers
#' @description SchedulePlacementMultipliers Class
#' @format An \code{R6Class} generator object
#' @field browse Browse (home-feed and related surfaces) numeric [optional]
#' @field related_pins Related-Pins placement numeric [optional]
#' @field search Search placement numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SchedulePlacementMultipliers <- R6::R6Class(
  "SchedulePlacementMultipliers",
  public = list(
    `browse` = NULL,
    `related_pins` = NULL,
    `search` = NULL,

    #' @description
    #' Initialize a new SchedulePlacementMultipliers class.
    #'
    #' @param browse Browse (home-feed and related surfaces)
    #' @param related_pins Related-Pins placement
    #' @param search Search placement
    #' @param ... Other optional arguments.
    initialize = function(`browse` = NULL, `related_pins` = NULL, `search` = NULL, ...) {
      if (!is.null(`browse`)) {
        if (!(is.numeric(`browse`) && length(`browse`) == 1)) {
          stop(paste("Error! Invalid data for `browse`. Must be a number:", `browse`))
        }
        self$`browse` <- `browse`
      }
      if (!is.null(`related_pins`)) {
        if (!(is.numeric(`related_pins`) && length(`related_pins`) == 1)) {
          stop(paste("Error! Invalid data for `related_pins`. Must be a number:", `related_pins`))
        }
        self$`related_pins` <- `related_pins`
      }
      if (!is.null(`search`)) {
        if (!(is.numeric(`search`) && length(`search`) == 1)) {
          stop(paste("Error! Invalid data for `search`. Must be a number:", `search`))
        }
        self$`search` <- `search`
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
    #' @return SchedulePlacementMultipliers as a base R list.
    #' @examples
    #' # convert array of SchedulePlacementMultipliers (x) to a data frame
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
    #' Convert SchedulePlacementMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SchedulePlacementMultipliersObject <- list()
      if (!is.null(self$`browse`)) {
        SchedulePlacementMultipliersObject[["browse"]] <-
          self$`browse`
      }
      if (!is.null(self$`related_pins`)) {
        SchedulePlacementMultipliersObject[["related_pins"]] <-
          self$`related_pins`
      }
      if (!is.null(self$`search`)) {
        SchedulePlacementMultipliersObject[["search"]] <-
          self$`search`
      }
      return(SchedulePlacementMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SchedulePlacementMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of SchedulePlacementMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`browse`)) {
        self$`browse` <- this_object$`browse`
      }
      if (!is.null(this_object$`related_pins`)) {
        self$`related_pins` <- this_object$`related_pins`
      }
      if (!is.null(this_object$`search`)) {
        self$`search` <- this_object$`search`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SchedulePlacementMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SchedulePlacementMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of SchedulePlacementMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`browse` <- this_object$`browse`
      self$`related_pins` <- this_object$`related_pins`
      self$`search` <- this_object$`search`
      self
    },

    #' @description
    #' Validate JSON input with respect to SchedulePlacementMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SchedulePlacementMultipliers
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
# SchedulePlacementMultipliers$unlock()
#
## Below is an example to define the print function
# SchedulePlacementMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SchedulePlacementMultipliers$lock()

