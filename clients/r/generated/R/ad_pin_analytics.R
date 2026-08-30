#' Create a new AdPinAnalytics
#'
#' @description
#' AdPinAnalytics Class
#'
#' @docType class
#' @title AdPinAnalytics
#' @description AdPinAnalytics Class
#' @format An \code{R6Class} generator object
#' @field DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) character [optional]
#' @field PIN_ID The ID of the pin that the metric belongs to. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPinAnalytics <- R6::R6Class(
  "AdPinAnalytics",
  public = list(
    `DATE` = NULL,
    `PIN_ID` = NULL,

    #' @description
    #' Initialize a new AdPinAnalytics class.
    #'
    #' @param PIN_ID The ID of the pin that the metric belongs to.
    #' @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    #' @param ... Other optional arguments.
    initialize = function(`PIN_ID`, `DATE` = NULL, ...) {
      if (!missing(`PIN_ID`)) {
        if (!(is.character(`PIN_ID`) && length(`PIN_ID`) == 1)) {
          stop(paste("Error! Invalid data for `PIN_ID`. Must be a string:", `PIN_ID`))
        }
        self$`PIN_ID` <- `PIN_ID`
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
    #' @return AdPinAnalytics as a base R list.
    #' @examples
    #' # convert array of AdPinAnalytics (x) to a data frame
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
    #' Convert AdPinAnalytics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdPinAnalyticsObject <- list()
      if (!is.null(self$`DATE`)) {
        AdPinAnalyticsObject[["DATE"]] <-
          self$`DATE`
      }
      if (!is.null(self$`PIN_ID`)) {
        AdPinAnalyticsObject[["PIN_ID"]] <-
          self$`PIN_ID`
      }
      return(AdPinAnalyticsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPinAnalytics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPinAnalytics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`DATE`)) {
        self$`DATE` <- this_object$`DATE`
      }
      if (!is.null(this_object$`PIN_ID`)) {
        self$`PIN_ID` <- this_object$`PIN_ID`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdPinAnalytics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPinAnalytics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPinAnalytics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`DATE` <- this_object$`DATE`
      self$`PIN_ID` <- this_object$`PIN_ID`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdPinAnalytics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `PIN_ID`
      if (!is.null(input_json$`PIN_ID`)) {
        if (!(is.character(input_json$`PIN_ID`) && length(input_json$`PIN_ID`) == 1)) {
          stop(paste("Error! Invalid data for `PIN_ID`. Must be a string:", input_json$`PIN_ID`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPinAnalytics: the required field `PIN_ID` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPinAnalytics
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `PIN_ID` is null
      if (is.null(self$`PIN_ID`)) {
        return(FALSE)
      }

      if (!str_detect(self$`PIN_ID`, "^\\d+$")) {
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
      # check if the required `PIN_ID` is null
      if (is.null(self$`PIN_ID`)) {
        invalid_fields["PIN_ID"] <- "Non-nullable required field `PIN_ID` cannot be null."
      }

      if (!str_detect(self$`PIN_ID`, "^\\d+$")) {
        invalid_fields["PIN_ID"] <- "Invalid value for `PIN_ID`, must conform to the pattern ^\\d+$."
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
# AdPinAnalytics$unlock()
#
## Below is an example to define the print function
# AdPinAnalytics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPinAnalytics$lock()

