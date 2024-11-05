#' @docType class
#' @title CatalogsHotelProductGroupFilters
#'
#' @description CatalogsHotelProductGroupFilters Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroupFilters <- R6::R6Class(
  "CatalogsHotelProductGroupFilters",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("CatalogsHotelProductGroupFiltersAllOf", "CatalogsHotelProductGroupFiltersAnyOf"),

    #' @description
    #' Initialize a new CatalogsHotelProductGroupFilters.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "CatalogsHotelProductGroupFiltersAllOf", "CatalogsHotelProductGroupFiltersAnyOf"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelProductGroupFiltersAllOf") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelProductGroupFiltersAllOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelProductGroupFiltersAnyOf") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelProductGroupFiltersAnyOf"
      } else {
        stop(paste("Failed to initialize CatalogsHotelProductGroupFilters with anyOf schemas CatalogsHotelProductGroupFiltersAllOf, CatalogsHotelProductGroupFiltersAnyOf. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFilters.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsHotelProductGroupFilters.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupFilters.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsHotelProductGroupFilters.
    fromJSON = function(input) {
      error_messages <- list()

      `CatalogsHotelProductGroupFiltersAnyOf_result` <- tryCatch({
          `CatalogsHotelProductGroupFiltersAnyOf`$public_methods$validateJSON(input)
          `CatalogsHotelProductGroupFiltersAnyOf_instance` <- `CatalogsHotelProductGroupFiltersAnyOf`$new()
          self$actual_instance <- `CatalogsHotelProductGroupFiltersAnyOf_instance`$fromJSON(input)
          self$actual_type <- "CatalogsHotelProductGroupFiltersAnyOf"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelProductGroupFiltersAnyOf_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelProductGroupFiltersAnyOf_result`["message"])
      }

      `CatalogsHotelProductGroupFiltersAllOf_result` <- tryCatch({
          `CatalogsHotelProductGroupFiltersAllOf`$public_methods$validateJSON(input)
          `CatalogsHotelProductGroupFiltersAllOf_instance` <- `CatalogsHotelProductGroupFiltersAllOf`$new()
          self$actual_instance <- `CatalogsHotelProductGroupFiltersAllOf_instance`$fromJSON(input)
          self$actual_type <- "CatalogsHotelProductGroupFiltersAllOf"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelProductGroupFiltersAllOf_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelProductGroupFiltersAllOf_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsHotelProductGroupFilters with anyOf schemas CatalogsHotelProductGroupFiltersAllOf, CatalogsHotelProductGroupFiltersAnyOf. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize CatalogsHotelProductGroupFilters to JSON string.
    #'
    #' @return JSON string representation of the CatalogsHotelProductGroupFilters.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsHotelProductGroupFilters to JSON.
    #'
    #' @return JSON representation of the CatalogsHotelProductGroupFilters.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsHotelProductGroupFilters and
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
#CatalogsHotelProductGroupFilters$unlock()
#
## Below is an example to define the print function
#CatalogsHotelProductGroupFilters$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsHotelProductGroupFilters$lock()

