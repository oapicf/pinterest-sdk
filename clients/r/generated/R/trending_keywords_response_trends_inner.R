#' Create a new TrendingKeywordsResponseTrendsInner
#'
#' @description
#' TrendingKeywordsResponseTrendsInner Class
#'
#' @docType class
#' @title TrendingKeywordsResponseTrendsInner
#' @description TrendingKeywordsResponseTrendsInner Class
#' @format An \code{R6Class} generator object
#' @field keyword The keyword that is trending. character [optional]
#' @field pct_growth_wow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50\% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% week-over-week growth. integer [optional]
#' @field pct_growth_mom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400\% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% month-over-month growth. integer [optional]
#' @field pct_growth_yoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5\% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% year-over-year growth. integer [optional]
#' @field time_series  \link{TrendingKeywordsResponseTrendsInnerTimeSeries} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingKeywordsResponseTrendsInner <- R6::R6Class(
  "TrendingKeywordsResponseTrendsInner",
  public = list(
    `keyword` = NULL,
    `pct_growth_wow` = NULL,
    `pct_growth_mom` = NULL,
    `pct_growth_yoy` = NULL,
    `time_series` = NULL,
    #' Initialize a new TrendingKeywordsResponseTrendsInner class.
    #'
    #' @description
    #' Initialize a new TrendingKeywordsResponseTrendsInner class.
    #'
    #' @param keyword The keyword that is trending.
    #' @param pct_growth_wow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50\% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% week-over-week growth.
    #' @param pct_growth_mom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400\% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% month-over-month growth.
    #' @param pct_growth_yoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5\% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000\% change.  A value of 10001 indicates that this keyword experienced > 10000\% year-over-year growth.
    #' @param time_series time_series
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`keyword` = NULL, `pct_growth_wow` = NULL, `pct_growth_mom` = NULL, `pct_growth_yoy` = NULL, `time_series` = NULL, ...) {
      if (!is.null(`keyword`)) {
        if (!(is.character(`keyword`) && length(`keyword`) == 1)) {
          stop(paste("Error! Invalid data for `keyword`. Must be a string:", `keyword`))
        }
        self$`keyword` <- `keyword`
      }
      if (!is.null(`pct_growth_wow`)) {
        if (!(is.numeric(`pct_growth_wow`) && length(`pct_growth_wow`) == 1)) {
          stop(paste("Error! Invalid data for `pct_growth_wow`. Must be an integer:", `pct_growth_wow`))
        }
        self$`pct_growth_wow` <- `pct_growth_wow`
      }
      if (!is.null(`pct_growth_mom`)) {
        if (!(is.numeric(`pct_growth_mom`) && length(`pct_growth_mom`) == 1)) {
          stop(paste("Error! Invalid data for `pct_growth_mom`. Must be an integer:", `pct_growth_mom`))
        }
        self$`pct_growth_mom` <- `pct_growth_mom`
      }
      if (!is.null(`pct_growth_yoy`)) {
        if (!(is.numeric(`pct_growth_yoy`) && length(`pct_growth_yoy`) == 1)) {
          stop(paste("Error! Invalid data for `pct_growth_yoy`. Must be an integer:", `pct_growth_yoy`))
        }
        self$`pct_growth_yoy` <- `pct_growth_yoy`
      }
      if (!is.null(`time_series`)) {
        stopifnot(R6::is.R6(`time_series`))
        self$`time_series` <- `time_series`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TrendingKeywordsResponseTrendsInner in JSON format
    #' @export
    toJSON = function() {
      TrendingKeywordsResponseTrendsInnerObject <- list()
      if (!is.null(self$`keyword`)) {
        TrendingKeywordsResponseTrendsInnerObject[["keyword"]] <-
          self$`keyword`
      }
      if (!is.null(self$`pct_growth_wow`)) {
        TrendingKeywordsResponseTrendsInnerObject[["pct_growth_wow"]] <-
          self$`pct_growth_wow`
      }
      if (!is.null(self$`pct_growth_mom`)) {
        TrendingKeywordsResponseTrendsInnerObject[["pct_growth_mom"]] <-
          self$`pct_growth_mom`
      }
      if (!is.null(self$`pct_growth_yoy`)) {
        TrendingKeywordsResponseTrendsInnerObject[["pct_growth_yoy"]] <-
          self$`pct_growth_yoy`
      }
      if (!is.null(self$`time_series`)) {
        TrendingKeywordsResponseTrendsInnerObject[["time_series"]] <-
          self$`time_series`$toJSON()
      }
      TrendingKeywordsResponseTrendsInnerObject
    },
    #' Deserialize JSON string into an instance of TrendingKeywordsResponseTrendsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponseTrendsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponseTrendsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`keyword`)) {
        self$`keyword` <- this_object$`keyword`
      }
      if (!is.null(this_object$`pct_growth_wow`)) {
        self$`pct_growth_wow` <- this_object$`pct_growth_wow`
      }
      if (!is.null(this_object$`pct_growth_mom`)) {
        self$`pct_growth_mom` <- this_object$`pct_growth_mom`
      }
      if (!is.null(this_object$`pct_growth_yoy`)) {
        self$`pct_growth_yoy` <- this_object$`pct_growth_yoy`
      }
      if (!is.null(this_object$`time_series`)) {
        `time_series_object` <- TrendingKeywordsResponseTrendsInnerTimeSeries$new()
        `time_series_object`$fromJSON(jsonlite::toJSON(this_object$`time_series`, auto_unbox = TRUE, digits = NA))
        self$`time_series` <- `time_series_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TrendingKeywordsResponseTrendsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`keyword`)) {
          sprintf(
          '"keyword":
            "%s"
                    ',
          self$`keyword`
          )
        },
        if (!is.null(self$`pct_growth_wow`)) {
          sprintf(
          '"pct_growth_wow":
            %d
                    ',
          self$`pct_growth_wow`
          )
        },
        if (!is.null(self$`pct_growth_mom`)) {
          sprintf(
          '"pct_growth_mom":
            %d
                    ',
          self$`pct_growth_mom`
          )
        },
        if (!is.null(self$`pct_growth_yoy`)) {
          sprintf(
          '"pct_growth_yoy":
            %d
                    ',
          self$`pct_growth_yoy`
          )
        },
        if (!is.null(self$`time_series`)) {
          sprintf(
          '"time_series":
          %s
          ',
          jsonlite::toJSON(self$`time_series`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TrendingKeywordsResponseTrendsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrendingKeywordsResponseTrendsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingKeywordsResponseTrendsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`keyword` <- this_object$`keyword`
      self$`pct_growth_wow` <- this_object$`pct_growth_wow`
      self$`pct_growth_mom` <- this_object$`pct_growth_mom`
      self$`pct_growth_yoy` <- this_object$`pct_growth_yoy`
      self$`time_series` <- TrendingKeywordsResponseTrendsInnerTimeSeries$new()$fromJSON(jsonlite::toJSON(this_object$`time_series`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to TrendingKeywordsResponseTrendsInner
    #'
    #' @description
    #' Validate JSON input with respect to TrendingKeywordsResponseTrendsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingKeywordsResponseTrendsInner
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
      if (nchar(self$`keyword`) < 1) {
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
      if (nchar(self$`keyword`) < 1) {
        invalid_fields["keyword"] <- "Invalid length for `keyword`, must be bigger than or equal to 1."
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
# TrendingKeywordsResponseTrendsInner$unlock()
#
## Below is an example to define the print function
# TrendingKeywordsResponseTrendsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingKeywordsResponseTrendsInner$lock()

