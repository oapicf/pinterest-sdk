#' Create a new ConversionEvents
#'
#' @description
#' Conversion events.
#'
#' @docType class
#' @title ConversionEvents
#' @description ConversionEvents Class
#' @format An \code{R6Class} generator object
#' @field events Specific messages for each event received. The order will match the order in which the events were received in the request. list(\link{ConversionApiResponseEventsItems})
#' @field num_events_processed Number of events that were successfully processed from the events. integer
#' @field num_events_received Total number of events received in the request. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEvents <- R6::R6Class(
  "ConversionEvents",
  public = list(
    `events` = NULL,
    `num_events_processed` = NULL,
    `num_events_received` = NULL,

    #' @description
    #' Initialize a new ConversionEvents class.
    #'
    #' @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
    #' @param num_events_processed Number of events that were successfully processed from the events.
    #' @param num_events_received Total number of events received in the request.
    #' @param ... Other optional arguments.
    initialize = function(`events`, `num_events_processed`, `num_events_received`, ...) {
      if (!missing(`events`)) {
        stopifnot(is.vector(`events`), length(`events`) != 0)
        sapply(`events`, function(x) stopifnot(R6::is.R6(x)))
        self$`events` <- `events`
      }
      if (!missing(`num_events_processed`)) {
        if (!(is.numeric(`num_events_processed`) && length(`num_events_processed`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_processed`. Must be an integer:", `num_events_processed`))
        }
        self$`num_events_processed` <- `num_events_processed`
      }
      if (!missing(`num_events_received`)) {
        if (!(is.numeric(`num_events_received`) && length(`num_events_received`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_received`. Must be an integer:", `num_events_received`))
        }
        self$`num_events_received` <- `num_events_received`
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
    #' @return ConversionEvents as a base R list.
    #' @examples
    #' # convert array of ConversionEvents (x) to a data frame
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
    #' Convert ConversionEvents to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionEventsObject <- list()
      if (!is.null(self$`events`)) {
        ConversionEventsObject[["events"]] <-
          self$extractSimpleType(self$`events`)
      }
      if (!is.null(self$`num_events_processed`)) {
        ConversionEventsObject[["num_events_processed"]] <-
          self$`num_events_processed`
      }
      if (!is.null(self$`num_events_received`)) {
        ConversionEventsObject[["num_events_received"]] <-
          self$`num_events_received`
      }
      return(ConversionEventsObject)
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
    #' Deserialize JSON string into an instance of ConversionEvents
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEvents
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`events`)) {
        self$`events` <- ApiClient$new()$deserializeObj(this_object$`events`, "array[ConversionApiResponseEventsItems]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`num_events_processed`)) {
        self$`num_events_processed` <- this_object$`num_events_processed`
      }
      if (!is.null(this_object$`num_events_received`)) {
        self$`num_events_received` <- this_object$`num_events_received`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionEvents in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEvents
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEvents
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`events` <- ApiClient$new()$deserializeObj(this_object$`events`, "array[ConversionApiResponseEventsItems]", loadNamespace("openapi"))
      self$`num_events_processed` <- this_object$`num_events_processed`
      self$`num_events_received` <- this_object$`num_events_received`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEvents and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `events`
      if (!is.null(input_json$`events`)) {
        stopifnot(is.vector(input_json$`events`), length(input_json$`events`) != 0)
        tmp <- sapply(input_json$`events`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEvents: the required field `events` is missing."))
      }
      # check the required field `num_events_processed`
      if (!is.null(input_json$`num_events_processed`)) {
        if (!(is.numeric(input_json$`num_events_processed`) && length(input_json$`num_events_processed`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_processed`. Must be an integer:", input_json$`num_events_processed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEvents: the required field `num_events_processed` is missing."))
      }
      # check the required field `num_events_received`
      if (!is.null(input_json$`num_events_received`)) {
        if (!(is.numeric(input_json$`num_events_received`) && length(input_json$`num_events_received`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_received`. Must be an integer:", input_json$`num_events_received`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEvents: the required field `num_events_received` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEvents
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `events` is null
      if (is.null(self$`events`)) {
        return(FALSE)
      }

      # check if the required `num_events_processed` is null
      if (is.null(self$`num_events_processed`)) {
        return(FALSE)
      }

      # check if the required `num_events_received` is null
      if (is.null(self$`num_events_received`)) {
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
      # check if the required `events` is null
      if (is.null(self$`events`)) {
        invalid_fields["events"] <- "Non-nullable required field `events` cannot be null."
      }

      # check if the required `num_events_processed` is null
      if (is.null(self$`num_events_processed`)) {
        invalid_fields["num_events_processed"] <- "Non-nullable required field `num_events_processed` cannot be null."
      }

      # check if the required `num_events_received` is null
      if (is.null(self$`num_events_received`)) {
        invalid_fields["num_events_received"] <- "Non-nullable required field `num_events_received` cannot be null."
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
# ConversionEvents$unlock()
#
## Below is an example to define the print function
# ConversionEvents$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEvents$lock()

