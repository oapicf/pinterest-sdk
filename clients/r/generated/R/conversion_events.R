#' Create a new ConversionEvents
#'
#' @description
#' A list of events (one or more) encapsulated by a data object.
#'
#' @docType class
#' @title ConversionEvents
#' @description ConversionEvents Class
#' @format An \code{R6Class} generator object
#' @field data  list(\link{ConversionEventsDataInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEvents <- R6::R6Class(
  "ConversionEvents",
  public = list(
    `data` = NULL,
    #' Initialize a new ConversionEvents class.
    #'
    #' @description
    #' Initialize a new ConversionEvents class.
    #'
    #' @param data data
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`data`, ...) {
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionEvents in JSON format
    #' @export
    toJSON = function() {
      ConversionEventsObject <- list()
      if (!is.null(self$`data`)) {
        ConversionEventsObject[["data"]] <-
          lapply(self$`data`, function(x) x$toJSON())
      }
      ConversionEventsObject
    },
    #' Deserialize JSON string into an instance of ConversionEvents
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionEvents
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEvents
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[ConversionEventsDataInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionEvents in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          [%s]
',
          paste(sapply(self$`data`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ConversionEvents
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionEvents
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEvents
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[ConversionEventsDataInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to ConversionEvents
    #'
    #' @description
    #' Validate JSON input with respect to ConversionEvents and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionEvents: the required field `data` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEvents
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
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      if (length(self$`data`) > 1000) {
        return(FALSE)
      }
      if (length(self$`data`) < 1) {
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
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      if (length(self$`data`) > 1000) {
        invalid_fields["data"] <- "Invalid length for `data`, number of items must be less than or equal to 1000."
      }
      if (length(self$`data`) < 1) {
        invalid_fields["data"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# ConversionEvents$unlock()
#
## Below is an example to define the print function
# ConversionEvents$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEvents$lock()

