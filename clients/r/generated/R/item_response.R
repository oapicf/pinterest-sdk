#' @docType class
#' @title ItemResponse
#'
#' @description ItemResponse Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemResponse <- R6::R6Class(
  "ItemResponse",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("ItemResponseAnyOf", "ItemResponseAnyOf1"),

    #' @description
    #' Initialize a new ItemResponse.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "ItemResponseAnyOf", "ItemResponseAnyOf1"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemResponseAnyOf") {
        self$actual_instance <- instance
        self$actual_type <- "ItemResponseAnyOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemResponseAnyOf1") {
        self$actual_instance <- instance
        self$actual_type <- "ItemResponseAnyOf1"
      } else {
        stop(paste("Failed to initialize ItemResponse with anyOf schemas ItemResponseAnyOf, ItemResponseAnyOf1. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemResponse.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ItemResponse.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemResponse.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ItemResponse.
    fromJSON = function(input) {
      error_messages <- list()

      `ItemResponseAnyOf_result` <- tryCatch({
          `ItemResponseAnyOf`$public_methods$validateJSON(input)
          `ItemResponseAnyOf_instance` <- `ItemResponseAnyOf`$new()
          self$actual_instance <- `ItemResponseAnyOf_instance`$fromJSON(input)
          self$actual_type <- "ItemResponseAnyOf"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ItemResponseAnyOf_result`["error"])) {
        error_messages <- append(error_messages, `ItemResponseAnyOf_result`["message"])
      }

      `ItemResponseAnyOf1_result` <- tryCatch({
          `ItemResponseAnyOf1`$public_methods$validateJSON(input)
          `ItemResponseAnyOf1_instance` <- `ItemResponseAnyOf1`$new()
          self$actual_instance <- `ItemResponseAnyOf1_instance`$fromJSON(input)
          self$actual_type <- "ItemResponseAnyOf1"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ItemResponseAnyOf1_result`["error"])) {
        error_messages <- append(error_messages, `ItemResponseAnyOf1_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into ItemResponse with anyOf schemas ItemResponseAnyOf, ItemResponseAnyOf1. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize ItemResponse to JSON string.
    #'
    #' @return JSON string representation of the ItemResponse.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize ItemResponse to JSON.
    #'
    #' @return JSON representation of the ItemResponse.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to ItemResponse and
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
#ItemResponse$unlock()
#
## Below is an example to define the print function
#ItemResponse$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#ItemResponse$lock()

