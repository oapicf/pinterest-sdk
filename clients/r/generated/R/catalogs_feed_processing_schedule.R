#' Create a new CatalogsFeedProcessingSchedule
#'
#' @description
#' Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
#'
#' @docType class
#' @title CatalogsFeedProcessingSchedule
#' @description CatalogsFeedProcessingSchedule Class
#' @format An \code{R6Class} generator object
#' @field time A time in format HH:MM with leading 0 (zero) character
#' @field timezone The timezone considered for the processing schedule time. \link{CatalogsFeedProcessingScheduleTimezone}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedProcessingSchedule <- R6::R6Class(
  "CatalogsFeedProcessingSchedule",
  public = list(
    `time` = NULL,
    `timezone` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedProcessingSchedule class.
    #'
    #' @param time A time in format HH:MM with leading 0 (zero)
    #' @param timezone The timezone considered for the processing schedule time.
    #' @param ... Other optional arguments.
    initialize = function(`time`, `timezone`, ...) {
      if (!missing(`time`)) {
        if (!(is.character(`time`) && length(`time`) == 1)) {
          stop(paste("Error! Invalid data for `time`. Must be a string:", `time`))
        }
        self$`time` <- `time`
      }
      if (!missing(`timezone`)) {
        if (!(`timezone` %in% c())) {
          stop(paste("Error! \"", `timezone`, "\" cannot be assigned to `timezone`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`timezone`))
        self$`timezone` <- `timezone`
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
    #' @return CatalogsFeedProcessingSchedule as a base R list.
    #' @examples
    #' # convert array of CatalogsFeedProcessingSchedule (x) to a data frame
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
    #' Convert CatalogsFeedProcessingSchedule to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsFeedProcessingScheduleObject <- list()
      if (!is.null(self$`time`)) {
        CatalogsFeedProcessingScheduleObject[["time"]] <-
          self$`time`
      }
      if (!is.null(self$`timezone`)) {
        CatalogsFeedProcessingScheduleObject[["timezone"]] <-
          self$extractSimpleType(self$`timezone`)
      }
      return(CatalogsFeedProcessingScheduleObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingSchedule
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProcessingSchedule
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`time`)) {
        self$`time` <- this_object$`time`
      }
      if (!is.null(this_object$`timezone`)) {
        `timezone_object` <- CatalogsFeedProcessingScheduleTimezone$new()
        `timezone_object`$fromJSON(jsonlite::toJSON(this_object$`timezone`, auto_unbox = TRUE, digits = NA))
        self$`timezone` <- `timezone_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsFeedProcessingSchedule in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingSchedule
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProcessingSchedule
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`time` <- this_object$`time`
      self$`timezone` <- CatalogsFeedProcessingScheduleTimezone$new()$fromJSON(jsonlite::toJSON(this_object$`timezone`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedProcessingSchedule and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `time`
      if (!is.null(input_json$`time`)) {
        if (!(is.character(input_json$`time`) && length(input_json$`time`) == 1)) {
          stop(paste("Error! Invalid data for `time`. Must be a string:", input_json$`time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingSchedule: the required field `time` is missing."))
      }
      # check the required field `timezone`
      if (!is.null(input_json$`timezone`)) {
        stopifnot(R6::is.R6(input_json$`timezone`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingSchedule: the required field `timezone` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedProcessingSchedule
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `time` is null
      if (is.null(self$`time`)) {
        return(FALSE)
      }

      if (!str_detect(self$`time`, "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")) {
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
      # check if the required `time` is null
      if (is.null(self$`time`)) {
        invalid_fields["time"] <- "Non-nullable required field `time` cannot be null."
      }

      if (!str_detect(self$`time`, "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")) {
        invalid_fields["time"] <- "Invalid value for `time`, must conform to the pattern ^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$."
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
# CatalogsFeedProcessingSchedule$unlock()
#
## Below is an example to define the print function
# CatalogsFeedProcessingSchedule$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedProcessingSchedule$lock()

