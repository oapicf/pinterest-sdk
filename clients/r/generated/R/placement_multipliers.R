#' Create a new PlacementMultipliers
#'
#' @description
#' This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
#'
#' @docType class
#' @title PlacementMultipliers
#' @description PlacementMultipliers Class
#' @format An \code{R6Class} generator object
#' @field PLACEMENT  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PlacementMultipliers <- R6::R6Class(
  "PlacementMultipliers",
  inherit = numeric,
  public = list(
    `PLACEMENT` = NULL,
    `_field_list` = c("PLACEMENT"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new PlacementMultipliers class.
    #'
    #' @param PLACEMENT PLACEMENT
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`PLACEMENT` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`PLACEMENT`)) {
        if (!(`PLACEMENT` %in% c("SEARCH", "BROWSE"))) {
          stop(paste("Error! \"", `PLACEMENT`, "\" cannot be assigned to `PLACEMENT`. Must be \"SEARCH\", \"BROWSE\".", sep = ""))
        }
        if (!(is.character(`PLACEMENT`) && length(`PLACEMENT`) == 1)) {
          stop(paste("Error! Invalid data for `PLACEMENT`. Must be a string:", `PLACEMENT`))
        }
        self$`PLACEMENT` <- `PLACEMENT`
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
    #' @return PlacementMultipliers in JSON format
    toJSON = function() {
      PlacementMultipliersObject <- list()
      if (!is.null(self$`PLACEMENT`)) {
        PlacementMultipliersObject[["PLACEMENT"]] <-
          self$`PLACEMENT`
      }
      for (key in names(self$additional_properties)) {
        PlacementMultipliersObject[[key]] <- self$additional_properties[[key]]
      }

      PlacementMultipliersObject
    },

    #' @description
    #' Deserialize JSON string into an instance of PlacementMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of PlacementMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PLACEMENT`)) {
        if (!is.null(this_object$`PLACEMENT`) && !(this_object$`PLACEMENT` %in% c("SEARCH", "BROWSE"))) {
          stop(paste("Error! \"", this_object$`PLACEMENT`, "\" cannot be assigned to `PLACEMENT`. Must be \"SEARCH\", \"BROWSE\".", sep = ""))
        }
        self$`PLACEMENT` <- this_object$`PLACEMENT`
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
    #' @return PlacementMultipliers in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`PLACEMENT`)) {
          sprintf(
          '"PLACEMENT":
            "%s"
                    ',
          self$`PLACEMENT`
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
    #' Deserialize JSON string into an instance of PlacementMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of PlacementMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`PLACEMENT`) && !(this_object$`PLACEMENT` %in% c("SEARCH", "BROWSE"))) {
        stop(paste("Error! \"", this_object$`PLACEMENT`, "\" cannot be assigned to `PLACEMENT`. Must be \"SEARCH\", \"BROWSE\".", sep = ""))
      }
      self$`PLACEMENT` <- this_object$`PLACEMENT`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to PlacementMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PlacementMultipliers
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
# PlacementMultipliers$unlock()
#
## Below is an example to define the print function
# PlacementMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PlacementMultipliers$lock()

