#' Create a new ConversionApiResponseEventsItems
#'
#' @description
#' ConversionApiResponseEventsItems Class
#'
#' @docType class
#' @title ConversionApiResponseEventsItems
#' @description ConversionApiResponseEventsItems Class
#' @format An \code{R6Class} generator object
#' @field error_message Error message containing more information about why the event failed to be processed. character [optional]
#' @field status Whether the event was processed successfully. \link{EventProcessingStatus}
#' @field warning_message Warning messages about any fields in the event which are not standard. These are not critical to event processing. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionApiResponseEventsItems <- R6::R6Class(
  "ConversionApiResponseEventsItems",
  public = list(
    `error_message` = NULL,
    `status` = NULL,
    `warning_message` = NULL,

    #' @description
    #' Initialize a new ConversionApiResponseEventsItems class.
    #'
    #' @param status Whether the event was processed successfully.
    #' @param error_message Error message containing more information about why the event failed to be processed.
    #' @param warning_message Warning messages about any fields in the event which are not standard. These are not critical to event processing.
    #' @param ... Other optional arguments.
    initialize = function(`status`, `error_message` = NULL, `warning_message` = NULL, ...) {
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`error_message`)) {
        if (!(is.character(`error_message`) && length(`error_message`) == 1)) {
          stop(paste("Error! Invalid data for `error_message`. Must be a string:", `error_message`))
        }
        self$`error_message` <- `error_message`
      }
      if (!is.null(`warning_message`)) {
        if (!(is.character(`warning_message`) && length(`warning_message`) == 1)) {
          stop(paste("Error! Invalid data for `warning_message`. Must be a string:", `warning_message`))
        }
        self$`warning_message` <- `warning_message`
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
    #' @return ConversionApiResponseEventsItems as a base R list.
    #' @examples
    #' # convert array of ConversionApiResponseEventsItems (x) to a data frame
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
    #' Convert ConversionApiResponseEventsItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionApiResponseEventsItemsObject <- list()
      if (!is.null(self$`error_message`)) {
        ConversionApiResponseEventsItemsObject[["error_message"]] <-
          self$`error_message`
      }
      if (!is.null(self$`status`)) {
        ConversionApiResponseEventsItemsObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`warning_message`)) {
        ConversionApiResponseEventsItemsObject[["warning_message"]] <-
          self$`warning_message`
      }
      return(ConversionApiResponseEventsItemsObject)
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
    #' Deserialize JSON string into an instance of ConversionApiResponseEventsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionApiResponseEventsItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`error_message`)) {
        self$`error_message` <- this_object$`error_message`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EventProcessingStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`warning_message`)) {
        self$`warning_message` <- this_object$`warning_message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionApiResponseEventsItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionApiResponseEventsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionApiResponseEventsItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`error_message` <- this_object$`error_message`
      self$`status` <- EventProcessingStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`warning_message` <- this_object$`warning_message`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionApiResponseEventsItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionApiResponseEventsItems: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionApiResponseEventsItems
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# ConversionApiResponseEventsItems$unlock()
#
## Below is an example to define the print function
# ConversionApiResponseEventsItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionApiResponseEventsItems$lock()

