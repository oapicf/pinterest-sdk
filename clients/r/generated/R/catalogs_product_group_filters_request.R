#' @docType class
#' @title CatalogsProductGroupFiltersRequest
#'
#' @description CatalogsProductGroupFiltersRequest Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupFiltersRequest <- R6::R6Class(
  "CatalogsProductGroupFiltersRequest",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("CatalogsProductGroupFiltersRequestAnyOf", "CatalogsProductGroupFiltersRequestAnyOf1"),

    #' @description
    #' Initialize a new CatalogsProductGroupFiltersRequest.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "CatalogsProductGroupFiltersRequestAnyOf", "CatalogsProductGroupFiltersRequestAnyOf1"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsProductGroupFiltersRequestAnyOf") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsProductGroupFiltersRequestAnyOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsProductGroupFiltersRequestAnyOf1") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsProductGroupFiltersRequestAnyOf1"
      } else {
        stop(paste("Failed to initialize CatalogsProductGroupFiltersRequest with anyOf schemas CatalogsProductGroupFiltersRequestAnyOf, CatalogsProductGroupFiltersRequestAnyOf1. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersRequest.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsProductGroupFiltersRequest.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFiltersRequest.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsProductGroupFiltersRequest.
    fromJSON = function(input) {
      error_messages <- list()

      `CatalogsProductGroupFiltersRequestAnyOf_result` <- tryCatch({
          `CatalogsProductGroupFiltersRequestAnyOf`$public_methods$validateJSON(input)
          `CatalogsProductGroupFiltersRequestAnyOf_instance` <- `CatalogsProductGroupFiltersRequestAnyOf`$new()
          self$actual_instance <- `CatalogsProductGroupFiltersRequestAnyOf_instance`$fromJSON(input)
          self$actual_type <- "CatalogsProductGroupFiltersRequestAnyOf"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsProductGroupFiltersRequestAnyOf_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsProductGroupFiltersRequestAnyOf_result`["message"])
      }

      `CatalogsProductGroupFiltersRequestAnyOf1_result` <- tryCatch({
          `CatalogsProductGroupFiltersRequestAnyOf1`$public_methods$validateJSON(input)
          `CatalogsProductGroupFiltersRequestAnyOf1_instance` <- `CatalogsProductGroupFiltersRequestAnyOf1`$new()
          self$actual_instance <- `CatalogsProductGroupFiltersRequestAnyOf1_instance`$fromJSON(input)
          self$actual_type <- "CatalogsProductGroupFiltersRequestAnyOf1"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsProductGroupFiltersRequestAnyOf1_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsProductGroupFiltersRequestAnyOf1_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsProductGroupFiltersRequest with anyOf schemas CatalogsProductGroupFiltersRequestAnyOf, CatalogsProductGroupFiltersRequestAnyOf1. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize CatalogsProductGroupFiltersRequest to JSON string.
    #'
    #' @return JSON string representation of the CatalogsProductGroupFiltersRequest.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsProductGroupFiltersRequest to JSON.
    #'
    #' @return JSON representation of the CatalogsProductGroupFiltersRequest.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsProductGroupFiltersRequest and
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
#CatalogsProductGroupFiltersRequest$unlock()
#
## Below is an example to define the print function
#CatalogsProductGroupFiltersRequest$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsProductGroupFiltersRequest$lock()

