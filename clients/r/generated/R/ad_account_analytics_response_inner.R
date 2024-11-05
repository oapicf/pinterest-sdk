#' Create a new AdAccountAnalyticsResponseInner
#'
#' @description
#' AdAccountAnalyticsResponseInner Class
#'
#' @docType class
#' @title AdAccountAnalyticsResponseInner
#' @description AdAccountAnalyticsResponseInner Class
#' @format An \code{R6Class} generator object
#' @field AD_ACCOUNT_ID The ID of the advertiser that this metrics belongs to. character
#' @field DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountAnalyticsResponseInner <- R6::R6Class(
  "AdAccountAnalyticsResponseInner",
  inherit = AnyType,
  public = list(
    `AD_ACCOUNT_ID` = NULL,
    `DATE` = NULL,
    `_field_list` = c("AD_ACCOUNT_ID", "DATE"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new AdAccountAnalyticsResponseInner class.
    #'
    #' @param AD_ACCOUNT_ID The ID of the advertiser that this metrics belongs to.
    #' @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`AD_ACCOUNT_ID`, `DATE` = NULL, additional_properties = NULL, ...) {
      if (!missing(`AD_ACCOUNT_ID`)) {
        if (!(is.character(`AD_ACCOUNT_ID`) && length(`AD_ACCOUNT_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AD_ACCOUNT_ID`. Must be a string:", `AD_ACCOUNT_ID`))
        }
        self$`AD_ACCOUNT_ID` <- `AD_ACCOUNT_ID`
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
    #' @return AdAccountAnalyticsResponseInner in JSON format
    toJSON = function() {
      AdAccountAnalyticsResponseInnerObject <- list()
      if (!is.null(self$`AD_ACCOUNT_ID`)) {
        AdAccountAnalyticsResponseInnerObject[["AD_ACCOUNT_ID"]] <-
          self$`AD_ACCOUNT_ID`
      }
      if (!is.null(self$`DATE`)) {
        AdAccountAnalyticsResponseInnerObject[["DATE"]] <-
          self$`DATE`
      }
      for (key in names(self$additional_properties)) {
        AdAccountAnalyticsResponseInnerObject[[key]] <- self$additional_properties[[key]]
      }

      AdAccountAnalyticsResponseInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountAnalyticsResponseInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AD_ACCOUNT_ID`)) {
        self$`AD_ACCOUNT_ID` <- this_object$`AD_ACCOUNT_ID`
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
    #' @return AdAccountAnalyticsResponseInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`AD_ACCOUNT_ID`)) {
          sprintf(
          '"AD_ACCOUNT_ID":
            "%s"
                    ',
          self$`AD_ACCOUNT_ID`
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
    #' Deserialize JSON string into an instance of AdAccountAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountAnalyticsResponseInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AD_ACCOUNT_ID` <- this_object$`AD_ACCOUNT_ID`
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
    #' Validate JSON input with respect to AdAccountAnalyticsResponseInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `AD_ACCOUNT_ID`
      if (!is.null(input_json$`AD_ACCOUNT_ID`)) {
        if (!(is.character(input_json$`AD_ACCOUNT_ID`) && length(input_json$`AD_ACCOUNT_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AD_ACCOUNT_ID`. Must be a string:", input_json$`AD_ACCOUNT_ID`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdAccountAnalyticsResponseInner: the required field `AD_ACCOUNT_ID` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountAnalyticsResponseInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `AD_ACCOUNT_ID` is null
      if (is.null(self$`AD_ACCOUNT_ID`)) {
        return(FALSE)
      }

      if (!str_detect(self$`AD_ACCOUNT_ID`, "^\\d+$")) {
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
      # check if the required `AD_ACCOUNT_ID` is null
      if (is.null(self$`AD_ACCOUNT_ID`)) {
        invalid_fields["AD_ACCOUNT_ID"] <- "Non-nullable required field `AD_ACCOUNT_ID` cannot be null."
      }

      if (!str_detect(self$`AD_ACCOUNT_ID`, "^\\d+$")) {
        invalid_fields["AD_ACCOUNT_ID"] <- "Invalid value for `AD_ACCOUNT_ID`, must conform to the pattern ^\\d+$."
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
# AdAccountAnalyticsResponseInner$unlock()
#
## Below is an example to define the print function
# AdAccountAnalyticsResponseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountAnalyticsResponseInner$lock()

