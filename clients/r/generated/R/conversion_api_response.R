#' Create a new ConversionApiResponse
#'
#' @description
#' Schema describing the object in the response, which contains information about the events that were received and processed.
#'
#' @docType class
#' @title ConversionApiResponse
#' @description ConversionApiResponse Class
#' @format An \code{R6Class} generator object
#' @field num_events_received Total number of events received in the request. integer
#' @field num_events_processed Number of events that were successfully processed from the events. integer
#' @field events Specific messages for each event received. The order will match the order in which the events were received in the request. list(\link{ConversionApiResponseEventsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionApiResponse <- R6::R6Class(
  "ConversionApiResponse",
  public = list(
    `num_events_received` = NULL,
    `num_events_processed` = NULL,
    `events` = NULL,

    #' @description
    #' Initialize a new ConversionApiResponse class.
    #'
    #' @param num_events_received Total number of events received in the request.
    #' @param num_events_processed Number of events that were successfully processed from the events.
    #' @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
    #' @param ... Other optional arguments.
    initialize = function(`num_events_received`, `num_events_processed`, `events`, ...) {
      if (!missing(`num_events_received`)) {
        if (!(is.numeric(`num_events_received`) && length(`num_events_received`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_received`. Must be an integer:", `num_events_received`))
        }
        self$`num_events_received` <- `num_events_received`
      }
      if (!missing(`num_events_processed`)) {
        if (!(is.numeric(`num_events_processed`) && length(`num_events_processed`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_processed`. Must be an integer:", `num_events_processed`))
        }
        self$`num_events_processed` <- `num_events_processed`
      }
      if (!missing(`events`)) {
        stopifnot(is.vector(`events`), length(`events`) != 0)
        sapply(`events`, function(x) stopifnot(R6::is.R6(x)))
        self$`events` <- `events`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionApiResponse in JSON format
    toJSON = function() {
      ConversionApiResponseObject <- list()
      if (!is.null(self$`num_events_received`)) {
        ConversionApiResponseObject[["num_events_received"]] <-
          self$`num_events_received`
      }
      if (!is.null(self$`num_events_processed`)) {
        ConversionApiResponseObject[["num_events_processed"]] <-
          self$`num_events_processed`
      }
      if (!is.null(self$`events`)) {
        ConversionApiResponseObject[["events"]] <-
          lapply(self$`events`, function(x) x$toJSON())
      }
      ConversionApiResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionApiResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionApiResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`num_events_received`)) {
        self$`num_events_received` <- this_object$`num_events_received`
      }
      if (!is.null(this_object$`num_events_processed`)) {
        self$`num_events_processed` <- this_object$`num_events_processed`
      }
      if (!is.null(this_object$`events`)) {
        self$`events` <- ApiClient$new()$deserializeObj(this_object$`events`, "array[ConversionApiResponseEventsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionApiResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`num_events_received`)) {
          sprintf(
          '"num_events_received":
            %d
                    ',
          self$`num_events_received`
          )
        },
        if (!is.null(self$`num_events_processed`)) {
          sprintf(
          '"num_events_processed":
            %d
                    ',
          self$`num_events_processed`
          )
        },
        if (!is.null(self$`events`)) {
          sprintf(
          '"events":
          [%s]
',
          paste(sapply(self$`events`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionApiResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionApiResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`num_events_received` <- this_object$`num_events_received`
      self$`num_events_processed` <- this_object$`num_events_processed`
      self$`events` <- ApiClient$new()$deserializeObj(this_object$`events`, "array[ConversionApiResponseEventsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionApiResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `num_events_received`
      if (!is.null(input_json$`num_events_received`)) {
        if (!(is.numeric(input_json$`num_events_received`) && length(input_json$`num_events_received`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_received`. Must be an integer:", input_json$`num_events_received`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionApiResponse: the required field `num_events_received` is missing."))
      }
      # check the required field `num_events_processed`
      if (!is.null(input_json$`num_events_processed`)) {
        if (!(is.numeric(input_json$`num_events_processed`) && length(input_json$`num_events_processed`) == 1)) {
          stop(paste("Error! Invalid data for `num_events_processed`. Must be an integer:", input_json$`num_events_processed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionApiResponse: the required field `num_events_processed` is missing."))
      }
      # check the required field `events`
      if (!is.null(input_json$`events`)) {
        stopifnot(is.vector(input_json$`events`), length(input_json$`events`) != 0)
        tmp <- sapply(input_json$`events`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionApiResponse: the required field `events` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionApiResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `num_events_received` is null
      if (is.null(self$`num_events_received`)) {
        return(FALSE)
      }

      # check if the required `num_events_processed` is null
      if (is.null(self$`num_events_processed`)) {
        return(FALSE)
      }

      # check if the required `events` is null
      if (is.null(self$`events`)) {
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
      # check if the required `num_events_received` is null
      if (is.null(self$`num_events_received`)) {
        invalid_fields["num_events_received"] <- "Non-nullable required field `num_events_received` cannot be null."
      }

      # check if the required `num_events_processed` is null
      if (is.null(self$`num_events_processed`)) {
        invalid_fields["num_events_processed"] <- "Non-nullable required field `num_events_processed` cannot be null."
      }

      # check if the required `events` is null
      if (is.null(self$`events`)) {
        invalid_fields["events"] <- "Non-nullable required field `events` cannot be null."
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
# ConversionApiResponse$unlock()
#
## Below is an example to define the print function
# ConversionApiResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionApiResponse$lock()

