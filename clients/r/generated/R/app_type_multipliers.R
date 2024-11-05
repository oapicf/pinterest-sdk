#' Create a new AppTypeMultipliers
#'
#' @description
#' This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
#'
#' @docType class
#' @title AppTypeMultipliers
#' @description AppTypeMultipliers Class
#' @format An \code{R6Class} generator object
#' @field APP_TYPE  \link{TargetingSpecAppType} [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AppTypeMultipliers <- R6::R6Class(
  "AppTypeMultipliers",
  inherit = numeric,
  public = list(
    `APP_TYPE` = NULL,
    `_field_list` = c("APP_TYPE"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new AppTypeMultipliers class.
    #'
    #' @param APP_TYPE APP_TYPE
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`APP_TYPE` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`APP_TYPE`)) {
        if (!(`APP_TYPE` %in% c())) {
          stop(paste("Error! \"", `APP_TYPE`, "\" cannot be assigned to `APP_TYPE`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`APP_TYPE`))
        self$`APP_TYPE` <- `APP_TYPE`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AppTypeMultipliers in JSON format
    toJSON = function() {
      AppTypeMultipliersObject <- list()
      if (!is.null(self$`APP_TYPE`)) {
        AppTypeMultipliersObject[["APP_TYPE"]] <-
          self$`APP_TYPE`$toJSON()
      }
      for (key in names(self$additional_properties)) {
        AppTypeMultipliersObject[[key]] <- self$additional_properties[[key]]
      }

      AppTypeMultipliersObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AppTypeMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of AppTypeMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`APP_TYPE`)) {
        `app_type_object` <- TargetingSpecAppType$new()
        `app_type_object`$fromJSON(jsonlite::toJSON(this_object$`APP_TYPE`, auto_unbox = TRUE, digits = NA))
        self$`APP_TYPE` <- `app_type_object`
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
    #' @return AppTypeMultipliers in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`APP_TYPE`)) {
          sprintf(
          '"APP_TYPE":
          %s
          ',
          jsonlite::toJSON(self$`APP_TYPE`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
      json_obj <- jsonlite::fromJSON(json_string)
      for (key in names(self$additional_properties)) {
        json_obj[[key]] <- self$additional_properties[[key]]
      }
      json_string <- as.character(jsonlite::minify(jsonlite::toJSON(json_obj, auto_unbox = TRUE, digits = NA)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AppTypeMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of AppTypeMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`APP_TYPE` <- TargetingSpecAppType$new()$fromJSON(jsonlite::toJSON(this_object$`APP_TYPE`, auto_unbox = TRUE, digits = NA))
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to AppTypeMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AppTypeMultipliers
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
# AppTypeMultipliers$unlock()
#
## Below is an example to define the print function
# AppTypeMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AppTypeMultipliers$lock()

