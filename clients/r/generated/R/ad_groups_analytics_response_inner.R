#' Create a new AdGroupsAnalyticsResponseInner
#'
#' @description
#' AdGroupsAnalyticsResponseInner Class
#'
#' @docType class
#' @title AdGroupsAnalyticsResponseInner
#' @description AdGroupsAnalyticsResponseInner Class
#' @format An \code{R6Class} generator object
#' @field AD_GROUP_ID The ID of the ad group that this metrics belongs to. character
#' @field DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupsAnalyticsResponseInner <- R6::R6Class(
  "AdGroupsAnalyticsResponseInner",
  inherit = AnyType,
  public = list(
    `AD_GROUP_ID` = NULL,
    `DATE` = NULL,
    `_field_list` = c("AD_GROUP_ID", "DATE"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new AdGroupsAnalyticsResponseInner class.
    #'
    #' @param AD_GROUP_ID The ID of the ad group that this metrics belongs to.
    #' @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`AD_GROUP_ID`, `DATE` = NULL, additional_properties = NULL, ...) {
      if (!missing(`AD_GROUP_ID`)) {
        if (!(is.character(`AD_GROUP_ID`) && length(`AD_GROUP_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AD_GROUP_ID`. Must be a string:", `AD_GROUP_ID`))
        }
        self$`AD_GROUP_ID` <- `AD_GROUP_ID`
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

    #' @description
    #' To JSON String
    #'
    #' @return AdGroupsAnalyticsResponseInner in JSON format
    toJSON = function() {
      AdGroupsAnalyticsResponseInnerObject <- list()
      if (!is.null(self$`AD_GROUP_ID`)) {
        AdGroupsAnalyticsResponseInnerObject[["AD_GROUP_ID"]] <-
          self$`AD_GROUP_ID`
      }
      if (!is.null(self$`DATE`)) {
        AdGroupsAnalyticsResponseInnerObject[["DATE"]] <-
          self$`DATE`
      }
      for (key in names(self$additional_properties)) {
        AdGroupsAnalyticsResponseInnerObject[[key]] <- self$additional_properties[[key]]
      }

      AdGroupsAnalyticsResponseInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupsAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupsAnalyticsResponseInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AD_GROUP_ID`)) {
        self$`AD_GROUP_ID` <- this_object$`AD_GROUP_ID`
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

    #' @description
    #' To JSON String
    #'
    #' @return AdGroupsAnalyticsResponseInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`AD_GROUP_ID`)) {
          sprintf(
          '"AD_GROUP_ID":
            "%s"
                    ',
          self$`AD_GROUP_ID`
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

    #' @description
    #' Deserialize JSON string into an instance of AdGroupsAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupsAnalyticsResponseInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AD_GROUP_ID` <- this_object$`AD_GROUP_ID`
      self$`DATE` <- this_object$`DATE`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupsAnalyticsResponseInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `AD_GROUP_ID`
      if (!is.null(input_json$`AD_GROUP_ID`)) {
        if (!(is.character(input_json$`AD_GROUP_ID`) && length(input_json$`AD_GROUP_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AD_GROUP_ID`. Must be a string:", input_json$`AD_GROUP_ID`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupsAnalyticsResponseInner: the required field `AD_GROUP_ID` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupsAnalyticsResponseInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `AD_GROUP_ID` is null
      if (is.null(self$`AD_GROUP_ID`)) {
        return(FALSE)
      }

      if (!str_detect(self$`AD_GROUP_ID`, "^\\d+$")) {
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
      # check if the required `AD_GROUP_ID` is null
      if (is.null(self$`AD_GROUP_ID`)) {
        invalid_fields["AD_GROUP_ID"] <- "Non-nullable required field `AD_GROUP_ID` cannot be null."
      }

      if (!str_detect(self$`AD_GROUP_ID`, "^\\d+$")) {
        invalid_fields["AD_GROUP_ID"] <- "Invalid value for `AD_GROUP_ID`, must conform to the pattern ^\\d+$."
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
# AdGroupsAnalyticsResponseInner$unlock()
#
## Below is an example to define the print function
# AdGroupsAnalyticsResponseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupsAnalyticsResponseInner$lock()

