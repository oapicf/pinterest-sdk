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
    #' @return AdAccountAnalyticsResponseInner as a base R list.
    #' @examples
    #' # convert array of AdAccountAnalyticsResponseInner (x) to a data frame
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
    #' Convert AdAccountAnalyticsResponseInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
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

      return(AdAccountAnalyticsResponseInnerObject)
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
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdAccountAnalyticsResponseInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
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

