#' Create a new CampaignsAnalyticsResponseInner
#'
#' @description
#' CampaignsAnalyticsResponseInner Class
#'
#' @docType class
#' @title CampaignsAnalyticsResponseInner
#' @description CampaignsAnalyticsResponseInner Class
#' @format An \code{R6Class} generator object
#' @field CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true. character [optional]
#' @field DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignsAnalyticsResponseInner <- R6::R6Class(
  "CampaignsAnalyticsResponseInner",
  inherit = AnyType,
  public = list(
    `CAMPAIGN_ID` = NULL,
    `DATE` = NULL,
    `_field_list` = c("CAMPAIGN_ID", "DATE"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new CampaignsAnalyticsResponseInner class.
    #'
    #' @param CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
    #' @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`CAMPAIGN_ID` = NULL, `DATE` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`CAMPAIGN_ID`)) {
        if (!(is.character(`CAMPAIGN_ID`) && length(`CAMPAIGN_ID`) == 1)) {
          stop(paste("Error! Invalid data for `CAMPAIGN_ID`. Must be a string:", `CAMPAIGN_ID`))
        }
        self$`CAMPAIGN_ID` <- `CAMPAIGN_ID`
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
    #' @return CampaignsAnalyticsResponseInner as a base R list.
    #' @examples
    #' # convert array of CampaignsAnalyticsResponseInner (x) to a data frame
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
    #' Convert CampaignsAnalyticsResponseInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignsAnalyticsResponseInnerObject <- list()
      if (!is.null(self$`CAMPAIGN_ID`)) {
        CampaignsAnalyticsResponseInnerObject[["CAMPAIGN_ID"]] <-
          self$`CAMPAIGN_ID`
      }
      if (!is.null(self$`DATE`)) {
        CampaignsAnalyticsResponseInnerObject[["DATE"]] <-
          self$`DATE`
      }
      for (key in names(self$additional_properties)) {
        CampaignsAnalyticsResponseInnerObject[[key]] <- self$additional_properties[[key]]
      }

      return(CampaignsAnalyticsResponseInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignsAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignsAnalyticsResponseInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CAMPAIGN_ID`)) {
        self$`CAMPAIGN_ID` <- this_object$`CAMPAIGN_ID`
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
    #' @return CampaignsAnalyticsResponseInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignsAnalyticsResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignsAnalyticsResponseInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CAMPAIGN_ID` <- this_object$`CAMPAIGN_ID`
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
    #' Validate JSON input with respect to CampaignsAnalyticsResponseInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignsAnalyticsResponseInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`CAMPAIGN_ID`, "^\\d+$")) {
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
      if (!str_detect(self$`CAMPAIGN_ID`, "^\\d+$")) {
        invalid_fields["CAMPAIGN_ID"] <- "Invalid value for `CAMPAIGN_ID`, must conform to the pattern ^\\d+$."
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
# CampaignsAnalyticsResponseInner$unlock()
#
## Below is an example to define the print function
# CampaignsAnalyticsResponseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignsAnalyticsResponseInner$lock()

