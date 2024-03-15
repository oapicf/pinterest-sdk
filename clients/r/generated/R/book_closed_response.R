#' Create a new BookClosedResponse
#'
#' @description
#' Creation fields
#'
#' @docType class
#' @title BookClosedResponse
#' @description BookClosedResponse Class
#' @format An \code{R6Class} generator object
#' @field conversion_metrics_ready Are conversion metrics ready? character [optional]
#' @field non_conversion_metrics_ready Are non-conversion metrics ready? character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BookClosedResponse <- R6::R6Class(
  "BookClosedResponse",
  public = list(
    `conversion_metrics_ready` = NULL,
    `non_conversion_metrics_ready` = NULL,
    #' Initialize a new BookClosedResponse class.
    #'
    #' @description
    #' Initialize a new BookClosedResponse class.
    #'
    #' @param conversion_metrics_ready Are conversion metrics ready?
    #' @param non_conversion_metrics_ready Are non-conversion metrics ready?
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`conversion_metrics_ready` = NULL, `non_conversion_metrics_ready` = NULL, ...) {
      if (!is.null(`conversion_metrics_ready`)) {
        if (!(is.logical(`conversion_metrics_ready`) && length(`conversion_metrics_ready`) == 1)) {
          stop(paste("Error! Invalid data for `conversion_metrics_ready`. Must be a boolean:", `conversion_metrics_ready`))
        }
        self$`conversion_metrics_ready` <- `conversion_metrics_ready`
      }
      if (!is.null(`non_conversion_metrics_ready`)) {
        if (!(is.logical(`non_conversion_metrics_ready`) && length(`non_conversion_metrics_ready`) == 1)) {
          stop(paste("Error! Invalid data for `non_conversion_metrics_ready`. Must be a boolean:", `non_conversion_metrics_ready`))
        }
        self$`non_conversion_metrics_ready` <- `non_conversion_metrics_ready`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BookClosedResponse in JSON format
    #' @export
    toJSON = function() {
      BookClosedResponseObject <- list()
      if (!is.null(self$`conversion_metrics_ready`)) {
        BookClosedResponseObject[["conversion_metrics_ready"]] <-
          self$`conversion_metrics_ready`
      }
      if (!is.null(self$`non_conversion_metrics_ready`)) {
        BookClosedResponseObject[["non_conversion_metrics_ready"]] <-
          self$`non_conversion_metrics_ready`
      }
      BookClosedResponseObject
    },
    #' Deserialize JSON string into an instance of BookClosedResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of BookClosedResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BookClosedResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`conversion_metrics_ready`)) {
        self$`conversion_metrics_ready` <- this_object$`conversion_metrics_ready`
      }
      if (!is.null(this_object$`non_conversion_metrics_ready`)) {
        self$`non_conversion_metrics_ready` <- this_object$`non_conversion_metrics_ready`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BookClosedResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`conversion_metrics_ready`)) {
          sprintf(
          '"conversion_metrics_ready":
            %s
                    ',
          tolower(self$`conversion_metrics_ready`)
          )
        },
        if (!is.null(self$`non_conversion_metrics_ready`)) {
          sprintf(
          '"non_conversion_metrics_ready":
            %s
                    ',
          tolower(self$`non_conversion_metrics_ready`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BookClosedResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of BookClosedResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BookClosedResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`conversion_metrics_ready` <- this_object$`conversion_metrics_ready`
      self$`non_conversion_metrics_ready` <- this_object$`non_conversion_metrics_ready`
      self
    },
    #' Validate JSON input with respect to BookClosedResponse
    #'
    #' @description
    #' Validate JSON input with respect to BookClosedResponse and throw an exception if invalid
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
    #' @return String representation of BookClosedResponse
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
# BookClosedResponse$unlock()
#
## Below is an example to define the print function
# BookClosedResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BookClosedResponse$lock()

