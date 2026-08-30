#' Create a new CampaignsAnalyticsMetrics
#'
#' @description
#' CampaignsAnalyticsMetrics Class
#'
#' @docType class
#' @title CampaignsAnalyticsMetrics
#' @description CampaignsAnalyticsMetrics Class
#' @format An \code{R6Class} generator object
#' @field CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true. character [optional]
#' @field DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignsAnalyticsMetrics <- R6::R6Class(
  "CampaignsAnalyticsMetrics",
  public = list(
    `CAMPAIGN_ID` = NULL,
    `DATE` = NULL,

    #' @description
    #' Initialize a new CampaignsAnalyticsMetrics class.
    #'
    #' @param CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
    #' @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    #' @param ... Other optional arguments.
    initialize = function(`CAMPAIGN_ID` = NULL, `DATE` = NULL, ...) {
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
    #' @return CampaignsAnalyticsMetrics as a base R list.
    #' @examples
    #' # convert array of CampaignsAnalyticsMetrics (x) to a data frame
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
    #' Convert CampaignsAnalyticsMetrics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignsAnalyticsMetricsObject <- list()
      if (!is.null(self$`CAMPAIGN_ID`)) {
        CampaignsAnalyticsMetricsObject[["CAMPAIGN_ID"]] <-
          self$`CAMPAIGN_ID`
      }
      if (!is.null(self$`DATE`)) {
        CampaignsAnalyticsMetricsObject[["DATE"]] <-
          self$`DATE`
      }
      return(CampaignsAnalyticsMetricsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignsAnalyticsMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignsAnalyticsMetrics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CAMPAIGN_ID`)) {
        self$`CAMPAIGN_ID` <- this_object$`CAMPAIGN_ID`
      }
      if (!is.null(this_object$`DATE`)) {
        self$`DATE` <- this_object$`DATE`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignsAnalyticsMetrics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignsAnalyticsMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignsAnalyticsMetrics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CAMPAIGN_ID` <- this_object$`CAMPAIGN_ID`
      self$`DATE` <- this_object$`DATE`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignsAnalyticsMetrics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignsAnalyticsMetrics
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
# CampaignsAnalyticsMetrics$unlock()
#
## Below is an example to define the print function
# CampaignsAnalyticsMetrics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignsAnalyticsMetrics$lock()

