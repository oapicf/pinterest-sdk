#' Create a new AdsAnalyticsResponseInner
#'
#' @description
#' AdsAnalyticsResponseInner Class
#'
#' @docType class
#' @title AdsAnalyticsResponseInner
#' @description AdsAnalyticsResponseInner Class
#' @format An \code{R6Class} generator object
#' @field AD_ID The ID of the ad that this metrics belongs to. character
#' @field DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsResponseInner <- R6::R6Class(
  "AdsAnalyticsResponseInner",
  inherit = null<String, AnyType>,
  public = list(
    `AD_ID` = NULL,
    `DATE` = NULL,
    `_field_list` = c("AD_ID", "DATE"),
    `additional_properties` = list(),
    #' Initialize a new AdsAnalyticsResponseInner class.
    #'
    #' @description
    #' Initialize a new AdsAnalyticsResponseInner class.
    #'
    #' @param AD_ID The ID of the ad that this metrics belongs to.
    #' @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`AD_ID`, `DATE` = NULL, additional_properties = NULL, ...) {
      if (!missing(`AD_ID`)) {
        if (!(is.character(`AD_ID`) && length(`AD_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AD_ID`. Must be a string:", `AD_ID`))
        }
        self$`AD_ID` <- `AD_ID`
      }
      if (!is.null(`DATE`)) {
        if (!is.character(`DATE`)) {
          stop(paste("Error! Invalid data for `DATE`. Must be a string:", `DATE`))
        }
        self$`DATE` <- `DATE`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsResponseInner in JSON format
    #' @export
    toJSON = function() {
      AdsAnalyticsResponseInnerObject <- list()
      if (!is.null(self$`AD_ID`)) {
        AdsAnalyticsResponseInnerObject[["AD_ID"]] <-
          self$`AD_ID`
      }
      if (!is.null(self$`DATE`)) {
        AdsAnalyticsResponseInnerObject[["DATE"]] <-
          self$`DATE`
      }
      for (key in names(self$additional_properties)) {
        AdsAnalyticsResponseInnerObject[[key]] <- self$additional_properties[[key]]
      }

      AdsAnalyticsResponseInnerObject
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsResponseInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsResponseInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AD_ID`)) {
        self$`AD_ID` <- this_object$`AD_ID`
      }
      if (!is.null(this_object$`DATE`)) {
        self$`DATE` <- this_object$`DATE`
      }
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsResponseInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`AD_ID`)) {
          sprintf(
          '"AD_ID":
            "%s"
                    ',
          self$`AD_ID`
          )
        },
        if (!is.null(self$`DATE`)) {
          sprintf(
          '"DATE":
            "%s"
                    ',
          self$`DATE`
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
    #' Deserialize JSON string into an instance of AdsAnalyticsResponseInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsResponseInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AD_ID` <- this_object$`AD_ID`
      self$`DATE` <- this_object$`DATE`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },
    #' Validate JSON input with respect to AdsAnalyticsResponseInner
    #'
    #' @description
    #' Validate JSON input with respect to AdsAnalyticsResponseInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `AD_ID`
      if (!is.null(input_json$`AD_ID`)) {
        if (!(is.character(input_json$`AD_ID`) && length(input_json$`AD_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AD_ID`. Must be a string:", input_json$`AD_ID`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsResponseInner: the required field `AD_ID` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsAnalyticsResponseInner
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `AD_ID` is null
      if (is.null(self$`AD_ID`)) {
        return(FALSE)
      }

      if (!str_detect(self$`AD_ID`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `AD_ID` is null
      if (is.null(self$`AD_ID`)) {
        invalid_fields["AD_ID"] <- "Non-nullable required field `AD_ID` cannot be null."
      }

      if (!str_detect(self$`AD_ID`, "^\\d+$")) {
        invalid_fields["AD_ID"] <- "Invalid value for `AD_ID`, must conform to the pattern ^\\d+$."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AdsAnalyticsResponseInner$unlock()
#
## Below is an example to define the print function
# AdsAnalyticsResponseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsAnalyticsResponseInner$lock()

