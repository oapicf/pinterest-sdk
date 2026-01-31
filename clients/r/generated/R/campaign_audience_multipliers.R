#' Create a new CampaignAudienceMultipliers
#'
#' @description
#' This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
#'
#' @docType class
#' @title CampaignAudienceMultipliers
#' @description CampaignAudienceMultipliers Class
#' @format An \code{R6Class} generator object
#' @field AUDIENCE_ID  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignAudienceMultipliers <- R6::R6Class(
  "CampaignAudienceMultipliers",
  inherit = numeric,
  public = list(
    `AUDIENCE_ID` = NULL,
    `_field_list` = c("AUDIENCE_ID"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new CampaignAudienceMultipliers class.
    #'
    #' @param AUDIENCE_ID AUDIENCE_ID
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`AUDIENCE_ID` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`AUDIENCE_ID`)) {
        if (!(is.character(`AUDIENCE_ID`) && length(`AUDIENCE_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AUDIENCE_ID`. Must be a string:", `AUDIENCE_ID`))
        }
        self$`AUDIENCE_ID` <- `AUDIENCE_ID`
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
    #' @return CampaignAudienceMultipliers as a base R list.
    #' @examples
    #' # convert array of CampaignAudienceMultipliers (x) to a data frame
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
    #' Convert CampaignAudienceMultipliers to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignAudienceMultipliersObject <- list()
      if (!is.null(self$`AUDIENCE_ID`)) {
        CampaignAudienceMultipliersObject[["AUDIENCE_ID"]] <-
          self$`AUDIENCE_ID`
      }
      for (key in names(self$additional_properties)) {
        CampaignAudienceMultipliersObject[[key]] <- self$additional_properties[[key]]
      }

      return(CampaignAudienceMultipliersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignAudienceMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignAudienceMultipliers
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AUDIENCE_ID`)) {
        self$`AUDIENCE_ID` <- this_object$`AUDIENCE_ID`
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
    #' @return CampaignAudienceMultipliers in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignAudienceMultipliers
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignAudienceMultipliers
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AUDIENCE_ID` <- this_object$`AUDIENCE_ID`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignAudienceMultipliers and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignAudienceMultipliers
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`AUDIENCE_ID`, "^\\d+$")) {
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
      if (!str_detect(self$`AUDIENCE_ID`, "^\\d+$")) {
        invalid_fields["AUDIENCE_ID"] <- "Invalid value for `AUDIENCE_ID`, must conform to the pattern ^\\d+$."
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
# CampaignAudienceMultipliers$unlock()
#
## Below is an example to define the print function
# CampaignAudienceMultipliers$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignAudienceMultipliers$lock()

