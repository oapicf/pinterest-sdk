#' @docType class
#' @title ConversionEventsUserData
#'
#' @description ConversionEventsUserData Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsUserData <- R6::R6Class(
  "ConversionEventsUserData",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("ConversionEventsUserDataAnyOf", "ConversionEventsUserDataAnyOf1", "ConversionEventsUserDataAnyOf2"),

    #' @description
    #' Initialize a new ConversionEventsUserData.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "ConversionEventsUserDataAnyOf", "ConversionEventsUserDataAnyOf1", "ConversionEventsUserDataAnyOf2"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ConversionEventsUserDataAnyOf") {
        self$actual_instance <- instance
        self$actual_type <- "ConversionEventsUserDataAnyOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ConversionEventsUserDataAnyOf1") {
        self$actual_instance <- instance
        self$actual_type <- "ConversionEventsUserDataAnyOf1"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ConversionEventsUserDataAnyOf2") {
        self$actual_instance <- instance
        self$actual_type <- "ConversionEventsUserDataAnyOf2"
      } else {
        stop(paste("Failed to initialize ConversionEventsUserData with anyOf schemas ConversionEventsUserDataAnyOf, ConversionEventsUserDataAnyOf1, ConversionEventsUserDataAnyOf2. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserData.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ConversionEventsUserData.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserData.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ConversionEventsUserData.
    fromJSON = function(input) {
      error_messages <- list()

      `ConversionEventsUserDataAnyOf_result` <- tryCatch({
          `ConversionEventsUserDataAnyOf`$public_methods$validateJSON(input)
          `ConversionEventsUserDataAnyOf_instance` <- `ConversionEventsUserDataAnyOf`$new()
          self$actual_instance <- `ConversionEventsUserDataAnyOf_instance`$fromJSON(input)
          self$actual_type <- "ConversionEventsUserDataAnyOf"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ConversionEventsUserDataAnyOf_result`["error"])) {
        error_messages <- append(error_messages, `ConversionEventsUserDataAnyOf_result`["message"])
      }

      `ConversionEventsUserDataAnyOf1_result` <- tryCatch({
          `ConversionEventsUserDataAnyOf1`$public_methods$validateJSON(input)
          `ConversionEventsUserDataAnyOf1_instance` <- `ConversionEventsUserDataAnyOf1`$new()
          self$actual_instance <- `ConversionEventsUserDataAnyOf1_instance`$fromJSON(input)
          self$actual_type <- "ConversionEventsUserDataAnyOf1"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ConversionEventsUserDataAnyOf1_result`["error"])) {
        error_messages <- append(error_messages, `ConversionEventsUserDataAnyOf1_result`["message"])
      }

      `ConversionEventsUserDataAnyOf2_result` <- tryCatch({
          `ConversionEventsUserDataAnyOf2`$public_methods$validateJSON(input)
          `ConversionEventsUserDataAnyOf2_instance` <- `ConversionEventsUserDataAnyOf2`$new()
          self$actual_instance <- `ConversionEventsUserDataAnyOf2_instance`$fromJSON(input)
          self$actual_type <- "ConversionEventsUserDataAnyOf2"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ConversionEventsUserDataAnyOf2_result`["error"])) {
        error_messages <- append(error_messages, `ConversionEventsUserDataAnyOf2_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into ConversionEventsUserData with anyOf schemas ConversionEventsUserDataAnyOf, ConversionEventsUserDataAnyOf1, ConversionEventsUserDataAnyOf2. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize ConversionEventsUserData to JSON string.
    #'
    #' @return JSON string representation of the ConversionEventsUserData.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize ConversionEventsUserData to JSON.
    #'
    #' @return JSON representation of the ConversionEventsUserData.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to ConversionEventsUserData and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#ConversionEventsUserData$unlock()
#
## Below is an example to define the print function
#ConversionEventsUserData$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#ConversionEventsUserData$lock()

