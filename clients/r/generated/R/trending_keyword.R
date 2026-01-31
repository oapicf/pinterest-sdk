#' Create a new TrendingKeyword
#'
#' @description
#' TrendingKeyword Class
#'
#' @docType class
#' @title TrendingKeyword
#' @description TrendingKeyword Class
#' @format An \code{R6Class} generator object
#' @field demographics  \link{TrendingKeywordDemographics} [optional]
#' @field has_prediction Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response. character [optional]
#' @field keyword The keyword that is trending. character [optional]
#' @field pct_growth_mom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400\% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% month-over-month growth. integer [optional]
#' @field pct_growth_wow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50\% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% week-over-week growth. integer [optional]
#' @field pct_growth_yoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5\% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% year-over-year growth. integer [optional]
#' @field predicted_time_series  \link{PredictedTimeSeries} [optional]
#' @field time_series  \link{TimeSeries} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeyword <- R6::R6Class(
  "TrendingKeyword",
  public = list(
    `demographics` = NULL,
    `has_prediction` = NULL,
    `keyword` = NULL,
    `pct_growth_mom` = NULL,
    `pct_growth_wow` = NULL,
    `pct_growth_yoy` = NULL,
    `predicted_time_series` = NULL,
    `time_series` = NULL,

    #' @description
    #' Initialize a new TrendingKeyword class.
    #'
    #' @param demographics demographics
    #' @param has_prediction Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
    #' @param keyword The keyword that is trending.
    #' @param pct_growth_mom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400\% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% month-over-month growth.
    #' @param pct_growth_wow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50\% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% week-over-week growth.
    #' @param pct_growth_yoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5\% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% year-over-year growth.
    #' @param predicted_time_series predicted_time_series
    #' @param time_series time_series
    #' @param ... Other optional arguments.
    initialize = function(`demographics` = NULL, `has_prediction` = NULL, `keyword` = NULL, `pct_growth_mom` = NULL, `pct_growth_wow` = NULL, `pct_growth_yoy` = NULL, `predicted_time_series` = NULL, `time_series` = NULL, ...) {
      if (!is.null(`demographics`)) {
        stopifnot(R6::is.R6(`demographics`))
        self$`demographics` <- `demographics`
      }
      if (!is.null(`has_prediction`)) {
        if (!(is.logical(`has_prediction`) && length(`has_prediction`) == 1)) {
          stop(paste("Error! Invalid data for `has_prediction`. Must be a boolean:", `has_prediction`))
        }
        self$`has_prediction` <- `has_prediction`
      }
      if (!is.null(`keyword`)) {
        if (!(is.character(`keyword`) && length(`keyword`) == 1)) {
          stop(paste("Error! Invalid data for `keyword`. Must be a string:", `keyword`))
        }
        self$`keyword` <- `keyword`
      }
      if (!is.null(`pct_growth_mom`)) {
        if (!(is.numeric(`pct_growth_mom`) && length(`pct_growth_mom`) == 1)) {
          stop(paste("Error! Invalid data for `pct_growth_mom`. Must be an integer:", `pct_growth_mom`))
        }
        self$`pct_growth_mom` <- `pct_growth_mom`
      }
      if (!is.null(`pct_growth_wow`)) {
        if (!(is.numeric(`pct_growth_wow`) && length(`pct_growth_wow`) == 1)) {
          stop(paste("Error! Invalid data for `pct_growth_wow`. Must be an integer:", `pct_growth_wow`))
        }
        self$`pct_growth_wow` <- `pct_growth_wow`
      }
      if (!is.null(`pct_growth_yoy`)) {
        if (!(is.numeric(`pct_growth_yoy`) && length(`pct_growth_yoy`) == 1)) {
          stop(paste("Error! Invalid data for `pct_growth_yoy`. Must be an integer:", `pct_growth_yoy`))
        }
        self$`pct_growth_yoy` <- `pct_growth_yoy`
      }
      if (!is.null(`predicted_time_series`)) {
        stopifnot(R6::is.R6(`predicted_time_series`))
        self$`predicted_time_series` <- `predicted_time_series`
      }
      if (!is.null(`time_series`)) {
        stopifnot(R6::is.R6(`time_series`))
        self$`time_series` <- `time_series`
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
    #' @return TrendingKeyword as a base R list.
    #' @examples
    #' # convert array of TrendingKeyword (x) to a data frame
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
    #' Convert TrendingKeyword to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingKeywordObject <- list()
      if (!is.null(self$`demographics`)) {
        TrendingKeywordObject[["demographics"]] <-
          self$`demographics`$toSimpleType()
      }
      if (!is.null(self$`has_prediction`)) {
        TrendingKeywordObject[["has_prediction"]] <-
          self$`has_prediction`
      }
      if (!is.null(self$`keyword`)) {
        TrendingKeywordObject[["keyword"]] <-
          self$`keyword`
      }
      if (!is.null(self$`pct_growth_mom`)) {
        TrendingKeywordObject[["pct_growth_mom"]] <-
          self$`pct_growth_mom`
      }
      if (!is.null(self$`pct_growth_wow`)) {
        TrendingKeywordObject[["pct_growth_wow"]] <-
          self$`pct_growth_wow`
      }
      if (!is.null(self$`pct_growth_yoy`)) {
        TrendingKeywordObject[["pct_growth_yoy"]] <-
          self$`pct_growth_yoy`
      }
      if (!is.null(self$`predicted_time_series`)) {
        TrendingKeywordObject[["predicted_time_series"]] <-
          self$`predicted_time_series`$toSimpleType()
      }
      if (!is.null(self$`time_series`)) {
        TrendingKeywordObject[["time_series"]] <-
          self$`time_series`$toSimpleType()
      }
      return(TrendingKeywordObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeyword
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`demographics`)) {
        `demographics_object` <- TrendingKeywordDemographics$new()
        `demographics_object`$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
        self$`demographics` <- `demographics_object`
      }
      if (!is.null(this_object$`has_prediction`)) {
        self$`has_prediction` <- this_object$`has_prediction`
      }
      if (!is.null(this_object$`keyword`)) {
        self$`keyword` <- this_object$`keyword`
      }
      if (!is.null(this_object$`pct_growth_mom`)) {
        self$`pct_growth_mom` <- this_object$`pct_growth_mom`
      }
      if (!is.null(this_object$`pct_growth_wow`)) {
        self$`pct_growth_wow` <- this_object$`pct_growth_wow`
      }
      if (!is.null(this_object$`pct_growth_yoy`)) {
        self$`pct_growth_yoy` <- this_object$`pct_growth_yoy`
      }
      if (!is.null(this_object$`predicted_time_series`)) {
        `predicted_time_series_object` <- PredictedTimeSeries$new()
        `predicted_time_series_object`$fromJSON(jsonlite::toJSON(this_object$`predicted_time_series`, auto_unbox = TRUE, digits = NA))
        self$`predicted_time_series` <- `predicted_time_series_object`
      }
      if (!is.null(this_object$`time_series`)) {
        `time_series_object` <- TimeSeries$new()
        `time_series_object`$fromJSON(jsonlite::toJSON(this_object$`time_series`, auto_unbox = TRUE, digits = NA))
        self$`time_series` <- `time_series_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TrendingKeyword in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingKeyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeyword
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`demographics` <- TrendingKeywordDemographics$new()$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
      self$`has_prediction` <- this_object$`has_prediction`
      self$`keyword` <- this_object$`keyword`
      self$`pct_growth_mom` <- this_object$`pct_growth_mom`
      self$`pct_growth_wow` <- this_object$`pct_growth_wow`
      self$`pct_growth_yoy` <- this_object$`pct_growth_yoy`
      self$`predicted_time_series` <- PredictedTimeSeries$new()$fromJSON(jsonlite::toJSON(this_object$`predicted_time_series`, auto_unbox = TRUE, digits = NA))
      self$`time_series` <- TimeSeries$new()$fromJSON(jsonlite::toJSON(this_object$`time_series`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingKeyword and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingKeyword
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`keyword`) < 1) {
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
      if (nchar(self$`keyword`) < 1) {
        invalid_fields["keyword"] <- "Invalid length for `keyword`, must be bigger than or equal to 1."
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
# TrendingKeyword$unlock()
#
## Below is an example to define the print function
# TrendingKeyword$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeyword$lock()

