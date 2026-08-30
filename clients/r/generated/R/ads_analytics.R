#' Create a new AdsAnalytics
#'
#' @description
#' AdsAnalytics Class
#'
#' @docType class
#' @title AdsAnalytics
#' @description AdsAnalytics Class
#' @format An \code{R6Class} generator object
#' @field AD_ID  character
#' @field DATE  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalytics <- R6::R6Class(
  "AdsAnalytics",
  public = list(
    `AD_ID` = NULL,
    `DATE` = NULL,

    #' @description
    #' Initialize a new AdsAnalytics class.
    #'
    #' @param AD_ID AD_ID
    #' @param DATE DATE
    #' @param ... Other optional arguments.
    initialize = function(`AD_ID`, `DATE` = NULL, ...) {
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
    #' @return AdsAnalytics as a base R list.
    #' @examples
    #' # convert array of AdsAnalytics (x) to a data frame
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
    #' Convert AdsAnalytics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdsAnalyticsObject <- list()
      if (!is.null(self$`AD_ID`)) {
        AdsAnalyticsObject[["AD_ID"]] <-
          self$`AD_ID`
      }
      if (!is.null(self$`DATE`)) {
        AdsAnalyticsObject[["DATE"]] <-
          self$`DATE`
      }
      return(AdsAnalyticsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalytics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalytics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AD_ID`)) {
        self$`AD_ID` <- this_object$`AD_ID`
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
    #' @return AdsAnalytics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdsAnalytics
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalytics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AD_ID` <- this_object$`AD_ID`
      self$`DATE` <- this_object$`DATE`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdsAnalytics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `AD_ID`
      if (!is.null(input_json$`AD_ID`)) {
        if (!(is.character(input_json$`AD_ID`) && length(input_json$`AD_ID`) == 1)) {
          stop(paste("Error! Invalid data for `AD_ID`. Must be a string:", input_json$`AD_ID`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalytics: the required field `AD_ID` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsAnalytics
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
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

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
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
# AdsAnalytics$unlock()
#
## Below is an example to define the print function
# AdsAnalytics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsAnalytics$lock()

